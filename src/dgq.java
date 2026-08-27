import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dgq(String q, boolean r, boolean s, dgq.a t, dbl u, aqc v, aqc w, aqc x, aqc y, aqc z, aqc A, aqc B, aqc C) {
   private static final Map<String, dgq> D = new Object2ObjectArrayMap();
   public static final Codec<dgq> a = asg.a(dgq::b, D::get);
   public static final dgq b = a(new dgq("iron", false, false, dgq.a.a, dbl.g, aqd.lM, aqd.lN, aqd.lU, aqd.lV, aqd.nf, aqd.ng, aqd.xt, aqd.xu));
   public static final dgq c = a(new dgq("gold", false, false, dgq.a.a, dbl.g, aqd.lM, aqd.lN, aqd.lU, aqd.lV, aqd.nf, aqd.ng, aqd.xt, aqd.xu));
   public static final dgq d = a(new dgq("stone", true, false, dgq.a.b, dbl.f, aqd.lM, aqd.lN, aqd.lU, aqd.lV, aqd.xy, aqd.xz, aqd.xt, aqd.xu));
   public static final dgq e = a(new dgq("polished_blackstone", true, false, dgq.a.b, dbl.f, aqd.lM, aqd.lN, aqd.lU, aqd.lV, aqd.xy, aqd.xz, aqd.xt, aqd.xu));
   public static final dgq f = a(new dgq("oak"));
   public static final dgq g = a(new dgq("spruce"));
   public static final dgq h = a(new dgq("birch"));
   public static final dgq i = a(new dgq("acacia"));
   public static final dgq j = a(new dgq("cherry", true, true, dgq.a.a, dbl.aQ, aqd.dX, aqd.dY, aqd.dZ, aqd.ea, aqd.ed, aqd.ee, aqd.eb, aqd.ec));
   public static final dgq k = a(new dgq("jungle"));
   public static final dgq l = a(new dgq("dark_oak"));
   public static final dgq m = a(new dgq("crimson", true, true, dgq.a.a, dbl.aP, aqd.ph, aqd.pi, aqd.pj, aqd.pk, aqd.pn, aqd.po, aqd.pl, aqd.pm));
   public static final dgq n = a(new dgq("warped", true, true, dgq.a.a, dbl.aP, aqd.ph, aqd.pi, aqd.pj, aqd.pk, aqd.pn, aqd.po, aqd.pl, aqd.pm));
   public static final dgq o = a(new dgq("mangrove"));
   public static final dgq p = a(new dgq("bamboo", true, true, dgq.a.a, dbl.aO, aqd.aZ, aqd.ba, aqd.bb, aqd.bc, aqd.bf, aqd.bg, aqd.bd, aqd.be));

   public dgq(String $$0) {
      this($$0, true, true, dgq.a.a, dbl.b, aqd.AF, aqd.AG, aqd.AH, aqd.AI, aqd.AL, aqd.AM, aqd.AJ, aqd.AK);
   }

   private static dgq a(dgq $$0) {
      D.put($$0.q, $$0);
      return $$0;
   }

   public static Stream<dgq> a() {
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

   public dgq.a e() {
      return this.t;
   }

   public dbl f() {
      return this.u;
   }

   public aqc g() {
      return this.v;
   }

   public aqc h() {
      return this.w;
   }

   public aqc i() {
      return this.x;
   }

   public aqc j() {
      return this.y;
   }

   public aqc k() {
      return this.z;
   }

   public aqc l() {
      return this.A;
   }

   public aqc m() {
      return this.B;
   }

   public aqc n() {
      return this.C;
   }

   public static enum a {
      a,
      b;
   }
}
