import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public record cvx(cup<cvy> c, boolean d) implements cyz {
   public static final Codec<cvx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cup.a(lw.L, cvy.c).fieldOf("song").forGetter(cvx::a), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cvx::b))
            .apply($$0, cvx::new)
   );
   public static final zc<wp, cvx> b = zc.a(cup.a(lw.L, cvy.d), cvx::a, za.b, cvx::b, cvx::new);

   @Override
   public void a(cvn.b $$0, Consumer<xe> $$1, cxk $$2) {
      jq.a $$3 = $$0.a();
      if (this.d && $$3 != null) {
         this.c.a($$3).ifPresent($$1x -> {
            xs $$2x = ((cvy)$$1x.a()).c().f();
            xh.a($$2x, yb.a.a(n.h));
            $$1.accept($$2x);
         });
      }
   }

   public cvx a(boolean $$0) {
      return new cvx(this.c, $$0);
   }

   public static brs a(dej $$0, jf $$1, cvs $$2, cnx $$3) {
      cvx $$4 = $$2.a(ks.W);
      if ($$4 == null) {
         return brs.f;
      } else {
         dus $$5 = $$0.a_($$1);
         if ($$5.a(dho.dT) && !$$5.c(dlp.b)) {
            if (!$$0.B) {
               cvs $$6 = $$2.b(1, $$3);
               if ($$0.c_($$1) instanceof dsy $$7) {
                  $$7.b($$6);
                  $$0.a(dzp.c, $$1, dzp.a.a($$3, $$5));
               }

               $$3.a(awq.al);
            }

            return brs.a;
         } else {
            return brs.f;
         }
      }
   }

   public cup<cvy> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
