import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class enl extends elg {
   public static final MapCodec<enl> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), enl.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, enl::new)
   );
   private final enl.a e;

   public enl(elg.c $$0, enl.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<elg.b> a(elg.a $$0) {
      $$0.f().j();
      ddp $$1 = $$0.h();
      jf $$2 = new jf($$1.b(), 50, $$1.e());
      ely $$3 = new ely();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new elg.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(ely $$0, elg.a $$1) {
      ddp $$2 = $$1.h();
      ebn $$3 = $$1.f();
      dwp $$4 = $$1.b();
      enk.d $$5 = new enk.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.f();
      if (this.e == enl.a.b) {
         jf $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), eao.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : azf.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.g(), $$3, 10);
      }
   }

   @Override
   public elp<?> e() {
      return elp.h;
   }

   public static enum a implements bab {
      a("normal", dho.U, dho.n, dho.dU),
      b("mesa", dho.aa, dho.t, dho.ki);

      public static final Codec<enl.a> c = bab.a(enl.a::values);
      private static final IntFunction<enl.a> d = axw.a(Enum::ordinal, values(), axw.a.a);
      private final String e;
      private final dus f;
      private final dus g;
      private final dus h;

      private a(final String $$0, final dhm $$1, final dhm $$2, final dhm $$3) {
         this.e = $$0;
         this.f = $$1.n();
         this.g = $$2.n();
         this.h = $$3.n();
      }

      public String a() {
         return this.e;
      }

      public static enl.a a(int $$0) {
         return d.apply($$0);
      }

      public dus b() {
         return this.f;
      }

      public dus d() {
         return this.g;
      }

      public dus e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
