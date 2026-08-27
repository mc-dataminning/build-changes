import com.mojang.serialization.MapCodec;

public class dfd extends cxt {
   public static final MapCodec<dfd> n = b(dfd::new);

   @Override
   public MapCodec<dfd> a() {
      return n;
   }

   public dfd(djg.d $$0) {
      super($$0, () -> dgx.c);
   }

   @Override
   public dgv a(hx $$0, djh $$1) {
      return new din($$0, $$1);
   }

   @Override
   protected arz<ahg> c() {
      return asc.i.b(asc.ai);
   }

   @Override
   public boolean f_(djh $$0) {
      return true;
   }

   @Override
   public int a(djh $$0, csv $$1, hx $$2, ic $$3) {
      return auo.a(dhc.a($$1, $$2), 0, 15);
   }

   @Override
   public int b(djh $$0, csv $$1, hx $$2, ic $$3) {
      return $$3 == ic.b ? $$0.b($$1, $$2, $$3) : 0;
   }
}
