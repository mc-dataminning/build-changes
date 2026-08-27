import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class aay implements wb<xu> {
   private static final byte a = -128;
   private final int b;
   private final List<Pair<bjy, ckj>> c;

   public aay(int $$0, List<Pair<bjy, ckj>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public aay(tl $$0) {
      this.b = $$0.n();
      bjy[] $$1 = bjy.values();
      this.c = Lists.newArrayList();

      int $$2;
      do {
         $$2 = $$0.readByte();
         bjy $$3 = $$1[$$2 & 127];
         ckj $$4 = $$0.r();
         this.c.add(Pair.of($$3, $$4));
      } while (($$2 & -128) != 0);
   }

   @Override
   public void a(tl $$0) {
      $$0.c(this.b);
      int $$1 = this.c.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<bjy, ckj> $$3 = this.c.get($$2);
         bjy $$4 = (bjy)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.k($$5 ? $$6 | -128 : $$6);
         $$0.a((ckj)$$3.getSecond());
      }
   }

   public void a(xu $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.b;
   }

   public List<Pair<bjy, ckj>> d() {
      return this.c;
   }
}
