import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class acc implements xd<yx> {
   private static final byte a = -128;
   private final int b;
   private final List<Pair<blu, cmr>> c;

   public acc(int $$0, List<Pair<blu, cmr>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public acc(ug $$0) {
      this.b = $$0.n();
      blu[] $$1 = blu.values();
      this.c = Lists.newArrayList();

      int $$2;
      do {
         $$2 = $$0.readByte();
         blu $$3 = $$1[$$2 & 127];
         cmr $$4 = $$0.r();
         this.c.add(Pair.of($$3, $$4));
      } while (($$2 & -128) != 0);
   }

   @Override
   public void a(ug $$0) {
      $$0.c(this.b);
      int $$1 = this.c.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<blu, cmr> $$3 = this.c.get($$2);
         blu $$4 = (blu)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.k($$5 ? $$6 | -128 : $$6);
         $$0.a((cmr)$$3.getSecond());
      }
   }

   public void a(yx $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.b;
   }

   public List<Pair<blu, cmr>> d() {
      return this.c;
   }
}
