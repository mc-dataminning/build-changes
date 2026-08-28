import javax.annotation.Nullable;

public class eyt {
   private final djr a;
   @Nullable
   private final eys b;
   private final iw c;
   private final iw.a d = new iw.a();

   public eyt(djr $$0, byh $$1) {
      this.a = $$0;
      if ($$1.dV() instanceof asb $$2) {
         this.b = $$2.I();
      } else {
         this.b = null;
      }

      this.c = $$1.dv();
   }

   public eyr a(int $$0, int $$1, int $$2) {
      iw $$3 = this.d.d($$0, $$1, $$2);
      return this.b == null ? eyw.b(this.a, $$3) : this.b.a(this.a, $$3);
   }

   public ebq a(iw $$0) {
      return this.a.a_($$0);
   }

   public djr a() {
      return this.a;
   }

   public iw b() {
      return this.c;
   }
}
