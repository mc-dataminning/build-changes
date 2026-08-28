import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class eko extends eik {
   public static final MapCodec<eko> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), eko.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, eko::new)
   );
   private final eko.a e;

   public eko(eik.c $$0, eko.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eik.b> a(eik.a $$0) {
      $$0.f().j();
      dbf $$1 = $$0.h();
      iz $$2 = new iz($$1.b(), 50, $$1.e());
      ejc $$3 = new ejc();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new eik.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(ejc $$0, eik.a $$1) {
      dbf $$2 = $$1.h();
      dyt $$3 = $$1.f();
      dtz $$4 = $$1.b();
      ekn.d $$5 = new ekn.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.f();
      if (this.e == eko.a.b) {
         iz $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), dxu.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : ayz.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.g(), $$3, 10);
      }
   }

   @Override
   public eit<?> e() {
      return eit.h;
   }

   public static enum a implements azu {
      a("normal", dfb.U, dfb.n, dfb.dU),
      b("mesa", dfb.aa, dfb.t, dfb.ki);

      public static final Codec<eko.a> c = azu.a(eko.a::values);
      private static final IntFunction<eko.a> d = axp.a(Enum::ordinal, values(), axp.a.a);
      private final String e;
      private final dsc f;
      private final dsc g;
      private final dsc h;

      private a(final String $$0, final dez $$1, final dez $$2, final dez $$3) {
         this.e = $$0;
         this.f = $$1.o();
         this.g = $$2.o();
         this.h = $$3.o();
      }

      public String a() {
         return this.e;
      }

      public static eko.a a(int $$0) {
         return d.apply($$0);
      }

      public dsc b() {
         return this.f;
      }

      public dsc d() {
         return this.g;
      }

      public dsc e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
