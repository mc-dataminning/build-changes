import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class afi implements zh<abw> {
   public static final yy<wl, afi> a = zh.a(afi::a, afi::new);
   private static final byte b = -128;
   private final int c;
   private final List<Pair<bxd, czy>> d;

   public afi(int $$0, List<Pair<bxd, czy>> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   private afi(wl $$0) {
      this.c = $$0.l();
      this.d = Lists.newArrayList();

      int $$1;
      do {
         $$1 = $$0.readByte();
         bxd $$2 = bxd.j.get($$1 & 127);
         czy $$3 = czy.h.decode($$0);
         this.d.add(Pair.of($$2, $$3));
      } while (($$1 & -128) != 0);
   }

   private void a(wl $$0) {
      $$0.c(this.c);
      int $$1 = this.d.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<bxd, czy> $$3 = this.d.get($$2);
         bxd $$4 = (bxd)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.l($$5 ? $$6 | -128 : $$6);
         czy.h.encode($$0, (czy)$$3.getSecond());
      }
   }

   @Override
   public zj<afi> a() {
      return agp.aI;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<Pair<bxd, czy>> e() {
      return this.d;
   }
}
