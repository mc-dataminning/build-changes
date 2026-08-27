public class fbh extends gty {
   private static final wx a = wx.c("mco.client.incompatible.title").b(-65536);
   private static final wx b = wx.b(aa.b().c()).b(-65536);
   private static final wx c = wx.a("mco.client.unsupported.snapshot.version", b);
   private static final wx B = wx.a("mco.client.outdated.stable.version", b);
   private final fly C;
   private final fjm D = new fjm(this);

   public fbh(fly $$0) {
      super(a);
      this.C = $$0;
   }

   @Override
   public void aM_() {
      this.D.a(a, this.p);
      this.D.c(new fgt(this.C(), this.p).b(true));
      this.D.b(ffz.a(ww.k, $$0 -> this.d()).a(200).a());
      this.D.a($$1 -> {
         ffx var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.D.a();
   }

   @Override
   public void d() {
      this.m.a(this.C);
   }

   private wx C() {
      return aa.b().g() ? B : c;
   }
}
