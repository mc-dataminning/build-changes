import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dra extends djp {
   public static final MapCodec<dra> a = b(dra::new);
   public static final dyf b = dye.d;
   private final bsf c = bsc.a(5);

   @Override
   public MapCodec<dra> a() {
      return a;
   }

   public dra(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public duq a(jh $$0, dxo $$1) {
      return new dvz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duq> dur<T> a(dgz $$0, dxo $$1, dus<T> $$2) {
      return $$0.C ? null : a($$2, dus.L, dvz::a);
   }

   @Override
   protected dqo a_(dxo $$0) {
      return dqo.c;
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, cxg $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
