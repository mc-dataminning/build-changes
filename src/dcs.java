import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dcs extends cur {
   public static final MapCodec<dcs> a = b(dcs::new);

   @Override
   public MapCodec<dcs> a() {
      return a;
   }

   protected dcs(dhm.d $$0) {
      super($$0);
   }

   @Override
   public dfi a(hx $$0, dhn $$1) {
      return new dgv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfi> dfj<T> a(csf $$0, dhn $$1, dfk<T> $$2) {
      return a($$2, dfk.j, $$0.B ? dgv::a : dgv::b);
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, clo $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.z.a(15) + $$1.z.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dbk b_(dhn $$0) {
      return dbk.c;
   }

   @Override
   public void a(clo $$0, @Nullable crl $$1, List<uv> $$2, cnf $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<uv> $$4 = this.a($$0);
      if ($$4.isPresent()) {
         $$2.add($$4.get());
      } else {
         $$2.add(uu.a);
         $$2.add(uv.c("block.minecraft.spawner.desc1").a(n.h));
         $$2.add(uu.a().b(uv.c("block.minecraft.spawner.desc2").a(n.j)));
      }
   }

   private Optional<uv> a(clo $$0) {
      sd $$1 = cjh.a($$0);
      if ($$1 != null && $$1.b("SpawnData", 10)) {
         String $$2 = $$1.p("SpawnData").p("entity").l("id");
         agm $$3 = agm.a($$2);
         if ($$3 != null) {
            return kc.h.b($$3).map($$0x -> uv.c($$0x.g()).a(n.h));
         }
      }

      return Optional.empty();
   }
}
