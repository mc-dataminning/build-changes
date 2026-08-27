import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcb extends cvz {
   public static final MapCodec<dcb> a = b(dcb::new);
   public static final djg b = dcc.d;

   @Override
   public MapCodec<dcb> a() {
      return a;
   }

   public dcb(dio.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dip a(coq $$0) {
      return this.o().a(b, Boolean.valueOf($$0.q().B($$0.a())));
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, cvz $$3, hv $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$0.c(b);
         if ($$6 != $$1.B($$2)) {
            if ($$6) {
               $$1.a($$2, this, 4);
            } else {
               $$1.a($$2, $$0.a(b), 2);
            }
         }
      }
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      if ($$0.c(b) && !$$1.B($$2)) {
         $$1.a($$2, $$0.a(b), 2);
      }
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b);
   }
}
