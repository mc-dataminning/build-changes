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

public abstract class eri {
   public static final Codec<eri> a = mg.R.q().dispatch(eri::e, err::codec);
   public static final Codec<jf<eri>> b = alc.a(mh.be, a);
   protected final eri.c c;

   public static <S extends eri> RecordCodecBuilder<S, eri.c> a(Instance<S> $$0) {
      return eri.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends eri> MapCodec<S> a(Function<eri.c, S> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected eri(eri.c $$0) {
      this.c = $$0;
   }

   public jj<dkk> a() {
      return this.c.b;
   }

   public Map<bxm, erp> b() {
      return this.c.c;
   }

   public egj.a c() {
      return this.c.d;
   }

   public ert d() {
      return this.c.e;
   }

   public era a(era $$0) {
      return this.d() != ert.a ? $$0.a(12) : $$0;
   }

   public erq a(jf<eri> $$0, alf<djh> $$1, jt $$2, ecm $$3, dko $$4, ehb $$5, evl $$6, long $$7, dio $$8, int $$9, djj $$10, Predicate<jf<dkk>> $$11) {
      brb $$12 = bqy.f.a($$8, $$1, $$0);
      eri.a $$13 = new eri.a($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$10, $$11);
      Optional<eri.b> $$14 = this.b($$13);
      if ($$14.isPresent()) {
         esa $$15 = $$14.get().a();
         erq $$16 = new erq(this, $$8, $$9, $$15.a());
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

      return erq.b;
   }

   protected static Optional<eri.b> a(eri.a $$0, egn.a $$1, Consumer<esa> $$2) {
      dio $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new eri.b(new iv($$4, $$6, $$5), $$2));
   }

   private static boolean a(eri.b $$0, eri.a $$1) {
      iv $$2 = $$0.b();
      return $$1.j.test($$1.b.d().getNoiseBiome(jq.a($$2.u()), jq.a($$2.v()), jq.a($$2.w()), $$1.d.b()));
   }

   public void a(dkg $$0, dkd $$1, ecm $$2, azv $$3, era $$4, dio $$5, erx $$6) {
   }

   private static int[] c(eri.a $$0, int $$1, int $$2, int $$3, int $$4) {
      ecm $$5 = $$0.b();
      djj $$6 = $$0.i();
      ehb $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, egn.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, egn.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, egn.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, egn.a.a, $$6, $$7)
      };
   }

   public static int a(eri.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$2, $$3, $$4);
      return ($$5[0] + $$5[1] + $$5[2] + $$5[3]) / 4;
   }

   protected static int a(eri.a $$0, int $$1, int $$2) {
      dio $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return b($$0, $$4, $$5, $$1, $$2);
   }

   protected static int b(eri.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected iv a(eri.a $$0, dtg $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dtg.b) {
         $$2 = -5;
      } else if ($$1 == dtg.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dtg.d) {
         $$3 = -5;
      }

      dio $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new iv($$5, b($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<eri.b> a(eri.a var1);

   public Optional<eri.b> b(eri.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract err<?> e();

   public static record a(jt a, ecm b, dko c, ehb d, evl e, ehm f, long g, dio h, djj i, Predicate<jf<dkk>> j) {

      public a(jt $$0, ecm $$1, dko $$2, ehb $$3, evl $$4, long $$5, dio $$6, djj $$7, Predicate<jf<dkk>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static ehm a(long $$0, dio $$1) {
         ehm $$2 = new ehm(new ego(0L));
         $$2.c($$0, $$1.h, $$1.i);
         return $$2;
      }
   }

   public static record b(iv a, Either<Consumer<esa>, esa> b) {
      public b(iv $$0, Consumer<esa> $$1) {
         this($$0, Either.left($$1));
      }

      public esa a() {
         return (esa)this.b.map($$0 -> {
            esa $$1 = new esa();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public iv b() {
         return this.a;
      }

      public Either<Consumer<esa>, esa> c() {
         return this.b;
      }
   }

   public static record c(jj<dkk> b, Map<bxm, erp> c, egj.a d, ert e) {
      static final eri.c f = new eri.c(jj.a(), Map.of(), egj.a.e, ert.a);
      public static final MapCodec<eri.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ju.a(mh.aG).fieldOf("biomes").forGetter(eri.c::a),
                  Codec.simpleMap(bxm.i, erp.a, bak.a(bxm.values())).fieldOf("spawn_overrides").forGetter(eri.c::b),
                  egj.a.l.fieldOf("step").forGetter(eri.c::c),
                  ert.f.optionalFieldOf("terrain_adaptation", f.e).forGetter(eri.c::d)
               )
               .apply($$0, eri.c::new)
      );

      public c(jj<dkk> $$0) {
         this($$0, f.c, f.d, f.e);
      }

      public jj<dkk> a() {
         return this.b;
      }

      public Map<bxm, erp> b() {
         return this.c;
      }

      public egj.a c() {
         return this.d;
      }

      public ert d() {
         return this.e;
      }

      public static class a {
         private final jj<dkk> a;
         private Map<bxm, erp> b = eri.c.f.c;
         private egj.a c = eri.c.f.d;
         private ert d = eri.c.f.e;

         public a(jj<dkk> $$0) {
            this.a = $$0;
         }

         public eri.c.a a(Map<bxm, erp> $$0) {
            this.b = $$0;
            return this;
         }

         public eri.c.a a(egj.a $$0) {
            this.c = $$0;
            return this;
         }

         public eri.c.a a(ert $$0) {
            this.d = $$0;
            return this;
         }

         public eri.c a() {
            return new eri.c(this.a, this.b, this.c, this.d);
         }
      }
   }
}
