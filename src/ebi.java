import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record ebi(String s, boolean t, boolean u, boolean v, ebi.a w, duo x, awm y, awm z, awm A, awm B, awm C, awm D, awm E, awm F) {
   private static final Map<String, ebi> G = new Object2ObjectArrayMap();
   public static final Codec<ebi> a = Codec.stringResolver(ebi::b, G::get);
   public static final ebi b = a(new ebi("iron", false, false, false, ebi.a.a, duo.bp, awn.nT, awn.nU, awn.ob, awn.oc, awn.pu, awn.pv, awn.Ai, awn.Aj));
   public static final ebi c = a(new ebi("copper", true, true, false, ebi.a.a, duo.aj, awn.fR, awn.fS, awn.fY, awn.fZ, awn.pu, awn.pv, awn.Ai, awn.Aj));
   public static final ebi d = a(new ebi("gold", false, true, false, ebi.a.a, duo.g, awn.nT, awn.nU, awn.ob, awn.oc, awn.pu, awn.pv, awn.Ai, awn.Aj));
   public static final ebi e = a(new ebi("stone", true, true, false, ebi.a.b, duo.f, awn.nT, awn.nU, awn.ob, awn.oc, awn.An, awn.Ao, awn.Ai, awn.Aj));
   public static final ebi f = a(
      new ebi("polished_blackstone", true, true, false, ebi.a.b, duo.f, awn.nT, awn.nU, awn.ob, awn.oc, awn.An, awn.Ao, awn.Ai, awn.Aj)
   );
   public static final ebi g = a(new ebi("oak"));
   public static final ebi h = a(new ebi("spruce"));
   public static final ebi i = a(new ebi("birch"));
   public static final ebi j = a(new ebi("acacia"));
   public static final ebi k = a(new ebi("cherry", true, true, true, ebi.a.a, duo.aW, awn.eI, awn.eJ, awn.eK, awn.eL, awn.eO, awn.eP, awn.eM, awn.eN));
   public static final ebi l = a(new ebi("jungle"));
   public static final ebi m = a(new ebi("dark_oak"));
   public static final ebi n = a(new ebi("pale_oak"));
   public static final ebi o = a(new ebi("crimson", true, true, true, ebi.a.a, duo.aV, awn.rA, awn.rB, awn.rC, awn.rD, awn.rG, awn.rH, awn.rE, awn.rF));
   public static final ebi p = a(new ebi("warped", true, true, true, ebi.a.a, duo.aV, awn.rA, awn.rB, awn.rC, awn.rD, awn.rG, awn.rH, awn.rE, awn.rF));
   public static final ebi q = a(new ebi("mangrove"));
   public static final ebi r = a(new ebi("bamboo", true, true, true, ebi.a.a, duo.aU, awn.bo, awn.bp, awn.bq, awn.br, awn.bu, awn.bv, awn.bs, awn.bt));

   public ebi(String $$0) {
      this($$0, true, true, true, ebi.a.a, duo.b, awn.DT, awn.DU, awn.DV, awn.DW, awn.DZ, awn.Ea, awn.DX, awn.DY);
   }

   private static ebi a(ebi $$0) {
      G.put($$0.s, $$0);
      return $$0;
   }

   public static Stream<ebi> a() {
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

   public ebi.a f() {
      return this.w;
   }

   public duo g() {
      return this.x;
   }

   public awm h() {
      return this.y;
   }

   public awm i() {
      return this.z;
   }

   public awm j() {
      return this.A;
   }

   public awm k() {
      return this.B;
   }

   public awm l() {
      return this.C;
   }

   public awm m() {
      return this.D;
   }

   public awm n() {
      return this.E;
   }

   public awm o() {
      return this.F;
   }

   public static enum a {
      a,
      b;
   }
}
