import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxb extends cpa {
   protected cxb(dca.d $$0) {
      super($$0);
   }

   @Override
   public czn a(gu $$0, dcb $$1) {
      return new daz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends czn> czo<T> a(cmm $$0, dcb $$1, czp<T> $$2) {
      return a($$2, czp.j, $$0.B ? daz::a : daz::b);
   }

   @Override
   public void a(dcb $$0, aif $$1, gu $$2, cfz $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.z.a(15) + $$1.z.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public cvs b_(dcb $$0) {
      return cvs.c;
   }

   @Override
   public void a(cfz $$0, @Nullable cls $$1, List<sw> $$2, chq $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<sw> $$4 = this.a($$0);
      if ($$4.isPresent()) {
         $$2.add($$4.get());
      } else {
         $$2.add(sv.a);
         $$2.add(sw.c("block.minecraft.spawner.desc1").a(n.h));
         $$2.add(sv.a().b(sw.c("block.minecraft.spawner.desc2").a(n.j)));
      }
   }

   private Optional<sw> a(cfz $$0) {
      qr $$1 = cds.a($$0);
      if ($$1 != null && $$1.b("SpawnData", 10)) {
         String $$2 = $$1.p("SpawnData").p("entity").l("id");
         acq $$3 = acq.a($$2);
         if ($$3 != null) {
            return jb.h.b($$3).map($$0x -> sw.c($$0x.g()).a(n.h));
         }
      }

      return Optional.empty();
   }
}
