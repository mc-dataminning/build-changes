import java.util.EnumSet;
import java.util.function.Predicate;

public class bux extends bvf {
   private static final int a = 40;
   private static final Predicate<dlj> b = dls.a(cyu.bt);
   private final bok c;
   private final cvr d;
   private int e;

   public bux(bok $$0) {
      this.c = $$0;
      this.d = $$0.dM();
      this.a(EnumSet.of(bvf.a.a, bvf.a.b, bvf.a.c));
   }

   @Override
   public boolean a() {
      if (this.c.eh().a(this.c.o_() ? 50 : 1000) != 0) {
         return false;
      } else {
         hz $$0 = this.c.dm();
         return b.test(this.d.a_($$0)) ? true : this.d.a_($$0.d()).a(cyu.i);
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
         hz $$0 = this.c.dm();
         if (b.test(this.d.a_($$0))) {
            if (this.d.Z().b(cvn.c)) {
               this.d.b($$0, false);
            }

            this.c.P();
         } else {
            hz $$1 = $$0.d();
            if (this.d.a_($$1).a(cyu.i)) {
               if (this.d.Z().b(cvn.c)) {
                  this.d.c(2001, $$1, cys.i(cyu.i.o()));
                  this.d.a($$1, cyu.j.o(), 2);
               }

               this.c.P();
            }
         }
      }
   }
}
