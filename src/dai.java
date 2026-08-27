import com.mojang.serialization.MapCodec;

public class dai extends ddb {
   public static final MapCodec<dai> a = b(dai::new);

   @Override
   public MapCodec<dai> a() {
      return a;
   }

   public dai(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, ic.a.b));
   }

   @Override
   public void a(ctp $$0, djh $$1, hx $$2, blv $$3, float $$4) {
      $$3.a($$4, 0.2F, $$0.ai().k());
   }
}
