import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class aab implements ve<wx> {
   private static final byte a = -128;
   private final int b;
   private final List<Pair<bjb, cjl>> c;

   public aab(int $$0, List<Pair<bjb, cjl>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public aab(so $$0) {
      this.b = $$0.n();
      bjb[] $$1 = bjb.values();
      this.c = Lists.newArrayList();

      int $$2;
      do {
         $$2 = $$0.readByte();
         bjb $$3 = $$1[$$2 & 127];
         cjl $$4 = $$0.r();
         this.c.add(Pair.of($$3, $$4));
      } while (($$2 & -128) != 0);
   }

   @Override
   public void a(so $$0) {
      $$0.c(this.b);
      int $$1 = this.c.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<bjb, cjl> $$3 = this.c.get($$2);
         bjb $$4 = (bjb)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.k($$5 ? $$6 | -128 : $$6);
         $$0.a((cjl)$$3.getSecond());
      }
   }

   public void a(wx $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.b;
   }

   public List<Pair<bjb, cjl>> d() {
      return this.c;
   }
}
