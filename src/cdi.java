import java.util.EnumSet;
import javax.annotation.Nullable;

public class cdi extends ccc {
   private static final int a = 10;
   private final bvm b;
   private final int c;
   @Nullable
   private jh d;

   public cdi(bvm $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
      this.a(EnumSet.of(ccc.a.a));
   }

   @Override
   public boolean b() {
      if (this.b.da()) {
         return false;
      } else if (this.b.dY().S()) {
         return false;
      } else if (this.b.eb().a(this.c) != 0) {
         return false;
      } else {
         arq $$0 = (arq)this.b.dY();
         jh $$1 = this.b.dy();
         if (!$$0.a($$1, 6)) {
            return false;
         } else {
            ezr $$2 = cgc.a(this.b, 15, 7, $$1x -> (double)(-$$0.b(kj.a($$1x))));
            this.d = $$2 == null ? null : jh.a((ka)$$2);
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
         ceq $$0 = this.b.P();
         if ($$0.m() && !this.d.a(this.b.dw(), 10.0)) {
            ezr $$1 = ezr.c(this.d);
            ezr $$2 = this.b.dw();
            ezr $$3 = $$2.d($$1);
            $$1 = $$3.c(0.4).e($$1);
            ezr $$4 = $$1.d($$2).d().c(10.0).e($$2);
            jh $$5 = jh.a((ka)$$4);
            $$5 = this.b.dY().a(ebj.a.f, $$5);
            if (!$$0.a((double)$$5.u(), (double)$$5.v(), (double)$$5.w(), 1.0)) {
               this.h();
            }
         }
      }
   }

   private void h() {
      azv $$0 = this.b.eb();
      jh $$1 = this.b.dY().a(ebj.a.f, this.b.dy().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
      this.b.P().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 1.0);
   }
}
