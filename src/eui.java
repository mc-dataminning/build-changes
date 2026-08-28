import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class eui extends esd {
   public static final MapCodec<eui> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), eui.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, eui::new)
   );
   private final eui.a e;

   public eui(esd.c $$0, eui.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<esd.b> a(esd.a $$0) {
      $$0.f().j();
      dje $$1 = $$0.h();
      iw $$2 = new iw($$1.b(), 50, $$1.e());
      esv $$3 = new esv();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new esd.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(esv $$0, esd.a $$1) {
      dje $$2 = $$1.h();
      eie $$3 = $$1.f();
      ede $$4 = $$1.b();
      euh.d $$5 = new euh.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.f();
      if (this.e == eui.a.b) {
         iw $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), ehf.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : azq.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.g(), $$3, 10);
      }
   }

   @Override
   public esm<?> e() {
      return esm.h;
   }

   public static enum a implements bao {
      a("normal", dng.X, dng.n, dng.el),
      b("mesa", dng.ad, dng.t, dng.kM);

      public static final Codec<eui.a> c = bao.a(eui.a::values);
      private static final IntFunction<eui.a> d = ayg.a(Enum::ordinal, values(), ayg.a.a);
      private final String e;
      private final ebg f;
      private final ebg g;
      private final ebg h;

      private a(final String $$0, final dne $$1, final dne $$2, final dne $$3) {
         this.e = $$0;
         this.f = $$1.m();
         this.g = $$2.m();
         this.h = $$3.m();
      }

      public String a() {
         return this.e;
      }

      public static eui.a a(int $$0) {
         return d.apply($$0);
      }

      public ebg b() {
         return this.f;
      }

      public ebg d() {
         return this.g;
      }

      public ebg e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
