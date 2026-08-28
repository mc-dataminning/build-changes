import com.google.common.base.Preconditions;

public class exu {
   private static final exu[] am = new exu[64];
   public static final exu a = new exu(0, 0);
   public static final exu b = new exu(1, 8368696);
   public static final exu c = new exu(2, 16247203);
   public static final exu d = new exu(3, 13092807);
   public static final exu e = new exu(4, 16711680);
   public static final exu f = new exu(5, 10526975);
   public static final exu g = new exu(6, 10987431);
   public static final exu h = new exu(7, 31744);
   public static final exu i = new exu(8, 16777215);
   public static final exu j = new exu(9, 10791096);
   public static final exu k = new exu(10, 9923917);
   public static final exu l = new exu(11, 7368816);
   public static final exu m = new exu(12, 4210943);
   public static final exu n = new exu(13, 9402184);
   public static final exu o = new exu(14, 16776437);
   public static final exu p = new exu(15, 14188339);
   public static final exu q = new exu(16, 11685080);
   public static final exu r = new exu(17, 6724056);
   public static final exu s = new exu(18, 15066419);
   public static final exu t = new exu(19, 8375321);
   public static final exu u = new exu(20, 15892389);
   public static final exu v = new exu(21, 5000268);
   public static final exu w = new exu(22, 10066329);
   public static final exu x = new exu(23, 5013401);
   public static final exu y = new exu(24, 8339378);
   public static final exu z = new exu(25, 3361970);
   public static final exu A = new exu(26, 6704179);
   public static final exu B = new exu(27, 6717235);
   public static final exu C = new exu(28, 10040115);
   public static final exu D = new exu(29, 1644825);
   public static final exu E = new exu(30, 16445005);
   public static final exu F = new exu(31, 6085589);
   public static final exu G = new exu(32, 4882687);
   public static final exu H = new exu(33, 55610);
   public static final exu I = new exu(34, 8476209);
   public static final exu J = new exu(35, 7340544);
   public static final exu K = new exu(36, 13742497);
   public static final exu L = new exu(37, 10441252);
   public static final exu M = new exu(38, 9787244);
   public static final exu N = new exu(39, 7367818);
   public static final exu O = new exu(40, 12223780);
   public static final exu P = new exu(41, 6780213);
   public static final exu Q = new exu(42, 10505550);
   public static final exu R = new exu(43, 3746083);
   public static final exu S = new exu(44, 8874850);
   public static final exu T = new exu(45, 5725276);
   public static final exu U = new exu(46, 8014168);
   public static final exu V = new exu(47, 4996700);
   public static final exu W = new exu(48, 4993571);
   public static final exu X = new exu(49, 5001770);
   public static final exu Y = new exu(50, 9321518);
   public static final exu Z = new exu(51, 2430480);
   public static final exu aa = new exu(52, 12398641);
   public static final exu ab = new exu(53, 9715553);
   public static final exu ac = new exu(54, 6035741);
   public static final exu ad = new exu(55, 1474182);
   public static final exu ae = new exu(56, 3837580);
   public static final exu af = new exu(57, 5647422);
   public static final exu ag = new exu(58, 1356933);
   public static final exu ah = new exu(59, 6579300);
   public static final exu ai = new exu(60, 14200723);
   public static final exu aj = new exu(61, 8365974);
   public final int ak;
   public final int al;

   private exu(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(exu.a $$0) {
      return this == a ? 0 : aya.b(aya.f(this.ak), $$0.f);
   }

   public static exu a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static exu c(int $$0) {
      exu $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(exu.a.b($$1 & 3));
   }

   public byte b(exu.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final exu.a[] g = new exu.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(final int $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static exu.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static exu.a b(int $$0) {
         return g[$$0];
      }
   }
}
