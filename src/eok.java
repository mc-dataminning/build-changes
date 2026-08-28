import com.mojang.serialization.MapCodec;
import java.util.List;

public class eok extends eos {
   public static final MapCodec<eok> a = eny.a.fieldOf("provider").xmap(eok::new, $$0 -> $$0.b);
   private final eny b;

   public eok(eny $$0) {
      this.b = $$0;
   }

   @Override
   protected eot<?> a() {
      return eot.g;
   }

   @Override
   public void a(eos.a $$0) {
      List<iv> $$1 = elf.a($$0);
      if (!$$1.isEmpty()) {
         int $$2 = $$1.get(0).v();
         $$1.stream().filter($$1x -> $$1x.v() == $$2).forEach($$1x -> {
            this.a($$0, $$1x.h().f());
            this.a($$0, $$1x.g(2).f());
            this.a($$0, $$1x.h().e(2));
            this.a($$0, $$1x.g(2).e(2));

            for (int $$2x = 0; $$2x < 5; $$2x++) {
               int $$3 = $$0.b().a(64);
               int $$4 = $$3 % 8;
               int $$5 = $$3 / 8;
               if ($$4 == 0 || $$4 == 7 || $$5 == 0 || $$5 == 7) {
                  this.a($$0, $$1x.b(-3 + $$4, 0, -3 + $$5));
               }
            }
         });
      }
   }

   private void a(eos.a $$0, iv $$1) {
      for (int $$2 = -2; $$2 <= 2; $$2++) {
         for (int $$3 = -2; $$3 <= 2; $$3++) {
            if (Math.abs($$2) != 2 || Math.abs($$3) != 2) {
               this.b($$0, $$1.b($$2, 0, $$3));
            }
         }
      }
   }

   private void b(eos.a $$0, iv $$1) {
      for (int $$2 = 2; $$2 >= -3; $$2--) {
         iv $$3 = $$1.b($$2);
         if (ejt.a($$0.a(), $$3)) {
            $$0.a($$3, this.b.a($$0.b(), $$1));
            break;
         }

         if (!$$0.a($$3) && $$2 < 0) {
            break;
         }
      }
   }
}
