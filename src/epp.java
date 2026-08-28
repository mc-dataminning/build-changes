import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class epp extends enk {
   public static final MapCodec<epp> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), epp.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, epp::new)
   );
   private final epp.a e;

   public epp(enk.c $$0, epp.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<enk.b> a(enk.a $$0) {
      $$0.f().j();
      dfm $$1 = $$0.h();
      ji $$2 = new ji($$1.b(), 50, $$1.e());
      eoc $$3 = new eoc();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new enk.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(eoc $$0, enk.a $$1) {
      dfm $$2 = $$1.h();
      edp $$3 = $$1.f();
      dyr $$4 = $$1.b();
      epo.d $$5 = new epo.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.f();
      if (this.e == epp.a.b) {
         ji $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), ecq.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : ayy.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.g(), $$3, 10);
      }
   }

   @Override
   public ent<?> e() {
      return ent.h;
   }

   public static enum a implements azu {
      a("normal", djm.X, djm.n, djm.eh),
      b("mesa", djm.ad, djm.t, djm.kI);

      public static final Codec<epp.a> c = azu.a(epp.a::values);
      private static final IntFunction<epp.a> d = axp.a(Enum::ordinal, values(), axp.a.a);
      private final String e;
      private final dwv f;
      private final dwv g;
      private final dwv h;

      private a(final String $$0, final djk $$1, final djk $$2, final djk $$3) {
         this.e = $$0;
         this.f = $$1.m();
         this.g = $$2.m();
         this.h = $$3.m();
      }

      public String a() {
         return this.e;
      }

      public static epp.a a(int $$0) {
         return d.apply($$0);
      }

      public dwv b() {
         return this.f;
      }

      public dwv d() {
         return this.g;
      }

      public dwv e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
