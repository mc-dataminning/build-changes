import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Set;
import java.util.stream.Stream;

public record dfp(String p, boolean q, czz r, aov s, aov t, aov u, aov v, aov w, aov x, aov y, aov z) {
   private static final Set<dfp> A = new ObjectArraySet();
   public static final dfp a = a(new dfp("iron", false, czz.g, aow.lK, aow.lL, aow.lS, aow.lT, aow.nd, aow.ne, aow.xm, aow.xn));
   public static final dfp b = a(new dfp("gold", false, czz.g, aow.lK, aow.lL, aow.lS, aow.lT, aow.nd, aow.ne, aow.xm, aow.xn));
   public static final dfp c = a(new dfp("stone", true, czz.f, aow.lK, aow.lL, aow.lS, aow.lT, aow.xr, aow.xs, aow.xm, aow.xn));
   public static final dfp d = a(new dfp("polished_blackstone", true, czz.f, aow.lK, aow.lL, aow.lS, aow.lT, aow.xr, aow.xs, aow.xm, aow.xn));
   public static final dfp e = a(new dfp("oak"));
   public static final dfp f = a(new dfp("spruce"));
   public static final dfp g = a(new dfp("birch"));
   public static final dfp h = a(new dfp("acacia"));
   public static final dfp i = a(new dfp("cherry", true, czz.aQ, aow.dX, aow.dY, aow.dZ, aow.ea, aow.ed, aow.ee, aow.eb, aow.ec));
   public static final dfp j = a(new dfp("jungle"));
   public static final dfp k = a(new dfp("dark_oak"));
   public static final dfp l = a(new dfp("crimson", true, czz.aP, aow.pf, aow.pg, aow.ph, aow.pi, aow.pl, aow.pm, aow.pj, aow.pk));
   public static final dfp m = a(new dfp("warped", true, czz.aP, aow.pf, aow.pg, aow.ph, aow.pi, aow.pl, aow.pm, aow.pj, aow.pk));
   public static final dfp n = a(new dfp("mangrove"));
   public static final dfp o = a(new dfp("bamboo", true, czz.aO, aow.aZ, aow.ba, aow.bb, aow.bc, aow.bf, aow.bg, aow.bd, aow.be));

   public dfp(String $$0) {
      this($$0, true, czz.b, aow.As, aow.At, aow.Au, aow.Av, aow.Ay, aow.Az, aow.Aw, aow.Ax);
   }

   private static dfp a(dfp $$0) {
      A.add($$0);
      return $$0;
   }

   public static Stream<dfp> a() {
      return A.stream();
   }

   public String b() {
      return this.p;
   }

   public boolean c() {
      return this.q;
   }

   public czz d() {
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
