import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Set;
import java.util.stream.Stream;

public record dfn(String p, boolean q, czx r, aot s, aot t, aot u, aot v, aot w, aot x, aot y, aot z) {
   private static final Set<dfn> A = new ObjectArraySet();
   public static final dfn a = a(new dfn("iron", false, czx.g, aou.lK, aou.lL, aou.lS, aou.lT, aou.nd, aou.ne, aou.xm, aou.xn));
   public static final dfn b = a(new dfn("gold", false, czx.g, aou.lK, aou.lL, aou.lS, aou.lT, aou.nd, aou.ne, aou.xm, aou.xn));
   public static final dfn c = a(new dfn("stone", true, czx.f, aou.lK, aou.lL, aou.lS, aou.lT, aou.xr, aou.xs, aou.xm, aou.xn));
   public static final dfn d = a(new dfn("polished_blackstone", true, czx.f, aou.lK, aou.lL, aou.lS, aou.lT, aou.xr, aou.xs, aou.xm, aou.xn));
   public static final dfn e = a(new dfn("oak"));
   public static final dfn f = a(new dfn("spruce"));
   public static final dfn g = a(new dfn("birch"));
   public static final dfn h = a(new dfn("acacia"));
   public static final dfn i = a(new dfn("cherry", true, czx.aQ, aou.dX, aou.dY, aou.dZ, aou.ea, aou.ed, aou.ee, aou.eb, aou.ec));
   public static final dfn j = a(new dfn("jungle"));
   public static final dfn k = a(new dfn("dark_oak"));
   public static final dfn l = a(new dfn("crimson", true, czx.aP, aou.pf, aou.pg, aou.ph, aou.pi, aou.pl, aou.pm, aou.pj, aou.pk));
   public static final dfn m = a(new dfn("warped", true, czx.aP, aou.pf, aou.pg, aou.ph, aou.pi, aou.pl, aou.pm, aou.pj, aou.pk));
   public static final dfn n = a(new dfn("mangrove"));
   public static final dfn o = a(new dfn("bamboo", true, czx.aO, aou.aZ, aou.ba, aou.bb, aou.bc, aou.bf, aou.bg, aou.bd, aou.be));

   public dfn(String $$0) {
      this($$0, true, czx.b, aou.As, aou.At, aou.Au, aou.Av, aou.Ay, aou.Az, aou.Aw, aou.Ax);
   }

   private static dfn a(dfn $$0) {
      A.add($$0);
      return $$0;
   }

   public static Stream<dfn> a() {
      return A.stream();
   }

   public String b() {
      return this.p;
   }

   public boolean c() {
      return this.q;
   }

   public czx d() {
      return this.r;
   }

   public aot e() {
      return this.s;
   }

   public aot f() {
      return this.t;
   }

   public aot g() {
      return this.u;
   }

   public aot h() {
      return this.v;
   }

   public aot i() {
      return this.w;
   }

   public aot j() {
      return this.x;
   }

   public aot k() {
      return this.y;
   }

   public aot l() {
      return this.z;
   }
}
