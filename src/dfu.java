import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfu extends dlg implements dlv {
   public static final MapCodec<dfu> a = b(dfu::new);
   public static final dso b = dsn.C;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final ewf e = deu.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final ewf f = deu.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final ewf g = deu.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<dfu> a() {
      return a;
   }

   public dfu(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(i, je.a.b));
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      switch ((je.a)$$0.c(i)) {
         case a:
         default:
            return g;
         case c:
            return f;
         case b:
            return e;
      }
   }

   @Nullable
   @Override
   public drx a(cxv $$0) {
      enq $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == enr.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, enr.c, enr.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   protected enq b_(drx $$0) {
      return $$0.c(b) ? enr.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }
}
