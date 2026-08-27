import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dje(String r, boolean s, boolean t, boolean u, dje.a v, ddl w, arb x, arb y, arb z, arb A, arb B, arb C, arb D, arb E) {
   private static final Map<String, dje> F = new Object2ObjectArrayMap();
   public static final Codec<dje> a = atg.a(dje::b, F::get);
   public static final dje b = a(new dje("iron", false, false, false, dje.a.a, ddl.g, arc.my, arc.mz, arc.mG, arc.mH, arc.nR, arc.nS, arc.yh, arc.yi));
   public static final dje c = a(new dje("copper", true, true, false, dje.a.a, ddl.aj, arc.fk, arc.fl, arc.fr, arc.fs, arc.nR, arc.nS, arc.yh, arc.yi));
   public static final dje d = a(new dje("gold", false, true, false, dje.a.a, ddl.g, arc.my, arc.mz, arc.mG, arc.mH, arc.nR, arc.nS, arc.yh, arc.yi));
   public static final dje e = a(new dje("stone", true, true, false, dje.a.b, ddl.f, arc.my, arc.mz, arc.mG, arc.mH, arc.ym, arc.yn, arc.yh, arc.yi));
   public static final dje f = a(
      new dje("polished_blackstone", true, true, false, dje.a.b, ddl.f, arc.my, arc.mz, arc.mG, arc.mH, arc.ym, arc.yn, arc.yh, arc.yi)
   );
   public static final dje g = a(new dje("oak"));
   public static final dje h = a(new dje("spruce"));
   public static final dje i = a(new dje("birch"));
   public static final dje j = a(new dje("acacia"));
   public static final dje k = a(new dje("cherry", true, true, true, dje.a.a, ddl.aU, arc.eg, arc.eh, arc.ei, arc.ej, arc.em, arc.en, arc.ek, arc.el));
   public static final dje l = a(new dje("jungle"));
   public static final dje m = a(new dje("dark_oak"));
   public static final dje n = a(new dje("crimson", true, true, true, dje.a.a, ddl.aT, arc.pT, arc.pU, arc.pV, arc.pW, arc.pZ, arc.qa, arc.pX, arc.pY));
   public static final dje o = a(new dje("warped", true, true, true, dje.a.a, ddl.aT, arc.pT, arc.pU, arc.pV, arc.pW, arc.pZ, arc.qa, arc.pX, arc.pY));
   public static final dje p = a(new dje("mangrove"));
   public static final dje q = a(new dje("bamboo", true, true, true, dje.a.a, ddl.aS, arc.aZ, arc.ba, arc.bb, arc.bc, arc.bf, arc.bg, arc.bd, arc.be));

   public dje(String $$0) {
      this($$0, true, true, true, dje.a.a, ddl.b, arc.BE, arc.BF, arc.BG, arc.BH, arc.BK, arc.BL, arc.BI, arc.BJ);
   }

   private static dje a(dje $$0) {
      F.put($$0.r, $$0);
      return $$0;
   }

   public static Stream<dje> a() {
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

   public dje.a f() {
      return this.v;
   }

   public ddl g() {
      return this.w;
   }

   public arb h() {
      return this.x;
   }

   public arb i() {
      return this.y;
   }

   public arb j() {
      return this.z;
   }

   public arb k() {
      return this.A;
   }

   public arb l() {
      return this.B;
   }

   public arb m() {
      return this.C;
   }

   public arb n() {
      return this.D;
   }

   public arb o() {
      return this.E;
   }

   public static enum a {
      a,
      b;
   }
}
