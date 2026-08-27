import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dao extends cso {
   public static final MapCodec<dao> a = b(dao::new);

   @Override
   public MapCodec<dao> a() {
      return a;
   }

   protected dao(dfc.d $$0) {
      super($$0);
   }

   @Override
   public dcz a(gw $$0, dfd $$1) {
      return new del($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcz> dda<T> a(cqb $$0, dfd $$1, ddb<T> $$2) {
      return a($$2, ddb.j, $$0.B ? del::a : del::b);
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, cjl $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.z.a(15) + $$1.z.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public czg b_(dfd $$0) {
      return czg.c;
   }

   @Override
   public void a(cjl $$0, @Nullable cph $$1, List<tl> $$2, clc $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<tl> $$4 = this.a($$0);
      if ($$4.isPresent()) {
         $$2.add($$4.get());
      } else {
         $$2.add(tk.a);
         $$2.add(tl.c("block.minecraft.spawner.desc1").a(n.h));
         $$2.add(tk.a().b(tl.c("block.minecraft.spawner.desc2").a(n.j)));
      }
   }

   private Optional<tl> a(cjl $$0) {
      qw $$1 = che.a($$0);
      if ($$1 != null && $$1.b("SpawnData", 10)) {
         String $$2 = $$1.p("SpawnData").p("entity").l("id");
         aez $$3 = aez.a($$2);
         if ($$3 != null) {
            return jb.h.b($$3).map($$0x -> tl.c($$0x.g()).a(n.h));
         }
      }

      return Optional.empty();
   }
}
