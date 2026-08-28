import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dxg extends dmk {
   public static final MapCodec<dxg> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dva.a.b.fieldOf("kind").forGetter(dmk::b), t()).apply($$0, dxg::new));
   public static final eco<jc> d = drp.e;
   private static final Map<jc, fgw> b = fgt.c(dno.c(8.0, 8.0, 16.0));

   @Override
   public MapCodec<? extends dxg> a() {
      return c;
   }

   protected dxg(dva.a $$0, ebp.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(d, jc.c));
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public ebq a(ded $$0) {
      ebq $$1 = super.a($$0);
      djn $$2 = $$0.q();
      iw $$3 = $$0.a();
      jc[] $$4 = $$0.f();

      for (jc $$5 : $$4) {
         if ($$5.o().d()) {
            jc $$6 = $$5.g();
            $$1 = $$1.b(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
