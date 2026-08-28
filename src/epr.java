import javax.annotation.Nullable;

public class epr {
   private final dce a;
   @Nullable
   private final epq b;
   private final jd c;
   private final jd.a d = new jd.a();

   public epr(dce $$0, btn $$1) {
      this.a = $$0;
      if ($$1.dQ() instanceof aqt $$2) {
         this.b = $$2.H();
      } else {
         this.b = null;
      }

      this.c = $$1.dq();
   }

   public epp a(int $$0, int $$1, int $$2) {
      jd $$3 = this.d.d($$0, $$1, $$2);
      return this.b == null ? epu.b(this.a, $$3) : this.b.a(this.a, $$3);
   }

   public dta a(jd $$0) {
      return this.a.a_($$0);
   }

   public dce a() {
      return this.a;
   }

   public jd b() {
      return this.c;
   }
}
