import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dsm(String r, boolean s, boolean t, boolean u, dsm.a v, dmh w, avv x, avv y, avv z, avv A, avv B, avv C, avv D, avv E) {
   private static final Map<String, dsm> F = new Object2ObjectArrayMap();
   public static final Codec<dsm> a = Codec.stringResolver(dsm::b, F::get);
   public static final dsm b = a(new dsm("iron", false, false, false, dsm.a.a, dmh.g, avw.nm, avw.nn, avw.nu, avw.nv, avw.oI, avw.oJ, avw.zb, avw.zc));
   public static final dsm c = a(new dsm("copper", true, true, false, dsm.a.a, dmh.aj, avw.fN, avw.fO, avw.fU, avw.fV, avw.oI, avw.oJ, avw.zb, avw.zc));
   public static final dsm d = a(new dsm("gold", false, true, false, dsm.a.a, dmh.g, avw.nm, avw.nn, avw.nu, avw.nv, avw.oI, avw.oJ, avw.zb, avw.zc));
   public static final dsm e = a(new dsm("stone", true, true, false, dsm.a.b, dmh.f, avw.nm, avw.nn, avw.nu, avw.nv, avw.zg, avw.zh, avw.zb, avw.zc));
   public static final dsm f = a(
      new dsm("polished_blackstone", true, true, false, dsm.a.b, dmh.f, avw.nm, avw.nn, avw.nu, avw.nv, avw.zg, avw.zh, avw.zb, avw.zc)
   );
   public static final dsm g = a(new dsm("oak"));
   public static final dsm h = a(new dsm("spruce"));
   public static final dsm i = a(new dsm("birch"));
   public static final dsm j = a(new dsm("acacia"));
   public static final dsm k = a(new dsm("cherry", true, true, true, dsm.a.a, dmh.aU, avw.eE, avw.eF, avw.eG, avw.eH, avw.eK, avw.eL, avw.eI, avw.eJ));
   public static final dsm l = a(new dsm("jungle"));
   public static final dsm m = a(new dsm("dark_oak"));
   public static final dsm n = a(new dsm("crimson", true, true, true, dsm.a.a, dmh.aT, avw.qL, avw.qM, avw.qN, avw.qO, avw.qR, avw.qS, avw.qP, avw.qQ));
   public static final dsm o = a(new dsm("warped", true, true, true, dsm.a.a, dmh.aT, avw.qL, avw.qM, avw.qN, avw.qO, avw.qR, avw.qS, avw.qP, avw.qQ));
   public static final dsm p = a(new dsm("mangrove"));
   public static final dsm q = a(new dsm("bamboo", true, true, true, dsm.a.a, dmh.aS, avw.bo, avw.bp, avw.bq, avw.br, avw.bu, avw.bv, avw.bs, avw.bt));

   public dsm(String $$0) {
      this($$0, true, true, true, dsm.a.a, dmh.b, avw.CR, avw.CS, avw.CT, avw.CU, avw.CX, avw.CY, avw.CV, avw.CW);
   }

   private static dsm a(dsm $$0) {
      F.put($$0.r, $$0);
      return $$0;
   }

   public static Stream<dsm> a() {
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

   public dsm.a f() {
      return this.v;
   }

   public dmh g() {
      return this.w;
   }

   public avv h() {
      return this.x;
   }

   public avv i() {
      return this.y;
   }

   public avv j() {
      return this.z;
   }

   public avv k() {
      return this.A;
   }

   public avv l() {
      return this.B;
   }

   public avv m() {
      return this.C;
   }

   public avv n() {
      return this.D;
   }

   public avv o() {
      return this.E;
   }

   public static enum a {
      a,
      b;
   }
}
