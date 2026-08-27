import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Set;
import java.util.stream.Stream;

public record dgw(String l, dfy m, dai n, dai o, apd p, apd q) {
   private static final Set<dgw> r = new ObjectArraySet();
   public static final dgw a = a(new dgw("oak", dfy.e));
   public static final dgw b = a(new dgw("spruce", dfy.f));
   public static final dgw c = a(new dgw("birch", dfy.g));
   public static final dgw d = a(new dgw("acacia", dfy.h));
   public static final dgw e = a(new dgw("cherry", dfy.i, dai.aQ, dai.aT, ape.ef, ape.eg));
   public static final dgw f = a(new dgw("jungle", dfy.j));
   public static final dgw g = a(new dgw("dark_oak", dfy.k));
   public static final dgw h = a(new dgw("crimson", dfy.l, dai.aP, dai.aM, ape.pn, ape.po));
   public static final dgw i = a(new dgw("warped", dfy.m, dai.aP, dai.aM, ape.pn, ape.po));
   public static final dgw j = a(new dgw("mangrove", dfy.n));
   public static final dgw k = a(new dgw("bamboo", dfy.o, dai.aO, dai.aN, ape.bh, ape.bi));

   public dgw(String $$0, dfy $$1) {
      this($$0, $$1, dai.b, dai.aL, ape.hB, ape.hC);
   }

   private static dgw a(dgw $$0) {
      r.add($$0);
      return $$0;
   }

   public static Stream<dgw> a() {
      return r.stream();
   }

   public String b() {
      return this.l;
   }

   public dfy c() {
      return this.m;
   }

   public dai d() {
      return this.n;
   }

   public dai e() {
      return this.o;
   }

   public apd f() {
      return this.p;
   }

   public apd g() {
      return this.q;
   }
}
