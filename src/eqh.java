import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class eqh extends eoc {
   public static final MapCodec<eqh> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), eqh.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, eqh::new)
   );
   private final eqh.a e;

   public eqh(eoc.c $$0, eqh.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eoc.b> a(eoc.a $$0) {
      $$0.f().j();
      dgg $$1 = $$0.h();
      jh $$2 = new jh($$1.b(), 50, $$1.e());
      eou $$3 = new eou();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new eoc.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(eou $$0, eoc.a $$1) {
      dgg $$2 = $$1.h();
      eeh $$3 = $$1.f();
      dzj $$4 = $$1.b();
      eqg.d $$5 = new eqg.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.f();
      if (this.e == eqh.a.b) {
         jh $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), edi.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : bae.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.g(), $$3, 10);
      }
   }

   @Override
   public eol<?> e() {
      return eol.h;
   }

   public static enum a implements bba {
      a("normal", dkg.X, dkg.n, dkg.eh),
      b("mesa", dkg.ad, dkg.t, dkg.kB);

      public static final Codec<eqh.a> c = bba.a(eqh.a::values);
      private static final IntFunction<eqh.a> d = ayv.a(Enum::ordinal, values(), ayv.a.a);
      private final String e;
      private final dxn f;
      private final dxn g;
      private final dxn h;

      private a(final String $$0, final dke $$1, final dke $$2, final dke $$3) {
         this.e = $$0;
         this.f = $$1.m();
         this.g = $$2.m();
         this.h = $$3.m();
      }

      public String a() {
         return this.e;
      }

      public static eqh.a a(int $$0) {
         return d.apply($$0);
      }

      public dxn b() {
         return this.f;
      }

      public dxn d() {
         return this.g;
      }

      public dxn e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
