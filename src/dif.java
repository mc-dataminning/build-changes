import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dif extends dho implements dir {
   public static final MapCodec<dif> c = b(dif::new);

   @Override
   public MapCodec<dif> a() {
      return c;
   }

   protected dif(drc.d $$0) {
      super($$0, it.b, evc.b(), true);
   }

   @Override
   protected dhp c() {
      return (dhp)dec.mc;
   }

   @Override
   protected emw b_(drd $$0) {
      return emx.c.a(false);
   }

   @Override
   protected boolean m(drd $$0) {
      return this.c().m($$0);
   }

   @Override
   public boolean a(@Nullable cly $$0, daf $$1, io $$2, drd $$3, emv $$4) {
      return false;
   }

   @Override
   public boolean a(dba $$0, io $$1, drd $$2, emw $$3) {
      return false;
   }
}
