import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dnn extends dtw {
   public static final MapCodec<dnn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ecc.a.fieldOf("wood_type").forGetter(dtw::d), t()).apply($$0, dnn::new));
   public static final ebo b = ebe.bd;
   public static final ebf c = ebe.a;
   private static final ffr e = dmm.b(10.0, 0.0, 16.0);
   private static final Map<Integer, ffr> f = ffo.c(dmm.a(14.0, 2.0, 0.0, 10.0))
      .entrySet()
      .stream()
      .collect(Collectors.toMap($$0 -> ebu.a($$0.getKey()), Entry::getValue));

   @Override
   public MapCodec<dnn> a() {
      return a;
   }

   public dnn(ecc $$0, ean.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.C.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected bug a(czk $$0, eao $$1, djh $$2, iv $$3, crj $$4, buf $$5, fet $$6) {
      if ($$2.c_($$3) instanceof dza $$7 && this.a($$4, $$6, $$7, $$0)) {
         return bug.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(crj $$0, fet $$1, dza $$2, czk $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.h() instanceof cyz && $$1.c().equals(jb.a);
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      return $$1.a_($$2.d()).a($$1, $$2.d(), jb.a, dux.b);
   }

   @Override
   public eao a(ddd $$0) {
      djh $$1 = $$0.q();
      ewv $$2 = $$1.b_($$0.a());
      iv $$3 = $$0.a().d();
      eao $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(axc.aD);
      jb $$6 = jb.a((double)$$0.i());
      boolean $$7 = !dmm.a($$4.g($$1, $$3), jb.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dwc.b)) {
            jb $$8 = $$4.c(dwc.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<jb> $$9 = ebu.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? ebu.a($$6.g()) : ebu.a($$0.i() + 180.0F);
      return this.m().b(c, Boolean.valueOf($$7)).b(b, Integer.valueOf($$10)).b(d, Boolean.valueOf($$2.a() == eww.c));
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return f.getOrDefault($$0.c(b), e);
   }

   @Override
   protected ffr b_(eao $$0, din $$1, iv $$2) {
      return this.a($$0, $$1, $$2, ffc.a());
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      return $$4 == jb.b && !this.a($$0, $$1, $$3) ? dmo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(eao $$0) {
      return ebu.b($$0.c(b));
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dxm a(iv $$0, eao $$1) {
      return new dyn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxm> dxn<T> a(djh $$0, eao $$1, dxo<T> $$2) {
      return a($$2, dxo.i, dza::a);
   }
}
