import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ctk extends crf {
   private static final MapCodec<cep.d> a = cep.d.a.fieldOf("BucketVariantTag");
   private final brn<?> b;
   private final avb c;

   public ctk(brn<?> $$0, elz $$1, avb $$2, csu.a $$3) {
      super($$1, $$3);
      this.b = $$0;
      this.c = $$2;
   }

   @Override
   public void a(@Nullable clh $$0, dad $$1, csz $$2, in $$3) {
      if ($$1 instanceof aqh) {
         this.a((aqh)$$1, $$2, $$3);
         $$1.a($$0, dva.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable clh $$0, dae $$1, in $$2) {
      $$1.a($$0, $$2, this.c, avd.g, 1.0F, 1.0F);
   }

   private void a(aqh $$0, csz $$1, in $$2) {
      if (this.b.a($$0, $$1, null, $$2, bse.l, true, false) instanceof cdr $$4) {
         cvm $$5 = $$1.a(ka.L, cvm.a);
         $$4.c($$5.c());
         $$4.w(true);
      }
   }

   @Override
   public void a(csz $$0, @Nullable dad $$1, List<wu> $$2, cuq $$3) {
      if (this.b == brn.bf) {
         cvm $$4 = $$0.a(ka.L, cvm.a);
         if ($$4.b()) {
            return;
         }

         Optional<cep.d> $$5 = $$4.a(a).result();
         if ($$5.isPresent()) {
            cep.d $$6 = $$5.get();
            n[] $$7 = new n[]{n.u, n.h};
            String $$8 = "color.minecraft." + $$6.c();
            String $$9 = "color.minecraft." + $$6.d();
            int $$10 = cep.c.indexOf($$6);
            if ($$10 != -1) {
               $$2.add(wu.c(cep.c($$10)).a($$7));
               return;
            }

            $$2.add($$6.b().d().e().a($$7));
            xi $$11 = wu.c($$8);
            if (!$$8.equals($$9)) {
               $$11.f(", ").b(wu.c($$9));
            }

            $$11.a($$7);
            $$2.add($$11);
         }
      }
   }
}
