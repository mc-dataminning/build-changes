import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class czy extends crx {
   protected czy(dex.d $$0) {
      super($$0);
   }

   @Override
   public dck a(gv $$0, dey $$1) {
      return new ddw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dck> dcl<T> a(cpk $$0, dey $$1, dcm<T> $$2) {
      return a($$2, dcm.j, $$0.B ? ddw::a : ddw::b);
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, ciw $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.z.a(15) + $$1.z.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public cyp b_(dey $$0) {
      return cyp.c;
   }

   @Override
   public void a(ciw $$0, @Nullable coq $$1, List<te> $$2, ckn $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<te> $$4 = this.a($$0);
      if ($$4.isPresent()) {
         $$2.add($$4.get());
      } else {
         $$2.add(td.a);
         $$2.add(te.c("block.minecraft.spawner.desc1").a(n.h));
         $$2.add(td.a().b(te.c("block.minecraft.spawner.desc2").a(n.j)));
      }
   }

   private Optional<te> a(ciw $$0) {
      qs $$1 = cgp.a($$0);
      if ($$1 != null && $$1.b("SpawnData", 10)) {
         String $$2 = $$1.p("SpawnData").p("entity").l("id");
         aep $$3 = aep.a($$2);
         if ($$3 != null) {
            return jc.h.b($$3).map($$0x -> te.c($$0x.g()).a(n.h));
         }
      }

      return Optional.empty();
   }
}
