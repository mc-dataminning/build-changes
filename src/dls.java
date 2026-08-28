import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dls extends dlm implements dlr {
   public static final MapCodec<dls> a = b(dls::new);

   @Override
   public MapCodec<dls> a() {
      return a;
   }

   public dls(dzy.d $$0) {
      super($$0);
   }

   @Override
   public cxw b() {
      return cxw.a;
   }

   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dws($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwx> dwy<T> a(div $$0, dzz $$1, dwz<T> $$2) {
      return a($$2, dwz.p, dws::a);
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dws $$5) {
         $$3.a($$5);
         $$3.a(awx.ab);
      }

      return bub.a;
   }
}
