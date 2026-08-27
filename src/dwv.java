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

public abstract class dwv {
   public static final Codec<dwv> a = jy.U.q().dispatch(dwv::e, dxe::codec);
   public static final Codec<ib<dwv>> b = agc.a(jz.aB, a);
   protected final dwv.c c;

   public static <S extends dwv> RecordCodecBuilder<S, dwv.c> a(Instance<S> $$0) {
      return dwv.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends dwv> Codec<S> a(Function<dwv.c, S> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected dwv(dwv.c $$0) {
      this.c = $$0;
   }

   public ig<csq> a() {
      return this.c.b;
   }

   public Map<blb, dxc> b() {
      return this.c.c;
   }

   public dmb.b c() {
      return this.c.d;
   }

   public dxg d() {
      return this.c.e;
   }

   public dwn a(dwn $$0) {
      return this.d() != dxg.a ? $$0.a(12) : $$0;
   }

   public dxd a(ip $$0, dit $$1, csu $$2, dmt $$3, eaw $$4, long $$5, cqz $$6, int $$7, cru $$8, Predicate<ib<csq>> $$9) {
      dwv.a $$10 = new dwv.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<dwv.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         dxn $$12 = $$11.get().a();
         dxd $$13 = new dxd(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return dxd.b;
   }

   protected static Optional<dwv.b> a(dwv.a $$0, dmf.a $$1, Consumer<dxn> $$2) {
      cqz $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new dwv.b(new ht($$4, $$6, $$5), $$2));
   }

   private static boolean a(dwv.b $$0, dwv.a $$1) {
      ht $$2 = $$0.b();
      return $$1.j.test($$1.b.c().getNoiseBiome(in.a($$2.u()), in.a($$2.v()), in.a($$2.w()), $$1.d.b()));
   }

   public void a(csm $$0, csk $$1, dit $$2, ato $$3, dwn $$4, cqz $$5, dxk $$6) {
   }

   private static int[] b(dwv.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dit $$5 = $$0.b();
      cru $$6 = $$0.i();
      dmt $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, dmf.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, dmf.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, dmf.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, dmf.a.a, $$6, $$7)
      };
   }

   protected static int a(dwv.a $$0, int $$1, int $$2) {
      cqz $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return a($$0, $$4, $$5, $$1, $$2);
   }

   protected static int a(dwv.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = b($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected ht a(dwv.a $$0, dbf $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dbf.b) {
         $$2 = -5;
      } else if ($$1 == dbf.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dbf.d) {
         $$3 = -5;
      }

      cqz $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new ht($$5, a($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<dwv.b> a(dwv.a var1);

   public Optional<dwv.b> b(dwv.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract dxe<?> e();

   public static record a(ip a, dit b, csu c, dmt d, eaw e, dne f, long g, cqz h, cru i, Predicate<ib<csq>> j) {

      public a(ip $$0, dit $$1, csu $$2, dmt $$3, eaw $$4, long $$5, cqz $$6, cru $$7, Predicate<ib<csq>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static dne a(long $$0, cqz $$1) {
         dne $$2 = new dne(new dmg(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(ht a, Either<Consumer<dxn>, dxn> b) {
      public b(ht $$0, Consumer<dxn> $$1) {
         this($$0, Either.left($$1));
      }

      public dxn a() {
         return (dxn)this.b.map($$0 -> {
            dxn $$1 = new dxn();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public ht b() {
         return this.a;
      }

      public Either<Consumer<dxn>, dxn> c() {
         return this.b;
      }
   }

   public static record c(ig<csq> b, Map<blb, dxc> c, dmb.b d, dxg e) {
      public static final MapCodec<dwv.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  iq.a(jz.ar).fieldOf("biomes").forGetter(dwv.c::a),
                  Codec.simpleMap(blb.i, dxc.a, aub.a(blb.values())).fieldOf("spawn_overrides").forGetter(dwv.c::b),
                  dmb.b.l.fieldOf("step").forGetter(dwv.c::c),
                  dxg.e.optionalFieldOf("terrain_adaptation", dxg.a).forGetter(dwv.c::d)
               )
               .apply($$0, dwv.c::new)
      );

      public ig<csq> a() {
         return this.b;
      }

      public Map<blb, dxc> b() {
         return this.c;
      }

      public dmb.b c() {
         return this.d;
      }

      public dxg d() {
         return this.e;
      }
   }
}
