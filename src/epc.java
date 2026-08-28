import com.google.common.base.Preconditions;

public class epc {
   private static final epc[] am = new epc[64];
   public static final epc a = new epc(0, 0);
   public static final epc b = new epc(1, 8368696);
   public static final epc c = new epc(2, 16247203);
   public static final epc d = new epc(3, 13092807);
   public static final epc e = new epc(4, 16711680);
   public static final epc f = new epc(5, 10526975);
   public static final epc g = new epc(6, 10987431);
   public static final epc h = new epc(7, 31744);
   public static final epc i = new epc(8, 16777215);
   public static final epc j = new epc(9, 10791096);
   public static final epc k = new epc(10, 9923917);
   public static final epc l = new epc(11, 7368816);
   public static final epc m = new epc(12, 4210943);
   public static final epc n = new epc(13, 9402184);
   public static final epc o = new epc(14, 16776437);
   public static final epc p = new epc(15, 14188339);
   public static final epc q = new epc(16, 11685080);
   public static final epc r = new epc(17, 6724056);
   public static final epc s = new epc(18, 15066419);
   public static final epc t = new epc(19, 8375321);
   public static final epc u = new epc(20, 15892389);
   public static final epc v = new epc(21, 5000268);
   public static final epc w = new epc(22, 10066329);
   public static final epc x = new epc(23, 5013401);
   public static final epc y = new epc(24, 8339378);
   public static final epc z = new epc(25, 3361970);
   public static final epc A = new epc(26, 6704179);
   public static final epc B = new epc(27, 6717235);
   public static final epc C = new epc(28, 10040115);
   public static final epc D = new epc(29, 1644825);
   public static final epc E = new epc(30, 16445005);
   public static final epc F = new epc(31, 6085589);
   public static final epc G = new epc(32, 4882687);
   public static final epc H = new epc(33, 55610);
   public static final epc I = new epc(34, 8476209);
   public static final epc J = new epc(35, 7340544);
   public static final epc K = new epc(36, 13742497);
   public static final epc L = new epc(37, 10441252);
   public static final epc M = new epc(38, 9787244);
   public static final epc N = new epc(39, 7367818);
   public static final epc O = new epc(40, 12223780);
   public static final epc P = new epc(41, 6780213);
   public static final epc Q = new epc(42, 10505550);
   public static final epc R = new epc(43, 3746083);
   public static final epc S = new epc(44, 8874850);
   public static final epc T = new epc(45, 5725276);
   public static final epc U = new epc(46, 8014168);
   public static final epc V = new epc(47, 4996700);
   public static final epc W = new epc(48, 4993571);
   public static final epc X = new epc(49, 5001770);
   public static final epc Y = new epc(50, 9321518);
   public static final epc Z = new epc(51, 2430480);
   public static final epc aa = new epc(52, 12398641);
   public static final epc ab = new epc(53, 9715553);
   public static final epc ac = new epc(54, 6035741);
   public static final epc ad = new epc(55, 1474182);
   public static final epc ae = new epc(56, 3837580);
   public static final epc af = new epc(57, 5647422);
   public static final epc ag = new epc(58, 1356933);
   public static final epc ah = new epc(59, 6579300);
   public static final epc ai = new epc(60, 14200723);
   public static final epc aj = new epc(61, 8365974);
   public final int ak;
   public final int al;

   private epc(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(epc.a $$0) {
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

   public static epc a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static epc c(int $$0) {
      epc $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(epc.a.b($$1 & 3));
   }

   public byte b(epc.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final epc.a[] g = new epc.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(final int $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static epc.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static epc.a b(int $$0) {
         return g[$$0];
      }
   }
}
