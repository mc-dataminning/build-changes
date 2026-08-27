import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dqw(String r, boolean s, boolean t, boolean u, dqw.a v, dkr w, avb x, avb y, avb z, avb A, avb B, avb C, avb D, avb E) {
   private static final Map<String, dqw> F = new Object2ObjectArrayMap();
   public static final Codec<dqw> a = axh.a(dqw::b, F::get);
   public static final dqw b = a(new dqw("iron", false, false, false, dqw.a.a, dkr.g, avc.nc, avc.nd, avc.nk, avc.nl, avc.oy, avc.oz, avc.yQ, avc.yR));
   public static final dqw c = a(new dqw("copper", true, true, false, dqw.a.a, dkr.aj, avc.fI, avc.fJ, avc.fP, avc.fQ, avc.oy, avc.oz, avc.yQ, avc.yR));
   public static final dqw d = a(new dqw("gold", false, true, false, dqw.a.a, dkr.g, avc.nc, avc.nd, avc.nk, avc.nl, avc.oy, avc.oz, avc.yQ, avc.yR));
   public static final dqw e = a(new dqw("stone", true, true, false, dqw.a.b, dkr.f, avc.nc, avc.nd, avc.nk, avc.nl, avc.yV, avc.yW, avc.yQ, avc.yR));
   public static final dqw f = a(
      new dqw("polished_blackstone", true, true, false, dqw.a.b, dkr.f, avc.nc, avc.nd, avc.nk, avc.nl, avc.yV, avc.yW, avc.yQ, avc.yR)
   );
   public static final dqw g = a(new dqw("oak"));
   public static final dqw h = a(new dqw("spruce"));
   public static final dqw i = a(new dqw("birch"));
   public static final dqw j = a(new dqw("acacia"));
   public static final dqw k = a(new dqw("cherry", true, true, true, dqw.a.a, dkr.aU, avc.eE, avc.eF, avc.eG, avc.eH, avc.eK, avc.eL, avc.eI, avc.eJ));
   public static final dqw l = a(new dqw("jungle"));
   public static final dqw m = a(new dqw("dark_oak"));
   public static final dqw n = a(new dqw("crimson", true, true, true, dqw.a.a, dkr.aT, avc.qB, avc.qC, avc.qD, avc.qE, avc.qH, avc.qI, avc.qF, avc.qG));
   public static final dqw o = a(new dqw("warped", true, true, true, dqw.a.a, dkr.aT, avc.qB, avc.qC, avc.qD, avc.qE, avc.qH, avc.qI, avc.qF, avc.qG));
   public static final dqw p = a(new dqw("mangrove"));
   public static final dqw q = a(new dqw("bamboo", true, true, true, dqw.a.a, dkr.aS, avc.bo, avc.bp, avc.bq, avc.br, avc.bu, avc.bv, avc.bs, avc.bt));

   public dqw(String $$0) {
      this($$0, true, true, true, dqw.a.a, dkr.b, avc.CG, avc.CH, avc.CI, avc.CJ, avc.CM, avc.CN, avc.CK, avc.CL);
   }

   private static dqw a(dqw $$0) {
      F.put($$0.r, $$0);
      return $$0;
   }

   public static Stream<dqw> a() {
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

   public dqw.a f() {
      return this.v;
   }

   public dkr g() {
      return this.w;
   }

   public avb h() {
      return this.x;
   }

   public avb i() {
      return this.y;
   }

   public avb j() {
      return this.z;
   }

   public avb k() {
      return this.A;
   }

   public avb l() {
      return this.B;
   }

   public avb m() {
      return this.C;
   }

   public avb n() {
      return this.D;
   }

   public avb o() {
      return this.E;
   }

   public static enum a {
      a,
      b;
   }
}
