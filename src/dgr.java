import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Set;
import java.util.stream.Stream;

public record dgr(String l, dft m, dad n, dad o, aoy p, aoy q) {
   private static final Set<dgr> r = new ObjectArraySet();
   public static final dgr a = a(new dgr("oak", dft.e));
   public static final dgr b = a(new dgr("spruce", dft.f));
   public static final dgr c = a(new dgr("birch", dft.g));
   public static final dgr d = a(new dgr("acacia", dft.h));
   public static final dgr e = a(new dgr("cherry", dft.i, dad.aQ, dad.aT, aoz.ef, aoz.eg));
   public static final dgr f = a(new dgr("jungle", dft.j));
   public static final dgr g = a(new dgr("dark_oak", dft.k));
   public static final dgr h = a(new dgr("crimson", dft.l, dad.aP, dad.aM, aoz.pn, aoz.po));
   public static final dgr i = a(new dgr("warped", dft.m, dad.aP, dad.aM, aoz.pn, aoz.po));
   public static final dgr j = a(new dgr("mangrove", dft.n));
   public static final dgr k = a(new dgr("bamboo", dft.o, dad.aO, dad.aN, aoz.bh, aoz.bi));

   public dgr(String $$0, dft $$1) {
      this($$0, $$1, dad.b, dad.aL, aoz.hB, aoz.hC);
   }

   private static dgr a(dgr $$0) {
      r.add($$0);
      return $$0;
   }

   public static Stream<dgr> a() {
      return r.stream();
   }

   public String b() {
      return this.l;
   }

   public dft c() {
      return this.m;
   }

   public dad d() {
      return this.n;
   }

   public dad e() {
      return this.o;
   }

   public aoy f() {
      return this.p;
   }

   public aoy g() {
      return this.q;
   }
}
