import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public record cxm(cwh<cxn> c, boolean d) implements dai {
   public static final Codec<cxm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cwh.a(mc.L, cxn.c).fieldOf("song").forGetter(cxm::a), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cxm::b))
            .apply($$0, cxm::new)
   );
   public static final yn<wa, cxm> b = yn.a(cwh.a(mc.L, cxn.d), cxm::a, yl.b, cxm::b, cxm::new);

   @Override
   public void a(cxd.b $$0, Consumer<wp> $$1, cyx $$2) {
      jt.a $$3 = $$0.a();
      if (this.d && $$3 != null) {
         this.c.a($$3).ifPresent($$1x -> {
            xd $$2x = ((cxn)$$1x.a()).c().f();
            ws.a($$2x, xm.a.a(n.h));
            $$1.accept($$2x);
         });
      }
   }

   public cxm a(boolean $$0) {
      return new cxm(this.c, $$0);
   }

   public static bsy a(dgz $$0, ji $$1, cxh $$2, cpr $$3) {
      cxm $$4 = $$2.a(kv.ad);
      if ($$4 == null) {
         return bsy.f;
      } else {
         dxq $$5 = $$0.a_($$1);
         if ($$5.a(dkg.eg) && !$$5.c(dok.b)) {
            if (!$$0.C) {
               cxh $$6 = $$2.b(1, $$3);
               if ($$0.c_($$1) instanceof dvw $$7) {
                  $$7.b($$6);
                  $$0.a(ecp.c, $$1, ecp.a.a($$3, $$5));
               }

               $$3.a(awk.al);
            }

            return bsy.a;
         } else {
            return bsy.f;
         }
      }
   }

   public cwh<cxn> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
