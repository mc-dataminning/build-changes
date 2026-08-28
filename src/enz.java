import com.google.common.base.Preconditions;

public class enz {
   private static final enz[] am = new enz[64];
   public static final enz a = new enz(0, 0);
   public static final enz b = new enz(1, 8368696);
   public static final enz c = new enz(2, 16247203);
   public static final enz d = new enz(3, 13092807);
   public static final enz e = new enz(4, 16711680);
   public static final enz f = new enz(5, 10526975);
   public static final enz g = new enz(6, 10987431);
   public static final enz h = new enz(7, 31744);
   public static final enz i = new enz(8, 16777215);
   public static final enz j = new enz(9, 10791096);
   public static final enz k = new enz(10, 9923917);
   public static final enz l = new enz(11, 7368816);
   public static final enz m = new enz(12, 4210943);
   public static final enz n = new enz(13, 9402184);
   public static final enz o = new enz(14, 16776437);
   public static final enz p = new enz(15, 14188339);
   public static final enz q = new enz(16, 11685080);
   public static final enz r = new enz(17, 6724056);
   public static final enz s = new enz(18, 15066419);
   public static final enz t = new enz(19, 8375321);
   public static final enz u = new enz(20, 15892389);
   public static final enz v = new enz(21, 5000268);
   public static final enz w = new enz(22, 10066329);
   public static final enz x = new enz(23, 5013401);
   public static final enz y = new enz(24, 8339378);
   public static final enz z = new enz(25, 3361970);
   public static final enz A = new enz(26, 6704179);
   public static final enz B = new enz(27, 6717235);
   public static final enz C = new enz(28, 10040115);
   public static final enz D = new enz(29, 1644825);
   public static final enz E = new enz(30, 16445005);
   public static final enz F = new enz(31, 6085589);
   public static final enz G = new enz(32, 4882687);
   public static final enz H = new enz(33, 55610);
   public static final enz I = new enz(34, 8476209);
   public static final enz J = new enz(35, 7340544);
   public static final enz K = new enz(36, 13742497);
   public static final enz L = new enz(37, 10441252);
   public static final enz M = new enz(38, 9787244);
   public static final enz N = new enz(39, 7367818);
   public static final enz O = new enz(40, 12223780);
   public static final enz P = new enz(41, 6780213);
   public static final enz Q = new enz(42, 10505550);
   public static final enz R = new enz(43, 3746083);
   public static final enz S = new enz(44, 8874850);
   public static final enz T = new enz(45, 5725276);
   public static final enz U = new enz(46, 8014168);
   public static final enz V = new enz(47, 4996700);
   public static final enz W = new enz(48, 4993571);
   public static final enz X = new enz(49, 5001770);
   public static final enz Y = new enz(50, 9321518);
   public static final enz Z = new enz(51, 2430480);
   public static final enz aa = new enz(52, 12398641);
   public static final enz ab = new enz(53, 9715553);
   public static final enz ac = new enz(54, 6035741);
   public static final enz ad = new enz(55, 1474182);
   public static final enz ae = new enz(56, 3837580);
   public static final enz af = new enz(57, 5647422);
   public static final enz ag = new enz(58, 1356933);
   public static final enz ah = new enz(59, 6579300);
   public static final enz ai = new enz(60, 14200723);
   public static final enz aj = new enz(61, 8365974);
   public final int ak;
   public final int al;

   private enz(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(enz.a $$0) {
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

   public static enz a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static enz c(int $$0) {
      enz $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(enz.a.b($$1 & 3));
   }

   public byte b(enz.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final enz.a[] g = new enz.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(final int $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static enz.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static enz.a b(int $$0) {
         return g[$$0];
      }
   }
}
