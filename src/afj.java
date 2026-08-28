import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class afj implements zl<aca> {
   public static final zc<wp, afj> a = zl.a(afj::a, afj::new);
   private static final byte b = -128;
   private final int c;
   private final List<Pair<btz, cvs>> d;

   public afj(int $$0, List<Pair<btz, cvs>> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   private afj(wp $$0) {
      this.c = $$0.l();
      btz[] $$1 = btz.values();
      this.d = Lists.newArrayList();

      int $$2;
      do {
         $$2 = $$0.readByte();
         btz $$3 = $$1[$$2 & 127];
         cvs $$4 = cvs.h.decode($$0);
         this.d.add(Pair.of($$3, $$4));
      } while (($$2 & -128) != 0);
   }

   private void a(wp $$0) {
      $$0.c(this.c);
      int $$1 = this.d.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<btz, cvs> $$3 = this.d.get($$2);
         btz $$4 = (btz)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.l($$5 ? $$6 | -128 : $$6);
         cvs.h.encode($$0, (cvs)$$3.getSecond());
      }
   }

   @Override
   public zn<afj> a() {
      return agp.aF;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<Pair<btz, cvs>> e() {
      return this.d;
   }
}
