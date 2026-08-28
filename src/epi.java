import com.google.common.base.Preconditions;

public class epi {
   private static final epi[] am = new epi[64];
   public static final epi a = new epi(0, 0);
   public static final epi b = new epi(1, 8368696);
   public static final epi c = new epi(2, 16247203);
   public static final epi d = new epi(3, 13092807);
   public static final epi e = new epi(4, 16711680);
   public static final epi f = new epi(5, 10526975);
   public static final epi g = new epi(6, 10987431);
   public static final epi h = new epi(7, 31744);
   public static final epi i = new epi(8, 16777215);
   public static final epi j = new epi(9, 10791096);
   public static final epi k = new epi(10, 9923917);
   public static final epi l = new epi(11, 7368816);
   public static final epi m = new epi(12, 4210943);
   public static final epi n = new epi(13, 9402184);
   public static final epi o = new epi(14, 16776437);
   public static final epi p = new epi(15, 14188339);
   public static final epi q = new epi(16, 11685080);
   public static final epi r = new epi(17, 6724056);
   public static final epi s = new epi(18, 15066419);
   public static final epi t = new epi(19, 8375321);
   public static final epi u = new epi(20, 15892389);
   public static final epi v = new epi(21, 5000268);
   public static final epi w = new epi(22, 10066329);
   public static final epi x = new epi(23, 5013401);
   public static final epi y = new epi(24, 8339378);
   public static final epi z = new epi(25, 3361970);
   public static final epi A = new epi(26, 6704179);
   public static final epi B = new epi(27, 6717235);
   public static final epi C = new epi(28, 10040115);
   public static final epi D = new epi(29, 1644825);
   public static final epi E = new epi(30, 16445005);
   public static final epi F = new epi(31, 6085589);
   public static final epi G = new epi(32, 4882687);
   public static final epi H = new epi(33, 55610);
   public static final epi I = new epi(34, 8476209);
   public static final epi J = new epi(35, 7340544);
   public static final epi K = new epi(36, 13742497);
   public static final epi L = new epi(37, 10441252);
   public static final epi M = new epi(38, 9787244);
   public static final epi N = new epi(39, 7367818);
   public static final epi O = new epi(40, 12223780);
   public static final epi P = new epi(41, 6780213);
   public static final epi Q = new epi(42, 10505550);
   public static final epi R = new epi(43, 3746083);
   public static final epi S = new epi(44, 8874850);
   public static final epi T = new epi(45, 5725276);
   public static final epi U = new epi(46, 8014168);
   public static final epi V = new epi(47, 4996700);
   public static final epi W = new epi(48, 4993571);
   public static final epi X = new epi(49, 5001770);
   public static final epi Y = new epi(50, 9321518);
   public static final epi Z = new epi(51, 2430480);
   public static final epi aa = new epi(52, 12398641);
   public static final epi ab = new epi(53, 9715553);
   public static final epi ac = new epi(54, 6035741);
   public static final epi ad = new epi(55, 1474182);
   public static final epi ae = new epi(56, 3837580);
   public static final epi af = new epi(57, 5647422);
   public static final epi ag = new epi(58, 1356933);
   public static final epi ah = new epi(59, 6579300);
   public static final epi ai = new epi(60, 14200723);
   public static final epi aj = new epi(61, 8365974);
   public final int ak;
   public final int al;

   private epi(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(epi.a $$0) {
      if (this == a) {
         return 0;
      } else {
         int $$1 = $$0.f;
         int $$2 = (this.ak >> 16 & 0xFF) * $$1 / 255;
         int $$3 = (this.ak >> 8 & 0xFF) * $$1 / 255;
         int $$4 = (this.ak & 0xFF) * $$1 / 255;
         return 0xFF000000 | $$4 << 16 | $$3 << 8 | $$2;
      }
   }

   public static epi a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static epi c(int $$0) {
      epi $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(epi.a.b($$1 & 3));
   }

   public byte b(epi.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final epi.a[] g = new epi.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(final int $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static epi.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static epi.a b(int $$0) {
         return g[$$0];
      }
   }
}
