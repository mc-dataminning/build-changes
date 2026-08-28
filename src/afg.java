import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class afg implements zf<abu> {
   public static final yw<wj, afg> a = zf.a(afg::a, afg::new);
   private static final byte b = -128;
   private final int c;
   private final List<Pair<bwp, czd>> d;

   public afg(int $$0, List<Pair<bwp, czd>> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   private afg(wj $$0) {
      this.c = $$0.l();
      this.d = Lists.newArrayList();

      int $$1;
      do {
         $$1 = $$0.readByte();
         bwp $$2 = bwp.j.get($$1 & 127);
         czd $$3 = czd.h.decode($$0);
         this.d.add(Pair.of($$2, $$3));
      } while (($$1 & -128) != 0);
   }

   private void a(wj $$0) {
      $$0.c(this.c);
      int $$1 = this.d.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<bwp, czd> $$3 = this.d.get($$2);
         bwp $$4 = (bwp)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.l($$5 ? $$6 | -128 : $$6);
         czd.h.encode($$0, (czd)$$3.getSecond());
      }
   }

   @Override
   public zh<afg> a() {
      return agn.aI;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<Pair<bwp, czd>> e() {
      return this.d;
   }
}
