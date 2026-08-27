import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Set;
import java.util.stream.Stream;

public record dfo(String p, boolean q, czy r, aov s, aov t, aov u, aov v, aov w, aov x, aov y, aov z) {
   private static final Set<dfo> A = new ObjectArraySet();
   public static final dfo a = a(new dfo("iron", false, czy.g, aow.lK, aow.lL, aow.lS, aow.lT, aow.nd, aow.ne, aow.xr, aow.xs));
   public static final dfo b = a(new dfo("gold", false, czy.g, aow.lK, aow.lL, aow.lS, aow.lT, aow.nd, aow.ne, aow.xr, aow.xs));
   public static final dfo c = a(new dfo("stone", true, czy.f, aow.lK, aow.lL, aow.lS, aow.lT, aow.xw, aow.xx, aow.xr, aow.xs));
   public static final dfo d = a(new dfo("polished_blackstone", true, czy.f, aow.lK, aow.lL, aow.lS, aow.lT, aow.xw, aow.xx, aow.xr, aow.xs));
   public static final dfo e = a(new dfo("oak"));
   public static final dfo f = a(new dfo("spruce"));
   public static final dfo g = a(new dfo("birch"));
   public static final dfo h = a(new dfo("acacia"));
   public static final dfo i = a(new dfo("cherry", true, czy.aQ, aow.dX, aow.dY, aow.dZ, aow.ea, aow.ed, aow.ee, aow.eb, aow.ec));
   public static final dfo j = a(new dfo("jungle"));
   public static final dfo k = a(new dfo("dark_oak"));
   public static final dfo l = a(new dfo("crimson", true, czy.aP, aow.pf, aow.pg, aow.ph, aow.pi, aow.pl, aow.pm, aow.pj, aow.pk));
   public static final dfo m = a(new dfo("warped", true, czy.aP, aow.pf, aow.pg, aow.ph, aow.pi, aow.pl, aow.pm, aow.pj, aow.pk));
   public static final dfo n = a(new dfo("mangrove"));
   public static final dfo o = a(new dfo("bamboo", true, czy.aO, aow.aZ, aow.ba, aow.bb, aow.bc, aow.bf, aow.bg, aow.bd, aow.be));

   public dfo(String $$0) {
      this($$0, true, czy.b, aow.AC, aow.AD, aow.AE, aow.AF, aow.AI, aow.AJ, aow.AG, aow.AH);
   }

   private static dfo a(dfo $$0) {
      A.add($$0);
      return $$0;
   }

   public static Stream<dfo> a() {
      return A.stream();
   }

   public String b() {
      return this.p;
   }

   public boolean c() {
      return this.q;
   }

   public czy d() {
      return this.r;
   }

   public aov e() {
      return this.s;
   }

   public aov f() {
      return this.t;
   }

   public aov g() {
      return this.u;
   }

   public aov h() {
      return this.v;
   }

   public aov i() {
      return this.w;
   }

   public aov j() {
      return this.x;
   }

   public aov k() {
      return this.y;
   }

   public aov l() {
      return this.z;
   }
}
