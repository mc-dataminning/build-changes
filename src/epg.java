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

public abstract class epg {
   public static final Codec<epg> a = md.R.q().dispatch(epg::e, epp::codec);
   public static final Codec<js<epg>> b = akz.a(me.aZ, a);
   protected final epg.c c;

   public static <S extends epg> RecordCodecBuilder<S, epg.c> a(Instance<S> $$0) {
      return epg.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends epg> MapCodec<S> a(Function<epg.c, S> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected epg(epg.c $$0) {
      this.c = $$0;
   }

   public jw<dis> a() {
      return this.c.b;
   }

   public Map<bwu, epn> b() {
      return this.c.c;
   }

   public eeh.a c() {
      return this.c.d;
   }

   public epr d() {
      return this.c.e;
   }

   public eoy a(eoy $$0) {
      return this.d() != epr.a ? $$0.a(12) : $$0;
   }

   public epo a(js<epg> $$0, alc<dhp> $$1, kg $$2, eak $$3, diw $$4, eez $$5, etj $$6, long $$7, dgw $$8, int $$9, dhr $$10, Predicate<js<dis>> $$11) {
      bqm $$12 = bqj.f.a($$8, $$1, $$0);
      epg.a $$13 = new epg.a($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$10, $$11);
      Optional<epg.b> $$14 = this.b($$13);
      if ($$14.isPresent()) {
         epy $$15 = $$14.get().a();
         epo $$16 = new epo(this, $$8, $$9, $$15.a());
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

      return epo.b;
   }

   protected static Optional<epg.b> a(epg.a $$0, eel.a $$1, Consumer<epy> $$2) {
      dgw $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new epg.b(new jj($$4, $$6, $$5), $$2));
   }

   private static boolean a(epg.b $$0, epg.a $$1) {
      jj $$2 = $$0.b();
      return $$1.j.test($$1.b.d().getNoiseBiome(kd.a($$2.u()), kd.a($$2.v()), kd.a($$2.w()), $$1.d.b()));
   }

   public void a(dio $$0, dil $$1, eak $$2, azs $$3, eoy $$4, dgw $$5, epv $$6) {
   }

   private static int[] c(epg.a $$0, int $$1, int $$2, int $$3, int $$4) {
      eak $$5 = $$0.b();
      dhr $$6 = $$0.i();
      eez $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, eel.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, eel.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, eel.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, eel.a.a, $$6, $$7)
      };
   }

   public static int a(epg.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$2, $$3, $$4);
      return ($$5[0] + $$5[1] + $$5[2] + $$5[3]) / 4;
   }

   protected static int a(epg.a $$0, int $$1, int $$2) {
      dgw $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return b($$0, $$4, $$5, $$1, $$2);
   }

   protected static int b(epg.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected jj a(epg.a $$0, drm $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == drm.b) {
         $$2 = -5;
      } else if ($$1 == drm.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == drm.d) {
         $$3 = -5;
      }

      dgw $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new jj($$5, b($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<epg.b> a(epg.a var1);

   public Optional<epg.b> b(epg.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract epp<?> e();

   public static record a(kg a, eak b, diw c, eez d, etj e, efk f, long g, dgw h, dhr i, Predicate<js<dis>> j) {

      public a(kg $$0, eak $$1, diw $$2, eez $$3, etj $$4, long $$5, dgw $$6, dhr $$7, Predicate<js<dis>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static efk a(long $$0, dgw $$1) {
         efk $$2 = new efk(new eem(0L));
         $$2.c($$0, $$1.h, $$1.i);
         return $$2;
      }
   }

   public static record b(jj a, Either<Consumer<epy>, epy> b) {
      public b(jj $$0, Consumer<epy> $$1) {
         this($$0, Either.left($$1));
      }

      public epy a() {
         return (epy)this.b.map($$0 -> {
            epy $$1 = new epy();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public jj b() {
         return this.a;
      }

      public Either<Consumer<epy>, epy> c() {
         return this.b;
      }
   }

   public static record c(jw<dis> b, Map<bwu, epn> c, eeh.a d, epr e) {
      static final epg.c f = new epg.c(jw.a(), Map.of(), eeh.a.e, epr.a);
      public static final MapCodec<epg.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  kh.a(me.aM).fieldOf("biomes").forGetter(epg.c::a),
                  Codec.simpleMap(bwu.i, epn.a, bag.a(bwu.values())).fieldOf("spawn_overrides").forGetter(epg.c::b),
                  eeh.a.l.fieldOf("step").forGetter(epg.c::c),
                  epr.f.optionalFieldOf("terrain_adaptation", f.e).forGetter(epg.c::d)
               )
               .apply($$0, epg.c::new)
      );

      public c(jw<dis> $$0) {
         this($$0, f.c, f.d, f.e);
      }

      public jw<dis> a() {
         return this.b;
      }

      public Map<bwu, epn> b() {
         return this.c;
      }

      public eeh.a c() {
         return this.d;
      }

      public epr d() {
         return this.e;
      }

      public static class a {
         private final jw<dis> a;
         private Map<bwu, epn> b = epg.c.f.c;
         private eeh.a c = epg.c.f.d;
         private epr d = epg.c.f.e;

         public a(jw<dis> $$0) {
            this.a = $$0;
         }

         public epg.c.a a(Map<bwu, epn> $$0) {
            this.b = $$0;
            return this;
         }

         public epg.c.a a(eeh.a $$0) {
            this.c = $$0;
            return this;
         }

         public epg.c.a a(epr $$0) {
            this.d = $$0;
            return this;
         }

         public epg.c a() {
            return new epg.c(this.a, this.b, this.c, this.d);
         }
      }
   }
}
