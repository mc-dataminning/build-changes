import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dxc extends dmf {
   public static final MapCodec<dxc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(czi.q.fieldOf("color").forGetter(dmf::b), t()).apply($$0, dxc::new));
   public static final eco<jc> b = drp.e;
   private static final Map<jc, fgw> c = fgt.c(dno.a(16.0, 0.0, 12.5, 14.0, 16.0));

   @Override
   public MapCodec<dxc> a() {
      return a;
   }

   public dxc(czi $$0, ebp.d $$1) {
      super($$0, $$1);
      this.l(this.C.b().b(b, jc.c));
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      return $$4 == $$0.c(b).g() && !$$0.a($$1, $$3) ? dnq.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public ebq a(ded $$0) {
      ebq $$1 = this.m();
      dkm $$2 = $$0.q();
      iw $$3 = $$0.a();
      jc[] $$4 = $$0.f();

      for (jc $$5 : $$4) {
         if ($$5.o().d()) {
            jc $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
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
      $$0.a(b);
   }
}
