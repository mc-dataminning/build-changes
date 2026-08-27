import com.google.common.base.Preconditions;

public class eha {
   private static final eha[] am = new eha[64];
   public static final eha a = new eha(0, 0);
   public static final eha b = new eha(1, 8368696);
   public static final eha c = new eha(2, 16247203);
   public static final eha d = new eha(3, 13092807);
   public static final eha e = new eha(4, 16711680);
   public static final eha f = new eha(5, 10526975);
   public static final eha g = new eha(6, 10987431);
   public static final eha h = new eha(7, 31744);
   public static final eha i = new eha(8, 16777215);
   public static final eha j = new eha(9, 10791096);
   public static final eha k = new eha(10, 9923917);
   public static final eha l = new eha(11, 7368816);
   public static final eha m = new eha(12, 4210943);
   public static final eha n = new eha(13, 9402184);
   public static final eha o = new eha(14, 16776437);
   public static final eha p = new eha(15, 14188339);
   public static final eha q = new eha(16, 11685080);
   public static final eha r = new eha(17, 6724056);
   public static final eha s = new eha(18, 15066419);
   public static final eha t = new eha(19, 8375321);
   public static final eha u = new eha(20, 15892389);
   public static final eha v = new eha(21, 5000268);
   public static final eha w = new eha(22, 10066329);
   public static final eha x = new eha(23, 5013401);
   public static final eha y = new eha(24, 8339378);
   public static final eha z = new eha(25, 3361970);
   public static final eha A = new eha(26, 6704179);
   public static final eha B = new eha(27, 6717235);
   public static final eha C = new eha(28, 10040115);
   public static final eha D = new eha(29, 1644825);
   public static final eha E = new eha(30, 16445005);
   public static final eha F = new eha(31, 6085589);
   public static final eha G = new eha(32, 4882687);
   public static final eha H = new eha(33, 55610);
   public static final eha I = new eha(34, 8476209);
   public static final eha J = new eha(35, 7340544);
   public static final eha K = new eha(36, 13742497);
   public static final eha L = new eha(37, 10441252);
   public static final eha M = new eha(38, 9787244);
   public static final eha N = new eha(39, 7367818);
   public static final eha O = new eha(40, 12223780);
   public static final eha P = new eha(41, 6780213);
   public static final eha Q = new eha(42, 10505550);
   public static final eha R = new eha(43, 3746083);
   public static final eha S = new eha(44, 8874850);
   public static final eha T = new eha(45, 5725276);
   public static final eha U = new eha(46, 8014168);
   public static final eha V = new eha(47, 4996700);
   public static final eha W = new eha(48, 4993571);
   public static final eha X = new eha(49, 5001770);
   public static final eha Y = new eha(50, 9321518);
   public static final eha Z = new eha(51, 2430480);
   public static final eha aa = new eha(52, 12398641);
   public static final eha ab = new eha(53, 9715553);
   public static final eha ac = new eha(54, 6035741);
   public static final eha ad = new eha(55, 1474182);
   public static final eha ae = new eha(56, 3837580);
   public static final eha af = new eha(57, 5647422);
   public static final eha ag = new eha(58, 1356933);
   public static final eha ah = new eha(59, 6579300);
   public static final eha ai = new eha(60, 14200723);
   public static final eha aj = new eha(61, 8365974);
   public final int ak;
   public final int al;

   private eha(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(eha.a $$0) {
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

   public static eha a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static eha c(int $$0) {
      eha $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(eha.a.b($$1 & 3));
   }

   public byte b(eha.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final eha.a[] g = new eha.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static eha.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static eha.a b(int $$0) {
         return g[$$0];
      }
   }
}
