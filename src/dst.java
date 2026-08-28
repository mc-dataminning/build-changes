import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dst(String r, boolean s, boolean t, boolean u, dst.a v, dmo w, avz x, avz y, avz z, avz A, avz B, avz C, avz D, avz E) {
   private static final Map<String, dst> F = new Object2ObjectArrayMap();
   public static final Codec<dst> a = Codec.stringResolver(dst::b, F::get);
   public static final dst b = a(new dst("iron", false, false, false, dst.a.a, dmo.g, awa.nm, awa.nn, awa.nu, awa.nv, awa.oI, awa.oJ, awa.zb, awa.zc));
   public static final dst c = a(new dst("copper", true, true, false, dst.a.a, dmo.aj, awa.fN, awa.fO, awa.fU, awa.fV, awa.oI, awa.oJ, awa.zb, awa.zc));
   public static final dst d = a(new dst("gold", false, true, false, dst.a.a, dmo.g, awa.nm, awa.nn, awa.nu, awa.nv, awa.oI, awa.oJ, awa.zb, awa.zc));
   public static final dst e = a(new dst("stone", true, true, false, dst.a.b, dmo.f, awa.nm, awa.nn, awa.nu, awa.nv, awa.zg, awa.zh, awa.zb, awa.zc));
   public static final dst f = a(
      new dst("polished_blackstone", true, true, false, dst.a.b, dmo.f, awa.nm, awa.nn, awa.nu, awa.nv, awa.zg, awa.zh, awa.zb, awa.zc)
   );
   public static final dst g = a(new dst("oak"));
   public static final dst h = a(new dst("spruce"));
   public static final dst i = a(new dst("birch"));
   public static final dst j = a(new dst("acacia"));
   public static final dst k = a(new dst("cherry", true, true, true, dst.a.a, dmo.aU, awa.eE, awa.eF, awa.eG, awa.eH, awa.eK, awa.eL, awa.eI, awa.eJ));
   public static final dst l = a(new dst("jungle"));
   public static final dst m = a(new dst("dark_oak"));
   public static final dst n = a(new dst("crimson", true, true, true, dst.a.a, dmo.aT, awa.qL, awa.qM, awa.qN, awa.qO, awa.qR, awa.qS, awa.qP, awa.qQ));
   public static final dst o = a(new dst("warped", true, true, true, dst.a.a, dmo.aT, awa.qL, awa.qM, awa.qN, awa.qO, awa.qR, awa.qS, awa.qP, awa.qQ));
   public static final dst p = a(new dst("mangrove"));
   public static final dst q = a(new dst("bamboo", true, true, true, dst.a.a, dmo.aS, awa.bo, awa.bp, awa.bq, awa.br, awa.bu, awa.bv, awa.bs, awa.bt));

   public dst(String $$0) {
      this($$0, true, true, true, dst.a.a, dmo.b, awa.CR, awa.CS, awa.CT, awa.CU, awa.CX, awa.CY, awa.CV, awa.CW);
   }

   private static dst a(dst $$0) {
      F.put($$0.r, $$0);
      return $$0;
   }

   public static Stream<dst> a() {
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

   public dst.a f() {
      return this.v;
   }

   public dmo g() {
      return this.w;
   }

   public avz h() {
      return this.x;
   }

   public avz i() {
      return this.y;
   }

   public avz j() {
      return this.z;
   }

   public avz k() {
      return this.A;
   }

   public avz l() {
      return this.B;
   }

   public avz m() {
      return this.C;
   }

   public avz n() {
      return this.D;
   }

   public avz o() {
      return this.E;
   }

   public static enum a {
      a,
      b;
   }
}
