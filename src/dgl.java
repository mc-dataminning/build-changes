import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Set;
import java.util.stream.Stream;

public record dgl(String l, dfn m, czx n, czx o, aot p, aot q) {
   private static final Set<dgl> r = new ObjectArraySet();
   public static final dgl a = a(new dgl("oak", dfn.e));
   public static final dgl b = a(new dgl("spruce", dfn.f));
   public static final dgl c = a(new dgl("birch", dfn.g));
   public static final dgl d = a(new dgl("acacia", dfn.h));
   public static final dgl e = a(new dgl("cherry", dfn.i, czx.aQ, czx.aT, aou.ef, aou.eg));
   public static final dgl f = a(new dgl("jungle", dfn.j));
   public static final dgl g = a(new dgl("dark_oak", dfn.k));
   public static final dgl h = a(new dgl("crimson", dfn.l, czx.aP, czx.aM, aou.pn, aou.po));
   public static final dgl i = a(new dgl("warped", dfn.m, czx.aP, czx.aM, aou.pn, aou.po));
   public static final dgl j = a(new dgl("mangrove", dfn.n));
   public static final dgl k = a(new dgl("bamboo", dfn.o, czx.aO, czx.aN, aou.bh, aou.bi));

   public dgl(String $$0, dfn $$1) {
      this($$0, $$1, czx.b, czx.aL, aou.hB, aou.hC);
   }

   private static dgl a(dgl $$0) {
      r.add($$0);
      return $$0;
   }

   public static Stream<dgl> a() {
      return r.stream();
   }

   public String b() {
      return this.l;
   }

   public dfn c() {
      return this.m;
   }

   public czx d() {
      return this.n;
   }

   public czx e() {
      return this.o;
   }

   public aot f() {
      return this.p;
   }

   public aot g() {
      return this.q;
   }
}
