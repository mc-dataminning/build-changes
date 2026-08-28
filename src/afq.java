import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class afq implements zw<aci> {
   public static final zn<xa, afq> a = zw.a(afq::a, afq::new);
   private static final byte b = -128;
   private final int c;
   private final List<Pair<btd, cur>> d;

   public afq(int $$0, List<Pair<btd, cur>> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   private afq(xa $$0) {
      this.c = $$0.l();
      btd[] $$1 = btd.values();
      this.d = Lists.newArrayList();

      int $$2;
      do {
         $$2 = $$0.readByte();
         btd $$3 = $$1[$$2 & 127];
         cur $$4 = cur.h.decode($$0);
         this.d.add(Pair.of($$3, $$4));
      } while (($$2 & -128) != 0);
   }

   private void a(xa $$0) {
      $$0.c(this.c);
      int $$1 = this.d.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<btd, cur> $$3 = this.d.get($$2);
         btd $$4 = (btd)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.k($$5 ? $$6 | -128 : $$6);
         cur.h.encode($$0, (cur)$$3.getSecond());
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

   public List<Pair<btd, cur>> e() {
      return this.d;
   }
}
