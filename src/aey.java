import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class aey implements yw<abl> {
   public static final yn<wa, aey> a = yw.a(aey::a, aey::new);
   private static final byte b = -128;
   private final int c;
   private final List<Pair<bus, cwo>> d;

   public aey(int $$0, List<Pair<bus, cwo>> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   private aey(wa $$0) {
      this.c = $$0.l();
      this.d = Lists.newArrayList();

      int $$1;
      do {
         $$1 = $$0.readByte();
         bus $$2 = bus.i.get($$1 & 127);
         cwo $$3 = cwo.g.decode($$0);
         this.d.add(Pair.of($$2, $$3));
      } while (($$1 & -128) != 0);
   }

   private void a(wa $$0) {
      $$0.c(this.c);
      int $$1 = this.d.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<bus, cwo> $$3 = this.d.get($$2);
         bus $$4 = (bus)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.l($$5 ? $$6 | -128 : $$6);
         cwo.g.encode($$0, (cwo)$$3.getSecond());
      }
   }

   @Override
   public yy<aey> a() {
      return age.aI;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<Pair<bus, cwo>> e() {
      return this.d;
   }
}
