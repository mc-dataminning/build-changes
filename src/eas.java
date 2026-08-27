import com.google.common.base.Preconditions;

public class eas {
   private static final eas[] am = new eas[64];
   public static final eas a = new eas(0, 0);
   public static final eas b = new eas(1, 8368696);
   public static final eas c = new eas(2, 16247203);
   public static final eas d = new eas(3, 13092807);
   public static final eas e = new eas(4, 16711680);
   public static final eas f = new eas(5, 10526975);
   public static final eas g = new eas(6, 10987431);
   public static final eas h = new eas(7, 31744);
   public static final eas i = new eas(8, 16777215);
   public static final eas j = new eas(9, 10791096);
   public static final eas k = new eas(10, 9923917);
   public static final eas l = new eas(11, 7368816);
   public static final eas m = new eas(12, 4210943);
   public static final eas n = new eas(13, 9402184);
   public static final eas o = new eas(14, 16776437);
   public static final eas p = new eas(15, 14188339);
   public static final eas q = new eas(16, 11685080);
   public static final eas r = new eas(17, 6724056);
   public static final eas s = new eas(18, 15066419);
   public static final eas t = new eas(19, 8375321);
   public static final eas u = new eas(20, 15892389);
   public static final eas v = new eas(21, 5000268);
   public static final eas w = new eas(22, 10066329);
   public static final eas x = new eas(23, 5013401);
   public static final eas y = new eas(24, 8339378);
   public static final eas z = new eas(25, 3361970);
   public static final eas A = new eas(26, 6704179);
   public static final eas B = new eas(27, 6717235);
   public static final eas C = new eas(28, 10040115);
   public static final eas D = new eas(29, 1644825);
   public static final eas E = new eas(30, 16445005);
   public static final eas F = new eas(31, 6085589);
   public static final eas G = new eas(32, 4882687);
   public static final eas H = new eas(33, 55610);
   public static final eas I = new eas(34, 8476209);
   public static final eas J = new eas(35, 7340544);
   public static final eas K = new eas(36, 13742497);
   public static final eas L = new eas(37, 10441252);
   public static final eas M = new eas(38, 9787244);
   public static final eas N = new eas(39, 7367818);
   public static final eas O = new eas(40, 12223780);
   public static final eas P = new eas(41, 6780213);
   public static final eas Q = new eas(42, 10505550);
   public static final eas R = new eas(43, 3746083);
   public static final eas S = new eas(44, 8874850);
   public static final eas T = new eas(45, 5725276);
   public static final eas U = new eas(46, 8014168);
   public static final eas V = new eas(47, 4996700);
   public static final eas W = new eas(48, 4993571);
   public static final eas X = new eas(49, 5001770);
   public static final eas Y = new eas(50, 9321518);
   public static final eas Z = new eas(51, 2430480);
   public static final eas aa = new eas(52, 12398641);
   public static final eas ab = new eas(53, 9715553);
   public static final eas ac = new eas(54, 6035741);
   public static final eas ad = new eas(55, 1474182);
   public static final eas ae = new eas(56, 3837580);
   public static final eas af = new eas(57, 5647422);
   public static final eas ag = new eas(58, 1356933);
   public static final eas ah = new eas(59, 6579300);
   public static final eas ai = new eas(60, 14200723);
   public static final eas aj = new eas(61, 8365974);
   public final int ak;
   public final int al;

   private eas(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(eas.a $$0) {
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

   public static eas a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static eas c(int $$0) {
      eas $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(eas.a.b($$1 & 3));
   }

   public byte b(eas.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final eas.a[] g = new eas.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static eas.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static eas.a b(int $$0) {
         return g[$$0];
      }
   }
}
