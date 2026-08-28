import java.util.EnumSet;
import java.util.function.Predicate;

public class cae extends cam {
   private static final int a = 40;
   private static final Predicate<dsb> b = dsk.a(dfa.bt);
   private final btq c;
   private final dbx d;
   private int e;

   public cae(btq $$0) {
      this.c = $$0;
      this.d = $$0.dP();
      this.a(EnumSet.of(cam.a.a, cam.a.b, cam.a.c));
   }

   @Override
   public boolean a() {
      if (this.c.el().a(this.c.p_() ? 50 : 1000) != 0) {
         return false;
      } else {
         iz $$0 = this.c.dp();
         return b.test(this.d.a_($$0)) ? true : this.d.a_($$0.d()).a(dfa.i);
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
            if (this.d.ab().b(dbt.c)) {
               this.d.b($$0, false);
            }

            this.c.O();
         } else {
            iz $$1 = $$0.d();
            if (this.d.a_($$1).a(dfa.i)) {
               if (this.d.ab().b(dbt.c)) {
                  this.d.c(2001, $$1, dey.i(dfa.i.o()));
                  this.d.a($$1, dfa.j.o(), 2);
               }

               this.c.O();
            }
         }
      }
   }
}
