import com.google.common.base.Preconditions;

public class eqf {
   private static final eqf[] am = new eqf[64];
   public static final eqf a = new eqf(0, 0);
   public static final eqf b = new eqf(1, 8368696);
   public static final eqf c = new eqf(2, 16247203);
   public static final eqf d = new eqf(3, 13092807);
   public static final eqf e = new eqf(4, 16711680);
   public static final eqf f = new eqf(5, 10526975);
   public static final eqf g = new eqf(6, 10987431);
   public static final eqf h = new eqf(7, 31744);
   public static final eqf i = new eqf(8, 16777215);
   public static final eqf j = new eqf(9, 10791096);
   public static final eqf k = new eqf(10, 9923917);
   public static final eqf l = new eqf(11, 7368816);
   public static final eqf m = new eqf(12, 4210943);
   public static final eqf n = new eqf(13, 9402184);
   public static final eqf o = new eqf(14, 16776437);
   public static final eqf p = new eqf(15, 14188339);
   public static final eqf q = new eqf(16, 11685080);
   public static final eqf r = new eqf(17, 6724056);
   public static final eqf s = new eqf(18, 15066419);
   public static final eqf t = new eqf(19, 8375321);
   public static final eqf u = new eqf(20, 15892389);
   public static final eqf v = new eqf(21, 5000268);
   public static final eqf w = new eqf(22, 10066329);
   public static final eqf x = new eqf(23, 5013401);
   public static final eqf y = new eqf(24, 8339378);
   public static final eqf z = new eqf(25, 3361970);
   public static final eqf A = new eqf(26, 6704179);
   public static final eqf B = new eqf(27, 6717235);
   public static final eqf C = new eqf(28, 10040115);
   public static final eqf D = new eqf(29, 1644825);
   public static final eqf E = new eqf(30, 16445005);
   public static final eqf F = new eqf(31, 6085589);
   public static final eqf G = new eqf(32, 4882687);
   public static final eqf H = new eqf(33, 55610);
   public static final eqf I = new eqf(34, 8476209);
   public static final eqf J = new eqf(35, 7340544);
   public static final eqf K = new eqf(36, 13742497);
   public static final eqf L = new eqf(37, 10441252);
   public static final eqf M = new eqf(38, 9787244);
   public static final eqf N = new eqf(39, 7367818);
   public static final eqf O = new eqf(40, 12223780);
   public static final eqf P = new eqf(41, 6780213);
   public static final eqf Q = new eqf(42, 10505550);
   public static final eqf R = new eqf(43, 3746083);
   public static final eqf S = new eqf(44, 8874850);
   public static final eqf T = new eqf(45, 5725276);
   public static final eqf U = new eqf(46, 8014168);
   public static final eqf V = new eqf(47, 4996700);
   public static final eqf W = new eqf(48, 4993571);
   public static final eqf X = new eqf(49, 5001770);
   public static final eqf Y = new eqf(50, 9321518);
   public static final eqf Z = new eqf(51, 2430480);
   public static final eqf aa = new eqf(52, 12398641);
   public static final eqf ab = new eqf(53, 9715553);
   public static final eqf ac = new eqf(54, 6035741);
   public static final eqf ad = new eqf(55, 1474182);
   public static final eqf ae = new eqf(56, 3837580);
   public static final eqf af = new eqf(57, 5647422);
   public static final eqf ag = new eqf(58, 1356933);
   public static final eqf ah = new eqf(59, 6579300);
   public static final eqf ai = new eqf(60, 14200723);
   public static final eqf aj = new eqf(61, 8365974);
   public final int ak;
   public final int al;

   private eqf(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(eqf.a $$0) {
      return this == a ? 0 : axn.b(axn.f(this.ak), $$0.f);
   }

   public static eqf a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static eqf c(int $$0) {
      eqf $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(eqf.a.b($$1 & 3));
   }

   public byte b(eqf.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final eqf.a[] g = new eqf.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(final int $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static eqf.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static eqf.a b(int $$0) {
         return g[$$0];
      }
   }
}
