import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dmz extends dmw {
   public static final MapCodec<dmz> c = b(dmz::new);
   public static final eco<jc> d = drp.e;
   private static final Map<jc, fgw> e = fgt.c(dno.b(16.0, 8.0, 5.0, 16.0));

   @Override
   public MapCodec<? extends dmz> a() {
      return c;
   }

   protected dmz(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(d, jc.c).b(b, Boolean.valueOf(true)));
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return e.get($$0.c(d));
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
      $$0.a(d, b);
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, eyb.c, eyb.c.a($$1));
      }

      return $$4.g() == $$0.c(d) && !$$0.a($$1, $$3) ? dnq.a.m() : $$0;
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      jc $$3 = $$0.c(d);
      iw $$4 = $$2.a($$3.g());
      ebq $$5 = $$1.a_($$4);
      return $$5.c($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      ebq $$1 = super.a($$0);
      dkm $$2 = $$0.q();
      iw $$3 = $$0.a();
      jc[] $$4 = $$0.f();

      for (jc $$5 : $$4) {
         if ($$5.o().d()) {
            $$1 = $$1.b(d, $$5.g());
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }
}
