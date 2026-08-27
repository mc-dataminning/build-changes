import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class adp implements xz<aai> {
   public static final xq<vd, adp> a = xz.a(adp::a, adp::new);
   private static final byte b = -128;
   private final int c;
   private final List<Pair<bom, cpq>> d;

   public adp(int $$0, List<Pair<bom, cpq>> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   private adp(vd $$0) {
      this.c = $$0.l();
      bom[] $$1 = bom.values();
      this.d = Lists.newArrayList();

      int $$2;
      do {
         $$2 = $$0.readByte();
         bom $$3 = $$1[$$2 & 127];
         cpq $$4 = cpq.f.decode($$0);
         this.d.add(Pair.of($$3, $$4));
      } while (($$2 & -128) != 0);
   }

   private void a(vd $$0) {
      $$0.c(this.c);
      int $$1 = this.d.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<bom, cpq> $$3 = this.d.get($$2);
         bom $$4 = (bom)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.k($$5 ? $$6 | -128 : $$6);
         cpq.f.encode($$0, (cpq)$$3.getSecond());
      }
   }

   @Override
   public yb<adp> a() {
      return aet.aF;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<Pair<bom, cpq>> e() {
      return this.d;
   }
}
