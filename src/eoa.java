import com.google.common.base.Preconditions;

public class eoa {
   private static final eoa[] am = new eoa[64];
   public static final eoa a = new eoa(0, 0);
   public static final eoa b = new eoa(1, 8368696);
   public static final eoa c = new eoa(2, 16247203);
   public static final eoa d = new eoa(3, 13092807);
   public static final eoa e = new eoa(4, 16711680);
   public static final eoa f = new eoa(5, 10526975);
   public static final eoa g = new eoa(6, 10987431);
   public static final eoa h = new eoa(7, 31744);
   public static final eoa i = new eoa(8, 16777215);
   public static final eoa j = new eoa(9, 10791096);
   public static final eoa k = new eoa(10, 9923917);
   public static final eoa l = new eoa(11, 7368816);
   public static final eoa m = new eoa(12, 4210943);
   public static final eoa n = new eoa(13, 9402184);
   public static final eoa o = new eoa(14, 16776437);
   public static final eoa p = new eoa(15, 14188339);
   public static final eoa q = new eoa(16, 11685080);
   public static final eoa r = new eoa(17, 6724056);
   public static final eoa s = new eoa(18, 15066419);
   public static final eoa t = new eoa(19, 8375321);
   public static final eoa u = new eoa(20, 15892389);
   public static final eoa v = new eoa(21, 5000268);
   public static final eoa w = new eoa(22, 10066329);
   public static final eoa x = new eoa(23, 5013401);
   public static final eoa y = new eoa(24, 8339378);
   public static final eoa z = new eoa(25, 3361970);
   public static final eoa A = new eoa(26, 6704179);
   public static final eoa B = new eoa(27, 6717235);
   public static final eoa C = new eoa(28, 10040115);
   public static final eoa D = new eoa(29, 1644825);
   public static final eoa E = new eoa(30, 16445005);
   public static final eoa F = new eoa(31, 6085589);
   public static final eoa G = new eoa(32, 4882687);
   public static final eoa H = new eoa(33, 55610);
   public static final eoa I = new eoa(34, 8476209);
   public static final eoa J = new eoa(35, 7340544);
   public static final eoa K = new eoa(36, 13742497);
   public static final eoa L = new eoa(37, 10441252);
   public static final eoa M = new eoa(38, 9787244);
   public static final eoa N = new eoa(39, 7367818);
   public static final eoa O = new eoa(40, 12223780);
   public static final eoa P = new eoa(41, 6780213);
   public static final eoa Q = new eoa(42, 10505550);
   public static final eoa R = new eoa(43, 3746083);
   public static final eoa S = new eoa(44, 8874850);
   public static final eoa T = new eoa(45, 5725276);
   public static final eoa U = new eoa(46, 8014168);
   public static final eoa V = new eoa(47, 4996700);
   public static final eoa W = new eoa(48, 4993571);
   public static final eoa X = new eoa(49, 5001770);
   public static final eoa Y = new eoa(50, 9321518);
   public static final eoa Z = new eoa(51, 2430480);
   public static final eoa aa = new eoa(52, 12398641);
   public static final eoa ab = new eoa(53, 9715553);
   public static final eoa ac = new eoa(54, 6035741);
   public static final eoa ad = new eoa(55, 1474182);
   public static final eoa ae = new eoa(56, 3837580);
   public static final eoa af = new eoa(57, 5647422);
   public static final eoa ag = new eoa(58, 1356933);
   public static final eoa ah = new eoa(59, 6579300);
   public static final eoa ai = new eoa(60, 14200723);
   public static final eoa aj = new eoa(61, 8365974);
   public final int ak;
   public final int al;

   private eoa(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(eoa.a $$0) {
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

   public static eoa a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static eoa c(int $$0) {
      eoa $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(eoa.a.b($$1 & 3));
   }

   public byte b(eoa.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final eoa.a[] g = new eoa.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(final int $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static eoa.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static eoa.a b(int $$0) {
         return g[$$0];
      }
   }
}
