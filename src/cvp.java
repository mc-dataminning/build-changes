import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public record cvp(cuh<cvq> c, boolean d) implements cyr {
   public static final Codec<cvp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cuh.a(lv.L, cvq.c).fieldOf("song").forGetter(cvp::a), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cvp::b))
            .apply($$0, cvp::new)
   );
   public static final zb<wo, cvp> b = zb.a(cuh.a(lv.L, cvq.d), cvp::a, yz.b, cvp::b, cvp::new);

   @Override
   public void a(cvg.b $$0, Consumer<xd> $$1, cxf $$2) {
      jp.a $$3 = $$0.a();
      if (this.d && $$3 != null) {
         this.c.a($$3).ifPresent($$1x -> {
            xr $$2x = ((cvq)$$1x.a()).c().f();
            xg.a($$2x, ya.a.a(n.h));
            $$1.accept($$2x);
         });
      }
   }

   public cvp a(boolean $$0) {
      return new cvp(this.c, $$0);
   }

   public static brk a(dds $$0, je $$1, cvl $$2, cnp $$3) {
      cvp $$4 = $$2.a(kr.T);
      if ($$4 == null) {
         return brk.f;
      } else {
         dua $$5 = $$0.a_($$1);
         if ($$5.a(dgx.dT) && !$$5.c(dky.b)) {
            if (!$$0.B) {
               cvl $$6 = $$2.b(1, $$3);
               if ($$0.c_($$1) instanceof dsh $$7) {
                  $$7.b($$6);
                  $$0.a(dyx.c, $$1, dyx.a.a($$3, $$5));
               }

               $$3.a(awn.al);
            }

            return brk.a;
         } else {
            return brk.f;
         }
      }
   }

   public cuh<cvq> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
