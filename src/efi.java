import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class efi extends ede {
   public static final Codec<efi> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), efi.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, efi::new)
   );
   private final efi.a e;

   public efi(ede.c $$0, efi.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<ede.b> a(ede.a $$0) {
      $$0.f().j();
      cwi $$1 = $$0.h();
      ib $$2 = new ib($$1.b(), 50, $$1.e());
      edw $$3 = new edw();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new ede.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(edw $$0, ede.a $$1) {
      cwi $$2 = $$1.h();
      dtn $$3 = $$1.f();
      doy $$4 = $$1.b();
      efh.d $$5 = new efh.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.e();
      if (this.e == efi.a.b) {
         ib $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), dso.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : aww.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.f(), $$3, 10);
      }
   }

   @Override
   public edn<?> e() {
      return edn.h;
   }

   public static enum a implements axq {
      a("normal", dae.U, dae.n, dae.dU),
      b("mesa", dae.aa, dae.t, dae.ki);

      public static final Codec<efi.a> c = axq.a(efi.a::values);
      private static final IntFunction<efi.a> d = avn.a(Enum::ordinal, values(), avn.a.a);
      private final String e;
      private final dnb f;
      private final dnb g;
      private final dnb h;

      private a(String $$0, dac $$1, dac $$2, dac $$3) {
         this.e = $$0;
         this.f = $$1.o();
         this.g = $$2.o();
         this.h = $$3.o();
      }

      public String a() {
         return this.e;
      }

      public static efi.a a(int $$0) {
         return d.apply($$0);
      }

      public dnb b() {
         return this.f;
      }

      public dnb d() {
         return this.g;
      }

      public dnb e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
