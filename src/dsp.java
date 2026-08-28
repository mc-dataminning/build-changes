import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dsp(String r, boolean s, boolean t, boolean u, dsp.a v, dmk w, avy x, avy y, avy z, avy A, avy B, avy C, avy D, avy E) {
   private static final Map<String, dsp> F = new Object2ObjectArrayMap();
   public static final Codec<dsp> a = Codec.stringResolver(dsp::b, F::get);
   public static final dsp b = a(new dsp("iron", false, false, false, dsp.a.a, dmk.g, avz.nm, avz.nn, avz.nu, avz.nv, avz.oI, avz.oJ, avz.zb, avz.zc));
   public static final dsp c = a(new dsp("copper", true, true, false, dsp.a.a, dmk.aj, avz.fN, avz.fO, avz.fU, avz.fV, avz.oI, avz.oJ, avz.zb, avz.zc));
   public static final dsp d = a(new dsp("gold", false, true, false, dsp.a.a, dmk.g, avz.nm, avz.nn, avz.nu, avz.nv, avz.oI, avz.oJ, avz.zb, avz.zc));
   public static final dsp e = a(new dsp("stone", true, true, false, dsp.a.b, dmk.f, avz.nm, avz.nn, avz.nu, avz.nv, avz.zg, avz.zh, avz.zb, avz.zc));
   public static final dsp f = a(
      new dsp("polished_blackstone", true, true, false, dsp.a.b, dmk.f, avz.nm, avz.nn, avz.nu, avz.nv, avz.zg, avz.zh, avz.zb, avz.zc)
   );
   public static final dsp g = a(new dsp("oak"));
   public static final dsp h = a(new dsp("spruce"));
   public static final dsp i = a(new dsp("birch"));
   public static final dsp j = a(new dsp("acacia"));
   public static final dsp k = a(new dsp("cherry", true, true, true, dsp.a.a, dmk.aU, avz.eE, avz.eF, avz.eG, avz.eH, avz.eK, avz.eL, avz.eI, avz.eJ));
   public static final dsp l = a(new dsp("jungle"));
   public static final dsp m = a(new dsp("dark_oak"));
   public static final dsp n = a(new dsp("crimson", true, true, true, dsp.a.a, dmk.aT, avz.qL, avz.qM, avz.qN, avz.qO, avz.qR, avz.qS, avz.qP, avz.qQ));
   public static final dsp o = a(new dsp("warped", true, true, true, dsp.a.a, dmk.aT, avz.qL, avz.qM, avz.qN, avz.qO, avz.qR, avz.qS, avz.qP, avz.qQ));
   public static final dsp p = a(new dsp("mangrove"));
   public static final dsp q = a(new dsp("bamboo", true, true, true, dsp.a.a, dmk.aS, avz.bo, avz.bp, avz.bq, avz.br, avz.bu, avz.bv, avz.bs, avz.bt));

   public dsp(String $$0) {
      this($$0, true, true, true, dsp.a.a, dmk.b, avz.CR, avz.CS, avz.CT, avz.CU, avz.CX, avz.CY, avz.CV, avz.CW);
   }

   private static dsp a(dsp $$0) {
      F.put($$0.r, $$0);
      return $$0;
   }

   public static Stream<dsp> a() {
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

   public dsp.a f() {
      return this.v;
   }

   public dmk g() {
      return this.w;
   }

   public avy h() {
      return this.x;
   }

   public avy i() {
      return this.y;
   }

   public avy j() {
      return this.z;
   }

   public avy k() {
      return this.A;
   }

   public avy l() {
      return this.B;
   }

   public avy m() {
      return this.C;
   }

   public avy n() {
      return this.D;
   }

   public avy o() {
      return this.E;
   }

   public static enum a {
      a,
      b;
   }
}
