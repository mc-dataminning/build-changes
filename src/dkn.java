import com.mojang.serialization.MapCodec;

public class dkn extends dni {
   public static final MapCodec<dkn> a = b(dkn::new);

   @Override
   public MapCodec<dkn> a() {
      return a;
   }

   public dkn(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(i, jj.a.b));
   }

   @Override
   public void a(dds $$0, dua $$1, je $$2, btj $$3, float $$4) {
      $$3.a($$4, 0.2F, $$0.ak().l());
   }
}
