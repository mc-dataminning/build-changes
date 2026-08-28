import com.mojang.serialization.MapCodec;

public class dja extends dlu {
   public static final MapCodec<dja> a = b(dja::new);

   @Override
   public MapCodec<dja> a() {
      return a;
   }

   public dja(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, jf.a.b));
   }

   @Override
   public void a(dcg $$0, dsl $$1, ja $$2, bsh $$3, float $$4) {
      $$3.a($$4, 0.2F, $$0.aj().l());
   }
}
