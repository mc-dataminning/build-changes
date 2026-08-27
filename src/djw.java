import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record djw(String r, boolean s, boolean t, boolean u, djw.a v, dec w, arr x, arr y, arr z, arr A, arr B, arr C, arr D, arr E) {
   private static final Map<String, djw> F = new Object2ObjectArrayMap();
   public static final Codec<djw> a = atw.a(djw::b, F::get);
   public static final djw b = a(new djw("iron", false, false, false, djw.a.a, dec.g, ars.my, ars.mz, ars.mG, ars.mH, ars.nR, ars.nS, ars.yh, ars.yi));
   public static final djw c = a(new djw("copper", true, true, false, djw.a.a, dec.aj, ars.fk, ars.fl, ars.fr, ars.fs, ars.nR, ars.nS, ars.yh, ars.yi));
   public static final djw d = a(new djw("gold", false, true, false, djw.a.a, dec.g, ars.my, ars.mz, ars.mG, ars.mH, ars.nR, ars.nS, ars.yh, ars.yi));
   public static final djw e = a(new djw("stone", true, true, false, djw.a.b, dec.f, ars.my, ars.mz, ars.mG, ars.mH, ars.ym, ars.yn, ars.yh, ars.yi));
   public static final djw f = a(
      new djw("polished_blackstone", true, true, false, djw.a.b, dec.f, ars.my, ars.mz, ars.mG, ars.mH, ars.ym, ars.yn, ars.yh, ars.yi)
   );
   public static final djw g = a(new djw("oak"));
   public static final djw h = a(new djw("spruce"));
   public static final djw i = a(new djw("birch"));
   public static final djw j = a(new djw("acacia"));
   public static final djw k = a(new djw("cherry", true, true, true, djw.a.a, dec.aU, ars.eg, ars.eh, ars.ei, ars.ej, ars.em, ars.en, ars.ek, ars.el));
   public static final djw l = a(new djw("jungle"));
   public static final djw m = a(new djw("dark_oak"));
   public static final djw n = a(new djw("crimson", true, true, true, djw.a.a, dec.aT, ars.pT, ars.pU, ars.pV, ars.pW, ars.pZ, ars.qa, ars.pX, ars.pY));
   public static final djw o = a(new djw("warped", true, true, true, djw.a.a, dec.aT, ars.pT, ars.pU, ars.pV, ars.pW, ars.pZ, ars.qa, ars.pX, ars.pY));
   public static final djw p = a(new djw("mangrove"));
   public static final djw q = a(new djw("bamboo", true, true, true, djw.a.a, dec.aS, ars.aZ, ars.ba, ars.bb, ars.bc, ars.bf, ars.bg, ars.bd, ars.be));

   public djw(String $$0) {
      this($$0, true, true, true, djw.a.a, dec.b, ars.BE, ars.BF, ars.BG, ars.BH, ars.BK, ars.BL, ars.BI, ars.BJ);
   }

   private static djw a(djw $$0) {
      F.put($$0.r, $$0);
      return $$0;
   }

   public static Stream<djw> a() {
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

   public djw.a f() {
      return this.v;
   }

   public dec g() {
      return this.w;
   }

   public arr h() {
      return this.x;
   }

   public arr i() {
      return this.y;
   }

   public arr j() {
      return this.z;
   }

   public arr k() {
      return this.A;
   }

   public arr l() {
      return this.B;
   }

   public arr m() {
      return this.C;
   }

   public arr n() {
      return this.D;
   }

   public arr o() {
      return this.E;
   }

   public static enum a {
      a,
      b;
   }
}
