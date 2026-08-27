import java.util.EnumSet;
import java.util.function.Predicate;

public class bry extends bsg {
   private static final int a = 40;
   private static final Predicate<dhn> b = dhw.a(cvh.bt);
   private final bln c;
   private final csf d;
   private int e;

   public bry(bln $$0) {
      this.c = $$0;
      this.d = $$0.dN();
      this.a(EnumSet.of(bsg.a.a, bsg.a.b, bsg.a.c));
   }

   @Override
   public boolean a() {
      if (this.c.eh().a(this.c.o_() ? 50 : 1000) != 0) {
         return false;
      } else {
         hx $$0 = this.c.dn();
         return b.test(this.d.a_($$0)) ? true : this.d.a_($$0.d()).a(cvh.i);
      }
   }

   @Override
   public void c() {
      this.e = this.a(40);
      this.d.a(this.c, (byte)10);
      this.c.N().n();
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
         hx $$0 = this.c.dn();
         if (b.test(this.d.a_($$0))) {
            if (this.d.Y().b(csb.c)) {
               this.d.b($$0, false);
            }

            this.c.P();
         } else {
            hx $$1 = $$0.d();
            if (this.d.a_($$1).a(cvh.i)) {
               if (this.d.Y().b(csb.c)) {
                  this.d.c(2001, $$1, cvf.i(cvh.i.o()));
                  this.d.a($$1, cvh.j.o(), 2);
               }

               this.c.P();
            }
         }
      }
   }
}
