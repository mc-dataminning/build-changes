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

public abstract class egp {
   public static final Codec<egp> a = ld.T.q().dispatch(egp::e, egy::codec);
   public static final Codec<iw<egp>> b = akd.a(le.aJ, a);
   protected final egp.c c;

   public static <S extends egp> RecordCodecBuilder<S, egp.c> a(Instance<S> $$0) {
      return egp.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends egp> Codec<S> a(Function<egp.c, S> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected egp(egp.c $$0) {
      this.c = $$0;
   }

   public ja<dbc> a() {
      return this.c.b;
   }

   public Map<bsd, egw> b() {
      return this.c.c;
   }

   public dvv.b c() {
      return this.c.d;
   }

   public eha d() {
      return this.c.e;
   }

   public egh a(egh $$0) {
      return this.d() != eha.a ? $$0.a(12) : $$0;
   }

   public egx a(jk $$0, dse $$1, dbg $$2, dwn $$3, ekq $$4, long $$5, czk $$6, int $$7, daf $$8, Predicate<iw<dbc>> $$9) {
      egp.a $$10 = new egp.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<egp.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         ehh $$12 = $$11.get().a();
         egx $$13 = new egx(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return egx.b;
   }

   protected static Optional<egp.b> a(egp.a $$0, dvz.a $$1, Consumer<ehh> $$2) {
      czk $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new egp.b(new in($$4, $$6, $$5), $$2));
   }

   private static boolean a(egp.b $$0, egp.a $$1) {
      in $$2 = $$0.b();
      return $$1.j.test($$1.b.c().getNoiseBiome(jh.a($$2.u()), jh.a($$2.v()), jh.a($$2.w()), $$1.d.b()));
   }

   public void a(day $$0, daw $$1, dse $$2, ayg $$3, egh $$4, czk $$5, ehe $$6) {
   }

   private static int[] b(egp.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dse $$5 = $$0.b();
      daf $$6 = $$0.i();
      dwn $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, dvz.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, dvz.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, dvz.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, dvz.a.a, $$6, $$7)
      };
   }

   protected static int a(egp.a $$0, int $$1, int $$2) {
      czk $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return a($$0, $$4, $$5, $$1, $$2);
   }

   protected static int a(egp.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = b($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected in a(egp.a $$0, djr $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == djr.b) {
         $$2 = -5;
      } else if ($$1 == djr.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == djr.d) {
         $$3 = -5;
      }

      czk $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new in($$5, a($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<egp.b> a(egp.a var1);

   public Optional<egp.b> b(egp.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract egy<?> e();

   public static record a(jk a, dse b, dbg c, dwn d, ekq e, dwy f, long g, czk h, daf i, Predicate<iw<dbc>> j) {

      public a(jk $$0, dse $$1, dbg $$2, dwn $$3, ekq $$4, long $$5, czk $$6, daf $$7, Predicate<iw<dbc>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static dwy a(long $$0, czk $$1) {
         dwy $$2 = new dwy(new dwa(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(in a, Either<Consumer<ehh>, ehh> b) {
      public b(in $$0, Consumer<ehh> $$1) {
         this($$0, Either.left($$1));
      }

      public ehh a() {
         return (ehh)this.b.map($$0 -> {
            ehh $$1 = new ehh();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public in b() {
         return this.a;
      }

      public Either<Consumer<ehh>, ehh> c() {
         return this.b;
      }
   }

   public static record c(ja<dbc> b, Map<bsd, egw> c, dvv.b d, eha e) {
      public static final MapCodec<egp.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  jl.a(le.az).fieldOf("biomes").forGetter(egp.c::a),
                  Codec.simpleMap(bsd.i, egw.a, ayt.a(bsd.values())).fieldOf("spawn_overrides").forGetter(egp.c::b),
                  dvv.b.l.fieldOf("step").forGetter(egp.c::c),
                  eha.e.optionalFieldOf("terrain_adaptation", eha.a).forGetter(egp.c::d)
               )
               .apply($$0, egp.c::new)
      );

      public ja<dbc> a() {
         return this.b;
      }

      public Map<bsd, egw> b() {
         return this.c;
      }

      public dvv.b c() {
         return this.d;
      }

      public eha d() {
         return this.e;
      }
   }
}
