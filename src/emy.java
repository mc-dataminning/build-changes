import com.google.common.base.Preconditions;

public class emy {
   private static final emy[] am = new emy[64];
   public static final emy a = new emy(0, 0);
   public static final emy b = new emy(1, 8368696);
   public static final emy c = new emy(2, 16247203);
   public static final emy d = new emy(3, 13092807);
   public static final emy e = new emy(4, 16711680);
   public static final emy f = new emy(5, 10526975);
   public static final emy g = new emy(6, 10987431);
   public static final emy h = new emy(7, 31744);
   public static final emy i = new emy(8, 16777215);
   public static final emy j = new emy(9, 10791096);
   public static final emy k = new emy(10, 9923917);
   public static final emy l = new emy(11, 7368816);
   public static final emy m = new emy(12, 4210943);
   public static final emy n = new emy(13, 9402184);
   public static final emy o = new emy(14, 16776437);
   public static final emy p = new emy(15, 14188339);
   public static final emy q = new emy(16, 11685080);
   public static final emy r = new emy(17, 6724056);
   public static final emy s = new emy(18, 15066419);
   public static final emy t = new emy(19, 8375321);
   public static final emy u = new emy(20, 15892389);
   public static final emy v = new emy(21, 5000268);
   public static final emy w = new emy(22, 10066329);
   public static final emy x = new emy(23, 5013401);
   public static final emy y = new emy(24, 8339378);
   public static final emy z = new emy(25, 3361970);
   public static final emy A = new emy(26, 6704179);
   public static final emy B = new emy(27, 6717235);
   public static final emy C = new emy(28, 10040115);
   public static final emy D = new emy(29, 1644825);
   public static final emy E = new emy(30, 16445005);
   public static final emy F = new emy(31, 6085589);
   public static final emy G = new emy(32, 4882687);
   public static final emy H = new emy(33, 55610);
   public static final emy I = new emy(34, 8476209);
   public static final emy J = new emy(35, 7340544);
   public static final emy K = new emy(36, 13742497);
   public static final emy L = new emy(37, 10441252);
   public static final emy M = new emy(38, 9787244);
   public static final emy N = new emy(39, 7367818);
   public static final emy O = new emy(40, 12223780);
   public static final emy P = new emy(41, 6780213);
   public static final emy Q = new emy(42, 10505550);
   public static final emy R = new emy(43, 3746083);
   public static final emy S = new emy(44, 8874850);
   public static final emy T = new emy(45, 5725276);
   public static final emy U = new emy(46, 8014168);
   public static final emy V = new emy(47, 4996700);
   public static final emy W = new emy(48, 4993571);
   public static final emy X = new emy(49, 5001770);
   public static final emy Y = new emy(50, 9321518);
   public static final emy Z = new emy(51, 2430480);
   public static final emy aa = new emy(52, 12398641);
   public static final emy ab = new emy(53, 9715553);
   public static final emy ac = new emy(54, 6035741);
   public static final emy ad = new emy(55, 1474182);
   public static final emy ae = new emy(56, 3837580);
   public static final emy af = new emy(57, 5647422);
   public static final emy ag = new emy(58, 1356933);
   public static final emy ah = new emy(59, 6579300);
   public static final emy ai = new emy(60, 14200723);
   public static final emy aj = new emy(61, 8365974);
   public final int ak;
   public final int al;

   private emy(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(emy.a $$0) {
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

   public static emy a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static emy c(int $$0) {
      emy $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(emy.a.b($$1 & 3));
   }

   public byte b(emy.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final emy.a[] g = new emy.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static emy.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static emy.a b(int $$0) {
         return g[$$0];
      }
   }
}
