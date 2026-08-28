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

public abstract class eoj {
   public static final Codec<eoj> a = mb.R.q().dispatch(eoj::e, eos::codec);
   public static final Codec<jr<eoj>> b = akq.a(mc.aW, a);
   protected final eoj.c c;

   public static <S extends eoj> RecordCodecBuilder<S, eoj.c> a(Instance<S> $$0) {
      return eoj.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends eoj> MapCodec<S> a(Function<eoj.c, S> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected eoj(eoj.c $$0) {
      this.c = $$0;
   }

   public jv<dic> a() {
      return this.c.b;
   }

   public Map<bwb, eoq> b() {
      return this.c.c;
   }

   public edk.a c() {
      return this.c.d;
   }

   public eou d() {
      return this.c.e;
   }

   public eob a(eob $$0) {
      return this.d() != eou.a ? $$0.a(12) : $$0;
   }

   public eor a(jr<eoj> $$0, akt<dgz> $$1, kf $$2, dzn $$3, dig $$4, eec $$5, esm $$6, long $$7, dgg $$8, int $$9, dhb $$10, Predicate<jr<dic>> $$11) {
      bpu $$12 = bpr.f.a($$8, $$1, $$0);
      eoj.a $$13 = new eoj.a($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$10, $$11);
      Optional<eoj.b> $$14 = this.b($$13);
      if ($$14.isPresent()) {
         epb $$15 = $$14.get().a();
         eor $$16 = new eor(this, $$8, $$9, $$15.a());
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

      return eor.b;
   }

   protected static Optional<eoj.b> a(eoj.a $$0, edo.a $$1, Consumer<epb> $$2) {
      dgg $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new eoj.b(new ji($$4, $$6, $$5), $$2));
   }

   private static boolean a(eoj.b $$0, eoj.a $$1) {
      ji $$2 = $$0.b();
      return $$1.j.test($$1.b.d().getNoiseBiome(kc.a($$2.u()), kc.a($$2.v()), kc.a($$2.w()), $$1.d.b()));
   }

   public void a(dhy $$0, dhv $$1, dzn $$2, azh $$3, eob $$4, dgg $$5, eoy $$6) {
   }

   private static int[] c(eoj.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dzn $$5 = $$0.b();
      dhb $$6 = $$0.i();
      eec $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, edo.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, edo.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, edo.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, edo.a.a, $$6, $$7)
      };
   }

   public static int a(eoj.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$2, $$3, $$4);
      return ($$5[0] + $$5[1] + $$5[2] + $$5[3]) / 4;
   }

   protected static int a(eoj.a $$0, int $$1, int $$2) {
      dgg $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return b($$0, $$4, $$5, $$1, $$2);
   }

   protected static int b(eoj.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected ji a(eoj.a $$0, dqw $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dqw.b) {
         $$2 = -5;
      } else if ($$1 == dqw.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dqw.d) {
         $$3 = -5;
      }

      dgg $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new ji($$5, b($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<eoj.b> a(eoj.a var1);

   public Optional<eoj.b> b(eoj.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract eos<?> e();

   public static record a(kf a, dzn b, dig c, eec d, esm e, een f, long g, dgg h, dhb i, Predicate<jr<dic>> j) {

      public a(kf $$0, dzn $$1, dig $$2, eec $$3, esm $$4, long $$5, dgg $$6, dhb $$7, Predicate<jr<dic>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static een a(long $$0, dgg $$1) {
         een $$2 = new een(new edp(0L));
         $$2.c($$0, $$1.h, $$1.i);
         return $$2;
      }
   }

   public static record b(ji a, Either<Consumer<epb>, epb> b) {
      public b(ji $$0, Consumer<epb> $$1) {
         this($$0, Either.left($$1));
      }

      public epb a() {
         return (epb)this.b.map($$0 -> {
            epb $$1 = new epb();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public ji b() {
         return this.a;
      }

      public Either<Consumer<epb>, epb> c() {
         return this.b;
      }
   }

   public static record c(jv<dic> b, Map<bwb, eoq> c, edk.a d, eou e) {
      static final eoj.c f = new eoj.c(jv.a(), Map.of(), edk.a.e, eou.a);
      public static final MapCodec<eoj.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  kg.a(mc.aJ).fieldOf("biomes").forGetter(eoj.c::a),
                  Codec.simpleMap(bwb.i, eoq.a, azv.a(bwb.values())).fieldOf("spawn_overrides").forGetter(eoj.c::b),
                  edk.a.l.fieldOf("step").forGetter(eoj.c::c),
                  eou.f.optionalFieldOf("terrain_adaptation", f.e).forGetter(eoj.c::d)
               )
               .apply($$0, eoj.c::new)
      );

      public c(jv<dic> $$0) {
         this($$0, f.c, f.d, f.e);
      }

      public jv<dic> a() {
         return this.b;
      }

      public Map<bwb, eoq> b() {
         return this.c;
      }

      public edk.a c() {
         return this.d;
      }

      public eou d() {
         return this.e;
      }

      public static class a {
         private final jv<dic> a;
         private Map<bwb, eoq> b = eoj.c.f.c;
         private edk.a c = eoj.c.f.d;
         private eou d = eoj.c.f.e;

         public a(jv<dic> $$0) {
            this.a = $$0;
         }

         public eoj.c.a a(Map<bwb, eoq> $$0) {
            this.b = $$0;
            return this;
         }

         public eoj.c.a a(edk.a $$0) {
            this.c = $$0;
            return this;
         }

         public eoj.c.a a(eou $$0) {
            this.d = $$0;
            return this;
         }

         public eoj.c a() {
            return new eoj.c(this.a, this.b, this.c, this.d);
         }
      }
   }
}
