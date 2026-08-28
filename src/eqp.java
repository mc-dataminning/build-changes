import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class eqp extends eok {
   public static final MapCodec<eqp> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), eqp.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, eqp::new)
   );
   private final eqp.a e;

   public eqp(eok.c $$0, eqp.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eok.b> a(eok.a $$0) {
      $$0.f().j();
      dgo $$1 = $$0.h();
      jh $$2 = new jh($$1.b(), 50, $$1.e());
      epc $$3 = new epc();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new eok.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(epc $$0, eok.a $$1) {
      dgo $$2 = $$1.h();
      eep $$3 = $$1.f();
      dzr $$4 = $$1.b();
      eqo.d $$5 = new eqo.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.f();
      if (this.e == eqp.a.b) {
         jh $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), edq.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : bae.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.g(), $$3, 10);
      }
   }

   @Override
   public eot<?> e() {
      return eot.h;
   }

   public static enum a implements bba {
      a("normal", dko.X, dko.n, dko.eh),
      b("mesa", dko.ad, dko.t, dko.kB);

      public static final Codec<eqp.a> c = bba.a(eqp.a::values);
      private static final IntFunction<eqp.a> d = ayv.a(Enum::ordinal, values(), ayv.a.a);
      private final String e;
      private final dxv f;
      private final dxv g;
      private final dxv h;

      private a(final String $$0, final dkm $$1, final dkm $$2, final dkm $$3) {
         this.e = $$0;
         this.f = $$1.m();
         this.g = $$2.m();
         this.h = $$3.m();
      }

      public String a() {
         return this.e;
      }

      public static eqp.a a(int $$0) {
         return d.apply($$0);
      }

      public dxv b() {
         return this.f;
      }

      public dxv d() {
         return this.g;
      }

      public dxv e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
