import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dqx extends dpi {
   private static final int d = 5;
   public static final int a = 48;
   public static final int b = 48;
   public static final String c = "author";
   @Nullable
   private alf e;
   private String f = "";
   private String g = "";
   private iz h = new iz(0, 1, 0);
   private kd i = kd.g;
   private djx j = djx.a;
   private dln k = dln.a;
   private dtn l;
   private boolean m = true;
   private boolean q;
   private boolean r;
   private boolean s = true;
   private float t = 1.0F;
   private long u;

   public dqx(iz $$0, dsd $$1) {
      super(dpk.u, $$0, $$1);
      this.l = $$1.c(dmy.b);
   }

   @Override
   protected void b(us $$0, jk.a $$1) {
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
   protected void a(us $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.a($$0.l("name"));
      this.f = $$0.l("author");
      this.g = $$0.l("metadata");
      int $$2 = ayz.a($$0.h("posX"), -48, 48);
      int $$3 = ayz.a($$0.h("posY"), -48, 48);
      int $$4 = ayz.a($$0.h("posZ"), -48, 48);
      this.h = new iz($$2, $$3, $$4);
      int $$5 = ayz.a($$0.h("sizeX"), 0, 48);
      int $$6 = ayz.a($$0.h("sizeY"), 0, 48);
      int $$7 = ayz.a($$0.h("sizeZ"), 0, 48);
      this.i = new kd($$5, $$6, $$7);

      try {
         this.k = dln.valueOf($$0.l("rotation"));
      } catch (IllegalArgumentException var12) {
         this.k = dln.a;
      }

      try {
         this.j = djx.valueOf($$0.l("mirror"));
      } catch (IllegalArgumentException var11) {
         this.j = djx.a;
      }

      try {
         this.l = dtn.valueOf($$0.l("mode"));
      } catch (IllegalArgumentException var10) {
         this.l = dtn.d;
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
         iz $$0 = this.ay_();
         dsd $$1 = this.n.a_($$0);
         if ($$1.a(dfc.pa)) {
            this.n.a($$0, $$1.a(dmy.b, this.l), 2);
         }
      }
   }

   public acp b() {
      return acp.a(this);
   }

   @Override
   public us a(jk.a $$0) {
      return this.e($$0);
   }

   public boolean a(cmy $$0) {
      if (!$$0.gz()) {
         return false;
      } else {
         if ($$0.cN().B) {
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
      this.a(azv.b($$0) ? null : alf.a($$0));
   }

   public void a(@Nullable alf $$0) {
      this.e = $$0;
   }

   public void a(btq $$0) {
      this.f = $$0.af().getString();
   }

   public iz f() {
      return this.h;
   }

   public void a(iz $$0) {
      this.h = $$0;
   }

   public kd j() {
      return this.i;
   }

   public void a(kd $$0) {
      this.i = $$0;
   }

   public djx k() {
      return this.j;
   }

   public void a(djx $$0) {
      this.j = $$0;
   }

   public dln l() {
      return this.k;
   }

   public void a(dln $$0) {
      this.k = $$0;
   }

   public String u() {
      return this.g;
   }

   public void b(String $$0) {
      this.g = $$0;
   }

   public dtn v() {
      return this.l;
   }

   public void a(dtn $$0) {
      this.l = $$0;
      dsd $$1 = this.n.a_(this.ay_());
      if ($$1.a(dfc.pa)) {
         this.n.a(this.ay_(), $$1.a(dmy.b, $$0), 2);
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
      if (this.l != dtn.a) {
         return false;
      } else {
         iz $$0 = this.ay_();
         int $$1 = 80;
         iz $$2 = new iz($$0.u() - 80, this.n.I_(), $$0.w() - 80);
         iz $$3 = new iz($$0.u() + 80, this.n.am() - 1, $$0.w() + 80);
         Stream<iz> $$4 = this.a($$2, $$3);
         return a($$0, $$4).filter($$1x -> {
            int $$2x = $$1x.k() - $$1x.h();
            int $$3x = $$1x.l() - $$1x.i();
            int $$4x = $$1x.m() - $$1x.j();
            if ($$2x > 1 && $$3x > 1 && $$4x > 1) {
               this.h = new iz($$1x.h() - $$0.u() + 1, $$1x.i() - $$0.v() + 1, $$1x.j() - $$0.w() + 1);
               this.i = new kd($$2x - 1, $$3x - 1, $$4x - 1);
               this.e();
               dsd $$5 = this.n.a_($$0);
               this.n.a($$0, $$5, $$5, 3);
               return true;
            } else {
               return false;
            }
         }).isPresent();
      }
   }

   private Stream<iz> a(iz $$0, iz $$1) {
      return iz.d($$0, $$1)
         .filter($$0x -> this.n.a_($$0x).a(dfc.pa))
         .map(this.n::c_)
         .filter($$0x -> $$0x instanceof dqx)
         .map($$0x -> (dqx)$$0x)
         .filter($$0x -> $$0x.l == dtn.c && Objects.equals(this.e, $$0x.e))
         .map(dpi::ay_);
   }

   private static Optional<eid> a(iz $$0, Stream<iz> $$1) {
      Iterator<iz> $$2 = $$1.iterator();
      if (!$$2.hasNext()) {
         return Optional.empty();
      } else {
         iz $$3 = $$2.next();
         eid $$4 = new eid($$3);
         if ($$2.hasNext()) {
            $$2.forEachRemaining($$4::a);
         } else {
            $$4.a($$0);
         }

         return Optional.of($$4);
      }
   }

   public boolean A() {
      return this.l != dtn.a ? false : this.b(true);
   }

   public boolean b(boolean $$0) {
      if (this.e == null) {
         return false;
      } else {
         iz $$1 = this.ay_().a((kd)this.h);
         arf $$2 = (arf)this.n;
         emm $$3 = $$2.q();

         eml $$4;
         try {
            $$4 = $$3.a(this.e);
         } catch (z var8) {
            return false;
         }

         $$4.a(this.n, $$1, this.i, !this.m, dfc.kN);
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

   public static azh b(long $$0) {
      return $$0 == 0L ? azh.a(ac.c()) : azh.a($$0);
   }

   public boolean a(arf $$0) {
      if (this.l == dtn.b && this.e != null) {
         eml $$1 = $$0.q().b(this.e).orElse(null);
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

   public boolean b(arf $$0) {
      eml $$1 = this.d($$0);
      if ($$1 == null) {
         return false;
      } else {
         this.a($$1);
         return true;
      }
   }

   private void a(eml $$0) {
      this.f = !azv.b($$0.b()) ? $$0.b() : "";
      this.i = $$0.a();
      this.e();
   }

   public void c(arf $$0) {
      eml $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$0, $$1);
      }
   }

   @Nullable
   private eml d(arf $$0) {
      return this.e == null ? null : $$0.q().b(this.e).orElse(null);
   }

   private void a(arf $$0, eml $$1) {
      this.a($$1);
      emh $$2 = new emh().a(this.j).a(this.k).a(this.m);
      if (this.t < 1.0F) {
         $$2.b().a(new elp(ayz.a(this.t, 0.0F, 1.0F))).a(b(this.u));
      }

      iz $$3 = this.ay_().a((kd)this.h);
      $$1.a($$0, $$3, $$3, $$2, b(this.u), 2);
   }

   public void B() {
      if (this.e != null) {
         arf $$0 = (arf)this.n;
         emm $$1 = $$0.q();
         $$1.d(this.e);
      }
   }

   public boolean C() {
      if (this.l == dtn.b && !this.n.B && this.e != null) {
         arf $$0 = (arf)this.n;
         emm $$1 = $$0.q();

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
