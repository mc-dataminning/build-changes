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

public abstract class elr {
   public static final Codec<elr> a = lx.R.q().dispatch(elr::e, ema::codec);
   public static final Codec<jp<elr>> b = ald.a(ly.aS, a);
   protected final elr.c c;

   public static <S extends elr> RecordCodecBuilder<S, elr.c> a(Instance<S> $$0) {
      return elr.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends elr> MapCodec<S> a(Function<elr.c, S> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected elr(elr.c $$0) {
      this.c = $$0;
   }

   public jt<dfw> a() {
      return this.c.b;
   }

   public Map<buy, ely> b() {
      return this.c.c;
   }

   public eav.a c() {
      return this.c.d;
   }

   public emc d() {
      return this.c.e;
   }

   public elj a(elj $$0) {
      return this.d() != emc.a ? $$0.a(12) : $$0;
   }

   public elz a(kd $$0, dxa $$1, dga $$2, ebn $$3, epu $$4, long $$5, deb $$6, int $$7, dex $$8, Predicate<jp<dfw>> $$9) {
      elr.a $$10 = new elr.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<elr.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         emj $$12 = $$11.get().a();
         elz $$13 = new elz(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return elz.b;
   }

   protected static Optional<elr.b> a(elr.a $$0, eaz.a $$1, Consumer<emj> $$2) {
      deb $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new elr.b(new jg($$4, $$6, $$5), $$2));
   }

   private static boolean a(elr.b $$0, elr.a $$1) {
      jg $$2 = $$0.b();
      return $$1.j.test($$1.b.d().getNoiseBiome(ka.a($$2.u()), ka.a($$2.v()), ka.a($$2.w()), $$1.d.b()));
   }

   public void a(dfs $$0, dfq $$1, dxa $$2, azr $$3, elj $$4, deb $$5, emg $$6) {
   }

   private static int[] c(elr.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dxa $$5 = $$0.b();
      dex $$6 = $$0.i();
      ebn $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, eaz.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, eaz.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, eaz.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, eaz.a.a, $$6, $$7)
      };
   }

   public static int a(elr.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$2, $$3, $$4);
      return ($$5[0] + $$5[1] + $$5[2] + $$5[3]) / 4;
   }

   protected static int a(elr.a $$0, int $$1, int $$2) {
      deb $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return b($$0, $$4, $$5, $$1, $$2);
   }

   protected static int b(elr.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected jg a(elr.a $$0, dol $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dol.b) {
         $$2 = -5;
      } else if ($$1 == dol.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dol.d) {
         $$3 = -5;
      }

      deb $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new jg($$5, b($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<elr.b> a(elr.a var1);

   public Optional<elr.b> b(elr.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract ema<?> e();

   public static record a(kd a, dxa b, dga c, ebn d, epu e, eby f, long g, deb h, dex i, Predicate<jp<dfw>> j) {

      public a(kd $$0, dxa $$1, dga $$2, ebn $$3, epu $$4, long $$5, deb $$6, dex $$7, Predicate<jp<dfw>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static eby a(long $$0, deb $$1) {
         eby $$2 = new eby(new eba(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(jg a, Either<Consumer<emj>, emj> b) {
      public b(jg $$0, Consumer<emj> $$1) {
         this($$0, Either.left($$1));
      }

      public emj a() {
         return (emj)this.b.map($$0 -> {
            emj $$1 = new emj();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public jg b() {
         return this.a;
      }

      public Either<Consumer<emj>, emj> c() {
         return this.b;
      }
   }

   public static record c(jt<dfw> b, Map<buy, ely> c, eav.a d, emc e) {
      static final elr.c f = new elr.c(jt.a(), Map.of(), eav.a.e, emc.a);
      public static final MapCodec<elr.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ke.a(ly.aG).fieldOf("biomes").forGetter(elr.c::a),
                  Codec.simpleMap(buy.i, ely.a, baf.a(buy.values())).fieldOf("spawn_overrides").forGetter(elr.c::b),
                  eav.a.l.fieldOf("step").forGetter(elr.c::c),
                  emc.f.optionalFieldOf("terrain_adaptation", f.e).forGetter(elr.c::d)
               )
               .apply($$0, elr.c::new)
      );

      public c(jt<dfw> $$0) {
         this($$0, f.c, f.d, f.e);
      }

      public jt<dfw> a() {
         return this.b;
      }

      public Map<buy, ely> b() {
         return this.c;
      }

      public eav.a c() {
         return this.d;
      }

      public emc d() {
         return this.e;
      }

      public static class a {
         private final jt<dfw> a;
         private Map<buy, ely> b = elr.c.f.c;
         private eav.a c = elr.c.f.d;
         private emc d = elr.c.f.e;

         public a(jt<dfw> $$0) {
            this.a = $$0;
         }

         public elr.c.a a(Map<buy, ely> $$0) {
            this.b = $$0;
            return this;
         }

         public elr.c.a a(eav.a $$0) {
            this.c = $$0;
            return this;
         }

         public elr.c.a a(emc $$0) {
            this.d = $$0;
            return this;
         }

         public elr.c a() {
            return new elr.c(this.a, this.b, this.c, this.d);
         }
      }
   }
}
