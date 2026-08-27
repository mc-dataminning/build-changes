import java.util.EnumSet;
import java.util.function.Predicate;

public class brl extends brt {
   private static final int a = 40;
   private static final Predicate<dgw> b = dhf.a(cuv.bt);
   private final bla c;
   private final crs d;
   private int e;

   public brl(bla $$0) {
      this.c = $$0;
      this.d = $$0.dL();
      this.a(EnumSet.of(brt.a.a, brt.a.b, brt.a.c));
   }

   @Override
   public boolean a() {
      if (this.c.ef().a(this.c.n_() ? 50 : 1000) != 0) {
         return false;
      } else {
         ht $$0 = this.c.dl();
         return b.test(this.d.a_($$0)) ? true : this.d.a_($$0.d()).a(cuv.i);
      }
   }

   @Override
   public void c() {
      this.e = this.a(40);
      this.d.a(this.c, (byte)10);
      this.c.L().n();
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
         ht $$0 = this.c.dl();
         if (b.test(this.d.a_($$0))) {
            if (this.d.X().b(cro.c)) {
               this.d.b($$0, false);
            }

            this.c.N();
         } else {
            ht $$1 = $$0.d();
            if (this.d.a_($$1).a(cuv.i)) {
               if (this.d.X().b(cro.c)) {
                  this.d.c(2001, $$1, cut.i(cuv.i.o()));
                  this.d.a($$1, cuv.j.o(), 2);
               }

               this.c.N();
            }
         }
      }
   }
}
