import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ena extends ems {
   @Override
   public emt d() {
      return emv.b;
   }

   @Override
   public emt e() {
      return emv.c;
   }

   @Override
   public ctj a() {
      return ctr.qz;
   }

   @Override
   public void a(dax $$0, io $$1, emu $$2, ayk $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, avh.BY, avi.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
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
   protected boolean a(dax $$0) {
      return $$0.aa().b(dat.U);
   }

   @Override
   protected void a(day $$0, io $$1, drb $$2) {
      dog $$3 = $$2.t() ? $$0.c_($$1) : null;
      ddy.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(dba $$0) {
      return 4;
   }

   @Override
   public drb b(emu $$0) {
      return dea.G.n().a(dio.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(emt $$0) {
      return $$0 == emv.c || $$0 == emv.b;
   }

   @Override
   public int c(dba $$0) {
      return 1;
   }

   @Override
   public int a(dba $$0) {
      return 5;
   }

   @Override
   public boolean a(emu $$0, dad $$1, io $$2, emt $$3, it $$4) {
      return $$4 == it.a && !$$3.a(awb.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<avg> j() {
      return Optional.of(avh.di);
   }

   public static class a extends ena {
      @Override
      protected void a(drc.a<emt, emu> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(emu $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(emu $$0) {
         return false;
      }
   }

   public static class b extends ena {
      @Override
      public int d(emu $$0) {
         return 8;
      }

      @Override
      public boolean c(emu $$0) {
         return true;
      }
   }
}
