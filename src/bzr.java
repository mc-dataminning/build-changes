import java.util.EnumSet;
import java.util.function.Predicate;

public class bzr extends bzz {
   private static final int a = 40;
   private static final Predicate<dsk> b = dst.a(dfj.bt);
   private final btd c;
   private final dcf d;
   private int e;

   public bzr(btd $$0) {
      this.c = $$0;
      this.d = $$0.dQ();
      this.a(EnumSet.of(bzz.a.a, bzz.a.b, bzz.a.c));
   }

   @Override
   public boolean a() {
      if (this.c.dT().a(this.c.p_() ? 50 : 1000) != 0) {
         return false;
      } else {
         ja $$0 = this.c.dq();
         return b.test(this.d.a_($$0)) ? true : this.d.a_($$0.d()).a(dfj.i);
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
         ja $$0 = this.c.dq();
         if (b.test(this.d.a_($$0))) {
            if (this.d.ab().b(dcb.c)) {
               this.d.b($$0, false);
            }

            this.c.O();
         } else {
            ja $$1 = $$0.d();
            if (this.d.a_($$1).a(dfj.i)) {
               if (this.d.ab().b(dcb.c)) {
                  this.d.c(2001, $$1, dfh.i(dfj.i.o()));
                  this.d.a($$1, dfj.j.o(), 2);
               }

               this.c.O();
            }
         }
      }
   }
}
