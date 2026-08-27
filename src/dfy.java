import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Set;
import java.util.stream.Stream;

public record dfy(String p, boolean q, dai r, apc s, apc t, apc u, apc v, apc w, apc x, apc y, apc z) {
   private static final Set<dfy> A = new ObjectArraySet();
   public static final dfy a = a(new dfy("iron", false, dai.g, apd.lK, apd.lL, apd.lS, apd.lT, apd.nd, apd.ne, apd.xr, apd.xs));
   public static final dfy b = a(new dfy("gold", false, dai.g, apd.lK, apd.lL, apd.lS, apd.lT, apd.nd, apd.ne, apd.xr, apd.xs));
   public static final dfy c = a(new dfy("stone", true, dai.f, apd.lK, apd.lL, apd.lS, apd.lT, apd.xw, apd.xx, apd.xr, apd.xs));
   public static final dfy d = a(new dfy("polished_blackstone", true, dai.f, apd.lK, apd.lL, apd.lS, apd.lT, apd.xw, apd.xx, apd.xr, apd.xs));
   public static final dfy e = a(new dfy("oak"));
   public static final dfy f = a(new dfy("spruce"));
   public static final dfy g = a(new dfy("birch"));
   public static final dfy h = a(new dfy("acacia"));
   public static final dfy i = a(new dfy("cherry", true, dai.aQ, apd.dX, apd.dY, apd.dZ, apd.ea, apd.ed, apd.ee, apd.eb, apd.ec));
   public static final dfy j = a(new dfy("jungle"));
   public static final dfy k = a(new dfy("dark_oak"));
   public static final dfy l = a(new dfy("crimson", true, dai.aP, apd.pf, apd.pg, apd.ph, apd.pi, apd.pl, apd.pm, apd.pj, apd.pk));
   public static final dfy m = a(new dfy("warped", true, dai.aP, apd.pf, apd.pg, apd.ph, apd.pi, apd.pl, apd.pm, apd.pj, apd.pk));
   public static final dfy n = a(new dfy("mangrove"));
   public static final dfy o = a(new dfy("bamboo", true, dai.aO, apd.aZ, apd.ba, apd.bb, apd.bc, apd.bf, apd.bg, apd.bd, apd.be));

   public dfy(String $$0) {
      this($$0, true, dai.b, apd.AC, apd.AD, apd.AE, apd.AF, apd.AI, apd.AJ, apd.AG, apd.AH);
   }

   private static dfy a(dfy $$0) {
      A.add($$0);
      return $$0;
   }

   public static Stream<dfy> a() {
      return A.stream();
   }

   public String b() {
      return this.p;
   }

   public boolean c() {
      return this.q;
   }

   public dai d() {
      return this.r;
   }

   public apc e() {
      return this.s;
   }

   public apc f() {
      return this.t;
   }

   public apc g() {
      return this.u;
   }

   public apc h() {
      return this.v;
   }

   public apc i() {
      return this.w;
   }

   public apc j() {
      return this.x;
   }

   public apc k() {
      return this.y;
   }

   public apc l() {
      return this.z;
   }
}
