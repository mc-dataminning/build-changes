import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Set;
import java.util.stream.Stream;

public record dgy(String l, dga m, dak n, dak o, ape p, ape q) {
   private static final Set<dgy> r = new ObjectArraySet();
   public static final dgy a = a(new dgy("oak", dga.e));
   public static final dgy b = a(new dgy("spruce", dga.f));
   public static final dgy c = a(new dgy("birch", dga.g));
   public static final dgy d = a(new dgy("acacia", dga.h));
   public static final dgy e = a(new dgy("cherry", dga.i, dak.aQ, dak.aT, apf.ef, apf.eg));
   public static final dgy f = a(new dgy("jungle", dga.j));
   public static final dgy g = a(new dgy("dark_oak", dga.k));
   public static final dgy h = a(new dgy("crimson", dga.l, dak.aP, dak.aM, apf.pn, apf.po));
   public static final dgy i = a(new dgy("warped", dga.m, dak.aP, dak.aM, apf.pn, apf.po));
   public static final dgy j = a(new dgy("mangrove", dga.n));
   public static final dgy k = a(new dgy("bamboo", dga.o, dak.aO, dak.aN, apf.bh, apf.bi));

   public dgy(String $$0, dga $$1) {
      this($$0, $$1, dak.b, dak.aL, apf.hB, apf.hC);
   }

   private static dgy a(dgy $$0) {
      r.add($$0);
      return $$0;
   }

   public static Stream<dgy> a() {
      return r.stream();
   }

   public String b() {
      return this.l;
   }

   public dga c() {
      return this.m;
   }

   public dak d() {
      return this.n;
   }

   public dak e() {
      return this.o;
   }

   public ape f() {
      return this.p;
   }

   public ape g() {
      return this.q;
   }
}
