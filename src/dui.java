import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dui extends dsr {
   private static final int d = 5;
   public static final int a = 48;
   public static final int b = 48;
   public static final String c = "author";
   @Nullable
   private all e;
   private String f = "";
   private String g = "";
   private jh h = new jh(0, 1, 0);
   private kl i = kl.g;
   private dnf j = dnf.a;
   private dow k = dow.a;
   private dwx l;
   private boolean m = true;
   private boolean n;
   private boolean r;
   private boolean s = true;
   private float t = 1.0F;
   private long u;

   public dui(jh $$0, dvo $$1) {
      super(dst.u, $$0, $$1);
      this.l = $$1.c(dqh.b);
   }

   @Override
   protected void b(un $$0, js.a $$1) {
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
   protected void a(un $$0, js.a $$1) {
      super.a($$0, $$1);
      this.a($$0.l("name"));
      this.f = $$0.l("author");
      this.g = $$0.l("metadata");
      int $$2 = azn.a($$0.h("posX"), -48, 48);
      int $$3 = azn.a($$0.h("posY"), -48, 48);
      int $$4 = azn.a($$0.h("posZ"), -48, 48);
      this.h = new jh($$2, $$3, $$4);
      int $$5 = azn.a($$0.h("sizeX"), 0, 48);
      int $$6 = azn.a($$0.h("sizeY"), 0, 48);
      int $$7 = azn.a($$0.h("sizeZ"), 0, 48);
      this.i = new kl($$5, $$6, $$7);

      try {
         this.k = dow.valueOf($$0.l("rotation"));
      } catch (IllegalArgumentException var12) {
         this.k = dow.a;
      }

      try {
         this.j = dnf.valueOf($$0.l("mirror"));
      } catch (IllegalArgumentException var11) {
         this.j = dnf.a;
      }

      try {
         this.l = dwx.valueOf($$0.l("mode"));
      } catch (IllegalArgumentException var10) {
         this.l = dwx.d;
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
         dvo $$1 = this.o.a_($$0);
         if ($$1.a(dil.pa)) {
            this.o.a($$0, $$1.b(dqh.b, this.l), 2);
         }
      }
   }

   public aco b() {
      return aco.a(this);
   }

   @Override
   public un a(js.a $$0) {
      return this.e($$0);
   }

   public boolean a(cor $$0) {
      if (!$$0.gJ()) {
         return false;
      } else {
         if ($$0.cW().C) {
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
      this.a(bak.b($$0) ? null : all.c($$0));
   }

   public void a(@Nullable all $$0) {
      this.e = $$0;
   }

   public void a(bve $$0) {
      this.f = $$0.am().getString();
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

   public dnf k() {
      return this.j;
   }

   public void a(dnf $$0) {
      this.j = $$0;
   }

   public dow t() {
      return this.k;
   }

   public void a(dow $$0) {
      this.k = $$0;
   }

   public String u() {
      return this.g;
   }

   public void b(String $$0) {
      this.g = $$0;
   }

   public dwx v() {
      return this.l;
   }

   public void a(dwx $$0) {
      this.l = $$0;
      dvo $$1 = this.o.a_(this.aB_());
      if ($$1.a(dil.pa)) {
         this.o.a(this.aB_(), $$1.b(dqh.b, $$0), 2);
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
      if (this.l != dwx.a) {
         return false;
      } else {
         jh $$0 = this.aB_();
         int $$1 = 80;
         jh $$2 = new jh($$0.u() - 80, this.o.I_(), $$0.w() - 80);
         jh $$3 = new jh($$0.u() + 80, this.o.al(), $$0.w() + 80);
         Stream<jh> $$4 = this.a($$2, $$3);
         return a($$0, $$4).filter($$1x -> {
            int $$2x = $$1x.k() - $$1x.h();
            int $$3x = $$1x.l() - $$1x.i();
            int $$4x = $$1x.m() - $$1x.j();
            if ($$2x > 1 && $$3x > 1 && $$4x > 1) {
               this.h = new jh($$1x.h() - $$0.u() + 1, $$1x.i() - $$0.v() + 1, $$1x.j() - $$0.w() + 1);
               this.i = new kl($$2x - 1, $$3x - 1, $$4x - 1);
               this.e();
               dvo $$5 = this.o.a_($$0);
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
         .filter($$0x -> this.o.a_($$0x).a(dil.pa))
         .map(this.o::c_)
         .filter($$0x -> $$0x instanceof dui)
         .map($$0x -> (dui)$$0x)
         .filter($$0x -> $$0x.l == dwx.c && Objects.equals(this.e, $$0x.e))
         .map(dsr::aB_);
   }

   private static Optional<elt> a(jh $$0, Stream<jh> $$1) {
      Iterator<jh> $$2 = $$1.iterator();
      if (!$$2.hasNext()) {
         return Optional.empty();
      } else {
         jh $$3 = $$2.next();
         elt $$4 = new elt($$3);
         if ($$2.hasNext()) {
            $$2.forEachRemaining($$4::a);
         } else {
            $$4.a($$0);
         }

         return Optional.of($$4);
      }
   }

   public boolean A() {
      return this.l != dwx.a ? false : this.b(true);
   }

   public boolean b(boolean $$0) {
      if (this.e == null) {
         return false;
      } else {
         jh $$1 = this.aB_().a((kl)this.h);
         arq $$2 = (arq)this.o;
         eqe $$3 = $$2.q();

         eqd $$4;
         try {
            $$4 = $$3.a(this.e);
         } catch (aa var8) {
            return false;
         }

         $$4.a(this.o, $$1, this.i, !this.m, dil.kN);
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

   public static azv b(long $$0) {
      return $$0 == 0L ? azv.a(ae.c()) : azv.a($$0);
   }

   public boolean a(arq $$0) {
      if (this.l == dwx.b && this.e != null) {
         eqd $$1 = $$0.q().b(this.e).orElse(null);
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

   public boolean b(arq $$0) {
      eqd $$1 = this.d($$0);
      if ($$1 == null) {
         return false;
      } else {
         this.a($$1);
         return true;
      }
   }

   private void a(eqd $$0) {
      this.f = !bak.b($$0.b()) ? $$0.b() : "";
      this.i = $$0.a();
      this.e();
   }

   public void c(arq $$0) {
      eqd $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$0, $$1);
      }
   }

   @Nullable
   private eqd d(arq $$0) {
      return this.e == null ? null : $$0.q().b(this.e).orElse(null);
   }

   private void a(arq $$0, eqd $$1) {
      this.a($$1);
      epz $$2 = new epz().a(this.j).a(this.k).a(this.m);
      if (this.t < 1.0F) {
         $$2.b().a(new epg(azn.a(this.t, 0.0F, 1.0F))).a(b(this.u));
      }

      jh $$3 = this.aB_().a((kl)this.h);
      $$1.a($$0, $$3, $$3, $$2, b(this.u), 2);
   }

   public void B() {
      if (this.e != null) {
         arq $$0 = (arq)this.o;
         eqe $$1 = $$0.q();
         $$1.d(this.e);
      }
   }

   public boolean C() {
      if (this.l == dwx.b && !this.o.C && this.e != null) {
         arq $$0 = (arq)this.o;
         eqe $$1 = $$0.q();

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
