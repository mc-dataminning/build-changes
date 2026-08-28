import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class drx extends dqh {
   private static final int d = 5;
   public static final int a = 48;
   public static final int b = 48;
   public static final String c = "author";
   @Nullable
   private akr e;
   private String f = "";
   private String g = "";
   private jd h = new jd(0, 1, 0);
   private kh i = kh.g;
   private dkv j = dkv.a;
   private dmm k = dmm.a;
   private dum l;
   private boolean m = true;
   private boolean q;
   private boolean r;
   private boolean s = true;
   private float t = 1.0F;
   private long u;

   public drx(jd $$0, dtc $$1) {
      super(dqj.u, $$0, $$1);
      this.l = $$1.c(dnx.b);
   }

   @Override
   protected void b(ub $$0, jo.a $$1) {
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
   protected void a(ub $$0, jo.a $$1) {
      super.a($$0, $$1);
      this.a($$0.l("name"));
      this.f = $$0.l("author");
      this.g = $$0.l("metadata");
      int $$2 = ayo.a($$0.h("posX"), -48, 48);
      int $$3 = ayo.a($$0.h("posY"), -48, 48);
      int $$4 = ayo.a($$0.h("posZ"), -48, 48);
      this.h = new jd($$2, $$3, $$4);
      int $$5 = ayo.a($$0.h("sizeX"), 0, 48);
      int $$6 = ayo.a($$0.h("sizeY"), 0, 48);
      int $$7 = ayo.a($$0.h("sizeZ"), 0, 48);
      this.i = new kh($$5, $$6, $$7);

      try {
         this.k = dmm.valueOf($$0.l("rotation"));
      } catch (IllegalArgumentException var12) {
         this.k = dmm.a;
      }

      try {
         this.j = dkv.valueOf($$0.l("mirror"));
      } catch (IllegalArgumentException var11) {
         this.j = dkv.a;
      }

      try {
         this.l = dum.valueOf($$0.l("mode"));
      } catch (IllegalArgumentException var10) {
         this.l = dum.d;
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
      this.G();
   }

   private void G() {
      if (this.n != null) {
         jd $$0 = this.aD_();
         dtc $$1 = this.n.a_($$0);
         if ($$1.a(dga.pa)) {
            this.n.a($$0, $$1.a(dnx.b, this.l), 2);
         }
      }
   }

   public acb b() {
      return acb.a(this);
   }

   @Override
   public ub a(jo.a $$0) {
      return this.e($$0);
   }

   public boolean a(cmx $$0) {
      if (!$$0.gw()) {
         return false;
      } else {
         if ($$0.cO().B) {
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
      this.a(azl.b($$0) ? null : akr.c($$0));
   }

   public void a(@Nullable akr $$0) {
      this.e = $$0;
   }

   public void a(btn $$0) {
      this.f = $$0.ah().getString();
   }

   public jd f() {
      return this.h;
   }

   public void a(jd $$0) {
      this.h = $$0;
   }

   public kh j() {
      return this.i;
   }

   public void a(kh $$0) {
      this.i = $$0;
   }

   public dkv k() {
      return this.j;
   }

   public void a(dkv $$0) {
      this.j = $$0;
   }

   public dmm l() {
      return this.k;
   }

   public void a(dmm $$0) {
      this.k = $$0;
   }

   public String u() {
      return this.g;
   }

   public void b(String $$0) {
      this.g = $$0;
   }

   public dum v() {
      return this.l;
   }

   public void a(dum $$0) {
      this.l = $$0;
      dtc $$1 = this.n.a_(this.aD_());
      if ($$1.a(dga.pa)) {
         this.n.a(this.aD_(), $$1.a(dnx.b, $$0), 2);
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
      if (this.l != dum.a) {
         return false;
      } else {
         jd $$0 = this.aD_();
         int $$1 = 80;
         jd $$2 = new jd($$0.u() - 80, this.n.I_(), $$0.w() - 80);
         jd $$3 = new jd($$0.u() + 80, this.n.am() - 1, $$0.w() + 80);
         Stream<jd> $$4 = this.a($$2, $$3);
         return a($$0, $$4).filter($$1x -> {
            int $$2x = $$1x.k() - $$1x.h();
            int $$3x = $$1x.l() - $$1x.i();
            int $$4x = $$1x.m() - $$1x.j();
            if ($$2x > 1 && $$3x > 1 && $$4x > 1) {
               this.h = new jd($$1x.h() - $$0.u() + 1, $$1x.i() - $$0.v() + 1, $$1x.j() - $$0.w() + 1);
               this.i = new kh($$2x - 1, $$3x - 1, $$4x - 1);
               this.e();
               dtc $$5 = this.n.a_($$0);
               this.n.a($$0, $$5, $$5, 3);
               return true;
            } else {
               return false;
            }
         }).isPresent();
      }
   }

   private Stream<jd> a(jd $$0, jd $$1) {
      return jd.d($$0, $$1)
         .filter($$0x -> this.n.a_($$0x).a(dga.pa))
         .map(this.n::c_)
         .filter($$0x -> $$0x instanceof drx)
         .map($$0x -> (drx)$$0x)
         .filter($$0x -> $$0x.l == dum.c && Objects.equals(this.e, $$0x.e))
         .map(dqh::aD_);
   }

   private static Optional<ejh> a(jd $$0, Stream<jd> $$1) {
      Iterator<jd> $$2 = $$1.iterator();
      if (!$$2.hasNext()) {
         return Optional.empty();
      } else {
         jd $$3 = $$2.next();
         ejh $$4 = new ejh($$3);
         if ($$2.hasNext()) {
            $$2.forEachRemaining($$4::a);
         } else {
            $$4.a($$0);
         }

         return Optional.of($$4);
      }
   }

   public boolean A() {
      return this.l != dum.a ? false : this.b(true);
   }

   public boolean b(boolean $$0) {
      if (this.e == null) {
         return false;
      } else {
         jd $$1 = this.aD_().a((kh)this.h);
         aqu $$2 = (aqu)this.n;
         ens $$3 = $$2.q();

         enr $$4;
         try {
            $$4 = $$3.a(this.e);
         } catch (aa var8) {
            return false;
         }

         $$4.a(this.n, $$1, this.i, !this.m, dga.kN);
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

   public static ayw b(long $$0) {
      return $$0 == 0L ? ayw.a(ad.c()) : ayw.a($$0);
   }

   public boolean a(aqu $$0) {
      if (this.l == dum.b && this.e != null) {
         enr $$1 = $$0.q().b(this.e).orElse(null);
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

   public boolean b(aqu $$0) {
      enr $$1 = this.d($$0);
      if ($$1 == null) {
         return false;
      } else {
         this.a($$1);
         return true;
      }
   }

   private void a(enr $$0) {
      this.f = !azl.b($$0.b()) ? $$0.b() : "";
      this.i = $$0.a();
      this.e();
   }

   public void c(aqu $$0) {
      enr $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$0, $$1);
      }
   }

   @Nullable
   private enr d(aqu $$0) {
      return this.e == null ? null : $$0.q().b(this.e).orElse(null);
   }

   private void a(aqu $$0, enr $$1) {
      this.a($$1);
      enn $$2 = new enn().a(this.j).a(this.k).a(this.m);
      if (this.t < 1.0F) {
         $$2.b().a(new emu(ayo.a(this.t, 0.0F, 1.0F))).a(b(this.u));
      }

      jd $$3 = this.aD_().a((kh)this.h);
      $$1.a($$0, $$3, $$3, $$2, b(this.u), 2);
   }

   public void B() {
      if (this.e != null) {
         aqu $$0 = (aqu)this.n;
         ens $$1 = $$0.q();
         $$1.d(this.e);
      }
   }

   public boolean C() {
      if (this.l == dum.b && !this.n.B && this.e != null) {
         aqu $$0 = (aqu)this.n;
         ens $$1 = $$0.q();

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
      return this.q;
   }

   public void c(boolean $$0) {
      this.q = $$0;
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
