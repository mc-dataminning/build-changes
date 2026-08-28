import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dtx extends dsg {
   private static final int d = 5;
   public static final int a = 48;
   public static final int b = 48;
   public static final String c = "author";
   @Nullable
   private alh e;
   private String f = "";
   private String g = "";
   private jg h = new jg(0, 1, 0);
   private kk i = kk.g;
   private dmu j = dmu.a;
   private dol k = dol.a;
   private dwn l;
   private boolean m = true;
   private boolean n;
   private boolean r;
   private boolean s = true;
   private float t = 1.0F;
   private long u;

   public dtx(jg $$0, dvd $$1) {
      super(dsi.u, $$0, $$1);
      this.l = $$1.c(dpw.b);
   }

   @Override
   protected void b(uj $$0, jr.a $$1) {
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
   protected void a(uj $$0, jr.a $$1) {
      super.a($$0, $$1);
      this.a($$0.l("name"));
      this.f = $$0.l("author");
      this.g = $$0.l("metadata");
      int $$2 = azj.a($$0.h("posX"), -48, 48);
      int $$3 = azj.a($$0.h("posY"), -48, 48);
      int $$4 = azj.a($$0.h("posZ"), -48, 48);
      this.h = new jg($$2, $$3, $$4);
      int $$5 = azj.a($$0.h("sizeX"), 0, 48);
      int $$6 = azj.a($$0.h("sizeY"), 0, 48);
      int $$7 = azj.a($$0.h("sizeZ"), 0, 48);
      this.i = new kk($$5, $$6, $$7);

      try {
         this.k = dol.valueOf($$0.l("rotation"));
      } catch (IllegalArgumentException var12) {
         this.k = dol.a;
      }

      try {
         this.j = dmu.valueOf($$0.l("mirror"));
      } catch (IllegalArgumentException var11) {
         this.j = dmu.a;
      }

      try {
         this.l = dwn.valueOf($$0.l("mode"));
      } catch (IllegalArgumentException var10) {
         this.l = dwn.d;
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
         jg $$0 = this.aC_();
         dvd $$1 = this.o.a_($$0);
         if ($$1.a(dia.pa)) {
            this.o.a($$0, $$1.b(dpw.b, this.l), 2);
         }
      }
   }

   public ack b() {
      return ack.a(this);
   }

   @Override
   public uj a(jr.a $$0) {
      return this.e($$0);
   }

   public boolean a(coh $$0) {
      if (!$$0.gH()) {
         return false;
      } else {
         if ($$0.cV().C) {
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
      this.a(bag.b($$0) ? null : alh.c($$0));
   }

   public void a(@Nullable alh $$0) {
      this.e = $$0;
   }

   public void a(buv $$0) {
      this.f = $$0.al().getString();
   }

   public jg f() {
      return this.h;
   }

   public void a(jg $$0) {
      this.h = $$0;
   }

   public kk j() {
      return this.i;
   }

   public void a(kk $$0) {
      this.i = $$0;
   }

   public dmu k() {
      return this.j;
   }

   public void a(dmu $$0) {
      this.j = $$0;
   }

   public dol t() {
      return this.k;
   }

   public void a(dol $$0) {
      this.k = $$0;
   }

   public String u() {
      return this.g;
   }

   public void b(String $$0) {
      this.g = $$0;
   }

   public dwn v() {
      return this.l;
   }

   public void a(dwn $$0) {
      this.l = $$0;
      dvd $$1 = this.o.a_(this.aC_());
      if ($$1.a(dia.pa)) {
         this.o.a(this.aC_(), $$1.b(dpw.b, $$0), 2);
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
      if (this.l != dwn.a) {
         return false;
      } else {
         jg $$0 = this.aC_();
         int $$1 = 80;
         jg $$2 = new jg($$0.u() - 80, this.o.I_(), $$0.w() - 80);
         jg $$3 = new jg($$0.u() + 80, this.o.an(), $$0.w() + 80);
         Stream<jg> $$4 = this.a($$2, $$3);
         return a($$0, $$4).filter($$1x -> {
            int $$2x = $$1x.k() - $$1x.h();
            int $$3x = $$1x.l() - $$1x.i();
            int $$4x = $$1x.m() - $$1x.j();
            if ($$2x > 1 && $$3x > 1 && $$4x > 1) {
               this.h = new jg($$1x.h() - $$0.u() + 1, $$1x.i() - $$0.v() + 1, $$1x.j() - $$0.w() + 1);
               this.i = new kk($$2x - 1, $$3x - 1, $$4x - 1);
               this.e();
               dvd $$5 = this.o.a_($$0);
               this.o.a($$0, $$5, $$5, 3);
               return true;
            } else {
               return false;
            }
         }).isPresent();
      }
   }

   private Stream<jg> a(jg $$0, jg $$1) {
      return jg.d($$0, $$1)
         .filter($$0x -> this.o.a_($$0x).a(dia.pa))
         .map(this.o::c_)
         .filter($$0x -> $$0x instanceof dtx)
         .map($$0x -> (dtx)$$0x)
         .filter($$0x -> $$0x.l == dwn.c && Objects.equals(this.e, $$0x.e))
         .map(dsg::aC_);
   }

   private static Optional<elj> a(jg $$0, Stream<jg> $$1) {
      Iterator<jg> $$2 = $$1.iterator();
      if (!$$2.hasNext()) {
         return Optional.empty();
      } else {
         jg $$3 = $$2.next();
         elj $$4 = new elj($$3);
         if ($$2.hasNext()) {
            $$2.forEachRemaining($$4::a);
         } else {
            $$4.a($$0);
         }

         return Optional.of($$4);
      }
   }

   public boolean A() {
      return this.l != dwn.a ? false : this.b(true);
   }

   public boolean b(boolean $$0) {
      if (this.e == null) {
         return false;
      } else {
         jg $$1 = this.aC_().a((kk)this.h);
         arm $$2 = (arm)this.o;
         epu $$3 = $$2.q();

         ept $$4;
         try {
            $$4 = $$3.a(this.e);
         } catch (aa var8) {
            return false;
         }

         $$4.a(this.o, $$1, this.i, !this.m, dia.kN);
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

   public static azr b(long $$0) {
      return $$0 == 0L ? azr.a(ad.c()) : azr.a($$0);
   }

   public boolean a(arm $$0) {
      if (this.l == dwn.b && this.e != null) {
         ept $$1 = $$0.q().b(this.e).orElse(null);
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

   public boolean b(arm $$0) {
      ept $$1 = this.d($$0);
      if ($$1 == null) {
         return false;
      } else {
         this.a($$1);
         return true;
      }
   }

   private void a(ept $$0) {
      this.f = !bag.b($$0.b()) ? $$0.b() : "";
      this.i = $$0.a();
      this.e();
   }

   public void c(arm $$0) {
      ept $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$0, $$1);
      }
   }

   @Nullable
   private ept d(arm $$0) {
      return this.e == null ? null : $$0.q().b(this.e).orElse(null);
   }

   private void a(arm $$0, ept $$1) {
      this.a($$1);
      epp $$2 = new epp().a(this.j).a(this.k).a(this.m);
      if (this.t < 1.0F) {
         $$2.b().a(new eow(azj.a(this.t, 0.0F, 1.0F))).a(b(this.u));
      }

      jg $$3 = this.aC_().a((kk)this.h);
      $$1.a($$0, $$3, $$3, $$2, b(this.u), 2);
   }

   public void B() {
      if (this.e != null) {
         arm $$0 = (arm)this.o;
         epu $$1 = $$0.q();
         $$1.d(this.e);
      }
   }

   public boolean C() {
      if (this.l == dwn.b && !this.o.C && this.e != null) {
         arm $$0 = (arm)this.o;
         epu $$1 = $$0.q();

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
