import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class eah extends dyo implements dyr {
   private static final int d = 5;
   public static final int a = 48;
   public static final int b = 48;
   public static final String c = "author";
   private static final String e = "";
   private static final String f = "";
   private static final iw g = new iw(0, 1, 0);
   private static final kb h = kb.i;
   private static final dui i = dui.a;
   private static final dsr j = dsr.a;
   private static final boolean k = true;
   private static final boolean l = false;
   private static final boolean m = false;
   private static final boolean q = false;
   private static final boolean r = true;
   private static final float s = 1.0F;
   private static final long t = 0L;
   @Nullable
   private alr u;
   private String v = "";
   private String w = "";
   private iw x = g;
   private kb y = h;
   private dsr z = dsr.a;
   private dui A = dui.a;
   private eda B;
   private boolean C = true;
   private boolean D = false;
   private boolean E = false;
   private boolean F = false;
   private boolean G = true;
   private float H = 1.0F;
   private long I = 0L;

   public eah(iw $$0, ebq $$1) {
      super(dyq.v, $$0, $$1);
      this.B = $$1.c(dvw.b);
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      $$0.a("name", this.d());
      $$0.a("author", this.v);
      $$0.a("metadata", this.w);
      $$0.a("posX", this.x.u());
      $$0.a("posY", this.x.v());
      $$0.a("posZ", this.x.w());
      $$0.a("sizeX", this.y.u());
      $$0.a("sizeY", this.y.v());
      $$0.a("sizeZ", this.y.w());
      $$0.a("rotation", dui.h, this.A);
      $$0.a("mirror", dsr.e, this.z);
      $$0.a("mode", eda.e, this.B);
      $$0.a("ignoreEntities", this.C);
      $$0.a("strict", this.D);
      $$0.a("powered", this.E);
      $$0.a("showair", this.F);
      $$0.a("showboundingbox", this.G);
      $$0.a("integrity", this.H);
      $$0.a("seed", this.I);
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      this.a($$0.b("name", ""));
      this.v = $$0.b("author", "");
      this.w = $$0.b("metadata", "");
      int $$2 = azz.a($$0.b("posX", g.u()), -48, 48);
      int $$3 = azz.a($$0.b("posY", g.v()), -48, 48);
      int $$4 = azz.a($$0.b("posZ", g.w()), -48, 48);
      this.x = new iw($$2, $$3, $$4);
      int $$5 = azz.a($$0.b("sizeX", h.u()), 0, 48);
      int $$6 = azz.a($$0.b("sizeY", h.v()), 0, 48);
      int $$7 = azz.a($$0.b("sizeZ", h.w()), 0, 48);
      this.y = new kb($$5, $$6, $$7);
      this.A = $$0.<dui>a("rotation", dui.h).orElse(i);
      this.z = $$0.<dsr>a("mirror", dsr.e).orElse(j);
      this.B = $$0.<eda>a("mode", eda.e).orElse(eda.d);
      this.C = $$0.b("ignoreEntities", true);
      this.D = $$0.b("strict", false);
      this.E = $$0.b("powered", false);
      this.F = $$0.b("showair", false);
      this.G = $$0.b("showboundingbox", true);
      this.H = $$0.b("integrity", 1.0F);
      this.I = $$0.b("seed", 0L);
      this.H();
   }

   private void H() {
      if (this.n != null) {
         iw $$0 = this.ax_();
         ebq $$1 = this.n.a_($$0);
         if ($$1.a(dnq.pG)) {
            this.n.a($$0, $$1.b(dvw.b, this.B), 2);
         }
      }
   }

   public acl a() {
      return acl.a(this);
   }

   @Override
   public ua a(ji.a $$0) {
      return this.e($$0);
   }

   public boolean a(csi $$0) {
      if (!$$0.gH()) {
         return false;
      } else {
         if ($$0.cU().C) {
            $$0.a(this);
         }

         return true;
      }
   }

   public String d() {
      return this.u == null ? "" : this.u.toString();
   }

   public boolean f() {
      return this.u != null;
   }

   public void a(@Nullable String $$0) {
      this.a(bay.b($$0) ? null : alr.c($$0));
   }

   public void a(@Nullable alr $$0) {
      this.u = $$0;
   }

   public void a(byf $$0) {
      this.v = $$0.ah().getString();
   }

   public iw j() {
      return this.x;
   }

   public void a(iw $$0) {
      this.x = $$0;
   }

   public kb k() {
      return this.y;
   }

   public void a(kb $$0) {
      this.y = $$0;
   }

   public dsr s() {
      return this.z;
   }

   public void a(dsr $$0) {
      this.z = $$0;
   }

   public dui t() {
      return this.A;
   }

   public void a(dui $$0) {
      this.A = $$0;
   }

   public String u() {
      return this.w;
   }

   public void b(String $$0) {
      this.w = $$0;
   }

   public eda v() {
      return this.B;
   }

   public void a(eda $$0) {
      this.B = $$0;
      ebq $$1 = this.n.a_(this.ax_());
      if ($$1.a(dnq.pG)) {
         this.n.a(this.ax_(), $$1.b(dvw.b, $$0), 2);
      }
   }

   public boolean w() {
      return this.C;
   }

   public boolean x() {
      return this.D;
   }

   public void a(boolean $$0) {
      this.C = $$0;
   }

   public void b(boolean $$0) {
      this.D = $$0;
   }

   public float y() {
      return this.H;
   }

   public void a(float $$0) {
      this.H = $$0;
   }

   public long z() {
      return this.I;
   }

   public void a(long $$0) {
      this.I = $$0;
   }

   public boolean A() {
      if (this.B != eda.a) {
         return false;
      } else {
         iw $$0 = this.ax_();
         int $$1 = 80;
         iw $$2 = new iw($$0.u() - 80, this.n.K_(), $$0.w() - 80);
         iw $$3 = new iw($$0.u() + 80, this.n.ao(), $$0.w() + 80);
         Stream<iw> $$4 = this.a($$2, $$3);
         return a($$0, $$4).filter($$1x -> {
            int $$2x = $$1x.k() - $$1x.h();
            int $$3x = $$1x.l() - $$1x.i();
            int $$4x = $$1x.m() - $$1x.j();
            if ($$2x > 1 && $$3x > 1 && $$4x > 1) {
               this.x = new iw($$1x.h() - $$0.u() + 1, $$1x.i() - $$0.v() + 1, $$1x.j() - $$0.w() + 1);
               this.y = new kb($$2x - 1, $$3x - 1, $$4x - 1);
               this.e();
               ebq $$5 = this.n.a_($$0);
               this.n.a($$0, $$5, $$5, 3);
               return true;
            } else {
               return false;
            }
         }).isPresent();
      }
   }

   private Stream<iw> a(iw $$0, iw $$1) {
      return iw.d($$0, $$1)
         .filter($$0x -> this.n.a_($$0x).a(dnq.pG))
         .map(this.n::c_)
         .filter($$0x -> $$0x instanceof eah)
         .map($$0x -> (eah)$$0x)
         .filter($$0x -> $$0x.B == eda.c && Objects.equals(this.u, $$0x.u))
         .map(dyo::ax_);
   }

   private static Optional<esf> a(iw $$0, Stream<iw> $$1) {
      Iterator<iw> $$2 = $$1.iterator();
      if (!$$2.hasNext()) {
         return Optional.empty();
      } else {
         iw $$3 = $$2.next();
         esf $$4 = new esf($$3);
         if ($$2.hasNext()) {
            $$2.forEachRemaining($$4::a);
         } else {
            $$4.a($$0);
         }

         return Optional.of($$4);
      }
   }

   public boolean B() {
      return this.B != eda.a ? false : this.c(true);
   }

   public boolean c(boolean $$0) {
      if (this.u != null && this.n instanceof asb $$1) {
         iw var4 = this.ax_().a((kb)this.x);
         return a($$1, this.u, var4, this.y, this.C, this.v, $$0);
      } else {
         return false;
      }
   }

   public static boolean a(asb $$0, alr $$1, iw $$2, kb $$3, boolean $$4, String $$5, boolean $$6) {
      ewq $$7 = $$0.r();

      ewp $$8;
      try {
         $$8 = $$7.a($$1);
      } catch (ab var11) {
         return false;
      }

      $$8.a($$0, $$2, $$3, !$$4, dnq.lt);
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

   public static bai b(long $$0) {
      return $$0 == 0L ? bai.a(ag.c()) : bai.a($$0);
   }

   public boolean a(asb $$0) {
      if (this.B == eda.b && this.u != null) {
         ewp $$1 = $$0.r().b(this.u).orElse(null);
         if ($$1 == null) {
            return false;
         } else if ($$1.a().equals(this.y)) {
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

   public boolean b(asb $$0) {
      ewp $$1 = this.d($$0);
      if ($$1 == null) {
         return false;
      } else {
         this.a($$1);
         return true;
      }
   }

   private void a(ewp $$0) {
      this.v = !bay.b($$0.b()) ? $$0.b() : "";
      this.y = $$0.a();
      this.e();
   }

   public void c(asb $$0) {
      ewp $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$0, $$1);
      }
   }

   @Nullable
   private ewp d(asb $$0) {
      return this.u == null ? null : $$0.r().b(this.u).orElse(null);
   }

   private void a(asb $$0, ewp $$1) {
      this.a($$1);
      ewl $$2 = new ewl().a(this.z).a(this.A).a(this.C).b(this.D);
      if (this.H < 1.0F) {
         $$2.b().a(new evs(azz.a(this.H, 0.0F, 1.0F))).a(b(this.I));
      }

      iw $$3 = this.ax_().a((kb)this.x);
      $$1.a($$0, $$3, $$3, $$2, b(this.I), 2 | (this.D ? 816 : 0));
   }

   public void C() {
      if (this.u != null) {
         asb $$0 = (asb)this.n;
         ewq $$1 = $$0.r();
         $$1.d(this.u);
      }
   }

   public boolean D() {
      if (this.B == eda.b && !this.n.C && this.u != null) {
         asb $$0 = (asb)this.n;
         ewq $$1 = $$0.r();

         try {
            return $$1.b(this.u).isPresent();
         } catch (ab var4) {
            return false;
         }
      } else {
         return false;
      }
   }

   public boolean E() {
      return this.E;
   }

   public void d(boolean $$0) {
      this.E = $$0;
   }

   public boolean F() {
      return this.F;
   }

   public void e(boolean $$0) {
      this.F = $$0;
   }

   public boolean G() {
      return this.G;
   }

   public void f(boolean $$0) {
      this.G = $$0;
   }

   @Override
   public dyr.a b() {
      if (this.B != eda.a && this.B != eda.b) {
         return dyr.a.a;
      } else if (this.B == eda.a && this.F) {
         return dyr.a.c;
      } else {
         return this.B != eda.a && !this.G ? dyr.a.a : dyr.a.b;
      }
   }

   @Override
   public dyr.b c() {
      iw $$0 = this.j();
      kb $$1 = this.k();
      int $$2 = $$0.u();
      int $$3 = $$0.w();
      int $$4 = $$0.v();
      int $$5 = $$4 + $$1.v();
      int $$6;
      int $$7;
      switch (this.z) {
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
      switch (this.A) {
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

      return dyr.b.a($$24, $$4, $$25, $$26, $$5, $$27);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
