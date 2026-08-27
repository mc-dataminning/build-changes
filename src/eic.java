import java.util.Objects;
import javax.annotation.Nullable;

public class eic {
   private final hz a;
   private final cnr b;
   @Nullable
   private final vq c;

   public eic(hz $$0, cnr $$1, @Nullable vq $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public static eic a(sw $$0) {
      hz $$1 = tl.b($$0.p("Pos"));
      cnr $$2 = cnr.a($$0.l("Color"), cnr.a);
      vq $$3 = $$0.e("Name") ? vq.a.a($$0.l("Name")) : null;
      return new eic($$1, $$2, $$3);
   }

   @Nullable
   public static eic a(cux $$0, hz $$1) {
      if ($$0.c_($$1) instanceof din $$3) {
         cnr $$4 = $$3.g();
         vq $$5 = $$3.ae() ? $$3.af() : null;
         return new eic($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public hz a() {
      return this.a;
   }

   public cnr b() {
      return this.b;
   }

   public eid.a c() {
      switch (this.b) {
         case a:
            return eid.a.k;
         case b:
            return eid.a.l;
         case c:
            return eid.a.m;
         case d:
            return eid.a.n;
         case e:
            return eid.a.o;
         case f:
            return eid.a.p;
         case g:
            return eid.a.q;
         case h:
            return eid.a.r;
         case i:
            return eid.a.s;
         case j:
            return eid.a.t;
         case k:
            return eid.a.u;
         case l:
            return eid.a.v;
         case m:
            return eid.a.w;
         case n:
            return eid.a.x;
         case o:
            return eid.a.y;
         case p:
         default:
            return eid.a.z;
      }
   }

   @Nullable
   public vq d() {
      return this.c;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         eic $$1 = (eic)$$0;
         return Objects.equals(this.a, $$1.a) && this.b == $$1.b && Objects.equals(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b, this.c);
   }

   public sw e() {
      sw $$0 = new sw();
      $$0.a("Pos", tl.a(this.a));
      $$0.a("Color", this.b.b());
      if (this.c != null) {
         $$0.a("Name", vq.a.a(this.c));
      }

      return $$0;
   }

   public String f() {
      return "banner-" + this.a.u() + "," + this.a.v() + "," + this.a.w();
   }
}
