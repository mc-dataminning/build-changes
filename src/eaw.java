import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record eaw(String s, boolean t, boolean u, boolean v, eaw.a w, duc x, awm y, awm z, awm A, awm B, awm C, awm D, awm E, awm F) {
   private static final Map<String, eaw> G = new Object2ObjectArrayMap();
   public static final Codec<eaw> a = Codec.stringResolver(eaw::b, G::get);
   public static final eaw b = a(new eaw("iron", false, false, false, eaw.a.a, duc.bp, awn.nT, awn.nU, awn.ob, awn.oc, awn.pu, awn.pv, awn.Ai, awn.Aj));
   public static final eaw c = a(new eaw("copper", true, true, false, eaw.a.a, duc.aj, awn.fR, awn.fS, awn.fY, awn.fZ, awn.pu, awn.pv, awn.Ai, awn.Aj));
   public static final eaw d = a(new eaw("gold", false, true, false, eaw.a.a, duc.g, awn.nT, awn.nU, awn.ob, awn.oc, awn.pu, awn.pv, awn.Ai, awn.Aj));
   public static final eaw e = a(new eaw("stone", true, true, false, eaw.a.b, duc.f, awn.nT, awn.nU, awn.ob, awn.oc, awn.An, awn.Ao, awn.Ai, awn.Aj));
   public static final eaw f = a(
      new eaw("polished_blackstone", true, true, false, eaw.a.b, duc.f, awn.nT, awn.nU, awn.ob, awn.oc, awn.An, awn.Ao, awn.Ai, awn.Aj)
   );
   public static final eaw g = a(new eaw("oak"));
   public static final eaw h = a(new eaw("spruce"));
   public static final eaw i = a(new eaw("birch"));
   public static final eaw j = a(new eaw("acacia"));
   public static final eaw k = a(new eaw("cherry", true, true, true, eaw.a.a, duc.aW, awn.eI, awn.eJ, awn.eK, awn.eL, awn.eO, awn.eP, awn.eM, awn.eN));
   public static final eaw l = a(new eaw("jungle"));
   public static final eaw m = a(new eaw("dark_oak"));
   public static final eaw n = a(new eaw("pale_oak"));
   public static final eaw o = a(new eaw("crimson", true, true, true, eaw.a.a, duc.aV, awn.rA, awn.rB, awn.rC, awn.rD, awn.rG, awn.rH, awn.rE, awn.rF));
   public static final eaw p = a(new eaw("warped", true, true, true, eaw.a.a, duc.aV, awn.rA, awn.rB, awn.rC, awn.rD, awn.rG, awn.rH, awn.rE, awn.rF));
   public static final eaw q = a(new eaw("mangrove"));
   public static final eaw r = a(new eaw("bamboo", true, true, true, eaw.a.a, duc.aU, awn.bo, awn.bp, awn.bq, awn.br, awn.bu, awn.bv, awn.bs, awn.bt));

   public eaw(String $$0) {
      this($$0, true, true, true, eaw.a.a, duc.b, awn.DZ, awn.Ea, awn.Eb, awn.Ec, awn.Ef, awn.Eg, awn.Ed, awn.Ee);
   }

   private static eaw a(eaw $$0) {
      G.put($$0.s, $$0);
      return $$0;
   }

   public static Stream<eaw> a() {
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

   public eaw.a f() {
      return this.w;
   }

   public duc g() {
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
