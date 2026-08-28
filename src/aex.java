import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class aex implements yw<abl> {
   public static final yn<wa, aex> a = yw.a(aex::a, aex::new);
   private static final byte b = -128;
   private final int c;
   private final List<Pair<bvj, cxh>> d;

   public aex(int $$0, List<Pair<bvj, cxh>> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   private aex(wa $$0) {
      this.c = $$0.l();
      this.d = Lists.newArrayList();

      int $$1;
      do {
         $$1 = $$0.readByte();
         bvj $$2 = bvj.i.get($$1 & 127);
         cxh $$3 = cxh.h.decode($$0);
         this.d.add(Pair.of($$2, $$3));
      } while (($$1 & -128) != 0);
   }

   private void a(wa $$0) {
      $$0.c(this.c);
      int $$1 = this.d.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<bvj, cxh> $$3 = this.d.get($$2);
         bvj $$4 = (bvj)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.l($$5 ? $$6 | -128 : $$6);
         cxh.h.encode($$0, (cxh)$$3.getSecond());
      }
   }

   @Override
   public yy<aex> a() {
      return agd.aH;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<Pair<bvj, cxh>> e() {
      return this.d;
   }
}
