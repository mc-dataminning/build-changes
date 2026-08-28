import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class drf extends dpp {
   private static final int d = 5;
   public static final int a = 48;
   public static final int b = 48;
   public static final String c = "author";
   @Nullable
   private akk e;
   private String f = "";
   private String g = "";
   private ja h = new ja(0, 1, 0);
   private ke i = ke.g;
   private dke j = dke.a;
   private dlu k = dlu.a;
   private dtu l;
   private boolean m = true;
   private boolean q;
   private boolean r;
   private boolean s = true;
   private float t = 1.0F;
   private long u;

   public drf(ja $$0, dsk $$1) {
      super(dpr.u, $$0, $$1);
      this.l = $$1.c(dnf.b);
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
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
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      this.a($$0.l("name"));
      this.f = $$0.l("author");
      this.g = $$0.l("metadata");
      int $$2 = ayg.a($$0.h("posX"), -48, 48);
      int $$3 = ayg.a($$0.h("posY"), -48, 48);
      int $$4 = ayg.a($$0.h("posZ"), -48, 48);
      this.h = new ja($$2, $$3, $$4);
      int $$5 = ayg.a($$0.h("sizeX"), 0, 48);
      int $$6 = ayg.a($$0.h("sizeY"), 0, 48);
      int $$7 = ayg.a($$0.h("sizeZ"), 0, 48);
      this.i = new ke($$5, $$6, $$7);

      try {
         this.k = dlu.valueOf($$0.l("rotation"));
      } catch (IllegalArgumentException var12) {
         this.k = dlu.a;
      }

      try {
         this.j = dke.valueOf($$0.l("mirror"));
      } catch (IllegalArgumentException var11) {
         this.j = dke.a;
      }

      try {
         this.l = dtu.valueOf($$0.l("mode"));
      } catch (IllegalArgumentException var10) {
         this.l = dtu.d;
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
         ja $$0 = this.az_();
         dsk $$1 = this.n.a_($$0);
         if ($$1.a(dfj.pa)) {
            this.n.a($$0, $$1.a(dnf.b, this.l), 2);
         }
      }
   }

   public abu b() {
      return abu.a(this);
   }

   @Override
   public tx a(jl.a $$0) {
      return this.e($$0);
   }

   public boolean a(cmk $$0) {
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
      this.a(azd.b($$0) ? null : akk.a($$0));
   }

   public void a(@Nullable akk $$0) {
      this.e = $$0;
   }

   public void a(btb $$0) {
      this.f = $$0.ag().getString();
   }

   public ja f() {
      return this.h;
   }

   public void a(ja $$0) {
      this.h = $$0;
   }

   public ke j() {
      return this.i;
   }

   public void a(ke $$0) {
      this.i = $$0;
   }

   public dke k() {
      return this.j;
   }

   public void a(dke $$0) {
      this.j = $$0;
   }

   public dlu l() {
      return this.k;
   }

   public void a(dlu $$0) {
      this.k = $$0;
   }

   public String u() {
      return this.g;
   }

   public void b(String $$0) {
      this.g = $$0;
   }

   public dtu v() {
      return this.l;
   }

   public void a(dtu $$0) {
      this.l = $$0;
      dsk $$1 = this.n.a_(this.az_());
      if ($$1.a(dfj.pa)) {
         this.n.a(this.az_(), $$1.a(dnf.b, $$0), 2);
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
      if (this.l != dtu.a) {
         return false;
      } else {
         ja $$0 = this.az_();
         int $$1 = 80;
         ja $$2 = new ja($$0.u() - 80, this.n.I_(), $$0.w() - 80);
         ja $$3 = new ja($$0.u() + 80, this.n.am() - 1, $$0.w() + 80);
         Stream<ja> $$4 = this.a($$2, $$3);
         return a($$0, $$4).filter($$1x -> {
            int $$2x = $$1x.k() - $$1x.h();
            int $$3x = $$1x.l() - $$1x.i();
            int $$4x = $$1x.m() - $$1x.j();
            if ($$2x > 1 && $$3x > 1 && $$4x > 1) {
               this.h = new ja($$1x.h() - $$0.u() + 1, $$1x.i() - $$0.v() + 1, $$1x.j() - $$0.w() + 1);
               this.i = new ke($$2x - 1, $$3x - 1, $$4x - 1);
               this.e();
               dsk $$5 = this.n.a_($$0);
               this.n.a($$0, $$5, $$5, 3);
               return true;
            } else {
               return false;
            }
         }).isPresent();
      }
   }

   private Stream<ja> a(ja $$0, ja $$1) {
      return ja.d($$0, $$1)
         .filter($$0x -> this.n.a_($$0x).a(dfj.pa))
         .map(this.n::c_)
         .filter($$0x -> $$0x instanceof drf)
         .map($$0x -> (drf)$$0x)
         .filter($$0x -> $$0x.l == dtu.c && Objects.equals(this.e, $$0x.e))
         .map(dpp::az_);
   }

   private static Optional<eio> a(ja $$0, Stream<ja> $$1) {
      Iterator<ja> $$2 = $$1.iterator();
      if (!$$2.hasNext()) {
         return Optional.empty();
      } else {
         ja $$3 = $$2.next();
         eio $$4 = new eio($$3);
         if ($$2.hasNext()) {
            $$2.forEachRemaining($$4::a);
         } else {
            $$4.a($$0);
         }

         return Optional.of($$4);
      }
   }

   public boolean A() {
      return this.l != dtu.a ? false : this.b(true);
   }

   public boolean b(boolean $$0) {
      if (this.e == null) {
         return false;
      } else {
         ja $$1 = this.az_().a((ke)this.h);
         aqm $$2 = (aqm)this.n;
         emx $$3 = $$2.q();

         emw $$4;
         try {
            $$4 = $$3.a(this.e);
         } catch (z var8) {
            return false;
         }

         $$4.a(this.n, $$1, this.i, !this.m, dfj.kN);
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

   public static ayo b(long $$0) {
      return $$0 == 0L ? ayo.a(ac.c()) : ayo.a($$0);
   }

   public boolean a(aqm $$0) {
      if (this.l == dtu.b && this.e != null) {
         emw $$1 = $$0.q().b(this.e).orElse(null);
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

   public boolean b(aqm $$0) {
      emw $$1 = this.d($$0);
      if ($$1 == null) {
         return false;
      } else {
         this.a($$1);
         return true;
      }
   }

   private void a(emw $$0) {
      this.f = !azd.b($$0.b()) ? $$0.b() : "";
      this.i = $$0.a();
      this.e();
   }

   public void c(aqm $$0) {
      emw $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$0, $$1);
      }
   }

   @Nullable
   private emw d(aqm $$0) {
      return this.e == null ? null : $$0.q().b(this.e).orElse(null);
   }

   private void a(aqm $$0, emw $$1) {
      this.a($$1);
      ems $$2 = new ems().a(this.j).a(this.k).a(this.m);
      if (this.t < 1.0F) {
         $$2.b().a(new ema(ayg.a(this.t, 0.0F, 1.0F))).a(b(this.u));
      }

      ja $$3 = this.az_().a((ke)this.h);
      $$1.a($$0, $$3, $$3, $$2, b(this.u), 2);
   }

   public void B() {
      if (this.e != null) {
         aqm $$0 = (aqm)this.n;
         emx $$1 = $$0.q();
         $$1.d(this.e);
      }
   }

   public boolean C() {
      if (this.l == dtu.b && !this.n.B && this.e != null) {
         aqm $$0 = (aqm)this.n;
         emx $$1 = $$0.q();

         try {
            return $$1.b(this.e).isPresent();
         } catch (z var4) {
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
