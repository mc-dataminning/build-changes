import java.util.Objects;
import javax.annotation.Nullable;

public class ebi {
   private final gu a;
   private final chl b;
   @Nullable
   private final tf c;

   public ebi(gu $$0, chl $$1, @Nullable tf $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public static ebi a(qr $$0) {
      gu $$1 = rd.b($$0.p("Pos"));
      chl $$2 = chl.a($$0.l("Color"), chl.a);
      tf $$3 = $$0.e("Name") ? tf.a.a($$0.l("Name")) : null;
      return new ebi($$1, $$2, $$3);
   }

   @Nullable
   public static ebi a(cor $$0, gu $$1) {
      if ($$0.c_($$1) instanceof dcb $$3) {
         chl $$4 = $$3.g();
         tf $$5 = $$3.ac() ? $$3.ad() : null;
         return new ebi($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public gu a() {
      return this.a;
   }

   public chl b() {
      return this.b;
   }

   public ebj.a c() {
      switch (this.b) {
         case a:
            return ebj.a.k;
         case b:
            return ebj.a.l;
         case c:
            return ebj.a.m;
         case d:
            return ebj.a.n;
         case e:
            return ebj.a.o;
         case f:
            return ebj.a.p;
         case g:
            return ebj.a.q;
         case h:
            return ebj.a.r;
         case i:
            return ebj.a.s;
         case j:
            return ebj.a.t;
         case k:
            return ebj.a.u;
         case l:
            return ebj.a.v;
         case m:
            return ebj.a.w;
         case n:
            return ebj.a.x;
         case o:
            return ebj.a.y;
         case p:
         default:
            return ebj.a.z;
      }
   }

   @Nullable
   public tf d() {
      return this.c;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         ebi $$1 = (ebi)$$0;
         return Objects.equals(this.a, $$1.a) && this.b == $$1.b && Objects.equals(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b, this.c);
   }

   public qr e() {
      qr $$0 = new qr();
      $$0.a("Pos", rd.a(this.a));
      $$0.a("Color", this.b.b());
      if (this.c != null) {
         $$0.a("Name", tf.a.a(this.c));
      }

      return $$0;
   }

   public String f() {
      return "banner-" + this.a.u() + "," + this.a.v() + "," + this.a.w();
   }
}
