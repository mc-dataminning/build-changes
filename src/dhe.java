import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhe extends dgy implements dhd {
   public static final MapCodec<dhe> a = b(dhe::new);

   @Override
   public MapCodec<dhe> a() {
      return a;
   }

   public dhe(dur.d $$0) {
      super($$0);
   }

   @Override
   public cum b() {
      return cum.a;
   }

   @Override
   public drv a(jf $$0, dus $$1) {
      return new drq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drv> drw<T> a(dej $$0, dus $$1, drx<T> $$2) {
      return a($$2, drx.o, drq::a);
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      if (!$$1.B && $$1.c_($$2) instanceof drq $$5) {
         $$3.a($$5);
         $$3.a(awq.ab);
      }

      return brs.a;
   }

   @Override
   protected dnt a_(dus $$0) {
      return dnt.c;
   }
}
