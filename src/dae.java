import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dae extends csd {
   protected dae(dfd.d $$0) {
      super($$0);
   }

   @Override
   public dcq a(gw $$0, dfe $$1) {
      return new dec($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcq> dcr<T> a(cpq $$0, dfe $$1, dcs<T> $$2) {
      return a($$2, dcs.j, $$0.B ? dec::a : dec::b);
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, cja $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.z.a(15) + $$1.z.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public cyv b_(dfe $$0) {
      return cyv.c;
   }

   @Override
   public void a(cja $$0, @Nullable cow $$1, List<ti> $$2, ckr $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<ti> $$4 = this.a($$0);
      if ($$4.isPresent()) {
         $$2.add($$4.get());
      } else {
         $$2.add(th.a);
         $$2.add(ti.c("block.minecraft.spawner.desc1").a(n.h));
         $$2.add(th.a().b(ti.c("block.minecraft.spawner.desc2").a(n.j)));
      }
   }

   private Optional<ti> a(cja $$0) {
      qu $$1 = cgt.a($$0);
      if ($$1 != null && $$1.b("SpawnData", 10)) {
         String $$2 = $$1.p("SpawnData").p("entity").l("id");
         aeu $$3 = aeu.a($$2);
         if ($$3 != null) {
            return jd.h.b($$3).map($$0x -> ti.c($$0x.g()).a(n.h));
         }
      }

      return Optional.empty();
   }
}
