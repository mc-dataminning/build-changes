import java.util.Objects;
import javax.annotation.Nullable;

public class ebn {
   private final gw a;
   private final cho b;
   @Nullable
   private final ti c;

   public ebn(gw $$0, cho $$1, @Nullable ti $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public static ebn a(qu $$0) {
      gw $$1 = rg.b($$0.p("Pos"));
      cho $$2 = cho.a($$0.l("Color"), cho.a);
      ti $$3 = $$0.e("Name") ? ti.a.a($$0.l("Name")) : null;
      return new ebn($$1, $$2, $$3);
   }

   @Nullable
   public static ebn a(cow $$0, gw $$1) {
      if ($$0.c_($$1) instanceof dcg $$3) {
         cho $$4 = $$3.g();
         ti $$5 = $$3.ac() ? $$3.ad() : null;
         return new ebn($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public gw a() {
      return this.a;
   }

   public cho b() {
      return this.b;
   }

   public ebo.a c() {
      switch (this.b) {
         case a:
            return ebo.a.k;
         case b:
            return ebo.a.l;
         case c:
            return ebo.a.m;
         case d:
            return ebo.a.n;
         case e:
            return ebo.a.o;
         case f:
            return ebo.a.p;
         case g:
            return ebo.a.q;
         case h:
            return ebo.a.r;
         case i:
            return ebo.a.s;
         case j:
            return ebo.a.t;
         case k:
            return ebo.a.u;
         case l:
            return ebo.a.v;
         case m:
            return ebo.a.w;
         case n:
            return ebo.a.x;
         case o:
            return ebo.a.y;
         case p:
         default:
            return ebo.a.z;
      }
   }

   @Nullable
   public ti d() {
      return this.c;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         ebn $$1 = (ebn)$$0;
         return Objects.equals(this.a, $$1.a) && this.b == $$1.b && Objects.equals(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b, this.c);
   }

   public qu e() {
      qu $$0 = new qu();
      $$0.a("Pos", rg.a(this.a));
      $$0.a("Color", this.b.b());
      if (this.c != null) {
         $$0.a("Name", ti.a.a(this.c));
      }

      return $$0;
   }

   public String f() {
      return "banner-" + this.a.u() + "," + this.a.v() + "," + this.a.w();
   }
}
