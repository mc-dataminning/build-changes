import java.util.EnumSet;
import java.util.function.Predicate;

public class bst extends btb {
   private static final int a = 40;
   private static final Predicate<dja> b = djj.a(cwl.bt);
   private final bmh c;
   private final cti d;
   private int e;

   public bst(bmh $$0) {
      this.c = $$0;
      this.d = $$0.dM();
      this.a(EnumSet.of(btb.a.a, btb.a.b, btb.a.c));
   }

   @Override
   public boolean a() {
      if (this.c.eg().a(this.c.o_() ? 50 : 1000) != 0) {
         return false;
      } else {
         hx $$0 = this.c.dm();
         return b.test(this.d.a_($$0)) ? true : this.d.a_($$0.d()).a(cwl.i);
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
         hx $$0 = this.c.dm();
         if (b.test(this.d.a_($$0))) {
            if (this.d.Z().b(cte.c)) {
               this.d.b($$0, false);
            }

            this.c.P();
         } else {
            hx $$1 = $$0.d();
            if (this.d.a_($$1).a(cwl.i)) {
               if (this.d.Z().b(cte.c)) {
                  this.d.c(2001, $$1, cwj.i(cwl.i.o()));
                  this.d.a($$1, cwl.j.o(), 2);
               }

               this.c.P();
            }
         }
      }
   }
}
