import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class aet implements zb<abm> {
   public static final ys<wf, aet> a = zb.a(aet::a, aet::new);
   private static final byte b = -128;
   private final int c;
   private final List<Pair<bro, csz>> d;

   public aet(int $$0, List<Pair<bro, csz>> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   private aet(wf $$0) {
      this.c = $$0.l();
      bro[] $$1 = bro.values();
      this.d = Lists.newArrayList();

      int $$2;
      do {
         $$2 = $$0.readByte();
         bro $$3 = $$1[$$2 & 127];
         csz $$4 = csz.e.decode($$0);
         this.d.add(Pair.of($$3, $$4));
      } while (($$2 & -128) != 0);
   }

   private void a(wf $$0) {
      $$0.c(this.c);
      int $$1 = this.d.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<bro, csz> $$3 = this.d.get($$2);
         bro $$4 = (bro)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.k($$5 ? $$6 | -128 : $$6);
         csz.e.encode($$0, (csz)$$3.getSecond());
      }
   }

   @Override
   public zd<aet> a() {
      return afx.aF;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<Pair<bro, csz>> e() {
      return this.d;
   }
}
