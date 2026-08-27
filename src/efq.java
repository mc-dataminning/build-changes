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

public abstract class efq {
   public static final Codec<efq> a = kt.T.q().dispatch(efq::e, efz::codec);
   public static final Codec<in<efq>> b = ajr.a(ku.aG, a);
   protected final efq.c c;

   public static <S extends efq> RecordCodecBuilder<S, efq.c> a(Instance<S> $$0) {
      return efq.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends efq> Codec<S> a(Function<efq.c, S> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected efq(efq.c $$0) {
      this.c = $$0;
   }

   public ir<daf> a() {
      return this.c.b;
   }

   public Map<bqw, efx> b() {
      return this.c.c;
   }

   public duw.b c() {
      return this.c.d;
   }

   public egb d() {
      return this.c.e;
   }

   public efi a(efi $$0) {
      return this.d() != egb.a ? $$0.a(12) : $$0;
   }

   public efy a(jb $$0, drf $$1, daj $$2, dvo $$3, ejr $$4, long $$5, cyn $$6, int $$7, czi $$8, Predicate<in<daf>> $$9) {
      efq.a $$10 = new efq.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<efq.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         egi $$12 = $$11.get().a();
         efy $$13 = new efy(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return efy.b;
   }

   protected static Optional<efq.b> a(efq.a $$0, dva.a $$1, Consumer<egi> $$2) {
      cyn $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new efq.b(new id($$4, $$6, $$5), $$2));
   }

   private static boolean a(efq.b $$0, efq.a $$1) {
      id $$2 = $$0.b();
      return $$1.j.test($$1.b.c().getNoiseBiome(iy.a($$2.u()), iy.a($$2.v()), iy.a($$2.w()), $$1.d.b()));
   }

   public void a(dab $$0, czz $$1, drf $$2, axt $$3, efi $$4, cyn $$5, egf $$6) {
   }

   private static int[] b(efq.a $$0, int $$1, int $$2, int $$3, int $$4) {
      drf $$5 = $$0.b();
      czi $$6 = $$0.i();
      dvo $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, dva.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, dva.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, dva.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, dva.a.a, $$6, $$7)
      };
   }

   protected static int a(efq.a $$0, int $$1, int $$2) {
      cyn $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return a($$0, $$4, $$5, $$1, $$2);
   }

   protected static int a(efq.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = b($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected id a(efq.a $$0, dit $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dit.b) {
         $$2 = -5;
      } else if ($$1 == dit.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dit.d) {
         $$3 = -5;
      }

      cyn $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new id($$5, a($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<efq.b> a(efq.a var1);

   public Optional<efq.b> b(efq.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract efz<?> e();

   public static record a(jb a, drf b, daj c, dvo d, ejr e, dvz f, long g, cyn h, czi i, Predicate<in<daf>> j) {

      public a(jb $$0, drf $$1, daj $$2, dvo $$3, ejr $$4, long $$5, cyn $$6, czi $$7, Predicate<in<daf>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static dvz a(long $$0, cyn $$1) {
         dvz $$2 = new dvz(new dvb(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(id a, Either<Consumer<egi>, egi> b) {
      public b(id $$0, Consumer<egi> $$1) {
         this($$0, Either.left($$1));
      }

      public egi a() {
         return (egi)this.b.map($$0 -> {
            egi $$1 = new egi();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public id b() {
         return this.a;
      }

      public Either<Consumer<egi>, egi> c() {
         return this.b;
      }
   }

   public static record c(ir<daf> b, Map<bqw, efx> c, duw.b d, egb e) {
      public static final MapCodec<efq.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  jc.a(ku.aw).fieldOf("biomes").forGetter(efq.c::a),
                  Codec.simpleMap(bqw.i, efx.a, ayg.a(bqw.values())).fieldOf("spawn_overrides").forGetter(efq.c::b),
                  duw.b.l.fieldOf("step").forGetter(efq.c::c),
                  egb.e.optionalFieldOf("terrain_adaptation", egb.a).forGetter(efq.c::d)
               )
               .apply($$0, efq.c::new)
      );

      public ir<daf> a() {
         return this.b;
      }

      public Map<bqw, efx> b() {
         return this.c;
      }

      public duw.b c() {
         return this.d;
      }

      public egb d() {
         return this.e;
      }
   }
}
