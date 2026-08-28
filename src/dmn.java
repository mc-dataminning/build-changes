import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dmn extends del {
   public static final MapCodec<dmn> a = b(dmn::new);

   @Override
   public MapCodec<dmn> a() {
      return a;
   }

   protected dmn(dsb.d $$0) {
      super($$0);
   }

   @Override
   public dph a(iz $$0, dsc $$1) {
      return new dqv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dph> dpi<T> a(dby $$0, dsc $$1, dpj<T> $$2) {
      return a($$2, dpj.j, $$0.B ? dqv::a : dqv::b);
   }

   @Override
   protected void a(dsc $$0, arf $$1, iz $$2, cup $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.z.a(15) + $$1.z.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   protected dlf a_(dsc $$0) {
      return dlf.c;
   }

   @Override
   public void a(cup $$0, cuk.b $$1, List<xp> $$2, cwi $$3) {
      super.a($$0, $$1, $$2, $$3);
      dcq.a($$0, $$2, "SpawnData");
   }
}
