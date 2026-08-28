import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dno extends dtf implements dtx {
   public static final MapCodec<dno> a = b(dno::new);
   public static final ebf b = ebe.I;
   private static final Map<jb.a, ffr> e = ffo.b(dmm.a(3.0, 3.0, 16.0));

   @Override
   public MapCodec<dno> a() {
      return a;
   }

   public dno(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)).b(d, jb.a.b));
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return e.get($$0.c(d));
   }

   @Nullable
   @Override
   public eao a(ddd $$0) {
      ewv $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eww.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, eww.c, eww.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b).a(d);
   }

   @Override
   protected ewv b_(eao $$0) {
      return $$0.c(b) ? eww.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }
}
