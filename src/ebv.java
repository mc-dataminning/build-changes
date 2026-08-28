import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record ebv(String s, boolean t, boolean u, boolean v, ebv.a w, dvb x, awq y, awq z, awq A, awq B, awq C, awq D, awq E, awq F) {
   private static final Map<String, ebv> G = new Object2ObjectArrayMap();
   public static final Codec<ebv> a = Codec.stringResolver(ebv::b, G::get);
   public static final ebv b = a(new ebv("iron", false, false, false, ebv.a.a, dvb.bp, awr.nT, awr.nU, awr.ob, awr.oc, awr.pu, awr.pv, awr.Ai, awr.Aj));
   public static final ebv c = a(new ebv("copper", true, true, false, ebv.a.a, dvb.aj, awr.fR, awr.fS, awr.fY, awr.fZ, awr.pu, awr.pv, awr.Ai, awr.Aj));
   public static final ebv d = a(new ebv("gold", false, true, false, ebv.a.a, dvb.g, awr.nT, awr.nU, awr.ob, awr.oc, awr.pu, awr.pv, awr.Ai, awr.Aj));
   public static final ebv e = a(new ebv("stone", true, true, false, ebv.a.b, dvb.f, awr.nT, awr.nU, awr.ob, awr.oc, awr.An, awr.Ao, awr.Ai, awr.Aj));
   public static final ebv f = a(
      new ebv("polished_blackstone", true, true, false, ebv.a.b, dvb.f, awr.nT, awr.nU, awr.ob, awr.oc, awr.An, awr.Ao, awr.Ai, awr.Aj)
   );
   public static final ebv g = a(new ebv("oak"));
   public static final ebv h = a(new ebv("spruce"));
   public static final ebv i = a(new ebv("birch"));
   public static final ebv j = a(new ebv("acacia"));
   public static final ebv k = a(new ebv("cherry", true, true, true, ebv.a.a, dvb.aW, awr.eI, awr.eJ, awr.eK, awr.eL, awr.eO, awr.eP, awr.eM, awr.eN));
   public static final ebv l = a(new ebv("jungle"));
   public static final ebv m = a(new ebv("dark_oak"));
   public static final ebv n = a(new ebv("pale_oak"));
   public static final ebv o = a(new ebv("crimson", true, true, true, ebv.a.a, dvb.aV, awr.rA, awr.rB, awr.rC, awr.rD, awr.rG, awr.rH, awr.rE, awr.rF));
   public static final ebv p = a(new ebv("warped", true, true, true, ebv.a.a, dvb.aV, awr.rA, awr.rB, awr.rC, awr.rD, awr.rG, awr.rH, awr.rE, awr.rF));
   public static final ebv q = a(new ebv("mangrove"));
   public static final ebv r = a(new ebv("bamboo", true, true, true, ebv.a.a, dvb.aU, awr.bo, awr.bp, awr.bq, awr.br, awr.bu, awr.bv, awr.bs, awr.bt));

   public ebv(String $$0) {
      this($$0, true, true, true, ebv.a.a, dvb.b, awr.DT, awr.DU, awr.DV, awr.DW, awr.DZ, awr.Ea, awr.DX, awr.DY);
   }

   private static ebv a(ebv $$0) {
      G.put($$0.s, $$0);
      return $$0;
   }

   public static Stream<ebv> a() {
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

   public ebv.a f() {
      return this.w;
   }

   public dvb g() {
      return this.x;
   }

   public awq h() {
      return this.y;
   }

   public awq i() {
      return this.z;
   }

   public awq j() {
      return this.A;
   }

   public awq k() {
      return this.B;
   }

   public awq l() {
      return this.C;
   }

   public awq m() {
      return this.D;
   }

   public awq n() {
      return this.E;
   }

   public awq o() {
      return this.F;
   }

   public static enum a {
      a,
      b;
   }
}
