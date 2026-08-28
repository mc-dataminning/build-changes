import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class afm implements zs<ace> {
   public static final zj<ww, afm> a = zs.a(afm::a, afm::new);
   private static final byte b = -128;
   private final int c;
   private final List<Pair<bsw, cuk>> d;

   public afm(int $$0, List<Pair<bsw, cuk>> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   private afm(ww $$0) {
      this.c = $$0.l();
      bsw[] $$1 = bsw.values();
      this.d = Lists.newArrayList();

      int $$2;
      do {
         $$2 = $$0.readByte();
         bsw $$3 = $$1[$$2 & 127];
         cuk $$4 = cuk.h.decode($$0);
         this.d.add(Pair.of($$3, $$4));
      } while (($$2 & -128) != 0);
   }

   private void a(ww $$0) {
      $$0.c(this.c);
      int $$1 = this.d.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<bsw, cuk> $$3 = this.d.get($$2);
         bsw $$4 = (bsw)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.k($$5 ? $$6 | -128 : $$6);
         cuk.h.encode($$0, (cuk)$$3.getSecond());
      }
   }

   @Override
   public zu<afm> a() {
      return agq.aF;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<Pair<bsw, cuk>> e() {
      return this.d;
   }
}
