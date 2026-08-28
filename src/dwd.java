import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dwd extends dtw {
   public static final MapCodec<dwd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ecc.a.fieldOf("wood_type").forGetter(dtw::d), t()).apply($$0, dwd::new));
   public static final ebm<jb> b = dqn.e;
   private static final Map<jb, ffr> c = ffo.c(dmm.a(16.0, 4.5, 12.5, 14.0, 16.0));

   @Override
   public MapCodec<dwd> a() {
      return a;
   }

   public dwd(ecc $$0, ean.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.C.b().b(b, jb.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return c.get($$0.c(b));
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public eao a(ddd $$0) {
      eao $$1 = this.m();
      ewv $$2 = $$0.q().b_($$0.a());
      djk $$3 = $$0.q();
      iv $$4 = $$0.a();
      jb[] $$5 = $$0.f();

      for (jb $$6 : $$5) {
         if ($$6.o().d()) {
            jb $$7 = $$6.g();
            $$1 = $$1.b(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.b(d, Boolean.valueOf($$2.a() == eww.c));
            }
         }
      }

      return null;
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      return $$4.g() == $$0.c(b) && !$$0.a($$1, $$3) ? dmo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(eao $$0) {
      return $$0.c(b).p();
   }

   @Override
   public fex o(eao $$0) {
      return c.get($$0.c(b)).a().f();
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b, d);
   }
}
