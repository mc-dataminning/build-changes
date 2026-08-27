import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cwf extends cwy implements ddy {
   public static final MapCodec<cwf> a = b(cwf::new);
   public static final dkg b = dkf.C;

   @Override
   public MapCodec<cwf> a() {
      return a;
   }

   protected cwf(djo.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   public boolean a_(djp $$0, ctd $$1, hx $$2) {
      return true;
   }

   @Override
   public ddd b_(djp $$0) {
      return ddd.a;
   }

   @Override
   public float d(djp $$0, ctd $$1, hx $$2) {
      return 1.0F;
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, efa.c, efa.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eez c_(djp $$0) {
      return $$0.c(b) ? efa.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public djp a(cpp $$0) {
      return this.o().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == efa.c));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b);
   }

   @Override
   public cng a(@Nullable cfq $$0, cty $$1, hx $$2, djp $$3) {
      return $$0 != null && $$0.f() ? ddy.super.a($$0, $$1, $$2, $$3) : cng.f;
   }

   @Override
   public boolean a(@Nullable cfq $$0, ctd $$1, hx $$2, djp $$3, eey $$4) {
      return $$0 != null && $$0.f() ? ddy.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
