import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class afi implements zk<abz> {
   public static final zb<wo, afi> a = zk.a(afi::a, afi::new);
   private static final byte b = -128;
   private final int c;
   private final List<Pair<btw, cvp>> d;

   public afi(int $$0, List<Pair<btw, cvp>> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   private afi(wo $$0) {
      this.c = $$0.l();
      btw[] $$1 = btw.values();
      this.d = Lists.newArrayList();

      int $$2;
      do {
         $$2 = $$0.readByte();
         btw $$3 = $$1[$$2 & 127];
         cvp $$4 = cvp.h.decode($$0);
         this.d.add(Pair.of($$3, $$4));
      } while (($$2 & -128) != 0);
   }

   private void a(wo $$0) {
      $$0.c(this.c);
      int $$1 = this.d.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<btw, cvp> $$3 = this.d.get($$2);
         btw $$4 = (btw)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.l($$5 ? $$6 | -128 : $$6);
         cvp.h.encode($$0, (cvp)$$3.getSecond());
      }
   }

   @Override
   public zm<afi> a() {
      return ago.aF;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<Pair<btw, cvp>> e() {
      return this.d;
   }
}
