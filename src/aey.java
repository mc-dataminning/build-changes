import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class aey implements yw<abl> {
   public static final yn<wa, aey> a = yw.a(aey::a, aey::new);
   private static final byte b = -128;
   private final int c;
   private final List<Pair<buu, cwq>> d;

   public aey(int $$0, List<Pair<buu, cwq>> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   private aey(wa $$0) {
      this.c = $$0.l();
      this.d = Lists.newArrayList();

      int $$1;
      do {
         $$1 = $$0.readByte();
         buu $$2 = buu.i.get($$1 & 127);
         cwq $$3 = cwq.g.decode($$0);
         this.d.add(Pair.of($$2, $$3));
      } while (($$1 & -128) != 0);
   }

   private void a(wa $$0) {
      $$0.c(this.c);
      int $$1 = this.d.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<buu, cwq> $$3 = this.d.get($$2);
         buu $$4 = (buu)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.l($$5 ? $$6 | -128 : $$6);
         cwq.g.encode($$0, (cwq)$$3.getSecond());
      }
   }

   @Override
   public yy<aey> a() {
      return age.aI;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<Pair<buu, cwq>> e() {
      return this.d;
   }
}
