import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record djv(String r, boolean s, boolean t, boolean u, djv.a v, deb w, arq x, arq y, arq z, arq A, arq B, arq C, arq D, arq E) {
   private static final Map<String, djv> F = new Object2ObjectArrayMap();
   public static final Codec<djv> a = atv.a(djv::b, F::get);
   public static final djv b = a(new djv("iron", false, false, false, djv.a.a, deb.g, arr.my, arr.mz, arr.mG, arr.mH, arr.nR, arr.nS, arr.yh, arr.yi));
   public static final djv c = a(new djv("copper", true, true, false, djv.a.a, deb.aj, arr.fk, arr.fl, arr.fr, arr.fs, arr.nR, arr.nS, arr.yh, arr.yi));
   public static final djv d = a(new djv("gold", false, true, false, djv.a.a, deb.g, arr.my, arr.mz, arr.mG, arr.mH, arr.nR, arr.nS, arr.yh, arr.yi));
   public static final djv e = a(new djv("stone", true, true, false, djv.a.b, deb.f, arr.my, arr.mz, arr.mG, arr.mH, arr.ym, arr.yn, arr.yh, arr.yi));
   public static final djv f = a(
      new djv("polished_blackstone", true, true, false, djv.a.b, deb.f, arr.my, arr.mz, arr.mG, arr.mH, arr.ym, arr.yn, arr.yh, arr.yi)
   );
   public static final djv g = a(new djv("oak"));
   public static final djv h = a(new djv("spruce"));
   public static final djv i = a(new djv("birch"));
   public static final djv j = a(new djv("acacia"));
   public static final djv k = a(new djv("cherry", true, true, true, djv.a.a, deb.aU, arr.eg, arr.eh, arr.ei, arr.ej, arr.em, arr.en, arr.ek, arr.el));
   public static final djv l = a(new djv("jungle"));
   public static final djv m = a(new djv("dark_oak"));
   public static final djv n = a(new djv("crimson", true, true, true, djv.a.a, deb.aT, arr.pT, arr.pU, arr.pV, arr.pW, arr.pZ, arr.qa, arr.pX, arr.pY));
   public static final djv o = a(new djv("warped", true, true, true, djv.a.a, deb.aT, arr.pT, arr.pU, arr.pV, arr.pW, arr.pZ, arr.qa, arr.pX, arr.pY));
   public static final djv p = a(new djv("mangrove"));
   public static final djv q = a(new djv("bamboo", true, true, true, djv.a.a, deb.aS, arr.aZ, arr.ba, arr.bb, arr.bc, arr.bf, arr.bg, arr.bd, arr.be));

   public djv(String $$0) {
      this($$0, true, true, true, djv.a.a, deb.b, arr.BE, arr.BF, arr.BG, arr.BH, arr.BK, arr.BL, arr.BI, arr.BJ);
   }

   private static djv a(djv $$0) {
      F.put($$0.r, $$0);
      return $$0;
   }

   public static Stream<djv> a() {
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

   public djv.a f() {
      return this.v;
   }

   public deb g() {
      return this.w;
   }

   public arq h() {
      return this.x;
   }

   public arq i() {
      return this.y;
   }

   public arq j() {
      return this.z;
   }

   public arq k() {
      return this.A;
   }

   public arq l() {
      return this.B;
   }

   public arq m() {
      return this.C;
   }

   public arq n() {
      return this.D;
   }

   public arq o() {
      return this.E;
   }

   public static enum a {
      a,
      b;
   }
}
