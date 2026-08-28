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

public abstract class enn {
   public static final Codec<enn> a = mb.R.q().dispatch(enn::e, enw::codec);
   public static final Codec<jr<enn>> b = akr.a(mc.aU, a);
   protected final enn.c c;

   public static <S extends enn> RecordCodecBuilder<S, enn.c> a(Instance<S> $$0) {
      return enn.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends enn> MapCodec<S> a(Function<enn.c, S> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected enn(enn.c $$0) {
      this.c = $$0;
   }

   public jv<dhl> a() {
      return this.c.b;
   }

   public Map<bvl, enu> b() {
      return this.c.c;
   }

   public ecp.a c() {
      return this.c.d;
   }

   public eny d() {
      return this.c.e;
   }

   public enf a(enf $$0) {
      return this.d() != eny.a ? $$0.a(12) : $$0;
   }

   public env a(jr<enn> $$0, aku<dgj> $$1, kf $$2, dyu $$3, dhp $$4, edh $$5, erq $$6, long $$7, dfp $$8, int $$9, dgl $$10, Predicate<jr<dhl>> $$11) {
      bpf $$12 = bpc.f.a($$8, $$1, $$0);
      enn.a $$13 = new enn.a($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$10, $$11);
      Optional<enn.b> $$14 = this.b($$13);
      if ($$14.isPresent()) {
         eof $$15 = $$14.get().a();
         env $$16 = new env(this, $$8, $$9, $$15.a());
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

      return env.b;
   }

   protected static Optional<enn.b> a(enn.a $$0, ect.a $$1, Consumer<eof> $$2) {
      dfp $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new enn.b(new ji($$4, $$6, $$5), $$2));
   }

   private static boolean a(enn.b $$0, enn.a $$1) {
      ji $$2 = $$0.b();
      return $$1.j.test($$1.b.d().getNoiseBiome(kc.a($$2.u()), kc.a($$2.v()), kc.a($$2.w()), $$1.d.b()));
   }

   public void a(dhh $$0, dhf $$1, dyu $$2, azh $$3, enf $$4, dfp $$5, eoc $$6) {
   }

   private static int[] c(enn.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dyu $$5 = $$0.b();
      dgl $$6 = $$0.i();
      edh $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, ect.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, ect.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, ect.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, ect.a.a, $$6, $$7)
      };
   }

   public static int a(enn.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$2, $$3, $$4);
      return ($$5[0] + $$5[1] + $$5[2] + $$5[3]) / 4;
   }

   protected static int a(enn.a $$0, int $$1, int $$2) {
      dfp $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return b($$0, $$4, $$5, $$1, $$2);
   }

   protected static int b(enn.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected ji a(enn.a $$0, dqf $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dqf.b) {
         $$2 = -5;
      } else if ($$1 == dqf.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dqf.d) {
         $$3 = -5;
      }

      dfp $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new ji($$5, b($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<enn.b> a(enn.a var1);

   public Optional<enn.b> b(enn.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract enw<?> e();

   public static record a(kf a, dyu b, dhp c, edh d, erq e, eds f, long g, dfp h, dgl i, Predicate<jr<dhl>> j) {

      public a(kf $$0, dyu $$1, dhp $$2, edh $$3, erq $$4, long $$5, dfp $$6, dgl $$7, Predicate<jr<dhl>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static eds a(long $$0, dfp $$1) {
         eds $$2 = new eds(new ecu(0L));
         $$2.c($$0, $$1.h, $$1.i);
         return $$2;
      }
   }

   public static record b(ji a, Either<Consumer<eof>, eof> b) {
      public b(ji $$0, Consumer<eof> $$1) {
         this($$0, Either.left($$1));
      }

      public eof a() {
         return (eof)this.b.map($$0 -> {
            eof $$1 = new eof();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public ji b() {
         return this.a;
      }

      public Either<Consumer<eof>, eof> c() {
         return this.b;
      }
   }

   public static record c(jv<dhl> b, Map<bvl, enu> c, ecp.a d, eny e) {
      static final enn.c f = new enn.c(jv.a(), Map.of(), ecp.a.e, eny.a);
      public static final MapCodec<enn.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  kg.a(mc.aI).fieldOf("biomes").forGetter(enn.c::a),
                  Codec.simpleMap(bvl.i, enu.a, azv.a(bvl.values())).fieldOf("spawn_overrides").forGetter(enn.c::b),
                  ecp.a.l.fieldOf("step").forGetter(enn.c::c),
                  eny.f.optionalFieldOf("terrain_adaptation", f.e).forGetter(enn.c::d)
               )
               .apply($$0, enn.c::new)
      );

      public c(jv<dhl> $$0) {
         this($$0, f.c, f.d, f.e);
      }

      public jv<dhl> a() {
         return this.b;
      }

      public Map<bvl, enu> b() {
         return this.c;
      }

      public ecp.a c() {
         return this.d;
      }

      public eny d() {
         return this.e;
      }

      public static class a {
         private final jv<dhl> a;
         private Map<bvl, enu> b = enn.c.f.c;
         private ecp.a c = enn.c.f.d;
         private eny d = enn.c.f.e;

         public a(jv<dhl> $$0) {
            this.a = $$0;
         }

         public enn.c.a a(Map<bvl, enu> $$0) {
            this.b = $$0;
            return this;
         }

         public enn.c.a a(ecp.a $$0) {
            this.c = $$0;
            return this;
         }

         public enn.c.a a(eny $$0) {
            this.d = $$0;
            return this;
         }

         public enn.c a() {
            return new enn.c(this.a, this.b, this.c, this.d);
         }
      }
   }
}
