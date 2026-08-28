import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class elg extends eln {
   public static final MapCodec<elg> a = eku.a.fieldOf("provider").xmap(elg::new, $$0 -> $$0.b);
   private final eku b;

   public elg(eku $$0) {
      this.b = $$0;
   }

   @Override
   protected elo<?> a() {
      return elo.g;
   }

   @Override
   public void a(eln.a $$0) {
      List<jh> $$1 = Lists.newArrayList();
      List<jh> $$2 = $$0.e();
      List<jh> $$3 = $$0.c();
      if ($$2.isEmpty()) {
         $$1.addAll($$3);
      } else if (!$$3.isEmpty() && $$2.get(0).v() == $$3.get(0).v()) {
         $$1.addAll($$3);
         $$1.addAll($$2);
      } else {
         $$1.addAll($$2);
      }

      if (!$$1.isEmpty()) {
         int $$4 = $$1.get(0).v();
         $$1.stream().filter($$1x -> $$1x.v() == $$4).forEach($$1x -> {
            this.a($$0, $$1x.h().f());
            this.a($$0, $$1x.g(2).f());
            this.a($$0, $$1x.h().e(2));
            this.a($$0, $$1x.g(2).e(2));

            for (int $$2x = 0; $$2x < 5; $$2x++) {
               int $$3x = $$0.b().a(64);
               int $$4x = $$3x % 8;
               int $$5 = $$3x / 8;
               if ($$4x == 0 || $$4x == 7 || $$5 == 0 || $$5 == 7) {
                  this.a($$0, $$1x.b(-3 + $$4x, 0, -3 + $$5));
               }
            }
         });
      }
   }

   private void a(eln.a $$0, jh $$1) {
      for (int $$2 = -2; $$2 <= 2; $$2++) {
         for (int $$3 = -2; $$3 <= 2; $$3++) {
            if (Math.abs($$2) != 2 || Math.abs($$3) != 2) {
               this.b($$0, $$1.b($$2, 0, $$3));
            }
         }
      }
   }

   private void b(eln.a $$0, jh $$1) {
      for (int $$2 = 2; $$2 >= -3; $$2--) {
         jh $$3 = $$1.b($$2);
         if (egp.a($$0.a(), $$3)) {
            $$0.a($$3, this.b.a($$0.b(), $$1));
            break;
         }

         if (!$$0.a($$3) && $$2 < 0) {
            break;
         }
      }
   }
}
