import java.util.EnumSet;
import javax.annotation.Nullable;

public class ccz extends cbt {
   private static final int a = 10;
   private final bvd b;
   private final int c;
   @Nullable
   private jg d;

   public ccz(bvd $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
      this.a(EnumSet.of(cbt.a.a));
   }

   @Override
   public boolean b() {
      if (this.b.cZ()) {
         return false;
      } else if (this.b.dX().S()) {
         return false;
      } else if (this.b.ea().a(this.c) != 0) {
         return false;
      } else {
         arm $$0 = (arm)this.b.dX();
         jg $$1 = this.b.dx();
         if (!$$0.a($$1, 6)) {
            return false;
         } else {
            ezh $$2 = cft.a(this.b, 15, 7, $$1x -> (double)(-$$0.b(ki.a($$1x))));
            this.d = $$2 == null ? null : jg.a((jz)$$2);
            return this.d != null;
         }
      }
   }

   @Override
   public boolean c() {
      return this.d != null && !this.b.P().m() && this.b.P().i().equals(this.d);
   }

   @Override
   public void a() {
      if (this.d != null) {
         ceh $$0 = this.b.P();
         if ($$0.m() && !this.d.a(this.b.dv(), 10.0)) {
            ezh $$1 = ezh.c(this.d);
            ezh $$2 = this.b.dv();
            ezh $$3 = $$2.d($$1);
            $$1 = $$3.c(0.4).e($$1);
            ezh $$4 = $$1.d($$2).d().c(10.0).e($$2);
            jg $$5 = jg.a((jz)$$4);
            $$5 = this.b.dX().a(eaz.a.f, $$5);
            if (!$$0.a((double)$$5.u(), (double)$$5.v(), (double)$$5.w(), 1.0)) {
               this.h();
            }
         }
      }
   }

   private void h() {
      azr $$0 = this.b.ea();
      jg $$1 = this.b.dX().a(eaz.a.f, this.b.dx().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
      this.b.P().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 1.0);
   }
}
