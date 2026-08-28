import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class afd implements zc<abr> {
   public static final yt<wg, afd> a = zc.a(afd::a, afd::new);
   private static final byte b = -128;
   private final int c;
   private final List<Pair<bwc, cxy>> d;

   public afd(int $$0, List<Pair<bwc, cxy>> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   private afd(wg $$0) {
      this.c = $$0.l();
      this.d = Lists.newArrayList();

      int $$1;
      do {
         $$1 = $$0.readByte();
         bwc $$2 = bwc.j.get($$1 & 127);
         cxy $$3 = cxy.h.decode($$0);
         this.d.add(Pair.of($$2, $$3));
      } while (($$1 & -128) != 0);
   }

   private void a(wg $$0) {
      $$0.c(this.c);
      int $$1 = this.d.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<bwc, cxy> $$3 = this.d.get($$2);
         bwc $$4 = (bwc)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.l($$5 ? $$6 | -128 : $$6);
         cxy.h.encode($$0, (cxy)$$3.getSecond());
      }
   }

   @Override
   public ze<afd> a() {
      return agk.aI;
   }

   public void a(abr $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<Pair<bwc, cxy>> e() {
      return this.d;
   }
}
