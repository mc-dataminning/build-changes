public enum atf {
   a("old"),
   b("new"),
   c("compatible");

   private final wx d;
   private final wx e;

   private atf(String $$0) {
      this.d = wx.c("pack.incompatible." + $$0).a(n.h);
      this.e = wx.c("pack.incompatible.confirm." + $$0);
   }

   public boolean a() {
      return this == c;
   }

   public static atf a(axw<Integer> $$0, int $$1) {
      if ($$0.b() < $$1) {
         return a;
      } else {
         return $$1 < $$0.a() ? b : c;
      }
   }

   public wx b() {
      return this.d;
   }

   public wx c() {
      return this.e;
   }
}
