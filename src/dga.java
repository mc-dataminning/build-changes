import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dga extends dlm implements dmb {
   public static final MapCodec<dga> a = b(dga::new);
   public static final dsu b = dst.C;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final ewl e = dfa.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final ewl f = dfa.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final ewl g = dfa.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<dga> a() {
      return a;
   }

   public dga(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(i, je.a.b));
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
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
   public dsd a(cyb $$0) {
      enw $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == enx.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, enx.c, enx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   protected enw b_(dsd $$0) {
      return $$0.c(b) ? enx.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return false;
   }
}
