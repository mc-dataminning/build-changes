import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmr extends deu {
   public static final MapCodec<dmr> a = b(dmr::new);
   private static final xl d = xl.c("container.stonecutter");
   public static final dsr b = diq.aE;
   protected static final ewf c = deu.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<dmr> a() {
      return a;
   }

   public dmr(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c));
   }

   @Override
   public drx a(cxv $$0) {
      return this.n().a(b, $$0.g().g());
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      if ($$1.B) {
         return bqp.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awg.ay);
         return bqp.c;
      }
   }

   @Nullable
   @Override
   protected bqt b(drx $$0, dbt $$1, iz $$2) {
      return new bqz(($$2x, $$3, $$4) -> new crq($$2x, $$3, cqa.a($$1, $$2)), d);
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return c;
   }

   @Override
   protected boolean f_(drx $$0) {
      return true;
   }

   @Override
   protected dla a_(drx $$0) {
      return dla.c;
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }
}
