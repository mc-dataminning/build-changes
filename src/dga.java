import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Set;
import java.util.stream.Stream;

public record dga(String p, boolean q, dak r, ape s, ape t, ape u, ape v, ape w, ape x, ape y, ape z) {
   private static final Set<dga> A = new ObjectArraySet();
   public static final dga a = a(new dga("iron", false, dak.g, apf.lK, apf.lL, apf.lS, apf.lT, apf.nd, apf.ne, apf.xr, apf.xs));
   public static final dga b = a(new dga("gold", false, dak.g, apf.lK, apf.lL, apf.lS, apf.lT, apf.nd, apf.ne, apf.xr, apf.xs));
   public static final dga c = a(new dga("stone", true, dak.f, apf.lK, apf.lL, apf.lS, apf.lT, apf.xw, apf.xx, apf.xr, apf.xs));
   public static final dga d = a(new dga("polished_blackstone", true, dak.f, apf.lK, apf.lL, apf.lS, apf.lT, apf.xw, apf.xx, apf.xr, apf.xs));
   public static final dga e = a(new dga("oak"));
   public static final dga f = a(new dga("spruce"));
   public static final dga g = a(new dga("birch"));
   public static final dga h = a(new dga("acacia"));
   public static final dga i = a(new dga("cherry", true, dak.aQ, apf.dX, apf.dY, apf.dZ, apf.ea, apf.ed, apf.ee, apf.eb, apf.ec));
   public static final dga j = a(new dga("jungle"));
   public static final dga k = a(new dga("dark_oak"));
   public static final dga l = a(new dga("crimson", true, dak.aP, apf.pf, apf.pg, apf.ph, apf.pi, apf.pl, apf.pm, apf.pj, apf.pk));
   public static final dga m = a(new dga("warped", true, dak.aP, apf.pf, apf.pg, apf.ph, apf.pi, apf.pl, apf.pm, apf.pj, apf.pk));
   public static final dga n = a(new dga("mangrove"));
   public static final dga o = a(new dga("bamboo", true, dak.aO, apf.aZ, apf.ba, apf.bb, apf.bc, apf.bf, apf.bg, apf.bd, apf.be));

   public dga(String $$0) {
      this($$0, true, dak.b, apf.AC, apf.AD, apf.AE, apf.AF, apf.AI, apf.AJ, apf.AG, apf.AH);
   }

   private static dga a(dga $$0) {
      A.add($$0);
      return $$0;
   }

   public static Stream<dga> a() {
      return A.stream();
   }

   public String b() {
      return this.p;
   }

   public boolean c() {
      return this.q;
   }

   public dak d() {
      return this.r;
   }

   public ape e() {
      return this.s;
   }

   public ape f() {
      return this.t;
   }

   public ape g() {
      return this.u;
   }

   public ape h() {
      return this.v;
   }

   public ape i() {
      return this.w;
   }

   public ape j() {
      return this.x;
   }

   public ape k() {
      return this.y;
   }

   public ape l() {
      return this.z;
   }
}
