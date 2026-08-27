import com.google.common.base.Preconditions;

public class eah {
   private static final eah[] am = new eah[64];
   public static final eah a = new eah(0, 0);
   public static final eah b = new eah(1, 8368696);
   public static final eah c = new eah(2, 16247203);
   public static final eah d = new eah(3, 13092807);
   public static final eah e = new eah(4, 16711680);
   public static final eah f = new eah(5, 10526975);
   public static final eah g = new eah(6, 10987431);
   public static final eah h = new eah(7, 31744);
   public static final eah i = new eah(8, 16777215);
   public static final eah j = new eah(9, 10791096);
   public static final eah k = new eah(10, 9923917);
   public static final eah l = new eah(11, 7368816);
   public static final eah m = new eah(12, 4210943);
   public static final eah n = new eah(13, 9402184);
   public static final eah o = new eah(14, 16776437);
   public static final eah p = new eah(15, 14188339);
   public static final eah q = new eah(16, 11685080);
   public static final eah r = new eah(17, 6724056);
   public static final eah s = new eah(18, 15066419);
   public static final eah t = new eah(19, 8375321);
   public static final eah u = new eah(20, 15892389);
   public static final eah v = new eah(21, 5000268);
   public static final eah w = new eah(22, 10066329);
   public static final eah x = new eah(23, 5013401);
   public static final eah y = new eah(24, 8339378);
   public static final eah z = new eah(25, 3361970);
   public static final eah A = new eah(26, 6704179);
   public static final eah B = new eah(27, 6717235);
   public static final eah C = new eah(28, 10040115);
   public static final eah D = new eah(29, 1644825);
   public static final eah E = new eah(30, 16445005);
   public static final eah F = new eah(31, 6085589);
   public static final eah G = new eah(32, 4882687);
   public static final eah H = new eah(33, 55610);
   public static final eah I = new eah(34, 8476209);
   public static final eah J = new eah(35, 7340544);
   public static final eah K = new eah(36, 13742497);
   public static final eah L = new eah(37, 10441252);
   public static final eah M = new eah(38, 9787244);
   public static final eah N = new eah(39, 7367818);
   public static final eah O = new eah(40, 12223780);
   public static final eah P = new eah(41, 6780213);
   public static final eah Q = new eah(42, 10505550);
   public static final eah R = new eah(43, 3746083);
   public static final eah S = new eah(44, 8874850);
   public static final eah T = new eah(45, 5725276);
   public static final eah U = new eah(46, 8014168);
   public static final eah V = new eah(47, 4996700);
   public static final eah W = new eah(48, 4993571);
   public static final eah X = new eah(49, 5001770);
   public static final eah Y = new eah(50, 9321518);
   public static final eah Z = new eah(51, 2430480);
   public static final eah aa = new eah(52, 12398641);
   public static final eah ab = new eah(53, 9715553);
   public static final eah ac = new eah(54, 6035741);
   public static final eah ad = new eah(55, 1474182);
   public static final eah ae = new eah(56, 3837580);
   public static final eah af = new eah(57, 5647422);
   public static final eah ag = new eah(58, 1356933);
   public static final eah ah = new eah(59, 6579300);
   public static final eah ai = new eah(60, 14200723);
   public static final eah aj = new eah(61, 8365974);
   public final int ak;
   public final int al;

   private eah(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(eah.a $$0) {
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

   public static eah a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static eah c(int $$0) {
      eah $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(eah.a.b($$1 & 3));
   }

   public byte b(eah.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final eah.a[] g = new eah.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static eah.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static eah.a b(int $$0) {
         return g[$$0];
      }
   }
}
