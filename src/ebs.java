import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class ebs extends dzo {
   public static final Codec<ebs> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), ebs.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, ebs::new)
   );
   private final ebs.a e;

   public ebs(dzo.c $$0, ebs.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dzo.b> a(dzo.a $$0) {
      $$0.f().j();
      cte $$1 = $$0.h();
      hx $$2 = new hx($$1.b(), 50, $$1.e());
      eag $$3 = new eag();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new dzo.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(eag $$0, dzo.a $$1) {
      cte $$2 = $$1.h();
      dpx $$3 = $$1.f();
      dlm $$4 = $$1.b();
      ebr.d $$5 = new ebr.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.e();
      if (this.e == ebs.a.b) {
         hx $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), doy.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : aup.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.f(), $$3, 10);
      }
   }

   @Override
   public dzx<?> e() {
      return dzx.h;
   }

   public static enum a implements avl {
      a("normal", cxa.U, cxa.n, cxa.dU),
      b("mesa", cxa.aa, cxa.t, cxa.ki);

      public static final Codec<ebs.a> c = avl.a(ebs.a::values);
      private static final IntFunction<ebs.a> d = ath.a(Enum::ordinal, values(), ath.a.a);
      private final String e;
      private final djp f;
      private final djp g;
      private final djp h;

      private a(String $$0, cwy $$1, cwy $$2, cwy $$3) {
         this.e = $$0;
         this.f = $$1.o();
         this.g = $$2.o();
         this.h = $$3.o();
      }

      public String a() {
         return this.e;
      }

      public static ebs.a a(int $$0) {
         return d.apply($$0);
      }

      public djp b() {
         return this.f;
      }

      public djp d() {
         return this.g;
      }

      public djp e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
