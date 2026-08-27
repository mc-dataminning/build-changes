import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class aeh implements yp<aba> {
   public static final yg<vt, aeh> a = yp.a(aeh::a, aeh::new);
   private static final byte b = -128;
   private final int c;
   private final List<Pair<bqh, crs>> d;

   public aeh(int $$0, List<Pair<bqh, crs>> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   private aeh(vt $$0) {
      this.c = $$0.l();
      bqh[] $$1 = bqh.values();
      this.d = Lists.newArrayList();

      int $$2;
      do {
         $$2 = $$0.readByte();
         bqh $$3 = $$1[$$2 & 127];
         crs $$4 = crs.e.decode($$0);
         this.d.add(Pair.of($$3, $$4));
      } while (($$2 & -128) != 0);
   }

   private void a(vt $$0) {
      $$0.c(this.c);
      int $$1 = this.d.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<bqh, crs> $$3 = this.d.get($$2);
         bqh $$4 = (bqh)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.k($$5 ? $$6 | -128 : $$6);
         crs.e.encode($$0, (crs)$$3.getSecond());
      }
   }

   @Override
   public yr<aeh> a() {
      return afl.aF;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<Pair<bqh, crs>> e() {
      return this.d;
   }
}
