import com.mojang.serialization.MapCodec;

public class dbe extends dch {
   public static final MapCodec<dbe> a = b(dbe::new);

   @Override
   public MapCodec<dbe> a() {
      return a;
   }

   public dbe(dph.d $$0) {
      super($$0);
   }

   @Override
   protected dim b_(dpi $$0) {
      return dim.a;
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return esz.a();
   }
}
