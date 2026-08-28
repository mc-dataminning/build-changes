import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djv extends djp implements dju {
   public static final MapCodec<djv> a = b(djv::new);

   @Override
   public MapCodec<djv> a() {
      return a;
   }

   public djv(dxn.d $$0) {
      super($$0);
   }

   @Override
   public cwd b() {
      return cwd.a;
   }

   @Override
   public duq a(jh $$0, dxo $$1) {
      return new dul($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duq> dur<T> a(dgz $$0, dxo $$1, dus<T> $$2) {
      return a($$2, dus.p, dul::a);
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dul $$5) {
         $$3.a($$5);
         $$3.a(axf.ab);
      }

      return bta.a;
   }

   @Override
   protected dqo a_(dxo $$0) {
      return dqo.c;
   }
}
