public class fpz extends fqc {
   private static final wu b = wu.c("multiplayerWarning.header").a(n.r);
   private static final wu c = wu.c("multiplayerWarning.message");
   private static final wu q = wu.c("multiplayerWarning.check");
   private static final wu r = b.f().f("\n").b(c);
   private final fnj s;

   public fpz(fnj $$0) {
      super(b, c, q, r);
      this.s = $$0;
   }

   @Override
   protected flg m() {
      flj $$0 = flj.e().a(8);
      $$0.a(fhs.a(wt.i, $$0x -> {
         if (this.a.a()) {
            this.l.m.v = true;
            this.l.m.av();
         }

         this.l.a(new fpy(this.s));
      }).a());
      $$0.a(fhs.a(wt.k, $$0x -> this.d()).a());
      return $$0;
   }

   @Override
   public void d() {
      this.l.a(this.s);
   }
}
