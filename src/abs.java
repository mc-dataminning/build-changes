import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class abs implements wu<yo> {
   private static final byte a = -128;
   private final int b;
   private final List<Pair<blk, cmh>> c;

   public abs(int $$0, List<Pair<blk, cmh>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public abs(ue $$0) {
      this.b = $$0.n();
      blk[] $$1 = blk.values();
      this.c = Lists.newArrayList();

      int $$2;
      do {
         $$2 = $$0.readByte();
         blk $$3 = $$1[$$2 & 127];
         cmh $$4 = $$0.r();
         this.c.add(Pair.of($$3, $$4));
      } while (($$2 & -128) != 0);
   }

   @Override
   public void a(ue $$0) {
      $$0.c(this.b);
      int $$1 = this.c.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<blk, cmh> $$3 = this.c.get($$2);
         blk $$4 = (blk)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.k($$5 ? $$6 | -128 : $$6);
         $$0.a((cmh)$$3.getSecond());
      }
   }

   public void a(yo $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.b;
   }

   public List<Pair<blk, cmh>> d() {
      return this.c;
   }
}
