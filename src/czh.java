import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czh extends daa implements dha {
   public static final MapCodec<czh> a = b(czh::new);
   public static final dnq b = dnp.C;

   @Override
   public MapCodec<czh> a() {
      return a;
   }

   protected czh(dmy.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a_(dmz $$0, cwf $$1, ib $$2) {
      return true;
   }

   @Override
   protected dgf b_(dmz $$0) {
      return dgf.a;
   }

   @Override
   protected float d(dmz $$0, cwf $$1, ib $$2) {
      return 1.0F;
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eio.c, eio.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ein c_(dmz $$0) {
      return $$0.c(b) ? eio.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public dmz a(css $$0) {
      return this.o().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == eio.c));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b);
   }

   @Override
   public cqk a(@Nullable cis $$0, cxa $$1, ib $$2, dmz $$3) {
      return $$0 != null && $$0.f() ? dha.super.a($$0, $$1, $$2, $$3) : cqk.h;
   }

   @Override
   public boolean a(@Nullable cis $$0, cwf $$1, ib $$2, dmz $$3, eim $$4) {
      return $$0 != null && $$0.f() ? dha.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
