import com.google.common.base.Preconditions;

public class eon {
   private static final eon[] am = new eon[64];
   public static final eon a = new eon(0, 0);
   public static final eon b = new eon(1, 8368696);
   public static final eon c = new eon(2, 16247203);
   public static final eon d = new eon(3, 13092807);
   public static final eon e = new eon(4, 16711680);
   public static final eon f = new eon(5, 10526975);
   public static final eon g = new eon(6, 10987431);
   public static final eon h = new eon(7, 31744);
   public static final eon i = new eon(8, 16777215);
   public static final eon j = new eon(9, 10791096);
   public static final eon k = new eon(10, 9923917);
   public static final eon l = new eon(11, 7368816);
   public static final eon m = new eon(12, 4210943);
   public static final eon n = new eon(13, 9402184);
   public static final eon o = new eon(14, 16776437);
   public static final eon p = new eon(15, 14188339);
   public static final eon q = new eon(16, 11685080);
   public static final eon r = new eon(17, 6724056);
   public static final eon s = new eon(18, 15066419);
   public static final eon t = new eon(19, 8375321);
   public static final eon u = new eon(20, 15892389);
   public static final eon v = new eon(21, 5000268);
   public static final eon w = new eon(22, 10066329);
   public static final eon x = new eon(23, 5013401);
   public static final eon y = new eon(24, 8339378);
   public static final eon z = new eon(25, 3361970);
   public static final eon A = new eon(26, 6704179);
   public static final eon B = new eon(27, 6717235);
   public static final eon C = new eon(28, 10040115);
   public static final eon D = new eon(29, 1644825);
   public static final eon E = new eon(30, 16445005);
   public static final eon F = new eon(31, 6085589);
   public static final eon G = new eon(32, 4882687);
   public static final eon H = new eon(33, 55610);
   public static final eon I = new eon(34, 8476209);
   public static final eon J = new eon(35, 7340544);
   public static final eon K = new eon(36, 13742497);
   public static final eon L = new eon(37, 10441252);
   public static final eon M = new eon(38, 9787244);
   public static final eon N = new eon(39, 7367818);
   public static final eon O = new eon(40, 12223780);
   public static final eon P = new eon(41, 6780213);
   public static final eon Q = new eon(42, 10505550);
   public static final eon R = new eon(43, 3746083);
   public static final eon S = new eon(44, 8874850);
   public static final eon T = new eon(45, 5725276);
   public static final eon U = new eon(46, 8014168);
   public static final eon V = new eon(47, 4996700);
   public static final eon W = new eon(48, 4993571);
   public static final eon X = new eon(49, 5001770);
   public static final eon Y = new eon(50, 9321518);
   public static final eon Z = new eon(51, 2430480);
   public static final eon aa = new eon(52, 12398641);
   public static final eon ab = new eon(53, 9715553);
   public static final eon ac = new eon(54, 6035741);
   public static final eon ad = new eon(55, 1474182);
   public static final eon ae = new eon(56, 3837580);
   public static final eon af = new eon(57, 5647422);
   public static final eon ag = new eon(58, 1356933);
   public static final eon ah = new eon(59, 6579300);
   public static final eon ai = new eon(60, 14200723);
   public static final eon aj = new eon(61, 8365974);
   public final int ak;
   public final int al;

   private eon(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(eon.a $$0) {
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

   public static eon a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static eon c(int $$0) {
      eon $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(eon.a.b($$1 & 3));
   }

   public byte b(eon.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final eon.a[] g = new eon.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(final int $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static eon.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static eon.a b(int $$0) {
         return g[$$0];
      }
   }
}
