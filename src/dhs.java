import com.mojang.serialization.MapCodec;

public class dhs extends dkm {
   public static final MapCodec<dhs> a = b(dhs::new);

   @Override
   public MapCodec<dhs> a() {
      return a;
   }

   public dhs(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, it.a.b));
   }

   @Override
   public void a(daz $$0, drd $$1, io $$2, brw $$3, float $$4) {
      $$3.a($$4, 0.2F, $$0.ai().k());
   }
}
