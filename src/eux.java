import com.google.common.base.Preconditions;

public class eux {
   private static final eux[] am = new eux[64];
   public static final eux a = new eux(0, 0);
   public static final eux b = new eux(1, 8368696);
   public static final eux c = new eux(2, 16247203);
   public static final eux d = new eux(3, 13092807);
   public static final eux e = new eux(4, 16711680);
   public static final eux f = new eux(5, 10526975);
   public static final eux g = new eux(6, 10987431);
   public static final eux h = new eux(7, 31744);
   public static final eux i = new eux(8, 16777215);
   public static final eux j = new eux(9, 10791096);
   public static final eux k = new eux(10, 9923917);
   public static final eux l = new eux(11, 7368816);
   public static final eux m = new eux(12, 4210943);
   public static final eux n = new eux(13, 9402184);
   public static final eux o = new eux(14, 16776437);
   public static final eux p = new eux(15, 14188339);
   public static final eux q = new eux(16, 11685080);
   public static final eux r = new eux(17, 6724056);
   public static final eux s = new eux(18, 15066419);
   public static final eux t = new eux(19, 8375321);
   public static final eux u = new eux(20, 15892389);
   public static final eux v = new eux(21, 5000268);
   public static final eux w = new eux(22, 10066329);
   public static final eux x = new eux(23, 5013401);
   public static final eux y = new eux(24, 8339378);
   public static final eux z = new eux(25, 3361970);
   public static final eux A = new eux(26, 6704179);
   public static final eux B = new eux(27, 6717235);
   public static final eux C = new eux(28, 10040115);
   public static final eux D = new eux(29, 1644825);
   public static final eux E = new eux(30, 16445005);
   public static final eux F = new eux(31, 6085589);
   public static final eux G = new eux(32, 4882687);
   public static final eux H = new eux(33, 55610);
   public static final eux I = new eux(34, 8476209);
   public static final eux J = new eux(35, 7340544);
   public static final eux K = new eux(36, 13742497);
   public static final eux L = new eux(37, 10441252);
   public static final eux M = new eux(38, 9787244);
   public static final eux N = new eux(39, 7367818);
   public static final eux O = new eux(40, 12223780);
   public static final eux P = new eux(41, 6780213);
   public static final eux Q = new eux(42, 10505550);
   public static final eux R = new eux(43, 3746083);
   public static final eux S = new eux(44, 8874850);
   public static final eux T = new eux(45, 5725276);
   public static final eux U = new eux(46, 8014168);
   public static final eux V = new eux(47, 4996700);
   public static final eux W = new eux(48, 4993571);
   public static final eux X = new eux(49, 5001770);
   public static final eux Y = new eux(50, 9321518);
   public static final eux Z = new eux(51, 2430480);
   public static final eux aa = new eux(52, 12398641);
   public static final eux ab = new eux(53, 9715553);
   public static final eux ac = new eux(54, 6035741);
   public static final eux ad = new eux(55, 1474182);
   public static final eux ae = new eux(56, 3837580);
   public static final eux af = new eux(57, 5647422);
   public static final eux ag = new eux(58, 1356933);
   public static final eux ah = new eux(59, 6579300);
   public static final eux ai = new eux(60, 14200723);
   public static final eux aj = new eux(61, 8365974);
   public final int ak;
   public final int al;

   private eux(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(eux.a $$0) {
      return this == a ? 0 : axu.b(axu.f(this.ak), $$0.f);
   }

   public static eux a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static eux c(int $$0) {
      eux $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(eux.a.b($$1 & 3));
   }

   public byte b(eux.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final eux.a[] g = new eux.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(final int $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static eux.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static eux.a b(int $$0) {
         return g[$$0];
      }
   }
}
