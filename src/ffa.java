import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ffa extends fcc {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int k = 64;
   private static final Logger m = LogUtils.getLogger();
   private final fng n = new fng();
   private final fcc o;
   protected ffe l;
   private fnf p;
   private ewh q;
   private ewh r;
   private ewh t;
   @Nullable
   private List<vb> u;
   private fne v;
   private ghp.b w;
   @Nullable
   private ghp.a x;
   private boolean y;

   public ffa(fcc $$0) {
      super(vb.c("multiplayer.title"));
      this.o = $$0;
   }

   @Override
   protected void aP_() {
      if (this.y) {
         this.l.a(this.g, this.h, 32, this.h - 64);
      } else {
         this.y = true;
         this.p = new fnf(this.f);
         this.p.a();
         this.w = new ghp.b();

         try {
            this.x = new ghp.a(this.w);
            this.x.start();
         } catch (Exception var8) {
            m.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.l = new ffe(this, this.f, this.g, this.h, 32, this.h - 64, 36);
         this.l.a(this.p);
      }

      this.e(this.l);
      this.r = this.d(ewh.a(vb.c("selectServer.select"), $$0 -> this.l()).a(100).a());
      ewh $$1 = this.d(ewh.a(vb.c("selectServer.direct"), $$0 -> {
         this.v = new fne(geu.a("selectServer.defaultName"), "", fne.b.c);
         this.f.a(new fbd(this, this::g, this.v));
      }).a(100).a());
      ewh $$2 = this.d(ewh.a(vb.c("selectServer.add"), $$0 -> {
         this.v = new fne(geu.a("selectServer.defaultName"), "", fne.b.c);
         this.f.a(new fbf(this, this::f, this.v));
      }).a(100).a());
      this.q = this.d(ewh.a(vb.c("selectServer.edit"), $$0 -> {
         ffe.a $$1x = this.l.f();
         if ($$1x instanceof ffe.d) {
            fne $$2x = ((ffe.d)$$1x).c();
            this.v = new fne($$2x.a, $$2x.b, fne.b.c);
            this.v.b($$2x);
            this.f.a(new fbf(this, this::e, this.v));
         }
      }).a(74).a());
      this.t = this.d(ewh.a(vb.c("selectServer.delete"), $$0 -> {
         ffe.a $$1x = this.l.f();
         if ($$1x instanceof ffe.d) {
            String $$2x = ((ffe.d)$$1x).c().a;
            if ($$2x != null) {
               vb $$3x = vb.c("selectServer.deleteQuestion");
               vb $$4x = vb.a("selectServer.deleteWarning", $$2x);
               vb $$5x = vb.c("selectServer.deleteButton");
               vb $$6x = va.e;
               this.f.a(new fav(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      ewh $$3 = this.d(ewh.a(vb.c("selectServer.refresh"), $$0 -> this.F()).a(74).a());
      ewh $$4 = this.d(ewh.a(va.k, $$0 -> this.f.a(this.o)).a(74).a());
      ezv $$5 = ezv.d();
      ezo $$6 = $$5.a(new ezo(308, 20, ezo.b.a));
      $$6.a(this.r);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(ezw.b(4));
      ezo $$7 = $$5.a(new ezo(308, 20, ezo.b.a));
      $$7.a(this.q);
      $$7.a(this.t);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      ezp.a($$5, 0, this.h - 64, this.g, 64);
      this.C();
   }

   @Override
   public void d() {
      super.d();
      List<gho> $$0 = this.w.a();
      if ($$0 != null) {
         this.l.a($$0);
      }

      this.n.a();
   }

   @Override
   public void aG_() {
      if (this.x != null) {
         this.x.interrupt();
         this.x = null;
      }

      this.n.b();
      this.l.e();
   }

   private void F() {
      this.f.a(new ffa(this.o));
   }

   private void c(boolean $$0) {
      ffe.a $$1 = this.l.f();
      if ($$0 && $$1 instanceof ffe.d) {
         this.p.a(((ffe.d)$$1).c());
         this.p.b();
         this.l.a(null);
         this.l.a(this.p);
      }

      this.f.a(this);
   }

   private void e(boolean $$0) {
      ffe.a $$1 = this.l.f();
      if ($$0 && $$1 instanceof ffe.d) {
         fne $$2 = ((ffe.d)$$1).c();
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
         fne $$1 = this.p.b(this.v.b);
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
         fne $$1 = this.p.a(this.v.b);
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
         if (faf.a($$0)) {
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
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.u = null;
      this.l.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
      if (this.u != null) {
         $$0.a(this.i, this.u, $$1, $$2);
      }
   }

   public void l() {
      ffe.a $$0 = this.l.f();
      if ($$0 instanceof ffe.d) {
         this.a(((ffe.d)$$0).c());
      } else if ($$0 instanceof ffe.c) {
         gho $$1 = ((ffe.c)$$0).b();
         this.a(new fne($$1.a(), $$1.b(), fne.b.a));
      }
   }

   private void a(fne $$0) {
      faw.a(this, this.f, fof.a($$0.b), $$0, false);
   }

   public void a(ffe.a $$0) {
      this.l.a($$0);
      this.C();
   }

   @Override
   protected void C() {
      this.r.i = false;
      this.q.i = false;
      this.t.i = false;
      ffe.a $$0 = this.l.f();
      if ($$0 != null && !($$0 instanceof ffe.b)) {
         this.r.i = true;
         if ($$0 instanceof ffe.d) {
            this.q.i = true;
            this.t.i = true;
         }
      }
   }

   public fng D() {
      return this.n;
   }

   public void c(List<vb> $$0) {
      this.u = $$0;
   }

   public fnf E() {
      return this.p;
   }
}
