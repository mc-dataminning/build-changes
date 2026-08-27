import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class ebj extends dzf {
   public static final Codec<ebj> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), ebj.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, ebj::new)
   );
   private final ebj.a e;

   public ebj(dzf.c $$0, ebj.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dzf.b> a(dzf.a $$0) {
      $$0.f().j();
      csv $$1 = $$0.h();
      hx $$2 = new hx($$1.b(), 50, $$1.e());
      dzx $$3 = new dzx();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new dzf.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(dzx $$0, dzf.a $$1) {
      csv $$2 = $$1.h();
      dpo $$3 = $$1.f();
      dld $$4 = $$1.b();
      ebi.d $$5 = new ebi.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.e();
      if (this.e == ebj.a.b) {
         hx $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), dop.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : aun.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.f(), $$3, 10);
      }
   }

   @Override
   public dzo<?> e() {
      return dzo.h;
   }

   public static enum a implements avj {
      a("normal", cwr.U, cwr.n, cwr.dU),
      b("mesa", cwr.aa, cwr.t, cwr.ki);

      public static final Codec<ebj.a> c = avj.a(ebj.a::values);
      private static final IntFunction<ebj.a> d = atf.a(Enum::ordinal, values(), atf.a.a);
      private final String e;
      private final djg f;
      private final djg g;
      private final djg h;

      private a(String $$0, cwp $$1, cwp $$2, cwp $$3) {
         this.e = $$0;
         this.f = $$1.o();
         this.g = $$2.o();
         this.h = $$3.o();
      }

      public String a() {
         return this.e;
      }

      public static ebj.a a(int $$0) {
         return d.apply($$0);
      }

      public djg b() {
         return this.f;
      }

      public djg d() {
         return this.g;
      }

      public djg e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
