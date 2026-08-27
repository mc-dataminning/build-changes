import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dnu extends dmf {
   private static final int d = 5;
   public static final int a = 48;
   public static final int b = 48;
   public static final String c = "author";
   @Nullable
   private ajt e;
   private String f = "";
   private String g = "";
   private ib h = new ib(0, 1, 0);
   private jg i = jg.g;
   private dgu j = dgu.a;
   private dik k = dik.a;
   private dqj l;
   private boolean m = true;
   private boolean n;
   private boolean r;
   private boolean s = true;
   private float t = 1.0F;
   private long u;

   public dnu(ib $$0, doz $$1) {
      super(dmh.u, $$0, $$1);
      this.l = $$1.c(djv.b);
   }

   @Override
   protected void b(tm $$0, in.a $$1) {
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
   public void a(tm $$0, in.a $$1) {
      super.a($$0, $$1);
      this.a($$0.l("name"));
      this.f = $$0.l("author");
      this.g = $$0.l("metadata");
      int $$2 = axk.a($$0.h("posX"), -48, 48);
      int $$3 = axk.a($$0.h("posY"), -48, 48);
      int $$4 = axk.a($$0.h("posZ"), -48, 48);
      this.h = new ib($$2, $$3, $$4);
      int $$5 = axk.a($$0.h("sizeX"), 0, 48);
      int $$6 = axk.a($$0.h("sizeY"), 0, 48);
      int $$7 = axk.a($$0.h("sizeZ"), 0, 48);
      this.i = new jg($$5, $$6, $$7);

      try {
         this.k = dik.valueOf($$0.l("rotation"));
      } catch (IllegalArgumentException var12) {
         this.k = dik.a;
      }

      try {
         this.j = dgu.valueOf($$0.l("mirror"));
      } catch (IllegalArgumentException var11) {
         this.j = dgu.a;
      }

      try {
         this.l = dqj.valueOf($$0.l("mode"));
      } catch (IllegalArgumentException var10) {
         this.l = dqj.d;
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
         ib $$0 = this.aA_();
         doz $$1 = this.o.a_($$0);
         if ($$1.a(dca.pa)) {
            this.o.a($$0, $$1.a(djv.b, this.l), 2);
         }
      }
   }

   public abf b() {
      return abf.a(this);
   }

   @Override
   public tm a(in.a $$0) {
      return this.d($$0);
   }

   public boolean a(cjt $$0) {
      if (!$$0.gw()) {
         return false;
      } else {
         if ($$0.cK().B) {
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
      this.a(ayf.b($$0) ? null : ajt.a($$0));
   }

   public void a(@Nullable ajt $$0) {
      this.e = $$0;
   }

   public void a(bqo $$0) {
      this.f = $$0.ad().getString();
   }

   public ib f() {
      return this.h;
   }

   public void a(ib $$0) {
      this.h = $$0;
   }

   public jg j() {
      return this.i;
   }

   public void a(jg $$0) {
      this.i = $$0;
   }

   public dgu k() {
      return this.j;
   }

   public void a(dgu $$0) {
      this.j = $$0;
   }

   public dik l() {
      return this.k;
   }

   public void a(dik $$0) {
      this.k = $$0;
   }

   public String t() {
      return this.g;
   }

   public void b(String $$0) {
      this.g = $$0;
   }

   public dqj u() {
      return this.l;
   }

   public void a(dqj $$0) {
      this.l = $$0;
      doz $$1 = this.o.a_(this.aA_());
      if ($$1.a(dca.pa)) {
         this.o.a(this.aA_(), $$1.a(djv.b, $$0), 2);
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
      if (this.l != dqj.a) {
         return false;
      } else {
         ib $$0 = this.aA_();
         int $$1 = 80;
         ib $$2 = new ib($$0.u() - 80, this.o.I_(), $$0.w() - 80);
         ib $$3 = new ib($$0.u() + 80, this.o.al() - 1, $$0.w() + 80);
         Stream<ib> $$4 = this.a($$2, $$3);
         return a($$0, $$4).filter($$1x -> {
            int $$2x = $$1x.k() - $$1x.h();
            int $$3x = $$1x.l() - $$1x.i();
            int $$4x = $$1x.m() - $$1x.j();
            if ($$2x > 1 && $$3x > 1 && $$4x > 1) {
               this.h = new ib($$1x.h() - $$0.u() + 1, $$1x.i() - $$0.v() + 1, $$1x.j() - $$0.w() + 1);
               this.i = new jg($$2x - 1, $$3x - 1, $$4x - 1);
               this.e();
               doz $$5 = this.o.a_($$0);
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
         .filter($$0x -> this.o.a_($$0x).a(dca.pa))
         .map(this.o::c_)
         .filter($$0x -> $$0x instanceof dnu)
         .map($$0x -> (dnu)$$0x)
         .filter($$0x -> $$0x.l == dqj.c && Objects.equals(this.e, $$0x.e))
         .map(dmf::aA_);
   }

   private static Optional<eez> a(ib $$0, Stream<ib> $$1) {
      Iterator<ib> $$2 = $$1.iterator();
      if (!$$2.hasNext()) {
         return Optional.empty();
      } else {
         ib $$3 = $$2.next();
         eez $$4 = new eez($$3);
         if ($$2.hasNext()) {
            $$2.forEachRemaining($$4::a);
         } else {
            $$4.a($$0);
         }

         return Optional.of($$4);
      }
   }

   public boolean z() {
      return this.l != dqj.a ? false : this.b(true);
   }

   public boolean b(boolean $$0) {
      if (this.e == null) {
         return false;
      } else {
         ib $$1 = this.aA_().a((jg)this.h);
         aps $$2 = (aps)this.o;
         eji $$3 = $$2.q();

         ejh $$4;
         try {
            $$4 = $$3.a(this.e);
         } catch (z var8) {
            return false;
         }

         $$4.a(this.o, $$1, this.i, !this.m, dca.kN);
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

   public static axr b(long $$0) {
      return $$0 == 0L ? axr.a(ac.b()) : axr.a($$0);
   }

   public boolean a(aps $$0) {
      if (this.l == dqj.b && this.e != null) {
         ejh $$1 = $$0.q().b(this.e).orElse(null);
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

   public boolean b(aps $$0) {
      ejh $$1 = this.d($$0);
      if ($$1 == null) {
         return false;
      } else {
         this.a($$1);
         return true;
      }
   }

   private void a(ejh $$0) {
      this.f = !ayf.b($$0.b()) ? $$0.b() : "";
      this.i = $$0.a();
      this.e();
   }

   public void c(aps $$0) {
      ejh $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$0, $$1);
      }
   }

   @Nullable
   private ejh d(aps $$0) {
      return this.e == null ? null : $$0.q().b(this.e).orElse(null);
   }

   private void a(aps $$0, ejh $$1) {
      this.a($$1);
      ejd $$2 = new ejd().a(this.j).a(this.k).a(this.m);
      if (this.t < 1.0F) {
         $$2.b().a(new eil(axk.a(this.t, 0.0F, 1.0F))).a(b(this.u));
      }

      ib $$3 = this.aA_().a((jg)this.h);
      $$1.a($$0, $$3, $$3, $$2, b(this.u), 2);
   }

   public void A() {
      if (this.e != null) {
         aps $$0 = (aps)this.o;
         eji $$1 = $$0.q();
         $$1.d(this.e);
      }
   }

   public boolean B() {
      if (this.l == dqj.b && !this.o.B && this.e != null) {
         aps $$0 = (aps)this.o;
         eji $$1 = $$0.q();

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
