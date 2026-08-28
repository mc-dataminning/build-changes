import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dxk(String s, boolean t, boolean u, boolean v, dxk.a w, drc x, avy y, avy z, avy A, avy B, avy C, avy D, avy E, avy F) {
   private static final Map<String, dxk> G = new Object2ObjectArrayMap();
   public static final Codec<dxk> a = Codec.stringResolver(dxk::b, G::get);
   public static final dxk b = a(new dxk("iron", false, false, false, dxk.a.a, drc.g, avz.nK, avz.nL, avz.nS, avz.nT, avz.pg, avz.ph, avz.zS, avz.zT));
   public static final dxk c = a(new dxk("copper", true, true, false, dxk.a.a, drc.aj, avz.fP, avz.fQ, avz.fW, avz.fX, avz.pg, avz.ph, avz.zS, avz.zT));
   public static final dxk d = a(new dxk("gold", false, true, false, dxk.a.a, drc.g, avz.nK, avz.nL, avz.nS, avz.nT, avz.pg, avz.ph, avz.zS, avz.zT));
   public static final dxk e = a(new dxk("stone", true, true, false, dxk.a.b, drc.f, avz.nK, avz.nL, avz.nS, avz.nT, avz.zX, avz.zY, avz.zS, avz.zT));
   public static final dxk f = a(
      new dxk("polished_blackstone", true, true, false, dxk.a.b, drc.f, avz.nK, avz.nL, avz.nS, avz.nT, avz.zX, avz.zY, avz.zS, avz.zT)
   );
   public static final dxk g = a(new dxk("oak"));
   public static final dxk h = a(new dxk("spruce"));
   public static final dxk i = a(new dxk("birch"));
   public static final dxk j = a(new dxk("acacia"));
   public static final dxk k = a(new dxk("cherry", true, true, true, dxk.a.a, drc.aU, avz.eG, avz.eH, avz.eI, avz.eJ, avz.eM, avz.eN, avz.eK, avz.eL));
   public static final dxk l = a(new dxk("jungle"));
   public static final dxk m = a(new dxk("dark_oak"));
   public static final dxk n = a(new dxk("pale_oak"));
   public static final dxk o = a(new dxk("crimson", true, true, true, dxk.a.a, drc.aT, avz.rm, avz.rn, avz.ro, avz.rp, avz.rs, avz.rt, avz.rq, avz.rr));
   public static final dxk p = a(new dxk("warped", true, true, true, dxk.a.a, drc.aT, avz.rm, avz.rn, avz.ro, avz.rp, avz.rs, avz.rt, avz.rq, avz.rr));
   public static final dxk q = a(new dxk("mangrove"));
   public static final dxk r = a(new dxk("bamboo", true, true, true, dxk.a.a, drc.aS, avz.bo, avz.bp, avz.bq, avz.br, avz.bu, avz.bv, avz.bs, avz.bt));

   public dxk(String $$0) {
      this($$0, true, true, true, dxk.a.a, drc.b, avz.DJ, avz.DK, avz.DL, avz.DM, avz.DP, avz.DQ, avz.DN, avz.DO);
   }

   private static dxk a(dxk $$0) {
      G.put($$0.s, $$0);
      return $$0;
   }

   public static Stream<dxk> a() {
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

   public dxk.a f() {
      return this.w;
   }

   public drc g() {
      return this.x;
   }

   public avy h() {
      return this.y;
   }

   public avy i() {
      return this.z;
   }

   public avy j() {
      return this.A;
   }

   public avy k() {
      return this.B;
   }

   public avy l() {
      return this.C;
   }

   public avy m() {
      return this.D;
   }

   public avy n() {
      return this.E;
   }

   public avy o() {
      return this.F;
   }

   public static enum a {
      a,
      b;
   }
}
