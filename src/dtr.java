import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dtr(String s, boolean t, boolean u, boolean v, dtr.a w, dnd x, avn y, avn z, avn A, avn B, avn C, avn D, avn E, avn F) {
   private static final Map<String, dtr> G = new Object2ObjectArrayMap();
   public static final Codec<dtr> a = axu.a(dtr::b, G::get);
   public static final dtr b = a(new dtr("iron", false, false, false, dtr.a.a, dnd.g, avo.nC, avo.nD, avo.nK, avo.nL, avo.ph, avo.pi, avo.zz, avo.zA));
   public static final dtr c = a(new dtr("copper", true, true, false, dtr.a.a, dnd.aj, avo.fN, avo.fO, avo.fU, avo.fV, avo.ph, avo.pi, avo.zz, avo.zA));
   public static final dtr d = a(new dtr("gold", false, true, false, dtr.a.a, dnd.g, avo.nC, avo.nD, avo.nK, avo.nL, avo.ph, avo.pi, avo.zz, avo.zA));
   public static final dtr e = a(new dtr("stone", true, true, false, dtr.a.b, dnd.f, avo.nC, avo.nD, avo.nK, avo.nL, avo.zE, avo.zF, avo.zz, avo.zA));
   public static final dtr f = a(
      new dtr("polished_blackstone", true, true, false, dtr.a.b, dnd.f, avo.nC, avo.nD, avo.nK, avo.nL, avo.zE, avo.zF, avo.zz, avo.zA)
   );
   public static final dtr g = a(new dtr("oak"));
   public static final dtr h = a(new dtr("spruce"));
   public static final dtr i = a(new dtr("birch"));
   public static final dtr j = a(new dtr("acacia"));
   public static final dtr k = a(new dtr("cherry", true, true, true, dtr.a.a, dnd.aZ, avo.eJ, avo.eK, avo.eL, avo.eM, avo.eP, avo.eQ, avo.eN, avo.eO));
   public static final dtr l = a(new dtr("jungle"));
   public static final dtr m = a(new dtr("dark_oak"));
   public static final dtr n = a(new dtr("crimson", true, true, true, dtr.a.a, dnd.aT, avo.rk, avo.rl, avo.rm, avo.rn, avo.rq, avo.rr, avo.ro, avo.rp));
   public static final dtr o = a(new dtr("warped", true, true, true, dtr.a.a, dnd.aT, avo.rk, avo.rl, avo.rm, avo.rn, avo.rq, avo.rr, avo.ro, avo.rp));
   public static final dtr p = a(new dtr("potato", true, true, true, dtr.a.a, dnd.aT, avo.rk, avo.rl, avo.rm, avo.rn, avo.rq, avo.rr, avo.ro, avo.rp));
   public static final dtr q = a(new dtr("mangrove"));
   public static final dtr r = a(new dtr("bamboo", true, true, true, dtr.a.a, dnd.aS, avo.bt, avo.bu, avo.bv, avo.bw, avo.bz, avo.bA, avo.bx, avo.by));

   public dtr(String $$0) {
      this($$0, true, true, true, dtr.a.a, dnd.b, avo.Dp, avo.Dq, avo.Dr, avo.Ds, avo.Dv, avo.Dw, avo.Dt, avo.Du);
   }

   private static dtr a(dtr $$0) {
      G.put($$0.s, $$0);
      return $$0;
   }

   public static Stream<dtr> a() {
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

   public dtr.a f() {
      return this.w;
   }

   public dnd g() {
      return this.x;
   }

   public avn h() {
      return this.y;
   }

   public avn i() {
      return this.z;
   }

   public avn j() {
      return this.A;
   }

   public avn k() {
      return this.B;
   }

   public avn l() {
      return this.C;
   }

   public avn m() {
      return this.D;
   }

   public avn n() {
      return this.E;
   }

   public avn o() {
      return this.F;
   }

   public static enum a {
      a,
      b;
   }
}
