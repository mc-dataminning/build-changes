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

public abstract class dxm {
   public static final Codec<dxm> a = kc.U.q().dispatch(dxm::e, dxv::codec);
   public static final Codec<ig<dxm>> b = agi.a(kd.aB, a);
   protected final dxm.c c;

   public static <S extends dxm> RecordCodecBuilder<S, dxm.c> a(Instance<S> $$0) {
      return dxm.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends dxm> Codec<S> a(Function<dxm.c, S> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected dxm(dxm.c $$0) {
      this.c = $$0;
   }

   public ik<ctd> a() {
      return this.c.b;
   }

   public Map<blo, dxt> b() {
      return this.c.c;
   }

   public dms.b c() {
      return this.c.d;
   }

   public dxx d() {
      return this.c.e;
   }

   public dxe a(dxe $$0) {
      return this.d() != dxx.a ? $$0.a(12) : $$0;
   }

   public dxu a(it $$0, djk $$1, cth $$2, dnk $$3, ebn $$4, long $$5, crm $$6, int $$7, csh $$8, Predicate<ig<ctd>> $$9) {
      dxm.a $$10 = new dxm.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<dxm.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         dye $$12 = $$11.get().a();
         dxu $$13 = new dxu(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return dxu.b;
   }

   protected static Optional<dxm.b> a(dxm.a $$0, dmw.a $$1, Consumer<dye> $$2) {
      crm $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new dxm.b(new hx($$4, $$6, $$5), $$2));
   }

   private static boolean a(dxm.b $$0, dxm.a $$1) {
      hx $$2 = $$0.b();
      return $$1.j.test($$1.b.c().getNoiseBiome(ir.a($$2.u()), ir.a($$2.v()), ir.a($$2.w()), $$1.d.b()));
   }

   public void a(csz $$0, csx $$1, djk $$2, atw $$3, dxe $$4, crm $$5, dyb $$6) {
   }

   private static int[] b(dxm.a $$0, int $$1, int $$2, int $$3, int $$4) {
      djk $$5 = $$0.b();
      csh $$6 = $$0.i();
      dnk $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, dmw.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, dmw.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, dmw.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, dmw.a.a, $$6, $$7)
      };
   }

   protected static int a(dxm.a $$0, int $$1, int $$2) {
      crm $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return a($$0, $$4, $$5, $$1, $$2);
   }

   protected static int a(dxm.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = b($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected hx a(dxm.a $$0, dbr $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dbr.b) {
         $$2 = -5;
      } else if ($$1 == dbr.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dbr.d) {
         $$3 = -5;
      }

      crm $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new hx($$5, a($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<dxm.b> a(dxm.a var1);

   public Optional<dxm.b> b(dxm.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract dxv<?> e();

   public static record a(it a, djk b, cth c, dnk d, ebn e, dnv f, long g, crm h, csh i, Predicate<ig<ctd>> j) {

      public a(it $$0, djk $$1, cth $$2, dnk $$3, ebn $$4, long $$5, crm $$6, csh $$7, Predicate<ig<ctd>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static dnv a(long $$0, crm $$1) {
         dnv $$2 = new dnv(new dmx(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(hx a, Either<Consumer<dye>, dye> b) {
      public b(hx $$0, Consumer<dye> $$1) {
         this($$0, Either.left($$1));
      }

      public dye a() {
         return (dye)this.b.map($$0 -> {
            dye $$1 = new dye();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public hx b() {
         return this.a;
      }

      public Either<Consumer<dye>, dye> c() {
         return this.b;
      }
   }

   public static record c(ik<ctd> b, Map<blo, dxt> c, dms.b d, dxx e) {
      public static final MapCodec<dxm.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  iu.a(kd.ar).fieldOf("biomes").forGetter(dxm.c::a),
                  Codec.simpleMap(blo.i, dxt.a, auk.a(blo.values())).fieldOf("spawn_overrides").forGetter(dxm.c::b),
                  dms.b.l.fieldOf("step").forGetter(dxm.c::c),
                  dxx.e.optionalFieldOf("terrain_adaptation", dxx.a).forGetter(dxm.c::d)
               )
               .apply($$0, dxm.c::new)
      );

      public ik<ctd> a() {
         return this.b;
      }

      public Map<blo, dxt> b() {
         return this.c;
      }

      public dms.b c() {
         return this.d;
      }

      public dxx d() {
         return this.e;
      }
   }
}
