import java.util.Objects;
import javax.annotation.Nullable;

public class eck {
   private final ht a;
   private final cix b;
   @Nullable
   private final ui c;

   public eck(ht $$0, cix $$1, @Nullable ui $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public static eck a(rt $$0) {
      ht $$1 = sg.b($$0.p("Pos"));
      cix $$2 = cix.a($$0.l("Color"), cix.a);
      ui $$3 = $$0.e("Name") ? ui.a.a($$0.l("Name")) : null;
      return new eck($$1, $$2, $$3);
   }

   @Nullable
   public static eck a(cqf $$0, ht $$1) {
      if ($$0.c_($$1) instanceof ddn $$3) {
         cix $$4 = $$3.g();
         ui $$5 = $$3.ac() ? $$3.ad() : null;
         return new eck($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public ht a() {
      return this.a;
   }

   public cix b() {
      return this.b;
   }

   public ecl.a c() {
      switch (this.b) {
         case a:
            return ecl.a.k;
         case b:
            return ecl.a.l;
         case c:
            return ecl.a.m;
         case d:
            return ecl.a.n;
         case e:
            return ecl.a.o;
         case f:
            return ecl.a.p;
         case g:
            return ecl.a.q;
         case h:
            return ecl.a.r;
         case i:
            return ecl.a.s;
         case j:
            return ecl.a.t;
         case k:
            return ecl.a.u;
         case l:
            return ecl.a.v;
         case m:
            return ecl.a.w;
         case n:
            return ecl.a.x;
         case o:
            return ecl.a.y;
         case p:
         default:
            return ecl.a.z;
      }
   }

   @Nullable
   public ui d() {
      return this.c;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         eck $$1 = (eck)$$0;
         return Objects.equals(this.a, $$1.a) && this.b == $$1.b && Objects.equals(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b, this.c);
   }

   public rt e() {
      rt $$0 = new rt();
      $$0.a("Pos", sg.a(this.a));
      $$0.a("Color", this.b.b());
      if (this.c != null) {
         $$0.a("Name", ui.a.a(this.c));
      }

      return $$0;
   }

   public String f() {
      return "banner-" + this.a.u() + "," + this.a.v() + "," + this.a.w();
   }
}
