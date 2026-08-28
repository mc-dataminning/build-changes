import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record ecf(String s, boolean t, boolean u, boolean v, ecf.a w, dvl x, awx y, awx z, awx A, awx B, awx C, awx D, awx E, awx F) {
   private static final Map<String, ecf> G = new Object2ObjectArrayMap();
   public static final Codec<ecf> a = Codec.stringResolver(ecf::b, G::get);
   public static final ecf b = a(new ecf("iron", false, false, false, ecf.a.a, dvl.bp, awy.nT, awy.nU, awy.ob, awy.oc, awy.pu, awy.pv, awy.Ai, awy.Aj));
   public static final ecf c = a(new ecf("copper", true, true, false, ecf.a.a, dvl.aj, awy.fR, awy.fS, awy.fY, awy.fZ, awy.pu, awy.pv, awy.Ai, awy.Aj));
   public static final ecf d = a(new ecf("gold", false, true, false, ecf.a.a, dvl.g, awy.nT, awy.nU, awy.ob, awy.oc, awy.pu, awy.pv, awy.Ai, awy.Aj));
   public static final ecf e = a(new ecf("stone", true, true, false, ecf.a.b, dvl.f, awy.nT, awy.nU, awy.ob, awy.oc, awy.An, awy.Ao, awy.Ai, awy.Aj));
   public static final ecf f = a(
      new ecf("polished_blackstone", true, true, false, ecf.a.b, dvl.f, awy.nT, awy.nU, awy.ob, awy.oc, awy.An, awy.Ao, awy.Ai, awy.Aj)
   );
   public static final ecf g = a(new ecf("oak"));
   public static final ecf h = a(new ecf("spruce"));
   public static final ecf i = a(new ecf("birch"));
   public static final ecf j = a(new ecf("acacia"));
   public static final ecf k = a(new ecf("cherry", true, true, true, ecf.a.a, dvl.aW, awy.eI, awy.eJ, awy.eK, awy.eL, awy.eO, awy.eP, awy.eM, awy.eN));
   public static final ecf l = a(new ecf("jungle"));
   public static final ecf m = a(new ecf("dark_oak"));
   public static final ecf n = a(new ecf("pale_oak"));
   public static final ecf o = a(new ecf("crimson", true, true, true, ecf.a.a, dvl.aV, awy.rA, awy.rB, awy.rC, awy.rD, awy.rG, awy.rH, awy.rE, awy.rF));
   public static final ecf p = a(new ecf("warped", true, true, true, ecf.a.a, dvl.aV, awy.rA, awy.rB, awy.rC, awy.rD, awy.rG, awy.rH, awy.rE, awy.rF));
   public static final ecf q = a(new ecf("mangrove"));
   public static final ecf r = a(new ecf("bamboo", true, true, true, ecf.a.a, dvl.aU, awy.bo, awy.bp, awy.bq, awy.br, awy.bu, awy.bv, awy.bs, awy.bt));

   public ecf(String $$0) {
      this($$0, true, true, true, ecf.a.a, dvl.b, awy.DT, awy.DU, awy.DV, awy.DW, awy.DZ, awy.Ea, awy.DX, awy.DY);
   }

   private static ecf a(ecf $$0) {
      G.put($$0.s, $$0);
      return $$0;
   }

   public static Stream<ecf> a() {
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

   public ecf.a f() {
      return this.w;
   }

   public dvl g() {
      return this.x;
   }

   public awx h() {
      return this.y;
   }

   public awx i() {
      return this.z;
   }

   public awx j() {
      return this.A;
   }

   public awx k() {
      return this.B;
   }

   public awx l() {
      return this.C;
   }

   public awx m() {
      return this.D;
   }

   public awx n() {
      return this.E;
   }

   public awx o() {
      return this.F;
   }

   public static enum a {
      a,
      b;
   }
}
