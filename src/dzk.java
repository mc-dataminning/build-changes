import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dzk extends dxr implements dxu {
   private static final int d = 5;
   public static final int a = 48;
   public static final int b = 48;
   public static final String c = "author";
   @Nullable
   private alg e;
   private String f = "";
   private String g = "";
   private iv h = new iv(0, 1, 0);
   private ka i;
   private dru j;
   private dtl k;
   private ecd l;
   private boolean m;
   private boolean q;
   private boolean r;
   private boolean s;
   private boolean t;
   private float u;
   private long v;

   public dzk(iv $$0, eat $$1) {
      super(dxt.v, $$0, $$1);
      this.i = ka.i;
      this.j = dru.a;
      this.k = dtl.a;
      this.m = true;
      this.q = false;
      this.t = true;
      this.u = 1.0F;
      this.l = $$1.c(duz.b);
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      $$0.a("name", this.d());
      $$0.a("author", this.f);
      $$0.a("metadata", this.g);
      $$0.a("posX", this.h.u());
      $$0.a("posY", this.h.v());
      $$0.a("posZ", this.h.w());
      $$0.a("sizeX", this.i.u());
      $$0.a("sizeY", this.i.v());
      $$0.a("sizeZ", this.i.w());
      $$0.a("rotation", dtl.h, this.k);
      $$0.a("mirror", dru.e, this.j);
      $$0.a("mode", ecd.e, this.l);
      $$0.a("ignoreEntities", this.m);
      $$0.a("strict", this.q);
      $$0.a("powered", this.r);
      $$0.a("showair", this.s);
      $$0.a("showboundingbox", this.t);
      $$0.a("integrity", this.u);
      $$0.a("seed", this.v);
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.a($$0.j("name"));
      this.f = $$0.j("author");
      this.g = $$0.j("metadata");
      int $$2 = azm.a($$0.f("posX"), -48, 48);
      int $$3 = azm.a($$0.f("posY"), -48, 48);
      int $$4 = azm.a($$0.f("posZ"), -48, 48);
      this.h = new iv($$2, $$3, $$4);
      int $$5 = azm.a($$0.f("sizeX"), 0, 48);
      int $$6 = azm.a($$0.f("sizeY"), 0, 48);
      int $$7 = azm.a($$0.f("sizeZ"), 0, 48);
      this.i = new ka($$5, $$6, $$7);
      this.k = $$0.<dtl>a("rotation", dtl.h).orElse(dtl.a);
      this.j = $$0.<dru>a("mirror", dru.e).orElse(dru.a);
      this.l = $$0.<ecd>a("mode", ecd.e).orElse(ecd.d);
      this.m = $$0.o("ignoreEntities");
      this.q = $$0.o("strict");
      this.r = $$0.o("powered");
      this.s = $$0.o("showair");
      this.t = $$0.o("showboundingbox");
      if ($$0.c("integrity")) {
         this.u = $$0.h("integrity");
      } else {
         this.u = 1.0F;
      }

      this.v = $$0.g("seed");
      this.H();
   }

   private void H() {
      if (this.n != null) {
         iv $$0 = this.ax_();
         eat $$1 = this.n.a_($$0);
         if ($$1.a(dmt.pG)) {
            this.n.a($$0, $$1.b(duz.b, this.l), 2);
         }
      }
   }

   public aca a() {
      return aca.a(this);
   }

   @Override
   public tz a(jh.a $$0) {
      return this.e($$0);
   }

   public boolean a(crm $$0) {
      if (!$$0.gF()) {
         return false;
      } else {
         if ($$0.cT().C) {
            $$0.a(this);
         }

         return true;
      }
   }

   public String d() {
      return this.e == null ? "" : this.e.toString();
   }

   public boolean f() {
      return this.e != null;
   }

   public void a(@Nullable String $$0) {
      this.a(bal.b($$0) ? null : alg.c($$0));
   }

   public void a(@Nullable alg $$0) {
      this.e = $$0;
   }

   public void a(bxj $$0) {
      this.f = $$0.ai().getString();
   }

   public iv j() {
      return this.h;
   }

   public void a(iv $$0) {
      this.h = $$0;
   }

   public ka k() {
      return this.i;
   }

   public void a(ka $$0) {
      this.i = $$0;
   }

   public dru s() {
      return this.j;
   }

   public void a(dru $$0) {
      this.j = $$0;
   }

   public dtl t() {
      return this.k;
   }

   public void a(dtl $$0) {
      this.k = $$0;
   }

   public String u() {
      return this.g;
   }

   public void b(String $$0) {
      this.g = $$0;
   }

   public ecd v() {
      return this.l;
   }

   public void a(ecd $$0) {
      this.l = $$0;
      eat $$1 = this.n.a_(this.ax_());
      if ($$1.a(dmt.pG)) {
         this.n.a(this.ax_(), $$1.b(duz.b, $$0), 2);
      }
   }

   public boolean w() {
      return this.m;
   }

   public boolean x() {
      return this.q;
   }

   public void a(boolean $$0) {
      this.m = $$0;
   }

   public void b(boolean $$0) {
      this.q = $$0;
   }

   public float y() {
      return this.u;
   }

   public void a(float $$0) {
      this.u = $$0;
   }

   public long z() {
      return this.v;
   }

   public void a(long $$0) {
      this.v = $$0;
   }

   public boolean A() {
      if (this.l != ecd.a) {
         return false;
      } else {
         iv $$0 = this.ax_();
         int $$1 = 80;
         iv $$2 = new iv($$0.u() - 80, this.n.G_(), $$0.w() - 80);
         iv $$3 = new iv($$0.u() + 80, this.n.ao(), $$0.w() + 80);
         Stream<iv> $$4 = this.a($$2, $$3);
         return a($$0, $$4).filter($$1x -> {
            int $$2x = $$1x.k() - $$1x.h();
            int $$3x = $$1x.l() - $$1x.i();
            int $$4x = $$1x.m() - $$1x.j();
            if ($$2x > 1 && $$3x > 1 && $$4x > 1) {
               this.h = new iv($$1x.h() - $$0.u() + 1, $$1x.i() - $$0.v() + 1, $$1x.j() - $$0.w() + 1);
               this.i = new ka($$2x - 1, $$3x - 1, $$4x - 1);
               this.e();
               eat $$5 = this.n.a_($$0);
               this.n.a($$0, $$5, $$5, 3);
               return true;
            } else {
               return false;
            }
         }).isPresent();
      }
   }

   private Stream<iv> a(iv $$0, iv $$1) {
      return iv.d($$0, $$1)
         .filter($$0x -> this.n.a_($$0x).a(dmt.pG))
         .map(this.n::c_)
         .filter($$0x -> $$0x instanceof dzk)
         .map($$0x -> (dzk)$$0x)
         .filter($$0x -> $$0x.l == ecd.c && Objects.equals(this.e, $$0x.e))
         .map(dxr::ax_);
   }

   private static Optional<erf> a(iv $$0, Stream<iv> $$1) {
      Iterator<iv> $$2 = $$1.iterator();
      if (!$$2.hasNext()) {
         return Optional.empty();
      } else {
         iv $$3 = $$2.next();
         erf $$4 = new erf($$3);
         if ($$2.hasNext()) {
            $$2.forEachRemaining($$4::a);
         } else {
            $$4.a($$0);
         }

         return Optional.of($$4);
      }
   }

   public boolean B() {
      return this.l != ecd.a ? false : this.c(true);
   }

   public boolean c(boolean $$0) {
      if (this.e != null && this.n instanceof arq $$1) {
         iv var4 = this.ax_().a((ka)this.h);
         return a($$1, this.e, var4, this.i, this.m, this.f, $$0);
      } else {
         return false;
      }
   }

   public static boolean a(arq $$0, alg $$1, iv $$2, ka $$3, boolean $$4, String $$5, boolean $$6) {
      evq $$7 = $$0.r();

      evp $$8;
      try {
         $$8 = $$7.a($$1);
      } catch (ab var11) {
         return false;
      }

      $$8.a($$0, $$2, $$3, !$$4, dmt.lt);
      $$8.a($$5);
      if ($$6) {
         try {
            return $$7.c($$1);
         } catch (ab var10) {
            return false;
         }
      } else {
         return true;
      }
   }

   public static azv b(long $$0) {
      return $$0 == 0L ? azv.a(ag.c()) : azv.a($$0);
   }

   public boolean a(arq $$0) {
      if (this.l == ecd.b && this.e != null) {
         evp $$1 = $$0.r().b(this.e).orElse(null);
         if ($$1 == null) {
            return false;
         } else if ($$1.a().equals(this.i)) {
            this.a($$0, $$1);
            return true;
         } else {
            this.a($$1);
            return false;
         }
      } else {
         return false;
      }
   }

   public boolean b(arq $$0) {
      evp $$1 = this.d($$0);
      if ($$1 == null) {
         return false;
      } else {
         this.a($$1);
         return true;
      }
   }

   private void a(evp $$0) {
      this.f = !bal.b($$0.b()) ? $$0.b() : "";
      this.i = $$0.a();
      this.e();
   }

   public void c(arq $$0) {
      evp $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$0, $$1);
      }
   }

   @Nullable
   private evp d(arq $$0) {
      return this.e == null ? null : $$0.r().b(this.e).orElse(null);
   }

   private void a(arq $$0, evp $$1) {
      this.a($$1);
      evl $$2 = new evl().a(this.j).a(this.k).a(this.m).b(this.q);
      if (this.u < 1.0F) {
         $$2.b().a(new eus(azm.a(this.u, 0.0F, 1.0F))).a(b(this.v));
      }

      iv $$3 = this.ax_().a((ka)this.h);
      $$1.a($$0, $$3, $$3, $$2, b(this.v), 2 | (this.q ? 816 : 0));
   }

   public void C() {
      if (this.e != null) {
         arq $$0 = (arq)this.n;
         evq $$1 = $$0.r();
         $$1.d(this.e);
      }
   }

   public boolean D() {
      if (this.l == ecd.b && !this.n.C && this.e != null) {
         arq $$0 = (arq)this.n;
         evq $$1 = $$0.r();

         try {
            return $$1.b(this.e).isPresent();
         } catch (ab var4) {
            return false;
         }
      } else {
         return false;
      }
   }

   public boolean E() {
      return this.r;
   }

   public void d(boolean $$0) {
      this.r = $$0;
   }

   public boolean F() {
      return this.s;
   }

   public void e(boolean $$0) {
      this.s = $$0;
   }

   public boolean G() {
      return this.t;
   }

   public void f(boolean $$0) {
      this.t = $$0;
   }

   @Override
   public dxu.a b() {
      if (this.l != ecd.a && this.l != ecd.b) {
         return dxu.a.a;
      } else if (this.l == ecd.a && this.s) {
         return dxu.a.c;
      } else {
         return this.l != ecd.a && !this.t ? dxu.a.a : dxu.a.b;
      }
   }

   @Override
   public dxu.b c() {
      iv $$0 = this.j();
      ka $$1 = this.k();
      int $$2 = $$0.u();
      int $$3 = $$0.w();
      int $$4 = $$0.v();
      int $$5 = $$4 + $$1.v();
      int $$6;
      int $$7;
      switch (this.j) {
         case b:
            $$6 = $$1.u();
            $$7 = -$$1.w();
            break;
         case c:
            $$6 = -$$1.u();
            $$7 = $$1.w();
            break;
         default:
            $$6 = $$1.u();
            $$7 = $$1.w();
      }

      int $$24;
      int $$25;
      int $$26;
      int $$27;
      switch (this.k) {
         case b:
            $$24 = $$7 < 0 ? $$2 : $$2 + 1;
            $$25 = $$6 < 0 ? $$3 + 1 : $$3;
            $$26 = $$24 - $$7;
            $$27 = $$25 + $$6;
            break;
         case c:
            $$24 = $$6 < 0 ? $$2 : $$2 + 1;
            $$25 = $$7 < 0 ? $$3 : $$3 + 1;
            $$26 = $$24 - $$6;
            $$27 = $$25 - $$7;
            break;
         case d:
            $$24 = $$7 < 0 ? $$2 + 1 : $$2;
            $$25 = $$6 < 0 ? $$3 : $$3 + 1;
            $$26 = $$24 + $$7;
            $$27 = $$25 - $$6;
            break;
         default:
            $$24 = $$6 < 0 ? $$2 + 1 : $$2;
            $$25 = $$7 < 0 ? $$3 + 1 : $$3;
            $$26 = $$24 + $$6;
            $$27 = $$25 + $$7;
      }

      return dxu.b.a($$24, $$4, $$25, $$26, $$5, $$27);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
