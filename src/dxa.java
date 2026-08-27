import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class dxa extends dvd {
   public static final Codec<dxa> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), dxa.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, dxa::new)
   );
   private final dxa.a e;

   public dxa(dvd.c $$0, dxa.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dvd.b> a(dvd.a $$0) {
      $$0.f().j();
      cox $$1 = $$0.h();
      gw $$2 = new gw($$1.b(), 50, $$1.e());
      dvv $$3 = new dvv();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new dvd.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(dvv $$0, dvd.a $$1) {
      cox $$2 = $$1.h();
      dlm $$3 = $$1.f();
      dhb $$4 = $$1.b();
      dwz.d $$5 = new dwz.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.e();
      if (this.e == dxa.a.b) {
         gw $$7 = $$0.d().f();
         int $$8 = $$4.a($$7.u(), $$7.w(), dkn.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : ars.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.f(), $$3, 10);
      }
   }

   @Override
   public dvm<?> e() {
      return dvm.h;
   }

   public static enum a implements ask {
      a("normal", csr.U, csr.n, csr.dU),
      b("mesa", csr.aa, csr.t, csr.ki);

      public static final Codec<dxa.a> c = ask.a(dxa.a::values);
      private static final IntFunction<dxa.a> d = aqn.a(Enum::ordinal, values(), aqn.a.a);
      private final String e;
      private final dfe f;
      private final dfe g;
      private final dfe h;

      private a(String $$0, csq $$1, csq $$2, csq $$3) {
         this.e = $$0;
         this.f = $$1.n();
         this.g = $$2.n();
         this.h = $$3.n();
      }

      public String a() {
         return this.e;
      }

      public static dxa.a a(int $$0) {
         return d.apply($$0);
      }

      public dfe b() {
         return this.f;
      }

      public dfe d() {
         return this.g;
      }

      public dfe e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
