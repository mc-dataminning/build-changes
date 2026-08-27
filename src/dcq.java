import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcq extends cvl {
   public static final MapCodec<dcq> a = b(dcq::new);
   public static final djg b = djf.E;
   private final biq c = bin.a(5);

   @Override
   public MapCodec<dcq> a() {
      return a;
   }

   public dcq(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b);
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dgd a(hv $$0, dip $$1) {
      return new dhi($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgd> dge<T> a(csy $$0, dip $$1, dgf<T> $$2) {
      return $$0.B ? null : a($$2, dgf.K, dhi::a);
   }

   @Override
   public dce b_(dip $$0) {
      return dce.c;
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, cmh $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
