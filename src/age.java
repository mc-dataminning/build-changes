import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class age implements aac<acr> {
   public static final zt<xg, age> a = aac.a(age::a, age::new);
   private static final byte b = -128;
   private final int c;
   private final List<Pair<bvr, cxo>> d;

   public age(int $$0, List<Pair<bvr, cxo>> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   private age(xg $$0) {
      this.c = $$0.l();
      this.d = Lists.newArrayList();

      int $$1;
      do {
         $$1 = $$0.readByte();
         bvr $$2 = bvr.i.get($$1 & 127);
         cxo $$3 = cxo.g.decode($$0);
         this.d.add(Pair.of($$2, $$3));
      } while (($$1 & -128) != 0);
   }

   private void a(xg $$0) {
      $$0.c(this.c);
      int $$1 = this.d.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<bvr, cxo> $$3 = this.d.get($$2);
         bvr $$4 = (bvr)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.l($$5 ? $$6 | -128 : $$6);
         cxo.g.encode($$0, (cxo)$$3.getSecond());
      }
   }

   @Override
   public aae<age> a() {
      return ahk.aI;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<Pair<bvr, cxo>> e() {
      return this.d;
   }
}
