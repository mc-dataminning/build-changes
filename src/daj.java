import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class daj extends csi {
   protected daj(dfi.d $$0) {
      super($$0);
   }

   @Override
   public dcv a(gw $$0, dfj $$1) {
      return new deh($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcv> dcw<T> a(cpv $$0, dfj $$1, dcx<T> $$2) {
      return a($$2, dcx.j, $$0.B ? deh::a : deh::b);
   }

   @Override
   public void a(dfj $$0, akr $$1, gw $$2, cjf $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.z.a(15) + $$1.z.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public cza b_(dfj $$0) {
      return cza.c;
   }

   @Override
   public void a(cjf $$0, @Nullable cpb $$1, List<tm> $$2, ckw $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<tm> $$4 = this.a($$0);
      if ($$4.isPresent()) {
         $$2.add($$4.get());
      } else {
         $$2.add(tl.a);
         $$2.add(tm.c("block.minecraft.spawner.desc1").a(n.h));
         $$2.add(tl.a().b(tm.c("block.minecraft.spawner.desc2").a(n.j)));
      }
   }

   private Optional<tm> a(cjf $$0) {
      qy $$1 = cgy.a($$0);
      if ($$1 != null && $$1.b("SpawnData", 10)) {
         String $$2 = $$1.p("SpawnData").p("entity").l("id");
         aex $$3 = aex.a($$2);
         if ($$3 != null) {
            return jd.h.b($$3).map($$0x -> tm.c($$0x.g()).a(n.h));
         }
      }

      return Optional.empty();
   }
}
