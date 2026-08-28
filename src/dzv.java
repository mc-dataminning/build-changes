import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dzv extends dyc implements dyf {
   private static final int d = 5;
   public static final int a = 48;
   public static final int b = 48;
   public static final String c = "author";
   private static final String e = "";
   private static final String f = "";
   private static final iv g = new iv(0, 1, 0);
   private static final ka h = ka.i;
   private static final dtw i = dtw.a;
   private static final dsf j = dsf.a;
   private static final boolean k = true;
   private static final boolean l = false;
   private static final boolean m = false;
   private static final boolean q = false;
   private static final boolean r = true;
   private static final float s = 1.0F;
   private static final long t = 0L;
   @Nullable
   private ali u;
   private String v = "";
   private String w = "";
   private iv x = g;
   private ka y = h;
   private dsf z = dsf.a;
   private dtw A = dtw.a;
   private eco B;
   private boolean C = true;
   private boolean D = false;
   private boolean E = false;
   private boolean F = false;
   private boolean G = true;
   private float H = 1.0F;
   private long I = 0L;

   public dzv(iv $$0, ebe $$1) {
      super(dye.v, $$0, $$1);
      this.B = $$1.c(dvk.b);
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
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
      $$0.a("rotation", dtw.h, this.A);
      $$0.a("mirror", dsf.e, this.z);
      $$0.a("mode", eco.e, this.B);
      $$0.a("ignoreEntities", this.C);
      $$0.a("strict", this.D);
      $$0.a("powered", this.E);
      $$0.a("showair", this.F);
      $$0.a("showboundingbox", this.G);
      $$0.a("integrity", this.H);
      $$0.a("seed", this.I);
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.a($$0.b("name", ""));
      this.v = $$0.b("author", "");
      this.w = $$0.b("metadata", "");
      int $$2 = azo.a($$0.b("posX", g.u()), -48, 48);
      int $$3 = azo.a($$0.b("posY", g.v()), -48, 48);
      int $$4 = azo.a($$0.b("posZ", g.w()), -48, 48);
      this.x = new iv($$2, $$3, $$4);
      int $$5 = azo.a($$0.b("sizeX", h.u()), 0, 48);
      int $$6 = azo.a($$0.b("sizeY", h.v()), 0, 48);
      int $$7 = azo.a($$0.b("sizeZ", h.w()), 0, 48);
      this.y = new ka($$5, $$6, $$7);
      this.A = $$0.<dtw>a("rotation", dtw.h).orElse(i);
      this.z = $$0.<dsf>a("mirror", dsf.e).orElse(j);
      this.B = $$0.<eco>a("mode", eco.e).orElse(eco.d);
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
         iv $$0 = this.aB_();
         ebe $$1 = this.n.a_($$0);
         if ($$1.a(dne.pG)) {
            this.n.a($$0, $$1.b(dvk.b, this.B), 2);
         }
      }
   }

   public acc a() {
      return acc.a(this);
   }

   @Override
   public tz a(jh.a $$0) {
      return this.e($$0);
   }

   public boolean a(crx $$0) {
      if (!$$0.gG()) {
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
      this.a(ban.b($$0) ? null : ali.c($$0));
   }

   public void a(@Nullable ali $$0) {
      this.u = $$0;
   }

   public void a(bxu $$0) {
      this.v = $$0.ai().getString();
   }

   public iv j() {
      return this.x;
   }

   public void a(iv $$0) {
      this.x = $$0;
   }

   public ka k() {
      return this.y;
   }

   public void a(ka $$0) {
      this.y = $$0;
   }

   public dsf s() {
      return this.z;
   }

   public void a(dsf $$0) {
      this.z = $$0;
   }

   public dtw t() {
      return this.A;
   }

   public void a(dtw $$0) {
      this.A = $$0;
   }

   public String u() {
      return this.w;
   }

   public void b(String $$0) {
      this.w = $$0;
   }

   public eco v() {
      return this.B;
   }

   public void a(eco $$0) {
      this.B = $$0;
      ebe $$1 = this.n.a_(this.aB_());
      if ($$1.a(dne.pG)) {
         this.n.a(this.aB_(), $$1.b(dvk.b, $$0), 2);
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
      if (this.B != eco.a) {
         return false;
      } else {
         iv $$0 = this.aB_();
         int $$1 = 80;
         iv $$2 = new iv($$0.u() - 80, this.n.K_(), $$0.w() - 80);
         iv $$3 = new iv($$0.u() + 80, this.n.ao(), $$0.w() + 80);
         Stream<iv> $$4 = this.a($$2, $$3);
         return a($$0, $$4).filter($$1x -> {
            int $$2x = $$1x.k() - $$1x.h();
            int $$3x = $$1x.l() - $$1x.i();
            int $$4x = $$1x.m() - $$1x.j();
            if ($$2x > 1 && $$3x > 1 && $$4x > 1) {
               this.x = new iv($$1x.h() - $$0.u() + 1, $$1x.i() - $$0.v() + 1, $$1x.j() - $$0.w() + 1);
               this.y = new ka($$2x - 1, $$3x - 1, $$4x - 1);
               this.e();
               ebe $$5 = this.n.a_($$0);
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
         .filter($$0x -> this.n.a_($$0x).a(dne.pG))
         .map(this.n::c_)
         .filter($$0x -> $$0x instanceof dzv)
         .map($$0x -> (dzv)$$0x)
         .filter($$0x -> $$0x.B == eco.c && Objects.equals(this.u, $$0x.u))
         .map(dyc::aB_);
   }

   private static Optional<ert> a(iv $$0, Stream<iv> $$1) {
      Iterator<iv> $$2 = $$1.iterator();
      if (!$$2.hasNext()) {
         return Optional.empty();
      } else {
         iv $$3 = $$2.next();
         ert $$4 = new ert($$3);
         if ($$2.hasNext()) {
            $$2.forEachRemaining($$4::a);
         } else {
            $$4.a($$0);
         }

         return Optional.of($$4);
      }
   }

   public boolean B() {
      return this.B != eco.a ? false : this.c(true);
   }

   public boolean c(boolean $$0) {
      if (this.u != null && this.n instanceof ars $$1) {
         iv var4 = this.aB_().a((ka)this.x);
         return a($$1, this.u, var4, this.y, this.C, this.v, $$0);
      } else {
         return false;
      }
   }

   public static boolean a(ars $$0, ali $$1, iv $$2, ka $$3, boolean $$4, String $$5, boolean $$6) {
      ewe $$7 = $$0.r();

      ewd $$8;
      try {
         $$8 = $$7.a($$1);
      } catch (ab var11) {
         return false;
      }

      $$8.a($$0, $$2, $$3, !$$4, dne.lt);
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

   public static azx b(long $$0) {
      return $$0 == 0L ? azx.a(ag.c()) : azx.a($$0);
   }

   public boolean a(ars $$0) {
      if (this.B == eco.b && this.u != null) {
         ewd $$1 = $$0.r().b(this.u).orElse(null);
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

   public boolean b(ars $$0) {
      ewd $$1 = this.d($$0);
      if ($$1 == null) {
         return false;
      } else {
         this.a($$1);
         return true;
      }
   }

   private void a(ewd $$0) {
      this.v = !ban.b($$0.b()) ? $$0.b() : "";
      this.y = $$0.a();
      this.e();
   }

   public void c(ars $$0) {
      ewd $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$0, $$1);
      }
   }

   @Nullable
   private ewd d(ars $$0) {
      return this.u == null ? null : $$0.r().b(this.u).orElse(null);
   }

   private void a(ars $$0, ewd $$1) {
      this.a($$1);
      evz $$2 = new evz().a(this.z).a(this.A).a(this.C).b(this.D);
      if (this.H < 1.0F) {
         $$2.b().a(new evg(azo.a(this.H, 0.0F, 1.0F))).a(b(this.I));
      }

      iv $$3 = this.aB_().a((ka)this.x);
      $$1.a($$0, $$3, $$3, $$2, b(this.I), 2 | (this.D ? 816 : 0));
   }

   public void C() {
      if (this.u != null) {
         ars $$0 = (ars)this.n;
         ewe $$1 = $$0.r();
         $$1.d(this.u);
      }
   }

   public boolean D() {
      if (this.B == eco.b && !this.n.C && this.u != null) {
         ars $$0 = (ars)this.n;
         ewe $$1 = $$0.r();

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
   public dyf.a b() {
      if (this.B != eco.a && this.B != eco.b) {
         return dyf.a.a;
      } else if (this.B == eco.a && this.F) {
         return dyf.a.c;
      } else {
         return this.B != eco.a && !this.G ? dyf.a.a : dyf.a.b;
      }
   }

   @Override
   public dyf.b c() {
      iv $$0 = this.j();
      ka $$1 = this.k();
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

      return dyf.b.a($$24, $$4, $$25, $$26, $$5, $$27);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
