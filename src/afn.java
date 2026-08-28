import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class afn implements zp<ace> {
   public static final zg<wt, afn> a = zp.a(afn::a, afn::new);
   private static final byte b = -128;
   private final int c;
   private final List<Pair<bum, cwb>> d;

   public afn(int $$0, List<Pair<bum, cwb>> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   private afn(wt $$0) {
      this.c = $$0.l();
      this.d = Lists.newArrayList();

      int $$1;
      do {
         $$1 = $$0.readByte();
         bum $$2 = bum.i.get($$1 & 127);
         cwb $$3 = cwb.h.decode($$0);
         this.d.add(Pair.of($$2, $$3));
      } while (($$1 & -128) != 0);
   }

   private void a(wt $$0) {
      $$0.c(this.c);
      int $$1 = this.d.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<bum, cwb> $$3 = this.d.get($$2);
         bum $$4 = (bum)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.l($$5 ? $$6 | -128 : $$6);
         cwb.h.encode($$0, (cwb)$$3.getSecond());
      }
   }

   @Override
   public zr<afn> a() {
      return agt.aF;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<Pair<bum, cwb>> e() {
      return this.d;
   }
}
