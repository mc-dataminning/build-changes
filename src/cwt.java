import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public record cwt(cvo<cwu> c, boolean d) implements czr {
   public static final Codec<cwt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cvo.a(mc.L, cwu.c).fieldOf("song").forGetter(cwt::a), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cwt::b))
            .apply($$0, cwt::new)
   );
   public static final yn<wa, cwt> b = yn.a(cvo.a(mc.L, cwu.d), cwt::a, yl.b, cwt::b, cwt::new);

   @Override
   public void a(cwk.b $$0, Consumer<wp> $$1, cyg $$2) {
      jt.a $$3 = $$0.a();
      if (this.d && $$3 != null) {
         this.c.a($$3).ifPresent($$1x -> {
            xd $$2x = ((cwu)$$1x.a()).c().f();
            ws.a($$2x, xm.a.a(n.h));
            $$1.accept($$2x);
         });
      }
   }

   public cwt a(boolean $$0) {
      return new cwt(this.c, $$0);
   }

   public static bsj a(dgh $$0, ji $$1, cwo $$2, cow $$3) {
      cwt $$4 = $$2.a(kv.ab);
      if ($$4 == null) {
         return bsj.f;
      } else {
         dww $$5 = $$0.a_($$1);
         if ($$5.a(djn.eg) && !$$5.c(dnq.b)) {
            if (!$$0.C) {
               cwo $$6 = $$2.b(1, $$3);
               if ($$0.c_($$1) instanceof dvc $$7) {
                  $$7.b($$6);
                  $$0.a(ebs.c, $$1, ebs.a.a($$3, $$5));
               }

               $$3.a(awk.al);
            }

            return bsj.a;
         } else {
            return bsj.f;
         }
      }
   }

   public cvo<cwu> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
