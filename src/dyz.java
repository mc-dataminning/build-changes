import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class dyz extends dwv {
   public static final Codec<dyz> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), dyz.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, dyz::new)
   );
   private final dyz.a e;

   public dyz(dwv.c $$0, dyz.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dwv.b> a(dwv.a $$0) {
      $$0.f().j();
      cqz $$1 = $$0.h();
      ht $$2 = new ht($$1.b(), 50, $$1.e());
      dxn $$3 = new dxn();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new dwv.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(dxn $$0, dwv.a $$1) {
      cqz $$2 = $$1.h();
      dne $$3 = $$1.f();
      dit $$4 = $$1.b();
      dyy.d $$5 = new dyy.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.e();
      if (this.e == dyz.a.b) {
         ht $$7 = $$0.d().f();
         int $$8 = $$4.a($$7.u(), $$7.w(), dmf.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : ati.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.f(), $$3, 10);
      }
   }

   @Override
   public dxe<?> e() {
      return dxe.h;
   }

   public static enum a implements aub {
      a("normal", cuv.U, cuv.n, cuv.dU),
      b("mesa", cuv.aa, cuv.t, cuv.ki);

      public static final Codec<dyz.a> c = aub.a(dyz.a::values);
      private static final IntFunction<dyz.a> d = asb.a(Enum::ordinal, values(), asb.a.a);
      private final String e;
      private final dgw f;
      private final dgw g;
      private final dgw h;

      private a(String $$0, cut $$1, cut $$2, cut $$3) {
         this.e = $$0;
         this.f = $$1.o();
         this.g = $$2.o();
         this.h = $$3.o();
      }

      public String a() {
         return this.e;
      }

      public static dyz.a a(int $$0) {
         return d.apply($$0);
      }

      public dgw b() {
         return this.f;
      }

      public dgw d() {
         return this.g;
      }

      public dgw e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
