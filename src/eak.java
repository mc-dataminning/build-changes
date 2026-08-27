import com.google.common.base.Preconditions;

public class eak {
   private static final eak[] am = new eak[64];
   public static final eak a = new eak(0, 0);
   public static final eak b = new eak(1, 8368696);
   public static final eak c = new eak(2, 16247203);
   public static final eak d = new eak(3, 13092807);
   public static final eak e = new eak(4, 16711680);
   public static final eak f = new eak(5, 10526975);
   public static final eak g = new eak(6, 10987431);
   public static final eak h = new eak(7, 31744);
   public static final eak i = new eak(8, 16777215);
   public static final eak j = new eak(9, 10791096);
   public static final eak k = new eak(10, 9923917);
   public static final eak l = new eak(11, 7368816);
   public static final eak m = new eak(12, 4210943);
   public static final eak n = new eak(13, 9402184);
   public static final eak o = new eak(14, 16776437);
   public static final eak p = new eak(15, 14188339);
   public static final eak q = new eak(16, 11685080);
   public static final eak r = new eak(17, 6724056);
   public static final eak s = new eak(18, 15066419);
   public static final eak t = new eak(19, 8375321);
   public static final eak u = new eak(20, 15892389);
   public static final eak v = new eak(21, 5000268);
   public static final eak w = new eak(22, 10066329);
   public static final eak x = new eak(23, 5013401);
   public static final eak y = new eak(24, 8339378);
   public static final eak z = new eak(25, 3361970);
   public static final eak A = new eak(26, 6704179);
   public static final eak B = new eak(27, 6717235);
   public static final eak C = new eak(28, 10040115);
   public static final eak D = new eak(29, 1644825);
   public static final eak E = new eak(30, 16445005);
   public static final eak F = new eak(31, 6085589);
   public static final eak G = new eak(32, 4882687);
   public static final eak H = new eak(33, 55610);
   public static final eak I = new eak(34, 8476209);
   public static final eak J = new eak(35, 7340544);
   public static final eak K = new eak(36, 13742497);
   public static final eak L = new eak(37, 10441252);
   public static final eak M = new eak(38, 9787244);
   public static final eak N = new eak(39, 7367818);
   public static final eak O = new eak(40, 12223780);
   public static final eak P = new eak(41, 6780213);
   public static final eak Q = new eak(42, 10505550);
   public static final eak R = new eak(43, 3746083);
   public static final eak S = new eak(44, 8874850);
   public static final eak T = new eak(45, 5725276);
   public static final eak U = new eak(46, 8014168);
   public static final eak V = new eak(47, 4996700);
   public static final eak W = new eak(48, 4993571);
   public static final eak X = new eak(49, 5001770);
   public static final eak Y = new eak(50, 9321518);
   public static final eak Z = new eak(51, 2430480);
   public static final eak aa = new eak(52, 12398641);
   public static final eak ab = new eak(53, 9715553);
   public static final eak ac = new eak(54, 6035741);
   public static final eak ad = new eak(55, 1474182);
   public static final eak ae = new eak(56, 3837580);
   public static final eak af = new eak(57, 5647422);
   public static final eak ag = new eak(58, 1356933);
   public static final eak ah = new eak(59, 6579300);
   public static final eak ai = new eak(60, 14200723);
   public static final eak aj = new eak(61, 8365974);
   public final int ak;
   public final int al;

   private eak(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(eak.a $$0) {
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

   public static eak a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static eak c(int $$0) {
      eak $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(eak.a.b($$1 & 3));
   }

   public byte b(eak.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final eak.a[] g = new eak.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static eak.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static eak.a b(int $$0) {
         return g[$$0];
      }
   }
}
