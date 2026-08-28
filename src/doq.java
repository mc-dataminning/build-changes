import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class doq extends duh implements duz {
   public static final MapCodec<doq> a = b(doq::new);
   public static final ech b = ecg.I;
   private static final Map<jc.a, fgw> e = fgt.b(dno.a(3.0, 3.0, 16.0));

   @Override
   public MapCodec<doq> a() {
      return a;
   }

   public doq(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)).b(d, jc.a.b));
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return e.get($$0.c(d));
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      eya $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eyb.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, eyb.c, eyb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b).a(d);
   }

   @Override
   protected eya b_(ebq $$0) {
      return $$0.c(b) ? eyb.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }
}
