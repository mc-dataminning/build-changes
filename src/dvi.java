import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvi extends dup implements dtb {
   public static final MapCodec<dvi> a = b(dvi::new);
   public static final eaf c = eae.I;

   @Override
   protected MapCodec<? extends dvi> a() {
      return a;
   }

   protected dvi(dzn.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      evv $$1 = $$0.q().b_($$0.a());
      return super.a($$0).b(c, Boolean.valueOf($$1.b(evw.c)));
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, evw.c, evw.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected evv b_(dzo $$0) {
      return $$0.c(c) ? evw.c.a(true) : super.b_($$0);
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(c);
   }
}
