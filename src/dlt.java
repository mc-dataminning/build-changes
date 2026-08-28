import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlt extends dmm implements dtx {
   public static final MapCodec<dlt> a = b(dlt::new);
   public static final ebf b = ebe.I;

   @Override
   public MapCodec<dlt> a() {
      return a;
   }

   protected dlt(ean.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean e_(eao $$0) {
      return $$0.y().c();
   }

   @Override
   protected dsz a_(eao $$0) {
      return dsz.a;
   }

   @Override
   protected float c(eao $$0, din $$1, iv $$2) {
      return 1.0F;
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, eww.c, eww.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ewv b_(eao $$0) {
      return $$0.c(b) ? eww.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public eao a(ddd $$0) {
      return this.m().b(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == eww.c));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b);
   }

   @Override
   public czk a(@Nullable bxj $$0, dji $$1, iv $$2, eao $$3) {
      if ($$0 instanceof crj $$4 && $$4.b()) {
         return dtx.super.a($$0, $$1, $$2, $$3);
      }

      return czk.k;
   }

   @Override
   public boolean a(@Nullable bxj $$0, din $$1, iv $$2, eao $$3, ewu $$4) {
      if ($$0 instanceof crj $$5 && $$5.b()) {
         return dtx.super.a($$0, $$1, $$2, $$3, $$4);
      }

      return false;
   }
}
