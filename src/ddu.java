import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddu extends dhq {
   public static final MapCodec<ddu> a = b(ddu::new);
   public static final dsr b = diq.aE;
   private static final ewf c = deu.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final ewf d = deu.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final ewf e = deu.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final ewf f = deu.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final ewf g = deu.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final ewf h = deu.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final ewf i = deu.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final ewf j = ewc.a(c, d, e, f);
   private static final ewf k = ewc.a(c, g, h, i);
   private static final xl l = xl.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<ddu> a() {
      return a;
   }

   public ddu(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c));
   }

   @Override
   public drx a(cxv $$0) {
      return this.n().a(b, $$0.g().h());
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      if ($$1.B) {
         return bqp.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awg.aC);
         return bqp.c;
      }
   }

   @Nullable
   @Override
   protected bqt b(drx $$0, dbt $$1, iz $$2) {
      return new bqz(($$2x, $$3, $$4) -> new cpr($$2x, $$3, cqa.a($$1, $$2)), l);
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      je $$4 = $$0.c(b);
      return $$4.o() == je.a.a ? j : k;
   }

   @Override
   protected void a(cjb $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(dbt $$0, iz $$1, drx $$2, drx $$3, cjb $$4) {
      if (!$$4.aW()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(dbt $$0, iz $$1, cjb $$2) {
      if (!$$2.aW()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bri a(bsp $$0) {
      return $$0.dQ().b($$0);
   }

   @Nullable
   public static drx e(drx $$0) {
      if ($$0.a(dew.gS)) {
         return dew.gT.n().a(b, $$0.c(b));
      } else {
         return $$0.a(dew.gT) ? dew.gU.n().a(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }

   @Override
   public int b(drx $$0, daz $$1, iz $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
