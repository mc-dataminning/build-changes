import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbl extends cwq implements ddq {
   public static final MapCodec<dbl> a = b(dbl::new);
   public static final djy b = djx.C;

   @Override
   public MapCodec<dbl> a() {
      return a;
   }

   protected dbl(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public boolean a(djh $$0, djh $$1, ic $$2) {
      return $$1.a(cws.ac) && $$2.o() == ic.a.b;
   }

   @Nullable
   @Override
   public djh a(cph $$0) {
      eer $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ees.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, ees.c, ees.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eer c_(djh $$0) {
      return $$0.c(b) ? ees.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b);
   }
}
