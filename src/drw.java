import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class drw extends dqc {
   private static final int d = 5;
   public static final int a = 48;
   public static final int b = 48;
   public static final String c = "author";
   @Nullable
   private akt e;
   private String f = "";
   private String g = "";
   private ir h = new ir(0, 1, 0);
   private jv i = jv.g;
   private dke j = dke.a;
   private dmd k = dmd.a;
   private dum l;
   private boolean m = true;
   private boolean q;
   private boolean r;
   private boolean s = true;
   private float t = 1.0F;
   private long u;

   public drw(ir $$0, dtc $$1) {
      super(dqe.v, $$0, $$1);
      this.l = $$1.c(dnp.b);
   }

   @Override
   protected void b(uk $$0, jc.a $$1) {
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
   public void a(uk $$0, jc.a $$1) {
      super.a($$0, $$1);
      this.a($$0.l("name"));
      this.f = $$0.l("author");
      this.g = $$0.l("metadata");
      int $$2 = aym.a($$0.h("posX"), -48, 48);
      int $$3 = aym.a($$0.h("posY"), -48, 48);
      int $$4 = aym.a($$0.h("posZ"), -48, 48);
      this.h = new ir($$2, $$3, $$4);
      int $$5 = aym.a($$0.h("sizeX"), 0, 48);
      int $$6 = aym.a($$0.h("sizeY"), 0, 48);
      int $$7 = aym.a($$0.h("sizeZ"), 0, 48);
      this.i = new jv($$5, $$6, $$7);

      try {
         this.k = dmd.valueOf($$0.l("rotation"));
      } catch (IllegalArgumentException var12) {
         this.k = dmd.a;
      }

      try {
         this.j = dke.valueOf($$0.l("mirror"));
      } catch (IllegalArgumentException var11) {
         this.j = dke.a;
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
      this.F();
   }

   private void F() {
      if (this.n != null) {
         ir $$0 = this.az_();
         dtc $$1 = this.n.a_($$0);
         if ($$1.a(dfe.ql)) {
            this.n.a($$0, $$1.a(dnp.b, this.l), 2);
         }
      }
   }

   public ace b() {
      return ace.a(this);
   }

   @Override
   public uk a(jc.a $$0) {
      return this.d($$0);
   }

   public boolean a(cly $$0) {
      if (!$$0.gK()) {
         return false;
      } else {
         if ($$0.cS().C) {
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
      this.a(azh.b($$0) ? null : akt.a($$0));
   }

   public void a(@Nullable akt $$0) {
      this.e = $$0;
   }

   public void a(bso $$0) {
      this.f = $$0.af().getString();
   }

   public ir f() {
      return this.h;
   }

   public void a(ir $$0) {
      this.h = $$0;
   }

   public jv j() {
      return this.i;
   }

   public void a(jv $$0) {
      this.i = $$0;
   }

   public dke k() {
      return this.j;
   }

   public void a(dke $$0) {
      this.j = $$0;
   }

   public dmd l() {
      return this.k;
   }

   public void a(dmd $$0) {
      this.k = $$0;
   }

   public String t() {
      return this.g;
   }

   public void b(String $$0) {
      this.g = $$0;
   }

   public dum u() {
      return this.l;
   }

   public void a(dum $$0) {
      this.l = $$0;
      dtc $$1 = this.n.a_(this.az_());
      if ($$1.a(dfe.ql)) {
         this.n.a(this.az_(), $$1.a(dnp.b, $$0), 2);
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
      if (this.l != dum.a) {
         return false;
      } else {
         ir $$0 = this.az_();
         int $$1 = 80;
         ir $$2 = new ir($$0.u() - 80, this.n.J_(), $$0.w() - 80);
         ir $$3 = new ir($$0.u() + 80, this.n.am() - 1, $$0.w() + 80);
         Stream<ir> $$4 = this.a($$2, $$3);
         return a($$0, $$4).filter($$1x -> {
            int $$2x = $$1x.k() - $$1x.h();
            int $$3x = $$1x.l() - $$1x.i();
            int $$4x = $$1x.m() - $$1x.j();
            if ($$2x > 1 && $$3x > 1 && $$4x > 1) {
               this.h = new ir($$1x.h() - $$0.u() + 1, $$1x.i() - $$0.v() + 1, $$1x.j() - $$0.w() + 1);
               this.i = new jv($$2x - 1, $$3x - 1, $$4x - 1);
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

   private Stream<ir> a(ir $$0, ir $$1) {
      return ir.d($$0, $$1)
         .filter($$0x -> this.n.a_($$0x).a(dfe.ql))
         .map(this.n::c_)
         .filter($$0x -> $$0x instanceof drw)
         .map($$0x -> (drw)$$0x)
         .filter($$0x -> $$0x.l == dum.c && Objects.equals(this.e, $$0x.e))
         .map(dqc::az_);
   }

   private static Optional<ejl> a(ir $$0, Stream<ir> $$1) {
      Iterator<ir> $$2 = $$1.iterator();
      if (!$$2.hasNext()) {
         return Optional.empty();
      } else {
         ir $$3 = $$2.next();
         ejl $$4 = new ejl($$3);
         if ($$2.hasNext()) {
            $$2.forEachRemaining($$4::a);
         } else {
            $$4.a($$0);
         }

         return Optional.of($$4);
      }
   }

   public boolean z() {
      return this.l != dum.a ? false : this.b(true);
   }

   public boolean b(boolean $$0) {
      if (this.e == null) {
         return false;
      } else {
         ir $$1 = this.az_().a((jv)this.h);
         aqt $$2 = (aqt)this.n;
         enu $$3 = $$2.q();

         ent $$4;
         try {
            $$4 = $$3.a(this.e);
         } catch (aa var8) {
            return false;
         }

         $$4.a(this.n, $$1, this.i, !this.m, dfe.lL);
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

   public static ayt b(long $$0) {
      return $$0 == 0L ? ayt.a(ad.b()) : ayt.a($$0);
   }

   public boolean a(aqt $$0) {
      if (this.l == dum.b && this.e != null) {
         ent $$1 = $$0.q().b(this.e).orElse(null);
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

   public boolean b(aqt $$0) {
      ent $$1 = this.d($$0);
      if ($$1 == null) {
         return false;
      } else {
         this.a($$1);
         return true;
      }
   }

   private void a(ent $$0) {
      this.f = !azh.b($$0.b()) ? $$0.b() : "";
      this.i = $$0.a();
      this.e();
   }

   public void c(aqt $$0) {
      ent $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$0, $$1);
      }
   }

   @Nullable
   private ent d(aqt $$0) {
      return this.e == null ? null : $$0.q().b(this.e).orElse(null);
   }

   private void a(aqt $$0, ent $$1) {
      this.a($$1);
      enp $$2 = new enp().a(this.j).a(this.k).a(this.m);
      if (this.t < 1.0F) {
         $$2.b().a(new emx(aym.a(this.t, 0.0F, 1.0F))).a(b(this.u));
      }

      ir $$3 = this.az_().a((jv)this.h);
      $$1.a($$0, $$3, $$3, $$2, b(this.u), 2);
   }

   public void A() {
      if (this.e != null) {
         aqt $$0 = (aqt)this.n;
         enu $$1 = $$0.q();
         $$1.d(this.e);
      }
   }

   public boolean B() {
      if (this.l == dum.b && !this.n.C && this.e != null) {
         aqt $$0 = (aqt)this.n;
         enu $$1 = $$0.q();

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
      return this.q;
   }

   public void c(boolean $$0) {
      this.q = $$0;
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
