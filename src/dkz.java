import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dkz extends djl {
   private static final int d = 5;
   public static final int a = 48;
   public static final int b = 48;
   public static final String c = "author";
   @Nullable
   private ajc e;
   private String f = "";
   private String g = "";
   private ib h = new ib(0, 1, 0);
   private jf i = jf.g;
   private deb j = deb.a;
   private dfr k = dfr.a;
   private dno l;
   private boolean m = true;
   private boolean n;
   private boolean r;
   private boolean s = true;
   private float t = 1.0F;
   private long u;

   public dkz(ib $$0, dme $$1) {
      super(djn.u, $$0, $$1);
      this.l = $$1.c(dhc.b);
   }

   @Override
   protected void b(sy $$0, in.a $$1) {
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
   public void a(sy $$0, in.a $$1) {
      super.a($$0, $$1);
      this.a($$0.l("name"));
      this.f = $$0.l("author");
      this.g = $$0.l("metadata");
      int $$2 = awm.a($$0.h("posX"), -48, 48);
      int $$3 = awm.a($$0.h("posY"), -48, 48);
      int $$4 = awm.a($$0.h("posZ"), -48, 48);
      this.h = new ib($$2, $$3, $$4);
      int $$5 = awm.a($$0.h("sizeX"), 0, 48);
      int $$6 = awm.a($$0.h("sizeY"), 0, 48);
      int $$7 = awm.a($$0.h("sizeZ"), 0, 48);
      this.i = new jf($$5, $$6, $$7);

      try {
         this.k = dfr.valueOf($$0.l("rotation"));
      } catch (IllegalArgumentException var12) {
         this.k = dfr.a;
      }

      try {
         this.j = deb.valueOf($$0.l("mirror"));
      } catch (IllegalArgumentException var11) {
         this.j = deb.a;
      }

      try {
         this.l = dno.valueOf($$0.l("mode"));
      } catch (IllegalArgumentException var10) {
         this.l = dno.d;
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
      this.E();
   }

   private void E() {
      if (this.o != null) {
         ib $$0 = this.aD_();
         dme $$1 = this.o.a_($$0);
         if ($$1.a(czh.pa)) {
            this.o.a($$0, $$1.a(dhc.b, this.l), 2);
         }
      }
   }

   public aap b() {
      return aap.a(this);
   }

   @Override
   public sy a(in.a $$0) {
      return this.d($$0);
   }

   public boolean a(cia $$0) {
      if (!$$0.gs()) {
         return false;
      } else {
         if ($$0.cH().B) {
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
      this.a(axh.b($$0) ? null : ajc.a($$0));
   }

   public void a(@Nullable ajc $$0) {
      this.e = $$0;
   }

   public void a(box $$0) {
      this.f = $$0.ad().getString();
   }

   public ib f() {
      return this.h;
   }

   public void a(ib $$0) {
      this.h = $$0;
   }

   public jf j() {
      return this.i;
   }

   public void a(jf $$0) {
      this.i = $$0;
   }

   public deb k() {
      return this.j;
   }

   public void a(deb $$0) {
      this.j = $$0;
   }

   public dfr l() {
      return this.k;
   }

   public void a(dfr $$0) {
      this.k = $$0;
   }

   public String s() {
      return this.g;
   }

   public void b(String $$0) {
      this.g = $$0;
   }

   public dno t() {
      return this.l;
   }

   public void a(dno $$0) {
      this.l = $$0;
      dme $$1 = this.o.a_(this.aD_());
      if ($$1.a(czh.pa)) {
         this.o.a(this.aD_(), $$1.a(dhc.b, $$0), 2);
      }
   }

   public boolean u() {
      return this.m;
   }

   public void a(boolean $$0) {
      this.m = $$0;
   }

   public float v() {
      return this.t;
   }

   public void a(float $$0) {
      this.t = $$0;
   }

   public long w() {
      return this.u;
   }

   public void a(long $$0) {
      this.u = $$0;
   }

   public boolean x() {
      if (this.l != dno.a) {
         return false;
      } else {
         ib $$0 = this.aD_();
         int $$1 = 80;
         ib $$2 = new ib($$0.u() - 80, this.o.J_(), $$0.w() - 80);
         ib $$3 = new ib($$0.u() + 80, this.o.ak() - 1, $$0.w() + 80);
         Stream<ib> $$4 = this.a($$2, $$3);
         return a($$0, $$4).filter($$1x -> {
            int $$2x = $$1x.k() - $$1x.h();
            int $$3x = $$1x.l() - $$1x.i();
            int $$4x = $$1x.m() - $$1x.j();
            if ($$2x > 1 && $$3x > 1 && $$4x > 1) {
               this.h = new ib($$1x.h() - $$0.u() + 1, $$1x.i() - $$0.v() + 1, $$1x.j() - $$0.w() + 1);
               this.i = new jf($$2x - 1, $$3x - 1, $$4x - 1);
               this.e();
               dme $$5 = this.o.a_($$0);
               this.o.a($$0, $$5, $$5, 3);
               return true;
            } else {
               return false;
            }
         }).isPresent();
      }
   }

   private Stream<ib> a(ib $$0, ib $$1) {
      return ib.b($$0, $$1)
         .filter($$0x -> this.o.a_($$0x).a(czh.pa))
         .map(this.o::c_)
         .filter($$0x -> $$0x instanceof dkz)
         .map($$0x -> (dkz)$$0x)
         .filter($$0x -> $$0x.l == dno.c && Objects.equals(this.e, $$0x.e))
         .map(djl::aD_);
   }

   private static Optional<eby> a(ib $$0, Stream<ib> $$1) {
      Iterator<ib> $$2 = $$1.iterator();
      if (!$$2.hasNext()) {
         return Optional.empty();
      } else {
         ib $$3 = $$2.next();
         eby $$4 = new eby($$3);
         if ($$2.hasNext()) {
            $$2.forEachRemaining($$4::a);
         } else {
            $$4.a($$0);
         }

         return Optional.of($$4);
      }
   }

   public boolean y() {
      return this.l != dno.a ? false : this.b(true);
   }

   public boolean b(boolean $$0) {
      if (this.e == null) {
         return false;
      } else {
         ib $$1 = this.aD_().a((jf)this.h);
         apa $$2 = (apa)this.o;
         egh $$3 = $$2.q();

         egg $$4;
         try {
            $$4 = $$3.a(this.e);
         } catch (z var8) {
            return false;
         }

         $$4.a(this.o, $$1, this.i, !this.m, czh.kN);
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

   public static awt b(long $$0) {
      return $$0 == 0L ? awt.a(ac.b()) : awt.a($$0);
   }

   public boolean a(apa $$0) {
      if (this.l == dno.b && this.e != null) {
         egg $$1 = $$0.q().b(this.e).orElse(null);
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

   public boolean b(apa $$0) {
      egg $$1 = this.d($$0);
      if ($$1 == null) {
         return false;
      } else {
         this.a($$1);
         return true;
      }
   }

   private void a(egg $$0) {
      this.f = !axh.b($$0.b()) ? $$0.b() : "";
      this.i = $$0.a();
      this.e();
   }

   public void c(apa $$0) {
      egg $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$0, $$1);
      }
   }

   @Nullable
   private egg d(apa $$0) {
      return this.e == null ? null : $$0.q().b(this.e).orElse(null);
   }

   private void a(apa $$0, egg $$1) {
      this.a($$1);
      egc $$2 = new egc().a(this.j).a(this.k).a(this.m);
      if (this.t < 1.0F) {
         $$2.b().a(new efk(awm.a(this.t, 0.0F, 1.0F))).a(b(this.u));
      }

      ib $$3 = this.aD_().a((jf)this.h);
      $$1.a($$0, $$3, $$3, $$2, b(this.u), 2);
   }

   public void z() {
      if (this.e != null) {
         apa $$0 = (apa)this.o;
         egh $$1 = $$0.q();
         $$1.d(this.e);
      }
   }

   public boolean A() {
      if (this.l == dno.b && !this.o.B && this.e != null) {
         apa $$0 = (apa)this.o;
         egh $$1 = $$0.q();

         try {
            return $$1.b(this.e).isPresent();
         } catch (z var4) {
            return false;
         }
      } else {
         return false;
      }
   }

   public boolean B() {
      return this.n;
   }

   public void c(boolean $$0) {
      this.n = $$0;
   }

   public boolean C() {
      return this.r;
   }

   public void d(boolean $$0) {
      this.r = $$0;
   }

   public boolean D() {
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
