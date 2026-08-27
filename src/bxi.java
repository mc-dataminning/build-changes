import java.util.EnumSet;
import java.util.function.Predicate;

public class bxi extends bxq {
   private static final int a = 40;
   private static final Predicate<dpi> b = dpr.a(dcj.bt);
   private final bqv c;
   private final czg d;
   private int e;

   public bxi(bqv $$0) {
      this.c = $$0;
      this.d = $$0.dM();
      this.a(EnumSet.of(bxq.a.a, bxq.a.b, bxq.a.c));
   }

   @Override
   public boolean a() {
      if (this.c.ei().a(this.c.p_() ? 50 : 1000) != 0) {
         return false;
      } else {
         id $$0 = this.c.dm();
         return b.test(this.d.a_($$0)) ? true : this.d.a_($$0.d()).a(dcj.i);
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
         id $$0 = this.c.dm();
         if (b.test(this.d.a_($$0))) {
            if (this.d.aa().b(czc.c)) {
               this.d.b($$0, false);
            }

            this.c.N();
         } else {
            id $$1 = $$0.d();
            if (this.d.a_($$1).a(dcj.i)) {
               if (this.d.aa().b(czc.c)) {
                  this.d.c(2001, $$1, dch.i(dcj.i.n()));
                  this.d.a($$1, dcj.j.n(), 2);
               }

               this.c.N();
            }
         }
      }
   }
}
