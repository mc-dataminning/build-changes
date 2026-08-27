import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Set;
import java.util.stream.Stream;

public record dfy(String p, boolean q, dai r, apd s, apd t, apd u, apd v, apd w, apd x, apd y, apd z) {
   private static final Set<dfy> A = new ObjectArraySet();
   public static final dfy a = a(new dfy("iron", false, dai.g, ape.lK, ape.lL, ape.lS, ape.lT, ape.nd, ape.ne, ape.xr, ape.xs));
   public static final dfy b = a(new dfy("gold", false, dai.g, ape.lK, ape.lL, ape.lS, ape.lT, ape.nd, ape.ne, ape.xr, ape.xs));
   public static final dfy c = a(new dfy("stone", true, dai.f, ape.lK, ape.lL, ape.lS, ape.lT, ape.xw, ape.xx, ape.xr, ape.xs));
   public static final dfy d = a(new dfy("polished_blackstone", true, dai.f, ape.lK, ape.lL, ape.lS, ape.lT, ape.xw, ape.xx, ape.xr, ape.xs));
   public static final dfy e = a(new dfy("oak"));
   public static final dfy f = a(new dfy("spruce"));
   public static final dfy g = a(new dfy("birch"));
   public static final dfy h = a(new dfy("acacia"));
   public static final dfy i = a(new dfy("cherry", true, dai.aQ, ape.dX, ape.dY, ape.dZ, ape.ea, ape.ed, ape.ee, ape.eb, ape.ec));
   public static final dfy j = a(new dfy("jungle"));
   public static final dfy k = a(new dfy("dark_oak"));
   public static final dfy l = a(new dfy("crimson", true, dai.aP, ape.pf, ape.pg, ape.ph, ape.pi, ape.pl, ape.pm, ape.pj, ape.pk));
   public static final dfy m = a(new dfy("warped", true, dai.aP, ape.pf, ape.pg, ape.ph, ape.pi, ape.pl, ape.pm, ape.pj, ape.pk));
   public static final dfy n = a(new dfy("mangrove"));
   public static final dfy o = a(new dfy("bamboo", true, dai.aO, ape.aZ, ape.ba, ape.bb, ape.bc, ape.bf, ape.bg, ape.bd, ape.be));

   public dfy(String $$0) {
      this($$0, true, dai.b, ape.AC, ape.AD, ape.AE, ape.AF, ape.AI, ape.AJ, ape.AG, ape.AH);
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

   public apd e() {
      return this.s;
   }

   public apd f() {
      return this.t;
   }

   public apd g() {
      return this.u;
   }

   public apd h() {
      return this.v;
   }

   public apd i() {
      return this.w;
   }

   public apd j() {
      return this.x;
   }

   public apd k() {
      return this.y;
   }

   public apd l() {
      return this.z;
   }
}
