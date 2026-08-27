import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dno(String r, boolean s, boolean t, boolean u, dno.a v, dhm w, atx x, atx y, atx z, atx A, atx B, atx C, atx D, atx E) {
   private static final Map<String, dno> F = new Object2ObjectArrayMap();
   public static final Codec<dno> a = awe.a(dno::b, F::get);
   public static final dno b = a(new dno("iron", false, false, false, dno.a.a, dhm.g, aty.mR, aty.mS, aty.mZ, aty.na, aty.ok, aty.ol, aty.yA, aty.yB));
   public static final dno c = a(new dno("copper", true, true, false, dno.a.a, dhm.aj, aty.fD, aty.fE, aty.fK, aty.fL, aty.ok, aty.ol, aty.yA, aty.yB));
   public static final dno d = a(new dno("gold", false, true, false, dno.a.a, dhm.g, aty.mR, aty.mS, aty.mZ, aty.na, aty.ok, aty.ol, aty.yA, aty.yB));
   public static final dno e = a(new dno("stone", true, true, false, dno.a.b, dhm.f, aty.mR, aty.mS, aty.mZ, aty.na, aty.yF, aty.yG, aty.yA, aty.yB));
   public static final dno f = a(
      new dno("polished_blackstone", true, true, false, dno.a.b, dhm.f, aty.mR, aty.mS, aty.mZ, aty.na, aty.yF, aty.yG, aty.yA, aty.yB)
   );
   public static final dno g = a(new dno("oak"));
   public static final dno h = a(new dno("spruce"));
   public static final dno i = a(new dno("birch"));
   public static final dno j = a(new dno("acacia"));
   public static final dno k = a(new dno("cherry", true, true, true, dno.a.a, dhm.aU, aty.ez, aty.eA, aty.eB, aty.eC, aty.eF, aty.eG, aty.eD, aty.eE));
   public static final dno l = a(new dno("jungle"));
   public static final dno m = a(new dno("dark_oak"));
   public static final dno n = a(new dno("crimson", true, true, true, dno.a.a, dhm.aT, aty.qm, aty.qn, aty.qo, aty.qp, aty.qs, aty.qt, aty.qq, aty.qr));
   public static final dno o = a(new dno("warped", true, true, true, dno.a.a, dhm.aT, aty.qm, aty.qn, aty.qo, aty.qp, aty.qs, aty.qt, aty.qq, aty.qr));
   public static final dno p = a(new dno("mangrove"));
   public static final dno q = a(new dno("bamboo", true, true, true, dno.a.a, dhm.aS, aty.bo, aty.bp, aty.bq, aty.br, aty.bu, aty.bv, aty.bs, aty.bt));

   public dno(String $$0) {
      this($$0, true, true, true, dno.a.a, dhm.b, aty.Cl, aty.Cm, aty.Cn, aty.Co, aty.Cr, aty.Cs, aty.Cp, aty.Cq);
   }

   private static dno a(dno $$0) {
      F.put($$0.r, $$0);
      return $$0;
   }

   public static Stream<dno> a() {
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

   public dno.a f() {
      return this.v;
   }

   public dhm g() {
      return this.w;
   }

   public atx h() {
      return this.x;
   }

   public atx i() {
      return this.y;
   }

   public atx j() {
      return this.z;
   }

   public atx k() {
      return this.A;
   }

   public atx l() {
      return this.B;
   }

   public atx m() {
      return this.C;
   }

   public atx n() {
      return this.D;
   }

   public atx o() {
      return this.E;
   }

   public static enum a {
      a,
      b;
   }
}
