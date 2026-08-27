import java.util.Objects;
import javax.annotation.Nullable;

public class efw {
   private final hx a;
   private final cll b;
   @Nullable
   private final vf c;

   public efw(hx $$0, cll $$1, @Nullable vf $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public static efw a(sn $$0) {
      hx $$1 = tc.b($$0.p("Pos"));
      cll $$2 = cll.a($$0.l("Color"), cll.a);
      vf $$3 = $$0.e("Name") ? vf.a.a($$0.l("Name")) : null;
      return new efw($$1, $$2, $$3);
   }

   @Nullable
   public static efw a(csu $$0, hx $$1) {
      if ($$0.c_($$1) instanceof dgk $$3) {
         cll $$4 = $$3.g();
         vf $$5 = $$3.ae() ? $$3.af() : null;
         return new efw($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public hx a() {
      return this.a;
   }

   public cll b() {
      return this.b;
   }

   public efx.a c() {
      switch (this.b) {
         case a:
            return efx.a.k;
         case b:
            return efx.a.l;
         case c:
            return efx.a.m;
         case d:
            return efx.a.n;
         case e:
            return efx.a.o;
         case f:
            return efx.a.p;
         case g:
            return efx.a.q;
         case h:
            return efx.a.r;
         case i:
            return efx.a.s;
         case j:
            return efx.a.t;
         case k:
            return efx.a.u;
         case l:
            return efx.a.v;
         case m:
            return efx.a.w;
         case n:
            return efx.a.x;
         case o:
            return efx.a.y;
         case p:
         default:
            return efx.a.z;
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
         efw $$1 = (efw)$$0;
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
