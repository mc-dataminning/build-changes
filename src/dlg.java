import com.mojang.serialization.MapCodec;

public class dlg extends dlt {
   public static final MapCodec<dlg> a = b(dlg::new);

   @Override
   public MapCodec<dlg> a() {
      return a;
   }

   public dlg(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(aF);
   }

   @Override
   public dvd a(czm $$0) {
      return this.m().b(aF, $$0.g().g());
   }
}
