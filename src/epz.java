import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class epz extends eoc {
   public static final MapCodec<epz> d = a(epz::new);

   public epz(eod.c $$0) {
      super(epy::new, 21, 21, $$0);
   }

   @Override
   public void a(dhx $$0, dhv $$1, dzk $$2, bac $$3, env $$4, dgf $$5, eos $$6) {
      Set<jh> $$7 = bam.a(kl::i);

      for (eoh $$8 : $$6.c()) {
         if ($$8 instanceof epy $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<jh> $$10 = new ObjectArrayList($$7.stream().toList());
      bac $$11 = bac.a($$0.E()).e().a($$6.b().g());
      ae.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         jh $$13 = (jh)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, dkf.L.m(), 2);
         }
      }
   }

   private static void a(env $$0, dhx $$1, jh $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, dkf.M.m(), 2);
         $$1.a($$2, dus.O).ifPresent($$1x -> $$1x.a(ewe.aY, $$2.a()));
      }
   }

   @Override
   public eom<?> e() {
      return eom.b;
   }
}
