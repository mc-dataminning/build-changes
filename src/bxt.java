import java.util.EnumSet;
import java.util.function.Predicate;

public class bxt extends byb {
   private static final int a = 40;
   private static final Predicate<dpy> b = dqh.a(dcx.bt);
   private final brg c;
   private final czu d;
   private int e;

   public bxt(brg $$0) {
      this.c = $$0;
      this.d = $$0.dN();
      this.a(EnumSet.of(byb.a.a, byb.a.b, byb.a.c));
   }

   @Override
   public boolean a() {
      if (this.c.ej().a(this.c.p_() ? 50 : 1000) != 0) {
         return false;
      } else {
         im $$0 = this.c.dn();
         return b.test(this.d.a_($$0)) ? true : this.d.a_($$0.d()).a(dcx.i);
      }
   }

   @Override
   public void c() {
      this.e = this.a(40);
      this.d.a(this.c, (byte)10);
      this.c.K().n();
   }

   @Override
   public void d() {
      this.e = 0;
   }

   @Override
   public boolean b() {
      return this.e > 0;
   }

   public int h() {
      return this.e;
   }

   @Override
   public void e() {
      this.e = Math.max(0, this.e - 1);
      if (this.e == this.a(4)) {
         im $$0 = this.c.dn();
         if (b.test(this.d.a_($$0))) {
            if (this.d.aa().b(czq.c)) {
               this.d.b($$0, false);
            }

            this.c.N();
         } else {
            im $$1 = $$0.d();
            if (this.d.a_($$1).a(dcx.i)) {
               if (this.d.aa().b(czq.c)) {
                  this.d.c(2001, $$1, dcv.i(dcx.i.n()));
                  this.d.a($$1, dcx.j.n(), 2);
               }

               this.c.N();
            }
         }
      }
   }
}
