import com.mojang.serialization.MapCodec;

public class dnt extends dgi {
   public static final MapCodec<dnt> n = b(dnt::new);

   @Override
   public MapCodec<dnt> a() {
      return n;
   }

   public dnt(dsg.d $$0) {
      super($$0, () -> dpp.c);
   }

   @Override
   public dpn a(ja $$0, dsh $$1) {
      return new drg($$0, $$1);
   }

   @Override
   protected avm<akk> c() {
      return avp.i.b(avp.ai);
   }

   @Override
   protected boolean e_(dsh $$0) {
      return true;
   }

   @Override
   protected int a(dsh $$0, dbj $$1, ja $$2, jf $$3) {
      return aye.a(dpu.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(dsh $$0, dbj $$1, ja $$2, jf $$3) {
      return $$3 == jf.b ? $$0.b($$1, $$2, $$3) : 0;
   }
}
