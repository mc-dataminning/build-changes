import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class afg implements zf<abu> {
   public static final yw<wj, afg> a = zf.a(afg::a, afg::new);
   private static final byte b = -128;
   private final int c;
   private final List<Pair<bws, czk>> d;

   public afg(int $$0, List<Pair<bws, czk>> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   private afg(wj $$0) {
      this.c = $$0.l();
      this.d = Lists.newArrayList();

      int $$1;
      do {
         $$1 = $$0.readByte();
         bws $$2 = bws.j.get($$1 & 127);
         czk $$3 = czk.h.decode($$0);
         this.d.add(Pair.of($$2, $$3));
      } while (($$1 & -128) != 0);
   }

   private void a(wj $$0) {
      $$0.c(this.c);
      int $$1 = this.d.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<bws, czk> $$3 = this.d.get($$2);
         bws $$4 = (bws)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.l($$5 ? $$6 | -128 : $$6);
         czk.h.encode($$0, (czk)$$3.getSecond());
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

   public List<Pair<bws, czk>> e() {
      return this.d;
   }
}
