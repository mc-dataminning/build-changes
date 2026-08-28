import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dtz extends djl {
   public static final MapCodec<dtz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwv.q.fieldOf("color").forGetter(djl::b), t()).apply($$0, dtz::new));
   public static final dzk<jo> b = dot.e;
   private static final Map<jo, fdo> c = fdl.c(dku.a(16.0, 0.0, 12.5, 14.0, 16.0));

   @Override
   public MapCodec<dtz> a() {
      return a;
   }

   public dtz(cwv $$0, dyl.d $$1) {
      super($$0, $$1);
      this.l(this.B.b().b(b, jo.c));
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      return $$4 == $$0.c(b).g() && !$$0.a($$1, $$3) ? dkw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dym a(dbn $$0) {
      dym $$1 = this.m();
      dhs $$2 = $$0.q();
      jj $$3 = $$0.a();
      jo[] $$4 = $$0.f();

      for (jo $$5 : $$4) {
         if ($$5.o().d()) {
            jo $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b);
   }
}
