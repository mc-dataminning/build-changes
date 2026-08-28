import java.util.EnumSet;
import java.util.function.Predicate;

public class ccr extends ccz {
   private static final int a = 40;
   private static final Predicate<dxn> b = dxw.a(dkg.bA);
   private final bwd c;
   private final dha d;
   private int e;

   public ccr(bwd $$0) {
      this.c = $$0;
      this.d = $$0.dV();
      this.a(EnumSet.of(ccz.a.a, ccz.a.b, ccz.a.c));
   }

   @Override
   public boolean b() {
      if (this.c.dY().a(this.c.e_() ? 50 : 1000) != 0) {
         return false;
      } else {
         jh $$0 = this.c.dv();
         return b.test(this.d.a_($$0)) ? true : this.d.a_($$0.e()).a(dkg.i);
      }
   }

   @Override
   public void d() {
      this.e = this.a(40);
      this.d.a(this.c, (byte)10);
      this.c.L().o();
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
         jh $$0 = this.c.dv();
         if (b.test(this.d.a_($$0))) {
            if (a(this.d).N().b(dgw.c)) {
               this.d.b($$0, false);
            }

            this.c.P();
         } else {
            jh $$1 = $$0.e();
            if (this.d.a_($$1).a(dkg.i)) {
               if (a(this.d).N().b(dgw.c)) {
                  this.d.c(2001, $$1, dke.j(dkg.i.m()));
                  this.d.a($$1, dkg.j.m(), 2);
               }

               this.c.P();
            }
         }
      }
   }
}
