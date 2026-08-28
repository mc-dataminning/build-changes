import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class afm implements zo<acd> {
   public static final zf<ws, afm> a = zo.a(afm::a, afm::new);
   private static final byte b = -128;
   private final int c;
   private final List<Pair<buh, cvx>> d;

   public afm(int $$0, List<Pair<buh, cvx>> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   private afm(ws $$0) {
      this.c = $$0.l();
      this.d = Lists.newArrayList();

      int $$1;
      do {
         $$1 = $$0.readByte();
         buh $$2 = buh.i.get($$1 & 127);
         cvx $$3 = cvx.h.decode($$0);
         this.d.add(Pair.of($$2, $$3));
      } while (($$1 & -128) != 0);
   }

   private void a(ws $$0) {
      $$0.c(this.c);
      int $$1 = this.d.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<buh, cvx> $$3 = this.d.get($$2);
         buh $$4 = (buh)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.l($$5 ? $$6 | -128 : $$6);
         cvx.h.encode($$0, (cvx)$$3.getSecond());
      }
   }

   @Override
   public zq<afm> a() {
      return ags.aF;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<Pair<buh, cvx>> e() {
      return this.d;
   }
}
