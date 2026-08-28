import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class enh extends elc {
   public static final MapCodec<enh> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), enh.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, enh::new)
   );
   private final enh.a e;

   public enh(elc.c $$0, enh.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<elc.b> a(elc.a $$0) {
      $$0.f().j();
      ddm $$1 = $$0.h();
      je $$2 = new je($$1.b(), 50, $$1.e());
      elu $$3 = new elu();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new elc.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(elu $$0, elc.a $$1) {
      ddm $$2 = $$1.h();
      ebj $$3 = $$1.f();
      dwl $$4 = $$1.b();
      eng.d $$5 = new eng.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.f();
      if (this.e == enh.a.b) {
         je $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), eak.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : azd.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.g(), $$3, 10);
      }
   }

   @Override
   public ell<?> e() {
      return ell.h;
   }

   public static enum a implements azz {
      a("normal", dhl.U, dhl.n, dhl.dU),
      b("mesa", dhl.aa, dhl.t, dhl.ki);

      public static final Codec<enh.a> c = azz.a(enh.a::values);
      private static final IntFunction<enh.a> d = axu.a(Enum::ordinal, values(), axu.a.a);
      private final String e;
      private final duo f;
      private final duo g;
      private final duo h;

      private a(final String $$0, final dhj $$1, final dhj $$2, final dhj $$3) {
         this.e = $$0;
         this.f = $$1.o();
         this.g = $$2.o();
         this.h = $$3.o();
      }

      public String a() {
         return this.e;
      }

      public static enh.a a(int $$0) {
         return d.apply($$0);
      }

      public duo b() {
         return this.f;
      }

      public duo d() {
         return this.g;
      }

      public duo e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
