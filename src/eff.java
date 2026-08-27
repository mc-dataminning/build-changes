import java.util.Objects;
import javax.annotation.Nullable;

public class eff {
   private final hv a;
   private final ckv b;
   @Nullable
   private final vb c;

   public eff(hv $$0, ckv $$1, @Nullable vb $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public static eff a(sj $$0) {
      hv $$1 = sy.b($$0.p("Pos"));
      ckv $$2 = ckv.a($$0.l("Color"), ckv.a);
      vb $$3 = $$0.e("Name") ? vb.a.a($$0.l("Name")) : null;
      return new eff($$1, $$2, $$3);
   }

   @Nullable
   public static eff a(cse $$0, hv $$1) {
      if ($$0.c_($$1) instanceof dft $$3) {
         ckv $$4 = $$3.g();
         vb $$5 = $$3.ae() ? $$3.af() : null;
         return new eff($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public hv a() {
      return this.a;
   }

   public ckv b() {
      return this.b;
   }

   public efg.a c() {
      switch (this.b) {
         case a:
            return efg.a.k;
         case b:
            return efg.a.l;
         case c:
            return efg.a.m;
         case d:
            return efg.a.n;
         case e:
            return efg.a.o;
         case f:
            return efg.a.p;
         case g:
            return efg.a.q;
         case h:
            return efg.a.r;
         case i:
            return efg.a.s;
         case j:
            return efg.a.t;
         case k:
            return efg.a.u;
         case l:
            return efg.a.v;
         case m:
            return efg.a.w;
         case n:
            return efg.a.x;
         case o:
            return efg.a.y;
         case p:
         default:
            return efg.a.z;
      }
   }

   @Nullable
   public vb d() {
      return this.c;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         eff $$1 = (eff)$$0;
         return Objects.equals(this.a, $$1.a) && this.b == $$1.b && Objects.equals(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b, this.c);
   }

   public sj e() {
      sj $$0 = new sj();
      $$0.a("Pos", sy.a(this.a));
      $$0.a("Color", this.b.b());
      if (this.c != null) {
         $$0.a("Name", vb.a.a(this.c));
      }

      return $$0;
   }

   public String f() {
      return "banner-" + this.a.u() + "," + this.a.v() + "," + this.a.w();
   }
}
