import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Set;
import java.util.stream.Stream;

public record dcq(String p, boolean q, cxa r, amg s, amg t, amg u, amg v, amg w, amg x, amg y, amg z) {
   private static final Set<dcq> A = new ObjectArraySet();
   public static final dcq a = a(new dcq("iron", false, cxa.g, amh.lK, amh.lL, amh.lS, amh.lT, amh.nd, amh.ne, amh.xl, amh.xm));
   public static final dcq b = a(new dcq("gold", false, cxa.g, amh.lK, amh.lL, amh.lS, amh.lT, amh.nd, amh.ne, amh.xl, amh.xm));
   public static final dcq c = a(new dcq("stone", true, cxa.f, amh.lK, amh.lL, amh.lS, amh.lT, amh.xq, amh.xr, amh.xl, amh.xm));
   public static final dcq d = a(new dcq("polished_blackstone", true, cxa.f, amh.lK, amh.lL, amh.lS, amh.lT, amh.xq, amh.xr, amh.xl, amh.xm));
   public static final dcq e = a(new dcq("oak"));
   public static final dcq f = a(new dcq("spruce"));
   public static final dcq g = a(new dcq("birch"));
   public static final dcq h = a(new dcq("acacia"));
   public static final dcq i = a(new dcq("cherry", true, cxa.aQ, amh.dX, amh.dY, amh.dZ, amh.ea, amh.ed, amh.ee, amh.eb, amh.ec));
   public static final dcq j = a(new dcq("jungle"));
   public static final dcq k = a(new dcq("dark_oak"));
   public static final dcq l = a(new dcq("crimson", true, cxa.aP, amh.pf, amh.pg, amh.ph, amh.pi, amh.pl, amh.pm, amh.pj, amh.pk));
   public static final dcq m = a(new dcq("warped", true, cxa.aP, amh.pf, amh.pg, amh.ph, amh.pi, amh.pl, amh.pm, amh.pj, amh.pk));
   public static final dcq n = a(new dcq("mangrove"));
   public static final dcq o = a(new dcq("bamboo", true, cxa.aO, amh.aZ, amh.ba, amh.bb, amh.bc, amh.bf, amh.bg, amh.bd, amh.be));

   public dcq(String $$0) {
      this($$0, true, cxa.b, amh.Ar, amh.As, amh.At, amh.Au, amh.Ax, amh.Ay, amh.Av, amh.Aw);
   }

   private static dcq a(dcq $$0) {
      A.add($$0);
      return $$0;
   }

   public static Stream<dcq> a() {
      return A.stream();
   }

   public String b() {
      return this.p;
   }

   public boolean c() {
      return this.q;
   }

   public cxa d() {
      return this.r;
   }

   public amg e() {
      return this.s;
   }

   public amg f() {
      return this.t;
   }

   public amg g() {
      return this.u;
   }

   public amg h() {
      return this.v;
   }

   public amg i() {
      return this.w;
   }

   public amg j() {
      return this.x;
   }

   public amg k() {
      return this.y;
   }

   public amg l() {
      return this.z;
   }
}
