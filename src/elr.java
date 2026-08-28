import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class elr extends ejm {
   public static final MapCodec<elr> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), elr.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, elr::new)
   );
   private final elr.a e;

   public elr(ejm.c $$0, elr.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<ejm.b> a(ejm.a $$0) {
      $$0.f().j();
      dcb $$1 = $$0.h();
      jd $$2 = new jd($$1.b(), 50, $$1.e());
      eke $$3 = new eke();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new ejm.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(eke $$0, ejm.a $$1) {
      dcb $$2 = $$1.h();
      dzu $$3 = $$1.f();
      dux $$4 = $$1.b();
      elq.d $$5 = new elq.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.f();
      if (this.e == elr.a.b) {
         jd $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), dyv.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : ayn.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.g(), $$3, 10);
      }
   }

   @Override
   public ejv<?> e() {
      return ejv.h;
   }

   public static enum a implements azj {
      a("normal", dfy.U, dfy.n, dfy.dU),
      b("mesa", dfy.aa, dfy.t, dfy.ki);

      public static final Codec<elr.a> c = azj.a(elr.a::values);
      private static final IntFunction<elr.a> d = axd.a(Enum::ordinal, values(), axd.a.a);
      private final String e;
      private final dta f;
      private final dta g;
      private final dta h;

      private a(final String $$0, final dfw $$1, final dfw $$2, final dfw $$3) {
         this.e = $$0;
         this.f = $$1.o();
         this.g = $$2.o();
         this.h = $$3.o();
      }

      public String a() {
         return this.e;
      }

      public static elr.a a(int $$0) {
         return d.apply($$0);
      }

      public dta b() {
         return this.f;
      }

      public dta d() {
         return this.g;
      }

      public dta e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
