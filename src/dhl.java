import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dhl(String q, boolean r, boolean s, dhl.a t, dcf u, aqm v, aqm w, aqm x, aqm y, aqm z, aqm A, aqm B, aqm C) {
   private static final Map<String, dhl> D = new Object2ObjectArrayMap();
   public static final Codec<dhl> a = asq.a(dhl::b, D::get);
   public static final dhl b = a(new dhl("iron", false, false, dhl.a.a, dcf.g, aqn.lO, aqn.lP, aqn.lW, aqn.lX, aqn.nh, aqn.ni, aqn.xv, aqn.xw));
   public static final dhl c = a(new dhl("gold", false, false, dhl.a.a, dcf.g, aqn.lO, aqn.lP, aqn.lW, aqn.lX, aqn.nh, aqn.ni, aqn.xv, aqn.xw));
   public static final dhl d = a(new dhl("stone", true, false, dhl.a.b, dcf.f, aqn.lO, aqn.lP, aqn.lW, aqn.lX, aqn.xA, aqn.xB, aqn.xv, aqn.xw));
   public static final dhl e = a(new dhl("polished_blackstone", true, false, dhl.a.b, dcf.f, aqn.lO, aqn.lP, aqn.lW, aqn.lX, aqn.xA, aqn.xB, aqn.xv, aqn.xw));
   public static final dhl f = a(new dhl("oak"));
   public static final dhl g = a(new dhl("spruce"));
   public static final dhl h = a(new dhl("birch"));
   public static final dhl i = a(new dhl("acacia"));
   public static final dhl j = a(new dhl("cherry", true, true, dhl.a.a, dcf.aQ, aqn.dX, aqn.dY, aqn.dZ, aqn.ea, aqn.ed, aqn.ee, aqn.eb, aqn.ec));
   public static final dhl k = a(new dhl("jungle"));
   public static final dhl l = a(new dhl("dark_oak"));
   public static final dhl m = a(new dhl("crimson", true, true, dhl.a.a, dcf.aP, aqn.pj, aqn.pk, aqn.pl, aqn.pm, aqn.pp, aqn.pq, aqn.pn, aqn.po));
   public static final dhl n = a(new dhl("warped", true, true, dhl.a.a, dcf.aP, aqn.pj, aqn.pk, aqn.pl, aqn.pm, aqn.pp, aqn.pq, aqn.pn, aqn.po));
   public static final dhl o = a(new dhl("mangrove"));
   public static final dhl p = a(new dhl("bamboo", true, true, dhl.a.a, dcf.aO, aqn.aZ, aqn.ba, aqn.bb, aqn.bc, aqn.bf, aqn.bg, aqn.bd, aqn.be));

   public dhl(String $$0) {
      this($$0, true, true, dhl.a.a, dcf.b, aqn.AH, aqn.AI, aqn.AJ, aqn.AK, aqn.AN, aqn.AO, aqn.AL, aqn.AM);
   }

   private static dhl a(dhl $$0) {
      D.put($$0.q, $$0);
      return $$0;
   }

   public static Stream<dhl> a() {
      return D.values().stream();
   }

   public String b() {
      return this.q;
   }

   public boolean c() {
      return this.r;
   }

   public boolean d() {
      return this.s;
   }

   public dhl.a e() {
      return this.t;
   }

   public dcf f() {
      return this.u;
   }

   public aqm g() {
      return this.v;
   }

   public aqm h() {
      return this.w;
   }

   public aqm i() {
      return this.x;
   }

   public aqm j() {
      return this.y;
   }

   public aqm k() {
      return this.z;
   }

   public aqm l() {
      return this.A;
   }

   public aqm m() {
      return this.B;
   }

   public aqm n() {
      return this.C;
   }

   public static enum a {
      a,
      b;
   }
}
