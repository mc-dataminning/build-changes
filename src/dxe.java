import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dxe extends duy {
   public static final MapCodec<dxe> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ede.a.fieldOf("wood_type").forGetter(duy::d), t()).apply($$0, dxe::new));
   public static final eco<jc> b = drp.e;
   private static final Map<jc.a, fgw> c = fgt.a(dno.a(16.0, 4.0, 14.0, 16.0));
   private static final Map<jc.a, fgw> e = fgt.a(fgt.a(c.get(jc.a.c), dno.a(14.0, 2.0, 0.0, 10.0)));

   @Override
   public MapCodec<dxe> a() {
      return a;
   }

   public dxe(ede $$0, ebp.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.C.b().b(b, jc.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected bvc a(dak $$0, ebq $$1, dkj $$2, iw $$3, csi $$4, bvb $$5, ffy $$6) {
      if ($$2.c_($$3) instanceof eac $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return bvc.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(ebq $$0, csi $$1, ffy $$2, eac $$3, dak $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.h() instanceof czz && !this.a($$2, $$0);
   }

   private boolean a(ffy $$0, ebq $$1) {
      return $$0.c().o() == $$1.c(b).o();
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return e.get($$0.c(b).o());
   }

   @Override
   protected fgw b_(ebq $$0, djn $$1, iw $$2) {
      return this.a($$0, $$1, $$2, fgh.a());
   }

   @Override
   protected fgw b(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return c.get($$0.c(b).o());
   }

   public boolean b(ebq $$0, dkm $$1, iw $$2) {
      jc $$3 = $$0.c(b).h();
      jc $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(dkm $$0, ebq $$1, iw $$2, jc $$3) {
      ebq $$4 = $$0.a_($$2);
      return $$4.a(axn.aC) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dvz.a);
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      ebq $$1 = this.m();
      eya $$2 = $$0.q().b_($$0.a());
      dkm $$3 = $$0.q();
      iw $$4 = $$0.a();

      for (jc $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            jc $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.b(d, Boolean.valueOf($$2.a() == eyb.c));
            }
         }
      }

      return null;
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      return $$4.o() == $$0.c(b).h().o() && !$$0.a($$1, $$3) ? dnq.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(ebq $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b, d);
   }

   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new dzp($$0, $$1);
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dyo> dyp<T> a(dkj $$0, ebq $$1, dyq<T> $$2) {
      return a($$2, dyq.i, eac::a);
   }
}
