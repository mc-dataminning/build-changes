import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsz extends dlm {
   public static final MapCodec<dsz> a = b(dsz::new);
   public static final eaq b = eap.c;
   private final btg c = btd.a(5);

   @Override
   public MapCodec<dsz> a() {
      return a;
   }

   public dsz(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dyh($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwx> dwy<T> a(div $$0, dzz $$1, dwz<T> $$2) {
      return $$0.C ? null : a($$2, dwz.L, dyh::a);
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, cyy $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
