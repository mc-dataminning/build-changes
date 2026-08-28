import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dyf(String s, boolean t, boolean u, boolean v, dyf.a w, drx x, avz y, avz z, avz A, avz B, avz C, avz D, avz E, avz F) {
   private static final Map<String, dyf> G = new Object2ObjectArrayMap();
   public static final Codec<dyf> a = Codec.stringResolver(dyf::b, G::get);
   public static final dyf b = a(new dyf("iron", false, false, false, dyf.a.a, drx.bo, awa.nP, awa.nQ, awa.nX, awa.nY, awa.pq, awa.pr, awa.Ac, awa.Ad));
   public static final dyf c = a(new dyf("copper", true, true, false, dyf.a.a, drx.aj, awa.fP, awa.fQ, awa.fW, awa.fX, awa.pq, awa.pr, awa.Ac, awa.Ad));
   public static final dyf d = a(new dyf("gold", false, true, false, dyf.a.a, drx.g, awa.nP, awa.nQ, awa.nX, awa.nY, awa.pq, awa.pr, awa.Ac, awa.Ad));
   public static final dyf e = a(new dyf("stone", true, true, false, dyf.a.b, drx.f, awa.nP, awa.nQ, awa.nX, awa.nY, awa.Ah, awa.Ai, awa.Ac, awa.Ad));
   public static final dyf f = a(
      new dyf("polished_blackstone", true, true, false, dyf.a.b, drx.f, awa.nP, awa.nQ, awa.nX, awa.nY, awa.Ah, awa.Ai, awa.Ac, awa.Ad)
   );
   public static final dyf g = a(new dyf("oak"));
   public static final dyf h = a(new dyf("spruce"));
   public static final dyf i = a(new dyf("birch"));
   public static final dyf j = a(new dyf("acacia"));
   public static final dyf k = a(new dyf("cherry", true, true, true, dyf.a.a, drx.aV, awa.eG, awa.eH, awa.eI, awa.eJ, awa.eM, awa.eN, awa.eK, awa.eL));
   public static final dyf l = a(new dyf("jungle"));
   public static final dyf m = a(new dyf("dark_oak"));
   public static final dyf n = a(new dyf("pale_oak"));
   public static final dyf o = a(new dyf("crimson", true, true, true, dyf.a.a, drx.aU, awa.rw, awa.rx, awa.ry, awa.rz, awa.rC, awa.rD, awa.rA, awa.rB));
   public static final dyf p = a(new dyf("warped", true, true, true, dyf.a.a, drx.aU, awa.rw, awa.rx, awa.ry, awa.rz, awa.rC, awa.rD, awa.rA, awa.rB));
   public static final dyf q = a(new dyf("mangrove"));
   public static final dyf r = a(new dyf("bamboo", true, true, true, dyf.a.a, drx.aT, awa.bo, awa.bp, awa.bq, awa.br, awa.bu, awa.bv, awa.bs, awa.bt));

   public dyf(String $$0) {
      this($$0, true, true, true, dyf.a.a, drx.b, awa.DT, awa.DU, awa.DV, awa.DW, awa.DZ, awa.Ea, awa.DX, awa.DY);
   }

   private static dyf a(dyf $$0) {
      G.put($$0.s, $$0);
      return $$0;
   }

   public static Stream<dyf> a() {
      return G.values().stream();
   }

   public String b() {
      return this.s;
   }

   public boolean c() {
      return this.t;
   }

   public boolean d() {
      return this.u;
   }

   public boolean e() {
      return this.v;
   }

   public dyf.a f() {
      return this.w;
   }

   public drx g() {
      return this.x;
   }

   public avz h() {
      return this.y;
   }

   public avz i() {
      return this.z;
   }

   public avz j() {
      return this.A;
   }

   public avz k() {
      return this.B;
   }

   public avz l() {
      return this.C;
   }

   public avz m() {
      return this.D;
   }

   public avz n() {
      return this.E;
   }

   public avz o() {
      return this.F;
   }

   public static enum a {
      a,
      b;
   }
}
