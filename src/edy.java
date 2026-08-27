import java.util.Objects;
import javax.annotation.Nullable;

public class edy {
   private final ht a;
   private final cjx b;
   @Nullable
   private final ur c;

   public edy(ht $$0, cjx $$1, @Nullable ur $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public static edy a(rz $$0) {
      ht $$1 = so.b($$0.p("Pos"));
      cjx $$2 = cjx.a($$0.l("Color"), cjx.a);
      ur $$3 = $$0.e("Name") ? ur.a.a($$0.l("Name")) : null;
      return new edy($$1, $$2, $$3);
   }

   @Nullable
   public static edy a(crg $$0, ht $$1) {
      if ($$0.c_($$1) instanceof det $$3) {
         cjx $$4 = $$3.g();
         ur $$5 = $$3.ae() ? $$3.af() : null;
         return new edy($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public ht a() {
      return this.a;
   }

   public cjx b() {
      return this.b;
   }

   public edz.a c() {
      switch (this.b) {
         case a:
            return edz.a.k;
         case b:
            return edz.a.l;
         case c:
            return edz.a.m;
         case d:
            return edz.a.n;
         case e:
            return edz.a.o;
         case f:
            return edz.a.p;
         case g:
            return edz.a.q;
         case h:
            return edz.a.r;
         case i:
            return edz.a.s;
         case j:
            return edz.a.t;
         case k:
            return edz.a.u;
         case l:
            return edz.a.v;
         case m:
            return edz.a.w;
         case n:
            return edz.a.x;
         case o:
            return edz.a.y;
         case p:
         default:
            return edz.a.z;
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
         edy $$1 = (edy)$$0;
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
