import com.google.common.base.Preconditions;

public class eaf {
   private static final eaf[] am = new eaf[64];
   public static final eaf a = new eaf(0, 0);
   public static final eaf b = new eaf(1, 8368696);
   public static final eaf c = new eaf(2, 16247203);
   public static final eaf d = new eaf(3, 13092807);
   public static final eaf e = new eaf(4, 16711680);
   public static final eaf f = new eaf(5, 10526975);
   public static final eaf g = new eaf(6, 10987431);
   public static final eaf h = new eaf(7, 31744);
   public static final eaf i = new eaf(8, 16777215);
   public static final eaf j = new eaf(9, 10791096);
   public static final eaf k = new eaf(10, 9923917);
   public static final eaf l = new eaf(11, 7368816);
   public static final eaf m = new eaf(12, 4210943);
   public static final eaf n = new eaf(13, 9402184);
   public static final eaf o = new eaf(14, 16776437);
   public static final eaf p = new eaf(15, 14188339);
   public static final eaf q = new eaf(16, 11685080);
   public static final eaf r = new eaf(17, 6724056);
   public static final eaf s = new eaf(18, 15066419);
   public static final eaf t = new eaf(19, 8375321);
   public static final eaf u = new eaf(20, 15892389);
   public static final eaf v = new eaf(21, 5000268);
   public static final eaf w = new eaf(22, 10066329);
   public static final eaf x = new eaf(23, 5013401);
   public static final eaf y = new eaf(24, 8339378);
   public static final eaf z = new eaf(25, 3361970);
   public static final eaf A = new eaf(26, 6704179);
   public static final eaf B = new eaf(27, 6717235);
   public static final eaf C = new eaf(28, 10040115);
   public static final eaf D = new eaf(29, 1644825);
   public static final eaf E = new eaf(30, 16445005);
   public static final eaf F = new eaf(31, 6085589);
   public static final eaf G = new eaf(32, 4882687);
   public static final eaf H = new eaf(33, 55610);
   public static final eaf I = new eaf(34, 8476209);
   public static final eaf J = new eaf(35, 7340544);
   public static final eaf K = new eaf(36, 13742497);
   public static final eaf L = new eaf(37, 10441252);
   public static final eaf M = new eaf(38, 9787244);
   public static final eaf N = new eaf(39, 7367818);
   public static final eaf O = new eaf(40, 12223780);
   public static final eaf P = new eaf(41, 6780213);
   public static final eaf Q = new eaf(42, 10505550);
   public static final eaf R = new eaf(43, 3746083);
   public static final eaf S = new eaf(44, 8874850);
   public static final eaf T = new eaf(45, 5725276);
   public static final eaf U = new eaf(46, 8014168);
   public static final eaf V = new eaf(47, 4996700);
   public static final eaf W = new eaf(48, 4993571);
   public static final eaf X = new eaf(49, 5001770);
   public static final eaf Y = new eaf(50, 9321518);
   public static final eaf Z = new eaf(51, 2430480);
   public static final eaf aa = new eaf(52, 12398641);
   public static final eaf ab = new eaf(53, 9715553);
   public static final eaf ac = new eaf(54, 6035741);
   public static final eaf ad = new eaf(55, 1474182);
   public static final eaf ae = new eaf(56, 3837580);
   public static final eaf af = new eaf(57, 5647422);
   public static final eaf ag = new eaf(58, 1356933);
   public static final eaf ah = new eaf(59, 6579300);
   public static final eaf ai = new eaf(60, 14200723);
   public static final eaf aj = new eaf(61, 8365974);
   public final int ak;
   public final int al;

   private eaf(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(eaf.a $$0) {
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

   public static eaf a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static eaf c(int $$0) {
      eaf $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(eaf.a.b($$1 & 3));
   }

   public byte b(eaf.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final eaf.a[] g = new eaf.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static eaf.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static eaf.a b(int $$0) {
         return g[$$0];
      }
   }
}
