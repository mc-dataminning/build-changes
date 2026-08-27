import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dqn(String r, boolean s, boolean t, boolean u, dqn.a v, dki w, auy x, auy y, auy z, auy A, auy B, auy C, auy D, auy E) {
   private static final Map<String, dqn> F = new Object2ObjectArrayMap();
   public static final Codec<dqn> a = axe.a(dqn::b, F::get);
   public static final dqn b = a(new dqn("iron", false, false, false, dqn.a.a, dki.g, auz.nc, auz.nd, auz.nk, auz.nl, auz.ox, auz.oy, auz.yP, auz.yQ));
   public static final dqn c = a(new dqn("copper", true, true, false, dqn.a.a, dki.aj, auz.fI, auz.fJ, auz.fP, auz.fQ, auz.ox, auz.oy, auz.yP, auz.yQ));
   public static final dqn d = a(new dqn("gold", false, true, false, dqn.a.a, dki.g, auz.nc, auz.nd, auz.nk, auz.nl, auz.ox, auz.oy, auz.yP, auz.yQ));
   public static final dqn e = a(new dqn("stone", true, true, false, dqn.a.b, dki.f, auz.nc, auz.nd, auz.nk, auz.nl, auz.yU, auz.yV, auz.yP, auz.yQ));
   public static final dqn f = a(
      new dqn("polished_blackstone", true, true, false, dqn.a.b, dki.f, auz.nc, auz.nd, auz.nk, auz.nl, auz.yU, auz.yV, auz.yP, auz.yQ)
   );
   public static final dqn g = a(new dqn("oak"));
   public static final dqn h = a(new dqn("spruce"));
   public static final dqn i = a(new dqn("birch"));
   public static final dqn j = a(new dqn("acacia"));
   public static final dqn k = a(new dqn("cherry", true, true, true, dqn.a.a, dki.aU, auz.eE, auz.eF, auz.eG, auz.eH, auz.eK, auz.eL, auz.eI, auz.eJ));
   public static final dqn l = a(new dqn("jungle"));
   public static final dqn m = a(new dqn("dark_oak"));
   public static final dqn n = a(new dqn("crimson", true, true, true, dqn.a.a, dki.aT, auz.qA, auz.qB, auz.qC, auz.qD, auz.qG, auz.qH, auz.qE, auz.qF));
   public static final dqn o = a(new dqn("warped", true, true, true, dqn.a.a, dki.aT, auz.qA, auz.qB, auz.qC, auz.qD, auz.qG, auz.qH, auz.qE, auz.qF));
   public static final dqn p = a(new dqn("mangrove"));
   public static final dqn q = a(new dqn("bamboo", true, true, true, dqn.a.a, dki.aS, auz.bo, auz.bp, auz.bq, auz.br, auz.bu, auz.bv, auz.bs, auz.bt));

   public dqn(String $$0) {
      this($$0, true, true, true, dqn.a.a, dki.b, auz.CF, auz.CG, auz.CH, auz.CI, auz.CL, auz.CM, auz.CJ, auz.CK);
   }

   private static dqn a(dqn $$0) {
      F.put($$0.r, $$0);
      return $$0;
   }

   public static Stream<dqn> a() {
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

   public dqn.a f() {
      return this.v;
   }

   public dki g() {
      return this.w;
   }

   public auy h() {
      return this.x;
   }

   public auy i() {
      return this.y;
   }

   public auy j() {
      return this.z;
   }

   public auy k() {
      return this.A;
   }

   public auy l() {
      return this.B;
   }

   public auy m() {
      return this.C;
   }

   public auy n() {
      return this.D;
   }

   public auy o() {
      return this.E;
   }

   public static enum a {
      a,
      b;
   }
}
