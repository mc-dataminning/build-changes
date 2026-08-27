import java.util.Objects;
import javax.annotation.Nullable;

public class ehv {
   private final hz a;
   private final cnn b;
   @Nullable
   private final vq c;

   public ehv(hz $$0, cnn $$1, @Nullable vq $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public static ehv a(sw $$0) {
      hz $$1 = tl.b($$0.p("Pos"));
      cnn $$2 = cnn.a($$0.l("Color"), cnn.a);
      vq $$3 = $$0.e("Name") ? vq.a.a($$0.l("Name")) : null;
      return new ehv($$1, $$2, $$3);
   }

   @Nullable
   public static ehv a(cut $$0, hz $$1) {
      if ($$0.c_($$1) instanceof dij $$3) {
         cnn $$4 = $$3.g();
         vq $$5 = $$3.ae() ? $$3.af() : null;
         return new ehv($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public hz a() {
      return this.a;
   }

   public cnn b() {
      return this.b;
   }

   public ehw.a c() {
      switch (this.b) {
         case a:
            return ehw.a.k;
         case b:
            return ehw.a.l;
         case c:
            return ehw.a.m;
         case d:
            return ehw.a.n;
         case e:
            return ehw.a.o;
         case f:
            return ehw.a.p;
         case g:
            return ehw.a.q;
         case h:
            return ehw.a.r;
         case i:
            return ehw.a.s;
         case j:
            return ehw.a.t;
         case k:
            return ehw.a.u;
         case l:
            return ehw.a.v;
         case m:
            return ehw.a.w;
         case n:
            return ehw.a.x;
         case o:
            return ehw.a.y;
         case p:
         default:
            return ehw.a.z;
      }
   }

   @Nullable
   public vq d() {
      return this.c;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         ehv $$1 = (ehv)$$0;
         return Objects.equals(this.a, $$1.a) && this.b == $$1.b && Objects.equals(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b, this.c);
   }

   public sw e() {
      sw $$0 = new sw();
      $$0.a("Pos", tl.a(this.a));
      $$0.a("Color", this.b.b());
      if (this.c != null) {
         $$0.a("Name", vq.a.a(this.c));
      }

      return $$0;
   }

   public String f() {
      return "banner-" + this.a.u() + "," + this.a.v() + "," + this.a.w();
   }
}
