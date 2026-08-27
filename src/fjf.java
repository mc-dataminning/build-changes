import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjf extends fgh {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int k = 64;
   private static final Logger m = LogUtils.getLogger();
   private final frp n = new frp();
   private final fgh o;
   protected fjj l;
   private fro p;
   private fak q;
   private fak r;
   private fak t;
   private frn u;
   private gmf.b v;
   @Nullable
   private gmf.a w;
   private boolean x;

   public fjf(fgh $$0) {
      super(vs.c("multiplayer.title"));
      this.o = $$0;
   }

   @Override
   protected void aP_() {
      if (this.x) {
         this.l.a(this.g, this.h - 64 - 32, 0, 32);
      } else {
         this.x = true;
         this.p = new fro(this.f);
         this.p.a();
         this.v = new gmf.b();

         try {
            this.w = new gmf.a(this.v);
            this.w.start();
         } catch (Exception var8) {
            m.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.l = new fjj(this, this.f, this.g, this.h - 64 - 32, 32, 36);
         this.l.a(this.p);
      }

      this.c(this.l);
      this.r = this.c(fak.a(vs.c("selectServer.select"), $$0 -> this.o()).a(100).a());
      fak $$1 = this.c(fak.a(vs.c("selectServer.direct"), $$0 -> {
         this.u = new frn(gje.a("selectServer.defaultName"), "", frn.c.c);
         this.f.a(new ffi(this, this::g, this.u));
      }).a(100).a());
      fak $$2 = this.c(fak.a(vs.c("selectServer.add"), $$0 -> {
         this.u = new frn(gje.a("selectServer.defaultName"), "", frn.c.c);
         this.f.a(new ffk(this, this::f, this.u));
      }).a(100).a());
      this.q = this.c(fak.a(vs.c("selectServer.edit"), $$0 -> {
         fjj.a $$1x = this.l.i();
         if ($$1x instanceof fjj.d) {
            frn $$2x = ((fjj.d)$$1x).c();
            this.u = new frn($$2x.a, $$2x.b, frn.c.c);
            this.u.b($$2x);
            this.f.a(new ffk(this, this::e, this.u));
         }
      }).a(74).a());
      this.t = this.c(fak.a(vs.c("selectServer.delete"), $$0 -> {
         fjj.a $$1x = this.l.i();
         if ($$1x instanceof fjj.d) {
            String $$2x = ((fjj.d)$$1x).c().a;
            if ($$2x != null) {
               vs $$3x = vs.c("selectServer.deleteQuestion");
               vs $$4x = vs.a("selectServer.deleteWarning", $$2x);
               vs $$5x = vs.c("selectServer.deleteButton");
               vs $$6x = vr.e;
               this.f.a(new ffa(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      fak $$3 = this.c(fak.a(vs.c("selectServer.refresh"), $$0 -> this.J()).a(74).a());
      fak $$4 = this.c(fak.a(vr.k, $$0 -> this.d()).a(74).a());
      fea $$5 = fea.d();
      fdt $$6 = $$5.a(new fdt(308, 20, fdt.b.a));
      $$6.a(this.r);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(feb.b(4));
      fdt $$7 = $$5.a(new fdt(308, 20, fdt.b.a));
      $$7.a(this.q);
      $$7.a(this.t);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      fdu.a($$5, 0, this.h - 64, this.g, 64);
      this.E();
   }

   @Override
   public void d() {
      this.f.a(this.o);
   }

   @Override
   public void e() {
      super.e();
      List<gme> $$0 = this.v.a();
      if ($$0 != null) {
         this.l.a($$0);
      }

      this.n.a();
   }

   @Override
   public void k() {
      if (this.w != null) {
         this.w.interrupt();
         this.w = null;
      }

      this.n.b();
      this.l.d();
   }

   private void J() {
      this.f.a(new fjf(this.o));
   }

   private void c(boolean $$0) {
      fjj.a $$1 = this.l.i();
      if ($$0 && $$1 instanceof fjj.d) {
         this.p.a(((fjj.d)$$1).c());
         this.p.b();
         this.l.a(null);
         this.l.a(this.p);
      }

      this.f.a(this);
   }

   private void e(boolean $$0) {
      fjj.a $$1 = this.l.i();
      if ($$0 && $$1 instanceof fjj.d) {
         frn $$2 = ((fjj.d)$$1).c();
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
         frn $$1 = this.p.b(this.u.b);
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
         frn $$1 = this.p.a(this.u.b);
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
         this.J();
         return true;
      } else if (this.l.i() != null) {
         if (fek.a($$0)) {
            this.o();
            return true;
         } else {
            return this.l.a($$0, $$1, $$2);
         }
      } else {
         return false;
      }
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   public void o() {
      fjj.a $$0 = this.l.i();
      if ($$0 instanceof fjj.d) {
         this.a(((fjj.d)$$0).c());
      } else if ($$0 instanceof fjj.c) {
         gme $$1 = ((fjj.c)$$0).b();
         this.a(new frn($$1.a(), $$1.b(), frn.c.a));
      }
   }

   private void a(frn $$0) {
      ffb.a(this, this.f, fsp.a($$0.b), $$0, false, null);
   }

   public void a(fjj.a $$0) {
      this.l.a($$0);
      this.E();
   }

   protected void E() {
      this.r.j = false;
      this.q.j = false;
      this.t.j = false;
      fjj.a $$0 = this.l.i();
      if ($$0 != null && !($$0 instanceof fjj.b)) {
         this.r.j = true;
         if ($$0 instanceof fjj.d) {
            this.q.j = true;
            this.t.j = true;
         }
      }
   }

   public frp H() {
      return this.n;
   }

   public fro I() {
      return this.p;
   }
}
