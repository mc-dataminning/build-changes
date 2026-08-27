import com.mojang.serialization.MapCodec;

public class dbx extends dcj {
   public static final MapCodec<dbx> a = b(dbx::new);

   @Override
   public MapCodec<dbx> a() {
      return a;
   }

   public dbx(dle.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(aE);
   }

   @Override
   public dlf a(crg $$0) {
      return this.o().a(aE, $$0.g().g());
   }
}
