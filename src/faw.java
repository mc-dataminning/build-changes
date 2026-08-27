import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class faw extends eya {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int k = 64;
   private static final Logger m = LogUtils.getLogger();
   private final fiz n = new fiz();
   private final eya o;
   protected fba l;
   private fiy p;
   private esg q;
   private esg s;
   private esg t;
   @Nullable
   private List<tf> u;
   private fix v;
   private gcv.b w;
   @Nullable
   private gcv.a x;
   private boolean y;

   public faw(eya $$0) {
      super(tf.c("multiplayer.title"));
      this.o = $$0;
   }

   @Override
   protected void aC_() {
      if (this.y) {
         this.l.a(this.g, this.h, 32, this.h - 64);
      } else {
         this.y = true;
         this.p = new fiy(this.f);
         this.p.a();
         this.w = new gcv.b();

         try {
            this.x = new gcv.a(this.w);
            this.x.start();
         } catch (Exception var8) {
            m.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.l = new fba(this, this.f, this.g, this.h, 32, this.h - 64, 36);
         this.l.a(this.p);
      }

      this.e(this.l);
      this.s = this.d(esg.a(tf.c("selectServer.select"), $$0 -> this.l()).a(100).a());
      esg $$1 = this.d(esg.a(tf.c("selectServer.direct"), $$0 -> {
         this.v = new fix(gaa.a("selectServer.defaultName"), "", fix.b.c);
         this.f.a(new exb(this, this::g, this.v));
      }).a(100).a());
      esg $$2 = this.d(esg.a(tf.c("selectServer.add"), $$0 -> {
         this.v = new fix(gaa.a("selectServer.defaultName"), "", fix.b.c);
         this.f.a(new exd(this, this::f, this.v));
      }).a(100).a());
      this.q = this.d(esg.a(tf.c("selectServer.edit"), $$0 -> {
         fba.a $$1x = this.l.f();
         if ($$1x instanceof fba.d) {
            fix $$2x = ((fba.d)$$1x).d();
            this.v = new fix($$2x.a, $$2x.b, fix.b.c);
            this.v.b($$2x);
            this.f.a(new exd(this, this::e, this.v));
         }
      }).a(74).a());
      this.t = this.d(esg.a(tf.c("selectServer.delete"), $$0 -> {
         fba.a $$1x = this.l.f();
         if ($$1x instanceof fba.d) {
            String $$2x = ((fba.d)$$1x).d().a;
            if ($$2x != null) {
               tf $$3x = tf.c("selectServer.deleteQuestion");
               tf $$4x = tf.a("selectServer.deleteWarning", $$2x);
               tf $$5x = tf.c("selectServer.deleteButton");
               tf $$6x = te.e;
               this.f.a(new ewt(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      esg $$3 = this.d(esg.a(tf.c("selectServer.refresh"), $$0 -> this.F()).a(74).a());
      esg $$4 = this.d(esg.a(te.k, $$0 -> this.f.a(this.o)).a(74).a());
      evt $$5 = evt.d();
      evm $$6 = $$5.a(new evm(308, 20, evm.b.a));
      $$6.a(this.s);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(evu.b(4));
      evm $$7 = $$5.a(new evm(308, 20, evm.b.a));
      $$7.a(this.q);
      $$7.a(this.t);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      evn.a($$5, 0, this.h - 64, this.g, 64);
      this.C();
   }

   @Override
   public void c() {
      super.c();
      List<gcu> $$0 = this.w.a();
      if ($$0 != null) {
         this.l.a($$0);
      }

      this.n.a();
   }

   @Override
   public void h() {
      if (this.x != null) {
         this.x.interrupt();
         this.x = null;
      }

      this.n.b();
      this.l.d();
   }

   private void F() {
      this.f.a(new faw(this.o));
   }

   private void c(boolean $$0) {
      fba.a $$1 = this.l.f();
      if ($$0 && $$1 instanceof fba.d) {
         this.p.a(((fba.d)$$1).d());
         this.p.b();
         this.l.a(null);
         this.l.a(this.p);
      }

      this.f.a(this);
   }

   private void e(boolean $$0) {
      fba.a $$1 = this.l.f();
      if ($$0 && $$1 instanceof fba.d) {
         fix $$2 = ((fba.d)$$1).d();
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
         fix $$1 = this.p.b(this.v.b);
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
         fix $$1 = this.p.a(this.v.b);
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
         if (ewd.a($$0)) {
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
   public void a(erv $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.u = null;
      this.l.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
      if (this.u != null) {
         $$0.a(this.i, this.u, $$1, $$2);
      }
   }

   public void l() {
      fba.a $$0 = this.l.f();
      if ($$0 instanceof fba.d) {
         this.a(((fba.d)$$0).d());
      } else if ($$0 instanceof fba.c) {
         gcu $$1 = ((fba.c)$$0).b();
         this.a(new fix($$1.a(), $$1.b(), fix.b.a));
      }
   }

   private void a(fix $$0) {
      ewu.a(this, this.f, fjy.a($$0.b), $$0, false);
   }

   public void a(fba.a $$0) {
      this.l.a($$0);
      this.C();
   }

   @Override
   protected void C() {
      this.s.i = false;
      this.q.i = false;
      this.t.i = false;
      fba.a $$0 = this.l.f();
      if ($$0 != null && !($$0 instanceof fba.b)) {
         this.s.i = true;
         if ($$0 instanceof fba.d) {
            this.q.i = true;
            this.t.i = true;
         }
      }
   }

   public fiz D() {
      return this.n;
   }

   public void c(List<tf> $$0) {
      this.u = $$0;
   }

   public fiy E() {
      return this.p;
   }
}
