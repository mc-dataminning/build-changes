import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class duc extends dsa {
   public static final MapCodec<duc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(eaa.a.fieldOf("wood_type").forGetter(dsa::d), t()).apply($$0, duc::new));
   public static final dzk<jo> b = dot.e;
   private static final Map<jo, fdo> c = fdl.c(dku.a(16.0, 4.5, 12.5, 14.0, 16.0));

   @Override
   public MapCodec<duc> a() {
      return a;
   }

   public duc(eaa $$0, dyl.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.B.b().b(b, jo.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return c.get($$0.c(b));
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      dym $$1 = this.m();
      eut $$2 = $$0.q().b_($$0.a());
      dhs $$3 = $$0.q();
      jj $$4 = $$0.a();
      jo[] $$5 = $$0.f();

      for (jo $$6 : $$5) {
         if ($$6.o().d()) {
            jo $$7 = $$6.g();
            $$1 = $$1.b(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.b(d, Boolean.valueOf($$2.a() == euu.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      return $$4.g() == $$0.c(b) && !$$0.a($$1, $$3) ? dkw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dym $$0) {
      return $$0.c(b).p();
   }

   @Override
   public fcu o(dym $$0) {
      return c.get($$0.c(b)).a().f();
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
      $$0.a(b, d);
   }
}
