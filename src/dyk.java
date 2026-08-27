import java.util.Objects;
import javax.annotation.Nullable;

public class dyk {
   private final gu a;
   private final cen b;
   @Nullable
   private final sw c;

   public dyk(gu $$0, cen $$1, @Nullable sw $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public static dyk a(qr $$0) {
      gu $$1 = rd.b($$0.p("Pos"));
      cen $$2 = cen.a($$0.l("Color"), cen.a);
      sw $$3 = $$0.e("Name") ? sw.a.a($$0.l("Name")) : null;
      return new dyk($$1, $$2, $$3);
   }

   @Nullable
   public static dyk a(cls $$0, gu $$1) {
      if ($$0.c_($$1) instanceof czd $$3) {
         cen $$4 = $$3.g();
         sw $$5 = $$3.aa() ? $$3.ab() : null;
         return new dyk($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public gu a() {
      return this.a;
   }

   public cen b() {
      return this.b;
   }

   public dyl.a c() {
      switch (this.b) {
         case a:
            return dyl.a.k;
         case b:
            return dyl.a.l;
         case c:
            return dyl.a.m;
         case d:
            return dyl.a.n;
         case e:
            return dyl.a.o;
         case f:
            return dyl.a.p;
         case g:
            return dyl.a.q;
         case h:
            return dyl.a.r;
         case i:
            return dyl.a.s;
         case j:
            return dyl.a.t;
         case k:
            return dyl.a.u;
         case l:
            return dyl.a.v;
         case m:
            return dyl.a.w;
         case n:
            return dyl.a.x;
         case o:
            return dyl.a.y;
         case p:
         default:
            return dyl.a.z;
      }
   }

   @Nullable
   public sw d() {
      return this.c;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         dyk $$1 = (dyk)$$0;
         return Objects.equals(this.a, $$1.a) && this.b == $$1.b && Objects.equals(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b, this.c);
   }

   public qr e() {
      qr $$0 = new qr();
      $$0.a("Pos", rd.a(this.a));
      $$0.a("Color", this.b.b());
      if (this.c != null) {
         $$0.a("Name", sw.a.a(this.c));
      }

      return $$0;
   }

   public String f() {
      return "banner-" + this.a.u() + "," + this.a.v() + "," + this.a.w();
   }
}
