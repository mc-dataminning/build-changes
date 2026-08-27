import com.google.common.base.Preconditions;

public class eal {
   private static final eal[] am = new eal[64];
   public static final eal a = new eal(0, 0);
   public static final eal b = new eal(1, 8368696);
   public static final eal c = new eal(2, 16247203);
   public static final eal d = new eal(3, 13092807);
   public static final eal e = new eal(4, 16711680);
   public static final eal f = new eal(5, 10526975);
   public static final eal g = new eal(6, 10987431);
   public static final eal h = new eal(7, 31744);
   public static final eal i = new eal(8, 16777215);
   public static final eal j = new eal(9, 10791096);
   public static final eal k = new eal(10, 9923917);
   public static final eal l = new eal(11, 7368816);
   public static final eal m = new eal(12, 4210943);
   public static final eal n = new eal(13, 9402184);
   public static final eal o = new eal(14, 16776437);
   public static final eal p = new eal(15, 14188339);
   public static final eal q = new eal(16, 11685080);
   public static final eal r = new eal(17, 6724056);
   public static final eal s = new eal(18, 15066419);
   public static final eal t = new eal(19, 8375321);
   public static final eal u = new eal(20, 15892389);
   public static final eal v = new eal(21, 5000268);
   public static final eal w = new eal(22, 10066329);
   public static final eal x = new eal(23, 5013401);
   public static final eal y = new eal(24, 8339378);
   public static final eal z = new eal(25, 3361970);
   public static final eal A = new eal(26, 6704179);
   public static final eal B = new eal(27, 6717235);
   public static final eal C = new eal(28, 10040115);
   public static final eal D = new eal(29, 1644825);
   public static final eal E = new eal(30, 16445005);
   public static final eal F = new eal(31, 6085589);
   public static final eal G = new eal(32, 4882687);
   public static final eal H = new eal(33, 55610);
   public static final eal I = new eal(34, 8476209);
   public static final eal J = new eal(35, 7340544);
   public static final eal K = new eal(36, 13742497);
   public static final eal L = new eal(37, 10441252);
   public static final eal M = new eal(38, 9787244);
   public static final eal N = new eal(39, 7367818);
   public static final eal O = new eal(40, 12223780);
   public static final eal P = new eal(41, 6780213);
   public static final eal Q = new eal(42, 10505550);
   public static final eal R = new eal(43, 3746083);
   public static final eal S = new eal(44, 8874850);
   public static final eal T = new eal(45, 5725276);
   public static final eal U = new eal(46, 8014168);
   public static final eal V = new eal(47, 4996700);
   public static final eal W = new eal(48, 4993571);
   public static final eal X = new eal(49, 5001770);
   public static final eal Y = new eal(50, 9321518);
   public static final eal Z = new eal(51, 2430480);
   public static final eal aa = new eal(52, 12398641);
   public static final eal ab = new eal(53, 9715553);
   public static final eal ac = new eal(54, 6035741);
   public static final eal ad = new eal(55, 1474182);
   public static final eal ae = new eal(56, 3837580);
   public static final eal af = new eal(57, 5647422);
   public static final eal ag = new eal(58, 1356933);
   public static final eal ah = new eal(59, 6579300);
   public static final eal ai = new eal(60, 14200723);
   public static final eal aj = new eal(61, 8365974);
   public final int ak;
   public final int al;

   private eal(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(eal.a $$0) {
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

   public static eal a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static eal c(int $$0) {
      eal $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(eal.a.b($$1 & 3));
   }

   public byte b(eal.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final eal.a[] g = new eal.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static eal.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static eal.a b(int $$0) {
         return g[$$0];
      }
   }
}
