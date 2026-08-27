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

public abstract class egg {
   public static final Codec<egg> a = lc.T.q().dispatch(egg::e, egp::codec);
   public static final Codec<iv<egg>> b = akb.a(ld.aI, a);
   protected final egg.c c;

   public static <S extends egg> RecordCodecBuilder<S, egg.c> a(Instance<S> $$0) {
      return egg.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends egg> Codec<S> a(Function<egg.c, S> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected egg(egg.c $$0) {
      this.c = $$0;
   }

   public iz<dat> a() {
      return this.c.b;
   }

   public Map<brh, egn> b() {
      return this.c.c;
   }

   public dvm.b c() {
      return this.c.d;
   }

   public egr d() {
      return this.c.e;
   }

   public efy a(efy $$0) {
      return this.d() != egr.a ? $$0.a(12) : $$0;
   }

   public ego a(jj $$0, drv $$1, dax $$2, dwe $$3, ekh $$4, long $$5, czb $$6, int $$7, czw $$8, Predicate<iv<dat>> $$9) {
      egg.a $$10 = new egg.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<egg.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         egy $$12 = $$11.get().a();
         ego $$13 = new ego(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return ego.b;
   }

   protected static Optional<egg.b> a(egg.a $$0, dvq.a $$1, Consumer<egy> $$2) {
      czb $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new egg.b(new im($$4, $$6, $$5), $$2));
   }

   private static boolean a(egg.b $$0, egg.a $$1) {
      im $$2 = $$0.b();
      return $$1.j.test($$1.b.c().getNoiseBiome(jg.a($$2.u()), jg.a($$2.v()), jg.a($$2.w()), $$1.d.b()));
   }

   public void a(dap $$0, dan $$1, drv $$2, ayd $$3, efy $$4, czb $$5, egv $$6) {
   }

   private static int[] b(egg.a $$0, int $$1, int $$2, int $$3, int $$4) {
      drv $$5 = $$0.b();
      czw $$6 = $$0.i();
      dwe $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, dvq.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, dvq.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, dvq.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, dvq.a.a, $$6, $$7)
      };
   }

   protected static int a(egg.a $$0, int $$1, int $$2) {
      czb $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return a($$0, $$4, $$5, $$1, $$2);
   }

   protected static int a(egg.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = b($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected im a(egg.a $$0, dji $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dji.b) {
         $$2 = -5;
      } else if ($$1 == dji.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dji.d) {
         $$3 = -5;
      }

      czb $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new im($$5, a($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<egg.b> a(egg.a var1);

   public Optional<egg.b> b(egg.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract egp<?> e();

   public static record a(jj a, drv b, dax c, dwe d, ekh e, dwp f, long g, czb h, czw i, Predicate<iv<dat>> j) {

      public a(jj $$0, drv $$1, dax $$2, dwe $$3, ekh $$4, long $$5, czb $$6, czw $$7, Predicate<iv<dat>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static dwp a(long $$0, czb $$1) {
         dwp $$2 = new dwp(new dvr(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(im a, Either<Consumer<egy>, egy> b) {
      public b(im $$0, Consumer<egy> $$1) {
         this($$0, Either.left($$1));
      }

      public egy a() {
         return (egy)this.b.map($$0 -> {
            egy $$1 = new egy();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public im b() {
         return this.a;
      }

      public Either<Consumer<egy>, egy> c() {
         return this.b;
      }
   }

   public static record c(iz<dat> b, Map<brh, egn> c, dvm.b d, egr e) {
      public static final MapCodec<egg.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  jk.a(ld.ay).fieldOf("biomes").forGetter(egg.c::a),
                  Codec.simpleMap(brh.i, egn.a, ayq.a(brh.values())).fieldOf("spawn_overrides").forGetter(egg.c::b),
                  dvm.b.l.fieldOf("step").forGetter(egg.c::c),
                  egr.e.optionalFieldOf("terrain_adaptation", egr.a).forGetter(egg.c::d)
               )
               .apply($$0, egg.c::new)
      );

      public iz<dat> a() {
         return this.b;
      }

      public Map<brh, egn> b() {
         return this.c;
      }

      public dvm.b c() {
         return this.d;
      }

      public egr d() {
         return this.e;
      }
   }
}
