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

public class faa extends fam {
   public static final MapCodec<faa> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fcx.a.fieldOf("source").forGetter($$0x -> $$0x.b), faa.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, faa::new)
   );
   private final fcw b;
   private final List<faa.b> c;

   faa(List<fci> $$0, fcw $$1, List<faa.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public fao<faa> b() {
      return fap.C;
   }

   @Override
   public Set<bax<?>> a() {
      return this.b.b();
   }

   @Override
   public cyy a(cyy $$0, eyz $$1) {
      uw $$2 = this.b.a($$1);
      if ($$2 == null) {
         return $$0;
      } else {
         MutableObject<tz> $$3 = new MutableObject();
         Supplier<uw> $$4 = () -> {
            if ($$3.getValue() == null) {
               $$3.setValue($$0.a(kj.b, dbg.a).d());
            }

            return (uw)$$3.getValue();
         };
         this.c.forEach($$2x -> $$2x.a($$4, $$2));
         tz $$5 = (tz)$$3.getValue();
         if ($$5 != null) {
            dbg.a(kj.b, $$0, $$5);
         }

         return $$0;
      }
   }

   @Deprecated
   public static faa.a a(fcw $$0) {
      return new faa.a($$0);
   }

   public static faa.a a(eyz.b $$0) {
      return new faa.a(fcu.a($$0));
   }

   public static class a extends fam.a<faa.a> {
      private final fcw a;
      private final List<faa.b> b = Lists.newArrayList();

      a(fcw $$0) {
         this.a = $$0;
      }

      public faa.a a(String $$0, String $$1, faa.c $$2) {
         try {
            this.b.add(new faa.b(fa.g.a($$0), fa.g.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public faa.a a(String $$0, String $$1) {
         return this.a($$0, $$1, faa.c.a);
      }

      protected faa.a a() {
         return this;
      }

      @Override
      public fan b() {
         return new faa(this.g(), this.a, this.b);
      }
   }

   static record b(fa.g b, fa.g c, faa.c d) {
      public static final Codec<faa.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fa.g.a.fieldOf("source").forGetter(faa.b::a), fa.g.a.fieldOf("target").forGetter(faa.b::b), faa.c.d.fieldOf("op").forGetter(faa.b::c))
               .apply($$0, faa.b::new)
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

      public fa.g a() {
         return this.b;
      }

      public fa.g b() {
         return this.c;
      }

      public faa.c c() {
         return this.d;
      }
   }

   public static enum c implements bak {
      a("replace") {
         @Override
         public void a(uw $$0, fa.g $$1, List<uw> $$2) throws CommandSyntaxException {
            $$1.a($$0, (uw)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(uw $$0, fa.g $$1, List<uw> $$2) throws CommandSyntaxException {
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
         public void a(uw $$0, fa.g $$1, List<uw> $$2) throws CommandSyntaxException {
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

      public static final Codec<faa.c> d = bak.a(faa.c::values);
      private final String e;

      public abstract void a(uw var1, fa.g var2, List<uw> var3) throws CommandSyntaxException;

      c(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
