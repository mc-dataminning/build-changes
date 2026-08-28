import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqu extends dlu implements dtb {
   public static final MapCodec<dqu> a = b(dqu::new);
   public static final eaf b = eae.I;

   @Override
   public MapCodec<dqu> a() {
      return a;
   }

   protected dqu(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean b(dzo $$0, dzo $$1, ja $$2) {
      return $$1.a(dlw.ag) && $$2.o() == ja.a.b;
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
   protected evv b_(dzo $$0) {
      return $$0.c(b) ? evw.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b);
   }
}
