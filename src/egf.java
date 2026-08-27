import java.util.Objects;
import javax.annotation.Nullable;

public class egf {
   private final hx a;
   private final clv b;
   @Nullable
   private final vg c;

   public egf(hx $$0, clv $$1, @Nullable vg $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public static egf a(so $$0) {
      hx $$1 = td.b($$0.p("Pos"));
      clv $$2 = clv.a($$0.l("Color"), clv.a);
      vg $$3 = $$0.e("Name") ? vg.a.a($$0.l("Name")) : null;
      return new egf($$1, $$2, $$3);
   }

   @Nullable
   public static egf a(ctd $$0, hx $$1) {
      if ($$0.c_($$1) instanceof dgt $$3) {
         clv $$4 = $$3.g();
         vg $$5 = $$3.ae() ? $$3.af() : null;
         return new egf($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public hx a() {
      return this.a;
   }

   public clv b() {
      return this.b;
   }

   public egg.a c() {
      switch (this.b) {
         case a:
            return egg.a.k;
         case b:
            return egg.a.l;
         case c:
            return egg.a.m;
         case d:
            return egg.a.n;
         case e:
            return egg.a.o;
         case f:
            return egg.a.p;
         case g:
            return egg.a.q;
         case h:
            return egg.a.r;
         case i:
            return egg.a.s;
         case j:
            return egg.a.t;
         case k:
            return egg.a.u;
         case l:
            return egg.a.v;
         case m:
            return egg.a.w;
         case n:
            return egg.a.x;
         case o:
            return egg.a.y;
         case p:
         default:
            return egg.a.z;
      }
   }

   @Nullable
   public vg d() {
      return this.c;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         egf $$1 = (egf)$$0;
         return Objects.equals(this.a, $$1.a) && this.b == $$1.b && Objects.equals(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b, this.c);
   }

   public so e() {
      so $$0 = new so();
      $$0.a("Pos", td.a(this.a));
      $$0.a("Color", this.b.b());
      if (this.c != null) {
         $$0.a("Name", vg.a.a(this.c));
      }

      return $$0;
   }

   public String f() {
      return "banner-" + this.a.u() + "," + this.a.v() + "," + this.a.w();
   }
}
