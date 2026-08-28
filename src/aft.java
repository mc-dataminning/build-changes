import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class aft implements zr<acg> {
   public static final zi<wv, aft> a = zr.a(aft::a, aft::new);
   private static final byte b = -128;
   private final int c;
   private final List<Pair<bvj, cxg>> d;

   public aft(int $$0, List<Pair<bvj, cxg>> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   private aft(wv $$0) {
      this.c = $$0.l();
      this.d = Lists.newArrayList();

      int $$1;
      do {
         $$1 = $$0.readByte();
         bvj $$2 = bvj.i.get($$1 & 127);
         cxg $$3 = cxg.g.decode($$0);
         this.d.add(Pair.of($$2, $$3));
      } while (($$1 & -128) != 0);
   }

   private void a(wv $$0) {
      $$0.c(this.c);
      int $$1 = this.d.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<bvj, cxg> $$3 = this.d.get($$2);
         bvj $$4 = (bvj)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.l($$5 ? $$6 | -128 : $$6);
         cxg.g.encode($$0, (cxg)$$3.getSecond());
      }
   }

   @Override
   public zt<aft> a() {
      return agz.aI;
   }

   public void a(acg $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<Pair<bvj, cxg>> e() {
      return this.d;
   }
}
