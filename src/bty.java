import com.google.common.collect.Sets;
import java.util.Set;
import java.util.function.ToIntFunction;

class bty extends bto {
   private final ToIntFunction<azu> c;

   protected bty(btp $$0, int $$1, ToIntFunction<azu> $$2) {
      super($$0, $$1, ls.V);
      this.c = $$2;
   }

   @Override
   public void a(arp $$0, bvh $$1, int $$2, bul.c $$3) {
      if ($$3 == bul.c.a && ($$1 instanceof cou || $$0.N().b(dfi.c))) {
         this.a($$0, $$1.dY(), $$1.dv());
      }
   }

   private void a(arp $$0, azu $$1, jh $$2) {
      Set<jh> $$3 = Sets.newHashSet();
      int $$4 = this.c.applyAsInt($$1);

      for (jh $$5 : jh.a($$1, 15, $$2, 1)) {
         jh $$6 = $$5.e();
         if (!$$3.contains($$5) && $$0.a_($$5).v() && $$0.a_($$6).c($$0, $$6, jm.b)) {
            $$3.add($$5.j());
            if ($$3.size() >= $$4) {
               break;
            }
         }
      }

      for (jh $$7 : $$3) {
         $$0.a($$7, dis.bs.m(), 3);
         $$0.c(3018, $$7, 0);
      }
   }
}
