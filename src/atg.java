public enum atg {
   a("old"),
   b("new"),
   c("compatible");

   private final wx d;
   private final wx e;

   private atg(String $$0) {
      this.d = wx.c("pack.incompatible." + $$0).a(n.h);
      this.e = wx.c("pack.incompatible.confirm." + $$0);
   }

   public boolean a() {
      return this == c;
   }

   public static atg a(axx<Integer> $$0, int $$1) {
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
