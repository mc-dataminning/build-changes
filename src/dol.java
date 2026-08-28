import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dol extends dnt implements dmi {
   public static final MapCodec<dol> a = b(dol::new);
   public static final dtb c = dta.C;

   @Override
   protected MapCodec<? extends dol> a() {
      return a;
   }

   protected dol(dsj.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dsk a(cxm $$0) {
      eoh $$1 = $$0.q().b_($$0.a());
      return super.a($$0).a(c, Boolean.valueOf($$1.b(eoi.c)));
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eoi.c, eoi.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eoh b_(dsk $$0) {
      return $$0.c(c) ? eoi.c.a(true) : super.b_($$0);
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(c);
   }
}
