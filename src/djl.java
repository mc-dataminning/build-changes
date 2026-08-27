import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djl extends diu implements djx {
   public static final MapCodec<djl> c = b(djl::new);

   @Override
   public MapCodec<djl> a() {
      return c;
   }

   protected djl(dtb.d $$0) {
      super($$0, iw.b, exk.b(), true);
   }

   @Override
   protected div c() {
      return (div)dfe.na;
   }

   @Override
   protected epe b_(dtc $$0) {
      return epf.c.a(false);
   }

   @Override
   protected boolean m(dtc $$0) {
      return this.c().m($$0);
   }

   @Override
   public boolean a(@Nullable cly $$0, dbg $$1, ir $$2, dtc $$3, epd $$4) {
      return false;
   }

   @Override
   public boolean a(dcb $$0, ir $$1, dtc $$2, epe $$3) {
      return false;
   }
}
