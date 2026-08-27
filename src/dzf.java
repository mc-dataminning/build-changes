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

public abstract class dzf {
   public static final Codec<dzf> a = kd.T.q().dispatch(dzf::e, dzo::codec);
   public static final Codec<ih<dzf>> b = ahc.a(ke.aD, a);
   protected final dzf.c c;

   public static <S extends dzf> RecordCodecBuilder<S, dzf.c> a(Instance<S> $$0) {
      return dzf.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends dzf> Codec<S> a(Function<dzf.c, S> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected dzf(dzf.c $$0) {
      this.c = $$0;
   }

   public il<cun> a() {
      return this.c.b;
   }

   public Map<bmn, dzm> b() {
      return this.c.c;
   }

   public dol.b c() {
      return this.c.d;
   }

   public dzq d() {
      return this.c.e;
   }

   public dyx a(dyx $$0) {
      return this.d() != dzq.a ? $$0.a(12) : $$0;
   }

   public dzn a(iu $$0, dld $$1, cur $$2, dpd $$3, edg $$4, long $$5, csv $$6, int $$7, ctq $$8, Predicate<ih<cun>> $$9) {
      dzf.a $$10 = new dzf.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<dzf.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         dzx $$12 = $$11.get().a();
         dzn $$13 = new dzn(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return dzn.b;
   }

   protected static Optional<dzf.b> a(dzf.a $$0, dop.a $$1, Consumer<dzx> $$2) {
      csv $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new dzf.b(new hx($$4, $$6, $$5), $$2));
   }

   private static boolean a(dzf.b $$0, dzf.a $$1) {
      hx $$2 = $$0.b();
      return $$1.j.test($$1.b.c().getNoiseBiome(is.a($$2.u()), is.a($$2.v()), is.a($$2.w()), $$1.d.b()));
   }

   public void a(cuj $$0, cuh $$1, dld $$2, auu $$3, dyx $$4, csv $$5, dzu $$6) {
   }

   private static int[] b(dzf.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dld $$5 = $$0.b();
      ctq $$6 = $$0.i();
      dpd $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, dop.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, dop.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, dop.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, dop.a.a, $$6, $$7)
      };
   }

   protected static int a(dzf.a $$0, int $$1, int $$2) {
      csv $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return a($$0, $$4, $$5, $$1, $$2);
   }

   protected static int a(dzf.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = b($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected hx a(dzf.a $$0, ddb $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == ddb.b) {
         $$2 = -5;
      } else if ($$1 == ddb.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == ddb.d) {
         $$3 = -5;
      }

      csv $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new hx($$5, a($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<dzf.b> a(dzf.a var1);

   public Optional<dzf.b> b(dzf.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract dzo<?> e();

   public static record a(iu a, dld b, cur c, dpd d, edg e, dpo f, long g, csv h, ctq i, Predicate<ih<cun>> j) {

      public a(iu $$0, dld $$1, cur $$2, dpd $$3, edg $$4, long $$5, csv $$6, ctq $$7, Predicate<ih<cun>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static dpo a(long $$0, csv $$1) {
         dpo $$2 = new dpo(new doq(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(hx a, Either<Consumer<dzx>, dzx> b) {
      public b(hx $$0, Consumer<dzx> $$1) {
         this($$0, Either.left($$1));
      }

      public dzx a() {
         return (dzx)this.b.map($$0 -> {
            dzx $$1 = new dzx();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public hx b() {
         return this.a;
      }

      public Either<Consumer<dzx>, dzx> c() {
         return this.b;
      }
   }

   public static record c(il<cun> b, Map<bmn, dzm> c, dol.b d, dzq e) {
      public static final MapCodec<dzf.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  iv.a(ke.at).fieldOf("biomes").forGetter(dzf.c::a),
                  Codec.simpleMap(bmn.i, dzm.a, avj.a(bmn.values())).fieldOf("spawn_overrides").forGetter(dzf.c::b),
                  dol.b.l.fieldOf("step").forGetter(dzf.c::c),
                  dzq.e.optionalFieldOf("terrain_adaptation", dzq.a).forGetter(dzf.c::d)
               )
               .apply($$0, dzf.c::new)
      );

      public il<cun> a() {
         return this.b;
      }

      public Map<bmn, dzm> b() {
         return this.c;
      }

      public dol.b c() {
         return this.d;
      }

      public dzq d() {
         return this.e;
      }
   }
}
