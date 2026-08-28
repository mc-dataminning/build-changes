import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqh extends diw {
   public static final MapCodec<dqh> a = b(dqh::new);
   public static final dxm b = dxl.d;
   private final brn c = brk.a(5);

   @Override
   public MapCodec<dqh> a() {
      return a;
   }

   public dqh(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dtx a(ji $$0, dwv $$1) {
      return new dvg($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtx> dty<T> a(dgg $$0, dwv $$1, dtz<T> $$2) {
      return $$0.C ? null : a($$2, dtz.L, dvg::a);
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, cwn $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
