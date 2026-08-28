import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkb extends dku implements dsb {
   public static final MapCodec<dkb> a = b(dkb::new);
   public static final dzd b = dzc.I;

   @Override
   public MapCodec<dkb> a() {
      return a;
   }

   protected dkb(dyl.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean e_(dym $$0) {
      return $$0.y().c();
   }

   @Override
   protected drf a_(dym $$0) {
      return drf.a;
   }

   @Override
   protected float c(dym $$0, dgv $$1, jj $$2) {
      return 1.0F;
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, euu.c, euu.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected eut b_(dym $$0) {
      return $$0.c(b) ? euu.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      return this.m().b(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == euu.c));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b);
   }

   @Override
   public cxy a(@Nullable bwr $$0, dhq $$1, jj $$2, dym $$3) {
      if ($$0 instanceof cqi $$4 && $$4.b()) {
         return dsb.super.a($$0, $$1, $$2, $$3);
      }

      return cxy.k;
   }

   @Override
   public boolean a(@Nullable bwr $$0, dgv $$1, jj $$2, dym $$3, eus $$4) {
      if ($$0 instanceof cqi $$5 && $$5.b()) {
         return dsb.super.a($$0, $$1, $$2, $$3, $$4);
      }

      return false;
   }
}
