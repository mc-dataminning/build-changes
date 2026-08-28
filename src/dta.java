import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dta(String r, boolean s, boolean t, boolean u, dta.a v, dmv w, avg x, avg y, avg z, avg A, avg B, avg C, avg D, avg E) {
   private static final Map<String, dta> F = new Object2ObjectArrayMap();
   public static final Codec<dta> a = Codec.stringResolver(dta::b, F::get);
   public static final dta b = a(new dta("iron", false, false, false, dta.a.a, dmv.g, avh.nm, avh.nn, avh.nu, avh.nv, avh.oI, avh.oJ, avh.ze, avh.zf));
   public static final dta c = a(new dta("copper", true, true, false, dta.a.a, dmv.aj, avh.fN, avh.fO, avh.fU, avh.fV, avh.oI, avh.oJ, avh.ze, avh.zf));
   public static final dta d = a(new dta("gold", false, true, false, dta.a.a, dmv.g, avh.nm, avh.nn, avh.nu, avh.nv, avh.oI, avh.oJ, avh.ze, avh.zf));
   public static final dta e = a(new dta("stone", true, true, false, dta.a.b, dmv.f, avh.nm, avh.nn, avh.nu, avh.nv, avh.zj, avh.zk, avh.ze, avh.zf));
   public static final dta f = a(
      new dta("polished_blackstone", true, true, false, dta.a.b, dmv.f, avh.nm, avh.nn, avh.nu, avh.nv, avh.zj, avh.zk, avh.ze, avh.zf)
   );
   public static final dta g = a(new dta("oak"));
   public static final dta h = a(new dta("spruce"));
   public static final dta i = a(new dta("birch"));
   public static final dta j = a(new dta("acacia"));
   public static final dta k = a(new dta("cherry", true, true, true, dta.a.a, dmv.aU, avh.eE, avh.eF, avh.eG, avh.eH, avh.eK, avh.eL, avh.eI, avh.eJ));
   public static final dta l = a(new dta("jungle"));
   public static final dta m = a(new dta("dark_oak"));
   public static final dta n = a(new dta("crimson", true, true, true, dta.a.a, dmv.aT, avh.qO, avh.qP, avh.qQ, avh.qR, avh.qU, avh.qV, avh.qS, avh.qT));
   public static final dta o = a(new dta("warped", true, true, true, dta.a.a, dmv.aT, avh.qO, avh.qP, avh.qQ, avh.qR, avh.qU, avh.qV, avh.qS, avh.qT));
   public static final dta p = a(new dta("mangrove"));
   public static final dta q = a(new dta("bamboo", true, true, true, dta.a.a, dmv.aS, avh.bo, avh.bp, avh.bq, avh.br, avh.bu, avh.bv, avh.bs, avh.bt));

   public dta(String $$0) {
      this($$0, true, true, true, dta.a.a, dmv.b, avh.CU, avh.CV, avh.CW, avh.CX, avh.Da, avh.Db, avh.CY, avh.CZ);
   }

   private static dta a(dta $$0) {
      F.put($$0.r, $$0);
      return $$0;
   }

   public static Stream<dta> a() {
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

   public dta.a f() {
      return this.v;
   }

   public dmv g() {
      return this.w;
   }

   public avg h() {
      return this.x;
   }

   public avg i() {
      return this.y;
   }

   public avg j() {
      return this.z;
   }

   public avg k() {
      return this.A;
   }

   public avg l() {
      return this.B;
   }

   public avg m() {
      return this.C;
   }

   public avg n() {
      return this.D;
   }

   public avg o() {
      return this.E;
   }

   public static enum a {
      a,
      b;
   }
}
