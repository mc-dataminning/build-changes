import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dag extends cwp implements ddp {
   public static final MapCodec<dag> a = b(dag::new);
   private static final djx c = djw.C;
   protected static final eml b = cwp.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dag> a() {
      return a;
   }

   protected dag(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(c);
   }

   @Override
   public eeq c_(djg $$0) {
      return $$0.c(c) ? eer.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public djg a(cpg $$0) {
      djg $$1 = super.a($$0);
      if ($$1 != null) {
         eeq $$2 = $$0.q().b_($$0.a());
         return $$1.a(c, Boolean.valueOf($$2.a() == eer.c));
      } else {
         return null;
      }
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      hx $$3 = $$2.c();
      djg $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, ic.a);
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return b;
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$1 == ic.b && !this.a($$0, $$3, $$4)) {
         return cwr.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, eer.c, eer.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
