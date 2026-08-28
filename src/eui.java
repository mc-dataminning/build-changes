import javax.annotation.Nullable;

public class eui {
   private final dgj a;
   @Nullable
   private final euh b;
   private final jh c;
   private final jh.a d = new jh.a();

   public eui(dgj $$0, bwd $$1) {
      this.a = $$0;
      if ($$1.dV() instanceof ash $$2) {
         this.b = $$2.H();
      } else {
         this.b = null;
      }

      this.c = $$1.dv();
   }

   public eug a(int $$0, int $$1, int $$2) {
      jh $$3 = this.d.d($$0, $$1, $$2);
      return this.b == null ? eul.b(this.a, $$3) : this.b.a(this.a, $$3);
   }

   public dxn a(jh $$0) {
      return this.a.a_($$0);
   }

   public dgj a() {
      return this.a;
   }

   public jh b() {
      return this.c;
   }
}
