import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dud extends djq {
   public static final MapCodec<dud> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dsc.a.b.fieldOf("kind").forGetter(djq::b), t()).apply($$0, dud::new));
   public static final dzk<jo> d = dot.e;
   private static final Map<jo, fdo> b = fdl.c(dku.c(8.0, 8.0, 16.0));

   @Override
   public MapCodec<? extends dud> a() {
      return c;
   }

   protected dud(dsc.a $$0, dyl.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(d, jo.c));
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dym a(dbn $$0) {
      dym $$1 = super.a($$0);
      dgv $$2 = $$0.q();
      jj $$3 = $$0.a();
      jo[] $$4 = $$0.f();

      for (jo $$5 : $$4) {
         if ($$5.o().d()) {
            jo $$6 = $$5.g();
            $$1 = $$1.b(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
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
      super.a($$0);
      $$0.a(d);
   }
}
