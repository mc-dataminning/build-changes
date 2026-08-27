import java.util.EnumSet;
import java.util.function.Predicate;

public class bvm extends bvu {
   private static final int a = 40;
   private static final Predicate<dme> b = dmn.a(czh.bt);
   private final boz c;
   private final cwe d;
   private int e;

   public bvm(boz $$0) {
      this.c = $$0;
      this.d = $$0.dJ();
      this.a(EnumSet.of(bvu.a.a, bvu.a.b, bvu.a.c));
   }

   @Override
   public boolean a() {
      if (this.c.ef().a(this.c.o_() ? 50 : 1000) != 0) {
         return false;
      } else {
         ib $$0 = this.c.dj();
         return b.test(this.d.a_($$0)) ? true : this.d.a_($$0.d()).a(czh.i);
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
         ib $$0 = this.c.dj();
         if (b.test(this.d.a_($$0))) {
            if (this.d.Z().b(cwa.c)) {
               this.d.b($$0, false);
            }

            this.c.P();
         } else {
            ib $$1 = $$0.d();
            if (this.d.a_($$1).a(czh.i)) {
               if (this.d.Z().b(cwa.c)) {
                  this.d.c(2001, $$1, czf.i(czh.i.o()));
                  this.d.a($$1, czh.j.o(), 2);
               }

               this.c.P();
            }
         }
      }
   }
}
