import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dnh extends dsy implements dtq {
   public static final MapCodec<dnh> a = b(dnh::new);
   public static final eay b = eax.I;
   private static final Map<ja.a, ffk> e = ffh.b(dmf.a(3.0, 3.0, 16.0));

   @Override
   public MapCodec<dnh> a() {
      return a;
   }

   public dnh(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)).b(d, ja.a.b));
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return e.get($$0.c(d));
   }

   @Nullable
   @Override
   public eah a(dcw $$0) {
      ewo $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ewp.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, ewp.c, ewp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b).a(d);
   }

   @Override
   protected ewo b_(eah $$0) {
      return $$0.c(b) ? ewp.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return false;
   }
}
