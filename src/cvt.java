import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cvt extends cvg {
   private static final Logger a = LogUtils.getLogger();

   public cvt(cvg.a $$0) {
      super($$0);
   }

   @Override
   public brk a(dds $$0, cnp $$1, brj $$2) {
      cvl $$3 = $$1.b($$2);
      List<alb> $$4 = $$3.a(kr.U, List.of());
      $$3.a(1, $$1);
      if ($$4.isEmpty()) {
         return brk.d;
      } else {
         if (!$$0.B) {
            czx $$5 = $$0.o().aI();
            List<czv<?>> $$6 = new ArrayList<>($$4.size());

            for (alb $$7 : $$4) {
               Optional<czv<?>> $$8 = $$5.a($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return brk.d;
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(awn.c.b(this));
         }

         return brk.a;
      }
   }
}
