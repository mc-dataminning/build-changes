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

public abstract class eqi {
   public static final Codec<eqi> a = mf.R.q().dispatch(eqi::e, eqr::codec);
   public static final Codec<je<eqi>> b = ala.a(mg.bc, a);
   protected final eqi.c c;

   public static <S extends eqi> RecordCodecBuilder<S, eqi.c> a(Instance<S> $$0) {
      return eqi.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends eqi> MapCodec<S> a(Function<eqi.c, S> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected eqi(eqi.c $$0) {
      this.c = $$0;
   }

   public ji<djs> a() {
      return this.c.b;
   }

   public Map<bxc, eqp> b() {
      return this.c.c;
   }

   public efj.a c() {
      return this.c.d;
   }

   public eqt d() {
      return this.c.e;
   }

   public eqa a(eqa $$0) {
      return this.d() != eqt.a ? $$0.a(12) : $$0;
   }

   public eqq a(je<eqi> $$0, ald<dip> $$1, js $$2, ebm $$3, djw $$4, egb $$5, eul $$6, long $$7, dhw $$8, int $$9, dir $$10, Predicate<je<djs>> $$11) {
      bqu $$12 = bqr.f.a($$8, $$1, $$0);
      eqi.a $$13 = new eqi.a($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$10, $$11);
      Optional<eqi.b> $$14 = this.b($$13);
      if ($$14.isPresent()) {
         era $$15 = $$14.get().a();
         eqq $$16 = new eqq(this, $$8, $$9, $$15.a());
         if ($$16.b()) {
            if ($$12 != null) {
               $$12.finish(true);
            }

            return $$16;
         }
      }

      if ($$12 != null) {
         $$12.finish(false);
      }

      return eqq.b;
   }

   protected static Optional<eqi.b> a(eqi.a $$0, efn.a $$1, Consumer<era> $$2) {
      dhw $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new eqi.b(new iu($$4, $$6, $$5), $$2));
   }

   private static boolean a(eqi.b $$0, eqi.a $$1) {
      iu $$2 = $$0.b();
      return $$1.j.test($$1.b.d().getNoiseBiome(jp.a($$2.u()), jp.a($$2.v()), jp.a($$2.w()), $$1.d.b()));
   }

   public void a(djo $$0, djl $$1, ebm $$2, azt $$3, eqa $$4, dhw $$5, eqx $$6) {
   }

   private static int[] c(eqi.a $$0, int $$1, int $$2, int $$3, int $$4) {
      ebm $$5 = $$0.b();
      dir $$6 = $$0.i();
      egb $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, efn.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, efn.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, efn.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, efn.a.a, $$6, $$7)
      };
   }

   public static int a(eqi.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$2, $$3, $$4);
      return ($$5[0] + $$5[1] + $$5[2] + $$5[3]) / 4;
   }

   protected static int a(eqi.a $$0, int $$1, int $$2) {
      dhw $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return b($$0, $$4, $$5, $$1, $$2);
   }

   protected static int b(eqi.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected iu a(eqi.a $$0, dsm $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dsm.b) {
         $$2 = -5;
      } else if ($$1 == dsm.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dsm.d) {
         $$3 = -5;
      }

      dhw $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new iu($$5, b($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<eqi.b> a(eqi.a var1);

   public Optional<eqi.b> b(eqi.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract eqr<?> e();

   public static record a(js a, ebm b, djw c, egb d, eul e, egm f, long g, dhw h, dir i, Predicate<je<djs>> j) {

      public a(js $$0, ebm $$1, djw $$2, egb $$3, eul $$4, long $$5, dhw $$6, dir $$7, Predicate<je<djs>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static egm a(long $$0, dhw $$1) {
         egm $$2 = new egm(new efo(0L));
         $$2.c($$0, $$1.h, $$1.i);
         return $$2;
      }
   }

   public static record b(iu a, Either<Consumer<era>, era> b) {
      public b(iu $$0, Consumer<era> $$1) {
         this($$0, Either.left($$1));
      }

      public era a() {
         return (era)this.b.map($$0 -> {
            era $$1 = new era();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public iu b() {
         return this.a;
      }

      public Either<Consumer<era>, era> c() {
         return this.b;
      }
   }

   public static record c(ji<djs> b, Map<bxc, eqp> c, efj.a d, eqt e) {
      static final eqi.c f = new eqi.c(ji.a(), Map.of(), efj.a.e, eqt.a);
      public static final MapCodec<eqi.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  jt.a(mg.aG).fieldOf("biomes").forGetter(eqi.c::a),
                  Codec.simpleMap(bxc.i, eqp.a, bai.a(bxc.values())).fieldOf("spawn_overrides").forGetter(eqi.c::b),
                  efj.a.l.fieldOf("step").forGetter(eqi.c::c),
                  eqt.f.optionalFieldOf("terrain_adaptation", f.e).forGetter(eqi.c::d)
               )
               .apply($$0, eqi.c::new)
      );

      public c(ji<djs> $$0) {
         this($$0, f.c, f.d, f.e);
      }

      public ji<djs> a() {
         return this.b;
      }

      public Map<bxc, eqp> b() {
         return this.c;
      }

      public efj.a c() {
         return this.d;
      }

      public eqt d() {
         return this.e;
      }

      public static class a {
         private final ji<djs> a;
         private Map<bxc, eqp> b = eqi.c.f.c;
         private efj.a c = eqi.c.f.d;
         private eqt d = eqi.c.f.e;

         public a(ji<djs> $$0) {
            this.a = $$0;
         }

         public eqi.c.a a(Map<bxc, eqp> $$0) {
            this.b = $$0;
            return this;
         }

         public eqi.c.a a(efj.a $$0) {
            this.c = $$0;
            return this;
         }

         public eqi.c.a a(eqt $$0) {
            this.d = $$0;
            return this;
         }

         public eqi.c a() {
            return new eqi.c(this.a, this.b, this.c, this.d);
         }
      }
   }
}
