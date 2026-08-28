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

public class fai extends fau {
   public static final MapCodec<fai> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fdf.a.fieldOf("source").forGetter($$0x -> $$0x.b), fai.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, fai::new)
   );
   private final fde b;
   private final List<fai.b> c;

   fai(List<fcq> $$0, fde $$1, List<fai.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public faw<fai> b() {
      return fax.C;
   }

   @Override
   public Set<bax<?>> a() {
      return this.b.b();
   }

   @Override
   public czd a(czd $$0, ezh $$1) {
      uw $$2 = this.b.a($$1);
      if ($$2 == null) {
         return $$0;
      } else {
         MutableObject<tz> $$3 = new MutableObject();
         Supplier<uw> $$4 = () -> {
            if ($$3.getValue() == null) {
               $$3.setValue($$0.a(kj.b, dbl.a).d());
            }

            return (uw)$$3.getValue();
         };
         this.c.forEach($$2x -> $$2x.a($$4, $$2));
         tz $$5 = (tz)$$3.getValue();
         if ($$5 != null) {
            dbl.a(kj.b, $$0, $$5);
         }

         return $$0;
      }
   }

   @Deprecated
   public static fai.a a(fde $$0) {
      return new fai.a($$0);
   }

   public static fai.a a(ezh.b $$0) {
      return new fai.a(fdc.a($$0));
   }

   public static class a extends fau.a<fai.a> {
      private final fde a;
      private final List<fai.b> b = Lists.newArrayList();

      a(fde $$0) {
         this.a = $$0;
      }

      public fai.a a(String $$0, String $$1, fai.c $$2) {
         try {
            this.b.add(new fai.b(fa.g.a($$0), fa.g.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public fai.a a(String $$0, String $$1) {
         return this.a($$0, $$1, fai.c.a);
      }

      protected fai.a a() {
         return this;
      }

      @Override
      public fav b() {
         return new fai(this.g(), this.a, this.b);
      }
   }

   static record b(fa.g b, fa.g c, fai.c d) {
      public static final Codec<fai.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fa.g.a.fieldOf("source").forGetter(fai.b::a), fa.g.a.fieldOf("target").forGetter(fai.b::b), fai.c.d.fieldOf("op").forGetter(fai.b::c))
               .apply($$0, fai.b::new)
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

      public fai.c c() {
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

      public static final Codec<fai.c> d = bak.a(fai.c::values);
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
