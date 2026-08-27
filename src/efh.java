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

public abstract class efh {
   public static final Codec<efh> a = kr.T.q().dispatch(efh::e, efq::codec);
   public static final Codec<il<efh>> b = ajp.a(ks.aF, a);
   protected final efh.c c;

   public static <S extends efh> RecordCodecBuilder<S, efh.c> a(Instance<S> $$0) {
      return efh.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends efh> Codec<S> a(Function<efh.c, S> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected efh(efh.c $$0) {
      this.c = $$0;
   }

   public ip<czw> a() {
      return this.c.b;
   }

   public Map<bqr, efo> b() {
      return this.c.c;
   }

   public dun.b c() {
      return this.c.d;
   }

   public efs d() {
      return this.c.e;
   }

   public eez a(eez $$0) {
      return this.d() != efs.a ? $$0.a(12) : $$0;
   }

   public efp a(iz $$0, dqw $$1, daa $$2, dvf $$3, eji $$4, long $$5, cye $$6, int $$7, cyz $$8, Predicate<il<czw>> $$9) {
      efh.a $$10 = new efh.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<efh.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         efz $$12 = $$11.get().a();
         efp $$13 = new efp(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return efp.b;
   }

   protected static Optional<efh.b> a(efh.a $$0, dur.a $$1, Consumer<efz> $$2) {
      cye $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new efh.b(new ib($$4, $$6, $$5), $$2));
   }

   private static boolean a(efh.b $$0, efh.a $$1) {
      ib $$2 = $$0.b();
      return $$1.j.test($$1.b.c().getNoiseBiome(iw.a($$2.u()), iw.a($$2.v()), iw.a($$2.w()), $$1.d.b()));
   }

   public void a(czs $$0, czq $$1, dqw $$2, axr $$3, eez $$4, cye $$5, efw $$6) {
   }

   private static int[] b(efh.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dqw $$5 = $$0.b();
      cyz $$6 = $$0.i();
      dvf $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, dur.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, dur.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, dur.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, dur.a.a, $$6, $$7)
      };
   }

   protected static int a(efh.a $$0, int $$1, int $$2) {
      cye $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return a($$0, $$4, $$5, $$1, $$2);
   }

   protected static int a(efh.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = b($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected ib a(efh.a $$0, dik $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dik.b) {
         $$2 = -5;
      } else if ($$1 == dik.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dik.d) {
         $$3 = -5;
      }

      cye $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new ib($$5, a($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<efh.b> a(efh.a var1);

   public Optional<efh.b> b(efh.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract efq<?> e();

   public static record a(iz a, dqw b, daa c, dvf d, eji e, dvq f, long g, cye h, cyz i, Predicate<il<czw>> j) {

      public a(iz $$0, dqw $$1, daa $$2, dvf $$3, eji $$4, long $$5, cye $$6, cyz $$7, Predicate<il<czw>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static dvq a(long $$0, cye $$1) {
         dvq $$2 = new dvq(new dus(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(ib a, Either<Consumer<efz>, efz> b) {
      public b(ib $$0, Consumer<efz> $$1) {
         this($$0, Either.left($$1));
      }

      public efz a() {
         return (efz)this.b.map($$0 -> {
            efz $$1 = new efz();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public ib b() {
         return this.a;
      }

      public Either<Consumer<efz>, efz> c() {
         return this.b;
      }
   }

   public static record c(ip<czw> b, Map<bqr, efo> c, dun.b d, efs e) {
      public static final MapCodec<efh.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ja.a(ks.av).fieldOf("biomes").forGetter(efh.c::a),
                  Codec.simpleMap(bqr.i, efo.a, aye.a(bqr.values())).fieldOf("spawn_overrides").forGetter(efh.c::b),
                  dun.b.l.fieldOf("step").forGetter(efh.c::c),
                  efs.e.optionalFieldOf("terrain_adaptation", efs.a).forGetter(efh.c::d)
               )
               .apply($$0, efh.c::new)
      );

      public ip<czw> a() {
         return this.b;
      }

      public Map<bqr, efo> b() {
         return this.c;
      }

      public dun.b c() {
         return this.d;
      }

      public efs d() {
         return this.e;
      }
   }
}
