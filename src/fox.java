public class fox extends fpb {
   private static final wx b = wx.c("title.32bit.deprecation.realms.header").a(n.r);
   private static final wx c = wx.c("title.32bit.deprecation.realms");
   private static final wx d = wx.c("title.32bit.deprecation.realms.check");
   private static final wx r = b.f().f("\n").b(c);
   private final fly s;

   public fox(fly $$0) {
      super(b, c, d, r);
      this.s = $$0;
   }

   @Override
   protected fjn m() {
      fjq $$0 = fjq.e().a(8);
      $$0.a(ffz.a(ww.d, $$0x -> {
         if (this.a.a()) {
            this.m.m.w = true;
            this.m.m.av();
         }

         this.m.a(this.s);
      }).a());
      return $$0;
   }
}
