import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlb extends dlu implements dtb {
   public static final MapCodec<dlb> a = b(dlb::new);
   public static final eaf b = eae.I;

   @Override
   public MapCodec<dlb> a() {
      return a;
   }

   protected dlb(dzn.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean e_(dzo $$0) {
      return $$0.y().c();
   }

   @Override
   protected dsf a_(dzo $$0) {
      return dsf.a;
   }

   @Override
   protected float c(dzo $$0, dhv $$1, iu $$2) {
      return 1.0F;
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

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      return this.m().b(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == evw.c));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b);
   }

   @Override
   public cys a(@Nullable bwz $$0, diq $$1, iu $$2, dzo $$3) {
      if ($$0 instanceof cqs $$4 && $$4.b()) {
         return dtb.super.a($$0, $$1, $$2, $$3);
      }

      return cys.k;
   }

   @Override
   public boolean a(@Nullable bwz $$0, dhv $$1, iu $$2, dzo $$3, evu $$4) {
      if ($$0 instanceof cqs $$5 && $$5.b()) {
         return dtb.super.a($$0, $$1, $$2, $$3, $$4);
      }

      return false;
   }
}
