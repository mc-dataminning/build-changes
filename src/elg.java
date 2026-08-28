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

public abstract class elg {
   public static final Codec<elg> a = lv.R.q().dispatch(elg::e, elp::codec);
   public static final Codec<jo<elg>> b = ala.a(lw.aT, a);
   protected final elg.c c;

   public static <S extends elg> RecordCodecBuilder<S, elg.c> a(Instance<S> $$0) {
      return elg.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends elg> MapCodec<S> a(Function<elg.c, S> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected elg(elg.c $$0) {
      this.c = $$0;
   }

   public js<dfk> a() {
      return this.c.b;
   }

   public Map<buq, eln> b() {
      return this.c.c;
   }

   public eak.a c() {
      return this.c.d;
   }

   public elr d() {
      return this.c.e;
   }

   public eky a(eky $$0) {
      return this.d() != elr.a ? $$0.a(12) : $$0;
   }

   public elo a(kc $$0, dwp $$1, dfo $$2, ebc $$3, epj $$4, long $$5, ddp $$6, int $$7, del $$8, Predicate<jo<dfk>> $$9) {
      elg.a $$10 = new elg.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<elg.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         ely $$12 = $$11.get().a();
         elo $$13 = new elo(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return elo.b;
   }

   protected static Optional<elg.b> a(elg.a $$0, eao.a $$1, Consumer<ely> $$2) {
      ddp $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new elg.b(new jf($$4, $$6, $$5), $$2));
   }

   private static boolean a(elg.b $$0, elg.a $$1) {
      jf $$2 = $$0.b();
      return $$1.j.test($$1.b.d().getNoiseBiome(jz.a($$2.u()), jz.a($$2.v()), jz.a($$2.w()), $$1.d.b()));
   }

   public void a(dfg $$0, dfe $$1, dwp $$2, azn $$3, eky $$4, ddp $$5, elv $$6) {
   }

   private static int[] c(elg.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dwp $$5 = $$0.b();
      del $$6 = $$0.i();
      ebc $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, eao.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, eao.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, eao.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, eao.a.a, $$6, $$7)
      };
   }

   public static int a(elg.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$2, $$3, $$4);
      return ($$5[0] + $$5[1] + $$5[2] + $$5[3]) / 4;
   }

   protected static int a(elg.a $$0, int $$1, int $$2) {
      ddp $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return b($$0, $$4, $$5, $$1, $$2);
   }

   protected static int b(elg.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected jf a(elg.a $$0, doa $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == doa.b) {
         $$2 = -5;
      } else if ($$1 == doa.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == doa.d) {
         $$3 = -5;
      }

      ddp $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new jf($$5, b($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<elg.b> a(elg.a var1);

   public Optional<elg.b> b(elg.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract elp<?> e();

   public static record a(kc a, dwp b, dfo c, ebc d, epj e, ebn f, long g, ddp h, del i, Predicate<jo<dfk>> j) {

      public a(kc $$0, dwp $$1, dfo $$2, ebc $$3, epj $$4, long $$5, ddp $$6, del $$7, Predicate<jo<dfk>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static ebn a(long $$0, ddp $$1) {
         ebn $$2 = new ebn(new eap(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(jf a, Either<Consumer<ely>, ely> b) {
      public b(jf $$0, Consumer<ely> $$1) {
         this($$0, Either.left($$1));
      }

      public ely a() {
         return (ely)this.b.map($$0 -> {
            ely $$1 = new ely();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public jf b() {
         return this.a;
      }

      public Either<Consumer<ely>, ely> c() {
         return this.b;
      }
   }

   public static record c(js<dfk> b, Map<buq, eln> c, eak.a d, elr e) {
      static final elg.c f = new elg.c(js.a(), Map.of(), eak.a.e, elr.a);
      public static final MapCodec<elg.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  kd.a(lw.aH).fieldOf("biomes").forGetter(elg.c::a),
                  Codec.simpleMap(buq.i, eln.a, bab.a(buq.values())).fieldOf("spawn_overrides").forGetter(elg.c::b),
                  eak.a.l.fieldOf("step").forGetter(elg.c::c),
                  elr.f.optionalFieldOf("terrain_adaptation", f.e).forGetter(elg.c::d)
               )
               .apply($$0, elg.c::new)
      );

      public c(js<dfk> $$0) {
         this($$0, f.c, f.d, f.e);
      }

      public js<dfk> a() {
         return this.b;
      }

      public Map<buq, eln> b() {
         return this.c;
      }

      public eak.a c() {
         return this.d;
      }

      public elr d() {
         return this.e;
      }

      public static class a {
         private final js<dfk> a;
         private Map<buq, eln> b = elg.c.f.c;
         private eak.a c = elg.c.f.d;
         private elr d = elg.c.f.e;

         public a(js<dfk> $$0) {
            this.a = $$0;
         }

         public elg.c.a a(Map<buq, eln> $$0) {
            this.b = $$0;
            return this;
         }

         public elg.c.a a(eak.a $$0) {
            this.c = $$0;
            return this;
         }

         public elg.c.a a(elr $$0) {
            this.d = $$0;
            return this;
         }

         public elg.c a() {
            return new elg.c(this.a, this.b, this.c, this.d);
         }
      }
   }
}
