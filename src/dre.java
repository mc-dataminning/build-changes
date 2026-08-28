import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;

public class dre extends dqk {
   public static final MapCodec<dre> a = b(dre::new);
   private static final xg b = xg.c("container.grindstone_title");
   private final Function<ebq, fgw> d;

   @Override
   public MapCodec<dre> a() {
      return a;
   }

   protected dre(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(e, jc.c).b(c, ecb.b));
      this.d = this.b();
   }

   private Function<ebq, fgw> b() {
      fgw $$0 = fgt.a(dno.a(2.0, 6.0, 7.0, 4.0, 10.0, 16.0), dno.a(2.0, 5.0, 3.0, 4.0, 11.0, 9.0));
      fgw $$1 = fgt.a($$0, h.z);
      fgw $$2 = fgt.a(dno.a(8.0, 2.0, 14.0, 0.0, 12.0), $$0, $$1);
      Map<ecb, Map<jc, fgw>> $$3 = fgt.e($$2);
      return this.a($$1x -> $$3.get($$1x.c(c)).get($$1x.c(e)));
   }

   private fgw o(ebq $$0) {
      return this.d.apply($$0);
   }

   @Override
   protected fgw b(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return this.o($$0);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return this.o($$0);
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      return true;
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(axi.aD);
      }

      return bvc.a;
   }

   @Override
   protected bve b(ebq $$0, dkj $$1, iw $$2) {
      return new bvk(($$2x, $$3, $$4) -> new cxb($$2x, $$3, cwo.a($$1, $$2)), b);
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(e, c);
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }
}
