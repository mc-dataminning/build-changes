import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyx extends cyr implements cyw {
   public static final MapCodec<cyx> a = b(cyx::new);

   @Override
   public MapCodec<cyx> a() {
      return a;
   }

   public cyx(dmd.d $$0) {
      super($$0);
   }

   @Override
   public cog b() {
      return cog.a;
   }

   @Override
   public djl a(ib $$0, dme $$1) {
      return new djg($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends djl> djm<T> a(cwe $$0, dme $$1, djn<T> $$2) {
      return a($$2, djn.o, djg::a);
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      if ($$1.B) {
         return bml.a;
      } else {
         djl $$5 = $$1.c_($$2);
         if ($$5 instanceof djg) {
            $$3.a((djg)$$5);
            $$3.a(atz.ab);
         }

         return bml.b;
      }
   }

   @Override
   protected dfk b_(dme $$0) {
      return dfk.c;
   }

   @Override
   public void a(cwe $$0, ib $$1, dme $$2, box $$3, cpq $$4) {
      if ($$4.B()) {
         djl $$5 = $$0.c_($$1);
         if ($$5 instanceof djg) {
            ((djg)$$5).a($$4.z());
         }
      }
   }
}
