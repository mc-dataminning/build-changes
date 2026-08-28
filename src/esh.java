import javax.annotation.Nullable;

public class esh {
   private final deo a;
   @Nullable
   private final esg b;
   private final jh c;
   private final jh.a d = new jh.a();

   public esh(deo $$0, bvg $$1) {
      this.a = $$0;
      if ($$1.dY() instanceof arq $$2) {
         this.b = $$2.H();
      } else {
         this.b = null;
      }

      this.c = $$1.dy();
   }

   public esf a(int $$0, int $$1, int $$2) {
      jh $$3 = this.d.d($$0, $$1, $$2);
      return this.b == null ? esk.b(this.a, $$3) : this.b.a(this.a, $$3);
   }

   public dvo a(jh $$0) {
      return this.a.a_($$0);
   }

   public deo a() {
      return this.a;
   }

   public jh b() {
      return this.c;
   }
}
