import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record ebd(String s, boolean t, boolean u, boolean v, ebd.a w, duj x, awm y, awm z, awm A, awm B, awm C, awm D, awm E, awm F) {
   private static final Map<String, ebd> G = new Object2ObjectArrayMap();
   public static final Codec<ebd> a = Codec.stringResolver(ebd::b, G::get);
   public static final ebd b = a(new ebd("iron", false, false, false, ebd.a.a, duj.bp, awn.nT, awn.nU, awn.ob, awn.oc, awn.pu, awn.pv, awn.Ai, awn.Aj));
   public static final ebd c = a(new ebd("copper", true, true, false, ebd.a.a, duj.aj, awn.fR, awn.fS, awn.fY, awn.fZ, awn.pu, awn.pv, awn.Ai, awn.Aj));
   public static final ebd d = a(new ebd("gold", false, true, false, ebd.a.a, duj.g, awn.nT, awn.nU, awn.ob, awn.oc, awn.pu, awn.pv, awn.Ai, awn.Aj));
   public static final ebd e = a(new ebd("stone", true, true, false, ebd.a.b, duj.f, awn.nT, awn.nU, awn.ob, awn.oc, awn.An, awn.Ao, awn.Ai, awn.Aj));
   public static final ebd f = a(
      new ebd("polished_blackstone", true, true, false, ebd.a.b, duj.f, awn.nT, awn.nU, awn.ob, awn.oc, awn.An, awn.Ao, awn.Ai, awn.Aj)
   );
   public static final ebd g = a(new ebd("oak"));
   public static final ebd h = a(new ebd("spruce"));
   public static final ebd i = a(new ebd("birch"));
   public static final ebd j = a(new ebd("acacia"));
   public static final ebd k = a(new ebd("cherry", true, true, true, ebd.a.a, duj.aW, awn.eI, awn.eJ, awn.eK, awn.eL, awn.eO, awn.eP, awn.eM, awn.eN));
   public static final ebd l = a(new ebd("jungle"));
   public static final ebd m = a(new ebd("dark_oak"));
   public static final ebd n = a(new ebd("pale_oak"));
   public static final ebd o = a(new ebd("crimson", true, true, true, ebd.a.a, duj.aV, awn.rA, awn.rB, awn.rC, awn.rD, awn.rG, awn.rH, awn.rE, awn.rF));
   public static final ebd p = a(new ebd("warped", true, true, true, ebd.a.a, duj.aV, awn.rA, awn.rB, awn.rC, awn.rD, awn.rG, awn.rH, awn.rE, awn.rF));
   public static final ebd q = a(new ebd("mangrove"));
   public static final ebd r = a(new ebd("bamboo", true, true, true, ebd.a.a, duj.aU, awn.bo, awn.bp, awn.bq, awn.br, awn.bu, awn.bv, awn.bs, awn.bt));

   public ebd(String $$0) {
      this($$0, true, true, true, ebd.a.a, duj.b, awn.DZ, awn.Ea, awn.Eb, awn.Ec, awn.Ef, awn.Eg, awn.Ed, awn.Ee);
   }

   private static ebd a(ebd $$0) {
      G.put($$0.s, $$0);
      return $$0;
   }

   public static Stream<ebd> a() {
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

   public ebd.a f() {
      return this.w;
   }

   public duj g() {
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
