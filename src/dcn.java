import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dcn extends cum {
   public static final MapCodec<dcn> a = b(dcn::new);

   @Override
   public MapCodec<dcn> a() {
      return a;
   }

   protected dcn(dhh.d $$0) {
      super($$0);
   }

   @Override
   public dfd a(ht $$0, dhi $$1) {
      return new dgq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfd> dfe<T> a(csa $$0, dhi $$1, dff<T> $$2) {
      return a($$2, dff.j, $$0.B ? dgq::a : dgq::b);
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, clj $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.z.a(15) + $$1.z.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dbf b_(dhi $$0) {
      return dbf.c;
   }

   @Override
   public void a(clj $$0, @Nullable crg $$1, List<ur> $$2, cna $$3) {
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

   private Optional<ur> a(clj $$0) {
      rz $$1 = cjc.a($$0);
      if ($$1 != null && $$1.b("SpawnData", 10)) {
         String $$2 = $$1.p("SpawnData").p("entity").l("id");
         agi $$3 = agi.a($$2);
         if ($$3 != null) {
            return jy.h.b($$3).map($$0x -> ur.c($$0x.g()).a(n.h));
         }
      }

      return Optional.empty();
   }
}
