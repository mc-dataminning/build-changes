import com.google.common.base.Preconditions;

public class ewk {
   private static final ewk[] am = new ewk[64];
   public static final ewk a = new ewk(0, 0);
   public static final ewk b = new ewk(1, 8368696);
   public static final ewk c = new ewk(2, 16247203);
   public static final ewk d = new ewk(3, 13092807);
   public static final ewk e = new ewk(4, 16711680);
   public static final ewk f = new ewk(5, 10526975);
   public static final ewk g = new ewk(6, 10987431);
   public static final ewk h = new ewk(7, 31744);
   public static final ewk i = new ewk(8, 16777215);
   public static final ewk j = new ewk(9, 10791096);
   public static final ewk k = new ewk(10, 9923917);
   public static final ewk l = new ewk(11, 7368816);
   public static final ewk m = new ewk(12, 4210943);
   public static final ewk n = new ewk(13, 9402184);
   public static final ewk o = new ewk(14, 16776437);
   public static final ewk p = new ewk(15, 14188339);
   public static final ewk q = new ewk(16, 11685080);
   public static final ewk r = new ewk(17, 6724056);
   public static final ewk s = new ewk(18, 15066419);
   public static final ewk t = new ewk(19, 8375321);
   public static final ewk u = new ewk(20, 15892389);
   public static final ewk v = new ewk(21, 5000268);
   public static final ewk w = new ewk(22, 10066329);
   public static final ewk x = new ewk(23, 5013401);
   public static final ewk y = new ewk(24, 8339378);
   public static final ewk z = new ewk(25, 3361970);
   public static final ewk A = new ewk(26, 6704179);
   public static final ewk B = new ewk(27, 6717235);
   public static final ewk C = new ewk(28, 10040115);
   public static final ewk D = new ewk(29, 1644825);
   public static final ewk E = new ewk(30, 16445005);
   public static final ewk F = new ewk(31, 6085589);
   public static final ewk G = new ewk(32, 4882687);
   public static final ewk H = new ewk(33, 55610);
   public static final ewk I = new ewk(34, 8476209);
   public static final ewk J = new ewk(35, 7340544);
   public static final ewk K = new ewk(36, 13742497);
   public static final ewk L = new ewk(37, 10441252);
   public static final ewk M = new ewk(38, 9787244);
   public static final ewk N = new ewk(39, 7367818);
   public static final ewk O = new ewk(40, 12223780);
   public static final ewk P = new ewk(41, 6780213);
   public static final ewk Q = new ewk(42, 10505550);
   public static final ewk R = new ewk(43, 3746083);
   public static final ewk S = new ewk(44, 8874850);
   public static final ewk T = new ewk(45, 5725276);
   public static final ewk U = new ewk(46, 8014168);
   public static final ewk V = new ewk(47, 4996700);
   public static final ewk W = new ewk(48, 4993571);
   public static final ewk X = new ewk(49, 5001770);
   public static final ewk Y = new ewk(50, 9321518);
   public static final ewk Z = new ewk(51, 2430480);
   public static final ewk aa = new ewk(52, 12398641);
   public static final ewk ab = new ewk(53, 9715553);
   public static final ewk ac = new ewk(54, 6035741);
   public static final ewk ad = new ewk(55, 1474182);
   public static final ewk ae = new ewk(56, 3837580);
   public static final ewk af = new ewk(57, 5647422);
   public static final ewk ag = new ewk(58, 1356933);
   public static final ewk ah = new ewk(59, 6579300);
   public static final ewk ai = new ewk(60, 14200723);
   public static final ewk aj = new ewk(61, 8365974);
   public final int ak;
   public final int al;

   private ewk(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(ewk.a $$0) {
      return this == a ? 0 : axw.b(axw.f(this.ak), $$0.f);
   }

   public static ewk a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static ewk c(int $$0) {
      ewk $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(ewk.a.b($$1 & 3));
   }

   public byte b(ewk.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final ewk.a[] g = new ewk.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(final int $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static ewk.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static ewk.a b(int $$0) {
         return g[$$0];
      }
   }
}
