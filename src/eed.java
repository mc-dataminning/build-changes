import com.google.common.base.Preconditions;

public class eed {
   private static final eed[] am = new eed[64];
   public static final eed a = new eed(0, 0);
   public static final eed b = new eed(1, 8368696);
   public static final eed c = new eed(2, 16247203);
   public static final eed d = new eed(3, 13092807);
   public static final eed e = new eed(4, 16711680);
   public static final eed f = new eed(5, 10526975);
   public static final eed g = new eed(6, 10987431);
   public static final eed h = new eed(7, 31744);
   public static final eed i = new eed(8, 16777215);
   public static final eed j = new eed(9, 10791096);
   public static final eed k = new eed(10, 9923917);
   public static final eed l = new eed(11, 7368816);
   public static final eed m = new eed(12, 4210943);
   public static final eed n = new eed(13, 9402184);
   public static final eed o = new eed(14, 16776437);
   public static final eed p = new eed(15, 14188339);
   public static final eed q = new eed(16, 11685080);
   public static final eed r = new eed(17, 6724056);
   public static final eed s = new eed(18, 15066419);
   public static final eed t = new eed(19, 8375321);
   public static final eed u = new eed(20, 15892389);
   public static final eed v = new eed(21, 5000268);
   public static final eed w = new eed(22, 10066329);
   public static final eed x = new eed(23, 5013401);
   public static final eed y = new eed(24, 8339378);
   public static final eed z = new eed(25, 3361970);
   public static final eed A = new eed(26, 6704179);
   public static final eed B = new eed(27, 6717235);
   public static final eed C = new eed(28, 10040115);
   public static final eed D = new eed(29, 1644825);
   public static final eed E = new eed(30, 16445005);
   public static final eed F = new eed(31, 6085589);
   public static final eed G = new eed(32, 4882687);
   public static final eed H = new eed(33, 55610);
   public static final eed I = new eed(34, 8476209);
   public static final eed J = new eed(35, 7340544);
   public static final eed K = new eed(36, 13742497);
   public static final eed L = new eed(37, 10441252);
   public static final eed M = new eed(38, 9787244);
   public static final eed N = new eed(39, 7367818);
   public static final eed O = new eed(40, 12223780);
   public static final eed P = new eed(41, 6780213);
   public static final eed Q = new eed(42, 10505550);
   public static final eed R = new eed(43, 3746083);
   public static final eed S = new eed(44, 8874850);
   public static final eed T = new eed(45, 5725276);
   public static final eed U = new eed(46, 8014168);
   public static final eed V = new eed(47, 4996700);
   public static final eed W = new eed(48, 4993571);
   public static final eed X = new eed(49, 5001770);
   public static final eed Y = new eed(50, 9321518);
   public static final eed Z = new eed(51, 2430480);
   public static final eed aa = new eed(52, 12398641);
   public static final eed ab = new eed(53, 9715553);
   public static final eed ac = new eed(54, 6035741);
   public static final eed ad = new eed(55, 1474182);
   public static final eed ae = new eed(56, 3837580);
   public static final eed af = new eed(57, 5647422);
   public static final eed ag = new eed(58, 1356933);
   public static final eed ah = new eed(59, 6579300);
   public static final eed ai = new eed(60, 14200723);
   public static final eed aj = new eed(61, 8365974);
   public final int ak;
   public final int al;

   private eed(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(eed.a $$0) {
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

   public static eed a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static eed c(int $$0) {
      eed $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(eed.a.b($$1 & 3));
   }

   public byte b(eed.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final eed.a[] g = new eed.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static eed.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static eed.a b(int $$0) {
         return g[$$0];
      }
   }
}
