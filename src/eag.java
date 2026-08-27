import com.google.common.base.Preconditions;

public class eag {
   private static final eag[] am = new eag[64];
   public static final eag a = new eag(0, 0);
   public static final eag b = new eag(1, 8368696);
   public static final eag c = new eag(2, 16247203);
   public static final eag d = new eag(3, 13092807);
   public static final eag e = new eag(4, 16711680);
   public static final eag f = new eag(5, 10526975);
   public static final eag g = new eag(6, 10987431);
   public static final eag h = new eag(7, 31744);
   public static final eag i = new eag(8, 16777215);
   public static final eag j = new eag(9, 10791096);
   public static final eag k = new eag(10, 9923917);
   public static final eag l = new eag(11, 7368816);
   public static final eag m = new eag(12, 4210943);
   public static final eag n = new eag(13, 9402184);
   public static final eag o = new eag(14, 16776437);
   public static final eag p = new eag(15, 14188339);
   public static final eag q = new eag(16, 11685080);
   public static final eag r = new eag(17, 6724056);
   public static final eag s = new eag(18, 15066419);
   public static final eag t = new eag(19, 8375321);
   public static final eag u = new eag(20, 15892389);
   public static final eag v = new eag(21, 5000268);
   public static final eag w = new eag(22, 10066329);
   public static final eag x = new eag(23, 5013401);
   public static final eag y = new eag(24, 8339378);
   public static final eag z = new eag(25, 3361970);
   public static final eag A = new eag(26, 6704179);
   public static final eag B = new eag(27, 6717235);
   public static final eag C = new eag(28, 10040115);
   public static final eag D = new eag(29, 1644825);
   public static final eag E = new eag(30, 16445005);
   public static final eag F = new eag(31, 6085589);
   public static final eag G = new eag(32, 4882687);
   public static final eag H = new eag(33, 55610);
   public static final eag I = new eag(34, 8476209);
   public static final eag J = new eag(35, 7340544);
   public static final eag K = new eag(36, 13742497);
   public static final eag L = new eag(37, 10441252);
   public static final eag M = new eag(38, 9787244);
   public static final eag N = new eag(39, 7367818);
   public static final eag O = new eag(40, 12223780);
   public static final eag P = new eag(41, 6780213);
   public static final eag Q = new eag(42, 10505550);
   public static final eag R = new eag(43, 3746083);
   public static final eag S = new eag(44, 8874850);
   public static final eag T = new eag(45, 5725276);
   public static final eag U = new eag(46, 8014168);
   public static final eag V = new eag(47, 4996700);
   public static final eag W = new eag(48, 4993571);
   public static final eag X = new eag(49, 5001770);
   public static final eag Y = new eag(50, 9321518);
   public static final eag Z = new eag(51, 2430480);
   public static final eag aa = new eag(52, 12398641);
   public static final eag ab = new eag(53, 9715553);
   public static final eag ac = new eag(54, 6035741);
   public static final eag ad = new eag(55, 1474182);
   public static final eag ae = new eag(56, 3837580);
   public static final eag af = new eag(57, 5647422);
   public static final eag ag = new eag(58, 1356933);
   public static final eag ah = new eag(59, 6579300);
   public static final eag ai = new eag(60, 14200723);
   public static final eag aj = new eag(61, 8365974);
   public final int ak;
   public final int al;

   private eag(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(eag.a $$0) {
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

   public static eag a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static eag c(int $$0) {
      eag $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(eag.a.b($$1 & 3));
   }

   public byte b(eag.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final eag.a[] g = new eag.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static eag.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static eag.a b(int $$0) {
         return g[$$0];
      }
   }
}
