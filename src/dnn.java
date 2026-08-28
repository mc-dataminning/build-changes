import com.mojang.serialization.MapCodec;

public class dnn extends dgc {
   public static final MapCodec<dnn> n = b(dnn::new);

   @Override
   public MapCodec<dnn> a() {
      return n;
   }

   public dnn(dsb.d $$0) {
      super($$0, () -> dpj.c);
   }

   @Override
   public dph a(iz $$0, dsc $$1) {
      return new dra($$0, $$1);
   }

   @Override
   protected awh<alf> c() {
      return awk.i.b(awk.ai);
   }

   @Override
   protected boolean e_(dsc $$0) {
      return true;
   }

   @Override
   protected int a(dsc $$0, dbe $$1, iz $$2, je $$3) {
      return ayz.a(dpo.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(dsc $$0, dbe $$1, iz $$2, je $$3) {
      return $$3 == je.b ? $$0.b($$1, $$2, $$3) : 0;
   }
}
