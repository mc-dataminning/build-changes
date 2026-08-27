import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class ejn extends ehj {
   public static final MapCodec<ejn> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), ejn.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, ejn::new)
   );
   private final ejn.a e;

   public ejn(ehj.c $$0, ejn.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<ehj.b> a(ehj.a $$0) {
      $$0.f().j();
      dae $$1 = $$0.h();
      io $$2 = new io($$1.b(), 50, $$1.e());
      eib $$3 = new eib();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new ehj.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(eib $$0, ehj.a $$1) {
      dae $$2 = $$1.h();
      dxs $$3 = $$1.f();
      dsy $$4 = $$1.b();
      ejm.d $$5 = new ejm.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.e();
      if (this.e == ejn.a.b) {
         io $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), dwt.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : ayd.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.f(), $$3, 10);
      }
   }

   @Override
   public ehs<?> e() {
      return ehs.h;
   }

   public static enum a implements ayx {
      a("normal", dea.U, dea.n, dea.dU),
      b("mesa", dea.aa, dea.t, dea.ki);

      public static final Codec<ejn.a> c = ayx.a(ejn.a::values);
      private static final IntFunction<ejn.a> d = awv.a(Enum::ordinal, values(), awv.a.a);
      private final String e;
      private final drb f;
      private final drb g;
      private final drb h;

      private a(String $$0, ddy $$1, ddy $$2, ddy $$3) {
         this.e = $$0;
         this.f = $$1.n();
         this.g = $$2.n();
         this.h = $$3.n();
      }

      public String a() {
         return this.e;
      }

      public static ejn.a a(int $$0) {
         return d.apply($$0);
      }

      public drb b() {
         return this.f;
      }

      public drb d() {
         return this.g;
      }

      public drb e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
