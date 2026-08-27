import com.google.common.base.Preconditions;

public class eeu {
   private static final eeu[] am = new eeu[64];
   public static final eeu a = new eeu(0, 0);
   public static final eeu b = new eeu(1, 8368696);
   public static final eeu c = new eeu(2, 16247203);
   public static final eeu d = new eeu(3, 13092807);
   public static final eeu e = new eeu(4, 16711680);
   public static final eeu f = new eeu(5, 10526975);
   public static final eeu g = new eeu(6, 10987431);
   public static final eeu h = new eeu(7, 31744);
   public static final eeu i = new eeu(8, 16777215);
   public static final eeu j = new eeu(9, 10791096);
   public static final eeu k = new eeu(10, 9923917);
   public static final eeu l = new eeu(11, 7368816);
   public static final eeu m = new eeu(12, 4210943);
   public static final eeu n = new eeu(13, 9402184);
   public static final eeu o = new eeu(14, 16776437);
   public static final eeu p = new eeu(15, 14188339);
   public static final eeu q = new eeu(16, 11685080);
   public static final eeu r = new eeu(17, 6724056);
   public static final eeu s = new eeu(18, 15066419);
   public static final eeu t = new eeu(19, 8375321);
   public static final eeu u = new eeu(20, 15892389);
   public static final eeu v = new eeu(21, 5000268);
   public static final eeu w = new eeu(22, 10066329);
   public static final eeu x = new eeu(23, 5013401);
   public static final eeu y = new eeu(24, 8339378);
   public static final eeu z = new eeu(25, 3361970);
   public static final eeu A = new eeu(26, 6704179);
   public static final eeu B = new eeu(27, 6717235);
   public static final eeu C = new eeu(28, 10040115);
   public static final eeu D = new eeu(29, 1644825);
   public static final eeu E = new eeu(30, 16445005);
   public static final eeu F = new eeu(31, 6085589);
   public static final eeu G = new eeu(32, 4882687);
   public static final eeu H = new eeu(33, 55610);
   public static final eeu I = new eeu(34, 8476209);
   public static final eeu J = new eeu(35, 7340544);
   public static final eeu K = new eeu(36, 13742497);
   public static final eeu L = new eeu(37, 10441252);
   public static final eeu M = new eeu(38, 9787244);
   public static final eeu N = new eeu(39, 7367818);
   public static final eeu O = new eeu(40, 12223780);
   public static final eeu P = new eeu(41, 6780213);
   public static final eeu Q = new eeu(42, 10505550);
   public static final eeu R = new eeu(43, 3746083);
   public static final eeu S = new eeu(44, 8874850);
   public static final eeu T = new eeu(45, 5725276);
   public static final eeu U = new eeu(46, 8014168);
   public static final eeu V = new eeu(47, 4996700);
   public static final eeu W = new eeu(48, 4993571);
   public static final eeu X = new eeu(49, 5001770);
   public static final eeu Y = new eeu(50, 9321518);
   public static final eeu Z = new eeu(51, 2430480);
   public static final eeu aa = new eeu(52, 12398641);
   public static final eeu ab = new eeu(53, 9715553);
   public static final eeu ac = new eeu(54, 6035741);
   public static final eeu ad = new eeu(55, 1474182);
   public static final eeu ae = new eeu(56, 3837580);
   public static final eeu af = new eeu(57, 5647422);
   public static final eeu ag = new eeu(58, 1356933);
   public static final eeu ah = new eeu(59, 6579300);
   public static final eeu ai = new eeu(60, 14200723);
   public static final eeu aj = new eeu(61, 8365974);
   public final int ak;
   public final int al;

   private eeu(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(eeu.a $$0) {
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

   public static eeu a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static eeu c(int $$0) {
      eeu $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(eeu.a.b($$1 & 3));
   }

   public byte b(eeu.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final eeu.a[] g = new eeu.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static eeu.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static eeu.a b(int $$0) {
         return g[$$0];
      }
   }
}
