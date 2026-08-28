import java.util.EnumSet;
import java.util.function.Predicate;

public class cco extends ccw {
   private static final int a = 40;
   private static final Predicate<dxq> b = dxz.a(dkg.bA);
   private final bwa c;
   private final dgz d;
   private int e;

   public cco(bwa $$0) {
      this.c = $$0;
      this.d = $$0.dU();
      this.a(EnumSet.of(ccw.a.a, ccw.a.b, ccw.a.c));
   }

   @Override
   public boolean b() {
      if (this.c.dX().a(this.c.n_() ? 50 : 1000) != 0) {
         return false;
      } else {
         ji $$0 = this.c.du();
         return b.test(this.d.a_($$0)) ? true : this.d.a_($$0.e()).a(dkg.i);
      }
   }

   @Override
   public void d() {
      this.e = this.a(40);
      this.d.a(this.c, (byte)10);
      this.c.O().m();
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
         ji $$0 = this.c.du();
         if (b.test(this.d.a_($$0))) {
            if (a(this.d).O().b(dgv.c)) {
               this.d.b($$0, false);
            }

            this.c.R();
         } else {
            ji $$1 = $$0.e();
            if (this.d.a_($$1).a(dkg.i)) {
               if (a(this.d).O().b(dgv.c)) {
                  this.d.c(2001, $$1, dke.j(dkg.i.m()));
                  this.d.a($$1, dkg.j.m(), 2);
               }

               this.c.R();
            }
         }
      }
   }
}
