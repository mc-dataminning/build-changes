import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dmo extends dem {
   public static final MapCodec<dmo> a = b(dmo::new);

   @Override
   public MapCodec<dmo> a() {
      return a;
   }

   protected dmo(dsc.d $$0) {
      super($$0);
   }

   @Override
   public dpi a(iz $$0, dsd $$1) {
      return new dqw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpi> dpj<T> a(dbz $$0, dsd $$1, dpk<T> $$2) {
      return a($$2, dpk.j, $$0.B ? dqw::a : dqw::b);
   }

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, cuq $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.z.a(15) + $$1.z.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   protected dlg a_(dsd $$0) {
      return dlg.c;
   }

   @Override
   public void a(cuq $$0, cul.b $$1, List<xp> $$2, cwj $$3) {
      super.a($$0, $$1, $$2, $$3);
      dcr.a($$0, $$2, "SpawnData");
   }
}
