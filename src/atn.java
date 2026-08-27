public class atn {
   private static final int h = 20;
   private static final int i = 600;
   private static final int j = 12000;
   private static final int k = 24000;
   private static final int l = 6000;
   public static final atm a = new atm(atp.px, 20, 600, true);
   public static final atm b = new atm(atp.pc, 12000, 24000, false);
   public static final atm c = new atm(atp.pd, 0, 0, true);
   public static final atm d = new atm(atp.pu, 0, 0, true);
   public static final atm e = new atm(atp.pv, 6000, 24000, true);
   public static final atm f = a(atp.pW);
   public static final atm g = a(atp.pw);

   public static atm a(il<ato> $$0) {
      return new atm($$0, 12000, 24000, false);
   }
}
