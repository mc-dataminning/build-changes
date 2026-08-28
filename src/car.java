import java.util.EnumSet;

public class car extends caa {
   private static final cdt b = cdt.b().a(6.0);
   public static final int a = 400;
   private final cfe c;
   private cly d;
   private int e;

   public car(cfe $$0) {
      this.c = $$0;
      this.a(EnumSet.of(caa.a.a, caa.a.b));
   }

   @Override
   public boolean a() {
      if (!this.c.dR().R()) {
         return false;
      } else if (this.c.dU().a(8000) != 0) {
         return false;
      } else {
         this.d = this.c.dR().a(cly.class, b, this.c, this.c.dw(), this.c.dy(), this.c.dC(), this.c.cM().c(6.0, 2.0, 6.0));
         return this.d != null;
      }
   }

   @Override
   public boolean b() {
      return this.e > 0;
   }

   @Override
   public void c() {
      this.e = this.a(400);
      this.c.w(true);
   }

   @Override
   public void d() {
      this.c.w(false);
      this.d = null;
   }

   @Override
   public void e() {
      this.c.F().a(this.d, 30.0F, 30.0F);
      this.e--;
   }
}
