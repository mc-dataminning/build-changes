import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record djp(String r, boolean s, boolean t, boolean u, djp.a v, ddv w, arl x, arl y, arl z, arl A, arl B, arl C, arl D, arl E) {
   private static final Map<String, djp> F = new Object2ObjectArrayMap();
   public static final Codec<djp> a = atq.a(djp::b, F::get);
   public static final djp b = a(new djp("iron", false, false, false, djp.a.a, ddv.g, arm.my, arm.mz, arm.mG, arm.mH, arm.nR, arm.nS, arm.yh, arm.yi));
   public static final djp c = a(new djp("copper", true, true, false, djp.a.a, ddv.aj, arm.fk, arm.fl, arm.fr, arm.fs, arm.nR, arm.nS, arm.yh, arm.yi));
   public static final djp d = a(new djp("gold", false, true, false, djp.a.a, ddv.g, arm.my, arm.mz, arm.mG, arm.mH, arm.nR, arm.nS, arm.yh, arm.yi));
   public static final djp e = a(new djp("stone", true, true, false, djp.a.b, ddv.f, arm.my, arm.mz, arm.mG, arm.mH, arm.ym, arm.yn, arm.yh, arm.yi));
   public static final djp f = a(
      new djp("polished_blackstone", true, true, false, djp.a.b, ddv.f, arm.my, arm.mz, arm.mG, arm.mH, arm.ym, arm.yn, arm.yh, arm.yi)
   );
   public static final djp g = a(new djp("oak"));
   public static final djp h = a(new djp("spruce"));
   public static final djp i = a(new djp("birch"));
   public static final djp j = a(new djp("acacia"));
   public static final djp k = a(new djp("cherry", true, true, true, djp.a.a, ddv.aU, arm.eg, arm.eh, arm.ei, arm.ej, arm.em, arm.en, arm.ek, arm.el));
   public static final djp l = a(new djp("jungle"));
   public static final djp m = a(new djp("dark_oak"));
   public static final djp n = a(new djp("crimson", true, true, true, djp.a.a, ddv.aT, arm.pT, arm.pU, arm.pV, arm.pW, arm.pZ, arm.qa, arm.pX, arm.pY));
   public static final djp o = a(new djp("warped", true, true, true, djp.a.a, ddv.aT, arm.pT, arm.pU, arm.pV, arm.pW, arm.pZ, arm.qa, arm.pX, arm.pY));
   public static final djp p = a(new djp("mangrove"));
   public static final djp q = a(new djp("bamboo", true, true, true, djp.a.a, ddv.aS, arm.aZ, arm.ba, arm.bb, arm.bc, arm.bf, arm.bg, arm.bd, arm.be));

   public djp(String $$0) {
      this($$0, true, true, true, djp.a.a, ddv.b, arm.BE, arm.BF, arm.BG, arm.BH, arm.BK, arm.BL, arm.BI, arm.BJ);
   }

   private static djp a(djp $$0) {
      F.put($$0.r, $$0);
      return $$0;
   }

   public static Stream<djp> a() {
      return F.values().stream();
   }

   public String b() {
      return this.r;
   }

   public boolean c() {
      return this.s;
   }

   public boolean d() {
      return this.t;
   }

   public boolean e() {
      return this.u;
   }

   public djp.a f() {
      return this.v;
   }

   public ddv g() {
      return this.w;
   }

   public arl h() {
      return this.x;
   }

   public arl i() {
      return this.y;
   }

   public arl j() {
      return this.z;
   }

   public arl k() {
      return this.A;
   }

   public arl l() {
      return this.B;
   }

   public arl m() {
      return this.C;
   }

   public arl n() {
      return this.D;
   }

   public arl o() {
      return this.E;
   }

   public static enum a {
      a,
      b;
   }
}
