import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dij extends dgv {
   private static final int d = 5;
   public static final int a = 48;
   public static final int b = 48;
   public static final String c = "author";
   @Nullable
   private ahg e;
   private String f = "";
   private String g = "";
   private hx h = new hx(0, 1, 0);
   private jb i = jb.g;
   private dbm j = dbm.a;
   private ddc k = ddc.a;
   private dkr l;
   private boolean m = true;
   private boolean n;
   private boolean r;
   private boolean s = true;
   private float t = 1.0F;
   private long u;

   public dij(hx $$0, djh $$1) {
      super(dgx.u, $$0, $$1);
      this.l = $$1.c(den.b);
   }

   @Override
   protected void b(sn $$0) {
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
   public void a(sn $$0) {
      super.a($$0);
      this.a($$0.l("name"));
      this.f = $$0.l("author");
      this.g = $$0.l("metadata");
      int $$1 = auo.a($$0.h("posX"), -48, 48);
      int $$2 = auo.a($$0.h("posY"), -48, 48);
      int $$3 = auo.a($$0.h("posZ"), -48, 48);
      this.h = new hx($$1, $$2, $$3);
      int $$4 = auo.a($$0.h("sizeX"), 0, 48);
      int $$5 = auo.a($$0.h("sizeY"), 0, 48);
      int $$6 = auo.a($$0.h("sizeZ"), 0, 48);
      this.i = new jb($$4, $$5, $$6);

      try {
         this.k = ddc.valueOf($$0.l("rotation"));
      } catch (IllegalArgumentException var11) {
         this.k = ddc.a;
      }

      try {
         this.j = dbm.valueOf($$0.l("mirror"));
      } catch (IllegalArgumentException var10) {
         this.j = dbm.a;
      }

      try {
         this.l = dkr.valueOf($$0.l("mode"));
      } catch (IllegalArgumentException var9) {
         this.l = dkr.d;
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
         hx $$0 = this.aB_();
         djh $$1 = this.o.a_($$0);
         if ($$1.a(cws.pa)) {
            this.o.a($$0, $$1.a(den.b, this.l), 2);
         }
      }
   }

   public zh c() {
      return zh.a(this);
   }

   @Override
   public sn ax_() {
      return this.q();
   }

   public boolean a(cfi $$0) {
      if (!$$0.gp()) {
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
      this.a(avl.b($$0) ? null : ahg.a($$0));
   }

   public void a(@Nullable ahg $$0) {
      this.e = $$0;
   }

   public void a(bml $$0) {
      this.f = $$0.ad().getString();
   }

   public hx g() {
      return this.h;
   }

   public void a(hx $$0) {
      this.h = $$0;
   }

   public jb k() {
      return this.i;
   }

   public void a(jb $$0) {
      this.i = $$0;
   }

   public dbm l() {
      return this.j;
   }

   public void a(dbm $$0) {
      this.j = $$0;
   }

   public ddc m() {
      return this.k;
   }

   public void a(ddc $$0) {
      this.k = $$0;
   }

   public String w() {
      return this.g;
   }

   public void b(String $$0) {
      this.g = $$0;
   }

   public dkr x() {
      return this.l;
   }

   public void a(dkr $$0) {
      this.l = $$0;
      djh $$1 = this.o.a_(this.aB_());
      if ($$1.a(cws.pa)) {
         this.o.a(this.aB_(), $$1.a(den.b, $$0), 2);
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
      if (this.l != dkr.a) {
         return false;
      } else {
         hx $$0 = this.aB_();
         int $$1 = 80;
         hx $$2 = new hx($$0.u() - 80, this.o.J_(), $$0.w() - 80);
         hx $$3 = new hx($$0.u() + 80, this.o.al() - 1, $$0.w() + 80);
         Stream<hx> $$4 = this.a($$2, $$3);
         return a($$0, $$4).filter($$1x -> {
            int $$2x = $$1x.k() - $$1x.h();
            int $$3x = $$1x.l() - $$1x.i();
            int $$4x = $$1x.m() - $$1x.j();
            if ($$2x > 1 && $$3x > 1 && $$4x > 1) {
               this.h = new hx($$1x.h() - $$0.u() + 1, $$1x.i() - $$0.v() + 1, $$1x.j() - $$0.w() + 1);
               this.i = new jb($$2x - 1, $$3x - 1, $$4x - 1);
               this.e();
               djh $$5 = this.o.a_($$0);
               this.o.a($$0, $$5, $$5, 3);
               return true;
            } else {
               return false;
            }
         }).isPresent();
      }
   }

   private Stream<hx> a(hx $$0, hx $$1) {
      return hx.b($$0, $$1)
         .filter($$0x -> this.o.a_($$0x).a(cws.pa))
         .map(this.o::c_)
         .filter($$0x -> $$0x instanceof dij)
         .map($$0x -> (dij)$$0x)
         .filter($$0x -> $$0x.l == dkr.c && Objects.equals(this.e, $$0x.e))
         .map(dgv::aB_);
   }

   private static Optional<dyy> a(hx $$0, Stream<hx> $$1) {
      Iterator<hx> $$2 = $$1.iterator();
      if (!$$2.hasNext()) {
         return Optional.empty();
      } else {
         hx $$3 = $$2.next();
         dyy $$4 = new dyy($$3);
         if ($$2.hasNext()) {
            $$2.forEachRemaining($$4::a);
         } else {
            $$4.a($$0);
         }

         return Optional.of($$4);
      }
   }

   public boolean C() {
      return this.l != dkr.a ? false : this.b(true);
   }

   public boolean b(boolean $$0) {
      if (this.e == null) {
         return false;
      } else {
         hx $$1 = this.aB_().a((jb)this.h);
         and $$2 = (and)this.o;
         edh $$3 = $$2.q();

         edg $$4;
         try {
            $$4 = $$3.a(this.e);
         } catch (z var8) {
            return false;
         }

         $$4.a(this.o, $$1, this.i, !this.m, cws.kN);
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

   public static auv b(long $$0) {
      return $$0 == 0L ? auv.a(ac.b()) : auv.a($$0);
   }

   public boolean a(and $$0) {
      if (this.l == dkr.b && this.e != null) {
         edg $$1 = $$0.q().b(this.e).orElse(null);
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

   public boolean b(and $$0) {
      edg $$1 = this.d($$0);
      if ($$1 == null) {
         return false;
      } else {
         this.a($$1);
         return true;
      }
   }

   private void a(edg $$0) {
      this.f = !avl.b($$0.b()) ? $$0.b() : "";
      this.i = $$0.a();
      this.e();
   }

   public void c(and $$0) {
      edg $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$0, $$1);
      }
   }

   @Nullable
   private edg d(and $$0) {
      return this.e == null ? null : $$0.q().b(this.e).orElse(null);
   }

   private void a(and $$0, edg $$1) {
      this.a($$1);
      edc $$2 = new edc().a(this.j).a(this.k).a(this.m);
      if (this.t < 1.0F) {
         $$2.b().a(new eck(auo.a(this.t, 0.0F, 1.0F))).a(b(this.u));
      }

      hx $$3 = this.aB_().a((jb)this.h);
      $$1.a($$0, $$3, $$3, $$2, b(this.u), 2);
   }

   public void D() {
      if (this.e != null) {
         and $$0 = (and)this.o;
         edh $$1 = $$0.q();
         $$1.d(this.e);
      }
   }

   public boolean E() {
      if (this.l == dkr.b && !this.o.B && this.e != null) {
         and $$0 = (and)this.o;
         edh $$1 = $$0.q();

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
