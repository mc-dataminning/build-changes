import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dbm extends ctm {
   public static final MapCodec<dbm> a = b(dbm::new);

   @Override
   public MapCodec<dbm> a() {
      return a;
   }

   protected dbm(dga.d $$0) {
      super($$0);
   }

   @Override
   public ddx a(ht $$0, dgb $$1) {
      return new dfj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends ddx> ddy<T> a(cqz $$0, dgb $$1, ddz<T> $$2) {
      return a($$2, ddz.j, $$0.B ? dfj::a : dfj::b);
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ckj $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.z.a(15) + $$1.z.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dae b_(dgb $$0) {
      return dae.c;
   }

   @Override
   public void a(ckj $$0, @Nullable cqf $$1, List<ui> $$2, cma $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<ui> $$4 = this.a($$0);
      if ($$4.isPresent()) {
         $$2.add($$4.get());
      } else {
         $$2.add(uh.a);
         $$2.add(ui.c("block.minecraft.spawner.desc1").a(n.h));
         $$2.add(uh.a().b(ui.c("block.minecraft.spawner.desc2").a(n.j)));
      }
   }

   private Optional<ui> a(ckj $$0) {
      rt $$1 = cic.a($$0);
      if ($$1 != null && $$1.b("SpawnData", 10)) {
         String $$2 = $$1.p("SpawnData").p("entity").l("id");
         afw $$3 = afw.a($$2);
         if ($$3 != null) {
            return jy.h.b($$3).map($$0x -> ui.c($$0x.g()).a(n.h));
         }
      }

      return Optional.empty();
   }
}
