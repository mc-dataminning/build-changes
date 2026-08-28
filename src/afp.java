import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class afp implements zv<ach> {
   public static final zm<wz, afp> a = zv.a(afp::a, afp::new);
   private static final byte b = -128;
   private final int c;
   private final List<Pair<bta, cuo>> d;

   public afp(int $$0, List<Pair<bta, cuo>> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   private afp(wz $$0) {
      this.c = $$0.l();
      bta[] $$1 = bta.values();
      this.d = Lists.newArrayList();

      int $$2;
      do {
         $$2 = $$0.readByte();
         bta $$3 = $$1[$$2 & 127];
         cuo $$4 = cuo.h.decode($$0);
         this.d.add(Pair.of($$3, $$4));
      } while (($$2 & -128) != 0);
   }

   private void a(wz $$0) {
      $$0.c(this.c);
      int $$1 = this.d.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<bta, cuo> $$3 = this.d.get($$2);
         bta $$4 = (bta)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.k($$5 ? $$6 | -128 : $$6);
         cuo.h.encode($$0, (cuo)$$3.getSecond());
      }
   }

   @Override
   public zx<afp> a() {
      return agt.aF;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<Pair<bta, cuo>> e() {
      return this.d;
   }
}
