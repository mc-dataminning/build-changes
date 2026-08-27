import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class aaa implements vd<ww> {
   private static final byte a = -128;
   private final int b;
   private final List<Pair<biv, cjf>> c;

   public aaa(int $$0, List<Pair<biv, cjf>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public aaa(so $$0) {
      this.b = $$0.m();
      biv[] $$1 = biv.values();
      this.c = Lists.newArrayList();

      int $$2;
      do {
         $$2 = $$0.readByte();
         biv $$3 = $$1[$$2 & 127];
         cjf $$4 = $$0.q();
         this.c.add(Pair.of($$3, $$4));
      } while (($$2 & -128) != 0);
   }

   @Override
   public void a(so $$0) {
      $$0.c(this.b);
      int $$1 = this.c.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<biv, cjf> $$3 = this.c.get($$2);
         biv $$4 = (biv)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.k($$5 ? $$6 | -128 : $$6);
         $$0.a((cjf)$$3.getSecond());
      }
   }

   public void a(ww $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.b;
   }

   public List<Pair<biv, cjf>> d() {
      return this.c;
   }
}
