import java.util.Objects;
import javax.annotation.Nullable;

public class efx {
   private final hx a;
   private final clm b;
   @Nullable
   private final vf c;

   public efx(hx $$0, clm $$1, @Nullable vf $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public static efx a(sn $$0) {
      hx $$1 = tc.b($$0.p("Pos"));
      clm $$2 = clm.a($$0.l("Color"), clm.a);
      vf $$3 = $$0.e("Name") ? vf.a.a($$0.l("Name")) : null;
      return new efx($$1, $$2, $$3);
   }

   @Nullable
   public static efx a(csv $$0, hx $$1) {
      if ($$0.c_($$1) instanceof dgl $$3) {
         clm $$4 = $$3.g();
         vf $$5 = $$3.ae() ? $$3.af() : null;
         return new efx($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public hx a() {
      return this.a;
   }

   public clm b() {
      return this.b;
   }

   public efy.a c() {
      switch (this.b) {
         case a:
            return efy.a.k;
         case b:
            return efy.a.l;
         case c:
            return efy.a.m;
         case d:
            return efy.a.n;
         case e:
            return efy.a.o;
         case f:
            return efy.a.p;
         case g:
            return efy.a.q;
         case h:
            return efy.a.r;
         case i:
            return efy.a.s;
         case j:
            return efy.a.t;
         case k:
            return efy.a.u;
         case l:
            return efy.a.v;
         case m:
            return efy.a.w;
         case n:
            return efy.a.x;
         case o:
            return efy.a.y;
         case p:
         default:
            return efy.a.z;
      }
   }

   @Nullable
   public vf d() {
      return this.c;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         efx $$1 = (efx)$$0;
         return Objects.equals(this.a, $$1.a) && this.b == $$1.b && Objects.equals(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b, this.c);
   }

   public sn e() {
      sn $$0 = new sn();
      $$0.a("Pos", tc.a(this.a));
      $$0.a("Color", this.b.b());
      if (this.c != null) {
         $$0.a("Name", vf.a.a(this.c));
      }

      return $$0;
   }

   public String f() {
      return "banner-" + this.a.u() + "," + this.a.v() + "," + this.a.w();
   }
}
