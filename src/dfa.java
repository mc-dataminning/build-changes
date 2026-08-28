import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfa extends deu implements dez {
   public static final MapCodec<dfa> a = b(dfa::new);

   @Override
   public MapCodec<dfa> a() {
      return a;
   }

   public dfa(dsk.d $$0) {
      super($$0);
   }

   @Override
   public csw b() {
      return csw.a;
   }

   @Override
   public dpq a(ja $$0, dsl $$1) {
      return new dpl($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpq> dpr<T> a(dcg $$0, dsl $$1, dps<T> $$2) {
      return a($$2, dps.o, dpl::a);
   }

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      if ($$1.B) {
         return bqh.a;
      } else {
         if ($$1.c_($$2) instanceof dpl $$5) {
            $$3.a($$5);
            $$3.a(avr.ab);
         }

         return bqh.c;
      }
   }

   @Override
   protected dlo a_(dsl $$0) {
      return dlo.c;
   }
}
