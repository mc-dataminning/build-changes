import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dic(String r, boolean s, boolean t, dic.a u, dcr v, aqu w, aqu x, aqu y, aqu z, aqu A, aqu B, aqu C, aqu D) {
   private static final Map<String, dic> E = new Object2ObjectArrayMap();
   public static final Codec<dic> a = asy.a(dic::b, E::get);
   public static final dic b = a(new dic("iron", false, false, dic.a.a, dcr.g, aqv.me, aqv.mf, aqv.mm, aqv.mn, aqv.nx, aqv.ny, aqv.xM, aqv.xN));
   public static final dic c = a(new dic("copper", true, false, dic.a.a, dcr.g, aqv.fb, aqv.fc, aqv.fi, aqv.fj, aqv.nx, aqv.ny, aqv.xM, aqv.xN));
   public static final dic d = a(new dic("gold", false, false, dic.a.a, dcr.g, aqv.me, aqv.mf, aqv.mm, aqv.mn, aqv.nx, aqv.ny, aqv.xM, aqv.xN));
   public static final dic e = a(new dic("stone", true, false, dic.a.b, dcr.f, aqv.me, aqv.mf, aqv.mm, aqv.mn, aqv.xR, aqv.xS, aqv.xM, aqv.xN));
   public static final dic f = a(new dic("polished_blackstone", true, false, dic.a.b, dcr.f, aqv.me, aqv.mf, aqv.mm, aqv.mn, aqv.xR, aqv.xS, aqv.xM, aqv.xN));
   public static final dic g = a(new dic("oak"));
   public static final dic h = a(new dic("spruce"));
   public static final dic i = a(new dic("birch"));
   public static final dic j = a(new dic("acacia"));
   public static final dic k = a(new dic("cherry", true, true, dic.a.a, dcr.aU, aqv.dX, aqv.dY, aqv.dZ, aqv.ea, aqv.ed, aqv.ee, aqv.eb, aqv.ec));
   public static final dic l = a(new dic("jungle"));
   public static final dic m = a(new dic("dark_oak"));
   public static final dic n = a(new dic("crimson", true, true, dic.a.a, dcr.aT, aqv.pz, aqv.pA, aqv.pB, aqv.pC, aqv.pF, aqv.pG, aqv.pD, aqv.pE));
   public static final dic o = a(new dic("warped", true, true, dic.a.a, dcr.aT, aqv.pz, aqv.pA, aqv.pB, aqv.pC, aqv.pF, aqv.pG, aqv.pD, aqv.pE));
   public static final dic p = a(new dic("mangrove"));
   public static final dic q = a(new dic("bamboo", true, true, dic.a.a, dcr.aS, aqv.aZ, aqv.ba, aqv.bb, aqv.bc, aqv.bf, aqv.bg, aqv.bd, aqv.be));

   public dic(String $$0) {
      this($$0, true, true, dic.a.a, dcr.b, aqv.Bi, aqv.Bj, aqv.Bk, aqv.Bl, aqv.Bo, aqv.Bp, aqv.Bm, aqv.Bn);
   }

   private static dic a(dic $$0) {
      E.put($$0.r, $$0);
      return $$0;
   }

   public static Stream<dic> a() {
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

   public dic.a e() {
      return this.u;
   }

   public dcr f() {
      return this.v;
   }

   public aqu g() {
      return this.w;
   }

   public aqu h() {
      return this.x;
   }

   public aqu i() {
      return this.y;
   }

   public aqu j() {
      return this.z;
   }

   public aqu k() {
      return this.A;
   }

   public aqu l() {
      return this.B;
   }

   public aqu m() {
      return this.C;
   }

   public aqu n() {
      return this.D;
   }

   public static enum a {
      a,
      b;
   }
}
