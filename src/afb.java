import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class afb implements zf<abt> {
   public static final yw<wj, afb> a = zf.a(afb::a, afb::new);
   private static final byte b = -128;
   private final int c;
   private final List<Pair<bsx, cuo>> d;

   public afb(int $$0, List<Pair<bsx, cuo>> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   private afb(wj $$0) {
      this.c = $$0.l();
      bsx[] $$1 = bsx.values();
      this.d = Lists.newArrayList();

      int $$2;
      do {
         $$2 = $$0.readByte();
         bsx $$3 = $$1[$$2 & 127];
         cuo $$4 = cuo.h.decode($$0);
         this.d.add(Pair.of($$3, $$4));
      } while (($$2 & -128) != 0);
   }

   private void a(wj $$0) {
      $$0.c(this.c);
      int $$1 = this.d.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<bsx, cuo> $$3 = this.d.get($$2);
         bsx $$4 = (bsx)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.k($$5 ? $$6 | -128 : $$6);
         cuo.h.encode($$0, (cuo)$$3.getSecond());
      }
   }

   @Override
   public zh<afb> a() {
      return agf.aF;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<Pair<bsx, cuo>> e() {
      return this.d;
   }
}
