import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class aer implements yz<abk> {
   public static final yq<wd, aer> a = yz.a(aer::a, aer::new);
   private static final byte b = -128;
   private final int c;
   private final List<Pair<bqs, csd>> d;

   public aer(int $$0, List<Pair<bqs, csd>> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   private aer(wd $$0) {
      this.c = $$0.l();
      bqs[] $$1 = bqs.values();
      this.d = Lists.newArrayList();

      int $$2;
      do {
         $$2 = $$0.readByte();
         bqs $$3 = $$1[$$2 & 127];
         csd $$4 = csd.e.decode($$0);
         this.d.add(Pair.of($$3, $$4));
      } while (($$2 & -128) != 0);
   }

   private void a(wd $$0) {
      $$0.c(this.c);
      int $$1 = this.d.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<bqs, csd> $$3 = this.d.get($$2);
         bqs $$4 = (bqs)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.k($$5 ? $$6 | -128 : $$6);
         csd.e.encode($$0, (csd)$$3.getSecond());
      }
   }

   @Override
   public zb<aer> a() {
      return afv.aF;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<Pair<bqs, csd>> e() {
      return this.d;
   }
}
