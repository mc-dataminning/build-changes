import javax.annotation.Nullable;

public class eso {
   private final dev a;
   @Nullable
   private final esn b;
   private final jh c;
   private final jh.a d = new jh.a();

   public eso(dev $$0, bvj $$1) {
      this.a = $$0;
      if ($$1.dV() instanceof arp $$2) {
         this.b = $$2.H();
      } else {
         this.b = null;
      }

      this.c = $$1.dv();
   }

   public esm a(int $$0, int $$1, int $$2) {
      jh $$3 = this.d.d($$0, $$1, $$2);
      return this.b == null ? esr.b(this.a, $$3) : this.b.a(this.a, $$3);
   }

   public dvv a(jh $$0) {
      return this.a.a_($$0);
   }

   public dev a() {
      return this.a;
   }

   public jh b() {
      return this.c;
   }
}
