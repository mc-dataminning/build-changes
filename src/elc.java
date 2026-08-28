import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class elc {
   public static final Codec<elc> a = lu.R.q().dispatch(elc::e, ell::codec);
   public static final Codec<jn<elc>> b = aky.a(lv.aS, a);
   protected final elc.c c;

   public static <S extends elc> RecordCodecBuilder<S, elc.c> a(Instance<S> $$0) {
      return elc.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends elc> MapCodec<S> a(Function<elc.c, S> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected elc(elc.c $$0) {
      this.c = $$0;
   }

   public jr<dfh> a() {
      return this.c.b;
   }

   public Map<bun, elj> b() {
      return this.c.c;
   }

   public eag.a c() {
      return this.c.d;
   }

   public eln d() {
      return this.c.e;
   }

   public eku a(eku $$0) {
      return this.d() != eln.a ? $$0.a(12) : $$0;
   }

   public elk a(kb $$0, dwl $$1, dfl $$2, eay $$3, epf $$4, long $$5, ddm $$6, int $$7, dei $$8, Predicate<jn<dfh>> $$9) {
      elc.a $$10 = new elc.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<elc.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         elu $$12 = $$11.get().a();
         elk $$13 = new elk(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return elk.b;
   }

   protected static Optional<elc.b> a(elc.a $$0, eak.a $$1, Consumer<elu> $$2) {
      ddm $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new elc.b(new je($$4, $$6, $$5), $$2));
   }

   private static boolean a(elc.b $$0, elc.a $$1) {
      je $$2 = $$0.b();
      return $$1.j.test($$1.b.d().getNoiseBiome(jy.a($$2.u()), jy.a($$2.v()), jy.a($$2.w()), $$1.d.b()));
   }

   public void a(dfd $$0, dfb $$1, dwl $$2, azl $$3, eku $$4, ddm $$5, elr $$6) {
   }

   private static int[] c(elc.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dwl $$5 = $$0.b();
      dei $$6 = $$0.i();
      eay $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, eak.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, eak.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, eak.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, eak.a.a, $$6, $$7)
      };
   }

   public static int a(elc.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$2, $$3, $$4);
      return ($$5[0] + $$5[1] + $$5[2] + $$5[3]) / 4;
   }

   protected static int a(elc.a $$0, int $$1, int $$2) {
      ddm $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return b($$0, $$4, $$5, $$1, $$2);
   }

   protected static int b(elc.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected je a(elc.a $$0, dnx $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dnx.b) {
         $$2 = -5;
      } else if ($$1 == dnx.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dnx.d) {
         $$3 = -5;
      }

      ddm $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new je($$5, b($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<elc.b> a(elc.a var1);

   public Optional<elc.b> b(elc.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract ell<?> e();

   public static record a(kb a, dwl b, dfl c, eay d, epf e, ebj f, long g, ddm h, dei i, Predicate<jn<dfh>> j) {

      public a(kb $$0, dwl $$1, dfl $$2, eay $$3, epf $$4, long $$5, ddm $$6, dei $$7, Predicate<jn<dfh>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static ebj a(long $$0, ddm $$1) {
         ebj $$2 = new ebj(new eal(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(je a, Either<Consumer<elu>, elu> b) {
      public b(je $$0, Consumer<elu> $$1) {
         this($$0, Either.left($$1));
      }

      public elu a() {
         return (elu)this.b.map($$0 -> {
            elu $$1 = new elu();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public je b() {
         return this.a;
      }

      public Either<Consumer<elu>, elu> c() {
         return this.b;
      }
   }

   public static record c(jr<dfh> b, Map<bun, elj> c, eag.a d, eln e) {
      static final elc.c f = new elc.c(jr.a(), Map.of(), eag.a.e, eln.a);
      public static final MapCodec<elc.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  kc.a(lv.aG).fieldOf("biomes").forGetter(elc.c::a),
                  Codec.simpleMap(bun.i, elj.a, azz.a(bun.values())).fieldOf("spawn_overrides").forGetter(elc.c::b),
                  eag.a.l.fieldOf("step").forGetter(elc.c::c),
                  eln.f.optionalFieldOf("terrain_adaptation", f.e).forGetter(elc.c::d)
               )
               .apply($$0, elc.c::new)
      );

      public c(jr<dfh> $$0) {
         this($$0, f.c, f.d, f.e);
      }

      public jr<dfh> a() {
         return this.b;
      }

      public Map<bun, elj> b() {
         return this.c;
      }

      public eag.a c() {
         return this.d;
      }

      public eln d() {
         return this.e;
      }

      public static class a {
         private final jr<dfh> a;
         private Map<bun, elj> b = elc.c.f.c;
         private eag.a c = elc.c.f.d;
         private eln d = elc.c.f.e;

         public a(jr<dfh> $$0) {
            this.a = $$0;
         }

         public elc.c.a a(Map<bun, elj> $$0) {
            this.b = $$0;
            return this;
         }

         public elc.c.a a(eag.a $$0) {
            this.c = $$0;
            return this;
         }

         public elc.c.a a(eln $$0) {
            this.d = $$0;
            return this;
         }

         public elc.c a() {
            return new elc.c(this.a, this.b, this.c, this.d);
         }
      }
   }
}
