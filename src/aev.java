import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class aev implements zb<abn> {
   public static final ys<wf, aev> a = zb.a(aev::a, aev::new);
   private static final byte b = -128;
   private final int c;
   private final List<Pair<bso, cud>> d;

   public aev(int $$0, List<Pair<bso, cud>> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   private aev(wf $$0) {
      this.c = $$0.l();
      bso[] $$1 = bso.values();
      this.d = Lists.newArrayList();

      int $$2;
      do {
         $$2 = $$0.readByte();
         bso $$3 = $$1[$$2 & 127];
         cud $$4 = cud.h.decode($$0);
         this.d.add(Pair.of($$3, $$4));
      } while (($$2 & -128) != 0);
   }

   private void a(wf $$0) {
      $$0.c(this.c);
      int $$1 = this.d.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<bso, cud> $$3 = this.d.get($$2);
         bso $$4 = (bso)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.k($$5 ? $$6 | -128 : $$6);
         cud.h.encode($$0, (cud)$$3.getSecond());
      }
   }

   @Override
   public zd<aev> a() {
      return afz.aF;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<Pair<bso, cud>> e() {
      return this.d;
   }
}
