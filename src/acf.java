import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class acf implements xf<za> {
   private static final byte a = -128;
   private final int b;
   private final List<Pair<bma, cmy>> c;

   public acf(int $$0, List<Pair<bma, cmy>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public acf(ui $$0) {
      this.b = $$0.n();
      bma[] $$1 = bma.values();
      this.c = Lists.newArrayList();

      int $$2;
      do {
         $$2 = $$0.readByte();
         bma $$3 = $$1[$$2 & 127];
         cmy $$4 = $$0.r();
         this.c.add(Pair.of($$3, $$4));
      } while (($$2 & -128) != 0);
   }

   @Override
   public void a(ui $$0) {
      $$0.c(this.b);
      int $$1 = this.c.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<bma, cmy> $$3 = this.c.get($$2);
         bma $$4 = (bma)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.k($$5 ? $$6 | -128 : $$6);
         $$0.a((cmy)$$3.getSecond());
      }
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.b;
   }

   public List<Pair<bma, cmy>> d() {
      return this.c;
   }
}
