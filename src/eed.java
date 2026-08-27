import java.util.Objects;
import javax.annotation.Nullable;

public class eed {
   private final hx a;
   private final ckc b;
   @Nullable
   private final uv c;

   public eed(hx $$0, ckc $$1, @Nullable uv $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public static eed a(sd $$0) {
      hx $$1 = ss.b($$0.p("Pos"));
      ckc $$2 = ckc.a($$0.l("Color"), ckc.a);
      uv $$3 = $$0.e("Name") ? uv.a.a($$0.l("Name")) : null;
      return new eed($$1, $$2, $$3);
   }

   @Nullable
   public static eed a(crl $$0, hx $$1) {
      if ($$0.c_($$1) instanceof dey $$3) {
         ckc $$4 = $$3.g();
         uv $$5 = $$3.ae() ? $$3.af() : null;
         return new eed($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public hx a() {
      return this.a;
   }

   public ckc b() {
      return this.b;
   }

   public eee.a c() {
      switch (this.b) {
         case a:
            return eee.a.k;
         case b:
            return eee.a.l;
         case c:
            return eee.a.m;
         case d:
            return eee.a.n;
         case e:
            return eee.a.o;
         case f:
            return eee.a.p;
         case g:
            return eee.a.q;
         case h:
            return eee.a.r;
         case i:
            return eee.a.s;
         case j:
            return eee.a.t;
         case k:
            return eee.a.u;
         case l:
            return eee.a.v;
         case m:
            return eee.a.w;
         case n:
            return eee.a.x;
         case o:
            return eee.a.y;
         case p:
         default:
            return eee.a.z;
      }
   }

   @Nullable
   public uv d() {
      return this.c;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         eed $$1 = (eed)$$0;
         return Objects.equals(this.a, $$1.a) && this.b == $$1.b && Objects.equals(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b, this.c);
   }

   public sd e() {
      sd $$0 = new sd();
      $$0.a("Pos", ss.a(this.a));
      $$0.a("Color", this.b.b());
      if (this.c != null) {
         $$0.a("Name", uv.a.a(this.c));
      }

      return $$0;
   }

   public String f() {
      return "banner-" + this.a.u() + "," + this.a.v() + "," + this.a.w();
   }
}
