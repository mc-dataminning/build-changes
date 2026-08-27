import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dkl extends dix {
   private static final int d = 5;
   public static final int a = 48;
   public static final int b = 48;
   public static final String c = "author";
   @Nullable
   private aiy e;
   private String f = "";
   private String g = "";
   private hz h = new hz(0, 1, 0);
   private jd i = jd.g;
   private ddo j = ddo.a;
   private dfe k = dfe.a;
   private dmt l;
   private boolean m = true;
   private boolean n;
   private boolean r;
   private boolean s = true;
   private float t = 1.0F;
   private long u;

   public dkl(hz $$0, dlj $$1) {
      super(diz.u, $$0, $$1);
      this.l = $$1.c(dgp.b);
   }

   @Override
   protected void b(sw $$0) {
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
   public void a(sw $$0) {
      super.a($$0);
      this.a($$0.l("name"));
      this.f = $$0.l("author");
      this.g = $$0.l("metadata");
      int $$1 = awi.a($$0.h("posX"), -48, 48);
      int $$2 = awi.a($$0.h("posY"), -48, 48);
      int $$3 = awi.a($$0.h("posZ"), -48, 48);
      this.h = new hz($$1, $$2, $$3);
      int $$4 = awi.a($$0.h("sizeX"), 0, 48);
      int $$5 = awi.a($$0.h("sizeY"), 0, 48);
      int $$6 = awi.a($$0.h("sizeZ"), 0, 48);
      this.i = new jd($$4, $$5, $$6);

      try {
         this.k = dfe.valueOf($$0.l("rotation"));
      } catch (IllegalArgumentException var11) {
         this.k = dfe.a;
      }

      try {
         this.j = ddo.valueOf($$0.l("mirror"));
      } catch (IllegalArgumentException var10) {
         this.j = ddo.a;
      }

      try {
         this.l = dmt.valueOf($$0.l("mode"));
      } catch (IllegalArgumentException var9) {
         this.l = dmt.d;
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
      this.I();
   }

   private void I() {
      if (this.o != null) {
         hz $$0 = this.aE_();
         dlj $$1 = this.o.a_($$0);
         if ($$1.a(cyu.pa)) {
            this.o.a($$0, $$1.a(dgp.b, this.l), 2);
         }
      }
   }

   public aan c() {
      return aan.a(this);
   }

   @Override
   public sw aA_() {
      return this.q();
   }

   public boolean a(chl $$0) {
      if (!$$0.gq()) {
         return false;
      } else {
         if ($$0.cK().B) {
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
      this.a(axd.b($$0) ? null : aiy.a($$0));
   }

   public void a(@Nullable aiy $$0) {
      this.e = $$0;
   }

   public void a(boi $$0) {
      this.f = $$0.ad().getString();
   }

   public hz g() {
      return this.h;
   }

   public void a(hz $$0) {
      this.h = $$0;
   }

   public jd k() {
      return this.i;
   }

   public void a(jd $$0) {
      this.i = $$0;
   }

   public ddo l() {
      return this.j;
   }

   public void a(ddo $$0) {
      this.j = $$0;
   }

   public dfe m() {
      return this.k;
   }

   public void a(dfe $$0) {
      this.k = $$0;
   }

   public String w() {
      return this.g;
   }

   public void b(String $$0) {
      this.g = $$0;
   }

   public dmt x() {
      return this.l;
   }

   public void a(dmt $$0) {
      this.l = $$0;
      dlj $$1 = this.o.a_(this.aE_());
      if ($$1.a(cyu.pa)) {
         this.o.a(this.aE_(), $$1.a(dgp.b, $$0), 2);
      }
   }

   public boolean y() {
      return this.m;
   }

   public void a(boolean $$0) {
      this.m = $$0;
   }

   public float z() {
      return this.t;
   }

   public void a(float $$0) {
      this.t = $$0;
   }

   public long A() {
      return this.u;
   }

   public void a(long $$0) {
      this.u = $$0;
   }

   public boolean B() {
      if (this.l != dmt.a) {
         return false;
      } else {
         hz $$0 = this.aE_();
         int $$1 = 80;
         hz $$2 = new hz($$0.u() - 80, this.o.J_(), $$0.w() - 80);
         hz $$3 = new hz($$0.u() + 80, this.o.ak() - 1, $$0.w() + 80);
         Stream<hz> $$4 = this.a($$2, $$3);
         return a($$0, $$4).filter($$1x -> {
            int $$2x = $$1x.k() - $$1x.h();
            int $$3x = $$1x.l() - $$1x.i();
            int $$4x = $$1x.m() - $$1x.j();
            if ($$2x > 1 && $$3x > 1 && $$4x > 1) {
               this.h = new hz($$1x.h() - $$0.u() + 1, $$1x.i() - $$0.v() + 1, $$1x.j() - $$0.w() + 1);
               this.i = new jd($$2x - 1, $$3x - 1, $$4x - 1);
               this.e();
               dlj $$5 = this.o.a_($$0);
               this.o.a($$0, $$5, $$5, 3);
               return true;
            } else {
               return false;
            }
         }).isPresent();
      }
   }

   private Stream<hz> a(hz $$0, hz $$1) {
      return hz.b($$0, $$1)
         .filter($$0x -> this.o.a_($$0x).a(cyu.pa))
         .map(this.o::c_)
         .filter($$0x -> $$0x instanceof dkl)
         .map($$0x -> (dkl)$$0x)
         .filter($$0x -> $$0x.l == dmt.c && Objects.equals(this.e, $$0x.e))
         .map(dix::aE_);
   }

   private static Optional<ebd> a(hz $$0, Stream<hz> $$1) {
      Iterator<hz> $$2 = $$1.iterator();
      if (!$$2.hasNext()) {
         return Optional.empty();
      } else {
         hz $$3 = $$2.next();
         ebd $$4 = new ebd($$3);
         if ($$2.hasNext()) {
            $$2.forEachRemaining($$4::a);
         } else {
            $$4.a($$0);
         }

         return Optional.of($$4);
      }
   }

   public boolean C() {
      return this.l != dmt.a ? false : this.b(true);
   }

   public boolean b(boolean $$0) {
      if (this.e == null) {
         return false;
      } else {
         hz $$1 = this.aE_().a((jd)this.h);
         aow $$2 = (aow)this.o;
         efm $$3 = $$2.q();

         efl $$4;
         try {
            $$4 = $$3.a(this.e);
         } catch (z var8) {
            return false;
         }

         $$4.a(this.o, $$1, this.i, !this.m, cyu.kN);
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

   public static awp b(long $$0) {
      return $$0 == 0L ? awp.a(ac.b()) : awp.a($$0);
   }

   public boolean a(aow $$0) {
      if (this.l == dmt.b && this.e != null) {
         efl $$1 = $$0.q().b(this.e).orElse(null);
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

   public boolean b(aow $$0) {
      efl $$1 = this.d($$0);
      if ($$1 == null) {
         return false;
      } else {
         this.a($$1);
         return true;
      }
   }

   private void a(efl $$0) {
      this.f = !axd.b($$0.b()) ? $$0.b() : "";
      this.i = $$0.a();
      this.e();
   }

   public void c(aow $$0) {
      efl $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$0, $$1);
      }
   }

   @Nullable
   private efl d(aow $$0) {
      return this.e == null ? null : $$0.q().b(this.e).orElse(null);
   }

   private void a(aow $$0, efl $$1) {
      this.a($$1);
      efh $$2 = new efh().a(this.j).a(this.k).a(this.m);
      if (this.t < 1.0F) {
         $$2.b().a(new eep(awi.a(this.t, 0.0F, 1.0F))).a(b(this.u));
      }

      hz $$3 = this.aE_().a((jd)this.h);
      $$1.a($$0, $$3, $$3, $$2, b(this.u), 2);
   }

   public void D() {
      if (this.e != null) {
         aow $$0 = (aow)this.o;
         efm $$1 = $$0.q();
         $$1.d(this.e);
      }
   }

   public boolean E() {
      if (this.l == dmt.b && !this.o.B && this.e != null) {
         aow $$0 = (aow)this.o;
         efm $$1 = $$0.q();

         try {
            return $$1.b(this.e).isPresent();
         } catch (z var4) {
            return false;
         }
      } else {
         return false;
      }
   }

   public boolean F() {
      return this.n;
   }

   public void c(boolean $$0) {
      this.n = $$0;
   }

   public boolean G() {
      return this.r;
   }

   public void d(boolean $$0) {
      this.r = $$0;
   }

   public boolean H() {
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
