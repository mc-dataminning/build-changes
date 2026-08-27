public class bsh extends bre {
   private final bks a;

   public bsh(bks $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.dL().N() && this.a.c(bjy.f).b() && bva.a(this.a);
   }

   @Override
   public void c() {
      ((btr)this.a.L()).d(true);
   }

   @Override
   public void d() {
      if (bva.a(this.a)) {
         ((btr)this.a.L()).d(false);
      }
   }
}
