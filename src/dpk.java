import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class dpk extends dvr implements dmi, dtm {
   public static final MapCodec<dpk> a = b(dpk::new);
   public static final ebf<ja> b = eax.T;
   public static final ebh c = eax.U;
   private final Function<eah, ffk> g;

   @Override
   public MapCodec<dpk> a() {
      return a;
   }

   protected dpk(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, ja.c).b(c, Integer.valueOf(1)));
      this.g = this.q();
   }

   private Function<eah, ffk> q() {
      return this.a(this.a(b, c));
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
      return this.a($$0, $$1, c) ? true : super.a($$0, $$1);
   }

   @Override
   public ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return this.g.apply($$0);
   }

   @Override
   public double b() {
      return 3.0;
   }

   @Override
   public ebh c() {
      return c;
   }

   @Override
   public eah a(dcw $$0) {
      return this.a($$0, this, c, b);
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b, c);
   }

   @Override
   public boolean a(djd $$0, iu $$1, eah $$2) {
      return true;
   }

   @Override
   public boolean a(dja $$0, azv $$1, iu $$2, eah $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, eah $$3) {
      int $$4 = $$3.c(c);
      if ($$4 < 4) {
         $$0.a($$2, $$3.b(c, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new czd(this));
      }
   }
}
