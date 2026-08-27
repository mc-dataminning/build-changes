public class bxe extends bvu {
   private final bpf a;

   public bxe(bpf $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.aC() && !this.a.dJ().b_(this.a.dj()).a(auj.a);
   }

   @Override
   public void c() {
      ib $$0 = null;

      for (ib $$2 : ib.b(
         awm.a(this.a.do() - 2.0), awm.a(this.a.dq() - 2.0), awm.a(this.a.du() - 2.0), awm.a(this.a.do() + 2.0), this.a.dp(), awm.a(this.a.du() + 2.0)
      )) {
         if (this.a.dJ().b_($$2).a(auj.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.K().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
