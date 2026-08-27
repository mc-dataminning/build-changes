import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgc extends dfm implements dgo {
   public static final MapCodec<dgc> c = b(dgc::new);

   @Override
   public MapCodec<dgc> a() {
      return c;
   }

   protected dgc(doy.d $$0) {
      super($$0, ih.b, esq.b(), true);
   }

   @Override
   protected dfn c() {
      return (dfn)dca.mc;
   }

   @Override
   protected eks c_(doz $$0) {
      return ekt.c.a(false);
   }

   @Override
   protected boolean m(doz $$0) {
      return this.c().m($$0);
   }

   @Override
   public boolean a(@Nullable cjt $$0, cyd $$1, ib $$2, doz $$3, ekr $$4) {
      return false;
   }

   @Override
   public boolean a(cyy $$0, ib $$1, doz $$2, eks $$3) {
      return false;
   }
}
