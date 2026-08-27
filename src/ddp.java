import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddp extends cwk {
   public static final MapCodec<ddp> a = b(ddp::new);
   public static final dkg b = dkf.E;
   private final bjh c = bje.a(5);

   @Override
   public MapCodec<ddp> a() {
      return a;
   }

   public ddp(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b);
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dhd a(hx $$0, djp $$1) {
      return new dii($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dhd> dhe<T> a(ctx $$0, djp $$1, dhf<T> $$2) {
      return $$0.B ? null : a($$2, dhf.K, dii::a);
   }

   @Override
   public ddd b_(djp $$0) {
      return ddd.c;
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, cng $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
