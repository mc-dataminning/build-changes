import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class ets extends ern {
   public static final MapCodec<ets> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), ets.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, ets::new)
   );
   private final ets.a e;

   public ets(ern.c $$0, ets.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<ern.b> a(ern.a $$0) {
      $$0.f().j();
      dir $$1 = $$0.h();
      iv $$2 = new iv($$1.b(), 50, $$1.e());
      esf $$3 = new esf();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new ern.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(esf $$0, ern.a $$1) {
      dir $$2 = $$1.h();
      ehr $$3 = $$1.f();
      ecr $$4 = $$1.b();
      etr.d $$5 = new etr.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.f();
      if (this.e == ets.a.b) {
         iv $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), egs.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : azm.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.g(), $$3, 10);
      }
   }

   @Override
   public erw<?> e() {
      return erw.h;
   }

   public static enum a implements bak {
      a("normal", dmt.X, dmt.n, dmt.el),
      b("mesa", dmt.ad, dmt.t, dmt.kM);

      public static final Codec<ets.a> c = bak.a(ets.a::values);
      private static final IntFunction<ets.a> d = ayc.a(Enum::ordinal, values(), ayc.a.a);
      private final String e;
      private final eat f;
      private final eat g;
      private final eat h;

      private a(final String $$0, final dmr $$1, final dmr $$2, final dmr $$3) {
         this.e = $$0;
         this.f = $$1.m();
         this.g = $$2.m();
         this.h = $$3.m();
      }

      public String a() {
         return this.e;
      }

      public static ets.a a(int $$0) {
         return d.apply($$0);
      }

      public eat b() {
         return this.f;
      }

      public eat d() {
         return this.g;
      }

      public eat e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
