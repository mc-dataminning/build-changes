import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dup(String r, boolean s, boolean t, boolean u, dup.a v, doj w, awc x, awc y, awc z, awc A, awc B, awc C, awc D, awc E) {
   private static final Map<String, dup> F = new Object2ObjectArrayMap();
   public static final Codec<dup> a = Codec.stringResolver(dup::b, F::get);
   public static final dup b = a(new dup("iron", false, false, false, dup.a.a, doj.g, awd.nn, awd.no, awd.nv, awd.nw, awd.oJ, awd.oK, awd.zk, awd.zl));
   public static final dup c = a(new dup("copper", true, true, false, dup.a.a, doj.aj, awd.fO, awd.fP, awd.fV, awd.fW, awd.oJ, awd.oK, awd.zk, awd.zl));
   public static final dup d = a(new dup("gold", false, true, false, dup.a.a, doj.g, awd.nn, awd.no, awd.nv, awd.nw, awd.oJ, awd.oK, awd.zk, awd.zl));
   public static final dup e = a(new dup("stone", true, true, false, dup.a.b, doj.f, awd.nn, awd.no, awd.nv, awd.nw, awd.zp, awd.zq, awd.zk, awd.zl));
   public static final dup f = a(
      new dup("polished_blackstone", true, true, false, dup.a.b, doj.f, awd.nn, awd.no, awd.nv, awd.nw, awd.zp, awd.zq, awd.zk, awd.zl)
   );
   public static final dup g = a(new dup("oak"));
   public static final dup h = a(new dup("spruce"));
   public static final dup i = a(new dup("birch"));
   public static final dup j = a(new dup("acacia"));
   public static final dup k = a(new dup("cherry", true, true, true, dup.a.a, doj.aU, awd.eF, awd.eG, awd.eH, awd.eI, awd.eL, awd.eM, awd.eJ, awd.eK));
   public static final dup l = a(new dup("jungle"));
   public static final dup m = a(new dup("dark_oak"));
   public static final dup n = a(new dup("crimson", true, true, true, dup.a.a, doj.aT, awd.qP, awd.qQ, awd.qR, awd.qS, awd.qV, awd.qW, awd.qT, awd.qU));
   public static final dup o = a(new dup("warped", true, true, true, dup.a.a, doj.aT, awd.qP, awd.qQ, awd.qR, awd.qS, awd.qV, awd.qW, awd.qT, awd.qU));
   public static final dup p = a(new dup("mangrove"));
   public static final dup q = a(new dup("bamboo", true, true, true, dup.a.a, doj.aS, awd.bo, awd.bp, awd.bq, awd.br, awd.bu, awd.bv, awd.bs, awd.bt));

   public dup(String $$0) {
      this($$0, true, true, true, dup.a.a, doj.b, awd.Db, awd.Dc, awd.Dd, awd.De, awd.Dh, awd.Di, awd.Df, awd.Dg);
   }

   private static dup a(dup $$0) {
      F.put($$0.r, $$0);
      return $$0;
   }

   public static Stream<dup> a() {
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

   public dup.a f() {
      return this.v;
   }

   public doj g() {
      return this.w;
   }

   public awc h() {
      return this.x;
   }

   public awc i() {
      return this.y;
   }

   public awc j() {
      return this.z;
   }

   public awc k() {
      return this.A;
   }

   public awc l() {
      return this.B;
   }

   public awc m() {
      return this.C;
   }

   public awc n() {
      return this.D;
   }

   public awc o() {
      return this.E;
   }

   public static enum a {
      a,
      b;
   }
}
