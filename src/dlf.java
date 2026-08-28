import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dlf extends dlc {
   public static final MapCodec<dlf> c = b(dlf::new);
   public static final eam<ja> d = dpt.e;
   private static final Map<ja, feq> e = fen.c(dlu.b(16.0, 8.0, 5.0, 16.0));

   @Override
   public MapCodec<? extends dlf> a() {
      return c;
   }

   protected dlf(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(d, ja.c).b(b, Boolean.valueOf(true)));
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return e.get($$0.c(d));
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(d, b);
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, evw.c, evw.c.a($$1));
      }

      return $$4.g() == $$0.c(d) && !$$0.a($$1, $$3) ? dlw.a.m() : $$0;
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      ja $$3 = $$0.c(d);
      iu $$4 = $$2.a($$3.g());
      dzo $$5 = $$1.a_($$4);
      return $$5.c($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      dzo $$1 = super.a($$0);
      dis $$2 = $$0.q();
      iu $$3 = $$0.a();
      ja[] $$4 = $$0.f();

      for (ja $$5 : $$4) {
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
