import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public record cwr(cvm<cws> c, boolean d) implements czp {
   public static final Codec<cwr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cvm.a(ma.L, cws.c).fieldOf("song").forGetter(cwr::a), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cwr::b))
            .apply($$0, cwr::new)
   );
   public static final zh<wu, cwr> b = zh.a(cvm.a(ma.L, cws.d), cwr::a, zf.b, cwr::b, cwr::new);

   @Override
   public void a(cwi.b $$0, Consumer<xj> $$1, cye $$2) {
      js.a $$3 = $$0.a();
      if (this.d && $$3 != null) {
         this.c.a($$3).ifPresent($$1x -> {
            xx $$2x = ((cws)$$1x.a()).c().f();
            xm.a($$2x, yg.a.a(n.h));
            $$1.accept($$2x);
         });
      }
   }

   public cwr a(boolean $$0) {
      return new cwr(this.c, $$0);
   }

   public static bsk a(dfm $$0, jh $$1, cwm $$2, cou $$3) {
      cwr $$4 = $$2.a(ku.ab);
      if ($$4 == null) {
         return bsk.f;
      } else {
         dvv $$5 = $$0.a_($$1);
         if ($$5.a(dis.dT) && !$$5.c(dms.b)) {
            if (!$$0.C) {
               cwm $$6 = $$2.b(1, $$3);
               if ($$0.c_($$1) instanceof dub $$7) {
                  $$7.b($$6);
                  $$0.a(ear.c, $$1, ear.a.a($$3, $$5));
               }

               $$3.a(awx.al);
            }

            return bsk.a;
         } else {
            return bsk.f;
         }
      }
   }

   public cvm<cws> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
