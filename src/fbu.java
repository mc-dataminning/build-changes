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

public class fbu extends fcg {
   public static final MapCodec<fbu> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fer.a.fieldOf("source").forGetter($$0x -> $$0x.b), fbu.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, fbu::new)
   );
   private final feq b;
   private final List<fbu.b> c;

   fbu(List<fec> $$0, feq $$1, List<fbu.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public fci<fbu> b() {
      return fcj.C;
   }

   @Override
   public Set<bbk<?>> a() {
      return this.b.b();
   }

   @Override
   public dak a(dak $$0, fat $$1) {
      va $$2 = this.b.a($$1);
      if ($$2 == null) {
         return $$0;
      } else {
         MutableObject<ua> $$3 = new MutableObject();
         Supplier<va> $$4 = () -> {
            if ($$3.getValue() == null) {
               $$3.setValue($$0.a(kl.b, dcs.a).d());
            }

            return (va)$$3.getValue();
         };
         this.c.forEach($$2x -> $$2x.a($$4, $$2));
         ua $$5 = (ua)$$3.getValue();
         if ($$5 != null) {
            dcs.a(kl.b, $$0, $$5);
         }

         return $$0;
      }
   }

   @Deprecated
   public static fbu.a a(feq $$0) {
      return new fbu.a($$0);
   }

   public static fbu.a a(fat.b $$0) {
      return new fbu.a(feo.a($$0));
   }

   public static class a extends fcg.a<fbu.a> {
      private final feq a;
      private final List<fbu.b> b = Lists.newArrayList();

      a(feq $$0) {
         this.a = $$0;
      }

      public fbu.a a(String $$0, String $$1, fbu.c $$2) {
         try {
            this.b.add(new fbu.b(fc.g.a($$0), fc.g.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public fbu.a a(String $$0, String $$1) {
         return this.a($$0, $$1, fbu.c.a);
      }

      protected fbu.a a() {
         return this;
      }

      @Override
      public fch b() {
         return new fbu(this.g(), this.a, this.b);
      }
   }

   static record b(fc.g b, fc.g c, fbu.c d) {
      public static final Codec<fbu.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fc.g.a.fieldOf("source").forGetter(fbu.b::a), fc.g.a.fieldOf("target").forGetter(fbu.b::b), fbu.c.d.fieldOf("op").forGetter(fbu.b::c))
               .apply($$0, fbu.b::new)
      );

      public void a(Supplier<va> $$0, va $$1) {
         try {
            List<va> $$2 = this.b.a($$1);
            if (!$$2.isEmpty()) {
               this.d.a($$0.get(), this.c, $$2);
            }
         } catch (CommandSyntaxException var4) {
         }
      }

      public fc.g a() {
         return this.b;
      }

      public fc.g b() {
         return this.c;
      }

      public fbu.c c() {
         return this.d;
      }
   }

   public static enum c implements bax {
      a("replace") {
         @Override
         public void a(va $$0, fc.g $$1, List<va> $$2) throws CommandSyntaxException {
            $$1.a($$0, (va)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(va $$0, fc.g $$1, List<va> $$2) throws CommandSyntaxException {
            List<va> $$3 = $$1.a($$0, ug::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof ug) {
                  $$2.forEach($$1xx -> ((ug)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(va $$0, fc.g $$1, List<va> $$2) throws CommandSyntaxException {
            List<va> $$3 = $$1.a($$0, ua::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof ua) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof ua) {
                        ((ua)$$1x).a((ua)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<fbu.c> d = bax.a(fbu.c::values);
      private final String e;

      public abstract void a(va var1, fc.g var2, List<va> var3) throws CommandSyntaxException;

      c(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
