import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dpb extends dnm {
   private static final int d = 5;
   public static final int a = 48;
   public static final int b = 48;
   public static final String c = "author";
   @Nullable
   private akh e;
   private String f = "";
   private String g = "";
   private in h = new in(0, 1, 0);
   private jr i = jr.g;
   private dib j = dib.a;
   private djr k = djr.a;
   private drr l;
   private boolean m = true;
   private boolean q;
   private boolean r;
   private boolean s = true;
   private float t = 1.0F;
   private long u;

   public dpb(in $$0, dqh $$1) {
      super(dno.u, $$0, $$1);
      this.l = $$1.c(dlc.b);
   }

   @Override
   protected void b(ua $$0, iy.a $$1) {
      super.b($$0, $$1);
      $$0.a("name", this.c());
      $$0.a("author", this.f);
      $$0.a("metadata", this.g);
      $$0.a("posX", this.h.u());
      $$0.a("posY", this.h.v());
      $$0.a("posZ", this.h.w());
      $$0.a("sizeX", this.i.u());
      $$0.a("sizeY", this.i.v());
      $$0.a("sizeZ", this.i.w());
      $$0.a("rotation", this.k.toString());
      $$0.a("mirror", this.j.toString());
      $$0.a("mode", this.l.toString());
      $$0.a("ignoreEntities", this.m);
      $$0.a("powered", this.q);
      $$0.a("showair", this.r);
      $$0.a("showboundingbox", this.s);
      $$0.a("integrity", this.t);
      $$0.a("seed", this.u);
   }

   @Override
   public void a(ua $$0, iy.a $$1) {
      super.a($$0, $$1);
      this.a($$0.l("name"));
      this.f = $$0.l("author");
      this.g = $$0.l("metadata");
      int $$2 = axz.a($$0.h("posX"), -48, 48);
      int $$3 = axz.a($$0.h("posY"), -48, 48);
      int $$4 = axz.a($$0.h("posZ"), -48, 48);
      this.h = new in($$2, $$3, $$4);
      int $$5 = axz.a($$0.h("sizeX"), 0, 48);
      int $$6 = axz.a($$0.h("sizeY"), 0, 48);
      int $$7 = axz.a($$0.h("sizeZ"), 0, 48);
      this.i = new jr($$5, $$6, $$7);

      try {
         this.k = djr.valueOf($$0.l("rotation"));
      } catch (IllegalArgumentException var12) {
         this.k = djr.a;
      }

      try {
         this.j = dib.valueOf($$0.l("mirror"));
      } catch (IllegalArgumentException var11) {
         this.j = dib.a;
      }

      try {
         this.l = drr.valueOf($$0.l("mode"));
      } catch (IllegalArgumentException var10) {
         this.l = drr.d;
      }

      this.m = $$0.q("ignoreEntities");
      this.q = $$0.q("powered");
      this.r = $$0.q("showair");
      this.s = $$0.q("showboundingbox");
      if ($$0.e("integrity")) {
         this.t = $$0.j("integrity");
      } else {
         this.t = 1.0F;
      }

      this.u = $$0.i("seed");
      this.F();
   }

   private void F() {
      if (this.n != null) {
         in $$0 = this.az_();
         dqh $$1 = this.n.a_($$0);
         if ($$1.a(ddg.pa)) {
            this.n.a($$0, $$1.a(dlc.b, this.l), 2);
         }
      }
   }

   public abt b() {
      return abt.a(this);
   }

   @Override
   public ua a(iy.a $$0) {
      return this.d($$0);
   }

   public boolean a(clh $$0) {
      if (!$$0.gx()) {
         return false;
      } else {
         if ($$0.cL().B) {
            $$0.a(this);
         }

         return true;
      }
   }

   public String c() {
      return this.e == null ? "" : this.e.toString();
   }

   public boolean d() {
      return this.e != null;
   }

   public void a(@Nullable String $$0) {
      this.a(ayu.b($$0) ? null : akh.a($$0));
   }

   public void a(@Nullable akh $$0) {
      this.e = $$0;
   }

   public void a(bsa $$0) {
      this.f = $$0.ad().getString();
   }

   public in f() {
      return this.h;
   }

   public void a(in $$0) {
      this.h = $$0;
   }

   public jr j() {
      return this.i;
   }

   public void a(jr $$0) {
      this.i = $$0;
   }

   public dib k() {
      return this.j;
   }

   public void a(dib $$0) {
      this.j = $$0;
   }

   public djr l() {
      return this.k;
   }

   public void a(djr $$0) {
      this.k = $$0;
   }

   public String t() {
      return this.g;
   }

   public void b(String $$0) {
      this.g = $$0;
   }

   public drr u() {
      return this.l;
   }

   public void a(drr $$0) {
      this.l = $$0;
      dqh $$1 = this.n.a_(this.az_());
      if ($$1.a(ddg.pa)) {
         this.n.a(this.az_(), $$1.a(dlc.b, $$0), 2);
      }
   }

   public boolean v() {
      return this.m;
   }

   public void a(boolean $$0) {
      this.m = $$0;
   }

   public float w() {
      return this.t;
   }

   public void a(float $$0) {
      this.t = $$0;
   }

   public long x() {
      return this.u;
   }

   public void a(long $$0) {
      this.u = $$0;
   }

   public boolean y() {
      if (this.l != drr.a) {
         return false;
      } else {
         in $$0 = this.az_();
         int $$1 = 80;
         in $$2 = new in($$0.u() - 80, this.n.I_(), $$0.w() - 80);
         in $$3 = new in($$0.u() + 80, this.n.al() - 1, $$0.w() + 80);
         Stream<in> $$4 = this.a($$2, $$3);
         return a($$0, $$4).filter($$1x -> {
            int $$2x = $$1x.k() - $$1x.h();
            int $$3x = $$1x.l() - $$1x.i();
            int $$4x = $$1x.m() - $$1x.j();
            if ($$2x > 1 && $$3x > 1 && $$4x > 1) {
               this.h = new in($$1x.h() - $$0.u() + 1, $$1x.i() - $$0.v() + 1, $$1x.j() - $$0.w() + 1);
               this.i = new jr($$2x - 1, $$3x - 1, $$4x - 1);
               this.e();
               dqh $$5 = this.n.a_($$0);
               this.n.a($$0, $$5, $$5, 3);
               return true;
            } else {
               return false;
            }
         }).isPresent();
      }
   }

   private Stream<in> a(in $$0, in $$1) {
      return in.d($$0, $$1)
         .filter($$0x -> this.n.a_($$0x).a(ddg.pa))
         .map(this.n::c_)
         .filter($$0x -> $$0x instanceof dpb)
         .map($$0x -> (dpb)$$0x)
         .filter($$0x -> $$0x.l == drr.c && Objects.equals(this.e, $$0x.e))
         .map(dnm::az_);
   }

   private static Optional<egh> a(in $$0, Stream<in> $$1) {
      Iterator<in> $$2 = $$1.iterator();
      if (!$$2.hasNext()) {
         return Optional.empty();
      } else {
         in $$3 = $$2.next();
         egh $$4 = new egh($$3);
         if ($$2.hasNext()) {
            $$2.forEachRemaining($$4::a);
         } else {
            $$4.a($$0);
         }

         return Optional.of($$4);
      }
   }

   public boolean z() {
      return this.l != drr.a ? false : this.b(true);
   }

   public boolean b(boolean $$0) {
      if (this.e == null) {
         return false;
      } else {
         in $$1 = this.az_().a((jr)this.h);
         aqh $$2 = (aqh)this.n;
         ekq $$3 = $$2.q();

         ekp $$4;
         try {
            $$4 = $$3.a(this.e);
         } catch (z var8) {
            return false;
         }

         $$4.a(this.n, $$1, this.i, !this.m, ddg.kN);
         $$4.a(this.f);
         if ($$0) {
            try {
               return $$3.c(this.e);
            } catch (z var7) {
               return false;
            }
         } else {
            return true;
         }
      }
   }

   public static ayg b(long $$0) {
      return $$0 == 0L ? ayg.a(ac.b()) : ayg.a($$0);
   }

   public boolean a(aqh $$0) {
      if (this.l == drr.b && this.e != null) {
         ekp $$1 = $$0.q().b(this.e).orElse(null);
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

   public boolean b(aqh $$0) {
      ekp $$1 = this.d($$0);
      if ($$1 == null) {
         return false;
      } else {
         this.a($$1);
         return true;
      }
   }

   private void a(ekp $$0) {
      this.f = !ayu.b($$0.b()) ? $$0.b() : "";
      this.i = $$0.a();
      this.e();
   }

   public void c(aqh $$0) {
      ekp $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$0, $$1);
      }
   }

   @Nullable
   private ekp d(aqh $$0) {
      return this.e == null ? null : $$0.q().b(this.e).orElse(null);
   }

   private void a(aqh $$0, ekp $$1) {
      this.a($$1);
      ekl $$2 = new ekl().a(this.j).a(this.k).a(this.m);
      if (this.t < 1.0F) {
         $$2.b().a(new ejt(axz.a(this.t, 0.0F, 1.0F))).a(b(this.u));
      }

      in $$3 = this.az_().a((jr)this.h);
      $$1.a($$0, $$3, $$3, $$2, b(this.u), 2);
   }

   public void A() {
      if (this.e != null) {
         aqh $$0 = (aqh)this.n;
         ekq $$1 = $$0.q();
         $$1.d(this.e);
      }
   }

   public boolean B() {
      if (this.l == drr.b && !this.n.B && this.e != null) {
         aqh $$0 = (aqh)this.n;
         ekq $$1 = $$0.q();

         try {
            return $$1.b(this.e).isPresent();
         } catch (z var4) {
            return false;
         }
      } else {
         return false;
      }
   }

   public boolean C() {
      return this.q;
   }

   public void c(boolean $$0) {
      this.q = $$0;
   }

   public boolean D() {
      return this.r;
   }

   public void d(boolean $$0) {
      this.r = $$0;
   }

   public boolean E() {
      return this.s;
   }

   public void e(boolean $$0) {
      this.s = $$0;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
