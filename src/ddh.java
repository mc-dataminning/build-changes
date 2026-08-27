import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddh extends cwc {
   public static final MapCodec<ddh> a = b(ddh::new);
   public static final djy b = djx.E;
   private final bjg c = bjd.a(5);

   @Override
   public MapCodec<ddh> a() {
      return a;
   }

   public ddh(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b);
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dgv a(hx $$0, djh $$1) {
      return new dia($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgv> dgw<T> a(ctp $$0, djh $$1, dgx<T> $$2) {
      return $$0.B ? null : a($$2, dgx.K, dia::a);
   }

   @Override
   public dcv b_(djh $$0) {
      return dcv.c;
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, cmy $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
