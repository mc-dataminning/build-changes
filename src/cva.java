import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cva extends dak implements daz {
   public static final MapCodec<cva> a = b(cva::new);
   public static final dgs b = dgr.C;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final eiy e = cua.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final eiy f = cua.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final eiy g = cua.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<cva> a() {
      return a;
   }

   public cva(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(i, hx.a.b));
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      switch ((hx.a)$$0.c(i)) {
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
   public dgb a(cmr $$0) {
      ebe $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ebf.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, ebf.c, ebf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   public ebe c_(dgb $$0) {
      return $$0.c(b) ? ebf.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }
}
