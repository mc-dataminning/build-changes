import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcw extends dcg implements ddi {
   public static final MapCodec<dcw> c = b(dcw::new);

   @Override
   public MapCodec<dcw> a() {
      return c;
   }

   protected dcw(dli.d $$0) {
      super($$0, ie.b, eop.b(), true);
   }

   @Override
   protected dch c() {
      return (dch)cyu.mc;
   }

   @Override
   protected egw c_(dlj $$0) {
      return egx.c.a(false);
   }

   @Override
   protected boolean m(dlj $$0) {
      return this.c().m($$0);
   }

   @Override
   public boolean a(@Nullable chl $$0, cux $$1, hz $$2, dlj $$3, egv $$4) {
      return false;
   }

   @Override
   public boolean a(cvs $$0, hz $$1, dlj $$2, egw $$3) {
      return false;
   }
}
