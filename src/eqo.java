import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class eqo extends eoj {
   public static final MapCodec<eqo> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), eqo.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, eqo::new)
   );
   private final eqo.a e;

   public eqo(eoj.c $$0, eqo.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eoj.b> a(eoj.a $$0) {
      $$0.f().j();
      dgg $$1 = $$0.h();
      ji $$2 = new ji($$1.b(), 50, $$1.e());
      epb $$3 = new epb();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new eoj.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(epb $$0, eoj.a $$1) {
      dgg $$2 = $$1.h();
      een $$3 = $$1.f();
      dzn $$4 = $$1.b();
      eqn.d $$5 = new eqn.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.f();
      if (this.e == eqo.a.b) {
         ji $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), edo.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : ayz.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.g(), $$3, 10);
      }
   }

   @Override
   public eos<?> e() {
      return eos.h;
   }

   public static enum a implements azv {
      a("normal", dkg.X, dkg.n, dkg.eh),
      b("mesa", dkg.ad, dkg.t, dkg.kI);

      public static final Codec<eqo.a> c = azv.a(eqo.a::values);
      private static final IntFunction<eqo.a> d = axq.a(Enum::ordinal, values(), axq.a.a);
      private final String e;
      private final dxq f;
      private final dxq g;
      private final dxq h;

      private a(final String $$0, final dke $$1, final dke $$2, final dke $$3) {
         this.e = $$0;
         this.f = $$1.m();
         this.g = $$2.m();
         this.h = $$3.m();
      }

      public String a() {
         return this.e;
      }

      public static eqo.a a(int $$0) {
         return d.apply($$0);
      }

      public dxq b() {
         return this.f;
      }

      public dxq d() {
         return this.g;
      }

      public dxq e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
