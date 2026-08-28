import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnu extends dnc implements dog {
   public static final MapCodec<dnu> c = b(dnu::new);

   @Override
   public MapCodec<dnu> a() {
      return c;
   }

   protected dnu(dwx.d $$0) {
      super($$0, jn.b, fbs.b(), true);
   }

   @Override
   protected dnd c() {
      return (dnd)djp.mE;
   }

   @Override
   protected eta b_(dwy $$0) {
      return etb.c.a(false);
   }

   @Override
   protected boolean o(dwy $$0) {
      return this.c().o($$0);
   }

   @Override
   public boolean a(@Nullable coy $$0, dfo $$1, ji $$2, dwy $$3, esz $$4) {
      return false;
   }

   @Override
   public boolean a(dgk $$0, ji $$1, dwy $$2, eta $$3) {
      return false;
   }
}
