import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class daq extends ctm {
   public static final MapCodec<daq> a = b(daq::new);
   public static final dgs b = dgr.E;
   private final bhg c = bhd.a(5);

   @Override
   public MapCodec<daq> a() {
      return a;
   }

   public daq(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b);
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public ddx a(ht $$0, dgb $$1) {
      return new dfb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends ddx> ddy<T> a(cqz $$0, dgb $$1, ddz<T> $$2) {
      return $$0.B ? null : a($$2, ddz.K, dfb::a);
   }

   @Override
   public dae b_(dgb $$0) {
      return dae.c;
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ckj $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
