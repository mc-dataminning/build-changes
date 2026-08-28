import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class ejx extends ekk<emw> {
   public ejx(Codec<emw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ekm<emw> $$0) {
      azx $$1 = $$0.d();
      dkw $$2 = $$0.b();
      iv $$3 = $$0.e();
      Optional<dnc> $$4 = mg.e.a(axe.at, $$1).map(jf::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().m());
   }

   protected abstract boolean a(djy var1, azx var2, iv var3, ebe var4);

   protected boolean b(djy $$0, azx $$1, iv $$2, ebe $$3) {
      iv $$4 = $$2.d();
      ebe $$5 = $$0.a_($$2);
      if (($$5.a(dne.J) || $$5.a(axe.aw)) && $$0.a_($$4).a(dne.J)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            mg.e.a(axe.aw, $$1).map(jf::a).ifPresent($$2x -> $$0.a($$4, $$2x.m(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, dne.nB.m().b(duh.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (jb $$6 : jb.c.a) {
            if ($$1.i() < 0.2F) {
               iv $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(dne.J)) {
                  mg.e.a(axe.au, $$1).map(jf::a).ifPresent($$3x -> {
                     ebe $$4x = $$3x.m();
                     if ($$4x.b(dmn.d)) {
                        $$4x = $$4x.b(dmn.d, $$6);
                     }

                     $$0.a($$7, $$4x, 2);
                  });
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }
}
