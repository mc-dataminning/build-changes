import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cuy extends cul {
   private static final Logger a = LogUtils.getLogger();

   public cuy(cul.a $$0) {
      super($$0);
   }

   @Override
   public bqs<cuq> a(dcw $$0, cmx $$1, bqq $$2) {
      cuq $$3 = $$1.b($$2);
      List<akr> $$4 = $$3.a(kq.S, List.of());
      $$3.a(1, $$1);
      if ($$4.isEmpty()) {
         return bqs.d($$3);
      } else {
         if (!$$0.B) {
            czd $$5 = $$0.o().aJ();
            List<czb<?>> $$6 = new ArrayList<>($$4.size());

            for (akr $$7 : $$4) {
               Optional<czb<?>> $$8 = $$5.a($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return bqs.d($$3);
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(avz.c.b(this));
         }

         return bqs.a($$3, $$0.x_());
      }
   }
}
