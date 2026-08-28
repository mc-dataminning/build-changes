import com.google.common.base.Preconditions;

public class etd {
   private static final etd[] am = new etd[64];
   public static final etd a = new etd(0, 0);
   public static final etd b = new etd(1, 8368696);
   public static final etd c = new etd(2, 16247203);
   public static final etd d = new etd(3, 13092807);
   public static final etd e = new etd(4, 16711680);
   public static final etd f = new etd(5, 10526975);
   public static final etd g = new etd(6, 10987431);
   public static final etd h = new etd(7, 31744);
   public static final etd i = new etd(8, 16777215);
   public static final etd j = new etd(9, 10791096);
   public static final etd k = new etd(10, 9923917);
   public static final etd l = new etd(11, 7368816);
   public static final etd m = new etd(12, 4210943);
   public static final etd n = new etd(13, 9402184);
   public static final etd o = new etd(14, 16776437);
   public static final etd p = new etd(15, 14188339);
   public static final etd q = new etd(16, 11685080);
   public static final etd r = new etd(17, 6724056);
   public static final etd s = new etd(18, 15066419);
   public static final etd t = new etd(19, 8375321);
   public static final etd u = new etd(20, 15892389);
   public static final etd v = new etd(21, 5000268);
   public static final etd w = new etd(22, 10066329);
   public static final etd x = new etd(23, 5013401);
   public static final etd y = new etd(24, 8339378);
   public static final etd z = new etd(25, 3361970);
   public static final etd A = new etd(26, 6704179);
   public static final etd B = new etd(27, 6717235);
   public static final etd C = new etd(28, 10040115);
   public static final etd D = new etd(29, 1644825);
   public static final etd E = new etd(30, 16445005);
   public static final etd F = new etd(31, 6085589);
   public static final etd G = new etd(32, 4882687);
   public static final etd H = new etd(33, 55610);
   public static final etd I = new etd(34, 8476209);
   public static final etd J = new etd(35, 7340544);
   public static final etd K = new etd(36, 13742497);
   public static final etd L = new etd(37, 10441252);
   public static final etd M = new etd(38, 9787244);
   public static final etd N = new etd(39, 7367818);
   public static final etd O = new etd(40, 12223780);
   public static final etd P = new etd(41, 6780213);
   public static final etd Q = new etd(42, 10505550);
   public static final etd R = new etd(43, 3746083);
   public static final etd S = new etd(44, 8874850);
   public static final etd T = new etd(45, 5725276);
   public static final etd U = new etd(46, 8014168);
   public static final etd V = new etd(47, 4996700);
   public static final etd W = new etd(48, 4993571);
   public static final etd X = new etd(49, 5001770);
   public static final etd Y = new etd(50, 9321518);
   public static final etd Z = new etd(51, 2430480);
   public static final etd aa = new etd(52, 12398641);
   public static final etd ab = new etd(53, 9715553);
   public static final etd ac = new etd(54, 6035741);
   public static final etd ad = new etd(55, 1474182);
   public static final etd ae = new etd(56, 3837580);
   public static final etd af = new etd(57, 5647422);
   public static final etd ag = new etd(58, 1356933);
   public static final etd ah = new etd(59, 6579300);
   public static final etd ai = new etd(60, 14200723);
   public static final etd aj = new etd(61, 8365974);
   public final int ak;
   public final int al;

   private etd(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(etd.a $$0) {
      return this == a ? 0 : axk.b(axk.f(this.ak), $$0.f);
   }

   public static etd a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static etd c(int $$0) {
      etd $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(etd.a.b($$1 & 3));
   }

   public byte b(etd.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final etd.a[] g = new etd.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(final int $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static etd.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static etd.a b(int $$0) {
         return g[$$0];
      }
   }
}
