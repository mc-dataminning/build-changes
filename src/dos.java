import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dos extends dnd {
   private static final int d = 5;
   public static final int a = 48;
   public static final int b = 48;
   public static final String c = "author";
   @Nullable
   private akf e;
   private String f = "";
   private String g = "";
   private im h = new im(0, 1, 0);
   private jq i = jq.g;
   private dhs j = dhs.a;
   private dji k = dji.a;
   private dri l;
   private boolean m = true;
   private boolean n;
   private boolean r;
   private boolean s = true;
   private float t = 1.0F;
   private long u;

   public dos(im $$0, dpy $$1) {
      super(dnf.u, $$0, $$1);
      this.l = $$1.c(dkt.b);
   }

   @Override
   protected void b(ty $$0, ix.a $$1) {
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
   public void a(ty $$0, ix.a $$1) {
      super.a($$0, $$1);
      this.a($$0.l("name"));
      this.f = $$0.l("author");
      this.g = $$0.l("metadata");
      int $$2 = axw.a($$0.h("posX"), -48, 48);
      int $$3 = axw.a($$0.h("posY"), -48, 48);
      int $$4 = axw.a($$0.h("posZ"), -48, 48);
      this.h = new im($$2, $$3, $$4);
      int $$5 = axw.a($$0.h("sizeX"), 0, 48);
      int $$6 = axw.a($$0.h("sizeY"), 0, 48);
      int $$7 = axw.a($$0.h("sizeZ"), 0, 48);
      this.i = new jq($$5, $$6, $$7);

      try {
         this.k = dji.valueOf($$0.l("rotation"));
      } catch (IllegalArgumentException var12) {
         this.k = dji.a;
      }

      try {
         this.j = dhs.valueOf($$0.l("mirror"));
      } catch (IllegalArgumentException var11) {
         this.j = dhs.a;
      }

      try {
         this.l = dri.valueOf($$0.l("mode"));
      } catch (IllegalArgumentException var10) {
         this.l = dri.d;
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
         im $$0 = this.az_();
         dpy $$1 = this.o.a_($$0);
         if ($$1.a(dcx.pa)) {
            this.o.a($$0, $$1.a(dkt.b, this.l), 2);
         }
      }
   }

   public abr b() {
      return abr.a(this);
   }

   @Override
   public ty a(ix.a $$0) {
      return this.d($$0);
   }

   public boolean a(ckl $$0) {
      if (!$$0.gx()) {
         return false;
      } else {
         if ($$0.cL().B) {
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
      this.a(ayr.b($$0) ? null : akf.a($$0));
   }

   public void a(@Nullable akf $$0) {
      this.e = $$0;
   }

   public void a(bre $$0) {
      this.f = $$0.ad().getString();
   }

   public im f() {
      return this.h;
   }

   public void a(im $$0) {
      this.h = $$0;
   }

   public jq j() {
      return this.i;
   }

   public void a(jq $$0) {
      this.i = $$0;
   }

   public dhs k() {
      return this.j;
   }

   public void a(dhs $$0) {
      this.j = $$0;
   }

   public dji l() {
      return this.k;
   }

   public void a(dji $$0) {
      this.k = $$0;
   }

   public String t() {
      return this.g;
   }

   public void b(String $$0) {
      this.g = $$0;
   }

   public dri u() {
      return this.l;
   }

   public void a(dri $$0) {
      this.l = $$0;
      dpy $$1 = this.o.a_(this.az_());
      if ($$1.a(dcx.pa)) {
         this.o.a(this.az_(), $$1.a(dkt.b, $$0), 2);
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
      if (this.l != dri.a) {
         return false;
      } else {
         im $$0 = this.az_();
         int $$1 = 80;
         im $$2 = new im($$0.u() - 80, this.o.I_(), $$0.w() - 80);
         im $$3 = new im($$0.u() + 80, this.o.al() - 1, $$0.w() + 80);
         Stream<im> $$4 = this.a($$2, $$3);
         return a($$0, $$4).filter($$1x -> {
            int $$2x = $$1x.k() - $$1x.h();
            int $$3x = $$1x.l() - $$1x.i();
            int $$4x = $$1x.m() - $$1x.j();
            if ($$2x > 1 && $$3x > 1 && $$4x > 1) {
               this.h = new im($$1x.h() - $$0.u() + 1, $$1x.i() - $$0.v() + 1, $$1x.j() - $$0.w() + 1);
               this.i = new jq($$2x - 1, $$3x - 1, $$4x - 1);
               this.e();
               dpy $$5 = this.o.a_($$0);
               this.o.a($$0, $$5, $$5, 3);
               return true;
            } else {
               return false;
            }
         }).isPresent();
      }
   }

   private Stream<im> a(im $$0, im $$1) {
      return im.d($$0, $$1)
         .filter($$0x -> this.o.a_($$0x).a(dcx.pa))
         .map(this.o::c_)
         .filter($$0x -> $$0x instanceof dos)
         .map($$0x -> (dos)$$0x)
         .filter($$0x -> $$0x.l == dri.c && Objects.equals(this.e, $$0x.e))
         .map(dnd::az_);
   }

   private static Optional<efy> a(im $$0, Stream<im> $$1) {
      Iterator<im> $$2 = $$1.iterator();
      if (!$$2.hasNext()) {
         return Optional.empty();
      } else {
         im $$3 = $$2.next();
         efy $$4 = new efy($$3);
         if ($$2.hasNext()) {
            $$2.forEachRemaining($$4::a);
         } else {
            $$4.a($$0);
         }

         return Optional.of($$4);
      }
   }

   public boolean z() {
      return this.l != dri.a ? false : this.b(true);
   }

   public boolean b(boolean $$0) {
      if (this.e == null) {
         return false;
      } else {
         im $$1 = this.az_().a((jq)this.h);
         aqe $$2 = (aqe)this.o;
         ekh $$3 = $$2.q();

         ekg $$4;
         try {
            $$4 = $$3.a(this.e);
         } catch (z var8) {
            return false;
         }

         $$4.a(this.o, $$1, this.i, !this.m, dcx.kN);
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

   public static ayd b(long $$0) {
      return $$0 == 0L ? ayd.a(ac.b()) : ayd.a($$0);
   }

   public boolean a(aqe $$0) {
      if (this.l == dri.b && this.e != null) {
         ekg $$1 = $$0.q().b(this.e).orElse(null);
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

   public boolean b(aqe $$0) {
      ekg $$1 = this.d($$0);
      if ($$1 == null) {
         return false;
      } else {
         this.a($$1);
         return true;
      }
   }

   private void a(ekg $$0) {
      this.f = !ayr.b($$0.b()) ? $$0.b() : "";
      this.i = $$0.a();
      this.e();
   }

   public void c(aqe $$0) {
      ekg $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$0, $$1);
      }
   }

   @Nullable
   private ekg d(aqe $$0) {
      return this.e == null ? null : $$0.q().b(this.e).orElse(null);
   }

   private void a(aqe $$0, ekg $$1) {
      this.a($$1);
      ekc $$2 = new ekc().a(this.j).a(this.k).a(this.m);
      if (this.t < 1.0F) {
         $$2.b().a(new ejk(axw.a(this.t, 0.0F, 1.0F))).a(b(this.u));
      }

      im $$3 = this.az_().a((jq)this.h);
      $$1.a($$0, $$3, $$3, $$2, b(this.u), 2);
   }

   public void A() {
      if (this.e != null) {
         aqe $$0 = (aqe)this.o;
         ekh $$1 = $$0.q();
         $$1.d(this.e);
      }
   }

   public boolean B() {
      if (this.l == dri.b && !this.o.B && this.e != null) {
         aqe $$0 = (aqe)this.o;
         ekh $$1 = $$0.q();

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
