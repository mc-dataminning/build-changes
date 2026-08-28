import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class afq implements zs<ach> {
   public static final zj<ww, afq> a = zs.a(afq::a, afq::new);
   private static final byte b = -128;
   private final int c;
   private final List<Pair<buq, cwf>> d;

   public afq(int $$0, List<Pair<buq, cwf>> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   private afq(ww $$0) {
      this.c = $$0.l();
      this.d = Lists.newArrayList();

      int $$1;
      do {
         $$1 = $$0.readByte();
         buq $$2 = buq.i.get($$1 & 127);
         cwf $$3 = cwf.h.decode($$0);
         this.d.add(Pair.of($$2, $$3));
      } while (($$1 & -128) != 0);
   }

   private void a(ww $$0) {
      $$0.c(this.c);
      int $$1 = this.d.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<buq, cwf> $$3 = this.d.get($$2);
         buq $$4 = (buq)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.l($$5 ? $$6 | -128 : $$6);
         cwf.h.encode($$0, (cwf)$$3.getSecond());
      }
   }

   @Override
   public zu<afq> a() {
      return agw.aF;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<Pair<buq, cwf>> e() {
      return this.d;
   }
}
