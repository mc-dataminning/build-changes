import com.google.common.base.Preconditions;

public class etb {
   private static final etb[] am = new etb[64];
   public static final etb a = new etb(0, 0);
   public static final etb b = new etb(1, 8368696);
   public static final etb c = new etb(2, 16247203);
   public static final etb d = new etb(3, 13092807);
   public static final etb e = new etb(4, 16711680);
   public static final etb f = new etb(5, 10526975);
   public static final etb g = new etb(6, 10987431);
   public static final etb h = new etb(7, 31744);
   public static final etb i = new etb(8, 16777215);
   public static final etb j = new etb(9, 10791096);
   public static final etb k = new etb(10, 9923917);
   public static final etb l = new etb(11, 7368816);
   public static final etb m = new etb(12, 4210943);
   public static final etb n = new etb(13, 9402184);
   public static final etb o = new etb(14, 16776437);
   public static final etb p = new etb(15, 14188339);
   public static final etb q = new etb(16, 11685080);
   public static final etb r = new etb(17, 6724056);
   public static final etb s = new etb(18, 15066419);
   public static final etb t = new etb(19, 8375321);
   public static final etb u = new etb(20, 15892389);
   public static final etb v = new etb(21, 5000268);
   public static final etb w = new etb(22, 10066329);
   public static final etb x = new etb(23, 5013401);
   public static final etb y = new etb(24, 8339378);
   public static final etb z = new etb(25, 3361970);
   public static final etb A = new etb(26, 6704179);
   public static final etb B = new etb(27, 6717235);
   public static final etb C = new etb(28, 10040115);
   public static final etb D = new etb(29, 1644825);
   public static final etb E = new etb(30, 16445005);
   public static final etb F = new etb(31, 6085589);
   public static final etb G = new etb(32, 4882687);
   public static final etb H = new etb(33, 55610);
   public static final etb I = new etb(34, 8476209);
   public static final etb J = new etb(35, 7340544);
   public static final etb K = new etb(36, 13742497);
   public static final etb L = new etb(37, 10441252);
   public static final etb M = new etb(38, 9787244);
   public static final etb N = new etb(39, 7367818);
   public static final etb O = new etb(40, 12223780);
   public static final etb P = new etb(41, 6780213);
   public static final etb Q = new etb(42, 10505550);
   public static final etb R = new etb(43, 3746083);
   public static final etb S = new etb(44, 8874850);
   public static final etb T = new etb(45, 5725276);
   public static final etb U = new etb(46, 8014168);
   public static final etb V = new etb(47, 4996700);
   public static final etb W = new etb(48, 4993571);
   public static final etb X = new etb(49, 5001770);
   public static final etb Y = new etb(50, 9321518);
   public static final etb Z = new etb(51, 2430480);
   public static final etb aa = new etb(52, 12398641);
   public static final etb ab = new etb(53, 9715553);
   public static final etb ac = new etb(54, 6035741);
   public static final etb ad = new etb(55, 1474182);
   public static final etb ae = new etb(56, 3837580);
   public static final etb af = new etb(57, 5647422);
   public static final etb ag = new etb(58, 1356933);
   public static final etb ah = new etb(59, 6579300);
   public static final etb ai = new etb(60, 14200723);
   public static final etb aj = new etb(61, 8365974);
   public final int ak;
   public final int al;

   private etb(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(etb.a $$0) {
      return this == a ? 0 : axj.b(axj.f(this.ak), $$0.f);
   }

   public static etb a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static etb c(int $$0) {
      etb $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(etb.a.b($$1 & 3));
   }

   public byte b(etb.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final etb.a[] g = new etb.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(final int $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static etb.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static etb.a b(int $$0) {
         return g[$$0];
      }
   }
}
