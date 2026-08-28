import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class drz extends dno implements duz {
   public static final MapCodec<drz> a = b(drz::new);
   public static final eco<jc> b = drp.e;
   public static final ech c = ecg.I;
   public static final Map<jc, fgw> d = fgt.c(dno.c(16.0, 13.0, 16.0));

   @Override
   public MapCodec<drz> a() {
      return a;
   }

   protected drz(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jc.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return d.get($$0.c(b));
   }

   private boolean a(djn $$0, iw $$1, jc $$2) {
      ebq $$3 = $$0.a_($$1);
      return $$3.c($$0, $$1, $$2);
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      jc $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$4.g() == $$0.c(b) && !$$0.a($$1, $$3)) {
         return dnq.a.m();
      } else {
         if ($$0.c(c)) {
            $$2.a($$3, eyb.c, eyb.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      if (!$$0.c()) {
         ebq $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      ebq $$2 = this.m();
      dkm $$3 = $$0.q();
      iw $$4 = $$0.a();
      eya $$5 = $$0.q().b_($$0.a());

      for (jc $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.b(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.b(c, Boolean.valueOf($$5.a() == eyb.c));
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
      $$0.a(b, c);
   }

   @Override
   protected eya b_(ebq $$0) {
      return $$0.c(c) ? eyb.c.a(false) : super.b_($$0);
   }
}
