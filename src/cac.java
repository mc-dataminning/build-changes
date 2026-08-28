import java.util.EnumSet;
import java.util.function.Predicate;

public class cac extends cak {
   private static final int a = 40;
   private static final Predicate<dta> b = dtj.a(dfy.bt);
   private final btn c;
   private final dcu d;
   private int e;

   public cac(btn $$0) {
      this.c = $$0;
      this.d = $$0.dQ();
      this.a(EnumSet.of(cak.a.a, cak.a.b, cak.a.c));
   }

   @Override
   public boolean b() {
      if (this.c.dT().a(this.c.o_() ? 50 : 1000) != 0) {
         return false;
      } else {
         jd $$0 = this.c.dq();
         return b.test(this.d.a_($$0)) ? true : this.d.a_($$0.d()).a(dfy.i);
      }
   }

   @Override
   public void d() {
      this.e = this.a(40);
      this.d.a(this.c, (byte)10);
      this.c.J().n();
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
         jd $$0 = this.c.dq();
         if (b.test(this.d.a_($$0))) {
            if (this.d.ab().b(dcq.c)) {
               this.d.b($$0, false);
            }

            this.c.O();
         } else {
            jd $$1 = $$0.d();
            if (this.d.a_($$1).a(dfy.i)) {
               if (this.d.ab().b(dcq.c)) {
                  this.d.c(2001, $$1, dfw.i(dfy.i.o()));
                  this.d.a($$1, dfy.j.o(), 2);
               }

               this.c.O();
            }
         }
      }
   }
}
