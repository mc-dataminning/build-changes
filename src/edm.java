import java.util.Objects;
import javax.annotation.Nullable;

public class edm {
   private final ht a;
   private final cjp b;
   @Nullable
   private final ur c;

   public edm(ht $$0, cjp $$1, @Nullable ur $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public static edm a(rz $$0) {
      ht $$1 = so.b($$0.p("Pos"));
      cjp $$2 = cjp.a($$0.l("Color"), cjp.a);
      ur $$3 = $$0.e("Name") ? ur.a.a($$0.l("Name")) : null;
      return new edm($$1, $$2, $$3);
   }

   @Nullable
   public static edm a(cqy $$0, ht $$1) {
      if ($$0.c_($$1) instanceof deh $$3) {
         cjp $$4 = $$3.g();
         ur $$5 = $$3.ac() ? $$3.ad() : null;
         return new edm($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public ht a() {
      return this.a;
   }

   public cjp b() {
      return this.b;
   }

   public edn.a c() {
      switch (this.b) {
         case a:
            return edn.a.k;
         case b:
            return edn.a.l;
         case c:
            return edn.a.m;
         case d:
            return edn.a.n;
         case e:
            return edn.a.o;
         case f:
            return edn.a.p;
         case g:
            return edn.a.q;
         case h:
            return edn.a.r;
         case i:
            return edn.a.s;
         case j:
            return edn.a.t;
         case k:
            return edn.a.u;
         case l:
            return edn.a.v;
         case m:
            return edn.a.w;
         case n:
            return edn.a.x;
         case o:
            return edn.a.y;
         case p:
         default:
            return edn.a.z;
      }
   }

   @Nullable
   public ur d() {
      return this.c;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         edm $$1 = (edm)$$0;
         return Objects.equals(this.a, $$1.a) && this.b == $$1.b && Objects.equals(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b, this.c);
   }

   public rz e() {
      rz $$0 = new rz();
      $$0.a("Pos", so.a(this.a));
      $$0.a("Color", this.b.b());
      if (this.c != null) {
         $$0.a("Name", ur.a.a(this.c));
      }

      return $$0;
   }

   public String f() {
      return "banner-" + this.a.u() + "," + this.a.v() + "," + this.a.w();
   }
}
