import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class afr implements zo<acf> {
   public static final ze<wp, afr> a = zo.a(afr::a, afr::new);
   private static final byte b = -128;
   private final int c;
   private final List<Pair<bxo, dak>> d;

   public afr(int $$0, List<Pair<bxo, dak>> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   private afr(wp $$0) {
      this.c = $$0.l();
      this.d = Lists.newArrayList();

      int $$1;
      do {
         $$1 = $$0.readByte();
         bxo $$2 = bxo.j.get($$1 & 127);
         dak $$3 = dak.h.decode($$0);
         this.d.add(Pair.of($$2, $$3));
      } while (($$1 & -128) != 0);
   }

   private void a(wp $$0) {
      $$0.c(this.c);
      int $$1 = this.d.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<bxo, dak> $$3 = this.d.get($$2);
         bxo $$4 = (bxo)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.l($$5 ? $$6 | -128 : $$6);
         dak.h.encode($$0, (dak)$$3.getSecond());
      }
   }

   @Override
   public zq<afr> a() {
      return agy.aI;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<Pair<bxo, dak>> e() {
      return this.d;
   }
}
