import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtt extends dtb implements drq {
   public static final MapCodec<dtt> a = b(dtt::new);
   public static final dym c = dyl.D;

   @Override
   protected MapCodec<? extends dtt> a() {
      return a;
   }

   protected dtt(dxu.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dxv a(dbg $$0) {
      etx $$1 = $$0.q().b_($$0.a());
      return super.a($$0).b(c, Boolean.valueOf($$1.b(ety.c)));
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, ety.c, ety.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etx b_(dxv $$0) {
      return $$0.c(c) ? ety.c.a(true) : super.b_($$0);
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(c);
   }
}
