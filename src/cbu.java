import java.util.EnumSet;
import java.util.function.Predicate;

public class cbu extends ccc {
   private static final int a = 40;
   private static final Predicate<dvo> b = dvx.a(dil.bt);
   private final bvg c;
   private final dff d;
   private int e;

   public cbu(bvg $$0) {
      this.c = $$0;
      this.d = $$0.dY();
      this.a(EnumSet.of(ccc.a.a, ccc.a.b, ccc.a.c));
   }

   @Override
   public boolean b() {
      if (this.c.eb().a(this.c.p_() ? 50 : 1000) != 0) {
         return false;
      } else {
         jh $$0 = this.c.dy();
         return b.test(this.d.a_($$0)) ? true : this.d.a_($$0.e()).a(dil.i);
      }
   }

   @Override
   public void d() {
      this.e = this.a(40);
      this.d.a(this.c, (byte)10);
      this.c.P().o();
   }

   @Override
   public void e() {
      this.e = 0;
   }

   @Override
   public boolean c() {
      return this.e > 0;
   }

   public int h() {
      return this.e;
   }

   @Override
   public void a() {
      this.e = Math.max(0, this.e - 1);
      if (this.e == this.a(4)) {
         jh $$0 = this.c.dy();
         if (b.test(this.d.a_($$0))) {
            if (this.d.ac().b(dfb.c)) {
               this.d.b($$0, false);
            }

            this.c.S();
         } else {
            jh $$1 = $$0.e();
            if (this.d.a_($$1).a(dil.i)) {
               if (this.d.ac().b(dfb.c)) {
                  this.d.c(2001, $$1, dij.j(dil.i.m()));
                  this.d.a($$1, dil.j.m(), 2);
               }

               this.c.S();
            }
         }
      }
   }
}
