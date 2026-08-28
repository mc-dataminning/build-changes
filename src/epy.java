import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class epy extends eob {
   public static final MapCodec<epy> d = a(epy::new);

   public epy(eoc.c $$0) {
      super(epx::new, 21, 21, $$0);
   }

   @Override
   public void a(dhy $$0, dhw $$1, dzj $$2, bam $$3, enu $$4, dgg $$5, eor $$6) {
      Set<jh> $$7 = baw.a(kl::i);

      for (eog $$8 : $$6.c()) {
         if ($$8 instanceof epx $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<jh> $$10 = new ObjectArrayList($$7.stream().toList());
      bam $$11 = bam.a($$0.D()).e().a($$6.b().g());
      ae.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         jh $$13 = (jh)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, dkg.L.m(), 2);
         }
      }
   }

   private static void a(enu $$0, dhy $$1, jh $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, dkg.M.m(), 2);
         $$1.a($$2, dur.O).ifPresent($$1x -> $$1x.a(ewd.aY, $$2.a()));
      }
   }

   @Override
   public eol<?> e() {
      return eol.b;
   }
}
