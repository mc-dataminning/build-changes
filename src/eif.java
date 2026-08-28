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

public abstract class eif {
   public static final Codec<eif> a = lp.T.q().dispatch(eif::e, eio::codec);
   public static final Codec<ji<eif>> b = akx.a(lq.aJ, a);
   protected final eif.c c;

   public static <S extends eif> RecordCodecBuilder<S, eif.c> a(Instance<S> $$0) {
      return eif.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends eif> MapCodec<S> a(Function<eif.c, S> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected eif(eif.c $$0) {
      this.c = $$0;
   }

   public jm<dcs> a() {
      return this.c.b;
   }

   public Map<btn, eim> b() {
      return this.c.c;
   }

   public dxl.b c() {
      return this.c.d;
   }

   public eiq d() {
      return this.c.e;
   }

   public ehx a(ehx $$0) {
      return this.d() != eiq.a ? $$0.a(12) : $$0;
   }

   public ein a(jw $$0, dtu $$1, dcw $$2, dyd $$3, emg $$4, long $$5, dba $$6, int $$7, dbv $$8, Predicate<ji<dcs>> $$9) {
      eif.a $$10 = new eif.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<eif.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         eix $$12 = $$11.get().a();
         ein $$13 = new ein(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return ein.b;
   }

   protected static Optional<eif.b> a(eif.a $$0, dxp.a $$1, Consumer<eix> $$2) {
      dba $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new eif.b(new iz($$4, $$6, $$5), $$2));
   }

   private static boolean a(eif.b $$0, eif.a $$1) {
      iz $$2 = $$0.b();
      return $$1.j.test($$1.b.c().getNoiseBiome(jt.a($$2.u()), jt.a($$2.v()), jt.a($$2.w()), $$1.d.b()));
   }

   public void a(dco $$0, dcm $$1, dtu $$2, azc $$3, ehx $$4, dba $$5, eiu $$6) {
   }

   private static int[] b(eif.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dtu $$5 = $$0.b();
      dbv $$6 = $$0.i();
      dyd $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, dxp.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, dxp.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, dxp.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, dxp.a.a, $$6, $$7)
      };
   }

   protected static int a(eif.a $$0, int $$1, int $$2) {
      dba $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return a($$0, $$4, $$5, $$1, $$2);
   }

   protected static int a(eif.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = b($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected iz a(eif.a $$0, dlh $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dlh.b) {
         $$2 = -5;
      } else if ($$1 == dlh.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dlh.d) {
         $$3 = -5;
      }

      dba $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new iz($$5, a($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<eif.b> a(eif.a var1);

   public Optional<eif.b> b(eif.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract eio<?> e();

   public static record a(jw a, dtu b, dcw c, dyd d, emg e, dyo f, long g, dba h, dbv i, Predicate<ji<dcs>> j) {

      public a(jw $$0, dtu $$1, dcw $$2, dyd $$3, emg $$4, long $$5, dba $$6, dbv $$7, Predicate<ji<dcs>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static dyo a(long $$0, dba $$1) {
         dyo $$2 = new dyo(new dxq(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(iz a, Either<Consumer<eix>, eix> b) {
      public b(iz $$0, Consumer<eix> $$1) {
         this($$0, Either.left($$1));
      }

      public eix a() {
         return (eix)this.b.map($$0 -> {
            eix $$1 = new eix();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public iz b() {
         return this.a;
      }

      public Either<Consumer<eix>, eix> c() {
         return this.b;
      }
   }

   public static record c(jm<dcs> b, Map<btn, eim> c, dxl.b d, eiq e) {
      public static final MapCodec<eif.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  jx.a(lq.az).fieldOf("biomes").forGetter(eif.c::a),
                  Codec.simpleMap(btn.i, eim.a, azp.a(btn.values())).fieldOf("spawn_overrides").forGetter(eif.c::b),
                  dxl.b.l.fieldOf("step").forGetter(eif.c::c),
                  eiq.f.optionalFieldOf("terrain_adaptation", eiq.a).forGetter(eif.c::d)
               )
               .apply($$0, eif.c::new)
      );

      public jm<dcs> a() {
         return this.b;
      }

      public Map<btn, eim> b() {
         return this.c;
      }

      public dxl.b c() {
         return this.d;
      }

      public eiq d() {
         return this.e;
      }
   }
}
