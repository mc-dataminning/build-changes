import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cvq extends cwj implements ddj {
   public static final MapCodec<cvq> a = b(cvq::new);
   public static final djr b = djq.C;

   @Override
   public MapCodec<cvq> a() {
      return a;
   }

   protected cvq(diz.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   public boolean a_(dja $$0, cso $$1, hx $$2) {
      return true;
   }

   @Override
   public dco b_(dja $$0) {
      return dco.a;
   }

   @Override
   public float d(dja $$0, cso $$1, hx $$2) {
      return 1.0F;
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eel.c, eel.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eek c_(dja $$0) {
      return $$0.c(b) ? eel.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public dja a(cpa $$0) {
      return this.o().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == eel.c));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b);
   }

   @Override
   public cmr a(@Nullable cfb $$0, ctj $$1, hx $$2, dja $$3) {
      return $$0 != null && $$0.f() ? ddj.super.a($$0, $$1, $$2, $$3) : cmr.f;
   }

   @Override
   public boolean a(@Nullable cfb $$0, cso $$1, hx $$2, dja $$3, eej $$4) {
      return $$0 != null && $$0.f() ? ddj.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
