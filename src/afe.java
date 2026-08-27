import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class afe implements zl<abw> {
   public static final zc<wp, afe> a = zl.a(afe::a, afe::new);
   private static final byte b = -128;
   private final int c;
   private final List<Pair<bsc, cuh>> d;

   public afe(int $$0, List<Pair<bsc, cuh>> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   private afe(wp $$0) {
      this.c = $$0.l();
      bsc[] $$1 = bsc.values();
      this.d = Lists.newArrayList();

      int $$2;
      do {
         $$2 = $$0.readByte();
         bsc $$3 = $$1[$$2 & 127];
         cuh $$4 = cuh.e.decode($$0);
         this.d.add(Pair.of($$3, $$4));
      } while (($$2 & -128) != 0);
   }

   private void a(wp $$0) {
      $$0.c(this.c);
      int $$1 = this.d.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<bsc, cuh> $$3 = this.d.get($$2);
         bsc $$4 = (bsc)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.k($$5 ? $$6 | -128 : $$6);
         cuh.e.encode($$0, (cuh)$$3.getSecond());
      }
   }

   @Override
   public zn<afe> a() {
      return agj.aG;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<Pair<bsc, cuh>> e() {
      return this.d;
   }
}
