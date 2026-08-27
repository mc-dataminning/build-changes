import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fbb extends eyf {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int k = 64;
   private static final Logger m = LogUtils.getLogger();
   private final fje n = new fje();
   private final eyf o;
   protected fbf l;
   private fjd p;
   private esl q;
   private esl s;
   private esl t;
   @Nullable
   private List<ti> u;
   private fjc v;
   private gda.b w;
   @Nullable
   private gda.a x;
   private boolean y;

   public fbb(eyf $$0) {
      super(ti.c("multiplayer.title"));
      this.o = $$0;
   }

   @Override
   protected void aD_() {
      if (this.y) {
         this.l.a(this.g, this.h, 32, this.h - 64);
      } else {
         this.y = true;
         this.p = new fjd(this.f);
         this.p.a();
         this.w = new gda.b();

         try {
            this.x = new gda.a(this.w);
            this.x.start();
         } catch (Exception var8) {
            m.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.l = new fbf(this, this.f, this.g, this.h, 32, this.h - 64, 36);
         this.l.a(this.p);
      }

      this.e(this.l);
      this.s = this.d(esl.a(ti.c("selectServer.select"), $$0 -> this.l()).a(100).a());
      esl $$1 = this.d(esl.a(ti.c("selectServer.direct"), $$0 -> {
         this.v = new fjc(gaf.a("selectServer.defaultName"), "", fjc.b.c);
         this.f.a(new exg(this, this::g, this.v));
      }).a(100).a());
      esl $$2 = this.d(esl.a(ti.c("selectServer.add"), $$0 -> {
         this.v = new fjc(gaf.a("selectServer.defaultName"), "", fjc.b.c);
         this.f.a(new exi(this, this::f, this.v));
      }).a(100).a());
      this.q = this.d(esl.a(ti.c("selectServer.edit"), $$0 -> {
         fbf.a $$1x = this.l.f();
         if ($$1x instanceof fbf.d) {
            fjc $$2x = ((fbf.d)$$1x).d();
            this.v = new fjc($$2x.a, $$2x.b, fjc.b.c);
            this.v.b($$2x);
            this.f.a(new exi(this, this::e, this.v));
         }
      }).a(74).a());
      this.t = this.d(esl.a(ti.c("selectServer.delete"), $$0 -> {
         fbf.a $$1x = this.l.f();
         if ($$1x instanceof fbf.d) {
            String $$2x = ((fbf.d)$$1x).d().a;
            if ($$2x != null) {
               ti $$3x = ti.c("selectServer.deleteQuestion");
               ti $$4x = ti.a("selectServer.deleteWarning", $$2x);
               ti $$5x = ti.c("selectServer.deleteButton");
               ti $$6x = th.e;
               this.f.a(new ewy(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      esl $$3 = this.d(esl.a(ti.c("selectServer.refresh"), $$0 -> this.F()).a(74).a());
      esl $$4 = this.d(esl.a(th.k, $$0 -> this.f.a(this.o)).a(74).a());
      evy $$5 = evy.d();
      evr $$6 = $$5.a(new evr(308, 20, evr.b.a));
      $$6.a(this.s);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(evz.b(4));
      evr $$7 = $$5.a(new evr(308, 20, evr.b.a));
      $$7.a(this.q);
      $$7.a(this.t);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      evs.a($$5, 0, this.h - 64, this.g, 64);
      this.C();
   }

   @Override
   public void c() {
      super.c();
      List<gcz> $$0 = this.w.a();
      if ($$0 != null) {
         this.l.a($$0);
      }

      this.n.a();
   }

   @Override
   public void av_() {
      if (this.x != null) {
         this.x.interrupt();
         this.x = null;
      }

      this.n.b();
      this.l.d();
   }

   private void F() {
      this.f.a(new fbb(this.o));
   }

   private void c(boolean $$0) {
      fbf.a $$1 = this.l.f();
      if ($$0 && $$1 instanceof fbf.d) {
         this.p.a(((fbf.d)$$1).d());
         this.p.b();
         this.l.a(null);
         this.l.a(this.p);
      }

      this.f.a(this);
   }

   private void e(boolean $$0) {
      fbf.a $$1 = this.l.f();
      if ($$0 && $$1 instanceof fbf.d) {
         fjc $$2 = ((fbf.d)$$1).d();
         $$2.a = this.v.a;
         $$2.b = this.v.b;
         $$2.b(this.v);
         this.p.b();
         this.l.a(this.p);
      }

      this.f.a(this);
   }

   private void f(boolean $$0) {
      if ($$0) {
         fjc $$1 = this.p.b(this.v.b);
         if ($$1 != null) {
            $$1.a(this.v);
            this.p.b();
         } else {
            this.p.a(this.v, false);
            this.p.b();
         }

         this.l.a(null);
         this.l.a(this.p);
      }

      this.f.a(this);
   }

   private void g(boolean $$0) {
      if ($$0) {
         fjc $$1 = this.p.a(this.v.b);
         if ($$1 == null) {
            this.p.a(this.v, true);
            this.p.b();
            this.a(this.v);
         } else {
            this.a($$1);
         }
      } else {
         this.f.a(this);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if ($$0 == 294) {
         this.F();
         return true;
      } else if (this.l.f() != null) {
         if (ewi.a($$0)) {
            this.l();
            return true;
         } else {
            return this.l.a($$0, $$1, $$2);
         }
      } else {
         return false;
      }
   }

   @Override
   public void a(esa $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.u = null;
      this.l.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
      if (this.u != null) {
         $$0.a(this.i, this.u, $$1, $$2);
      }
   }

   public void l() {
      fbf.a $$0 = this.l.f();
      if ($$0 instanceof fbf.d) {
         this.a(((fbf.d)$$0).d());
      } else if ($$0 instanceof fbf.c) {
         gcz $$1 = ((fbf.c)$$0).b();
         this.a(new fjc($$1.a(), $$1.b(), fjc.b.a));
      }
   }

   private void a(fjc $$0) {
      ewz.a(this, this.f, fkd.a($$0.b), $$0, false);
   }

   public void a(fbf.a $$0) {
      this.l.a($$0);
      this.C();
   }

   @Override
   protected void C() {
      this.s.i = false;
      this.q.i = false;
      this.t.i = false;
      fbf.a $$0 = this.l.f();
      if ($$0 != null && !($$0 instanceof fbf.b)) {
         this.s.i = true;
         if ($$0 instanceof fbf.d) {
            this.q.i = true;
            this.t.i = true;
         }
      }
   }

   public fje D() {
      return this.n;
   }

   public void c(List<ti> $$0) {
      this.u = $$0;
   }

   public fjd E() {
      return this.p;
   }
}
