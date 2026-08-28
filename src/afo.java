import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class afo implements zq<acf> {
   public static final zh<wu, afo> a = zq.a(afo::a, afo::new);
   private static final byte b = -128;
   private final int c;
   private final List<Pair<but, cwm>> d;

   public afo(int $$0, List<Pair<but, cwm>> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   private afo(wu $$0) {
      this.c = $$0.l();
      this.d = Lists.newArrayList();

      int $$1;
      do {
         $$1 = $$0.readByte();
         but $$2 = but.i.get($$1 & 127);
         cwm $$3 = cwm.h.decode($$0);
         this.d.add(Pair.of($$2, $$3));
      } while (($$1 & -128) != 0);
   }

   private void a(wu $$0) {
      $$0.c(this.c);
      int $$1 = this.d.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<but, cwm> $$3 = this.d.get($$2);
         but $$4 = (but)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.l($$5 ? $$6 | -128 : $$6);
         cwm.h.encode($$0, (cwm)$$3.getSecond());
      }
   }

   @Override
   public zs<afo> a() {
      return agu.aF;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<Pair<but, cwm>> e() {
      return this.d;
   }
}
