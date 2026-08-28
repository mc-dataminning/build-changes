import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class esy extends eqt {
   public static final MapCodec<esy> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), esy.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, esy::new)
   );
   private final esy.a e;

   public esy(eqt.c $$0, esy.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eqt.b> a(eqt.a $$0) {
      $$0.f().j();
      dic $$1 = $$0.h();
      iu $$2 = new iu($$1.b(), 50, $$1.e());
      erl $$3 = new erl();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new eqt.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(erl $$0, eqt.a $$1) {
      dic $$2 = $$1.h();
      egx $$3 = $$1.f();
      ebx $$4 = $$1.b();
      esx.d $$5 = new esx.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.f();
      if (this.e == esy.a.b) {
         iu $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), efy.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : azm.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.g(), $$3, 10);
      }
   }

   @Override
   public erc<?> e() {
      return erc.h;
   }

   public static enum a implements bak {
      a("normal", dmc.X, dmc.n, dmc.ei),
      b("mesa", dmc.ad, dmc.t, dmc.kJ);

      public static final Codec<esy.a> c = bak.a(esy.a::values);
      private static final IntFunction<esy.a> d = ayc.a(Enum::ordinal, values(), ayc.a.a);
      private final String e;
      private final dzz f;
      private final dzz g;
      private final dzz h;

      private a(final String $$0, final dma $$1, final dma $$2, final dma $$3) {
         this.e = $$0;
         this.f = $$1.m();
         this.g = $$2.m();
         this.h = $$3.m();
      }

      public String a() {
         return this.e;
      }

      public static esy.a a(int $$0) {
         return d.apply($$0);
      }

      public dzz b() {
         return this.f;
      }

      public dzz d() {
         return this.g;
      }

      public dzz e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
