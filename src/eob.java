import com.google.common.base.Preconditions;

public class eob {
   private static final eob[] am = new eob[64];
   public static final eob a = new eob(0, 0);
   public static final eob b = new eob(1, 8368696);
   public static final eob c = new eob(2, 16247203);
   public static final eob d = new eob(3, 13092807);
   public static final eob e = new eob(4, 16711680);
   public static final eob f = new eob(5, 10526975);
   public static final eob g = new eob(6, 10987431);
   public static final eob h = new eob(7, 31744);
   public static final eob i = new eob(8, 16777215);
   public static final eob j = new eob(9, 10791096);
   public static final eob k = new eob(10, 9923917);
   public static final eob l = new eob(11, 7368816);
   public static final eob m = new eob(12, 4210943);
   public static final eob n = new eob(13, 9402184);
   public static final eob o = new eob(14, 16776437);
   public static final eob p = new eob(15, 14188339);
   public static final eob q = new eob(16, 11685080);
   public static final eob r = new eob(17, 6724056);
   public static final eob s = new eob(18, 15066419);
   public static final eob t = new eob(19, 8375321);
   public static final eob u = new eob(20, 15892389);
   public static final eob v = new eob(21, 5000268);
   public static final eob w = new eob(22, 10066329);
   public static final eob x = new eob(23, 5013401);
   public static final eob y = new eob(24, 8339378);
   public static final eob z = new eob(25, 3361970);
   public static final eob A = new eob(26, 6704179);
   public static final eob B = new eob(27, 6717235);
   public static final eob C = new eob(28, 10040115);
   public static final eob D = new eob(29, 1644825);
   public static final eob E = new eob(30, 16445005);
   public static final eob F = new eob(31, 6085589);
   public static final eob G = new eob(32, 4882687);
   public static final eob H = new eob(33, 55610);
   public static final eob I = new eob(34, 8476209);
   public static final eob J = new eob(35, 7340544);
   public static final eob K = new eob(36, 13742497);
   public static final eob L = new eob(37, 10441252);
   public static final eob M = new eob(38, 9787244);
   public static final eob N = new eob(39, 7367818);
   public static final eob O = new eob(40, 12223780);
   public static final eob P = new eob(41, 6780213);
   public static final eob Q = new eob(42, 10505550);
   public static final eob R = new eob(43, 3746083);
   public static final eob S = new eob(44, 8874850);
   public static final eob T = new eob(45, 5725276);
   public static final eob U = new eob(46, 8014168);
   public static final eob V = new eob(47, 4996700);
   public static final eob W = new eob(48, 4993571);
   public static final eob X = new eob(49, 5001770);
   public static final eob Y = new eob(50, 9321518);
   public static final eob Z = new eob(51, 2430480);
   public static final eob aa = new eob(52, 12398641);
   public static final eob ab = new eob(53, 9715553);
   public static final eob ac = new eob(54, 6035741);
   public static final eob ad = new eob(55, 1474182);
   public static final eob ae = new eob(56, 3837580);
   public static final eob af = new eob(57, 5647422);
   public static final eob ag = new eob(58, 1356933);
   public static final eob ah = new eob(59, 6579300);
   public static final eob ai = new eob(60, 14200723);
   public static final eob aj = new eob(61, 8365974);
   public final int ak;
   public final int al;

   private eob(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(eob.a $$0) {
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

   public static eob a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static eob c(int $$0) {
      eob $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(eob.a.b($$1 & 3));
   }

   public byte b(eob.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final eob.a[] g = new eob.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(final int $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static eob.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static eob.a b(int $$0) {
         return g[$$0];
      }
   }
}
