import java.util.EnumSet;
import java.util.function.Predicate;

public class bqw extends bre {
   private static final int a = 40;
   private static final Predicate<dgb> b = dgk.a(cuc.bt);
   private final bkl c;
   private final cqz d;
   private int e;

   public bqw(bkl $$0) {
      this.c = $$0;
      this.d = $$0.dL();
      this.a(EnumSet.of(bre.a.a, bre.a.b, bre.a.c));
   }

   @Override
   public boolean a() {
      if (this.c.ef().a(this.c.n_() ? 50 : 1000) != 0) {
         return false;
      } else {
         ht $$0 = this.c.dl();
         return b.test(this.d.a_($$0)) ? true : this.d.a_($$0.d()).a(cuc.i);
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
            if (this.d.X().b(cqv.c)) {
               this.d.b($$0, false);
            }

            this.c.N();
         } else {
            ht $$1 = $$0.d();
            if (this.d.a_($$1).a(cuc.i)) {
               if (this.d.X().b(cqv.c)) {
                  this.d.c(2001, $$1, cua.i(cuc.i.o()));
                  this.d.a($$1, cuc.j.o(), 2);
               }

               this.c.N();
            }
         }
      }
   }
}
