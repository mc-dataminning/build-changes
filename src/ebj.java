import java.util.Objects;
import javax.annotation.Nullable;

public class ebj {
   private final gu a;
   private final chm b;
   @Nullable
   private final tf c;

   public ebj(gu $$0, chm $$1, @Nullable tf $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public static ebj a(qr $$0) {
      gu $$1 = rd.b($$0.p("Pos"));
      chm $$2 = chm.a($$0.l("Color"), chm.a);
      tf $$3 = $$0.e("Name") ? tf.a.a($$0.l("Name")) : null;
      return new ebj($$1, $$2, $$3);
   }

   @Nullable
   public static ebj a(cos $$0, gu $$1) {
      if ($$0.c_($$1) instanceof dcc $$3) {
         chm $$4 = $$3.g();
         tf $$5 = $$3.ac() ? $$3.ad() : null;
         return new ebj($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public gu a() {
      return this.a;
   }

   public chm b() {
      return this.b;
   }

   public ebk.a c() {
      switch (this.b) {
         case a:
            return ebk.a.k;
         case b:
            return ebk.a.l;
         case c:
            return ebk.a.m;
         case d:
            return ebk.a.n;
         case e:
            return ebk.a.o;
         case f:
            return ebk.a.p;
         case g:
            return ebk.a.q;
         case h:
            return ebk.a.r;
         case i:
            return ebk.a.s;
         case j:
            return ebk.a.t;
         case k:
            return ebk.a.u;
         case l:
            return ebk.a.v;
         case m:
            return ebk.a.w;
         case n:
            return ebk.a.x;
         case o:
            return ebk.a.y;
         case p:
         default:
            return ebk.a.z;
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
         ebj $$1 = (ebj)$$0;
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
