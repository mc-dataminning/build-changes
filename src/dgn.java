import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Set;
import java.util.stream.Stream;

public record dgn(String l, dfp m, czz n, czz o, aov p, aov q) {
   private static final Set<dgn> r = new ObjectArraySet();
   public static final dgn a = a(new dgn("oak", dfp.e));
   public static final dgn b = a(new dgn("spruce", dfp.f));
   public static final dgn c = a(new dgn("birch", dfp.g));
   public static final dgn d = a(new dgn("acacia", dfp.h));
   public static final dgn e = a(new dgn("cherry", dfp.i, czz.aQ, czz.aT, aow.ef, aow.eg));
   public static final dgn f = a(new dgn("jungle", dfp.j));
   public static final dgn g = a(new dgn("dark_oak", dfp.k));
   public static final dgn h = a(new dgn("crimson", dfp.l, czz.aP, czz.aM, aow.pn, aow.po));
   public static final dgn i = a(new dgn("warped", dfp.m, czz.aP, czz.aM, aow.pn, aow.po));
   public static final dgn j = a(new dgn("mangrove", dfp.n));
   public static final dgn k = a(new dgn("bamboo", dfp.o, czz.aO, czz.aN, aow.bh, aow.bi));

   public dgn(String $$0, dfp $$1) {
      this($$0, $$1, czz.b, czz.aL, aow.hB, aow.hC);
   }

   private static dgn a(dgn $$0) {
      r.add($$0);
      return $$0;
   }

   public static Stream<dgn> a() {
      return r.stream();
   }

   public String b() {
      return this.l;
   }

   public dfp c() {
      return this.m;
   }

   public czz d() {
      return this.n;
   }

   public czz e() {
      return this.o;
   }

   public aov f() {
      return this.p;
   }

   public aov g() {
      return this.q;
   }
}
