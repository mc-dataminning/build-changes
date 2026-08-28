import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public record cwv(cvq<cww> c, boolean d) implements czt {
   public static final Codec<cwv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cvq.a(mc.L, cww.c).fieldOf("song").forGetter(cwv::a), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cwv::b))
            .apply($$0, cwv::new)
   );
   public static final yn<wa, cwv> b = yn.a(cvq.a(mc.L, cww.d), cwv::a, yl.b, cwv::b, cwv::new);

   @Override
   public void a(cwm.b $$0, Consumer<wp> $$1, cyi $$2) {
      jt.a $$3 = $$0.a();
      if (this.d && $$3 != null) {
         this.c.a($$3).ifPresent($$1x -> {
            xd $$2x = ((cww)$$1x.a()).c().f();
            ws.a($$2x, xm.a.a(n.h));
            $$1.accept($$2x);
         });
      }
   }

   public cwv a(boolean $$0) {
      return new cwv(this.c, $$0);
   }

   public static bsl a(dgj $$0, ji $$1, cwq $$2, coy $$3) {
      cwv $$4 = $$2.a(kv.ab);
      if ($$4 == null) {
         return bsl.f;
      } else {
         dwy $$5 = $$0.a_($$1);
         if ($$5.a(djp.eg) && !$$5.c(dns.b)) {
            if (!$$0.C) {
               cwq $$6 = $$2.b(1, $$3);
               if ($$0.c_($$1) instanceof dve $$7) {
                  $$7.b($$6);
                  $$0.a(ebu.c, $$1, ebu.a.a($$3, $$5));
               }

               $$3.a(awk.al);
            }

            return bsl.a;
         } else {
            return bsl.f;
         }
      }
   }

   public cvq<cww> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
