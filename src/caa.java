import java.util.EnumSet;
import java.util.function.Predicate;

public class caa extends cai {
   private static final int a = 40;
   private static final Predicate<drx> b = dsg.a(dew.bt);
   private final btm c;
   private final dbt d;
   private int e;

   public caa(btm $$0) {
      this.c = $$0;
      this.d = $$0.dP();
      this.a(EnumSet.of(cai.a.a, cai.a.b, cai.a.c));
   }

   @Override
   public boolean a() {
      if (this.c.el().a(this.c.p_() ? 50 : 1000) != 0) {
         return false;
      } else {
         iz $$0 = this.c.dp();
         return b.test(this.d.a_($$0)) ? true : this.d.a_($$0.d()).a(dew.i);
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
         iz $$0 = this.c.dp();
         if (b.test(this.d.a_($$0))) {
            if (this.d.ab().b(dbp.c)) {
               this.d.b($$0, false);
            }

            this.c.O();
         } else {
            iz $$1 = $$0.d();
            if (this.d.a_($$1).a(dew.i)) {
               if (this.d.ab().b(dbp.c)) {
                  this.d.c(2001, $$1, deu.i(dew.i.n()));
                  this.d.a($$1, dew.j.n(), 2);
               }

               this.c.O();
            }
         }
      }
   }
}
