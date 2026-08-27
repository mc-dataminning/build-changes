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

public abstract class duy {
   public static final Codec<duy> a = jb.U.q().dispatch(duy::e, dvh::codec);
   public static final Codec<he<duy>> b = aen.a(jc.az, a);
   protected final duy.c c;

   public static <S extends duy> RecordCodecBuilder<S, duy.c> a(Instance<S> $$0) {
      return duy.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends duy> Codec<S> a(Function<duy.c, S> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected duy(duy.c $$0) {
      this.c = $$0;
   }

   public hi<cqj> a() {
      return this.c.b;
   }

   public Map<bjb, dvf> b() {
      return this.c.c;
   }

   public dke.b c() {
      return this.c.d;
   }

   public dvj d() {
      return this.c.e;
   }

   public duq a(duq $$0) {
      return this.d() != dvj.a ? $$0.a(12) : $$0;
   }

   public dvg a(hs $$0, dgw $$1, cqn $$2, dkw $$3, dys $$4, long $$5, cos $$6, int $$7, cpn $$8, Predicate<he<cqj>> $$9) {
      duy.a $$10 = new duy.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<duy.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         dvq $$12 = $$11.get().a();
         dvg $$13 = new dvg(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return dvg.b;
   }

   protected static Optional<duy.b> a(duy.a $$0, dki.a $$1, Consumer<dvq> $$2) {
      cos $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new duy.b(new gu($$4, $$6, $$5), $$2));
   }

   private static boolean a(duy.b $$0, duy.a $$1) {
      gu $$2 = $$0.b();
      return $$1.j.test($$1.b.c().getNoiseBiome(hq.a($$2.u()), hq.a($$2.v()), hq.a($$2.w()), $$1.d.b()));
   }

   public void a(cqf $$0, cqd $$1, dgw $$2, aru $$3, duq $$4, cos $$5, dvn $$6) {
   }

   private static int[] b(duy.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dgw $$5 = $$0.b();
      cpn $$6 = $$0.i();
      dkw $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, dki.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, dki.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, dki.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, dki.a.a, $$6, $$7)
      };
   }

   protected static int a(duy.a $$0, int $$1, int $$2) {
      cos $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return a($$0, $$4, $$5, $$1, $$2);
   }

   protected static int a(duy.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = b($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected gu a(duy.a $$0, cyx $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == cyx.b) {
         $$2 = -5;
      } else if ($$1 == cyx.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == cyx.d) {
         $$3 = -5;
      }

      cos $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new gu($$5, a($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<duy.b> a(duy.a var1);

   public Optional<duy.b> b(duy.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract dvh<?> e();

   public static record a(hs a, dgw b, cqn c, dkw d, dys e, dlh f, long g, cos h, cpn i, Predicate<he<cqj>> j) {

      public a(hs $$0, dgw $$1, cqn $$2, dkw $$3, dys $$4, long $$5, cos $$6, cpn $$7, Predicate<he<cqj>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static dlh a(long $$0, cos $$1) {
         dlh $$2 = new dlh(new dkj(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(gu a, Either<Consumer<dvq>, dvq> b) {
      public b(gu $$0, Consumer<dvq> $$1) {
         this($$0, Either.left($$1));
      }

      public dvq a() {
         return (dvq)this.b.map($$0 -> {
            dvq $$1 = new dvq();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public gu b() {
         return this.a;
      }

      public Either<Consumer<dvq>, dvq> c() {
         return this.b;
      }
   }

   public static record c(hi<cqj> b, Map<bjb, dvf> c, dke.b d, dvj e) {
      public static final MapCodec<duy.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ht.a(jc.ap).fieldOf("biomes").forGetter(duy.c::a),
                  Codec.simpleMap(bjb.i, dvf.a, ash.a(bjb.values())).fieldOf("spawn_overrides").forGetter(duy.c::b),
                  dke.b.l.fieldOf("step").forGetter(duy.c::c),
                  dvj.e.optionalFieldOf("terrain_adaptation", dvj.a).forGetter(duy.c::d)
               )
               .apply($$0, duy.c::new)
      );

      public hi<cqj> a() {
         return this.b;
      }

      public Map<bjb, dvf> b() {
         return this.c;
      }

      public dke.b c() {
         return this.d;
      }

      public dvj d() {
         return this.e;
      }
   }
}
