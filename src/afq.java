import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class afq implements zw<aci> {
   public static final zn<xa, afq> a = zw.a(afq::a, afq::new);
   private static final byte b = -128;
   private final int c;
   private final List<Pair<btb, cup>> d;

   public afq(int $$0, List<Pair<btb, cup>> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   private afq(xa $$0) {
      this.c = $$0.l();
      btb[] $$1 = btb.values();
      this.d = Lists.newArrayList();

      int $$2;
      do {
         $$2 = $$0.readByte();
         btb $$3 = $$1[$$2 & 127];
         cup $$4 = cup.h.decode($$0);
         this.d.add(Pair.of($$3, $$4));
      } while (($$2 & -128) != 0);
   }

   private void a(xa $$0) {
      $$0.c(this.c);
      int $$1 = this.d.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<btb, cup> $$3 = this.d.get($$2);
         btb $$4 = (btb)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.k($$5 ? $$6 | -128 : $$6);
         cup.h.encode($$0, (cup)$$3.getSecond());
      }
   }

   @Override
   public zy<afq> a() {
      return agu.aF;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<Pair<btb, cup>> e() {
      return this.d;
   }
}
