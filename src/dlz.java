import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlz extends det {
   public static final MapCodec<dlz> a = b(dlz::new);
   public static final dtb b = dta.E;
   private final bpl c = bpi.a(5);

   @Override
   public MapCodec<dlz> a() {
      return a;
   }

   public dlz(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dpp a(ja $$0, dsk $$1) {
      return new dqw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpp> dpq<T> a(dcf $$0, dsk $$1, dpr<T> $$2) {
      return $$0.B ? null : a($$2, dpr.K, dqw::a);
   }

   @Override
   protected dln a_(dsk $$0) {
      return dln.c;
   }

   @Override
   protected void a(dsk $$0, aqm $$1, ja $$2, cuc $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
