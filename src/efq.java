import java.util.Objects;
import javax.annotation.Nullable;

public class efq {
   private final hx a;
   private final clf b;
   @Nullable
   private final vd c;

   public efq(hx $$0, clf $$1, @Nullable vd $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public static efq a(sl $$0) {
      hx $$1 = ta.b($$0.p("Pos"));
      clf $$2 = clf.a($$0.l("Color"), clf.a);
      vd $$3 = $$0.e("Name") ? vd.a.a($$0.l("Name")) : null;
      return new efq($$1, $$2, $$3);
   }

   @Nullable
   public static efq a(cso $$0, hx $$1) {
      if ($$0.c_($$1) instanceof dge $$3) {
         clf $$4 = $$3.g();
         vd $$5 = $$3.ae() ? $$3.af() : null;
         return new efq($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public hx a() {
      return this.a;
   }

   public clf b() {
      return this.b;
   }

   public efr.a c() {
      switch (this.b) {
         case a:
            return efr.a.k;
         case b:
            return efr.a.l;
         case c:
            return efr.a.m;
         case d:
            return efr.a.n;
         case e:
            return efr.a.o;
         case f:
            return efr.a.p;
         case g:
            return efr.a.q;
         case h:
            return efr.a.r;
         case i:
            return efr.a.s;
         case j:
            return efr.a.t;
         case k:
            return efr.a.u;
         case l:
            return efr.a.v;
         case m:
            return efr.a.w;
         case n:
            return efr.a.x;
         case o:
            return efr.a.y;
         case p:
         default:
            return efr.a.z;
      }
   }

   @Nullable
   public vd d() {
      return this.c;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         efq $$1 = (efq)$$0;
         return Objects.equals(this.a, $$1.a) && this.b == $$1.b && Objects.equals(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b, this.c);
   }

   public sl e() {
      sl $$0 = new sl();
      $$0.a("Pos", ta.a(this.a));
      $$0.a("Color", this.b.b());
      if (this.c != null) {
         $$0.a("Name", vd.a.a(this.c));
      }

      return $$0;
   }

   public String f() {
      return "banner-" + this.a.u() + "," + this.a.v() + "," + this.a.w();
   }
}
