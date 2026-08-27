import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Set;
import java.util.stream.Stream;

public record dft(String p, boolean q, dad r, aoy s, aoy t, aoy u, aoy v, aoy w, aoy x, aoy y, aoy z) {
   private static final Set<dft> A = new ObjectArraySet();
   public static final dft a = a(new dft("iron", false, dad.g, aoz.lK, aoz.lL, aoz.lS, aoz.lT, aoz.nd, aoz.ne, aoz.xr, aoz.xs));
   public static final dft b = a(new dft("gold", false, dad.g, aoz.lK, aoz.lL, aoz.lS, aoz.lT, aoz.nd, aoz.ne, aoz.xr, aoz.xs));
   public static final dft c = a(new dft("stone", true, dad.f, aoz.lK, aoz.lL, aoz.lS, aoz.lT, aoz.xw, aoz.xx, aoz.xr, aoz.xs));
   public static final dft d = a(new dft("polished_blackstone", true, dad.f, aoz.lK, aoz.lL, aoz.lS, aoz.lT, aoz.xw, aoz.xx, aoz.xr, aoz.xs));
   public static final dft e = a(new dft("oak"));
   public static final dft f = a(new dft("spruce"));
   public static final dft g = a(new dft("birch"));
   public static final dft h = a(new dft("acacia"));
   public static final dft i = a(new dft("cherry", true, dad.aQ, aoz.dX, aoz.dY, aoz.dZ, aoz.ea, aoz.ed, aoz.ee, aoz.eb, aoz.ec));
   public static final dft j = a(new dft("jungle"));
   public static final dft k = a(new dft("dark_oak"));
   public static final dft l = a(new dft("crimson", true, dad.aP, aoz.pf, aoz.pg, aoz.ph, aoz.pi, aoz.pl, aoz.pm, aoz.pj, aoz.pk));
   public static final dft m = a(new dft("warped", true, dad.aP, aoz.pf, aoz.pg, aoz.ph, aoz.pi, aoz.pl, aoz.pm, aoz.pj, aoz.pk));
   public static final dft n = a(new dft("mangrove"));
   public static final dft o = a(new dft("bamboo", true, dad.aO, aoz.aZ, aoz.ba, aoz.bb, aoz.bc, aoz.bf, aoz.bg, aoz.bd, aoz.be));

   public dft(String $$0) {
      this($$0, true, dad.b, aoz.AC, aoz.AD, aoz.AE, aoz.AF, aoz.AI, aoz.AJ, aoz.AG, aoz.AH);
   }

   private static dft a(dft $$0) {
      A.add($$0);
      return $$0;
   }

   public static Stream<dft> a() {
      return A.stream();
   }

   public String b() {
      return this.p;
   }

   public boolean c() {
      return this.q;
   }

   public dad d() {
      return this.r;
   }

   public aoy e() {
      return this.s;
   }

   public aoy f() {
      return this.t;
   }

   public aoy g() {
      return this.u;
   }

   public aoy h() {
      return this.v;
   }

   public aoy i() {
      return this.w;
   }

   public aoy j() {
      return this.x;
   }

   public aoy k() {
      return this.y;
   }

   public aoy l() {
      return this.z;
   }
}
