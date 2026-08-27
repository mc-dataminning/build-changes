import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fav extends exz {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int k = 64;
   private static final Logger m = LogUtils.getLogger();
   private final fiu n = new fiu();
   private final exz o;
   protected faz l;
   private fit p;
   private esh q;
   private esh s;
   private esh t;
   @Nullable
   private List<tf> u;
   private fis v;
   private gcm.b w;
   @Nullable
   private gcm.a x;
   private boolean y;

   public fav(exz $$0) {
      super(tf.c("multiplayer.title"));
      this.o = $$0;
   }

   @Override
   protected void aE_() {
      if (this.y) {
         this.l.a(this.g, this.h, 32, this.h - 64);
      } else {
         this.y = true;
         this.p = new fit(this.f);
         this.p.a();
         this.w = new gcm.b();

         try {
            this.x = new gcm.a(this.w);
            this.x.start();
         } catch (Exception var8) {
            m.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.l = new faz(this, this.f, this.g, this.h, 32, this.h - 64, 36);
         this.l.a(this.p);
      }

      this.e(this.l);
      this.s = this.d(esh.a(tf.c("selectServer.select"), $$0 -> this.l()).a(100).a());
      esh $$1 = this.d(esh.a(tf.c("selectServer.direct"), $$0 -> {
         this.v = new fis(fzr.a("selectServer.defaultName"), "", fis.b.c);
         this.f.a(new exa(this, this::g, this.v));
      }).a(100).a());
      esh $$2 = this.d(esh.a(tf.c("selectServer.add"), $$0 -> {
         this.v = new fis(fzr.a("selectServer.defaultName"), "", fis.b.c);
         this.f.a(new exc(this, this::f, this.v));
      }).a(100).a());
      this.q = this.d(esh.a(tf.c("selectServer.edit"), $$0 -> {
         faz.a $$1x = this.l.f();
         if ($$1x instanceof faz.d) {
            fis $$2x = ((faz.d)$$1x).d();
            this.v = new fis($$2x.a, $$2x.b, fis.b.c);
            this.v.b($$2x);
            this.f.a(new exc(this, this::e, this.v));
         }
      }).a(74).a());
      this.t = this.d(esh.a(tf.c("selectServer.delete"), $$0 -> {
         faz.a $$1x = this.l.f();
         if ($$1x instanceof faz.d) {
            String $$2x = ((faz.d)$$1x).d().a;
            if ($$2x != null) {
               tf $$3x = tf.c("selectServer.deleteQuestion");
               tf $$4x = tf.a("selectServer.deleteWarning", $$2x);
               tf $$5x = tf.c("selectServer.deleteButton");
               tf $$6x = te.e;
               this.f.a(new ews(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      esh $$3 = this.d(esh.a(tf.c("selectServer.refresh"), $$0 -> this.E()).a(74).a());
      esh $$4 = this.d(esh.a(te.k, $$0 -> this.f.a(this.o)).a(74).a());
      evs $$5 = evs.d();
      evl $$6 = $$5.a(new evl(308, 20, evl.b.a));
      $$6.a(this.s);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(evt.b(4));
      evl $$7 = $$5.a(new evl(308, 20, evl.b.a));
      $$7.a(this.q);
      $$7.a(this.t);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      evm.a($$5, 0, this.h - 64, this.g, 64);
      this.B();
   }

   @Override
   public void c() {
      super.c();
      List<gcl> $$0 = this.w.a();
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

   private void E() {
      this.f.a(new fav(this.o));
   }

   private void c(boolean $$0) {
      faz.a $$1 = this.l.f();
      if ($$0 && $$1 instanceof faz.d) {
         this.p.a(((faz.d)$$1).d());
         this.p.b();
         this.l.a(null);
         this.l.a(this.p);
      }

      this.f.a(this);
   }

   private void e(boolean $$0) {
      faz.a $$1 = this.l.f();
      if ($$0 && $$1 instanceof faz.d) {
         fis $$2 = ((faz.d)$$1).d();
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
         fis $$1 = this.p.b(this.v.b);
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
         fis $$1 = this.p.a(this.v.b);
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
         this.E();
         return true;
      } else if (this.l.f() != null) {
         if (ewc.a($$0)) {
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
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.u = null;
      this.l.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
      if (this.u != null) {
         $$0.a(this.i, this.u, $$1, $$2);
      }
   }

   public void l() {
      faz.a $$0 = this.l.f();
      if ($$0 instanceof faz.d) {
         this.a(((faz.d)$$0).d());
      } else if ($$0 instanceof faz.c) {
         gcl $$1 = ((faz.c)$$0).b();
         this.a(new fis($$1.a(), $$1.b(), fis.b.a));
      }
   }

   private void a(fis $$0) {
      ewt.a(this, this.f, fjp.a($$0.b), $$0, false);
   }

   public void a(faz.a $$0) {
      this.l.a($$0);
      this.B();
   }

   @Override
   protected void B() {
      this.s.i = false;
      this.q.i = false;
      this.t.i = false;
      faz.a $$0 = this.l.f();
      if ($$0 != null && !($$0 instanceof faz.b)) {
         this.s.i = true;
         if ($$0 instanceof faz.d) {
            this.q.i = true;
            this.t.i = true;
         }
      }
   }

   public fiu C() {
      return this.n;
   }

   public void c(List<tf> $$0) {
      this.u = $$0;
   }

   public fit D() {
      return this.p;
   }
}
