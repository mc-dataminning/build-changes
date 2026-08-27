import com.google.common.base.Preconditions;

public class eit {
   private static final eit[] am = new eit[64];
   public static final eit a = new eit(0, 0);
   public static final eit b = new eit(1, 8368696);
   public static final eit c = new eit(2, 16247203);
   public static final eit d = new eit(3, 13092807);
   public static final eit e = new eit(4, 16711680);
   public static final eit f = new eit(5, 10526975);
   public static final eit g = new eit(6, 10987431);
   public static final eit h = new eit(7, 31744);
   public static final eit i = new eit(8, 16777215);
   public static final eit j = new eit(9, 10791096);
   public static final eit k = new eit(10, 9923917);
   public static final eit l = new eit(11, 7368816);
   public static final eit m = new eit(12, 4210943);
   public static final eit n = new eit(13, 9402184);
   public static final eit o = new eit(14, 16776437);
   public static final eit p = new eit(15, 14188339);
   public static final eit q = new eit(16, 11685080);
   public static final eit r = new eit(17, 6724056);
   public static final eit s = new eit(18, 15066419);
   public static final eit t = new eit(19, 8375321);
   public static final eit u = new eit(20, 15892389);
   public static final eit v = new eit(21, 5000268);
   public static final eit w = new eit(22, 10066329);
   public static final eit x = new eit(23, 5013401);
   public static final eit y = new eit(24, 8339378);
   public static final eit z = new eit(25, 3361970);
   public static final eit A = new eit(26, 6704179);
   public static final eit B = new eit(27, 6717235);
   public static final eit C = new eit(28, 10040115);
   public static final eit D = new eit(29, 1644825);
   public static final eit E = new eit(30, 16445005);
   public static final eit F = new eit(31, 6085589);
   public static final eit G = new eit(32, 4882687);
   public static final eit H = new eit(33, 55610);
   public static final eit I = new eit(34, 8476209);
   public static final eit J = new eit(35, 7340544);
   public static final eit K = new eit(36, 13742497);
   public static final eit L = new eit(37, 10441252);
   public static final eit M = new eit(38, 9787244);
   public static final eit N = new eit(39, 7367818);
   public static final eit O = new eit(40, 12223780);
   public static final eit P = new eit(41, 6780213);
   public static final eit Q = new eit(42, 10505550);
   public static final eit R = new eit(43, 3746083);
   public static final eit S = new eit(44, 8874850);
   public static final eit T = new eit(45, 5725276);
   public static final eit U = new eit(46, 8014168);
   public static final eit V = new eit(47, 4996700);
   public static final eit W = new eit(48, 4993571);
   public static final eit X = new eit(49, 5001770);
   public static final eit Y = new eit(50, 9321518);
   public static final eit Z = new eit(51, 2430480);
   public static final eit aa = new eit(52, 12398641);
   public static final eit ab = new eit(53, 9715553);
   public static final eit ac = new eit(54, 6035741);
   public static final eit ad = new eit(55, 1474182);
   public static final eit ae = new eit(56, 3837580);
   public static final eit af = new eit(57, 5647422);
   public static final eit ag = new eit(58, 1356933);
   public static final eit ah = new eit(59, 6579300);
   public static final eit ai = new eit(60, 14200723);
   public static final eit aj = new eit(61, 8365974);
   public final int ak;
   public final int al;

   private eit(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(eit.a $$0) {
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

   public static eit a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static eit c(int $$0) {
      eit $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(eit.a.b($$1 & 3));
   }

   public byte b(eit.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final eit.a[] g = new eit.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static eit.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static eit.a b(int $$0) {
         return g[$$0];
      }
   }
}
