import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dgr extends dfd {
   private static final int d = 5;
   public static final int a = 48;
   public static final int b = 48;
   public static final String c = "author";
   private agi e;
   private String f = "";
   private String g = "";
   private ht h = new ht(0, 1, 0);
   private iw i = iw.g;
   private czw j = czw.a;
   private dbm k = dbm.a;
   private dis l;
   private boolean m = true;
   private boolean n;
   private boolean r;
   private boolean s = true;
   private float t = 1.0F;
   private long u;

   public dgr(ht $$0, dhi $$1) {
      super(dff.u, $$0, $$1);
      this.l = $$1.c(dcx.b);
   }

   @Override
   protected void b(rz $$0) {
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
   public void a(rz $$0) {
      super.a($$0);
      this.a($$0.l("name"));
      this.f = $$0.l("author");
      this.g = $$0.l("metadata");
      int $$1 = atm.a($$0.h("posX"), -48, 48);
      int $$2 = atm.a($$0.h("posY"), -48, 48);
      int $$3 = atm.a($$0.h("posZ"), -48, 48);
      this.h = new ht($$1, $$2, $$3);
      int $$4 = atm.a($$0.h("sizeX"), 0, 48);
      int $$5 = atm.a($$0.h("sizeY"), 0, 48);
      int $$6 = atm.a($$0.h("sizeZ"), 0, 48);
      this.i = new iw($$4, $$5, $$6);

      try {
         this.k = dbm.valueOf($$0.l("rotation"));
      } catch (IllegalArgumentException var11) {
         this.k = dbm.a;
      }

      try {
         this.j = czw.valueOf($$0.l("mirror"));
      } catch (IllegalArgumentException var10) {
         this.j = czw.a;
      }

      try {
         this.l = dis.valueOf($$0.l("mode"));
      } catch (IllegalArgumentException var9) {
         this.l = dis.d;
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
         ht $$0 = this.p();
         dhi $$1 = this.o.a_($$0);
         if ($$1.a(cvc.pa)) {
            this.o.a($$0, $$1.a(dcx.b, this.l), 2);
         }
      }
   }

   public yk c() {
      return yk.a(this);
   }

   @Override
   public rz aw_() {
      return this.o();
   }

   public boolean a(cdu $$0) {
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

   @Override
   public String f() {
      return this.e == null ? "" : this.e.a();
   }

   public boolean g() {
      return this.e != null;
   }

   public void a(@Nullable String $$0) {
      this.a(auh.b($$0) ? null : agi.a($$0));
   }

   public void a(@Nullable agi $$0) {
      this.e = $$0;
   }

   public void a(blg $$0) {
      this.f = $$0.ad().getString();
   }

   public ht i() {
      return this.h;
   }

   public void a(ht $$0) {
      this.h = $$0;
   }

   public iw j() {
      return this.i;
   }

   public void a(iw $$0) {
      this.i = $$0;
   }

   public czw v() {
      return this.j;
   }

   public void a(czw $$0) {
      this.j = $$0;
   }

   public dbm w() {
      return this.k;
   }

   public void a(dbm $$0) {
      this.k = $$0;
   }

   public String x() {
      return this.g;
   }

   public void b(String $$0) {
      this.g = $$0;
   }

   public dis y() {
      return this.l;
   }

   public void a(dis $$0) {
      this.l = $$0;
      dhi $$1 = this.o.a_(this.p());
      if ($$1.a(cvc.pa)) {
         this.o.a(this.p(), $$1.a(dcx.b, $$0), 2);
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
      if (this.l != dis.a) {
         return false;
      } else {
         ht $$0 = this.p();
         int $$1 = 80;
         ht $$2 = new ht($$0.u() - 80, this.o.I_(), $$0.w() - 80);
         ht $$3 = new ht($$0.u() + 80, this.o.ak() - 1, $$0.w() + 80);
         Stream<ht> $$4 = this.a($$2, $$3);
         return a($$0, $$4).filter($$1x -> {
            int $$2x = $$1x.j() - $$1x.g();
            int $$3x = $$1x.k() - $$1x.h();
            int $$4x = $$1x.l() - $$1x.i();
            if ($$2x > 1 && $$3x > 1 && $$4x > 1) {
               this.h = new ht($$1x.g() - $$0.u() + 1, $$1x.h() - $$0.v() + 1, $$1x.i() - $$0.w() + 1);
               this.i = new iw($$2x - 1, $$3x - 1, $$4x - 1);
               this.e();
               dhi $$5 = this.o.a_($$0);
               this.o.a($$0, $$5, $$5, 3);
               return true;
            } else {
               return false;
            }
         }).isPresent();
      }
   }

   private Stream<ht> a(ht $$0, ht $$1) {
      return ht.b($$0, $$1)
         .filter($$0x -> this.o.a_($$0x).a(cvc.pa))
         .map(this.o::c_)
         .filter($$0x -> $$0x instanceof dgr)
         .map($$0x -> (dgr)$$0x)
         .filter($$0x -> $$0x.l == dis.c && Objects.equals(this.e, $$0x.e))
         .map(dfd::p);
   }

   private static Optional<dwz> a(ht $$0, Stream<ht> $$1) {
      Iterator<ht> $$2 = $$1.iterator();
      if (!$$2.hasNext()) {
         return Optional.empty();
      } else {
         ht $$3 = $$2.next();
         dwz $$4 = new dwz($$3);
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
      if (this.l == dis.a && !this.o.B && this.e != null) {
         ht $$1 = this.p().a((iw)this.h);
         ame $$2 = (ame)this.o;
         ebi $$3 = $$2.p();

         ebh $$4;
         try {
            $$4 = $$3.a(this.e);
         } catch (z var8) {
            return false;
         }

         $$4.a(this.o, $$1, this.i, !this.m, cvc.kN);
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

   public boolean a(ame $$0) {
      return this.a($$0, true);
   }

   public static ats b(long $$0) {
      return $$0 == 0L ? ats.a(ac.b()) : ats.a($$0);
   }

   public boolean a(ame $$0, boolean $$1) {
      if (this.l == dis.b && this.e != null) {
         ebi $$2 = $$0.p();

         Optional<ebh> $$3;
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

   public boolean a(ame $$0, boolean $$1, ebh $$2) {
      ht $$3 = this.p();
      if (!auh.b($$2.b())) {
         this.f = $$2.b();
      }

      iw $$4 = $$2.a();
      boolean $$5 = this.i.equals($$4);
      if (!$$5) {
         this.i = $$4;
         this.e();
         dhi $$6 = $$0.a_($$3);
         $$0.a($$3, $$6, $$6, 3);
      }

      if ($$1 && !$$5) {
         return false;
      } else {
         ebd $$7 = new ebd().a(this.j).a(this.k).a(this.m);
         if (this.t < 1.0F) {
            $$7.b().a(new eal(atm.a(this.t, 0.0F, 1.0F))).a(b(this.u));
         }

         ht $$8 = $$3.a((iw)this.h);
         $$2.a($$0, $$8, $$8, $$7, b(this.u), 2);
         return true;
      }
   }

   public void E() {
      if (this.e != null) {
         ame $$0 = (ame)this.o;
         ebi $$1 = $$0.p();
         $$1.d(this.e);
      }
   }

   public boolean F() {
      if (this.l == dis.b && !this.o.B && this.e != null) {
         ame $$0 = (ame)this.o;
         ebi $$1 = $$0.p();

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
