import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class acg implements xg<zb> {
   private static final byte a = -128;
   private final int b;
   private final List<Pair<bmd, cng>> c;

   public acg(int $$0, List<Pair<bmd, cng>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public acg(uj $$0) {
      this.b = $$0.n();
      bmd[] $$1 = bmd.values();
      this.c = Lists.newArrayList();

      int $$2;
      do {
         $$2 = $$0.readByte();
         bmd $$3 = $$1[$$2 & 127];
         cng $$4 = $$0.r();
         this.c.add(Pair.of($$3, $$4));
      } while (($$2 & -128) != 0);
   }

   @Override
   public void a(uj $$0) {
      $$0.c(this.b);
      int $$1 = this.c.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<bmd, cng> $$3 = this.c.get($$2);
         bmd $$4 = (bmd)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.k($$5 ? $$6 | -128 : $$6);
         $$0.a((cng)$$3.getSecond());
      }
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.b;
   }

   public List<Pair<bmd, cng>> d() {
      return this.c;
   }
}
