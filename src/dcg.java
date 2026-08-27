import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dcg extends cuf {
   public static final MapCodec<dcg> a = b(dcg::new);

   @Override
   public MapCodec<dcg> a() {
      return a;
   }

   protected dcg(dgv.d $$0) {
      super($$0);
   }

   @Override
   public der a(ht $$0, dgw $$1) {
      return new dge($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends der> des<T> a(crs $$0, dgw $$1, det<T> $$2) {
      return a($$2, det.j, $$0.B ? dge::a : dge::b);
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, clb $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.z.a(15) + $$1.z.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public day b_(dgw $$0) {
      return day.c;
   }

   @Override
   public void a(clb $$0, @Nullable cqy $$1, List<ur> $$2, cms $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<ur> $$4 = this.a($$0);
      if ($$4.isPresent()) {
         $$2.add($$4.get());
      } else {
         $$2.add(uq.a);
         $$2.add(ur.c("block.minecraft.spawner.desc1").a(n.h));
         $$2.add(uq.a().b(ur.c("block.minecraft.spawner.desc2").a(n.j)));
      }
   }

   private Optional<ur> a(clb $$0) {
      rz $$1 = ciu.a($$0);
      if ($$1 != null && $$1.b("SpawnData", 10)) {
         String $$2 = $$1.p("SpawnData").p("entity").l("id");
         agg $$3 = agg.a($$2);
         if ($$3 != null) {
            return jy.h.b($$3).map($$0x -> ur.c($$0x.g()).a(n.h));
         }
      }

      return Optional.empty();
   }
}
