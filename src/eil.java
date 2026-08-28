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

public abstract class eil {
   public static final Codec<eil> a = lp.T.q().dispatch(eil::e, eiu::codec);
   public static final Codec<ji<eil>> b = alb.a(lq.aJ, a);
   protected final eil.c c;

   public static <S extends eil> RecordCodecBuilder<S, eil.c> a(Instance<S> $$0) {
      return eil.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends eil> MapCodec<S> a(Function<eil.c, S> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected eil(eil.c $$0) {
      this.c = $$0;
   }

   public jm<dcy> a() {
      return this.c.b;
   }

   public Map<btt, eis> b() {
      return this.c.c;
   }

   public dxr.b c() {
      return this.c.d;
   }

   public eiw d() {
      return this.c.e;
   }

   public eid a(eid $$0) {
      return this.d() != eiw.a ? $$0.a(12) : $$0;
   }

   public eit a(jw $$0, dua $$1, ddc $$2, dyj $$3, emm $$4, long $$5, dbg $$6, int $$7, dcb $$8, Predicate<ji<dcy>> $$9) {
      eil.a $$10 = new eil.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<eil.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         ejd $$12 = $$11.get().a();
         eit $$13 = new eit(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return eit.b;
   }

   protected static Optional<eil.b> a(eil.a $$0, dxv.a $$1, Consumer<ejd> $$2) {
      dbg $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new eil.b(new iz($$4, $$6, $$5), $$2));
   }

   private static boolean a(eil.b $$0, eil.a $$1) {
      iz $$2 = $$0.b();
      return $$1.j.test($$1.b.d().getNoiseBiome(jt.a($$2.u()), jt.a($$2.v()), jt.a($$2.w()), $$1.d.b()));
   }

   public void a(dcu $$0, dcs $$1, dua $$2, azh $$3, eid $$4, dbg $$5, eja $$6) {
   }

   private static int[] c(eil.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dua $$5 = $$0.b();
      dcb $$6 = $$0.i();
      dyj $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, dxv.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, dxv.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, dxv.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, dxv.a.a, $$6, $$7)
      };
   }

   public static int a(eil.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$2, $$3, $$4);
      return ($$5[0] + $$5[1] + $$5[2] + $$5[3]) / 4;
   }

   protected static int a(eil.a $$0, int $$1, int $$2) {
      dbg $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return b($$0, $$4, $$5, $$1, $$2);
   }

   protected static int b(eil.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected iz a(eil.a $$0, dln $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dln.b) {
         $$2 = -5;
      } else if ($$1 == dln.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dln.d) {
         $$3 = -5;
      }

      dbg $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new iz($$5, b($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<eil.b> a(eil.a var1);

   public Optional<eil.b> b(eil.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract eiu<?> e();

   public static record a(jw a, dua b, ddc c, dyj d, emm e, dyu f, long g, dbg h, dcb i, Predicate<ji<dcy>> j) {

      public a(jw $$0, dua $$1, ddc $$2, dyj $$3, emm $$4, long $$5, dbg $$6, dcb $$7, Predicate<ji<dcy>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static dyu a(long $$0, dbg $$1) {
         dyu $$2 = new dyu(new dxw(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(iz a, Either<Consumer<ejd>, ejd> b) {
      public b(iz $$0, Consumer<ejd> $$1) {
         this($$0, Either.left($$1));
      }

      public ejd a() {
         return (ejd)this.b.map($$0 -> {
            ejd $$1 = new ejd();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public iz b() {
         return this.a;
      }

      public Either<Consumer<ejd>, ejd> c() {
         return this.b;
      }
   }

   public static record c(jm<dcy> b, Map<btt, eis> c, dxr.b d, eiw e) {
      public static final MapCodec<eil.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  jx.a(lq.az).fieldOf("biomes").forGetter(eil.c::a),
                  Codec.simpleMap(btt.i, eis.a, azu.a(btt.values())).fieldOf("spawn_overrides").forGetter(eil.c::b),
                  dxr.b.l.fieldOf("step").forGetter(eil.c::c),
                  eiw.f.optionalFieldOf("terrain_adaptation", eiw.a).forGetter(eil.c::d)
               )
               .apply($$0, eil.c::new)
      );

      public jm<dcy> a() {
         return this.b;
      }

      public Map<btt, eis> b() {
         return this.c;
      }

      public dxr.b c() {
         return this.d;
      }

      public eiw d() {
         return this.e;
      }
   }
}
