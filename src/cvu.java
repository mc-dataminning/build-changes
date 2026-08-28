import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public record cvu(cum<cvv> c, boolean d) implements cyw {
   public static final Codec<cvu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cum.a(lv.L, cvv.c).fieldOf("song").forGetter(cvu::a), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cvu::b))
            .apply($$0, cvu::new)
   );
   public static final zb<wo, cvu> b = zb.a(cum.a(lv.L, cvv.d), cvu::a, yz.b, cvu::b, cvu::new);

   @Override
   public void a(cvk.b $$0, Consumer<xd> $$1, cxh $$2) {
      jp.a $$3 = $$0.a();
      if (this.d && $$3 != null) {
         this.c.a($$3).ifPresent($$1x -> {
            xr $$2x = ((cvv)$$1x.a()).c().f();
            xg.a($$2x, ya.a.a(n.h));
            $$1.accept($$2x);
         });
      }
   }

   public cvu a(boolean $$0) {
      return new cvu(this.c, $$0);
   }

   public static brp a(deg $$0, je $$1, cvp $$2, cnu $$3) {
      cvu $$4 = $$2.a(kr.W);
      if ($$4 == null) {
         return brp.f;
      } else {
         duo $$5 = $$0.a_($$1);
         if ($$5.a(dhl.dT) && !$$5.c(dlm.b)) {
            if (!$$0.B) {
               cvp $$6 = $$2.b(1, $$3);
               if ($$0.c_($$1) instanceof dsv $$7) {
                  $$7.b($$6);
                  $$0.a(dzl.c, $$1, dzl.a.a($$3, $$5));
               }

               $$3.a(awo.al);
            }

            return brp.a;
         } else {
            return brp.f;
         }
      }
   }

   public cum<cvv> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
