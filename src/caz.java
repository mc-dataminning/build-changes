import java.util.EnumSet;
import java.util.function.Predicate;

public class caz extends cbh {
   private static final int a = 40;
   private static final Predicate<duo> b = dux.a(dhl.bt);
   private final bum c;
   private final deg d;
   private int e;

   public caz(bum $$0) {
      this.c = $$0;
      this.d = $$0.dS();
      this.a(EnumSet.of(cbh.a.a, cbh.a.b, cbh.a.c));
   }

   @Override
   public boolean b() {
      if (this.c.dV().a(this.c.o_() ? 50 : 1000) != 0) {
         return false;
      } else {
         je $$0 = this.c.ds();
         return b.test(this.d.a_($$0)) ? true : this.d.a_($$0.e()).a(dhl.i);
      }
   }

   @Override
   public void d() {
      this.e = this.a(40);
      this.d.a(this.c, (byte)10);
      this.c.P().o();
   }

   @Override
   public void e() {
      this.e = 0;
   }

   @Override
   public boolean c() {
      return this.e > 0;
   }

   public int h() {
      return this.e;
   }

   @Override
   public void a() {
      this.e = Math.max(0, this.e - 1);
      if (this.e == this.a(4)) {
         je $$0 = this.c.ds();
         if (b.test(this.d.a_($$0))) {
            if (this.d.ac().b(dec.c)) {
               this.d.b($$0, false);
            }

            this.c.S();
         } else {
            je $$1 = $$0.e();
            if (this.d.a_($$1).a(dhl.i)) {
               if (this.d.ac().b(dec.c)) {
                  this.d.c(2001, $$1, dhj.j(dhl.i.o()));
                  this.d.a($$1, dhl.j.o(), 2);
               }

               this.c.S();
            }
         }
      }
   }
}
