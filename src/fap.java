import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import org.apache.commons.lang3.mutable.MutableObject;

public class fap extends fbb {
   public static final MapCodec<fap> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fdm.a.fieldOf("source").forGetter($$0x -> $$0x.b), fap.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, fap::new)
   );
   private final fdl b;
   private final List<fap.b> c;

   fap(List<fcx> $$0, fdl $$1, List<fap.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public fbd<fap> b() {
      return fbe.C;
   }

   @Override
   public Set<bax<?>> a() {
      return this.b.b();
   }

   @Override
   public czk a(czk $$0, ezo $$1) {
      uw $$2 = this.b.a($$1);
      if ($$2 == null) {
         return $$0;
      } else {
         MutableObject<tz> $$3 = new MutableObject();
         Supplier<uw> $$4 = () -> {
            if ($$3.getValue() == null) {
               $$3.setValue($$0.a(kk.b, dbs.a).d());
            }

            return (uw)$$3.getValue();
         };
         this.c.forEach($$2x -> $$2x.a($$4, $$2));
         tz $$5 = (tz)$$3.getValue();
         if ($$5 != null) {
            dbs.a(kk.b, $$0, $$5);
         }

         return $$0;
      }
   }

   @Deprecated
   public static fap.a a(fdl $$0) {
      return new fap.a($$0);
   }

   public static fap.a a(ezo.b $$0) {
      return new fap.a(fdj.a($$0));
   }

   public static class a extends fbb.a<fap.a> {
      private final fdl a;
      private final List<fap.b> b = Lists.newArrayList();

      a(fdl $$0) {
         this.a = $$0;
      }

      public fap.a a(String $$0, String $$1, fap.c $$2) {
         try {
            this.b.add(new fap.b(fb.g.a($$0), fb.g.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public fap.a a(String $$0, String $$1) {
         return this.a($$0, $$1, fap.c.a);
      }

      protected fap.a a() {
         return this;
      }

      @Override
      public fbc b() {
         return new fap(this.g(), this.a, this.b);
      }
   }

   static record b(fb.g b, fb.g c, fap.c d) {
      public static final Codec<fap.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fb.g.a.fieldOf("source").forGetter(fap.b::a), fb.g.a.fieldOf("target").forGetter(fap.b::b), fap.c.d.fieldOf("op").forGetter(fap.b::c))
               .apply($$0, fap.b::new)
      );

      public void a(Supplier<uw> $$0, uw $$1) {
         try {
            List<uw> $$2 = this.b.a($$1);
            if (!$$2.isEmpty()) {
               this.d.a($$0.get(), this.c, $$2);
            }
         } catch (CommandSyntaxException var4) {
         }
      }

      public fb.g a() {
         return this.b;
      }

      public fb.g b() {
         return this.c;
      }

      public fap.c c() {
         return this.d;
      }
   }

   public static enum c implements bak {
      a("replace") {
         @Override
         public void a(uw $$0, fb.g $$1, List<uw> $$2) throws CommandSyntaxException {
            $$1.a($$0, (uw)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(uw $$0, fb.g $$1, List<uw> $$2) throws CommandSyntaxException {
            List<uw> $$3 = $$1.a($$0, uf::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof uf) {
                  $$2.forEach($$1xx -> ((uf)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(uw $$0, fb.g $$1, List<uw> $$2) throws CommandSyntaxException {
            List<uw> $$3 = $$1.a($$0, tz::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof tz) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof tz) {
                        ((tz)$$1x).a((tz)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<fap.c> d = bak.a(fap.c::values);
      private final String e;

      public abstract void a(uw var1, fb.g var2, List<uw> var3) throws CommandSyntaxException;

      c(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
