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

public abstract class dxh {
   public static final Codec<dxh> a = jy.U.q().dispatch(dxh::e, dxq::codec);
   public static final Codec<ib<dxh>> b = age.a(jz.aB, a);
   protected final dxh.c c;

   public static <S extends dxh> RecordCodecBuilder<S, dxh.c> a(Instance<S> $$0) {
      return dxh.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends dxh> Codec<S> a(Function<dxh.c, S> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected dxh(dxh.c $$0) {
      this.c = $$0;
   }

   public ig<csy> a() {
      return this.c.b;
   }

   public Map<blj, dxo> b() {
      return this.c.c;
   }

   public dmn.b c() {
      return this.c.d;
   }

   public dxs d() {
      return this.c.e;
   }

   public dwz a(dwz $$0) {
      return this.d() != dxs.a ? $$0.a(12) : $$0;
   }

   public dxp a(ip $$0, djf $$1, ctc $$2, dnf $$3, ebi $$4, long $$5, crh $$6, int $$7, csc $$8, Predicate<ib<csy>> $$9) {
      dxh.a $$10 = new dxh.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<dxh.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         dxz $$12 = $$11.get().a();
         dxp $$13 = new dxp(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return dxp.b;
   }

   protected static Optional<dxh.b> a(dxh.a $$0, dmr.a $$1, Consumer<dxz> $$2) {
      crh $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new dxh.b(new ht($$4, $$6, $$5), $$2));
   }

   private static boolean a(dxh.b $$0, dxh.a $$1) {
      ht $$2 = $$0.b();
      return $$1.j.test($$1.b.c().getNoiseBiome(in.a($$2.u()), in.a($$2.v()), in.a($$2.w()), $$1.d.b()));
   }

   public void a(csu $$0, css $$1, djf $$2, ats $$3, dwz $$4, crh $$5, dxw $$6) {
   }

   private static int[] b(dxh.a $$0, int $$1, int $$2, int $$3, int $$4) {
      djf $$5 = $$0.b();
      csc $$6 = $$0.i();
      dnf $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, dmr.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, dmr.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, dmr.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, dmr.a.a, $$6, $$7)
      };
   }

   protected static int a(dxh.a $$0, int $$1, int $$2) {
      crh $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return a($$0, $$4, $$5, $$1, $$2);
   }

   protected static int a(dxh.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = b($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected ht a(dxh.a $$0, dbm $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dbm.b) {
         $$2 = -5;
      } else if ($$1 == dbm.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dbm.d) {
         $$3 = -5;
      }

      crh $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new ht($$5, a($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<dxh.b> a(dxh.a var1);

   public Optional<dxh.b> b(dxh.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract dxq<?> e();

   public static record a(ip a, djf b, ctc c, dnf d, ebi e, dnq f, long g, crh h, csc i, Predicate<ib<csy>> j) {

      public a(ip $$0, djf $$1, ctc $$2, dnf $$3, ebi $$4, long $$5, crh $$6, csc $$7, Predicate<ib<csy>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static dnq a(long $$0, crh $$1) {
         dnq $$2 = new dnq(new dms(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(ht a, Either<Consumer<dxz>, dxz> b) {
      public b(ht $$0, Consumer<dxz> $$1) {
         this($$0, Either.left($$1));
      }

      public dxz a() {
         return (dxz)this.b.map($$0 -> {
            dxz $$1 = new dxz();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public ht b() {
         return this.a;
      }

      public Either<Consumer<dxz>, dxz> c() {
         return this.b;
      }
   }

   public static record c(ig<csy> b, Map<blj, dxo> c, dmn.b d, dxs e) {
      public static final MapCodec<dxh.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  iq.a(jz.ar).fieldOf("biomes").forGetter(dxh.c::a),
                  Codec.simpleMap(blj.i, dxo.a, aug.a(blj.values())).fieldOf("spawn_overrides").forGetter(dxh.c::b),
                  dmn.b.l.fieldOf("step").forGetter(dxh.c::c),
                  dxs.e.optionalFieldOf("terrain_adaptation", dxs.a).forGetter(dxh.c::d)
               )
               .apply($$0, dxh.c::new)
      );

      public ig<csy> a() {
         return this.b;
      }

      public Map<blj, dxo> b() {
         return this.c;
      }

      public dmn.b c() {
         return this.d;
      }

      public dxs d() {
         return this.e;
      }
   }
}
