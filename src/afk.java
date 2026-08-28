import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class afk implements zj<aby> {
   public static final za<wn, afk> a = zj.a(afk::a, afk::new);
   private static final byte b = -128;
   private final int c;
   private final List<Pair<bxf, daa>> d;

   public afk(int $$0, List<Pair<bxf, daa>> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   private afk(wn $$0) {
      this.c = $$0.l();
      this.d = Lists.newArrayList();

      int $$1;
      do {
         $$1 = $$0.readByte();
         bxf $$2 = bxf.j.get($$1 & 127);
         daa $$3 = daa.h.decode($$0);
         this.d.add(Pair.of($$2, $$3));
      } while (($$1 & -128) != 0);
   }

   private void a(wn $$0) {
      $$0.c(this.c);
      int $$1 = this.d.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<bxf, daa> $$3 = this.d.get($$2);
         bxf $$4 = (bxf)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.l($$5 ? $$6 | -128 : $$6);
         daa.h.encode($$0, (daa)$$3.getSecond());
      }
   }

   @Override
   public zl<afk> a() {
      return agr.aI;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<Pair<bxf, daa>> e() {
      return this.d;
   }
}
