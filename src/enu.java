import com.google.common.base.Preconditions;

public class enu {
   private static final enu[] am = new enu[64];
   public static final enu a = new enu(0, 0);
   public static final enu b = new enu(1, 8368696);
   public static final enu c = new enu(2, 16247203);
   public static final enu d = new enu(3, 13092807);
   public static final enu e = new enu(4, 16711680);
   public static final enu f = new enu(5, 10526975);
   public static final enu g = new enu(6, 10987431);
   public static final enu h = new enu(7, 31744);
   public static final enu i = new enu(8, 16777215);
   public static final enu j = new enu(9, 10791096);
   public static final enu k = new enu(10, 9923917);
   public static final enu l = new enu(11, 7368816);
   public static final enu m = new enu(12, 4210943);
   public static final enu n = new enu(13, 9402184);
   public static final enu o = new enu(14, 16776437);
   public static final enu p = new enu(15, 14188339);
   public static final enu q = new enu(16, 11685080);
   public static final enu r = new enu(17, 6724056);
   public static final enu s = new enu(18, 15066419);
   public static final enu t = new enu(19, 8375321);
   public static final enu u = new enu(20, 15892389);
   public static final enu v = new enu(21, 5000268);
   public static final enu w = new enu(22, 10066329);
   public static final enu x = new enu(23, 5013401);
   public static final enu y = new enu(24, 8339378);
   public static final enu z = new enu(25, 3361970);
   public static final enu A = new enu(26, 6704179);
   public static final enu B = new enu(27, 6717235);
   public static final enu C = new enu(28, 10040115);
   public static final enu D = new enu(29, 1644825);
   public static final enu E = new enu(30, 16445005);
   public static final enu F = new enu(31, 6085589);
   public static final enu G = new enu(32, 4882687);
   public static final enu H = new enu(33, 55610);
   public static final enu I = new enu(34, 8476209);
   public static final enu J = new enu(35, 7340544);
   public static final enu K = new enu(36, 13742497);
   public static final enu L = new enu(37, 10441252);
   public static final enu M = new enu(38, 9787244);
   public static final enu N = new enu(39, 7367818);
   public static final enu O = new enu(40, 12223780);
   public static final enu P = new enu(41, 6780213);
   public static final enu Q = new enu(42, 10505550);
   public static final enu R = new enu(43, 3746083);
   public static final enu S = new enu(44, 8874850);
   public static final enu T = new enu(45, 5725276);
   public static final enu U = new enu(46, 8014168);
   public static final enu V = new enu(47, 4996700);
   public static final enu W = new enu(48, 4993571);
   public static final enu X = new enu(49, 5001770);
   public static final enu Y = new enu(50, 9321518);
   public static final enu Z = new enu(51, 2430480);
   public static final enu aa = new enu(52, 12398641);
   public static final enu ab = new enu(53, 9715553);
   public static final enu ac = new enu(54, 6035741);
   public static final enu ad = new enu(55, 1474182);
   public static final enu ae = new enu(56, 3837580);
   public static final enu af = new enu(57, 5647422);
   public static final enu ag = new enu(58, 1356933);
   public static final enu ah = new enu(59, 6579300);
   public static final enu ai = new enu(60, 14200723);
   public static final enu aj = new enu(61, 8365974);
   public final int ak;
   public final int al;

   private enu(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(enu.a $$0) {
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

   public static enu a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static enu c(int $$0) {
      enu $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(enu.a.b($$1 & 3));
   }

   public byte b(enu.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final enu.a[] g = new enu.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(final int $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static enu.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static enu.a b(int $$0) {
         return g[$$0];
      }
   }
}
