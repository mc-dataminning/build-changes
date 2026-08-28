import java.util.EnumSet;
import java.util.function.Predicate;

public class cae extends cam {
   private static final int a = 40;
   private static final Predicate<dtc> b = dtl.a(dga.bt);
   private final btp c;
   private final dcw d;
   private int e;

   public cae(btp $$0) {
      this.c = $$0;
      this.d = $$0.dP();
      this.a(EnumSet.of(cam.a.a, cam.a.b, cam.a.c));
   }

   @Override
   public boolean b() {
      if (this.c.dS().a(this.c.o_() ? 50 : 1000) != 0) {
         return false;
      } else {
         jd $$0 = this.c.dp();
         return b.test(this.d.a_($$0)) ? true : this.d.a_($$0.e()).a(dga.i);
      }
   }

   @Override
   public void d() {
      this.e = this.a(40);
      this.d.a(this.c, (byte)10);
      this.c.N().n();
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
         jd $$0 = this.c.dp();
         if (b.test(this.d.a_($$0))) {
            if (this.d.ab().b(dcs.c)) {
               this.d.b($$0, false);
            }

            this.c.Q();
         } else {
            jd $$1 = $$0.e();
            if (this.d.a_($$1).a(dga.i)) {
               if (this.d.ab().b(dcs.c)) {
                  this.d.c(2001, $$1, dfy.i(dga.i.o()));
                  this.d.a($$1, dga.j.o(), 2);
               }

               this.c.Q();
            }
         }
      }
   }
}
