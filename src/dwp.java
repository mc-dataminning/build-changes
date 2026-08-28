import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dwp extends dux {
   private static final int d = 5;
   public static final int a = 48;
   public static final int b = 48;
   public static final String c = "author";
   @Nullable
   private alz e;
   private String f = "";
   private String g = "";
   private jh h = new jh(0, 1, 0);
   private kl i = kl.h;
   private dpl j = dpl.a;
   private drc k = drc.a;
   private dze l;
   private boolean m = true;
   private boolean n;
   private boolean r;
   private boolean s = true;
   private float t = 1.0F;
   private long u;

   public dwp(jh $$0, dxv $$1) {
      super(duz.v, $$0, $$1);
      this.l = $$1.c(dsn.b);
   }

   @Override
   protected void b(ux $$0, js.a $$1) {
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
   protected void a(ux $$0, js.a $$1) {
      super.a($$0, $$1);
      this.a($$0.l("name"));
      this.f = $$0.l("author");
      this.g = $$0.l("metadata");
      int $$2 = bae.a($$0.h("posX"), -48, 48);
      int $$3 = bae.a($$0.h("posY"), -48, 48);
      int $$4 = bae.a($$0.h("posZ"), -48, 48);
      this.h = new jh($$2, $$3, $$4);
      int $$5 = bae.a($$0.h("sizeX"), 0, 48);
      int $$6 = bae.a($$0.h("sizeY"), 0, 48);
      int $$7 = bae.a($$0.h("sizeZ"), 0, 48);
      this.i = new kl($$5, $$6, $$7);

      try {
         this.k = drc.valueOf($$0.l("rotation"));
      } catch (IllegalArgumentException var12) {
         this.k = drc.a;
      }

      try {
         this.j = dpl.valueOf($$0.l("mirror"));
      } catch (IllegalArgumentException var11) {
         this.j = dpl.a;
      }

      try {
         this.l = dze.valueOf($$0.l("mode"));
      } catch (IllegalArgumentException var10) {
         this.l = dze.d;
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
         jh $$0 = this.aB_();
         dxv $$1 = this.o.a_($$0);
         if ($$1.a(dko.pv)) {
            this.o.a($$0, $$1.b(dsn.b, this.l), 2);
         }
      }
   }

   public acy b() {
      return acy.a(this);
   }

   @Override
   public ux a(js.a $$0) {
      return this.e($$0);
   }

   public boolean a(cpx $$0) {
      if (!$$0.gG()) {
         return false;
      } else {
         if ($$0.cU().C) {
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
      this.a(bbb.b($$0) ? null : alz.c($$0));
   }

   public void a(@Nullable alz $$0) {
      this.e = $$0;
   }

   public void a(bwg $$0) {
      this.f = $$0.al().getString();
   }

   public jh f() {
      return this.h;
   }

   public void a(jh $$0) {
      this.h = $$0;
   }

   public kl j() {
      return this.i;
   }

   public void a(kl $$0) {
      this.i = $$0;
   }

   public dpl k() {
      return this.j;
   }

   public void a(dpl $$0) {
      this.j = $$0;
   }

   public drc t() {
      return this.k;
   }

   public void a(drc $$0) {
      this.k = $$0;
   }

   public String u() {
      return this.g;
   }

   public void b(String $$0) {
      this.g = $$0;
   }

   public dze v() {
      return this.l;
   }

   public void a(dze $$0) {
      this.l = $$0;
      dxv $$1 = this.o.a_(this.aB_());
      if ($$1.a(dko.pv)) {
         this.o.a(this.aB_(), $$1.b(dsn.b, $$0), 2);
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
      if (this.l != dze.a) {
         return false;
      } else {
         jh $$0 = this.aB_();
         int $$1 = 80;
         jh $$2 = new jh($$0.u() - 80, this.o.L_(), $$0.w() - 80);
         jh $$3 = new jh($$0.u() + 80, this.o.am(), $$0.w() + 80);
         Stream<jh> $$4 = this.a($$2, $$3);
         return a($$0, $$4).filter($$1x -> {
            int $$2x = $$1x.k() - $$1x.h();
            int $$3x = $$1x.l() - $$1x.i();
            int $$4x = $$1x.m() - $$1x.j();
            if ($$2x > 1 && $$3x > 1 && $$4x > 1) {
               this.h = new jh($$1x.h() - $$0.u() + 1, $$1x.i() - $$0.v() + 1, $$1x.j() - $$0.w() + 1);
               this.i = new kl($$2x - 1, $$3x - 1, $$4x - 1);
               this.e();
               dxv $$5 = this.o.a_($$0);
               this.o.a($$0, $$5, $$5, 3);
               return true;
            } else {
               return false;
            }
         }).isPresent();
      }
   }

   private Stream<jh> a(jh $$0, jh $$1) {
      return jh.d($$0, $$1)
         .filter($$0x -> this.o.a_($$0x).a(dko.pv))
         .map(this.o::c_)
         .filter($$0x -> $$0x instanceof dwp)
         .map($$0x -> (dwp)$$0x)
         .filter($$0x -> $$0x.l == dze.c && Objects.equals(this.e, $$0x.e))
         .map(dux::aB_);
   }

   private static Optional<eoc> a(jh $$0, Stream<jh> $$1) {
      Iterator<jh> $$2 = $$1.iterator();
      if (!$$2.hasNext()) {
         return Optional.empty();
      } else {
         jh $$3 = $$2.next();
         eoc $$4 = new eoc($$3);
         if ($$2.hasNext()) {
            $$2.forEachRemaining($$4::a);
         } else {
            $$4.a($$0);
         }

         return Optional.of($$4);
      }
   }

   public boolean A() {
      return this.l != dze.a ? false : this.b(true);
   }

   public boolean b(boolean $$0) {
      if (this.e == null) {
         return false;
      } else {
         jh $$1 = this.aB_().a((kl)this.h);
         ash $$2 = (ash)this.o;
         esn $$3 = $$2.r();

         esm $$4;
         try {
            $$4 = $$3.a(this.e);
         } catch (aa var8) {
            return false;
         }

         $$4.a(this.o, $$1, this.i, !this.m, dko.li);
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

   public static bam b(long $$0) {
      return $$0 == 0L ? bam.a(ae.c()) : bam.a($$0);
   }

   public boolean a(ash $$0) {
      if (this.l == dze.b && this.e != null) {
         esm $$1 = $$0.r().b(this.e).orElse(null);
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

   public boolean b(ash $$0) {
      esm $$1 = this.d($$0);
      if ($$1 == null) {
         return false;
      } else {
         this.a($$1);
         return true;
      }
   }

   private void a(esm $$0) {
      this.f = !bbb.b($$0.b()) ? $$0.b() : "";
      this.i = $$0.a();
      this.e();
   }

   public void c(ash $$0) {
      esm $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$0, $$1);
      }
   }

   @Nullable
   private esm d(ash $$0) {
      return this.e == null ? null : $$0.r().b(this.e).orElse(null);
   }

   private void a(ash $$0, esm $$1) {
      this.a($$1);
      esi $$2 = new esi().a(this.j).a(this.k).a(this.m);
      if (this.t < 1.0F) {
         $$2.b().a(new erp(bae.a(this.t, 0.0F, 1.0F))).a(b(this.u));
      }

      jh $$3 = this.aB_().a((kl)this.h);
      $$1.a($$0, $$3, $$3, $$2, b(this.u), 2);
   }

   public void B() {
      if (this.e != null) {
         ash $$0 = (ash)this.o;
         esn $$1 = $$0.r();
         $$1.d(this.e);
      }
   }

   public boolean C() {
      if (this.l == dze.b && !this.o.C && this.e != null) {
         ash $$0 = (ash)this.o;
         esn $$1 = $$0.r();

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
