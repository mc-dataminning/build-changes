import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class ded extends dcq {
   private static final int d = 5;
   public static final int a = 48;
   public static final int b = 48;
   public static final String c = "author";
   private aeu e;
   private String f = "";
   private String g = "";
   private gw h = new gw(0, 1, 0);
   private ib i = ib.g;
   private cxl j = cxl.a;
   private czc k = czc.a;
   private dgo l;
   private boolean m = true;
   private boolean n;
   private boolean r;
   private boolean s = true;
   private float t = 1.0F;
   private long u;

   public ded(gw $$0, dfe $$1) {
      super(dcs.u, $$0, $$1);
      this.l = $$1.c(dap.a);
   }

   @Override
   protected void b(qu $$0) {
      super.b($$0);
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
      $$0.a("powered", this.n);
      $$0.a("showair", this.r);
      $$0.a("showboundingbox", this.s);
      $$0.a("integrity", this.t);
      $$0.a("seed", this.u);
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.a($$0.l("name"));
      this.f = $$0.l("author");
      this.g = $$0.l("metadata");
      int $$1 = ars.a($$0.h("posX"), -48, 48);
      int $$2 = ars.a($$0.h("posY"), -48, 48);
      int $$3 = ars.a($$0.h("posZ"), -48, 48);
      this.h = new gw($$1, $$2, $$3);
      int $$4 = ars.a($$0.h("sizeX"), 0, 48);
      int $$5 = ars.a($$0.h("sizeY"), 0, 48);
      int $$6 = ars.a($$0.h("sizeZ"), 0, 48);
      this.i = new ib($$4, $$5, $$6);

      try {
         this.k = czc.valueOf($$0.l("rotation"));
      } catch (IllegalArgumentException var11) {
         this.k = czc.a;
      }

      try {
         this.j = cxl.valueOf($$0.l("mirror"));
      } catch (IllegalArgumentException var10) {
         this.j = cxl.a;
      }

      try {
         this.l = dgo.valueOf($$0.l("mode"));
      } catch (IllegalArgumentException var9) {
         this.l = dgo.d;
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
      this.J();
   }

   private void J() {
      if (this.o != null) {
         gw $$0 = this.p();
         dfe $$1 = this.o.a_($$0);
         if ($$1.a(csr.pa)) {
            this.o.a($$0, $$1.a(dap.a, this.l), 2);
         }
      }
   }

   public xa c() {
      return xa.a(this);
   }

   @Override
   public qu an_() {
      return this.o();
   }

   public boolean a(cbp $$0) {
      if (!$$0.gn()) {
         return false;
      } else {
         if ($$0.cJ().B) {
            $$0.a(this);
         }

         return true;
      }
   }

   public String d() {
      return this.e == null ? "" : this.e.toString();
   }

   @Override
   public String f() {
      return this.e == null ? "" : this.e.a();
   }

   public boolean g() {
      return this.e != null;
   }

   public void a(@Nullable String $$0) {
      this.a(asl.b($$0) ? null : aeu.a($$0));
   }

   public void a(@Nullable aeu $$0) {
      this.e = $$0;
   }

   public void a(bjb $$0) {
      this.f = $$0.ab().getString();
   }

   public gw i() {
      return this.h;
   }

   public void a(gw $$0) {
      this.h = $$0;
   }

   public ib j() {
      return this.i;
   }

   public void a(ib $$0) {
      this.i = $$0;
   }

   public cxl v() {
      return this.j;
   }

   public void a(cxl $$0) {
      this.j = $$0;
   }

   public czc w() {
      return this.k;
   }

   public void a(czc $$0) {
      this.k = $$0;
   }

   public String x() {
      return this.g;
   }

   public void b(String $$0) {
      this.g = $$0;
   }

   public dgo y() {
      return this.l;
   }

   public void a(dgo $$0) {
      this.l = $$0;
      dfe $$1 = this.o.a_(this.p());
      if ($$1.a(csr.pa)) {
         this.o.a(this.p(), $$1.a(dap.a, $$0), 2);
      }
   }

   public boolean z() {
      return this.m;
   }

   public void a(boolean $$0) {
      this.m = $$0;
   }

   public float A() {
      return this.t;
   }

   public void a(float $$0) {
      this.t = $$0;
   }

   public long B() {
      return this.u;
   }

   public void a(long $$0) {
      this.u = $$0;
   }

   public boolean C() {
      if (this.l != dgo.a) {
         return false;
      } else {
         gw $$0 = this.p();
         int $$1 = 80;
         gw $$2 = new gw($$0.u() - 80, this.o.C_(), $$0.w() - 80);
         gw $$3 = new gw($$0.u() + 80, this.o.aj() - 1, $$0.w() + 80);
         Stream<gw> $$4 = this.a($$2, $$3);
         return a($$0, $$4).filter($$1x -> {
            int $$2x = $$1x.j() - $$1x.g();
            int $$3x = $$1x.k() - $$1x.h();
            int $$4x = $$1x.l() - $$1x.i();
            if ($$2x > 1 && $$3x > 1 && $$4x > 1) {
               this.h = new gw($$1x.g() - $$0.u() + 1, $$1x.h() - $$0.v() + 1, $$1x.i() - $$0.w() + 1);
               this.i = new ib($$2x - 1, $$3x - 1, $$4x - 1);
               this.e();
               dfe $$5 = this.o.a_($$0);
               this.o.a($$0, $$5, $$5, 3);
               return true;
            } else {
               return false;
            }
         }).isPresent();
      }
   }

   private Stream<gw> a(gw $$0, gw $$1) {
      return gw.b($$0, $$1)
         .filter($$0x -> this.o.a_($$0x).a(csr.pa))
         .map(this.o::c_)
         .filter($$0x -> $$0x instanceof ded)
         .map($$0x -> (ded)$$0x)
         .filter($$0x -> $$0x.l == dgo.c && Objects.equals(this.e, $$0x.e))
         .map(dcq::p);
   }

   private static Optional<duv> a(gw $$0, Stream<gw> $$1) {
      Iterator<gw> $$2 = $$1.iterator();
      if (!$$2.hasNext()) {
         return Optional.empty();
      } else {
         gw $$3 = $$2.next();
         duv $$4 = new duv($$3);
         if ($$2.hasNext()) {
            $$2.forEachRemaining($$4::a);
         } else {
            $$4.a($$0);
         }

         return Optional.of($$4);
      }
   }

   public boolean D() {
      return this.b(true);
   }

   public boolean b(boolean $$0) {
      if (this.l == dgo.a && !this.o.B && this.e != null) {
         gw $$1 = this.p().a((ib)this.h);
         akn $$2 = (akn)this.o;
         dyx $$3 = $$2.p();

         dyw $$4;
         try {
            $$4 = $$3.a(this.e);
         } catch (z var8) {
            return false;
         }

         $$4.a(this.o, $$1, this.i, !this.m, csr.kN);
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
      } else {
         return false;
      }
   }

   public boolean a(akn $$0) {
      return this.a($$0, true);
   }

   public static arx b(long $$0) {
      return $$0 == 0L ? arx.a(ac.b()) : arx.a($$0);
   }

   public boolean a(akn $$0, boolean $$1) {
      if (this.l == dgo.b && this.e != null) {
         dyx $$2 = $$0.p();

         Optional<dyw> $$3;
         try {
            $$3 = $$2.b(this.e);
         } catch (z var6) {
            return false;
         }

         return $$3.isEmpty() ? false : this.a($$0, $$1, $$3.get());
      } else {
         return false;
      }
   }

   public boolean a(akn $$0, boolean $$1, dyw $$2) {
      gw $$3 = this.p();
      if (!asl.b($$2.b())) {
         this.f = $$2.b();
      }

      ib $$4 = $$2.a();
      boolean $$5 = this.i.equals($$4);
      if (!$$5) {
         this.i = $$4;
         this.e();
         dfe $$6 = $$0.a_($$3);
         $$0.a($$3, $$6, $$6, 3);
      }

      if ($$1 && !$$5) {
         return false;
      } else {
         dys $$7 = new dys().a(this.j).a(this.k).a(this.m);
         if (this.t < 1.0F) {
            $$7.b().a(new dya(ars.a(this.t, 0.0F, 1.0F))).a(b(this.u));
         }

         gw $$8 = $$3.a((ib)this.h);
         $$2.a($$0, $$8, $$8, $$7, b(this.u), 2);
         return true;
      }
   }

   public void E() {
      if (this.e != null) {
         akn $$0 = (akn)this.o;
         dyx $$1 = $$0.p();
         $$1.d(this.e);
      }
   }

   public boolean F() {
      if (this.l == dgo.b && !this.o.B && this.e != null) {
         akn $$0 = (akn)this.o;
         dyx $$1 = $$0.p();

         try {
            return $$1.b(this.e).isPresent();
         } catch (z var4) {
            return false;
         }
      } else {
         return false;
      }
   }

   public boolean G() {
      return this.n;
   }

   public void c(boolean $$0) {
      this.n = $$0;
   }

   public boolean H() {
      return this.r;
   }

   public void d(boolean $$0) {
      this.r = $$0;
   }

   public boolean I() {
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
