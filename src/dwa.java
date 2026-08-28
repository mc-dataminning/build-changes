import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dwa extends dld {
   public static final MapCodec<dwa> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyi.q.fieldOf("color").forGetter(dld::b), t()).apply($$0, dwa::new));
   public static final ebm<jb> b = dqn.e;
   private static final Map<jb, ffr> c = ffo.c(dmm.a(16.0, 0.0, 12.5, 14.0, 16.0));

   @Override
   public MapCodec<dwa> a() {
      return a;
   }

   public dwa(cyi $$0, ean.d $$1) {
      super($$0, $$1);
      this.l(this.C.b().b(b, jb.c));
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      return $$4 == $$0.c(b).g() && !$$0.a($$1, $$3) ? dmo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public eao a(ddd $$0) {
      eao $$1 = this.m();
      djk $$2 = $$0.q();
      iv $$3 = $$0.a();
      jb[] $$4 = $$0.f();

      for (jb $$5 : $$4) {
         if ($$5.o().d()) {
            jb $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
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
      $$0.a(b);
   }
}
