import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dhx(String r, boolean s, boolean t, dhx.a u, dcm v, aqq w, aqq x, aqq y, aqq z, aqq A, aqq B, aqq C, aqq D) {
   private static final Map<String, dhx> E = new Object2ObjectArrayMap();
   public static final Codec<dhx> a = asu.a(dhx::b, E::get);
   public static final dhx b = a(new dhx("iron", false, false, dhx.a.a, dcm.g, aqr.me, aqr.mf, aqr.mm, aqr.mn, aqr.nx, aqr.ny, aqr.xM, aqr.xN));
   public static final dhx c = a(new dhx("copper", true, false, dhx.a.a, dcm.g, aqr.fb, aqr.fc, aqr.fi, aqr.fj, aqr.nx, aqr.ny, aqr.xM, aqr.xN));
   public static final dhx d = a(new dhx("gold", false, false, dhx.a.a, dcm.g, aqr.me, aqr.mf, aqr.mm, aqr.mn, aqr.nx, aqr.ny, aqr.xM, aqr.xN));
   public static final dhx e = a(new dhx("stone", true, false, dhx.a.b, dcm.f, aqr.me, aqr.mf, aqr.mm, aqr.mn, aqr.xR, aqr.xS, aqr.xM, aqr.xN));
   public static final dhx f = a(new dhx("polished_blackstone", true, false, dhx.a.b, dcm.f, aqr.me, aqr.mf, aqr.mm, aqr.mn, aqr.xR, aqr.xS, aqr.xM, aqr.xN));
   public static final dhx g = a(new dhx("oak"));
   public static final dhx h = a(new dhx("spruce"));
   public static final dhx i = a(new dhx("birch"));
   public static final dhx j = a(new dhx("acacia"));
   public static final dhx k = a(new dhx("cherry", true, true, dhx.a.a, dcm.aU, aqr.dX, aqr.dY, aqr.dZ, aqr.ea, aqr.ed, aqr.ee, aqr.eb, aqr.ec));
   public static final dhx l = a(new dhx("jungle"));
   public static final dhx m = a(new dhx("dark_oak"));
   public static final dhx n = a(new dhx("crimson", true, true, dhx.a.a, dcm.aT, aqr.pz, aqr.pA, aqr.pB, aqr.pC, aqr.pF, aqr.pG, aqr.pD, aqr.pE));
   public static final dhx o = a(new dhx("warped", true, true, dhx.a.a, dcm.aT, aqr.pz, aqr.pA, aqr.pB, aqr.pC, aqr.pF, aqr.pG, aqr.pD, aqr.pE));
   public static final dhx p = a(new dhx("mangrove"));
   public static final dhx q = a(new dhx("bamboo", true, true, dhx.a.a, dcm.aS, aqr.aZ, aqr.ba, aqr.bb, aqr.bc, aqr.bf, aqr.bg, aqr.bd, aqr.be));

   public dhx(String $$0) {
      this($$0, true, true, dhx.a.a, dcm.b, aqr.Bi, aqr.Bj, aqr.Bk, aqr.Bl, aqr.Bo, aqr.Bp, aqr.Bm, aqr.Bn);
   }

   private static dhx a(dhx $$0) {
      E.put($$0.r, $$0);
      return $$0;
   }

   public static Stream<dhx> a() {
      return E.values().stream();
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

   public dhx.a e() {
      return this.u;
   }

   public dcm f() {
      return this.v;
   }

   public aqq g() {
      return this.w;
   }

   public aqq h() {
      return this.x;
   }

   public aqq i() {
      return this.y;
   }

   public aqq j() {
      return this.z;
   }

   public aqq k() {
      return this.A;
   }

   public aqq l() {
      return this.B;
   }

   public aqq m() {
      return this.C;
   }

   public aqq n() {
      return this.D;
   }

   public static enum a {
      a,
      b;
   }
}
