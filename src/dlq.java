import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dlq extends dln {
   public static final MapCodec<dlq> c = b(dlq::new);
   public static final ebf<ja> d = dqg.e;
   private static final Map<ja, ffk> e = ffh.c(dmf.b(16.0, 8.0, 5.0, 16.0));

   @Override
   public MapCodec<? extends dlq> a() {
      return c;
   }

   protected dlq(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(d, ja.c).b(b, Boolean.valueOf(true)));
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return e.get($$0.c(d));
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected eah a(eah $$0, dri $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(d, b);
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, ewp.c, ewp.c.a($$1));
      }

      return $$4.g() == $$0.c(d) && !$$0.a($$1, $$3) ? dmh.a.m() : $$0;
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      ja $$3 = $$0.c(d);
      iu $$4 = $$2.a($$3.g());
      eah $$5 = $$1.a_($$4);
      return $$5.c($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public eah a(dcw $$0) {
      eah $$1 = super.a($$0);
      djd $$2 = $$0.q();
      iu $$3 = $$0.a();
      ja[] $$4 = $$0.f();

      for (ja $$5 : $$4) {
         if ($$5.o().d()) {
            $$1 = $$1.b(d, $$5.g());
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }
}
