import com.google.common.base.Preconditions;

public class enx {
   private static final enx[] am = new enx[64];
   public static final enx a = new enx(0, 0);
   public static final enx b = new enx(1, 8368696);
   public static final enx c = new enx(2, 16247203);
   public static final enx d = new enx(3, 13092807);
   public static final enx e = new enx(4, 16711680);
   public static final enx f = new enx(5, 10526975);
   public static final enx g = new enx(6, 10987431);
   public static final enx h = new enx(7, 31744);
   public static final enx i = new enx(8, 16777215);
   public static final enx j = new enx(9, 10791096);
   public static final enx k = new enx(10, 9923917);
   public static final enx l = new enx(11, 7368816);
   public static final enx m = new enx(12, 4210943);
   public static final enx n = new enx(13, 9402184);
   public static final enx o = new enx(14, 16776437);
   public static final enx p = new enx(15, 14188339);
   public static final enx q = new enx(16, 11685080);
   public static final enx r = new enx(17, 6724056);
   public static final enx s = new enx(18, 15066419);
   public static final enx t = new enx(19, 8375321);
   public static final enx u = new enx(20, 15892389);
   public static final enx v = new enx(21, 5000268);
   public static final enx w = new enx(22, 10066329);
   public static final enx x = new enx(23, 5013401);
   public static final enx y = new enx(24, 8339378);
   public static final enx z = new enx(25, 3361970);
   public static final enx A = new enx(26, 6704179);
   public static final enx B = new enx(27, 6717235);
   public static final enx C = new enx(28, 10040115);
   public static final enx D = new enx(29, 1644825);
   public static final enx E = new enx(30, 16445005);
   public static final enx F = new enx(31, 6085589);
   public static final enx G = new enx(32, 4882687);
   public static final enx H = new enx(33, 55610);
   public static final enx I = new enx(34, 8476209);
   public static final enx J = new enx(35, 7340544);
   public static final enx K = new enx(36, 13742497);
   public static final enx L = new enx(37, 10441252);
   public static final enx M = new enx(38, 9787244);
   public static final enx N = new enx(39, 7367818);
   public static final enx O = new enx(40, 12223780);
   public static final enx P = new enx(41, 6780213);
   public static final enx Q = new enx(42, 10505550);
   public static final enx R = new enx(43, 3746083);
   public static final enx S = new enx(44, 8874850);
   public static final enx T = new enx(45, 5725276);
   public static final enx U = new enx(46, 8014168);
   public static final enx V = new enx(47, 4996700);
   public static final enx W = new enx(48, 4993571);
   public static final enx X = new enx(49, 5001770);
   public static final enx Y = new enx(50, 9321518);
   public static final enx Z = new enx(51, 2430480);
   public static final enx aa = new enx(52, 12398641);
   public static final enx ab = new enx(53, 9715553);
   public static final enx ac = new enx(54, 6035741);
   public static final enx ad = new enx(55, 1474182);
   public static final enx ae = new enx(56, 3837580);
   public static final enx af = new enx(57, 5647422);
   public static final enx ag = new enx(58, 1356933);
   public static final enx ah = new enx(59, 6579300);
   public static final enx ai = new enx(60, 14200723);
   public static final enx aj = new enx(61, 8365974);
   public final int ak;
   public final int al;

   private enx(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(enx.a $$0) {
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

   public static enx a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static enx c(int $$0) {
      enx $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(enx.a.b($$1 & 3));
   }

   public byte b(enx.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final enx.a[] g = new enx.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(final int $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static enx.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static enx.a b(int $$0) {
         return g[$$0];
      }
   }
}
