import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class adt implements yb<aam> {
   public static final xs<vf, adt> a = yb.a(adt::a, adt::new);
   private static final byte b = -128;
   private final int c;
   private final List<Pair<bpe, cqm>> d;

   public adt(int $$0, List<Pair<bpe, cqm>> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   private adt(vf $$0) {
      this.c = $$0.l();
      bpe[] $$1 = bpe.values();
      this.d = Lists.newArrayList();

      int $$2;
      do {
         $$2 = $$0.readByte();
         bpe $$3 = $$1[$$2 & 127];
         cqm $$4 = cqm.f.decode($$0);
         this.d.add(Pair.of($$3, $$4));
      } while (($$2 & -128) != 0);
   }

   private void a(vf $$0) {
      $$0.c(this.c);
      int $$1 = this.d.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<bpe, cqm> $$3 = this.d.get($$2);
         bpe $$4 = (bpe)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.k($$5 ? $$6 | -128 : $$6);
         cqm.f.encode($$0, (cqm)$$3.getSecond());
      }
   }

   @Override
   public yd<adt> a() {
      return aex.aF;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<Pair<bpe, cqm>> e() {
      return this.d;
   }
}
