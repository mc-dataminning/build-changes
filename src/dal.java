import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dal extends csk {
   protected dal(dfk.d $$0) {
      super($$0);
   }

   @Override
   public dcx a(gw $$0, dfl $$1) {
      return new dej($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcx> dcy<T> a(cpx $$0, dfl $$1, dcz<T> $$2) {
      return a($$2, dcz.j, $$0.B ? dej::a : dej::b);
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, cjh $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.z.a(15) + $$1.z.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public czc b_(dfl $$0) {
      return czc.c;
   }

   @Override
   public void a(cjh $$0, @Nullable cpd $$1, List<tn> $$2, cky $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<tn> $$4 = this.a($$0);
      if ($$4.isPresent()) {
         $$2.add($$4.get());
      } else {
         $$2.add(tm.a);
         $$2.add(tn.c("block.minecraft.spawner.desc1").a(n.h));
         $$2.add(tm.a().b(tn.c("block.minecraft.spawner.desc2").a(n.j)));
      }
   }

   private Optional<tn> a(cjh $$0) {
      qy $$1 = cha.a($$0);
      if ($$1 != null && $$1.b("SpawnData", 10)) {
         String $$2 = $$1.p("SpawnData").p("entity").l("id");
         aey $$3 = aey.a($$2);
         if ($$3 != null) {
            return jd.h.b($$3).map($$0x -> tn.c($$0x.g()).a(n.h));
         }
      }

      return Optional.empty();
   }
}
