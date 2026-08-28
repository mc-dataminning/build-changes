import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public record cws(cvn<cwt> c, boolean d) implements czq {
   public static final Codec<cws> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cvn.a(mc.L, cwt.c).fieldOf("song").forGetter(cws::a), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cws::b))
            .apply($$0, cws::new)
   );
   public static final ym<vz, cws> b = ym.a(cvn.a(mc.L, cwt.d), cws::a, yk.b, cws::b, cws::new);

   @Override
   public void a(cwj.b $$0, Consumer<wo> $$1, cyf $$2) {
      jt.a $$3 = $$0.a();
      if (this.d && $$3 != null) {
         this.c.a($$3).ifPresent($$1x -> {
            xc $$2x = ((cwt)$$1x.a()).c().f();
            wr.a($$2x, xl.a.a(n.h));
            $$1.accept($$2x);
         });
      }
   }

   public cws a(boolean $$0) {
      return new cws(this.c, $$0);
   }

   public static bsi a(dgg $$0, ji $$1, cwn $$2, cov $$3) {
      cws $$4 = $$2.a(kv.ab);
      if ($$4 == null) {
         return bsi.f;
      } else {
         dwv $$5 = $$0.a_($$1);
         if ($$5.a(djm.eg) && !$$5.c(dnp.b)) {
            if (!$$0.C) {
               cwn $$6 = $$2.b(1, $$3);
               if ($$0.c_($$1) instanceof dvb $$7) {
                  $$7.b($$6);
                  $$0.a(ebr.c, $$1, ebr.a.a($$3, $$5));
               }

               $$3.a(awj.al);
            }

            return bsi.a;
         } else {
            return bsi.f;
         }
      }
   }

   public cvn<cwt> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
