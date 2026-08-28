import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class etn extends eri {
   public static final MapCodec<etn> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), etn.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, etn::new)
   );
   private final etn.a e;

   public etn(eri.c $$0, etn.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eri.b> a(eri.a $$0) {
      $$0.f().j();
      dio $$1 = $$0.h();
      iv $$2 = new iv($$1.b(), 50, $$1.e());
      esa $$3 = new esa();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new eri.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(esa $$0, eri.a $$1) {
      dio $$2 = $$1.h();
      ehm $$3 = $$1.f();
      ecm $$4 = $$1.b();
      etm.d $$5 = new etm.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.f();
      if (this.e == etn.a.b) {
         iv $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), egn.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : azm.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.g(), $$3, 10);
      }
   }

   @Override
   public err<?> e() {
      return err.h;
   }

   public static enum a implements bak {
      a("normal", dmo.X, dmo.n, dmo.el),
      b("mesa", dmo.ad, dmo.t, dmo.kM);

      public static final Codec<etn.a> c = bak.a(etn.a::values);
      private static final IntFunction<etn.a> d = ayc.a(Enum::ordinal, values(), ayc.a.a);
      private final String e;
      private final eao f;
      private final eao g;
      private final eao h;

      private a(final String $$0, final dmm $$1, final dmm $$2, final dmm $$3) {
         this.e = $$0;
         this.f = $$1.m();
         this.g = $$2.m();
         this.h = $$3.m();
      }

      public String a() {
         return this.e;
      }

      public static etn.a a(int $$0) {
         return d.apply($$0);
      }

      public eao b() {
         return this.f;
      }

      public eao d() {
         return this.g;
      }

      public eao e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
