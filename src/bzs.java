import java.util.EnumSet;
import java.util.function.Predicate;

public class bzs extends caa {
   private static final int a = 40;
   private static final Predicate<dsl> b = dsu.a(dfk.bt);
   private final bte c;
   private final dcg d;
   private int e;

   public bzs(bte $$0) {
      this.c = $$0;
      this.d = $$0.dR();
      this.a(EnumSet.of(caa.a.a, caa.a.b, caa.a.c));
   }

   @Override
   public boolean a() {
      if (this.c.dU().a(this.c.o_() ? 50 : 1000) != 0) {
         return false;
      } else {
         ja $$0 = this.c.dr();
         return b.test(this.d.a_($$0)) ? true : this.d.a_($$0.d()).a(dfk.i);
      }
   }

   @Override
   public void c() {
      this.e = this.a(40);
      this.d.a(this.c, (byte)10);
      this.c.J().n();
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
         ja $$0 = this.c.dr();
         if (b.test(this.d.a_($$0))) {
            if (this.d.ab().b(dcc.c)) {
               this.d.b($$0, false);
            }

            this.c.O();
         } else {
            ja $$1 = $$0.d();
            if (this.d.a_($$1).a(dfk.i)) {
               if (this.d.ab().b(dcc.c)) {
                  this.d.c(2001, $$1, dfi.i(dfk.i.o()));
                  this.d.a($$1, dfk.j.o(), 2);
               }

               this.c.O();
            }
         }
      }
   }
}
