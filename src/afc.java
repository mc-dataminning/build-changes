import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class afc implements zg<abu> {
   public static final yx<wk, afc> a = zg.a(afc::a, afc::new);
   private static final byte b = -128;
   private final int c;
   private final List<Pair<bsy, cuq>> d;

   public afc(int $$0, List<Pair<bsy, cuq>> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   private afc(wk $$0) {
      this.c = $$0.l();
      bsy[] $$1 = bsy.values();
      this.d = Lists.newArrayList();

      int $$2;
      do {
         $$2 = $$0.readByte();
         bsy $$3 = $$1[$$2 & 127];
         cuq $$4 = cuq.h.decode($$0);
         this.d.add(Pair.of($$3, $$4));
      } while (($$2 & -128) != 0);
   }

   private void a(wk $$0) {
      $$0.c(this.c);
      int $$1 = this.d.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<bsy, cuq> $$3 = this.d.get($$2);
         bsy $$4 = (bsy)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.k($$5 ? $$6 | -128 : $$6);
         cuq.h.encode($$0, (cuq)$$3.getSecond());
      }
   }

   @Override
   public zi<afc> a() {
      return agg.aF;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<Pair<bsy, cuq>> e() {
      return this.d;
   }
}
