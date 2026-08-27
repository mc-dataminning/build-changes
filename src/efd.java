import com.google.common.base.Preconditions;

public class efd {
   private static final efd[] am = new efd[64];
   public static final efd a = new efd(0, 0);
   public static final efd b = new efd(1, 8368696);
   public static final efd c = new efd(2, 16247203);
   public static final efd d = new efd(3, 13092807);
   public static final efd e = new efd(4, 16711680);
   public static final efd f = new efd(5, 10526975);
   public static final efd g = new efd(6, 10987431);
   public static final efd h = new efd(7, 31744);
   public static final efd i = new efd(8, 16777215);
   public static final efd j = new efd(9, 10791096);
   public static final efd k = new efd(10, 9923917);
   public static final efd l = new efd(11, 7368816);
   public static final efd m = new efd(12, 4210943);
   public static final efd n = new efd(13, 9402184);
   public static final efd o = new efd(14, 16776437);
   public static final efd p = new efd(15, 14188339);
   public static final efd q = new efd(16, 11685080);
   public static final efd r = new efd(17, 6724056);
   public static final efd s = new efd(18, 15066419);
   public static final efd t = new efd(19, 8375321);
   public static final efd u = new efd(20, 15892389);
   public static final efd v = new efd(21, 5000268);
   public static final efd w = new efd(22, 10066329);
   public static final efd x = new efd(23, 5013401);
   public static final efd y = new efd(24, 8339378);
   public static final efd z = new efd(25, 3361970);
   public static final efd A = new efd(26, 6704179);
   public static final efd B = new efd(27, 6717235);
   public static final efd C = new efd(28, 10040115);
   public static final efd D = new efd(29, 1644825);
   public static final efd E = new efd(30, 16445005);
   public static final efd F = new efd(31, 6085589);
   public static final efd G = new efd(32, 4882687);
   public static final efd H = new efd(33, 55610);
   public static final efd I = new efd(34, 8476209);
   public static final efd J = new efd(35, 7340544);
   public static final efd K = new efd(36, 13742497);
   public static final efd L = new efd(37, 10441252);
   public static final efd M = new efd(38, 9787244);
   public static final efd N = new efd(39, 7367818);
   public static final efd O = new efd(40, 12223780);
   public static final efd P = new efd(41, 6780213);
   public static final efd Q = new efd(42, 10505550);
   public static final efd R = new efd(43, 3746083);
   public static final efd S = new efd(44, 8874850);
   public static final efd T = new efd(45, 5725276);
   public static final efd U = new efd(46, 8014168);
   public static final efd V = new efd(47, 4996700);
   public static final efd W = new efd(48, 4993571);
   public static final efd X = new efd(49, 5001770);
   public static final efd Y = new efd(50, 9321518);
   public static final efd Z = new efd(51, 2430480);
   public static final efd aa = new efd(52, 12398641);
   public static final efd ab = new efd(53, 9715553);
   public static final efd ac = new efd(54, 6035741);
   public static final efd ad = new efd(55, 1474182);
   public static final efd ae = new efd(56, 3837580);
   public static final efd af = new efd(57, 5647422);
   public static final efd ag = new efd(58, 1356933);
   public static final efd ah = new efd(59, 6579300);
   public static final efd ai = new efd(60, 14200723);
   public static final efd aj = new efd(61, 8365974);
   public final int ak;
   public final int al;

   private efd(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(efd.a $$0) {
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

   public static efd a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static efd c(int $$0) {
      efd $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(efd.a.b($$1 & 3));
   }

   public byte b(efd.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final efd.a[] g = new efd.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static efd.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static efd.a b(int $$0) {
         return g[$$0];
      }
   }
}
