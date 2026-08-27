import java.util.Objects;
import javax.annotation.Nullable;

public class ebu {
   private final gw a;
   private final chv b;
   @Nullable
   private final tn c;

   public ebu(gw $$0, chv $$1, @Nullable tn $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public static ebu a(qy $$0) {
      gw $$1 = rl.b($$0.p("Pos"));
      chv $$2 = chv.a($$0.l("Color"), chv.a);
      tn $$3 = $$0.e("Name") ? tn.a.a($$0.l("Name")) : null;
      return new ebu($$1, $$2, $$3);
   }

   @Nullable
   public static ebu a(cpd $$0, gw $$1) {
      if ($$0.c_($$1) instanceof dcn $$3) {
         chv $$4 = $$3.g();
         tn $$5 = $$3.ac() ? $$3.ad() : null;
         return new ebu($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public gw a() {
      return this.a;
   }

   public chv b() {
      return this.b;
   }

   public ebv.a c() {
      switch (this.b) {
         case a:
            return ebv.a.k;
         case b:
            return ebv.a.l;
         case c:
            return ebv.a.m;
         case d:
            return ebv.a.n;
         case e:
            return ebv.a.o;
         case f:
            return ebv.a.p;
         case g:
            return ebv.a.q;
         case h:
            return ebv.a.r;
         case i:
            return ebv.a.s;
         case j:
            return ebv.a.t;
         case k:
            return ebv.a.u;
         case l:
            return ebv.a.v;
         case m:
            return ebv.a.w;
         case n:
            return ebv.a.x;
         case o:
            return ebv.a.y;
         case p:
         default:
            return ebv.a.z;
      }
   }

   @Nullable
   public tn d() {
      return this.c;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         ebu $$1 = (ebu)$$0;
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
      $$0.a("Pos", rl.a(this.a));
      $$0.a("Color", this.b.b());
      if (this.c != null) {
         $$0.a("Name", tn.a.a(this.c));
      }

      return $$0;
   }

   public String f() {
      return "banner-" + this.a.u() + "," + this.a.v() + "," + this.a.w();
   }
}
