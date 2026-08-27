import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class czz extends cry {
   protected czz(dey.d $$0) {
      super($$0);
   }

   @Override
   public dcl a(gu $$0, dez $$1) {
      return new ddx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcl> dcm<T> a(cpl $$0, dez $$1, dcn<T> $$2) {
      return a($$2, dcn.j, $$0.B ? ddx::a : ddx::b);
   }

   @Override
   public void a(dez $$0, akk $$1, gu $$2, cix $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.z.a(15) + $$1.z.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public cyq b_(dez $$0) {
      return cyq.c;
   }

   @Override
   public void a(cix $$0, @Nullable cor $$1, List<tf> $$2, cko $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<tf> $$4 = this.a($$0);
      if ($$4.isPresent()) {
         $$2.add($$4.get());
      } else {
         $$2.add(te.a);
         $$2.add(tf.c("block.minecraft.spawner.desc1").a(n.h));
         $$2.add(te.a().b(tf.c("block.minecraft.spawner.desc2").a(n.j)));
      }
   }

   private Optional<tf> a(cix $$0) {
      qr $$1 = cgq.a($$0);
      if ($$1 != null && $$1.b("SpawnData", 10)) {
         String $$2 = $$1.p("SpawnData").p("entity").l("id");
         aer $$3 = aer.a($$2);
         if ($$3 != null) {
            return jb.h.b($$3).map($$0x -> tf.c($$0x.g()).a(n.h));
         }
      }

      return Optional.empty();
   }
}
