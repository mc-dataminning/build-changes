import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dkf extends dkc {
   public static final MapCodec<dkf> c = b(dkf::new);
   public static final dzk<jo> d = dot.e;
   private static final Map<jo, fdo> e = fdl.c(dku.b(16.0, 8.0, 5.0, 16.0));

   @Override
   public MapCodec<? extends dkf> a() {
      return c;
   }

   protected dkf(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(d, jo.c).b(b, Boolean.valueOf(true)));
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return e.get($$0.c(d));
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(d, b);
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, euu.c, euu.c.a($$1));
      }

      return $$4.g() == $$0.c(d) && !$$0.a($$1, $$3) ? dkw.a.m() : $$0;
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      jo $$3 = $$0.c(d);
      jj $$4 = $$2.a($$3.g());
      dym $$5 = $$1.a_($$4);
      return $$5.c($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      dym $$1 = super.a($$0);
      dhs $$2 = $$0.q();
      jj $$3 = $$0.a();
      jo[] $$4 = $$0.f();

      for (jo $$5 : $$4) {
         if ($$5.o().d()) {
            $$1 = $$1.b(d, $$5.g());
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }
}
