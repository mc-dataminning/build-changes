import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class eug extends esb {
   public static final MapCodec<eug> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), eug.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, eug::new)
   );
   private final eug.a e;

   public eug(esb.c $$0, eug.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<esb.b> a(esb.a $$0) {
      $$0.f().j();
      djc $$1 = $$0.h();
      iv $$2 = new iv($$1.b(), 50, $$1.e());
      est $$3 = new est();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new esb.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(est $$0, esb.a $$1) {
      djc $$2 = $$1.h();
      eic $$3 = $$1.f();
      edc $$4 = $$1.b();
      euf.d $$5 = new euf.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.f();
      if (this.e == eug.a.b) {
         iv $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), ehd.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : azo.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.g(), $$3, 10);
      }
   }

   @Override
   public esk<?> e() {
      return esk.h;
   }

   public static enum a implements bam {
      a("normal", dne.X, dne.n, dne.el),
      b("mesa", dne.ad, dne.t, dne.kM);

      public static final Codec<eug.a> c = bam.a(eug.a::values);
      private static final IntFunction<eug.a> d = aye.a(Enum::ordinal, values(), aye.a.a);
      private final String e;
      private final ebe f;
      private final ebe g;
      private final ebe h;

      private a(final String $$0, final dnc $$1, final dnc $$2, final dnc $$3) {
         this.e = $$0;
         this.f = $$1.m();
         this.g = $$2.m();
         this.h = $$3.m();
      }

      public String a() {
         return this.e;
      }

      public static eug.a a(int $$0) {
         return d.apply($$0);
      }

      public ebe b() {
         return this.f;
      }

      public ebe d() {
         return this.g;
      }

      public ebe e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
