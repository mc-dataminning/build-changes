import com.google.common.base.Preconditions;

public class eck {
   private static final eck[] am = new eck[64];
   public static final eck a = new eck(0, 0);
   public static final eck b = new eck(1, 8368696);
   public static final eck c = new eck(2, 16247203);
   public static final eck d = new eck(3, 13092807);
   public static final eck e = new eck(4, 16711680);
   public static final eck f = new eck(5, 10526975);
   public static final eck g = new eck(6, 10987431);
   public static final eck h = new eck(7, 31744);
   public static final eck i = new eck(8, 16777215);
   public static final eck j = new eck(9, 10791096);
   public static final eck k = new eck(10, 9923917);
   public static final eck l = new eck(11, 7368816);
   public static final eck m = new eck(12, 4210943);
   public static final eck n = new eck(13, 9402184);
   public static final eck o = new eck(14, 16776437);
   public static final eck p = new eck(15, 14188339);
   public static final eck q = new eck(16, 11685080);
   public static final eck r = new eck(17, 6724056);
   public static final eck s = new eck(18, 15066419);
   public static final eck t = new eck(19, 8375321);
   public static final eck u = new eck(20, 15892389);
   public static final eck v = new eck(21, 5000268);
   public static final eck w = new eck(22, 10066329);
   public static final eck x = new eck(23, 5013401);
   public static final eck y = new eck(24, 8339378);
   public static final eck z = new eck(25, 3361970);
   public static final eck A = new eck(26, 6704179);
   public static final eck B = new eck(27, 6717235);
   public static final eck C = new eck(28, 10040115);
   public static final eck D = new eck(29, 1644825);
   public static final eck E = new eck(30, 16445005);
   public static final eck F = new eck(31, 6085589);
   public static final eck G = new eck(32, 4882687);
   public static final eck H = new eck(33, 55610);
   public static final eck I = new eck(34, 8476209);
   public static final eck J = new eck(35, 7340544);
   public static final eck K = new eck(36, 13742497);
   public static final eck L = new eck(37, 10441252);
   public static final eck M = new eck(38, 9787244);
   public static final eck N = new eck(39, 7367818);
   public static final eck O = new eck(40, 12223780);
   public static final eck P = new eck(41, 6780213);
   public static final eck Q = new eck(42, 10505550);
   public static final eck R = new eck(43, 3746083);
   public static final eck S = new eck(44, 8874850);
   public static final eck T = new eck(45, 5725276);
   public static final eck U = new eck(46, 8014168);
   public static final eck V = new eck(47, 4996700);
   public static final eck W = new eck(48, 4993571);
   public static final eck X = new eck(49, 5001770);
   public static final eck Y = new eck(50, 9321518);
   public static final eck Z = new eck(51, 2430480);
   public static final eck aa = new eck(52, 12398641);
   public static final eck ab = new eck(53, 9715553);
   public static final eck ac = new eck(54, 6035741);
   public static final eck ad = new eck(55, 1474182);
   public static final eck ae = new eck(56, 3837580);
   public static final eck af = new eck(57, 5647422);
   public static final eck ag = new eck(58, 1356933);
   public static final eck ah = new eck(59, 6579300);
   public static final eck ai = new eck(60, 14200723);
   public static final eck aj = new eck(61, 8365974);
   public final int ak;
   public final int al;

   private eck(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(eck.a $$0) {
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

   public static eck a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static eck c(int $$0) {
      eck $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(eck.a.b($$1 & 3));
   }

   public byte b(eck.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final eck.a[] g = new eck.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static eck.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static eck.a b(int $$0) {
         return g[$$0];
      }
   }
}
