import java.util.EnumSet;
import java.util.function.Predicate;

public class cbc extends cbk {
   private static final int a = 40;
   private static final Predicate<dus> b = dvb.a(dho.bt);
   private final bup c;
   private final dej d;
   private int e;

   public cbc(bup $$0) {
      this.c = $$0;
      this.d = $$0.dS();
      this.a(EnumSet.of(cbk.a.a, cbk.a.b, cbk.a.c));
   }

   @Override
   public boolean b() {
      if (this.c.dV().a(this.c.p_() ? 50 : 1000) != 0) {
         return false;
      } else {
         jf $$0 = this.c.ds();
         return b.test(this.d.a_($$0)) ? true : this.d.a_($$0.e()).a(dho.i);
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
         jf $$0 = this.c.ds();
         if (b.test(this.d.a_($$0))) {
            if (this.d.ac().b(def.c)) {
               this.d.b($$0, false);
            }

            this.c.S();
         } else {
            jf $$1 = $$0.e();
            if (this.d.a_($$1).a(dho.i)) {
               if (this.d.ac().b(def.c)) {
                  this.d.c(2001, $$1, dhm.j(dho.i.n()));
                  this.d.a($$1, dho.j.n(), 2);
               }

               this.c.S();
            }
         }
      }
   }
}
