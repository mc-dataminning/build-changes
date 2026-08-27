import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class elc extends elk {
   public static final Codec<elc> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(enm.a.fieldOf("source").forGetter($$0x -> $$0x.b), elc.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, elc::new)
   );
   private final enl b;
   private final List<elc.b> c;

   elc(List<emx> $$0, enl $$1, List<elc.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public elm b() {
      return eln.w;
   }

   @Override
   public Set<emg<?>> a() {
      return this.b.b();
   }

   @Override
   public cpq a(cpq $$0, ejy $$1) {
      tv $$2 = this.b.a($$1);
      if ($$2 != null) {
         this.c.forEach($$2x -> $$2x.a($$0::x, $$2));
      }

      return $$0;
   }

   public static elc.a a(enl $$0) {
      return new elc.a($$0);
   }

   public static elc.a a(ejy.b $$0) {
      return new elc.a(enj.a($$0));
   }

   public static class a extends elk.a<elc.a> {
      private final enl a;
      private final List<elc.b> b = Lists.newArrayList();

      a(enl $$0) {
         this.a = $$0;
      }

      public elc.a a(String $$0, String $$1, elc.c $$2) {
         try {
            this.b.add(new elc.b(elc.d.a($$0), elc.d.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public elc.a a(String $$0, String $$1) {
         return this.a($$0, $$1, elc.c.a);
      }

      protected elc.a a() {
         return this;
      }

      @Override
      public ell b() {
         return new elc(this.g(), this.a, this.b);
      }
   }

   static record b(elc.d b, elc.d c, elc.c d) {
      public static final Codec<elc.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  elc.d.a.fieldOf("source").forGetter(elc.b::a), elc.d.a.fieldOf("target").forGetter(elc.b::b), elc.c.d.fieldOf("op").forGetter(elc.b::c)
               )
               .apply($$0, elc.b::new)
      );

      public void a(Supplier<tv> $$0, tv $$1) {
         try {
            List<tv> $$2 = this.b.b().a($$1);
            if (!$$2.isEmpty()) {
               this.d.a($$0.get(), this.c.b(), $$2);
            }
         } catch (CommandSyntaxException var4) {
         }
      }

      public elc.d a() {
         return this.b;
      }

      public elc.d b() {
         return this.c;
      }

      public elc.c c() {
         return this.d;
      }
   }

   public static enum c implements axg {
      a("replace") {
         @Override
         public void a(tv $$0, em.g $$1, List<tv> $$2) throws CommandSyntaxException {
            $$1.a($$0, (tv)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(tv $$0, em.g $$1, List<tv> $$2) throws CommandSyntaxException {
            List<tv> $$3 = $$1.a($$0, te::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof te) {
                  $$2.forEach($$1xx -> ((te)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(tv $$0, em.g $$1, List<tv> $$2) throws CommandSyntaxException {
            List<tv> $$3 = $$1.a($$0, sy::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof sy) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof sy) {
                        ((sy)$$1x).a((sy)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<elc.c> d = axg.a(elc.c::values);
      private final String e;

      public abstract void a(tv var1, em.g var2, List<tv> var3) throws CommandSyntaxException;

      c(String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   static record d(String b, em.g c) {
      public static final Codec<elc.d> a = Codec.STRING.comapFlatMap($$0 -> {
         try {
            return DataResult.success(a($$0));
         } catch (CommandSyntaxException var2) {
            return DataResult.error(() -> "Failed to parse path " + $$0 + ": " + var2.getMessage());
         }
      }, elc.d::a);

      public static elc.d a(String $$0) throws CommandSyntaxException {
         em.g $$1 = new em().a(new StringReader($$0));
         return new elc.d($$0, $$1);
      }

      public String a() {
         return this.b;
      }

      public em.g b() {
         return this.c;
      }
   }
}
