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

public abstract class eij {
   public static final Codec<eij> a = lp.T.q().dispatch(eij::e, eis::codec);
   public static final Codec<ji<eij>> b = ala.a(lq.aJ, a);
   protected final eij.c c;

   public static <S extends eij> RecordCodecBuilder<S, eij.c> a(Instance<S> $$0) {
      return eij.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends eij> MapCodec<S> a(Function<eij.c, S> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected eij(eij.c $$0) {
      this.c = $$0;
   }

   public jm<dcw> a() {
      return this.c.b;
   }

   public Map<btr, eiq> b() {
      return this.c.c;
   }

   public dxp.b c() {
      return this.c.d;
   }

   public eiu d() {
      return this.c.e;
   }

   public eib a(eib $$0) {
      return this.d() != eiu.a ? $$0.a(12) : $$0;
   }

   public eir a(jw $$0, dty $$1, dda $$2, dyh $$3, emk $$4, long $$5, dbe $$6, int $$7, dbz $$8, Predicate<ji<dcw>> $$9) {
      eij.a $$10 = new eij.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<eij.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         ejb $$12 = $$11.get().a();
         eir $$13 = new eir(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return eir.b;
   }

   protected static Optional<eij.b> a(eij.a $$0, dxt.a $$1, Consumer<ejb> $$2) {
      dbe $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new eij.b(new iz($$4, $$6, $$5), $$2));
   }

   private static boolean a(eij.b $$0, eij.a $$1) {
      iz $$2 = $$0.b();
      return $$1.j.test($$1.b.d().getNoiseBiome(jt.a($$2.u()), jt.a($$2.v()), jt.a($$2.w()), $$1.d.b()));
   }

   public void a(dcs $$0, dcq $$1, dty $$2, azg $$3, eib $$4, dbe $$5, eiy $$6) {
   }

   private static int[] c(eij.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dty $$5 = $$0.b();
      dbz $$6 = $$0.i();
      dyh $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, dxt.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, dxt.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, dxt.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, dxt.a.a, $$6, $$7)
      };
   }

   public static int a(eij.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$2, $$3, $$4);
      return ($$5[0] + $$5[1] + $$5[2] + $$5[3]) / 4;
   }

   protected static int a(eij.a $$0, int $$1, int $$2) {
      dbe $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return b($$0, $$4, $$5, $$1, $$2);
   }

   protected static int b(eij.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected iz a(eij.a $$0, dll $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dll.b) {
         $$2 = -5;
      } else if ($$1 == dll.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dll.d) {
         $$3 = -5;
      }

      dbe $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new iz($$5, b($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<eij.b> a(eij.a var1);

   public Optional<eij.b> b(eij.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract eis<?> e();

   public static record a(jw a, dty b, dda c, dyh d, emk e, dys f, long g, dbe h, dbz i, Predicate<ji<dcw>> j) {

      public a(jw $$0, dty $$1, dda $$2, dyh $$3, emk $$4, long $$5, dbe $$6, dbz $$7, Predicate<ji<dcw>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static dys a(long $$0, dbe $$1) {
         dys $$2 = new dys(new dxu(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(iz a, Either<Consumer<ejb>, ejb> b) {
      public b(iz $$0, Consumer<ejb> $$1) {
         this($$0, Either.left($$1));
      }

      public ejb a() {
         return (ejb)this.b.map($$0 -> {
            ejb $$1 = new ejb();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public iz b() {
         return this.a;
      }

      public Either<Consumer<ejb>, ejb> c() {
         return this.b;
      }
   }

   public static record c(jm<dcw> b, Map<btr, eiq> c, dxp.b d, eiu e) {
      public static final MapCodec<eij.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  jx.a(lq.az).fieldOf("biomes").forGetter(eij.c::a),
                  Codec.simpleMap(btr.i, eiq.a, azt.a(btr.values())).fieldOf("spawn_overrides").forGetter(eij.c::b),
                  dxp.b.l.fieldOf("step").forGetter(eij.c::c),
                  eiu.f.optionalFieldOf("terrain_adaptation", eiu.a).forGetter(eij.c::d)
               )
               .apply($$0, eij.c::new)
      );

      public jm<dcw> a() {
         return this.b;
      }

      public Map<btr, eiq> b() {
         return this.c;
      }

      public dxp.b c() {
         return this.d;
      }

      public eiu d() {
         return this.e;
      }
   }
}
