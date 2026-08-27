import com.google.common.base.Preconditions;

public class eme {
   private static final eme[] am = new eme[64];
   public static final eme a = new eme(0, 0);
   public static final eme b = new eme(1, 8368696);
   public static final eme c = new eme(2, 16247203);
   public static final eme d = new eme(3, 13092807);
   public static final eme e = new eme(4, 16711680);
   public static final eme f = new eme(5, 10526975);
   public static final eme g = new eme(6, 10987431);
   public static final eme h = new eme(7, 31744);
   public static final eme i = new eme(8, 16777215);
   public static final eme j = new eme(9, 10791096);
   public static final eme k = new eme(10, 9923917);
   public static final eme l = new eme(11, 7368816);
   public static final eme m = new eme(12, 4210943);
   public static final eme n = new eme(13, 9402184);
   public static final eme o = new eme(14, 16776437);
   public static final eme p = new eme(15, 14188339);
   public static final eme q = new eme(16, 11685080);
   public static final eme r = new eme(17, 6724056);
   public static final eme s = new eme(18, 15066419);
   public static final eme t = new eme(19, 8375321);
   public static final eme u = new eme(20, 15892389);
   public static final eme v = new eme(21, 5000268);
   public static final eme w = new eme(22, 10066329);
   public static final eme x = new eme(23, 5013401);
   public static final eme y = new eme(24, 8339378);
   public static final eme z = new eme(25, 3361970);
   public static final eme A = new eme(26, 6704179);
   public static final eme B = new eme(27, 6717235);
   public static final eme C = new eme(28, 10040115);
   public static final eme D = new eme(29, 1644825);
   public static final eme E = new eme(30, 16445005);
   public static final eme F = new eme(31, 6085589);
   public static final eme G = new eme(32, 4882687);
   public static final eme H = new eme(33, 55610);
   public static final eme I = new eme(34, 8476209);
   public static final eme J = new eme(35, 7340544);
   public static final eme K = new eme(36, 13742497);
   public static final eme L = new eme(37, 10441252);
   public static final eme M = new eme(38, 9787244);
   public static final eme N = new eme(39, 7367818);
   public static final eme O = new eme(40, 12223780);
   public static final eme P = new eme(41, 6780213);
   public static final eme Q = new eme(42, 10505550);
   public static final eme R = new eme(43, 3746083);
   public static final eme S = new eme(44, 8874850);
   public static final eme T = new eme(45, 5725276);
   public static final eme U = new eme(46, 8014168);
   public static final eme V = new eme(47, 4996700);
   public static final eme W = new eme(48, 4993571);
   public static final eme X = new eme(49, 5001770);
   public static final eme Y = new eme(50, 9321518);
   public static final eme Z = new eme(51, 2430480);
   public static final eme aa = new eme(52, 12398641);
   public static final eme ab = new eme(53, 9715553);
   public static final eme ac = new eme(54, 6035741);
   public static final eme ad = new eme(55, 1474182);
   public static final eme ae = new eme(56, 3837580);
   public static final eme af = new eme(57, 5647422);
   public static final eme ag = new eme(58, 1356933);
   public static final eme ah = new eme(59, 6579300);
   public static final eme ai = new eme(60, 14200723);
   public static final eme aj = new eme(61, 8365974);
   public final int ak;
   public final int al;

   private eme(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(eme.a $$0) {
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

   public static eme a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static eme c(int $$0) {
      eme $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(eme.a.b($$1 & 3));
   }

   public byte b(eme.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final eme.a[] g = new eme.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static eme.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static eme.a b(int $$0) {
         return g[$$0];
      }
   }
}
