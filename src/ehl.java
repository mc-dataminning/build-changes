import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class ehl extends efh {
   public static final Codec<ehl> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), ehl.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, ehl::new)
   );
   private final ehl.a e;

   public ehl(efh.c $$0, ehl.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<efh.b> a(efh.a $$0) {
      $$0.f().j();
      cye $$1 = $$0.h();
      ib $$2 = new ib($$1.b(), 50, $$1.e());
      efz $$3 = new efz();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new efh.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(efz $$0, efh.a $$1) {
      cye $$2 = $$1.h();
      dvq $$3 = $$1.f();
      dqw $$4 = $$1.b();
      ehk.d $$5 = new ehk.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.e();
      if (this.e == ehl.a.b) {
         ib $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), dur.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : axk.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.f(), $$3, 10);
      }
   }

   @Override
   public efq<?> e() {
      return efq.h;
   }

   public static enum a implements aye {
      a("normal", dca.U, dca.n, dca.dU),
      b("mesa", dca.aa, dca.t, dca.ki);

      public static final Codec<ehl.a> c = aye.a(ehl.a::values);
      private static final IntFunction<ehl.a> d = awb.a(Enum::ordinal, values(), awb.a.a);
      private final String e;
      private final doz f;
      private final doz g;
      private final doz h;

      private a(String $$0, dby $$1, dby $$2, dby $$3) {
         this.e = $$0;
         this.f = $$1.n();
         this.g = $$2.n();
         this.h = $$3.n();
      }

      public String a() {
         return this.e;
      }

      public static ehl.a a(int $$0) {
         return d.apply($$0);
      }

      public doz b() {
         return this.f;
      }

      public doz d() {
         return this.g;
      }

      public doz e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
