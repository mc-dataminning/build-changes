import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dma extends deu {
   public static final MapCodec<dma> a = b(dma::new);
   public static final dtc b = dtb.E;
   private final bpm c = bpj.a(5);

   @Override
   public MapCodec<dma> a() {
      return a;
   }

   public dma(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dpq a(ja $$0, dsl $$1) {
      return new dqx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpq> dpr<T> a(dcg $$0, dsl $$1, dps<T> $$2) {
      return $$0.B ? null : a($$2, dps.K, dqx::a);
   }

   @Override
   protected dlo a_(dsl $$0) {
      return dlo.c;
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, cud $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
