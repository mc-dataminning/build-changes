import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dxe extends dvl implements dvo {
   private static final int d = 5;
   public static final int a = 48;
   public static final int b = 48;
   public static final String c = "author";
   @Nullable
   private ald e;
   private String f = "";
   private String g = "";
   private jj h = new jj(0, 1, 0);
   private kn i;
   private dpv j;
   private drm k;
   private dzw l;
   private boolean m;
   private boolean q;
   private boolean r;
   private boolean s;
   private boolean t;
   private float u;
   private long v;

   public dxe(jj $$0, dym $$1) {
      super(dvn.v, $$0, $$1);
      this.i = kn.i;
      this.j = dpv.a;
      this.k = drm.a;
      this.m = true;
      this.q = false;
      this.t = true;
      this.u = 1.0F;
      this.l = $$1.c(dsy.b);
   }

   @Override
   protected void b(tw $$0, ju.a $$1) {
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
      $$0.a("rotation", this.k.toString());
      $$0.a("mirror", this.j.toString());
      $$0.a("mode", this.l.toString());
      $$0.a("ignoreEntities", this.m);
      $$0.a("strict", this.q);
      $$0.a("powered", this.r);
      $$0.a("showair", this.s);
      $$0.a("showboundingbox", this.t);
      $$0.a("integrity", this.u);
      $$0.a("seed", this.v);
   }

   @Override
   protected void a(tw $$0, ju.a $$1) {
      super.a($$0, $$1);
      this.a($$0.l("name"));
      this.f = $$0.l("author");
      this.g = $$0.l("metadata");
      int $$2 = azk.a($$0.h("posX"), -48, 48);
      int $$3 = azk.a($$0.h("posY"), -48, 48);
      int $$4 = azk.a($$0.h("posZ"), -48, 48);
      this.h = new jj($$2, $$3, $$4);
      int $$5 = azk.a($$0.h("sizeX"), 0, 48);
      int $$6 = azk.a($$0.h("sizeY"), 0, 48);
      int $$7 = azk.a($$0.h("sizeZ"), 0, 48);
      this.i = new kn($$5, $$6, $$7);

      try {
         this.k = drm.valueOf($$0.l("rotation"));
      } catch (IllegalArgumentException var12) {
         this.k = drm.a;
      }

      try {
         this.j = dpv.valueOf($$0.l("mirror"));
      } catch (IllegalArgumentException var11) {
         this.j = dpv.a;
      }

      try {
         this.l = dzw.valueOf($$0.l("mode"));
      } catch (IllegalArgumentException var10) {
         this.l = dzw.d;
      }

      this.m = $$0.q("ignoreEntities");
      this.q = $$0.q("strict");
      this.r = $$0.q("powered");
      this.s = $$0.q("showair");
      this.t = $$0.q("showboundingbox");
      if ($$0.e("integrity")) {
         this.u = $$0.j("integrity");
      } else {
         this.u = 1.0F;
      }

      this.v = $$0.i("seed");
      this.H();
   }

   private void H() {
      if (this.n != null) {
         jj $$0 = this.aw_();
         dym $$1 = this.n.a_($$0);
         if ($$1.a(dkw.pC)) {
            this.n.a($$0, $$1.b(dsy.b, this.l), 2);
         }
      }
   }

   public abx a() {
      return abx.a(this);
   }

   @Override
   public tw a(ju.a $$0) {
      return this.e($$0);
   }

   public boolean a(cqi $$0) {
      if (!$$0.gF()) {
         return false;
      } else {
         if ($$0.cU().C) {
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
      this.a(bah.b($$0) ? null : ald.c($$0));
   }

   public void a(@Nullable ald $$0) {
      this.e = $$0;
   }

   public void a(bwr $$0) {
      this.f = $$0.al().getString();
   }

   public jj j() {
      return this.h;
   }

   public void a(jj $$0) {
      this.h = $$0;
   }

   public kn k() {
      return this.i;
   }

   public void a(kn $$0) {
      this.i = $$0;
   }

   public dpv s() {
      return this.j;
   }

   public void a(dpv $$0) {
      this.j = $$0;
   }

   public drm t() {
      return this.k;
   }

   public void a(drm $$0) {
      this.k = $$0;
   }

   public String u() {
      return this.g;
   }

   public void b(String $$0) {
      this.g = $$0;
   }

   public dzw v() {
      return this.l;
   }

   public void a(dzw $$0) {
      this.l = $$0;
      dym $$1 = this.n.a_(this.aw_());
      if ($$1.a(dkw.pC)) {
         this.n.a(this.aw_(), $$1.b(dsy.b, $$0), 2);
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
      if (this.l != dzw.a) {
         return false;
      } else {
         jj $$0 = this.aw_();
         int $$1 = 80;
         jj $$2 = new jj($$0.u() - 80, this.n.G_(), $$0.w() - 80);
         jj $$3 = new jj($$0.u() + 80, this.n.ao(), $$0.w() + 80);
         Stream<jj> $$4 = this.a($$2, $$3);
         return a($$0, $$4).filter($$1x -> {
            int $$2x = $$1x.k() - $$1x.h();
            int $$3x = $$1x.l() - $$1x.i();
            int $$4x = $$1x.m() - $$1x.j();
            if ($$2x > 1 && $$3x > 1 && $$4x > 1) {
               this.h = new jj($$1x.h() - $$0.u() + 1, $$1x.i() - $$0.v() + 1, $$1x.j() - $$0.w() + 1);
               this.i = new kn($$2x - 1, $$3x - 1, $$4x - 1);
               this.e();
               dym $$5 = this.n.a_($$0);
               this.n.a($$0, $$5, $$5, 3);
               return true;
            } else {
               return false;
            }
         }).isPresent();
      }
   }

   private Stream<jj> a(jj $$0, jj $$1) {
      return jj.d($$0, $$1)
         .filter($$0x -> this.n.a_($$0x).a(dkw.pC))
         .map(this.n::c_)
         .filter($$0x -> $$0x instanceof dxe)
         .map($$0x -> (dxe)$$0x)
         .filter($$0x -> $$0x.l == dzw.c && Objects.equals(this.e, $$0x.e))
         .map(dvl::aw_);
   }

   private static Optional<eoy> a(jj $$0, Stream<jj> $$1) {
      Iterator<jj> $$2 = $$1.iterator();
      if (!$$2.hasNext()) {
         return Optional.empty();
      } else {
         jj $$3 = $$2.next();
         eoy $$4 = new eoy($$3);
         if ($$2.hasNext()) {
            $$2.forEachRemaining($$4::a);
         } else {
            $$4.a($$0);
         }

         return Optional.of($$4);
      }
   }

   public boolean B() {
      return this.l != dzw.a ? false : this.c(true);
   }

   public boolean c(boolean $$0) {
      if (this.e != null && this.n instanceof arn $$1) {
         jj var4 = this.aw_().a((kn)this.h);
         return a($$1, this.e, var4, this.i, this.m, this.f, $$0);
      } else {
         return false;
      }
   }

   public static boolean a(arn $$0, ald $$1, jj $$2, kn $$3, boolean $$4, String $$5, boolean $$6) {
      etj $$7 = $$0.r();

      eti $$8;
      try {
         $$8 = $$7.a($$1);
      } catch (aa var11) {
         return false;
      }

      $$8.a($$0, $$2, $$3, !$$4, dkw.lp);
      $$8.a($$5);
      if ($$6) {
         try {
            return $$7.c($$1);
         } catch (aa var10) {
            return false;
         }
      } else {
         return true;
      }
   }

   public static azs b(long $$0) {
      return $$0 == 0L ? azs.a(af.c()) : azs.a($$0);
   }

   public boolean a(arn $$0) {
      if (this.l == dzw.b && this.e != null) {
         eti $$1 = $$0.r().b(this.e).orElse(null);
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

   public boolean b(arn $$0) {
      eti $$1 = this.d($$0);
      if ($$1 == null) {
         return false;
      } else {
         this.a($$1);
         return true;
      }
   }

   private void a(eti $$0) {
      this.f = !bah.b($$0.b()) ? $$0.b() : "";
      this.i = $$0.a();
      this.e();
   }

   public void c(arn $$0) {
      eti $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$0, $$1);
      }
   }

   @Nullable
   private eti d(arn $$0) {
      return this.e == null ? null : $$0.r().b(this.e).orElse(null);
   }

   private void a(arn $$0, eti $$1) {
      this.a($$1);
      ete $$2 = new ete().a(this.j).a(this.k).a(this.m).b(this.q);
      if (this.u < 1.0F) {
         $$2.b().a(new esl(azk.a(this.u, 0.0F, 1.0F))).a(b(this.v));
      }

      jj $$3 = this.aw_().a((kn)this.h);
      $$1.a($$0, $$3, $$3, $$2, b(this.v), 2 | (this.q ? 304 : 0));
   }

   public void C() {
      if (this.e != null) {
         arn $$0 = (arn)this.n;
         etj $$1 = $$0.r();
         $$1.d(this.e);
      }
   }

   public boolean D() {
      if (this.l == dzw.b && !this.n.C && this.e != null) {
         arn $$0 = (arn)this.n;
         etj $$1 = $$0.r();

         try {
            return $$1.b(this.e).isPresent();
         } catch (aa var4) {
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
   public dvo.a b() {
      if (this.l != dzw.a && this.l != dzw.b) {
         return dvo.a.a;
      } else if (this.l == dzw.a && this.s) {
         return dvo.a.c;
      } else {
         return this.l != dzw.a && !this.t ? dvo.a.a : dvo.a.b;
      }
   }

   @Override
   public dvo.b c() {
      jj $$0 = this.j();
      kn $$1 = this.k();
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

      return dvo.b.a($$24, $$4, $$25, $$26, $$5, $$27);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
