import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class dxh extends dvk {
   public static final Codec<dxh> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), dxh.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, dxh::new)
   );
   private final dxh.a e;

   public dxh(dvk.c $$0, dxh.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dvk.b> a(dvk.a $$0) {
      $$0.f().j();
      cpe $$1 = $$0.h();
      gw $$2 = new gw($$1.b(), 50, $$1.e());
      dwc $$3 = new dwc();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new dvk.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(dwc $$0, dvk.a $$1) {
      cpe $$2 = $$1.h();
      dlt $$3 = $$1.f();
      dhi $$4 = $$1.b();
      dxg.d $$5 = new dxg.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.e();
      if (this.e == dxh.a.b) {
         gw $$7 = $$0.d().f();
         int $$8 = $$4.a($$7.u(), $$7.w(), dku.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : ary.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.f(), $$3, 10);
      }
   }

   @Override
   public dvt<?> e() {
      return dvt.h;
   }

   public static enum a implements asr {
      a("normal", csy.U, csy.n, csy.dU),
      b("mesa", csy.aa, csy.t, csy.ki);

      public static final Codec<dxh.a> c = asr.a(dxh.a::values);
      private static final IntFunction<dxh.a> d = aqt.a(Enum::ordinal, values(), aqt.a.a);
      private final String e;
      private final dfl f;
      private final dfl g;
      private final dfl h;

      private a(String $$0, csx $$1, csx $$2, csx $$3) {
         this.e = $$0;
         this.f = $$1.n();
         this.g = $$2.n();
         this.h = $$3.n();
      }

      public String a() {
         return this.e;
      }

      public static dxh.a a(int $$0) {
         return d.apply($$0);
      }

      public dfl b() {
         return this.f;
      }

      public dfl d() {
         return this.g;
      }

      public dfl e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
