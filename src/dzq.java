import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class dzq extends dxm {
   public static final Codec<dzq> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), dzq.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, dzq::new)
   );
   private final dzq.a e;

   public dzq(dxm.c $$0, dzq.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dxm.b> a(dxm.a $$0) {
      $$0.f().j();
      crm $$1 = $$0.h();
      hx $$2 = new hx($$1.b(), 50, $$1.e());
      dye $$3 = new dye();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new dxm.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(dye $$0, dxm.a $$1) {
      crm $$2 = $$1.h();
      dnv $$3 = $$1.f();
      djk $$4 = $$1.b();
      dzp.d $$5 = new dzp.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.e();
      if (this.e == dzq.a.b) {
         hx $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), dmw.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : atq.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.f(), $$3, 10);
      }
   }

   @Override
   public dxv<?> e() {
      return dxv.h;
   }

   public static enum a implements auk {
      a("normal", cvh.U, cvh.n, cvh.dU),
      b("mesa", cvh.aa, cvh.t, cvh.ki);

      public static final Codec<dzq.a> c = auk.a(dzq.a::values);
      private static final IntFunction<dzq.a> d = asj.a(Enum::ordinal, values(), asj.a.a);
      private final String e;
      private final dhn f;
      private final dhn g;
      private final dhn h;

      private a(String $$0, cvf $$1, cvf $$2, cvf $$3) {
         this.e = $$0;
         this.f = $$1.o();
         this.g = $$2.o();
         this.h = $$3.o();
      }

      public String a() {
         return this.e;
      }

      public static dzq.a a(int $$0) {
         return d.apply($$0);
      }

      public dhn b() {
         return this.f;
      }

      public dhn d() {
         return this.g;
      }

      public dhn e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
