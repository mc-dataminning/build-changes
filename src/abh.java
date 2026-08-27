import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class abh implements wk<yd> {
   private static final byte a = -128;
   private final int b;
   private final List<Pair<bkn, clb>> c;

   public abh(int $$0, List<Pair<bkn, clb>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public abh(tu $$0) {
      this.b = $$0.n();
      bkn[] $$1 = bkn.values();
      this.c = Lists.newArrayList();

      int $$2;
      do {
         $$2 = $$0.readByte();
         bkn $$3 = $$1[$$2 & 127];
         clb $$4 = $$0.r();
         this.c.add(Pair.of($$3, $$4));
      } while (($$2 & -128) != 0);
   }

   @Override
   public void a(tu $$0) {
      $$0.c(this.b);
      int $$1 = this.c.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<bkn, clb> $$3 = this.c.get($$2);
         bkn $$4 = (bkn)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.k($$5 ? $$6 | -128 : $$6);
         $$0.a((clb)$$3.getSecond());
      }
   }

   public void a(yd $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.b;
   }

   public List<Pair<bkn, clb>> d() {
      return this.c;
   }
}
