import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class afe implements zd<abs> {
   public static final yu<wh, afe> a = zd.a(afe::a, afe::new);
   private static final byte b = -128;
   private final int c;
   private final List<Pair<bwk, cys>> d;

   public afe(int $$0, List<Pair<bwk, cys>> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   private afe(wh $$0) {
      this.c = $$0.l();
      this.d = Lists.newArrayList();

      int $$1;
      do {
         $$1 = $$0.readByte();
         bwk $$2 = bwk.j.get($$1 & 127);
         cys $$3 = cys.h.decode($$0);
         this.d.add(Pair.of($$2, $$3));
      } while (($$1 & -128) != 0);
   }

   private void a(wh $$0) {
      $$0.c(this.c);
      int $$1 = this.d.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<bwk, cys> $$3 = this.d.get($$2);
         bwk $$4 = (bwk)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.l($$5 ? $$6 | -128 : $$6);
         cys.h.encode($$0, (cys)$$3.getSecond());
      }
   }

   @Override
   public zf<afe> a() {
      return agl.aI;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<Pair<bwk, cys>> e() {
      return this.d;
   }
}
