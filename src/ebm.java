import java.util.Objects;
import javax.annotation.Nullable;

public class ebm {
   private final gw a;
   private final chz b;
   @Nullable
   private final tl c;

   public ebm(gw $$0, chz $$1, @Nullable tl $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public static ebm a(qw $$0) {
      gw $$1 = rj.b($$0.p("Pos"));
      chz $$2 = chz.a($$0.l("Color"), chz.a);
      tl $$3 = $$0.e("Name") ? tl.a.a($$0.l("Name")) : null;
      return new ebm($$1, $$2, $$3);
   }

   @Nullable
   public static ebm a(cph $$0, gw $$1) {
      if ($$0.c_($$1) instanceof dcp $$3) {
         chz $$4 = $$3.g();
         tl $$5 = $$3.ac() ? $$3.ad() : null;
         return new ebm($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public gw a() {
      return this.a;
   }

   public chz b() {
      return this.b;
   }

   public ebn.a c() {
      switch (this.b) {
         case a:
            return ebn.a.k;
         case b:
            return ebn.a.l;
         case c:
            return ebn.a.m;
         case d:
            return ebn.a.n;
         case e:
            return ebn.a.o;
         case f:
            return ebn.a.p;
         case g:
            return ebn.a.q;
         case h:
            return ebn.a.r;
         case i:
            return ebn.a.s;
         case j:
            return ebn.a.t;
         case k:
            return ebn.a.u;
         case l:
            return ebn.a.v;
         case m:
            return ebn.a.w;
         case n:
            return ebn.a.x;
         case o:
            return ebn.a.y;
         case p:
         default:
            return ebn.a.z;
      }
   }

   @Nullable
   public tl d() {
      return this.c;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         ebm $$1 = (ebm)$$0;
         return Objects.equals(this.a, $$1.a) && this.b == $$1.b && Objects.equals(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b, this.c);
   }

   public qw e() {
      qw $$0 = new qw();
      $$0.a("Pos", rj.a(this.a));
      $$0.a("Color", this.b.b());
      if (this.c != null) {
         $$0.a("Name", tl.a.a(this.c));
      }

      return $$0;
   }

   public String f() {
      return "banner-" + this.a.u() + "," + this.a.v() + "," + this.a.w();
   }
}
