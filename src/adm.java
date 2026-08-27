import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class adm implements xx<aag> {
   public static final xo<vb, adm> a = xx.a(adm::a, adm::new);
   private static final byte b = -128;
   private final int c;
   private final List<Pair<bnx, cpd>> d;

   public adm(int $$0, List<Pair<bnx, cpd>> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   private adm(vb $$0) {
      this.c = $$0.n();
      bnx[] $$1 = bnx.values();
      this.d = Lists.newArrayList();

      int $$2;
      do {
         $$2 = $$0.readByte();
         bnx $$3 = $$1[$$2 & 127];
         cpd $$4 = cpd.f.decode($$0);
         this.d.add(Pair.of($$3, $$4));
      } while (($$2 & -128) != 0);
   }

   private void a(vb $$0) {
      $$0.c(this.c);
      int $$1 = this.d.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<bnx, cpd> $$3 = this.d.get($$2);
         bnx $$4 = (bnx)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.k($$5 ? $$6 | -128 : $$6);
         cpd.f.encode($$0, (cpd)$$3.getSecond());
      }
   }

   @Override
   public xz<adm> a() {
      return aeq.aE;
   }

   public void a(aag $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<Pair<bnx, cpd>> e() {
      return this.d;
   }
}
