import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class dqu extends dvr implements dtm {
   public static final MapCodec<dqu> a = b(dqu::new);
   public static final ebf<ja> b = eax.T;
   private final Function<eah, ffk> c;

   public dqu(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, ja.c).b(this.c(), Integer.valueOf(1)));
      this.c = this.q();
   }

   private Function<eah, ffk> q() {
      return this.a(this.a(b, this.c()));
   }

   @Override
   protected MapCodec<dqu> a() {
      return a;
   }

   @Override
   public eah a(eah $$0, dsz $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public eah a(eah $$0, dri $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public boolean a(eah $$0, dcw $$1) {
      return this.a($$0, $$1, this.c()) ? true : super.a($$0, $$1);
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      return a($$1, $$2.e(), ja.b);
   }

   @Override
   public ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return this.c.apply($$0);
   }

   @Override
   public eah a(dcw $$0) {
      return this.a($$0, this, this.c(), b);
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b, this.c());
   }
}
