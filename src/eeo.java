import com.google.common.base.Preconditions;

public class eeo {
   private static final eeo[] am = new eeo[64];
   public static final eeo a = new eeo(0, 0);
   public static final eeo b = new eeo(1, 8368696);
   public static final eeo c = new eeo(2, 16247203);
   public static final eeo d = new eeo(3, 13092807);
   public static final eeo e = new eeo(4, 16711680);
   public static final eeo f = new eeo(5, 10526975);
   public static final eeo g = new eeo(6, 10987431);
   public static final eeo h = new eeo(7, 31744);
   public static final eeo i = new eeo(8, 16777215);
   public static final eeo j = new eeo(9, 10791096);
   public static final eeo k = new eeo(10, 9923917);
   public static final eeo l = new eeo(11, 7368816);
   public static final eeo m = new eeo(12, 4210943);
   public static final eeo n = new eeo(13, 9402184);
   public static final eeo o = new eeo(14, 16776437);
   public static final eeo p = new eeo(15, 14188339);
   public static final eeo q = new eeo(16, 11685080);
   public static final eeo r = new eeo(17, 6724056);
   public static final eeo s = new eeo(18, 15066419);
   public static final eeo t = new eeo(19, 8375321);
   public static final eeo u = new eeo(20, 15892389);
   public static final eeo v = new eeo(21, 5000268);
   public static final eeo w = new eeo(22, 10066329);
   public static final eeo x = new eeo(23, 5013401);
   public static final eeo y = new eeo(24, 8339378);
   public static final eeo z = new eeo(25, 3361970);
   public static final eeo A = new eeo(26, 6704179);
   public static final eeo B = new eeo(27, 6717235);
   public static final eeo C = new eeo(28, 10040115);
   public static final eeo D = new eeo(29, 1644825);
   public static final eeo E = new eeo(30, 16445005);
   public static final eeo F = new eeo(31, 6085589);
   public static final eeo G = new eeo(32, 4882687);
   public static final eeo H = new eeo(33, 55610);
   public static final eeo I = new eeo(34, 8476209);
   public static final eeo J = new eeo(35, 7340544);
   public static final eeo K = new eeo(36, 13742497);
   public static final eeo L = new eeo(37, 10441252);
   public static final eeo M = new eeo(38, 9787244);
   public static final eeo N = new eeo(39, 7367818);
   public static final eeo O = new eeo(40, 12223780);
   public static final eeo P = new eeo(41, 6780213);
   public static final eeo Q = new eeo(42, 10505550);
   public static final eeo R = new eeo(43, 3746083);
   public static final eeo S = new eeo(44, 8874850);
   public static final eeo T = new eeo(45, 5725276);
   public static final eeo U = new eeo(46, 8014168);
   public static final eeo V = new eeo(47, 4996700);
   public static final eeo W = new eeo(48, 4993571);
   public static final eeo X = new eeo(49, 5001770);
   public static final eeo Y = new eeo(50, 9321518);
   public static final eeo Z = new eeo(51, 2430480);
   public static final eeo aa = new eeo(52, 12398641);
   public static final eeo ab = new eeo(53, 9715553);
   public static final eeo ac = new eeo(54, 6035741);
   public static final eeo ad = new eeo(55, 1474182);
   public static final eeo ae = new eeo(56, 3837580);
   public static final eeo af = new eeo(57, 5647422);
   public static final eeo ag = new eeo(58, 1356933);
   public static final eeo ah = new eeo(59, 6579300);
   public static final eeo ai = new eeo(60, 14200723);
   public static final eeo aj = new eeo(61, 8365974);
   public final int ak;
   public final int al;

   private eeo(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(eeo.a $$0) {
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

   public static eeo a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static eeo c(int $$0) {
      eeo $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(eeo.a.b($$1 & 3));
   }

   public byte b(eeo.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final eeo.a[] g = new eeo.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static eeo.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static eeo.a b(int $$0) {
         return g[$$0];
      }
   }
}
