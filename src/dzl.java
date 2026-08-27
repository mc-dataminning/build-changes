import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class dzl extends dxh {
   public static final Codec<dzl> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), dzl.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, dzl::new)
   );
   private final dzl.a e;

   public dzl(dxh.c $$0, dzl.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dxh.b> a(dxh.a $$0) {
      $$0.f().j();
      crh $$1 = $$0.h();
      ht $$2 = new ht($$1.b(), 50, $$1.e());
      dxz $$3 = new dxz();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new dxh.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(dxz $$0, dxh.a $$1) {
      crh $$2 = $$1.h();
      dnq $$3 = $$1.f();
      djf $$4 = $$1.b();
      dzk.d $$5 = new dzk.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.e();
      if (this.e == dzl.a.b) {
         ht $$7 = $$0.d().f();
         int $$8 = $$4.a($$7.u(), $$7.w(), dmr.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : atm.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.f(), $$3, 10);
      }
   }

   @Override
   public dxq<?> e() {
      return dxq.h;
   }

   public static enum a implements aug {
      a("normal", cvc.U, cvc.n, cvc.dU),
      b("mesa", cvc.aa, cvc.t, cvc.ki);

      public static final Codec<dzl.a> c = aug.a(dzl.a::values);
      private static final IntFunction<dzl.a> d = asf.a(Enum::ordinal, values(), asf.a.a);
      private final String e;
      private final dhi f;
      private final dhi g;
      private final dhi h;

      private a(String $$0, cva $$1, cva $$2, cva $$3) {
         this.e = $$0;
         this.f = $$1.o();
         this.g = $$2.o();
         this.h = $$3.o();
      }

      public String a() {
         return this.e;
      }

      public static dzl.a a(int $$0) {
         return d.apply($$0);
      }

      public dhi b() {
         return this.f;
      }

      public dhi d() {
         return this.g;
      }

      public dhi e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
