import java.util.EnumSet;
import java.util.function.Predicate;

public class cag extends cao {
   private static final int a = 40;
   private static final Predicate<dsd> b = dsm.a(dfc.bt);
   private final bts c;
   private final dbz d;
   private int e;

   public cag(bts $$0) {
      this.c = $$0;
      this.d = $$0.dP();
      this.a(EnumSet.of(cao.a.a, cao.a.b, cao.a.c));
   }

   @Override
   public boolean a() {
      if (this.c.el().a(this.c.p_() ? 50 : 1000) != 0) {
         return false;
      } else {
         iz $$0 = this.c.dp();
         return b.test(this.d.a_($$0)) ? true : this.d.a_($$0.d()).a(dfc.i);
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
            if (this.d.ab().b(dbv.c)) {
               this.d.b($$0, false);
            }

            this.c.O();
         } else {
            iz $$1 = $$0.d();
            if (this.d.a_($$1).a(dfc.i)) {
               if (this.d.ab().b(dbv.c)) {
                  this.d.c(2001, $$1, dfa.i(dfc.i.o()));
                  this.d.a($$1, dfc.j.o(), 2);
               }

               this.c.O();
            }
         }
      }
   }
}
