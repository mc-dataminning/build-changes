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

public class fau extends fbg {
   public static final MapCodec<fau> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fdr.a.fieldOf("source").forGetter($$0x -> $$0x.b), fau.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, fau::new)
   );
   private final fdq b;
   private final List<fau.b> c;

   fau(List<fdc> $$0, fdq $$1, List<fau.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public fbi<fau> b() {
      return fbj.C;
   }

   @Override
   public Set<bax<?>> a() {
      return this.b.b();
   }

   @Override
   public czn a(czn $$0, ezt $$1) {
      uw $$2 = this.b.a($$1);
      if ($$2 == null) {
         return $$0;
      } else {
         MutableObject<tz> $$3 = new MutableObject();
         Supplier<uw> $$4 = () -> {
            if ($$3.getValue() == null) {
               $$3.setValue($$0.a(kk.b, dbv.a).d());
            }

            return (uw)$$3.getValue();
         };
         this.c.forEach($$2x -> $$2x.a($$4, $$2));
         tz $$5 = (tz)$$3.getValue();
         if ($$5 != null) {
            dbv.a(kk.b, $$0, $$5);
         }

         return $$0;
      }
   }

   @Deprecated
   public static fau.a a(fdq $$0) {
      return new fau.a($$0);
   }

   public static fau.a a(ezt.b $$0) {
      return new fau.a(fdo.a($$0));
   }

   public static class a extends fbg.a<fau.a> {
      private final fdq a;
      private final List<fau.b> b = Lists.newArrayList();

      a(fdq $$0) {
         this.a = $$0;
      }

      public fau.a a(String $$0, String $$1, fau.c $$2) {
         try {
            this.b.add(new fau.b(fb.g.a($$0), fb.g.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public fau.a a(String $$0, String $$1) {
         return this.a($$0, $$1, fau.c.a);
      }

      protected fau.a a() {
         return this;
      }

      @Override
      public fbh b() {
         return new fau(this.g(), this.a, this.b);
      }
   }

   static record b(fb.g b, fb.g c, fau.c d) {
      public static final Codec<fau.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fb.g.a.fieldOf("source").forGetter(fau.b::a), fb.g.a.fieldOf("target").forGetter(fau.b::b), fau.c.d.fieldOf("op").forGetter(fau.b::c))
               .apply($$0, fau.b::new)
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

      public fau.c c() {
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

      public static final Codec<fau.c> d = bak.a(fau.c::values);
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
