import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class dqo extends dvj implements dtg {
   public static final MapCodec<dqo> a = b(dqo::new);
   public static final eax<ja> b = eap.T;
   private final Function<dzz, ffc> c;

   public dqo(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, ja.c).b(this.c(), Integer.valueOf(1)));
      this.c = this.q();
   }

   private Function<dzz, ffc> q() {
      return this.a(this.a(b, this.c()));
   }

   @Override
   protected MapCodec<dqo> a() {
      return a;
   }

   @Override
   public dzz a(dzz $$0, dst $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dzz a(dzz $$0, drc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public boolean a(dzz $$0, dcr $$1) {
      return this.a($$0, $$1, this.c()) ? true : super.a($$0, $$1);
   }

   @Override
   public ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return this.c.apply($$0);
   }

   @Override
   public dzz a(dcr $$0) {
      return this.a($$0, this, this.c(), b);
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b, this.c());
   }
}
