import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;

public class dpi extends dop {
   public static final MapCodec<dpi> a = b(dpi::new);
   private static final ww b = ww.c("container.grindstone_title");
   private final Function<dzo, feq> d;

   @Override
   public MapCodec<dpi> a() {
      return a;
   }

   protected dpi(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(e, ja.c).b(c, dzz.b));
      this.d = this.b();
   }

   private Function<dzo, feq> b() {
      feq $$0 = fen.a(dlu.a(2.0, 6.0, 7.0, 4.0, 10.0, 16.0), dlu.a(2.0, 5.0, 3.0, 4.0, 11.0, 9.0));
      feq $$1 = fen.a($$0, h.z);
      feq $$2 = fen.a(dlu.a(8.0, 2.0, 14.0, 0.0, 12.0), $$0, $$1);
      Map<dzz, Map<ja, feq>> $$3 = fen.e($$2);
      return this.a($$1x -> $$3.get($$1x.c(c)).get($$1x.c(e)));
   }

   private feq o(dzo $$0) {
      return this.d.apply($$0);
   }

   @Override
   protected feq b(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return this.o($$0);
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return this.o($$0);
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      return true;
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awv.aD);
      }

      return bty.a;
   }

   @Override
   protected bua b(dzo $$0, dip $$1, iu $$2) {
      return new bug(($$2x, $$3, $$4) -> new cvk($$2x, $$3, cux.a($$1, $$2)), b);
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(e, c);
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }
}
