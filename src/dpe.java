import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class dpe extends dvj implements dmd, dtg {
   public static final MapCodec<dpe> a = b(dpe::new);
   public static final eax<ja> b = eap.T;
   public static final eaz c = eap.U;
   private final Function<dzz, ffc> g;

   @Override
   public MapCodec<dpe> a() {
      return a;
   }

   protected dpe(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, ja.c).b(c, Integer.valueOf(1)));
      this.g = this.q();
   }

   private Function<dzz, ffc> q() {
      return this.a(this.a(b, c));
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
      return this.a($$0, $$1, c) ? true : super.a($$0, $$1);
   }

   @Override
   public ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return this.g.apply($$0);
   }

   @Override
   public double b() {
      return 3.0;
   }

   @Override
   public eaz c() {
      return c;
   }

   @Override
   public dzz a(dcr $$0) {
      return this.a($$0, this, c, b);
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b, c);
   }

   @Override
   public boolean a(diy $$0, iu $$1, dzz $$2) {
      return true;
   }

   @Override
   public boolean a(div $$0, azv $$1, iu $$2, dzz $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, dzz $$3) {
      int $$4 = $$3.c(c);
      if ($$4 < 4) {
         $$0.a($$2, $$3.b(c, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cyy(this));
      }
   }
}
