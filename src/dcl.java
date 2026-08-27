import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcl extends cwj {
   public static final MapCodec<dcl> a = b(dcl::new);
   public static final djr b = dcm.d;

   @Override
   public MapCodec<dcl> a() {
      return a;
   }

   public dcl(diz.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dja a(cpa $$0) {
      return this.o().a(b, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, cwj $$3, hx $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$0.c(b);
         if ($$6 != $$1.C($$2)) {
            if ($$6) {
               $$1.a($$2, this, 4);
            } else {
               $$1.a($$2, $$0.a(b), 2);
            }
         }
      }
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      if ($$0.c(b) && !$$1.C($$2)) {
         $$1.a($$2, $$0.a(b), 2);
      }
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b);
   }
}
