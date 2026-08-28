import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dxf extends duy {
   public static final MapCodec<dxf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ede.a.fieldOf("wood_type").forGetter(duy::d), t()).apply($$0, dxf::new));
   public static final eco<jc> b = drp.e;
   private static final Map<jc, fgw> c = fgt.c(dno.a(16.0, 4.5, 12.5, 14.0, 16.0));

   @Override
   public MapCodec<dxf> a() {
      return a;
   }

   public dxf(ede $$0, ebp.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.C.b().b(b, jc.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return c.get($$0.c(b));
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      ebq $$1 = this.m();
      eya $$2 = $$0.q().b_($$0.a());
      dkm $$3 = $$0.q();
      iw $$4 = $$0.a();
      jc[] $$5 = $$0.f();

      for (jc $$6 : $$5) {
         if ($$6.o().d()) {
            jc $$7 = $$6.g();
            $$1 = $$1.b(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.b(d, Boolean.valueOf($$2.a() == eyb.c));
            }
         }
      }

      return null;
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      return $$4.g() == $$0.c(b) && !$$0.a($$1, $$3) ? dnq.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(ebq $$0) {
      return $$0.c(b).p();
   }

   @Override
   public fgc o(ebq $$0) {
      return c.get($$0.c(b)).a().f();
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
}
