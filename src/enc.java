import java.util.Optional;
import javax.annotation.Nullable;

public abstract class enc extends emu {
   @Override
   public emv d() {
      return emx.b;
   }

   @Override
   public emv e() {
      return emx.c;
   }

   @Override
   public ctl a() {
      return ctt.qz;
   }

   @Override
   public void a(daz $$0, io $$1, emw $$2, aym $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, avi.BY, avj.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(ky.al, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public kw h() {
      return ky.l;
   }

   @Override
   protected boolean a(daz $$0) {
      return $$0.aa().b(dav.U);
   }

   @Override
   protected void a(dba $$0, io $$1, drd $$2) {
      doi $$3 = $$2.t() ? $$0.c_($$1) : null;
      dea.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(dbc $$0) {
      return 4;
   }

   @Override
   public drd b(emw $$0) {
      return dec.G.n().a(diq.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(emv $$0) {
      return $$0 == emx.c || $$0 == emx.b;
   }

   @Override
   public int c(dbc $$0) {
      return 1;
   }

   @Override
   public int a(dbc $$0) {
      return 5;
   }

   @Override
   public boolean a(emw $$0, daf $$1, io $$2, emv $$3, it $$4) {
      return $$4 == it.a && !$$3.a(awc.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<avh> j() {
      return Optional.of(avi.di);
   }

   public static class a extends enc {
      @Override
      protected void a(dre.a<emv, emw> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(emw $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(emw $$0) {
         return false;
      }
   }

   public static class b extends enc {
      @Override
      public int d(emw $$0) {
         return 8;
      }

      @Override
      public boolean c(emw $$0) {
         return true;
      }
   }
}
