import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class eaa extends doj {
   public static final MapCodec<eaa> b = b(eaa::new);
   public static final ebf<ebj> c = eax.bj;
   public static final eay d = eax.B;
   public static final int e = 4;
   private static final ffk f = dmf.c(16.0, 0.0, 4.0);
   private static final Map<ja, ffk> g = ffh.d(ffh.a(f, dmf.c(4.0, 4.0, 16.0)));
   private static final Map<ja, ffk> h = ffh.d(ffh.a(f, dmf.c(4.0, 4.0, 20.0)));

   @Override
   protected MapCodec<eaa> a() {
      return b;
   }

   public eaa(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(a, ja.c).b(c, ebj.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(eah $$0) {
      return true;
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return ($$0.c(d) ? g : h).get($$0.c(a));
   }

   private boolean a(eah $$0, eah $$1) {
      dmf $$2 = $$0.c(c) == ebj.a ? dmh.bI : dmh.by;
      return $$1.a($$2) && $$1.c(dzz.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public eah a(dja $$0, iu $$1, eah $$2, crc $$3) {
      if (!$$0.C && $$3.gl()) {
         iu $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, boolean $$3) {
      iu $$4 = $$2.a($$0.c(a).g());
      if (this.a($$0, $$1.a_($$4))) {
         $$1.b($$4, true);
      }
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      return $$4.g() == $$0.c(a) && !$$0.a($$1, $$3) ? dmh.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      eah $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dmh.ca) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, dmf $$3, @Nullable exw $$4, boolean $$5) {
      if ($$0.a((djd)$$1, $$2)) {
         $$1.b($$2.a($$0.c(a).g()), $$3, exs.a($$4, $$0.c(a).g()));
      }
   }

   @Override
   protected czd a(djd $$0, iu $$1, eah $$2, boolean $$3) {
      return new czd($$2.c(c) == ebj.b ? dmh.by : dmh.bI);
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected eah a(eah $$0, dri $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return false;
   }
}
