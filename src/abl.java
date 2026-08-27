import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class abl implements wo<yh> {
   private static final byte a = -128;
   private final int b;
   private final List<Pair<bla, clo>> c;

   public abl(int $$0, List<Pair<bla, clo>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public abl(ty $$0) {
      this.b = $$0.n();
      bla[] $$1 = bla.values();
      this.c = Lists.newArrayList();

      int $$2;
      do {
         $$2 = $$0.readByte();
         bla $$3 = $$1[$$2 & 127];
         clo $$4 = $$0.r();
         this.c.add(Pair.of($$3, $$4));
      } while (($$2 & -128) != 0);
   }

   @Override
   public void a(ty $$0) {
      $$0.c(this.b);
      int $$1 = this.c.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<bla, clo> $$3 = this.c.get($$2);
         bla $$4 = (bla)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.k($$5 ? $$6 | -128 : $$6);
         $$0.a((clo)$$3.getSecond());
      }
   }

   public void a(yh $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.b;
   }

   public List<Pair<bla, clo>> d() {
      return this.c;
   }
}
