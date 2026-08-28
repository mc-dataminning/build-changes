import com.google.common.base.Preconditions;

public class epg {
   private static final epg[] am = new epg[64];
   public static final epg a = new epg(0, 0);
   public static final epg b = new epg(1, 8368696);
   public static final epg c = new epg(2, 16247203);
   public static final epg d = new epg(3, 13092807);
   public static final epg e = new epg(4, 16711680);
   public static final epg f = new epg(5, 10526975);
   public static final epg g = new epg(6, 10987431);
   public static final epg h = new epg(7, 31744);
   public static final epg i = new epg(8, 16777215);
   public static final epg j = new epg(9, 10791096);
   public static final epg k = new epg(10, 9923917);
   public static final epg l = new epg(11, 7368816);
   public static final epg m = new epg(12, 4210943);
   public static final epg n = new epg(13, 9402184);
   public static final epg o = new epg(14, 16776437);
   public static final epg p = new epg(15, 14188339);
   public static final epg q = new epg(16, 11685080);
   public static final epg r = new epg(17, 6724056);
   public static final epg s = new epg(18, 15066419);
   public static final epg t = new epg(19, 8375321);
   public static final epg u = new epg(20, 15892389);
   public static final epg v = new epg(21, 5000268);
   public static final epg w = new epg(22, 10066329);
   public static final epg x = new epg(23, 5013401);
   public static final epg y = new epg(24, 8339378);
   public static final epg z = new epg(25, 3361970);
   public static final epg A = new epg(26, 6704179);
   public static final epg B = new epg(27, 6717235);
   public static final epg C = new epg(28, 10040115);
   public static final epg D = new epg(29, 1644825);
   public static final epg E = new epg(30, 16445005);
   public static final epg F = new epg(31, 6085589);
   public static final epg G = new epg(32, 4882687);
   public static final epg H = new epg(33, 55610);
   public static final epg I = new epg(34, 8476209);
   public static final epg J = new epg(35, 7340544);
   public static final epg K = new epg(36, 13742497);
   public static final epg L = new epg(37, 10441252);
   public static final epg M = new epg(38, 9787244);
   public static final epg N = new epg(39, 7367818);
   public static final epg O = new epg(40, 12223780);
   public static final epg P = new epg(41, 6780213);
   public static final epg Q = new epg(42, 10505550);
   public static final epg R = new epg(43, 3746083);
   public static final epg S = new epg(44, 8874850);
   public static final epg T = new epg(45, 5725276);
   public static final epg U = new epg(46, 8014168);
   public static final epg V = new epg(47, 4996700);
   public static final epg W = new epg(48, 4993571);
   public static final epg X = new epg(49, 5001770);
   public static final epg Y = new epg(50, 9321518);
   public static final epg Z = new epg(51, 2430480);
   public static final epg aa = new epg(52, 12398641);
   public static final epg ab = new epg(53, 9715553);
   public static final epg ac = new epg(54, 6035741);
   public static final epg ad = new epg(55, 1474182);
   public static final epg ae = new epg(56, 3837580);
   public static final epg af = new epg(57, 5647422);
   public static final epg ag = new epg(58, 1356933);
   public static final epg ah = new epg(59, 6579300);
   public static final epg ai = new epg(60, 14200723);
   public static final epg aj = new epg(61, 8365974);
   public final int ak;
   public final int al;

   private epg(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(epg.a $$0) {
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

   public static epg a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static epg c(int $$0) {
      epg $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(epg.a.b($$1 & 3));
   }

   public byte b(epg.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final epg.a[] g = new epg.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(final int $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static epg.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static epg.a b(int $$0) {
         return g[$$0];
      }
   }
}
