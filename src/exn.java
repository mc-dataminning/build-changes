import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class exn extends euq {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int k = 64;
   private static final Logger m = LogUtils.getLogger();
   private final fff n = new fff();
   private final euq o;
   protected exq l;
   private ffe p;
   private epi q;
   private epi r;
   private epi s;
   @Nullable
   private List<sw> t;
   private ffd u;
   private fyr.b v;
   @Nullable
   private fyr.a w;
   private boolean x;

   public exn(euq $$0) {
      super(sw.c("multiplayer.title"));
      this.o = $$0;
   }

   @Override
   protected void b() {
      if (this.x) {
         this.l.a(this.g, this.h, 32, this.h - 64);
      } else {
         this.x = true;
         this.p = new ffe(this.f);
         this.p.a();
         this.v = new fyr.b();

         try {
            this.w = new fyr.a(this.v);
            this.w.start();
         } catch (Exception var9) {
            m.warn("Unable to start LAN server detection: {}", var9.getMessage());
         }

         this.l = new exq(this, this.f, this.g, this.h, 32, this.h - 64, 36);
         this.l.a(this.p);
      }

      this.e(this.l);
      this.r = this.d(epi.a(sw.c("selectServer.select"), $$0 -> this.l()).a(100).a());
      epi $$1 = this.d(epi.a(sw.c("selectServer.direct"), $$0 -> {
         this.u = new ffd(fvz.a("selectServer.defaultName"), "", false);
         this.f.a(new ets(this, this::g, this.u));
      }).a(100).a());
      epi $$2 = this.d(epi.a(sw.c("selectServer.add"), $$0 -> {
         this.u = new ffd(fvz.a("selectServer.defaultName"), "", false);
         this.f.a(new etu(this, this::f, this.u));
      }).a(100).a());
      this.q = this.d(epi.a(sw.c("selectServer.edit"), $$0 -> {
         exq.a $$1x = this.l.f();
         if ($$1x instanceof exq.d) {
            ffd $$2x = ((exq.d)$$1x).d();
            this.u = new ffd($$2x.a, $$2x.b, false);
            this.u.b($$2x);
            this.f.a(new etu(this, this::e, this.u));
         }
      }).a(74).a());
      this.s = this.d(epi.a(sw.c("selectServer.delete"), $$0 -> {
         exq.a $$1x = this.l.f();
         if ($$1x instanceof exq.d) {
            String $$2x = ((exq.d)$$1x).d().a;
            if ($$2x != null) {
               sw $$3x = sw.c("selectServer.deleteQuestion");
               sw $$4x = sw.a("selectServer.deleteWarning", $$2x);
               sw $$5x = sw.c("selectServer.deleteButton");
               sw $$6x = sv.e;
               this.f.a(new etk(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      epi $$3 = this.d(epi.a(sw.c("selectServer.refresh"), $$0 -> this.E()).a(74).a());
      epi $$4 = this.d(epi.a(sv.e, $$0 -> this.f.a(this.o)).a(74).a());
      esf $$5 = new esf();
      esf.b $$6 = $$5.d(1);
      esk $$7 = $$6.a(new esk(308, 20, esk.b.a));
      $$7.a(this.r);
      $$7.a($$1);
      $$7.a($$2);
      $$6.a(esl.b(4));
      esk $$8 = $$6.a(new esk(308, 20, esk.b.a));
      $$8.a(this.q);
      $$8.a(this.s);
      $$8.a($$3);
      $$8.a($$4);
      $$5.c();
      ese.a($$5, 0, this.h - 64, this.g, 64);
      this.B();
   }

   @Override
   public void f() {
      super.f();
      List<fyq> $$0 = this.v.a();
      if ($$0 != null) {
         this.l.a($$0);
      }

      this.n.a();
   }

   @Override
   public void ax_() {
      if (this.w != null) {
         this.w.interrupt();
         this.w = null;
      }

      this.n.b();
      this.l.d();
   }

   private void E() {
      this.f.a(new exn(this.o));
   }

   private void c(boolean $$0) {
      exq.a $$1 = this.l.f();
      if ($$0 && $$1 instanceof exq.d) {
         this.p.a(((exq.d)$$1).d());
         this.p.b();
         this.l.a(null);
         this.l.a(this.p);
      }

      this.f.a(this);
   }

   private void e(boolean $$0) {
      exq.a $$1 = this.l.f();
      if ($$0 && $$1 instanceof exq.d) {
         ffd $$2 = ((exq.d)$$1).d();
         $$2.a = this.u.a;
         $$2.b = this.u.b;
         $$2.b(this.u);
         this.p.b();
         this.l.a(this.p);
      }

      this.f.a(this);
   }

   private void f(boolean $$0) {
      if ($$0) {
         ffd $$1 = this.p.b(this.u.b);
         if ($$1 != null) {
            $$1.a(this.u);
            this.p.b();
         } else {
            this.p.a(this.u, false);
            this.p.b();
         }

         this.l.a(null);
         this.l.a(this.p);
      }

      this.f.a(this);
   }

   private void g(boolean $$0) {
      if ($$0) {
         ffd $$1 = this.p.a(this.u.b);
         if ($$1 == null) {
            this.p.a(this.u, true);
            this.p.b();
            this.a(this.u);
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
         if (esu.a($$0)) {
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
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.t = null;
      this.a($$0);
      this.l.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
      super.a($$0, $$1, $$2, $$3);
      if (this.t != null) {
         $$0.a(this.i, this.t, $$1, $$2);
      }
   }

   public void l() {
      exq.a $$0 = this.l.f();
      if ($$0 instanceof exq.d) {
         this.a(((exq.d)$$0).d());
      } else if ($$0 instanceof exq.c) {
         fyq $$1 = ((exq.c)$$0).b();
         this.a(new ffd($$1.a(), $$1.b(), true));
      }
   }

   private void a(ffd $$0) {
      etl.a(this, this.f, fga.a($$0.b), $$0, false);
   }

   public void a(exq.a $$0) {
      this.l.a($$0);
      this.B();
   }

   @Override
   protected void B() {
      this.r.r = false;
      this.q.r = false;
      this.s.r = false;
      exq.a $$0 = this.l.f();
      if ($$0 != null && !($$0 instanceof exq.b)) {
         this.r.r = true;
         if ($$0 instanceof exq.d) {
            this.q.r = true;
            this.s.r = true;
         }
      }
   }

   public fff C() {
      return this.n;
   }

   public void c(List<sw> $$0) {
      this.t = $$0;
   }

   public ffe D() {
      return this.p;
   }
}
