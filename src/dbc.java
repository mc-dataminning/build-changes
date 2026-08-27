import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbc extends dam implements dbo {
   public static final MapCodec<dbc> c = b(dbc::new);

   @Override
   public MapCodec<dbc> a() {
      return c;
   }

   protected dbc(djo.d $$0) {
      super($$0, ic.b, ems.b(), true);
   }

   @Override
   protected dan c() {
      return (dan)cxa.mc;
   }

   @Override
   public eez c_(djp $$0) {
      return efa.c.a(false);
   }

   @Override
   protected boolean h(djp $$0) {
      return this.c().h($$0);
   }

   @Override
   public boolean a(@Nullable cfq $$0, ctd $$1, hx $$2, djp $$3, eey $$4) {
      return false;
   }

   @Override
   public boolean a(cty $$0, hx $$1, djp $$2, eez $$3) {
      return false;
   }
}
