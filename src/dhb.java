import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhb extends dgv implements dha {
   public static final MapCodec<dhb> a = b(dhb::new);

   @Override
   public MapCodec<dhb> a() {
      return a;
   }

   public dhb(dun.d $$0) {
      super($$0);
   }

   @Override
   public cuj b() {
      return cuj.a;
   }

   @Override
   public drs a(je $$0, duo $$1) {
      return new drn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drs> drt<T> a(deg $$0, duo $$1, dru<T> $$2) {
      return a($$2, dru.o, drn::a);
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      if (!$$1.B && $$1.c_($$2) instanceof drn $$5) {
         $$3.a($$5);
         $$3.a(awo.ab);
      }

      return brp.a;
   }

   @Override
   protected dnq a_(duo $$0) {
      return dnq.c;
   }
}
