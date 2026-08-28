import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class eoc extends elx {
   public static final MapCodec<eoc> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), eoc.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, eoc::new)
   );
   private final eoc.a e;

   public eoc(elx.c $$0, eoc.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<elx.b> a(elx.a $$0) {
      $$0.f().j();
      deh $$1 = $$0.h();
      jh $$2 = new jh($$1.b(), 50, $$1.e());
      emp $$3 = new emp();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new elx.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(emp $$0, elx.a $$1) {
      deh $$2 = $$1.h();
      ece $$3 = $$1.f();
      dxg $$4 = $$1.b();
      eob.d $$5 = new eob.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.f();
      if (this.e == eoc.a.b) {
         jh $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), ebf.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : azk.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.g(), $$3, 10);
      }
   }

   @Override
   public emg<?> e() {
      return emg.h;
   }

   public static enum a implements bag {
      a("normal", dig.U, dig.n, dig.dU),
      b("mesa", dig.aa, dig.t, dig.ki);

      public static final Codec<eoc.a> c = bag.a(eoc.a::values);
      private static final IntFunction<eoc.a> d = ayb.a(Enum::ordinal, values(), ayb.a.a);
      private final String e;
      private final dvj f;
      private final dvj g;
      private final dvj h;

      private a(final String $$0, final die $$1, final die $$2, final die $$3) {
         this.e = $$0;
         this.f = $$1.m();
         this.g = $$2.m();
         this.h = $$3.m();
      }

      public String a() {
         return this.e;
      }

      public static eoc.a a(int $$0) {
         return d.apply($$0);
      }

      public dvj b() {
         return this.f;
      }

      public dvj d() {
         return this.g;
      }

      public dvj e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
