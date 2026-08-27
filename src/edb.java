import com.google.common.base.Preconditions;

public class edb {
   private static final edb[] am = new edb[64];
   public static final edb a = new edb(0, 0);
   public static final edb b = new edb(1, 8368696);
   public static final edb c = new edb(2, 16247203);
   public static final edb d = new edb(3, 13092807);
   public static final edb e = new edb(4, 16711680);
   public static final edb f = new edb(5, 10526975);
   public static final edb g = new edb(6, 10987431);
   public static final edb h = new edb(7, 31744);
   public static final edb i = new edb(8, 16777215);
   public static final edb j = new edb(9, 10791096);
   public static final edb k = new edb(10, 9923917);
   public static final edb l = new edb(11, 7368816);
   public static final edb m = new edb(12, 4210943);
   public static final edb n = new edb(13, 9402184);
   public static final edb o = new edb(14, 16776437);
   public static final edb p = new edb(15, 14188339);
   public static final edb q = new edb(16, 11685080);
   public static final edb r = new edb(17, 6724056);
   public static final edb s = new edb(18, 15066419);
   public static final edb t = new edb(19, 8375321);
   public static final edb u = new edb(20, 15892389);
   public static final edb v = new edb(21, 5000268);
   public static final edb w = new edb(22, 10066329);
   public static final edb x = new edb(23, 5013401);
   public static final edb y = new edb(24, 8339378);
   public static final edb z = new edb(25, 3361970);
   public static final edb A = new edb(26, 6704179);
   public static final edb B = new edb(27, 6717235);
   public static final edb C = new edb(28, 10040115);
   public static final edb D = new edb(29, 1644825);
   public static final edb E = new edb(30, 16445005);
   public static final edb F = new edb(31, 6085589);
   public static final edb G = new edb(32, 4882687);
   public static final edb H = new edb(33, 55610);
   public static final edb I = new edb(34, 8476209);
   public static final edb J = new edb(35, 7340544);
   public static final edb K = new edb(36, 13742497);
   public static final edb L = new edb(37, 10441252);
   public static final edb M = new edb(38, 9787244);
   public static final edb N = new edb(39, 7367818);
   public static final edb O = new edb(40, 12223780);
   public static final edb P = new edb(41, 6780213);
   public static final edb Q = new edb(42, 10505550);
   public static final edb R = new edb(43, 3746083);
   public static final edb S = new edb(44, 8874850);
   public static final edb T = new edb(45, 5725276);
   public static final edb U = new edb(46, 8014168);
   public static final edb V = new edb(47, 4996700);
   public static final edb W = new edb(48, 4993571);
   public static final edb X = new edb(49, 5001770);
   public static final edb Y = new edb(50, 9321518);
   public static final edb Z = new edb(51, 2430480);
   public static final edb aa = new edb(52, 12398641);
   public static final edb ab = new edb(53, 9715553);
   public static final edb ac = new edb(54, 6035741);
   public static final edb ad = new edb(55, 1474182);
   public static final edb ae = new edb(56, 3837580);
   public static final edb af = new edb(57, 5647422);
   public static final edb ag = new edb(58, 1356933);
   public static final edb ah = new edb(59, 6579300);
   public static final edb ai = new edb(60, 14200723);
   public static final edb aj = new edb(61, 8365974);
   public final int ak;
   public final int al;

   private edb(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(edb.a $$0) {
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

   public static edb a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static edb c(int $$0) {
      edb $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(edb.a.b($$1 & 3));
   }

   public byte b(edb.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final edb.a[] g = new edb.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static edb.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static edb.a b(int $$0) {
         return g[$$0];
      }
   }
}
