import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dtj extends drs {
   private static final int d = 5;
   public static final int a = 48;
   public static final int b = 48;
   public static final String c = "author";
   @Nullable
   private alc e;
   private String f = "";
   private String g = "";
   private je h = new je(0, 1, 0);
   private ki i = ki.g;
   private dmg j = dmg.a;
   private dnx k = dnx.a;
   private dvy l;
   private boolean m = true;
   private boolean n;
   private boolean r;
   private boolean s = true;
   private float t = 1.0F;
   private long u;

   public dtj(je $$0, duo $$1) {
      super(dru.u, $$0, $$1);
      this.l = $$1.c(dpi.b);
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
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
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      this.a($$0.l("name"));
      this.f = $$0.l("author");
      this.g = $$0.l("metadata");
      int $$2 = azd.a($$0.h("posX"), -48, 48);
      int $$3 = azd.a($$0.h("posY"), -48, 48);
      int $$4 = azd.a($$0.h("posZ"), -48, 48);
      this.h = new je($$2, $$3, $$4);
      int $$5 = azd.a($$0.h("sizeX"), 0, 48);
      int $$6 = azd.a($$0.h("sizeY"), 0, 48);
      int $$7 = azd.a($$0.h("sizeZ"), 0, 48);
      this.i = new ki($$5, $$6, $$7);

      try {
         this.k = dnx.valueOf($$0.l("rotation"));
      } catch (IllegalArgumentException var12) {
         this.k = dnx.a;
      }

      try {
         this.j = dmg.valueOf($$0.l("mirror"));
      } catch (IllegalArgumentException var11) {
         this.j = dmg.a;
      }

      try {
         this.l = dvy.valueOf($$0.l("mode"));
      } catch (IllegalArgumentException var10) {
         this.l = dvy.d;
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
      this.G();
   }

   private void G() {
      if (this.o != null) {
         je $$0 = this.aB_();
         duo $$1 = this.o.a_($$0);
         if ($$1.a(dhl.pa)) {
            this.o.a($$0, $$1.b(dpi.b, this.l), 2);
         }
      }
   }

   public acg b() {
      return acg.a(this);
   }

   @Override
   public uf a(jp.a $$0) {
      return this.e($$0);
   }

   public boolean a(cnu $$0) {
      if (!$$0.gz()) {
         return false;
      } else {
         if ($$0.cR().B) {
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
      this.a(baa.b($$0) ? null : alc.c($$0));
   }

   public void a(@Nullable alc $$0) {
      this.e = $$0;
   }

   public void a(buk $$0) {
      this.f = $$0.aj().getString();
   }

   public je f() {
      return this.h;
   }

   public void a(je $$0) {
      this.h = $$0;
   }

   public ki j() {
      return this.i;
   }

   public void a(ki $$0) {
      this.i = $$0;
   }

   public dmg k() {
      return this.j;
   }

   public void a(dmg $$0) {
      this.j = $$0;
   }

   public dnx t() {
      return this.k;
   }

   public void a(dnx $$0) {
      this.k = $$0;
   }

   public String u() {
      return this.g;
   }

   public void b(String $$0) {
      this.g = $$0;
   }

   public dvy v() {
      return this.l;
   }

   public void a(dvy $$0) {
      this.l = $$0;
      duo $$1 = this.o.a_(this.aB_());
      if ($$1.a(dhl.pa)) {
         this.o.a(this.aB_(), $$1.b(dpi.b, $$0), 2);
      }
   }

   public boolean w() {
      return this.m;
   }

   public void a(boolean $$0) {
      this.m = $$0;
   }

   public float x() {
      return this.t;
   }

   public void a(float $$0) {
      this.t = $$0;
   }

   public long y() {
      return this.u;
   }

   public void a(long $$0) {
      this.u = $$0;
   }

   public boolean z() {
      if (this.l != dvy.a) {
         return false;
      } else {
         je $$0 = this.aB_();
         int $$1 = 80;
         je $$2 = new je($$0.u() - 80, this.o.G_(), $$0.w() - 80);
         je $$3 = new je($$0.u() + 80, this.o.an(), $$0.w() + 80);
         Stream<je> $$4 = this.a($$2, $$3);
         return a($$0, $$4).filter($$1x -> {
            int $$2x = $$1x.k() - $$1x.h();
            int $$3x = $$1x.l() - $$1x.i();
            int $$4x = $$1x.m() - $$1x.j();
            if ($$2x > 1 && $$3x > 1 && $$4x > 1) {
               this.h = new je($$1x.h() - $$0.u() + 1, $$1x.i() - $$0.v() + 1, $$1x.j() - $$0.w() + 1);
               this.i = new ki($$2x - 1, $$3x - 1, $$4x - 1);
               this.e();
               duo $$5 = this.o.a_($$0);
               this.o.a($$0, $$5, $$5, 3);
               return true;
            } else {
               return false;
            }
         }).isPresent();
      }
   }

   private Stream<je> a(je $$0, je $$1) {
      return je.d($$0, $$1)
         .filter($$0x -> this.o.a_($$0x).a(dhl.pa))
         .map(this.o::c_)
         .filter($$0x -> $$0x instanceof dtj)
         .map($$0x -> (dtj)$$0x)
         .filter($$0x -> $$0x.l == dvy.c && Objects.equals(this.e, $$0x.e))
         .map(drs::aB_);
   }

   private static Optional<eku> a(je $$0, Stream<je> $$1) {
      Iterator<je> $$2 = $$1.iterator();
      if (!$$2.hasNext()) {
         return Optional.empty();
      } else {
         je $$3 = $$2.next();
         eku $$4 = new eku($$3);
         if ($$2.hasNext()) {
            $$2.forEachRemaining($$4::a);
         } else {
            $$4.a($$0);
         }

         return Optional.of($$4);
      }
   }

   public boolean A() {
      return this.l != dvy.a ? false : this.b(true);
   }

   public boolean b(boolean $$0) {
      if (this.e == null) {
         return false;
      } else {
         je $$1 = this.aB_().a((ki)this.h);
         arh $$2 = (arh)this.o;
         epf $$3 = $$2.q();

         epe $$4;
         try {
            $$4 = $$3.a(this.e);
         } catch (aa var8) {
            return false;
         }

         $$4.a(this.o, $$1, this.i, !this.m, dhl.kN);
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

   public static azl b(long $$0) {
      return $$0 == 0L ? azl.a(ad.c()) : azl.a($$0);
   }

   public boolean a(arh $$0) {
      if (this.l == dvy.b && this.e != null) {
         epe $$1 = $$0.q().b(this.e).orElse(null);
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

   public boolean b(arh $$0) {
      epe $$1 = this.d($$0);
      if ($$1 == null) {
         return false;
      } else {
         this.a($$1);
         return true;
      }
   }

   private void a(epe $$0) {
      this.f = !baa.b($$0.b()) ? $$0.b() : "";
      this.i = $$0.a();
      this.e();
   }

   public void c(arh $$0) {
      epe $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$0, $$1);
      }
   }

   @Nullable
   private epe d(arh $$0) {
      return this.e == null ? null : $$0.q().b(this.e).orElse(null);
   }

   private void a(arh $$0, epe $$1) {
      this.a($$1);
      epa $$2 = new epa().a(this.j).a(this.k).a(this.m);
      if (this.t < 1.0F) {
         $$2.b().a(new eoh(azd.a(this.t, 0.0F, 1.0F))).a(b(this.u));
      }

      je $$3 = this.aB_().a((ki)this.h);
      $$1.a($$0, $$3, $$3, $$2, b(this.u), 2);
   }

   public void B() {
      if (this.e != null) {
         arh $$0 = (arh)this.o;
         epf $$1 = $$0.q();
         $$1.d(this.e);
      }
   }

   public boolean C() {
      if (this.l == dvy.b && !this.o.B && this.e != null) {
         arh $$0 = (arh)this.o;
         epf $$1 = $$0.q();

         try {
            return $$1.b(this.e).isPresent();
         } catch (aa var4) {
            return false;
         }
      } else {
         return false;
      }
   }

   public boolean D() {
      return this.n;
   }

   public void c(boolean $$0) {
      this.n = $$0;
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

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
