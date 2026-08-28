import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dop extends duy {
   public static final MapCodec<dop> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ede.a.fieldOf("wood_type").forGetter(duy::d), t()).apply($$0, dop::new));
   public static final ecq b = ecg.bd;
   public static final ech c = ecg.a;
   private static final fgw e = dno.b(10.0, 0.0, 16.0);
   private static final Map<Integer, fgw> f = fgt.c(dno.a(14.0, 2.0, 0.0, 10.0))
      .entrySet()
      .stream()
      .collect(Collectors.toMap($$0 -> ecw.a($$0.getKey()), Entry::getValue));

   @Override
   public MapCodec<dop> a() {
      return a;
   }

   public dop(ede $$0, ebp.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.C.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected bvc a(dak $$0, ebq $$1, dkj $$2, iw $$3, csi $$4, bvb $$5, ffy $$6) {
      if ($$2.c_($$3) instanceof eac $$7 && this.a($$4, $$6, $$7, $$0)) {
         return bvc.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(csi $$0, ffy $$1, eac $$2, dak $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.h() instanceof czz && $$1.c().equals(jc.a);
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      return $$1.a_($$2.d()).a($$1, $$2.d(), jc.a, dvz.b);
   }

   @Override
   public ebq a(ded $$0) {
      dkj $$1 = $$0.q();
      eya $$2 = $$1.b_($$0.a());
      iw $$3 = $$0.a().d();
      ebq $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(axn.aD);
      jc $$6 = jc.a((double)$$0.i());
      boolean $$7 = !dno.a($$4.g($$1, $$3), jc.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dxe.b)) {
            jc $$8 = $$4.c(dxe.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<jc> $$9 = ecw.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? ecw.a($$6.g()) : ecw.a($$0.i() + 180.0F);
      return this.m().b(c, Boolean.valueOf($$7)).b(b, Integer.valueOf($$10)).b(d, Boolean.valueOf($$2.a() == eyb.c));
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return f.getOrDefault($$0.c(b), e);
   }

   @Override
   protected fgw b_(ebq $$0, djn $$1, iw $$2) {
      return this.a($$0, $$1, $$2, fgh.a());
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      return $$4 == jc.b && !this.a($$0, $$1, $$3) ? dnq.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(ebq $$0) {
      return ecw.b($$0.c(b));
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new dzp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyo> dyp<T> a(dkj $$0, ebq $$1, dyq<T> $$2) {
      return a($$2, dyq.i, eac::a);
   }
}
