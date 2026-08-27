import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Set;
import java.util.stream.Stream;

public record dgm(String l, dfo m, czy n, czy o, aov p, aov q) {
   private static final Set<dgm> r = new ObjectArraySet();
   public static final dgm a = a(new dgm("oak", dfo.e));
   public static final dgm b = a(new dgm("spruce", dfo.f));
   public static final dgm c = a(new dgm("birch", dfo.g));
   public static final dgm d = a(new dgm("acacia", dfo.h));
   public static final dgm e = a(new dgm("cherry", dfo.i, czy.aQ, czy.aT, aow.ef, aow.eg));
   public static final dgm f = a(new dgm("jungle", dfo.j));
   public static final dgm g = a(new dgm("dark_oak", dfo.k));
   public static final dgm h = a(new dgm("crimson", dfo.l, czy.aP, czy.aM, aow.pn, aow.po));
   public static final dgm i = a(new dgm("warped", dfo.m, czy.aP, czy.aM, aow.pn, aow.po));
   public static final dgm j = a(new dgm("mangrove", dfo.n));
   public static final dgm k = a(new dgm("bamboo", dfo.o, czy.aO, czy.aN, aow.bh, aow.bi));

   public dgm(String $$0, dfo $$1) {
      this($$0, $$1, czy.b, czy.aL, aow.hB, aow.hC);
   }

   private static dgm a(dgm $$0) {
      r.add($$0);
      return $$0;
   }

   public static Stream<dgm> a() {
      return r.stream();
   }

   public String b() {
      return this.l;
   }

   public dfo c() {
      return this.m;
   }

   public czy d() {
      return this.n;
   }

   public czy e() {
      return this.o;
   }

   public aov f() {
      return this.p;
   }

   public aov g() {
      return this.q;
   }
}
