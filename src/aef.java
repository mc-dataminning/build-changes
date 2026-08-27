import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class aef implements yn<aay> {
   public static final ye<vr, aef> a = yn.a(aef::a, aef::new);
   private static final byte b = -128;
   private final int c;
   private final List<Pair<bqc, crj>> d;

   public aef(int $$0, List<Pair<bqc, crj>> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   private aef(vr $$0) {
      this.c = $$0.l();
      bqc[] $$1 = bqc.values();
      this.d = Lists.newArrayList();

      int $$2;
      do {
         $$2 = $$0.readByte();
         bqc $$3 = $$1[$$2 & 127];
         crj $$4 = crj.e.decode($$0);
         this.d.add(Pair.of($$3, $$4));
      } while (($$2 & -128) != 0);
   }

   private void a(vr $$0) {
      $$0.c(this.c);
      int $$1 = this.d.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<bqc, crj> $$3 = this.d.get($$2);
         bqc $$4 = (bqc)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.k($$5 ? $$6 | -128 : $$6);
         crj.e.encode($$0, (crj)$$3.getSecond());
      }
   }

   @Override
   public yp<aef> a() {
      return afj.aF;
   }

   public void a(aay $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<Pair<bqc, crj>> e() {
      return this.d;
   }
}
