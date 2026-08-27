import java.util.Objects;
import javax.annotation.Nullable;

public class ebs {
   private final gw a;
   private final cht b;
   @Nullable
   private final tm c;

   public ebs(gw $$0, cht $$1, @Nullable tm $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public static ebs a(qy $$0) {
      gw $$1 = rk.b($$0.p("Pos"));
      cht $$2 = cht.a($$0.l("Color"), cht.a);
      tm $$3 = $$0.e("Name") ? tm.a.a($$0.l("Name")) : null;
      return new ebs($$1, $$2, $$3);
   }

   @Nullable
   public static ebs a(cpb $$0, gw $$1) {
      if ($$0.c_($$1) instanceof dcl $$3) {
         cht $$4 = $$3.g();
         tm $$5 = $$3.ac() ? $$3.ad() : null;
         return new ebs($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public gw a() {
      return this.a;
   }

   public cht b() {
      return this.b;
   }

   public ebt.a c() {
      switch (this.b) {
         case a:
            return ebt.a.k;
         case b:
            return ebt.a.l;
         case c:
            return ebt.a.m;
         case d:
            return ebt.a.n;
         case e:
            return ebt.a.o;
         case f:
            return ebt.a.p;
         case g:
            return ebt.a.q;
         case h:
            return ebt.a.r;
         case i:
            return ebt.a.s;
         case j:
            return ebt.a.t;
         case k:
            return ebt.a.u;
         case l:
            return ebt.a.v;
         case m:
            return ebt.a.w;
         case n:
            return ebt.a.x;
         case o:
            return ebt.a.y;
         case p:
         default:
            return ebt.a.z;
      }
   }

   @Nullable
   public tm d() {
      return this.c;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         ebs $$1 = (ebs)$$0;
         return Objects.equals(this.a, $$1.a) && this.b == $$1.b && Objects.equals(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b, this.c);
   }

   public qy e() {
      qy $$0 = new qy();
      $$0.a("Pos", rk.a(this.a));
      $$0.a("Color", this.b.b());
      if (this.c != null) {
         $$0.a("Name", tm.a.a(this.c));
      }

      return $$0;
   }

   public String f() {
      return "banner-" + this.a.u() + "," + this.a.v() + "," + this.a.w();
   }
}
