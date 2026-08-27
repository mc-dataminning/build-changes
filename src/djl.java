import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class djl extends dbk {
   public static final MapCodec<djl> a = b(djl::new);

   @Override
   public MapCodec<djl> a() {
      return a;
   }

   protected djl(doy.d $$0) {
      super($$0);
   }

   @Override
   public dmf a(ib $$0, doz $$1) {
      return new dnt($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmf> dmg<T> a(cyx $$0, doz $$1, dmh<T> $$2) {
      return a($$2, dmh.j, $$0.B ? dnt::a : dnt::b);
   }

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, crj $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.z.a(15) + $$1.z.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   protected did b_(doz $$0) {
      return did.c;
   }

   @Override
   public void a(crj $$0, @Nullable cyd $$1, List<wg> $$2, csz $$3, @Nullable iz $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      czp.a($$0, $$2, "SpawnData");
   }
}
