import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dng extends dtp {
   public static final MapCodec<dng> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ebv.a.fieldOf("wood_type").forGetter(dtp::d), t()).apply($$0, dng::new));
   public static final ebh b = eax.bd;
   public static final eay c = eax.a;
   private static final ffk e = dmf.b(10.0, 0.0, 16.0);
   private static final Map<Integer, ffk> f = ffh.c(dmf.a(14.0, 2.0, 0.0, 10.0))
      .entrySet()
      .stream()
      .collect(Collectors.toMap($$0 -> ebn.a($$0.getKey()), Entry::getValue));

   @Override
   public MapCodec<dng> a() {
      return a;
   }

   public dng(ebv $$0, eag.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.C.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected bud a(czd $$0, eah $$1, dja $$2, iu $$3, crc $$4, buc $$5, fem $$6) {
      if ($$2.c_($$3) instanceof dyt $$7 && this.a($$4, $$6, $$7, $$0)) {
         return bud.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(crc $$0, fem $$1, dyt $$2, czd $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.h() instanceof cys && $$1.c().equals(ja.a);
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      return $$1.a_($$2.d()).a($$1, $$2.d(), ja.a, duq.b);
   }

   @Override
   public eah a(dcw $$0) {
      dja $$1 = $$0.q();
      ewo $$2 = $$1.b_($$0.a());
      iu $$3 = $$0.a().d();
      eah $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(axc.aD);
      ja $$6 = ja.a((double)$$0.i());
      boolean $$7 = !dmf.a($$4.g($$1, $$3), ja.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dvv.b)) {
            ja $$8 = $$4.c(dvv.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<ja> $$9 = ebn.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? ebn.a($$6.g()) : ebn.a($$0.i() + 180.0F);
      return this.m().b(c, Boolean.valueOf($$7)).b(b, Integer.valueOf($$10)).b(d, Boolean.valueOf($$2.a() == ewp.c));
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return f.getOrDefault($$0.c(b), e);
   }

   @Override
   protected ffk b_(eah $$0, dig $$1, iu $$2) {
      return this.a($$0, $$1, $$2, fev.a());
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      return $$4 == ja.b && !this.a($$0, $$1, $$3) ? dmh.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(eah $$0) {
      return ebn.b($$0.c(b));
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected eah a(eah $$0, dri $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dxf a(iu $$0, eah $$1) {
      return new dyg($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxf> dxg<T> a(dja $$0, eah $$1, dxh<T> $$2) {
      return a($$2, dxh.i, dyt::a);
   }
}
