import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dvd(String r, boolean s, boolean t, boolean u, dvd.a v, dox w, awd x, awd y, awd z, awd A, awd B, awd C, awd D, awd E) {
   private static final Map<String, dvd> F = new Object2ObjectArrayMap();
   public static final Codec<dvd> a = Codec.stringResolver(dvd::b, F::get);
   public static final dvd b = a(new dvd("iron", false, false, false, dvd.a.a, dox.g, awe.nn, awe.no, awe.nv, awe.nw, awe.oJ, awe.oK, awe.zk, awe.zl));
   public static final dvd c = a(new dvd("copper", true, true, false, dvd.a.a, dox.aj, awe.fO, awe.fP, awe.fV, awe.fW, awe.oJ, awe.oK, awe.zk, awe.zl));
   public static final dvd d = a(new dvd("gold", false, true, false, dvd.a.a, dox.g, awe.nn, awe.no, awe.nv, awe.nw, awe.oJ, awe.oK, awe.zk, awe.zl));
   public static final dvd e = a(new dvd("stone", true, true, false, dvd.a.b, dox.f, awe.nn, awe.no, awe.nv, awe.nw, awe.zp, awe.zq, awe.zk, awe.zl));
   public static final dvd f = a(
      new dvd("polished_blackstone", true, true, false, dvd.a.b, dox.f, awe.nn, awe.no, awe.nv, awe.nw, awe.zp, awe.zq, awe.zk, awe.zl)
   );
   public static final dvd g = a(new dvd("oak"));
   public static final dvd h = a(new dvd("spruce"));
   public static final dvd i = a(new dvd("birch"));
   public static final dvd j = a(new dvd("acacia"));
   public static final dvd k = a(new dvd("cherry", true, true, true, dvd.a.a, dox.aU, awe.eF, awe.eG, awe.eH, awe.eI, awe.eL, awe.eM, awe.eJ, awe.eK));
   public static final dvd l = a(new dvd("jungle"));
   public static final dvd m = a(new dvd("dark_oak"));
   public static final dvd n = a(new dvd("crimson", true, true, true, dvd.a.a, dox.aT, awe.qP, awe.qQ, awe.qR, awe.qS, awe.qV, awe.qW, awe.qT, awe.qU));
   public static final dvd o = a(new dvd("warped", true, true, true, dvd.a.a, dox.aT, awe.qP, awe.qQ, awe.qR, awe.qS, awe.qV, awe.qW, awe.qT, awe.qU));
   public static final dvd p = a(new dvd("mangrove"));
   public static final dvd q = a(new dvd("bamboo", true, true, true, dvd.a.a, dox.aS, awe.bo, awe.bp, awe.bq, awe.br, awe.bu, awe.bv, awe.bs, awe.bt));

   public dvd(String $$0) {
      this($$0, true, true, true, dvd.a.a, dox.b, awe.Db, awe.Dc, awe.Dd, awe.De, awe.Dh, awe.Di, awe.Df, awe.Dg);
   }

   private static dvd a(dvd $$0) {
      F.put($$0.r, $$0);
      return $$0;
   }

   public static Stream<dvd> a() {
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

   public dvd.a f() {
      return this.v;
   }

   public dox g() {
      return this.w;
   }

   public awd h() {
      return this.x;
   }

   public awd i() {
      return this.y;
   }

   public awd j() {
      return this.z;
   }

   public awd k() {
      return this.A;
   }

   public awd l() {
      return this.B;
   }

   public awd m() {
      return this.C;
   }

   public awd n() {
      return this.D;
   }

   public awd o() {
      return this.E;
   }

   public static enum a {
      a,
      b;
   }
}
