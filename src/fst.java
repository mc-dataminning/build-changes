public class fst extends ftr {
   private static final int a = 8;
   private static final int b = 210;
   private static final xk c = xk.c("credits_and_attribution.screen.title");
   private static final xk d = xk.c("credits_and_attribution.button.credits");
   private static final xk s = xk.c("credits_and_attribution.button.attribution");
   private static final xk u = xk.c("credits_and_attribution.button.licenses");
   private final ftr v;
   private final frn w = new frn(this);

   public fst(ftr $$0) {
      super(c);
      this.v = $$0;
   }

   @Override
   protected void aT_() {
      this.w.a(c, this.p);
      frr $$0 = this.w.c(frr.d()).a(8);
      $$0.c().b();
      $$0.a(fny.a(d, $$0x -> this.l()).a(210).a());
      $$0.a(fny.a(s, fso.b(this, ayq.d)).a(210).a());
      $$0.a(fny.a(u, fso.b(this, ayq.e)).a(210).a());
      this.w.b(fny.a(xj.d, $$0x -> this.aP_()).a(200).a());
      this.w.a();
      this.w.a(this::c);
   }

   @Override
   protected void c() {
      this.w.a();
   }

   private void l() {
      this.m.a(new ftu(false, () -> this.m.a(this)));
   }

   @Override
   public void aP_() {
      this.m.a(this.v);
   }
}
