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

public abstract class duz {
   public static final Codec<duz> a = jb.U.q().dispatch(duz::e, dvi::codec);
   public static final Codec<he<duz>> b = aen.a(jc.az, a);
   protected final duz.c c;

   public static <S extends duz> RecordCodecBuilder<S, duz.c> a(Instance<S> $$0) {
      return duz.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends duz> Codec<S> a(Function<duz.c, S> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected duz(duz.c $$0) {
      this.c = $$0;
   }

   public hi<cqk> a() {
      return this.c.b;
   }

   public Map<bjb, dvg> b() {
      return this.c.c;
   }

   public dkf.b c() {
      return this.c.d;
   }

   public dvk d() {
      return this.c.e;
   }

   public dur a(dur $$0) {
      return this.d() != dvk.a ? $$0.a(12) : $$0;
   }

   public dvh a(hs $$0, dgx $$1, cqo $$2, dkx $$3, dyt $$4, long $$5, cot $$6, int $$7, cpo $$8, Predicate<he<cqk>> $$9) {
      duz.a $$10 = new duz.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<duz.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         dvr $$12 = $$11.get().a();
         dvh $$13 = new dvh(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return dvh.b;
   }

   protected static Optional<duz.b> a(duz.a $$0, dkj.a $$1, Consumer<dvr> $$2) {
      cot $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new duz.b(new gu($$4, $$6, $$5), $$2));
   }

   private static boolean a(duz.b $$0, duz.a $$1) {
      gu $$2 = $$0.b();
      return $$1.j.test($$1.b.c().getNoiseBiome(hq.a($$2.u()), hq.a($$2.v()), hq.a($$2.w()), $$1.d.b()));
   }

   public void a(cqg $$0, cqe $$1, dgx $$2, aru $$3, dur $$4, cot $$5, dvo $$6) {
   }

   private static int[] b(duz.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dgx $$5 = $$0.b();
      cpo $$6 = $$0.i();
      dkx $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, dkj.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, dkj.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, dkj.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, dkj.a.a, $$6, $$7)
      };
   }

   protected static int a(duz.a $$0, int $$1, int $$2) {
      cot $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return a($$0, $$4, $$5, $$1, $$2);
   }

   protected static int a(duz.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = b($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected gu a(duz.a $$0, cyy $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == cyy.b) {
         $$2 = -5;
      } else if ($$1 == cyy.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == cyy.d) {
         $$3 = -5;
      }

      cot $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new gu($$5, a($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<duz.b> a(duz.a var1);

   public Optional<duz.b> b(duz.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract dvi<?> e();

   public static record a(hs a, dgx b, cqo c, dkx d, dyt e, dli f, long g, cot h, cpo i, Predicate<he<cqk>> j) {

      public a(hs $$0, dgx $$1, cqo $$2, dkx $$3, dyt $$4, long $$5, cot $$6, cpo $$7, Predicate<he<cqk>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static dli a(long $$0, cot $$1) {
         dli $$2 = new dli(new dkk(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(gu a, Either<Consumer<dvr>, dvr> b) {
      public b(gu $$0, Consumer<dvr> $$1) {
         this($$0, Either.left($$1));
      }

      public dvr a() {
         return (dvr)this.b.map($$0 -> {
            dvr $$1 = new dvr();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public gu b() {
         return this.a;
      }

      public Either<Consumer<dvr>, dvr> c() {
         return this.b;
      }
   }

   public static record c(hi<cqk> b, Map<bjb, dvg> c, dkf.b d, dvk e) {
      public static final MapCodec<duz.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ht.a(jc.ap).fieldOf("biomes").forGetter(duz.c::a),
                  Codec.simpleMap(bjb.i, dvg.a, ash.a(bjb.values())).fieldOf("spawn_overrides").forGetter(duz.c::b),
                  dkf.b.l.fieldOf("step").forGetter(duz.c::c),
                  dvk.e.optionalFieldOf("terrain_adaptation", dvk.a).forGetter(duz.c::d)
               )
               .apply($$0, duz.c::new)
      );

      public hi<cqk> a() {
         return this.b;
      }

      public Map<bjb, dvg> b() {
         return this.c;
      }

      public dkf.b c() {
         return this.d;
      }

      public dvk d() {
         return this.e;
      }
   }
}
