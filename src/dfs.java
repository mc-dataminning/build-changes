import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dfs(String q, boolean r, boolean s, dfs.a t, dan u, apf v, apf w, apf x, apf y, apf z, apf A, apf B, apf C) {
   private static final Map<String, dfs> D = new Object2ObjectArrayMap();
   public static final Codec<dfs> a = arj.a(dfs::b, D::get);
   public static final dfs b = a(new dfs("iron", false, false, dfs.a.a, dan.g, apg.lK, apg.lL, apg.lS, apg.lT, apg.nd, apg.ne, apg.xr, apg.xs));
   public static final dfs c = a(new dfs("gold", false, false, dfs.a.a, dan.g, apg.lK, apg.lL, apg.lS, apg.lT, apg.nd, apg.ne, apg.xr, apg.xs));
   public static final dfs d = a(new dfs("stone", true, false, dfs.a.b, dan.f, apg.lK, apg.lL, apg.lS, apg.lT, apg.xw, apg.xx, apg.xr, apg.xs));
   public static final dfs e = a(new dfs("polished_blackstone", true, false, dfs.a.b, dan.f, apg.lK, apg.lL, apg.lS, apg.lT, apg.xw, apg.xx, apg.xr, apg.xs));
   public static final dfs f = a(new dfs("oak"));
   public static final dfs g = a(new dfs("spruce"));
   public static final dfs h = a(new dfs("birch"));
   public static final dfs i = a(new dfs("acacia"));
   public static final dfs j = a(new dfs("cherry", true, true, dfs.a.a, dan.aQ, apg.dX, apg.dY, apg.dZ, apg.ea, apg.ed, apg.ee, apg.eb, apg.ec));
   public static final dfs k = a(new dfs("jungle"));
   public static final dfs l = a(new dfs("dark_oak"));
   public static final dfs m = a(new dfs("crimson", true, true, dfs.a.a, dan.aP, apg.pf, apg.pg, apg.ph, apg.pi, apg.pl, apg.pm, apg.pj, apg.pk));
   public static final dfs n = a(new dfs("warped", true, true, dfs.a.a, dan.aP, apg.pf, apg.pg, apg.ph, apg.pi, apg.pl, apg.pm, apg.pj, apg.pk));
   public static final dfs o = a(new dfs("mangrove"));
   public static final dfs p = a(new dfs("bamboo", true, true, dfs.a.a, dan.aO, apg.aZ, apg.ba, apg.bb, apg.bc, apg.bf, apg.bg, apg.bd, apg.be));

   public dfs(String $$0) {
      this($$0, true, true, dfs.a.a, dan.b, apg.AC, apg.AD, apg.AE, apg.AF, apg.AI, apg.AJ, apg.AG, apg.AH);
   }

   private static dfs a(dfs $$0) {
      D.put($$0.q, $$0);
      return $$0;
   }

   public static Stream<dfs> a() {
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

   public dfs.a e() {
      return this.t;
   }

   public dan f() {
      return this.u;
   }

   public apf g() {
      return this.v;
   }

   public apf h() {
      return this.w;
   }

   public apf i() {
      return this.x;
   }

   public apf j() {
      return this.y;
   }

   public apf k() {
      return this.z;
   }

   public apf l() {
      return this.A;
   }

   public apf m() {
      return this.B;
   }

   public apf n() {
      return this.C;
   }

   public static enum a {
      a,
      b;
   }
}
