import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dvh(String r, boolean s, boolean t, boolean u, dvh.a v, dpa w, awf x, awf y, awf z, awf A, awf B, awf C, awf D, awf E) {
   private static final Map<String, dvh> F = new Object2ObjectArrayMap();
   public static final Codec<dvh> a = Codec.stringResolver(dvh::b, F::get);
   public static final dvh b = a(new dvh("iron", false, false, false, dvh.a.a, dpa.g, awg.nn, awg.no, awg.nv, awg.nw, awg.oJ, awg.oK, awg.zk, awg.zl));
   public static final dvh c = a(new dvh("copper", true, true, false, dvh.a.a, dpa.aj, awg.fO, awg.fP, awg.fV, awg.fW, awg.oJ, awg.oK, awg.zk, awg.zl));
   public static final dvh d = a(new dvh("gold", false, true, false, dvh.a.a, dpa.g, awg.nn, awg.no, awg.nv, awg.nw, awg.oJ, awg.oK, awg.zk, awg.zl));
   public static final dvh e = a(new dvh("stone", true, true, false, dvh.a.b, dpa.f, awg.nn, awg.no, awg.nv, awg.nw, awg.zp, awg.zq, awg.zk, awg.zl));
   public static final dvh f = a(
      new dvh("polished_blackstone", true, true, false, dvh.a.b, dpa.f, awg.nn, awg.no, awg.nv, awg.nw, awg.zp, awg.zq, awg.zk, awg.zl)
   );
   public static final dvh g = a(new dvh("oak"));
   public static final dvh h = a(new dvh("spruce"));
   public static final dvh i = a(new dvh("birch"));
   public static final dvh j = a(new dvh("acacia"));
   public static final dvh k = a(new dvh("cherry", true, true, true, dvh.a.a, dpa.aU, awg.eF, awg.eG, awg.eH, awg.eI, awg.eL, awg.eM, awg.eJ, awg.eK));
   public static final dvh l = a(new dvh("jungle"));
   public static final dvh m = a(new dvh("dark_oak"));
   public static final dvh n = a(new dvh("crimson", true, true, true, dvh.a.a, dpa.aT, awg.qP, awg.qQ, awg.qR, awg.qS, awg.qV, awg.qW, awg.qT, awg.qU));
   public static final dvh o = a(new dvh("warped", true, true, true, dvh.a.a, dpa.aT, awg.qP, awg.qQ, awg.qR, awg.qS, awg.qV, awg.qW, awg.qT, awg.qU));
   public static final dvh p = a(new dvh("mangrove"));
   public static final dvh q = a(new dvh("bamboo", true, true, true, dvh.a.a, dpa.aS, awg.bo, awg.bp, awg.bq, awg.br, awg.bu, awg.bv, awg.bs, awg.bt));

   public dvh(String $$0) {
      this($$0, true, true, true, dvh.a.a, dpa.b, awg.Db, awg.Dc, awg.Dd, awg.De, awg.Dh, awg.Di, awg.Df, awg.Dg);
   }

   private static dvh a(dvh $$0) {
      F.put($$0.r, $$0);
      return $$0;
   }

   public static Stream<dvh> a() {
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

   public dvh.a f() {
      return this.v;
   }

   public dpa g() {
      return this.w;
   }

   public awf h() {
      return this.x;
   }

   public awf i() {
      return this.y;
   }

   public awf j() {
      return this.z;
   }

   public awf k() {
      return this.A;
   }

   public awf l() {
      return this.B;
   }

   public awf m() {
      return this.C;
   }

   public awf n() {
      return this.D;
   }

   public awf o() {
      return this.E;
   }

   public static enum a {
      a,
      b;
   }
}
