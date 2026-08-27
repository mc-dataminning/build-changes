import java.util.Objects;
import javax.annotation.Nullable;

public class ebh {
   private final gv a;
   private final chk b;
   @Nullable
   private final te c;

   public ebh(gv $$0, chk $$1, @Nullable te $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public static ebh a(qs $$0) {
      gv $$1 = re.b($$0.p("Pos"));
      chk $$2 = chk.a($$0.l("Color"), chk.a);
      te $$3 = $$0.e("Name") ? te.a.a($$0.l("Name")) : null;
      return new ebh($$1, $$2, $$3);
   }

   @Nullable
   public static ebh a(coq $$0, gv $$1) {
      if ($$0.c_($$1) instanceof dca $$3) {
         chk $$4 = $$3.g();
         te $$5 = $$3.ac() ? $$3.ad() : null;
         return new ebh($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public gv a() {
      return this.a;
   }

   public chk b() {
      return this.b;
   }

   public ebi.a c() {
      switch (this.b) {
         case a:
            return ebi.a.k;
         case b:
            return ebi.a.l;
         case c:
            return ebi.a.m;
         case d:
            return ebi.a.n;
         case e:
            return ebi.a.o;
         case f:
            return ebi.a.p;
         case g:
            return ebi.a.q;
         case h:
            return ebi.a.r;
         case i:
            return ebi.a.s;
         case j:
            return ebi.a.t;
         case k:
            return ebi.a.u;
         case l:
            return ebi.a.v;
         case m:
            return ebi.a.w;
         case n:
            return ebi.a.x;
         case o:
            return ebi.a.y;
         case p:
         default:
            return ebi.a.z;
      }
   }

   @Nullable
   public te d() {
      return this.c;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         ebh $$1 = (ebh)$$0;
         return Objects.equals(this.a, $$1.a) && this.b == $$1.b && Objects.equals(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b, this.c);
   }

   public qs e() {
      qs $$0 = new qs();
      $$0.a("Pos", re.a(this.a));
      $$0.a("Color", this.b.b());
      if (this.c != null) {
         $$0.a("Name", te.a.a(this.c));
      }

      return $$0;
   }

   public String f() {
      return "banner-" + this.a.u() + "," + this.a.v() + "," + this.a.w();
   }
}
