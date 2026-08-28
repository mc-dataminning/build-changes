import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dvp extends dtx {
   private static final int d = 5;
   public static final int a = 48;
   public static final int b = 48;
   public static final String c = "author";
   @Nullable
   private aku e;
   private String f = "";
   private String g = "";
   private ji h = new ji(0, 1, 0);
   private km i = km.h;
   private doj j = doj.a;
   private dqc k = dqc.a;
   private dye l;
   private boolean m = true;
   private boolean n;
   private boolean r;
   private boolean s = true;
   private float t = 1.0F;
   private long u;

   public dvp(ji $$0, dwv $$1) {
      super(dtz.v, $$0, $$1);
      this.l = $$1.c(drn.b);
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
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
      $$0.a("powered", this.n);
      $$0.a("showair", this.r);
      $$0.a("showboundingbox", this.s);
      $$0.a("integrity", this.t);
      $$0.a("seed", this.u);
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.a($$0.l("name"));
      this.f = $$0.l("author");
      this.g = $$0.l("metadata");
      int $$2 = ayy.a($$0.h("posX"), -48, 48);
      int $$3 = ayy.a($$0.h("posY"), -48, 48);
      int $$4 = ayy.a($$0.h("posZ"), -48, 48);
      this.h = new ji($$2, $$3, $$4);
      int $$5 = ayy.a($$0.h("sizeX"), 0, 48);
      int $$6 = ayy.a($$0.h("sizeY"), 0, 48);
      int $$7 = ayy.a($$0.h("sizeZ"), 0, 48);
      this.i = new km($$5, $$6, $$7);

      try {
         this.k = dqc.valueOf($$0.l("rotation"));
      } catch (IllegalArgumentException var12) {
         this.k = dqc.a;
      }

      try {
         this.j = doj.valueOf($$0.l("mirror"));
      } catch (IllegalArgumentException var11) {
         this.j = doj.a;
      }

      try {
         this.l = dye.valueOf($$0.l("mode"));
      } catch (IllegalArgumentException var10) {
         this.l = dye.d;
      }

      this.m = $$0.q("ignoreEntities");
      this.n = $$0.q("powered");
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
      if (this.o != null) {
         ji $$0 = this.aA_();
         dwv $$1 = this.o.a_($$0);
         if ($$1.a(djm.pC)) {
            this.o.a($$0, $$1.b(drn.b, this.l), 2);
         }
      }
   }

   public abr b() {
      return abr.a(this);
   }

   @Override
   public tq a(jt.a $$0) {
      return this.e($$0);
   }

   public boolean a(cov $$0) {
      if (!$$0.gG()) {
         return false;
      } else {
         if ($$0.cU().C) {
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
      this.a(azv.b($$0) ? null : aku.c($$0));
   }

   public void a(@Nullable aku $$0) {
      this.e = $$0;
   }

   public void a(bvf $$0) {
      this.f = $$0.al().getString();
   }

   public ji f() {
      return this.h;
   }

   public void a(ji $$0) {
      this.h = $$0;
   }

   public km j() {
      return this.i;
   }

   public void a(km $$0) {
      this.i = $$0;
   }

   public doj k() {
      return this.j;
   }

   public void a(doj $$0) {
      this.j = $$0;
   }

   public dqc s() {
      return this.k;
   }

   public void a(dqc $$0) {
      this.k = $$0;
   }

   public String t() {
      return this.g;
   }

   public void b(String $$0) {
      this.g = $$0;
   }

   public dye u() {
      return this.l;
   }

   public void a(dye $$0) {
      this.l = $$0;
      dwv $$1 = this.o.a_(this.aA_());
      if ($$1.a(djm.pC)) {
         this.o.a(this.aA_(), $$1.b(drn.b, $$0), 2);
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
      if (this.l != dye.a) {
         return false;
      } else {
         ji $$0 = this.aA_();
         int $$1 = 80;
         ji $$2 = new ji($$0.u() - 80, this.o.L_(), $$0.w() - 80);
         ji $$3 = new ji($$0.u() + 80, this.o.an(), $$0.w() + 80);
         Stream<ji> $$4 = this.a($$2, $$3);
         return a($$0, $$4).filter($$1x -> {
            int $$2x = $$1x.k() - $$1x.h();
            int $$3x = $$1x.l() - $$1x.i();
            int $$4x = $$1x.m() - $$1x.j();
            if ($$2x > 1 && $$3x > 1 && $$4x > 1) {
               this.h = new ji($$1x.h() - $$0.u() + 1, $$1x.i() - $$0.v() + 1, $$1x.j() - $$0.w() + 1);
               this.i = new km($$2x - 1, $$3x - 1, $$4x - 1);
               this.e();
               dwv $$5 = this.o.a_($$0);
               this.o.a($$0, $$5, $$5, 3);
               return true;
            } else {
               return false;
            }
         }).isPresent();
      }
   }

   private Stream<ji> a(ji $$0, ji $$1) {
      return ji.d($$0, $$1)
         .filter($$0x -> this.o.a_($$0x).a(djm.pC))
         .map(this.o::c_)
         .filter($$0x -> $$0x instanceof dvp)
         .map($$0x -> (dvp)$$0x)
         .filter($$0x -> $$0x.l == dye.c && Objects.equals(this.e, $$0x.e))
         .map(dtx::aA_);
   }

   private static Optional<enc> a(ji $$0, Stream<ji> $$1) {
      Iterator<ji> $$2 = $$1.iterator();
      if (!$$2.hasNext()) {
         return Optional.empty();
      } else {
         ji $$3 = $$2.next();
         enc $$4 = new enc($$3);
         if ($$2.hasNext()) {
            $$2.forEachRemaining($$4::a);
         } else {
            $$4.a($$0);
         }

         return Optional.of($$4);
      }
   }

   public boolean z() {
      return this.l != dye.a ? false : this.b(true);
   }

   public boolean b(boolean $$0) {
      if (this.e == null) {
         return false;
      } else {
         ji $$1 = this.aA_().a((km)this.h);
         arc $$2 = (arc)this.o;
         ern $$3 = $$2.r();

         erm $$4;
         try {
            $$4 = $$3.a(this.e);
         } catch (aa var8) {
            return false;
         }

         $$4.a(this.o, $$1, this.i, !this.m, djm.lp);
         $$4.a(this.f);
         if ($$0) {
            try {
               return $$3.c(this.e);
            } catch (aa var7) {
               return false;
            }
         } else {
            return true;
         }
      }
   }

   public static azg b(long $$0) {
      return $$0 == 0L ? azg.a(af.c()) : azg.a($$0);
   }

   public boolean a(arc $$0) {
      if (this.l == dye.b && this.e != null) {
         erm $$1 = $$0.r().b(this.e).orElse(null);
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

   public boolean b(arc $$0) {
      erm $$1 = this.d($$0);
      if ($$1 == null) {
         return false;
      } else {
         this.a($$1);
         return true;
      }
   }

   private void a(erm $$0) {
      this.f = !azv.b($$0.b()) ? $$0.b() : "";
      this.i = $$0.a();
      this.e();
   }

   public void c(arc $$0) {
      erm $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$0, $$1);
      }
   }

   @Nullable
   private erm d(arc $$0) {
      return this.e == null ? null : $$0.r().b(this.e).orElse(null);
   }

   private void a(arc $$0, erm $$1) {
      this.a($$1);
      eri $$2 = new eri().a(this.j).a(this.k).a(this.m);
      if (this.t < 1.0F) {
         $$2.b().a(new eqp(ayy.a(this.t, 0.0F, 1.0F))).a(b(this.u));
      }

      ji $$3 = this.aA_().a((km)this.h);
      $$1.a($$0, $$3, $$3, $$2, b(this.u), 2);
   }

   public void A() {
      if (this.e != null) {
         arc $$0 = (arc)this.o;
         ern $$1 = $$0.r();
         $$1.d(this.e);
      }
   }

   public boolean B() {
      if (this.l == dye.b && !this.o.C && this.e != null) {
         arc $$0 = (arc)this.o;
         ern $$1 = $$0.r();

         try {
            return $$1.b(this.e).isPresent();
         } catch (aa var4) {
            return false;
         }
      } else {
         return false;
      }
   }

   public boolean C() {
      return this.n;
   }

   public void c(boolean $$0) {
      this.n = $$0;
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
