import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class edi extends ebe {
   public static final Codec<edi> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), edi.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, edi::new)
   );
   private final edi.a e;

   public edi(ebe.c $$0, edi.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<ebe.b> a(ebe.a $$0) {
      $$0.f().j();
      cuu $$1 = $$0.h();
      hz $$2 = new hz($$1.b(), 50, $$1.e());
      ebw $$3 = new ebw();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new ebe.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(ebw $$0, ebe.a $$1) {
      cuu $$2 = $$1.h();
      drn $$3 = $$1.f();
      dnc $$4 = $$1.b();
      edh.d $$5 = new edh.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.e();
      if (this.e == edi.a.b) {
         hz $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), dqo.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : awh.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.f(), $$3, 10);
      }
   }

   @Override
   public ebn<?> e() {
      return ebn.h;
   }

   public static enum a implements axc {
      a("normal", cyq.U, cyq.n, cyq.dU),
      b("mesa", cyq.aa, cyq.t, cyq.ki);

      public static final Codec<edi.a> c = axc.a(edi.a::values);
      private static final IntFunction<edi.a> d = auz.a(Enum::ordinal, values(), auz.a.a);
      private final String e;
      private final dlf f;
      private final dlf g;
      private final dlf h;

      private a(String $$0, cyo $$1, cyo $$2, cyo $$3) {
         this.e = $$0;
         this.f = $$1.o();
         this.g = $$2.o();
         this.h = $$3.o();
      }

      public String a() {
         return this.e;
      }

      public static edi.a a(int $$0) {
         return d.apply($$0);
      }

      public dlf b() {
         return this.f;
      }

      public dlf d() {
         return this.g;
      }

      public dlf e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
