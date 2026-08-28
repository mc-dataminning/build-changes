import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dsq(String r, boolean s, boolean t, boolean u, dsq.a v, dml w, avy x, avy y, avy z, avy A, avy B, avy C, avy D, avy E) {
   private static final Map<String, dsq> F = new Object2ObjectArrayMap();
   public static final Codec<dsq> a = Codec.stringResolver(dsq::b, F::get);
   public static final dsq b = a(new dsq("iron", false, false, false, dsq.a.a, dml.g, avz.nm, avz.nn, avz.nu, avz.nv, avz.oI, avz.oJ, avz.zb, avz.zc));
   public static final dsq c = a(new dsq("copper", true, true, false, dsq.a.a, dml.aj, avz.fN, avz.fO, avz.fU, avz.fV, avz.oI, avz.oJ, avz.zb, avz.zc));
   public static final dsq d = a(new dsq("gold", false, true, false, dsq.a.a, dml.g, avz.nm, avz.nn, avz.nu, avz.nv, avz.oI, avz.oJ, avz.zb, avz.zc));
   public static final dsq e = a(new dsq("stone", true, true, false, dsq.a.b, dml.f, avz.nm, avz.nn, avz.nu, avz.nv, avz.zg, avz.zh, avz.zb, avz.zc));
   public static final dsq f = a(
      new dsq("polished_blackstone", true, true, false, dsq.a.b, dml.f, avz.nm, avz.nn, avz.nu, avz.nv, avz.zg, avz.zh, avz.zb, avz.zc)
   );
   public static final dsq g = a(new dsq("oak"));
   public static final dsq h = a(new dsq("spruce"));
   public static final dsq i = a(new dsq("birch"));
   public static final dsq j = a(new dsq("acacia"));
   public static final dsq k = a(new dsq("cherry", true, true, true, dsq.a.a, dml.aU, avz.eE, avz.eF, avz.eG, avz.eH, avz.eK, avz.eL, avz.eI, avz.eJ));
   public static final dsq l = a(new dsq("jungle"));
   public static final dsq m = a(new dsq("dark_oak"));
   public static final dsq n = a(new dsq("crimson", true, true, true, dsq.a.a, dml.aT, avz.qL, avz.qM, avz.qN, avz.qO, avz.qR, avz.qS, avz.qP, avz.qQ));
   public static final dsq o = a(new dsq("warped", true, true, true, dsq.a.a, dml.aT, avz.qL, avz.qM, avz.qN, avz.qO, avz.qR, avz.qS, avz.qP, avz.qQ));
   public static final dsq p = a(new dsq("mangrove"));
   public static final dsq q = a(new dsq("bamboo", true, true, true, dsq.a.a, dml.aS, avz.bo, avz.bp, avz.bq, avz.br, avz.bu, avz.bv, avz.bs, avz.bt));

   public dsq(String $$0) {
      this($$0, true, true, true, dsq.a.a, dml.b, avz.CR, avz.CS, avz.CT, avz.CU, avz.CX, avz.CY, avz.CV, avz.CW);
   }

   private static dsq a(dsq $$0) {
      F.put($$0.r, $$0);
      return $$0;
   }

   public static Stream<dsq> a() {
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

   public dsq.a f() {
      return this.v;
   }

   public dml g() {
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
