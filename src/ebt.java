import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record ebt(String s, boolean t, boolean u, boolean v, ebt.a w, duz x, awo y, awo z, awo A, awo B, awo C, awo D, awo E, awo F) {
   private static final Map<String, ebt> G = new Object2ObjectArrayMap();
   public static final Codec<ebt> a = Codec.stringResolver(ebt::b, G::get);
   public static final ebt b = a(new ebt("iron", false, false, false, ebt.a.a, duz.bp, awp.nT, awp.nU, awp.ob, awp.oc, awp.pu, awp.pv, awp.Ai, awp.Aj));
   public static final ebt c = a(new ebt("copper", true, true, false, ebt.a.a, duz.aj, awp.fR, awp.fS, awp.fY, awp.fZ, awp.pu, awp.pv, awp.Ai, awp.Aj));
   public static final ebt d = a(new ebt("gold", false, true, false, ebt.a.a, duz.g, awp.nT, awp.nU, awp.ob, awp.oc, awp.pu, awp.pv, awp.Ai, awp.Aj));
   public static final ebt e = a(new ebt("stone", true, true, false, ebt.a.b, duz.f, awp.nT, awp.nU, awp.ob, awp.oc, awp.An, awp.Ao, awp.Ai, awp.Aj));
   public static final ebt f = a(
      new ebt("polished_blackstone", true, true, false, ebt.a.b, duz.f, awp.nT, awp.nU, awp.ob, awp.oc, awp.An, awp.Ao, awp.Ai, awp.Aj)
   );
   public static final ebt g = a(new ebt("oak"));
   public static final ebt h = a(new ebt("spruce"));
   public static final ebt i = a(new ebt("birch"));
   public static final ebt j = a(new ebt("acacia"));
   public static final ebt k = a(new ebt("cherry", true, true, true, ebt.a.a, duz.aW, awp.eI, awp.eJ, awp.eK, awp.eL, awp.eO, awp.eP, awp.eM, awp.eN));
   public static final ebt l = a(new ebt("jungle"));
   public static final ebt m = a(new ebt("dark_oak"));
   public static final ebt n = a(new ebt("pale_oak"));
   public static final ebt o = a(new ebt("crimson", true, true, true, ebt.a.a, duz.aV, awp.rA, awp.rB, awp.rC, awp.rD, awp.rG, awp.rH, awp.rE, awp.rF));
   public static final ebt p = a(new ebt("warped", true, true, true, ebt.a.a, duz.aV, awp.rA, awp.rB, awp.rC, awp.rD, awp.rG, awp.rH, awp.rE, awp.rF));
   public static final ebt q = a(new ebt("mangrove"));
   public static final ebt r = a(new ebt("bamboo", true, true, true, ebt.a.a, duz.aU, awp.bo, awp.bp, awp.bq, awp.br, awp.bu, awp.bv, awp.bs, awp.bt));

   public ebt(String $$0) {
      this($$0, true, true, true, ebt.a.a, duz.b, awp.DT, awp.DU, awp.DV, awp.DW, awp.DZ, awp.Ea, awp.DX, awp.DY);
   }

   private static ebt a(ebt $$0) {
      G.put($$0.s, $$0);
      return $$0;
   }

   public static Stream<ebt> a() {
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

   public ebt.a f() {
      return this.w;
   }

   public duz g() {
      return this.x;
   }

   public awo h() {
      return this.y;
   }

   public awo i() {
      return this.z;
   }

   public awo j() {
      return this.A;
   }

   public awo k() {
      return this.B;
   }

   public awo l() {
      return this.C;
   }

   public awo m() {
      return this.D;
   }

   public awo n() {
      return this.E;
   }

   public awo o() {
      return this.F;
   }

   public static enum a {
      a,
      b;
   }
}
