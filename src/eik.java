import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class eik extends egg {
   public static final Codec<eik> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), eik.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, eik::new)
   );
   private final eik.a e;

   public eik(egg.c $$0, eik.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<egg.b> a(egg.a $$0) {
      $$0.f().j();
      czb $$1 = $$0.h();
      im $$2 = new im($$1.b(), 50, $$1.e());
      egy $$3 = new egy();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new egg.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(egy $$0, egg.a $$1) {
      czb $$2 = $$1.h();
      dwp $$3 = $$1.f();
      drv $$4 = $$1.b();
      eij.d $$5 = new eij.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.e();
      if (this.e == eik.a.b) {
         im $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), dvq.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : axw.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.f(), $$3, 10);
      }
   }

   @Override
   public egp<?> e() {
      return egp.h;
   }

   public static enum a implements ayq {
      a("normal", dcx.U, dcx.n, dcx.dU),
      b("mesa", dcx.aa, dcx.t, dcx.ki);

      public static final Codec<eik.a> c = ayq.a(eik.a::values);
      private static final IntFunction<eik.a> d = awn.a(Enum::ordinal, values(), awn.a.a);
      private final String e;
      private final dpy f;
      private final dpy g;
      private final dpy h;

      private a(String $$0, dcv $$1, dcv $$2, dcv $$3) {
         this.e = $$0;
         this.f = $$1.n();
         this.g = $$2.n();
         this.h = $$3.n();
      }

      public String a() {
         return this.e;
      }

      public static eik.a a(int $$0) {
         return d.apply($$0);
      }

      public dpy b() {
         return this.f;
      }

      public dpy d() {
         return this.g;
      }

      public dpy e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
