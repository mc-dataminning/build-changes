import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class etg extends erb {
   public static final MapCodec<etg> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), etg.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, etg::new)
   );
   private final etg.a e;

   public etg(erb.c $$0, etg.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<erb.b> a(erb.a $$0) {
      $$0.f().j();
      dih $$1 = $$0.h();
      iu $$2 = new iu($$1.b(), 50, $$1.e());
      ert $$3 = new ert();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new erb.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(ert $$0, erb.a $$1) {
      dih $$2 = $$1.h();
      ehf $$3 = $$1.f();
      ecf $$4 = $$1.b();
      etf.d $$5 = new etf.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.f();
      if (this.e == etg.a.b) {
         iu $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), egg.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : azm.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.g(), $$3, 10);
      }
   }

   @Override
   public erk<?> e() {
      return erk.h;
   }

   public static enum a implements bak {
      a("normal", dmh.X, dmh.n, dmh.el),
      b("mesa", dmh.ad, dmh.t, dmh.kM);

      public static final Codec<etg.a> c = bak.a(etg.a::values);
      private static final IntFunction<etg.a> d = ayc.a(Enum::ordinal, values(), ayc.a.a);
      private final String e;
      private final eah f;
      private final eah g;
      private final eah h;

      private a(final String $$0, final dmf $$1, final dmf $$2, final dmf $$3) {
         this.e = $$0;
         this.f = $$1.m();
         this.g = $$2.m();
         this.h = $$3.m();
      }

      public String a() {
         return this.e;
      }

      public static etg.a a(int $$0) {
         return d.apply($$0);
      }

      public eah b() {
         return this.f;
      }

      public eah d() {
         return this.g;
      }

      public eah e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
