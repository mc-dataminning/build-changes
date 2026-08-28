import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dmv extends dsl implements dtb {
   public static final MapCodec<dmv> a = b(dmv::new);
   public static final eaf b = eae.I;
   private static final Map<ja.a, feq> e = fen.b(dlu.a(3.0, 3.0, 16.0));

   @Override
   public MapCodec<dmv> a() {
      return a;
   }

   public dmv(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(false)).b(d, ja.a.b));
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return e.get($$0.c(d));
   }

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      evv $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == evw.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, evw.c, evw.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b).a(d);
   }

   @Override
   protected evv b_(dzo $$0) {
      return $$0.c(b) ? evw.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }
}
