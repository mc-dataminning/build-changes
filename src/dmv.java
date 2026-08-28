import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dmv extends det {
   public static final MapCodec<dmv> a = b(dmv::new);

   @Override
   public MapCodec<dmv> a() {
      return a;
   }

   protected dmv(dsj.d $$0) {
      super($$0);
   }

   @Override
   public dpp a(ja $$0, dsk $$1) {
      return new dre($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpp> dpq<T> a(dcf $$0, dsk $$1, dpr<T> $$2) {
      return a($$2, dpr.j, $$0.B ? dre::a : dre::b);
   }

   @Override
   protected void a(dsk $$0, aqm $$1, ja $$2, cuc $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.z.a(15) + $$1.z.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   protected dln a_(dsk $$0) {
      return dln.c;
   }

   @Override
   public void a(cuc $$0, ctx.b $$1, List<wu> $$2, cvv $$3) {
      super.a($$0, $$1, $$2, $$3);
      dcy.a($$0, $$2, "SpawnData");
   }
}
