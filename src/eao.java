import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record eao(String s, boolean t, boolean u, boolean v, eao.a w, dtv x, awm y, awm z, awm A, awm B, awm C, awm D, awm E, awm F) {
   private static final Map<String, eao> G = new Object2ObjectArrayMap();
   public static final Codec<eao> a = Codec.stringResolver(eao::b, G::get);
   public static final eao b = a(new eao("iron", false, false, false, eao.a.a, dtv.bo, awn.nQ, awn.nR, awn.nY, awn.nZ, awn.pr, awn.ps, awn.Af, awn.Ag));
   public static final eao c = a(new eao("copper", true, true, false, eao.a.a, dtv.aj, awn.fP, awn.fQ, awn.fW, awn.fX, awn.pr, awn.ps, awn.Af, awn.Ag));
   public static final eao d = a(new eao("gold", false, true, false, eao.a.a, dtv.g, awn.nQ, awn.nR, awn.nY, awn.nZ, awn.pr, awn.ps, awn.Af, awn.Ag));
   public static final eao e = a(new eao("stone", true, true, false, eao.a.b, dtv.f, awn.nQ, awn.nR, awn.nY, awn.nZ, awn.Ak, awn.Al, awn.Af, awn.Ag));
   public static final eao f = a(
      new eao("polished_blackstone", true, true, false, eao.a.b, dtv.f, awn.nQ, awn.nR, awn.nY, awn.nZ, awn.Ak, awn.Al, awn.Af, awn.Ag)
   );
   public static final eao g = a(new eao("oak"));
   public static final eao h = a(new eao("spruce"));
   public static final eao i = a(new eao("birch"));
   public static final eao j = a(new eao("acacia"));
   public static final eao k = a(new eao("cherry", true, true, true, eao.a.a, dtv.aV, awn.eG, awn.eH, awn.eI, awn.eJ, awn.eM, awn.eN, awn.eK, awn.eL));
   public static final eao l = a(new eao("jungle"));
   public static final eao m = a(new eao("dark_oak"));
   public static final eao n = a(new eao("pale_oak"));
   public static final eao o = a(new eao("crimson", true, true, true, eao.a.a, dtv.aU, awn.rx, awn.ry, awn.rz, awn.rA, awn.rD, awn.rE, awn.rB, awn.rC));
   public static final eao p = a(new eao("warped", true, true, true, eao.a.a, dtv.aU, awn.rx, awn.ry, awn.rz, awn.rA, awn.rD, awn.rE, awn.rB, awn.rC));
   public static final eao q = a(new eao("mangrove"));
   public static final eao r = a(new eao("bamboo", true, true, true, eao.a.a, dtv.aT, awn.bo, awn.bp, awn.bq, awn.br, awn.bu, awn.bv, awn.bs, awn.bt));

   public eao(String $$0) {
      this($$0, true, true, true, eao.a.a, dtv.b, awn.DW, awn.DX, awn.DY, awn.DZ, awn.Ec, awn.Ed, awn.Ea, awn.Eb);
   }

   private static eao a(eao $$0) {
      G.put($$0.s, $$0);
      return $$0;
   }

   public static Stream<eao> a() {
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

   public eao.a f() {
      return this.w;
   }

   public dtv g() {
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
