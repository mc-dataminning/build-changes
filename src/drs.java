import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record drs(String r, boolean s, boolean t, boolean u, drs.a v, dln w, avh x, avh y, avh z, avh A, avh B, avh C, avh D, avh E) {
   private static final Map<String, drs> F = new Object2ObjectArrayMap();
   public static final Codec<drs> a = Codec.stringResolver(drs::b, F::get);
   public static final drs b = a(new drs("iron", false, false, false, drs.a.a, dln.g, avi.nm, avi.nn, avi.nu, avi.nv, avi.oI, avi.oJ, avi.zb, avi.zc));
   public static final drs c = a(new drs("copper", true, true, false, drs.a.a, dln.aj, avi.fN, avi.fO, avi.fU, avi.fV, avi.oI, avi.oJ, avi.zb, avi.zc));
   public static final drs d = a(new drs("gold", false, true, false, drs.a.a, dln.g, avi.nm, avi.nn, avi.nu, avi.nv, avi.oI, avi.oJ, avi.zb, avi.zc));
   public static final drs e = a(new drs("stone", true, true, false, drs.a.b, dln.f, avi.nm, avi.nn, avi.nu, avi.nv, avi.zg, avi.zh, avi.zb, avi.zc));
   public static final drs f = a(
      new drs("polished_blackstone", true, true, false, drs.a.b, dln.f, avi.nm, avi.nn, avi.nu, avi.nv, avi.zg, avi.zh, avi.zb, avi.zc)
   );
   public static final drs g = a(new drs("oak"));
   public static final drs h = a(new drs("spruce"));
   public static final drs i = a(new drs("birch"));
   public static final drs j = a(new drs("acacia"));
   public static final drs k = a(new drs("cherry", true, true, true, drs.a.a, dln.aU, avi.eE, avi.eF, avi.eG, avi.eH, avi.eK, avi.eL, avi.eI, avi.eJ));
   public static final drs l = a(new drs("jungle"));
   public static final drs m = a(new drs("dark_oak"));
   public static final drs n = a(new drs("crimson", true, true, true, drs.a.a, dln.aT, avi.qL, avi.qM, avi.qN, avi.qO, avi.qR, avi.qS, avi.qP, avi.qQ));
   public static final drs o = a(new drs("warped", true, true, true, drs.a.a, dln.aT, avi.qL, avi.qM, avi.qN, avi.qO, avi.qR, avi.qS, avi.qP, avi.qQ));
   public static final drs p = a(new drs("mangrove"));
   public static final drs q = a(new drs("bamboo", true, true, true, drs.a.a, dln.aS, avi.bo, avi.bp, avi.bq, avi.br, avi.bu, avi.bv, avi.bs, avi.bt));

   public drs(String $$0) {
      this($$0, true, true, true, drs.a.a, dln.b, avi.CR, avi.CS, avi.CT, avi.CU, avi.CX, avi.CY, avi.CV, avi.CW);
   }

   private static drs a(drs $$0) {
      F.put($$0.r, $$0);
      return $$0;
   }

   public static Stream<drs> a() {
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

   public drs.a f() {
      return this.v;
   }

   public dln g() {
      return this.w;
   }

   public avh h() {
      return this.x;
   }

   public avh i() {
      return this.y;
   }

   public avh j() {
      return this.z;
   }

   public avh k() {
      return this.A;
   }

   public avh l() {
      return this.B;
   }

   public avh m() {
      return this.C;
   }

   public avh n() {
      return this.D;
   }

   public avh o() {
      return this.E;
   }

   public static enum a {
      a,
      b;
   }
}
