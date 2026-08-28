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

public abstract class eim {
   public static final Codec<eim> a = lp.T.q().dispatch(eim::e, eiv::codec);
   public static final Codec<ji<eim>> b = alb.a(lq.aJ, a);
   protected final eim.c c;

   public static <S extends eim> RecordCodecBuilder<S, eim.c> a(Instance<S> $$0) {
      return eim.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends eim> MapCodec<S> a(Function<eim.c, S> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected eim(eim.c $$0) {
      this.c = $$0;
   }

   public jm<dcz> a() {
      return this.c.b;
   }

   public Map<btu, eit> b() {
      return this.c.c;
   }

   public dxs.b c() {
      return this.c.d;
   }

   public eix d() {
      return this.c.e;
   }

   public eie a(eie $$0) {
      return this.d() != eix.a ? $$0.a(12) : $$0;
   }

   public eiu a(jw $$0, dub $$1, ddd $$2, dyk $$3, emn $$4, long $$5, dbh $$6, int $$7, dcc $$8, Predicate<ji<dcz>> $$9) {
      eim.a $$10 = new eim.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<eim.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         eje $$12 = $$11.get().a();
         eiu $$13 = new eiu(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return eiu.b;
   }

   protected static Optional<eim.b> a(eim.a $$0, dxw.a $$1, Consumer<eje> $$2) {
      dbh $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new eim.b(new iz($$4, $$6, $$5), $$2));
   }

   private static boolean a(eim.b $$0, eim.a $$1) {
      iz $$2 = $$0.b();
      return $$1.j.test($$1.b.d().getNoiseBiome(jt.a($$2.u()), jt.a($$2.v()), jt.a($$2.w()), $$1.d.b()));
   }

   public void a(dcv $$0, dct $$1, dub $$2, azh $$3, eie $$4, dbh $$5, ejb $$6) {
   }

   private static int[] c(eim.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dub $$5 = $$0.b();
      dcc $$6 = $$0.i();
      dyk $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, dxw.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, dxw.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, dxw.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, dxw.a.a, $$6, $$7)
      };
   }

   public static int a(eim.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$2, $$3, $$4);
      return ($$5[0] + $$5[1] + $$5[2] + $$5[3]) / 4;
   }

   protected static int a(eim.a $$0, int $$1, int $$2) {
      dbh $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return b($$0, $$4, $$5, $$1, $$2);
   }

   protected static int b(eim.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected iz a(eim.a $$0, dlo $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dlo.b) {
         $$2 = -5;
      } else if ($$1 == dlo.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dlo.d) {
         $$3 = -5;
      }

      dbh $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new iz($$5, b($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<eim.b> a(eim.a var1);

   public Optional<eim.b> b(eim.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract eiv<?> e();

   public static record a(jw a, dub b, ddd c, dyk d, emn e, dyv f, long g, dbh h, dcc i, Predicate<ji<dcz>> j) {

      public a(jw $$0, dub $$1, ddd $$2, dyk $$3, emn $$4, long $$5, dbh $$6, dcc $$7, Predicate<ji<dcz>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static dyv a(long $$0, dbh $$1) {
         dyv $$2 = new dyv(new dxx(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(iz a, Either<Consumer<eje>, eje> b) {
      public b(iz $$0, Consumer<eje> $$1) {
         this($$0, Either.left($$1));
      }

      public eje a() {
         return (eje)this.b.map($$0 -> {
            eje $$1 = new eje();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public iz b() {
         return this.a;
      }

      public Either<Consumer<eje>, eje> c() {
         return this.b;
      }
   }

   public static record c(jm<dcz> b, Map<btu, eit> c, dxs.b d, eix e) {
      public static final MapCodec<eim.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  jx.a(lq.az).fieldOf("biomes").forGetter(eim.c::a),
                  Codec.simpleMap(btu.i, eit.a, azu.a(btu.values())).fieldOf("spawn_overrides").forGetter(eim.c::b),
                  dxs.b.l.fieldOf("step").forGetter(eim.c::c),
                  eix.f.optionalFieldOf("terrain_adaptation", eix.a).forGetter(eim.c::d)
               )
               .apply($$0, eim.c::new)
      );

      public jm<dcz> a() {
         return this.b;
      }

      public Map<btu, eit> b() {
         return this.c;
      }

      public dxs.b c() {
         return this.d;
      }

      public eix d() {
         return this.e;
      }
   }
}
