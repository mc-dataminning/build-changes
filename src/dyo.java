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

public abstract class dyo {
   public static final Codec<dyo> a = kb.T.q().dispatch(dyo::e, dyx::codec);
   public static final Codec<ie<dyo>> b = agp.a(kc.aC, a);
   protected final dyo.c c;

   public static <S extends dyo> RecordCodecBuilder<S, dyo.c> a(Instance<S> $$0) {
      return dyo.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends dyo> Codec<S> a(Function<dyo.c, S> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected dyo(dyo.c $$0) {
      this.c = $$0;
   }

   public ij<ctx> a() {
      return this.c.b;
   }

   public Map<bly, dyv> b() {
      return this.c.c;
   }

   public dnu.b c() {
      return this.c.d;
   }

   public dyz d() {
      return this.c.e;
   }

   public dyg a(dyg $$0) {
      return this.d() != dyz.a ? $$0.a(12) : $$0;
   }

   public dyw a(is $$0, dkm $$1, cub $$2, dom $$3, ecp $$4, long $$5, csf $$6, int $$7, cta $$8, Predicate<ie<ctx>> $$9) {
      dyo.a $$10 = new dyo.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<dyo.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         dzg $$12 = $$11.get().a();
         dyw $$13 = new dyw(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return dyw.b;
   }

   protected static Optional<dyo.b> a(dyo.a $$0, dny.a $$1, Consumer<dzg> $$2) {
      csf $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new dyo.b(new hv($$4, $$6, $$5), $$2));
   }

   private static boolean a(dyo.b $$0, dyo.a $$1) {
      hv $$2 = $$0.b();
      return $$1.j.test($$1.b.c().getNoiseBiome(iq.a($$2.u()), iq.a($$2.v()), iq.a($$2.w()), $$1.d.b()));
   }

   public void a(ctt $$0, ctr $$1, dkm $$2, auf $$3, dyg $$4, csf $$5, dzd $$6) {
   }

   private static int[] b(dyo.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dkm $$5 = $$0.b();
      cta $$6 = $$0.i();
      dom $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, dny.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, dny.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, dny.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, dny.a.a, $$6, $$7)
      };
   }

   protected static int a(dyo.a $$0, int $$1, int $$2) {
      csf $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return a($$0, $$4, $$5, $$1, $$2);
   }

   protected static int a(dyo.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = b($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected hv a(dyo.a $$0, dcl $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dcl.b) {
         $$2 = -5;
      } else if ($$1 == dcl.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dcl.d) {
         $$3 = -5;
      }

      csf $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new hv($$5, a($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<dyo.b> a(dyo.a var1);

   public Optional<dyo.b> b(dyo.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract dyx<?> e();

   public static record a(is a, dkm b, cub c, dom d, ecp e, dox f, long g, csf h, cta i, Predicate<ie<ctx>> j) {

      public a(is $$0, dkm $$1, cub $$2, dom $$3, ecp $$4, long $$5, csf $$6, cta $$7, Predicate<ie<ctx>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static dox a(long $$0, csf $$1) {
         dox $$2 = new dox(new dnz(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(hv a, Either<Consumer<dzg>, dzg> b) {
      public b(hv $$0, Consumer<dzg> $$1) {
         this($$0, Either.left($$1));
      }

      public dzg a() {
         return (dzg)this.b.map($$0 -> {
            dzg $$1 = new dzg();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public hv b() {
         return this.a;
      }

      public Either<Consumer<dzg>, dzg> c() {
         return this.b;
      }
   }

   public static record c(ij<ctx> b, Map<bly, dyv> c, dnu.b d, dyz e) {
      public static final MapCodec<dyo.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  it.a(kc.as).fieldOf("biomes").forGetter(dyo.c::a),
                  Codec.simpleMap(bly.i, dyv.a, aut.a(bly.values())).fieldOf("spawn_overrides").forGetter(dyo.c::b),
                  dnu.b.l.fieldOf("step").forGetter(dyo.c::c),
                  dyz.e.optionalFieldOf("terrain_adaptation", dyz.a).forGetter(dyo.c::d)
               )
               .apply($$0, dyo.c::new)
      );

      public ij<ctx> a() {
         return this.b;
      }

      public Map<bly, dyv> b() {
         return this.c;
      }

      public dnu.b c() {
         return this.d;
      }

      public dyz d() {
         return this.e;
      }
   }
}
