import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class aac implements vf<wy> {
   private static final byte a = -128;
   private final int b;
   private final List<Pair<bix, cjh>> c;

   public aac(int $$0, List<Pair<bix, cjh>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public aac(sq $$0) {
      this.b = $$0.m();
      bix[] $$1 = bix.values();
      this.c = Lists.newArrayList();

      int $$2;
      do {
         $$2 = $$0.readByte();
         bix $$3 = $$1[$$2 & 127];
         cjh $$4 = $$0.q();
         this.c.add(Pair.of($$3, $$4));
      } while (($$2 & -128) != 0);
   }

   @Override
   public void a(sq $$0) {
      $$0.c(this.b);
      int $$1 = this.c.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<bix, cjh> $$3 = this.c.get($$2);
         bix $$4 = (bix)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.k($$5 ? $$6 | -128 : $$6);
         $$0.a((cjh)$$3.getSecond());
      }
   }

   public void a(wy $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.b;
   }

   public List<Pair<bix, cjh>> d() {
      return this.c;
   }
}
