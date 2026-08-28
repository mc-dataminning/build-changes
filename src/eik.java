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

public abstract class eik {
   public static final Codec<eik> a = lp.T.q().dispatch(eik::e, eit::codec);
   public static final Codec<ji<eik>> b = alb.a(lq.aJ, a);
   protected final eik.c c;

   public static <S extends eik> RecordCodecBuilder<S, eik.c> a(Instance<S> $$0) {
      return eik.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends eik> MapCodec<S> a(Function<eik.c, S> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected eik(eik.c $$0) {
      this.c = $$0;
   }

   public jm<dcx> a() {
      return this.c.b;
   }

   public Map<bts, eir> b() {
      return this.c.c;
   }

   public dxq.b c() {
      return this.c.d;
   }

   public eiv d() {
      return this.c.e;
   }

   public eic a(eic $$0) {
      return this.d() != eiv.a ? $$0.a(12) : $$0;
   }

   public eis a(jw $$0, dtz $$1, ddb $$2, dyi $$3, eml $$4, long $$5, dbf $$6, int $$7, dca $$8, Predicate<ji<dcx>> $$9) {
      eik.a $$10 = new eik.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<eik.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         ejc $$12 = $$11.get().a();
         eis $$13 = new eis(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return eis.b;
   }

   protected static Optional<eik.b> a(eik.a $$0, dxu.a $$1, Consumer<ejc> $$2) {
      dbf $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new eik.b(new iz($$4, $$6, $$5), $$2));
   }

   private static boolean a(eik.b $$0, eik.a $$1) {
      iz $$2 = $$0.b();
      return $$1.j.test($$1.b.d().getNoiseBiome(jt.a($$2.u()), jt.a($$2.v()), jt.a($$2.w()), $$1.d.b()));
   }

   public void a(dct $$0, dcr $$1, dtz $$2, azh $$3, eic $$4, dbf $$5, eiz $$6) {
   }

   private static int[] c(eik.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dtz $$5 = $$0.b();
      dca $$6 = $$0.i();
      dyi $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, dxu.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, dxu.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, dxu.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, dxu.a.a, $$6, $$7)
      };
   }

   public static int a(eik.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$2, $$3, $$4);
      return ($$5[0] + $$5[1] + $$5[2] + $$5[3]) / 4;
   }

   protected static int a(eik.a $$0, int $$1, int $$2) {
      dbf $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return b($$0, $$4, $$5, $$1, $$2);
   }

   protected static int b(eik.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected iz a(eik.a $$0, dlm $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dlm.b) {
         $$2 = -5;
      } else if ($$1 == dlm.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dlm.d) {
         $$3 = -5;
      }

      dbf $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new iz($$5, b($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<eik.b> a(eik.a var1);

   public Optional<eik.b> b(eik.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract eit<?> e();

   public static record a(jw a, dtz b, ddb c, dyi d, eml e, dyt f, long g, dbf h, dca i, Predicate<ji<dcx>> j) {

      public a(jw $$0, dtz $$1, ddb $$2, dyi $$3, eml $$4, long $$5, dbf $$6, dca $$7, Predicate<ji<dcx>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static dyt a(long $$0, dbf $$1) {
         dyt $$2 = new dyt(new dxv(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(iz a, Either<Consumer<ejc>, ejc> b) {
      public b(iz $$0, Consumer<ejc> $$1) {
         this($$0, Either.left($$1));
      }

      public ejc a() {
         return (ejc)this.b.map($$0 -> {
            ejc $$1 = new ejc();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public iz b() {
         return this.a;
      }

      public Either<Consumer<ejc>, ejc> c() {
         return this.b;
      }
   }

   public static record c(jm<dcx> b, Map<bts, eir> c, dxq.b d, eiv e) {
      public static final MapCodec<eik.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  jx.a(lq.az).fieldOf("biomes").forGetter(eik.c::a),
                  Codec.simpleMap(bts.i, eir.a, azu.a(bts.values())).fieldOf("spawn_overrides").forGetter(eik.c::b),
                  dxq.b.l.fieldOf("step").forGetter(eik.c::c),
                  eiv.f.optionalFieldOf("terrain_adaptation", eiv.a).forGetter(eik.c::d)
               )
               .apply($$0, eik.c::new)
      );

      public jm<dcx> a() {
         return this.b;
      }

      public Map<bts, eir> b() {
         return this.c;
      }

      public dxq.b c() {
         return this.d;
      }

      public eiv d() {
         return this.e;
      }
   }
}
