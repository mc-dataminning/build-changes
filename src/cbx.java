import java.util.EnumSet;
import java.util.function.Predicate;

public class cbx extends ccf {
   private static final int a = 40;
   private static final Predicate<dwx> b = dxg.a(djo.bA);
   private final bvj c;
   private final dgi d;
   private int e;

   public cbx(bvj $$0) {
      this.c = $$0;
      this.d = $$0.dV();
      this.a(EnumSet.of(ccf.a.a, ccf.a.b, ccf.a.c));
   }

   @Override
   public boolean b() {
      if (this.c.dY().a(this.c.e_() ? 50 : 1000) != 0) {
         return false;
      } else {
         ji $$0 = this.c.dv();
         return b.test(this.d.a_($$0)) ? true : this.d.a_($$0.e()).a(djo.i);
      }
   }

   @Override
   public void d() {
      this.e = this.a(40);
      this.d.a(this.c, (byte)10);
      this.c.P().m();
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
         ji $$0 = this.c.dv();
         if (b.test(this.d.a_($$0))) {
            if (a(this.d).O().b(dge.c)) {
               this.d.b($$0, false);
            }

            this.c.S();
         } else {
            ji $$1 = $$0.e();
            if (this.d.a_($$1).a(djo.i)) {
               if (a(this.d).O().b(dge.c)) {
                  this.d.c(2001, $$1, djm.j(djo.i.m()));
                  this.d.a($$1, djo.j.m(), 2);
               }

               this.c.S();
            }
         }
      }
   }
}
