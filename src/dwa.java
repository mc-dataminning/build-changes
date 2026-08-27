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

public abstract class dwa {
   public static final Codec<dwa> a = jy.U.q().dispatch(dwa::e, dwj::codec);
   public static final Codec<ib<dwa>> b = afs.a(jz.aA, a);
   protected final dwa.c c;

   public static <S extends dwa> RecordCodecBuilder<S, dwa.c> a(Instance<S> $$0) {
      return dwa.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends dwa> Codec<S> a(Function<dwa.c, S> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected dwa(dwa.c $$0) {
      this.c = $$0;
   }

   public ig<crx> a() {
      return this.c.b;
   }

   public Map<bkm, dwh> b() {
      return this.c.c;
   }

   public dlg.b c() {
      return this.c.d;
   }

   public dwl d() {
      return this.c.e;
   }

   public dvs a(dvs $$0) {
      return this.d() != dwl.a ? $$0.a(12) : $$0;
   }

   public dwi a(ip $$0, dhy $$1, csb $$2, dly $$3, dzu $$4, long $$5, cqg $$6, int $$7, crb $$8, Predicate<ib<crx>> $$9) {
      dwa.a $$10 = new dwa.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<dwa.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         dws $$12 = $$11.get().a();
         dwi $$13 = new dwi(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return dwi.b;
   }

   protected static Optional<dwa.b> a(dwa.a $$0, dlk.a $$1, Consumer<dws> $$2) {
      cqg $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new dwa.b(new ht($$4, $$6, $$5), $$2));
   }

   private static boolean a(dwa.b $$0, dwa.a $$1) {
      ht $$2 = $$0.b();
      return $$1.j.test($$1.b.c().getNoiseBiome(in.a($$2.u()), in.a($$2.v()), in.a($$2.w()), $$1.d.b()));
   }

   public void a(crt $$0, crr $$1, dhy $$2, ate $$3, dvs $$4, cqg $$5, dwp $$6) {
   }

   private static int[] b(dwa.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dhy $$5 = $$0.b();
      crb $$6 = $$0.i();
      dly $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, dlk.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, dlk.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, dlk.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, dlk.a.a, $$6, $$7)
      };
   }

   protected static int a(dwa.a $$0, int $$1, int $$2) {
      cqg $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return a($$0, $$4, $$5, $$1, $$2);
   }

   protected static int a(dwa.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = b($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected ht a(dwa.a $$0, dal $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dal.b) {
         $$2 = -5;
      } else if ($$1 == dal.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dal.d) {
         $$3 = -5;
      }

      cqg $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new ht($$5, a($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<dwa.b> a(dwa.a var1);

   public Optional<dwa.b> b(dwa.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract dwj<?> e();

   public static record a(ip a, dhy b, csb c, dly d, dzu e, dmj f, long g, cqg h, crb i, Predicate<ib<crx>> j) {

      public a(ip $$0, dhy $$1, csb $$2, dly $$3, dzu $$4, long $$5, cqg $$6, crb $$7, Predicate<ib<crx>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static dmj a(long $$0, cqg $$1) {
         dmj $$2 = new dmj(new dll(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(ht a, Either<Consumer<dws>, dws> b) {
      public b(ht $$0, Consumer<dws> $$1) {
         this($$0, Either.left($$1));
      }

      public dws a() {
         return (dws)this.b.map($$0 -> {
            dws $$1 = new dws();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public ht b() {
         return this.a;
      }

      public Either<Consumer<dws>, dws> c() {
         return this.b;
      }
   }

   public static record c(ig<crx> b, Map<bkm, dwh> c, dlg.b d, dwl e) {
      public static final MapCodec<dwa.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  iq.a(jz.aq).fieldOf("biomes").forGetter(dwa.c::a),
                  Codec.simpleMap(bkm.i, dwh.a, atr.a(bkm.values())).fieldOf("spawn_overrides").forGetter(dwa.c::b),
                  dlg.b.l.fieldOf("step").forGetter(dwa.c::c),
                  dwl.e.optionalFieldOf("terrain_adaptation", dwl.a).forGetter(dwa.c::d)
               )
               .apply($$0, dwa.c::new)
      );

      public ig<crx> a() {
         return this.b;
      }

      public Map<bkm, dwh> b() {
         return this.c;
      }

      public dlg.b c() {
         return this.d;
      }

      public dwl d() {
         return this.e;
      }
   }
}
