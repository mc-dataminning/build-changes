import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dpv extends dog {
   private static final int d = 5;
   public static final int a = 48;
   public static final int b = 48;
   public static final String c = "author";
   @Nullable
   private akm e;
   private String f = "";
   private String g = "";
   private io h = new io(0, 1, 0);
   private js i = js.g;
   private div j = div.a;
   private dkl k = dkl.a;
   private dsl l;
   private boolean m = true;
   private boolean q;
   private boolean r;
   private boolean s = true;
   private float t = 1.0F;
   private long u;

   public dpv(io $$0, drb $$1) {
      super(doi.u, $$0, $$1);
      this.l = $$1.c(dlw.b);
   }

   @Override
   protected void b(ud $$0, iz.a $$1) {
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
   protected void a(ud $$0, iz.a $$1) {
      super.a($$0, $$1);
      this.a($$0.l("name"));
      this.f = $$0.l("author");
      this.g = $$0.l("metadata");
      int $$2 = ayd.a($$0.h("posX"), -48, 48);
      int $$3 = ayd.a($$0.h("posY"), -48, 48);
      int $$4 = ayd.a($$0.h("posZ"), -48, 48);
      this.h = new io($$2, $$3, $$4);
      int $$5 = ayd.a($$0.h("sizeX"), 0, 48);
      int $$6 = ayd.a($$0.h("sizeY"), 0, 48);
      int $$7 = ayd.a($$0.h("sizeZ"), 0, 48);
      this.i = new js($$5, $$6, $$7);

      try {
         this.k = dkl.valueOf($$0.l("rotation"));
      } catch (IllegalArgumentException var12) {
         this.k = dkl.a;
      }

      try {
         this.j = div.valueOf($$0.l("mirror"));
      } catch (IllegalArgumentException var11) {
         this.j = div.a;
      }

      try {
         this.l = dsl.valueOf($$0.l("mode"));
      } catch (IllegalArgumentException var10) {
         this.l = dsl.d;
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
         io $$0 = this.az_();
         drb $$1 = this.n.a_($$0);
         if ($$1.a(dea.pa)) {
            this.n.a($$0, $$1.a(dlw.b, this.l), 2);
         }
      }
   }

   public abx b() {
      return abx.a(this);
   }

   @Override
   public ud a(iz.a $$0) {
      return this.e($$0);
   }

   public boolean a(clw $$0) {
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
      this.a(ayy.b($$0) ? null : akm.a($$0));
   }

   public void a(@Nullable akm $$0) {
      this.e = $$0;
   }

   public void a(bso $$0) {
      this.f = $$0.af().getString();
   }

   public io f() {
      return this.h;
   }

   public void a(io $$0) {
      this.h = $$0;
   }

   public js j() {
      return this.i;
   }

   public void a(js $$0) {
      this.i = $$0;
   }

   public div k() {
      return this.j;
   }

   public void a(div $$0) {
      this.j = $$0;
   }

   public dkl l() {
      return this.k;
   }

   public void a(dkl $$0) {
      this.k = $$0;
   }

   public String u() {
      return this.g;
   }

   public void b(String $$0) {
      this.g = $$0;
   }

   public dsl v() {
      return this.l;
   }

   public void a(dsl $$0) {
      this.l = $$0;
      drb $$1 = this.n.a_(this.az_());
      if ($$1.a(dea.pa)) {
         this.n.a(this.az_(), $$1.a(dlw.b, $$0), 2);
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
      if (this.l != dsl.a) {
         return false;
      } else {
         io $$0 = this.az_();
         int $$1 = 80;
         io $$2 = new io($$0.u() - 80, this.n.I_(), $$0.w() - 80);
         io $$3 = new io($$0.u() + 80, this.n.al() - 1, $$0.w() + 80);
         Stream<io> $$4 = this.a($$2, $$3);
         return a($$0, $$4).filter($$1x -> {
            int $$2x = $$1x.k() - $$1x.h();
            int $$3x = $$1x.l() - $$1x.i();
            int $$4x = $$1x.m() - $$1x.j();
            if ($$2x > 1 && $$3x > 1 && $$4x > 1) {
               this.h = new io($$1x.h() - $$0.u() + 1, $$1x.i() - $$0.v() + 1, $$1x.j() - $$0.w() + 1);
               this.i = new js($$2x - 1, $$3x - 1, $$4x - 1);
               this.e();
               drb $$5 = this.n.a_($$0);
               this.n.a($$0, $$5, $$5, 3);
               return true;
            } else {
               return false;
            }
         }).isPresent();
      }
   }

   private Stream<io> a(io $$0, io $$1) {
      return io.d($$0, $$1)
         .filter($$0x -> this.n.a_($$0x).a(dea.pa))
         .map(this.n::c_)
         .filter($$0x -> $$0x instanceof dpv)
         .map($$0x -> (dpv)$$0x)
         .filter($$0x -> $$0x.l == dsl.c && Objects.equals(this.e, $$0x.e))
         .map(dog::az_);
   }

   private static Optional<ehb> a(io $$0, Stream<io> $$1) {
      Iterator<io> $$2 = $$1.iterator();
      if (!$$2.hasNext()) {
         return Optional.empty();
      } else {
         io $$3 = $$2.next();
         ehb $$4 = new ehb($$3);
         if ($$2.hasNext()) {
            $$2.forEachRemaining($$4::a);
         } else {
            $$4.a($$0);
         }

         return Optional.of($$4);
      }
   }

   public boolean A() {
      return this.l != dsl.a ? false : this.b(true);
   }

   public boolean b(boolean $$0) {
      if (this.e == null) {
         return false;
      } else {
         io $$1 = this.az_().a((js)this.h);
         aqm $$2 = (aqm)this.n;
         elk $$3 = $$2.q();

         elj $$4;
         try {
            $$4 = $$3.a(this.e);
         } catch (z var8) {
            return false;
         }

         $$4.a(this.n, $$1, this.i, !this.m, dea.kN);
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

   public static ayk b(long $$0) {
      return $$0 == 0L ? ayk.a(ac.c()) : ayk.a($$0);
   }

   public boolean a(aqm $$0) {
      if (this.l == dsl.b && this.e != null) {
         elj $$1 = $$0.q().b(this.e).orElse(null);
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
      elj $$1 = this.d($$0);
      if ($$1 == null) {
         return false;
      } else {
         this.a($$1);
         return true;
      }
   }

   private void a(elj $$0) {
      this.f = !ayy.b($$0.b()) ? $$0.b() : "";
      this.i = $$0.a();
      this.e();
   }

   public void c(aqm $$0) {
      elj $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$0, $$1);
      }
   }

   @Nullable
   private elj d(aqm $$0) {
      return this.e == null ? null : $$0.q().b(this.e).orElse(null);
   }

   private void a(aqm $$0, elj $$1) {
      this.a($$1);
      elf $$2 = new elf().a(this.j).a(this.k).a(this.m);
      if (this.t < 1.0F) {
         $$2.b().a(new ekn(ayd.a(this.t, 0.0F, 1.0F))).a(b(this.u));
      }

      io $$3 = this.az_().a((js)this.h);
      $$1.a($$0, $$3, $$3, $$2, b(this.u), 2);
   }

   public void B() {
      if (this.e != null) {
         aqm $$0 = (aqm)this.n;
         elk $$1 = $$0.q();
         $$1.d(this.e);
      }
   }

   public boolean C() {
      if (this.l == dsl.b && !this.n.B && this.e != null) {
         aqm $$0 = (aqm)this.n;
         elk $$1 = $$0.q();

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
