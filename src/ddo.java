import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Set;
import java.util.stream.Stream;

public record ddo(String l, dcq m, cxa n, cxa o, amg p, amg q) {
   private static final Set<ddo> r = new ObjectArraySet();
   public static final ddo a = a(new ddo("oak", dcq.e));
   public static final ddo b = a(new ddo("spruce", dcq.f));
   public static final ddo c = a(new ddo("birch", dcq.g));
   public static final ddo d = a(new ddo("acacia", dcq.h));
   public static final ddo e = a(new ddo("cherry", dcq.i, cxa.aQ, cxa.aT, amh.ef, amh.eg));
   public static final ddo f = a(new ddo("jungle", dcq.j));
   public static final ddo g = a(new ddo("dark_oak", dcq.k));
   public static final ddo h = a(new ddo("crimson", dcq.l, cxa.aP, cxa.aM, amh.pn, amh.po));
   public static final ddo i = a(new ddo("warped", dcq.m, cxa.aP, cxa.aM, amh.pn, amh.po));
   public static final ddo j = a(new ddo("mangrove", dcq.n));
   public static final ddo k = a(new ddo("bamboo", dcq.o, cxa.aO, cxa.aN, amh.bh, amh.bi));

   public ddo(String $$0, dcq $$1) {
      this($$0, $$1, cxa.b, cxa.aL, amh.hB, amh.hC);
   }

   private static ddo a(ddo $$0) {
      r.add($$0);
      return $$0;
   }

   public static Stream<ddo> a() {
      return r.stream();
   }

   public String b() {
      return this.l;
   }

   public dcq c() {
      return this.m;
   }

   public cxa d() {
      return this.n;
   }

   public cxa e() {
      return this.o;
   }

   public amg f() {
      return this.p;
   }

   public amg g() {
      return this.q;
   }
}
