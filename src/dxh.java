import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dxh extends dwn {
   public static final MapCodec<dxh> d = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), t()).apply($$0, dxh::new));
   public static final eco<jc> e = drp.e;
   private static final Map<jc, fgw> f = fgt.c(dno.a(5.0, 3.0, 13.0, 11.0, 16.0));

   @Override
   public MapCodec<dxh> a() {
      return d;
   }

   protected dxh(md $$0, ebp.d $$1) {
      super($$0, $$1);
      this.l(this.C.b().b(e, jc.c));
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return o($$0);
   }

   public static fgw o(ebq $$0) {
      return f.get($$0.c(e));
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      return b($$1, $$2, $$0.c(e));
   }

   public static boolean b(dkm $$0, iw $$1, jc $$2) {
      iw $$3 = $$1.a($$2.g());
      ebq $$4 = $$0.a_($$3);
      return $$4.c($$0, $$3, $$2);
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      ebq $$1 = this.m();
      dkm $$2 = $$0.q();
      iw $$3 = $$0.a();
      jc[] $$4 = $$0.f();

      for (jc $$5 : $$4) {
         if ($$5.o().d()) {
            jc $$6 = $$5.g();
            $$1 = $$1.b(e, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      return $$4.g() == $$0.c(e) && !$$0.a($$1, $$3) ? dnq.a.m() : $$0;
   }

   @Override
   public void a(ebq $$0, dkj $$1, iw $$2, bai $$3) {
      jc $$4 = $$0.c(e);
      double $$5 = (double)$$2.u() + 0.5;
      double $$6 = (double)$$2.v() + 0.7;
      double $$7 = (double)$$2.w() + 0.5;
      double $$8 = 0.22;
      double $$9 = 0.27;
      jc $$10 = $$4.g();
      $$1.a(lz.ah, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
      $$1.a(this.c, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
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
      $$0.a(e);
   }
}
