import com.mojang.serialization.MapCodec;

public class dvt extends dpn implements dnh {
   public static final MapCodec<dvt> c = b(dvt::new);

   @Override
   public MapCodec<dvt> a() {
      return c;
   }

   public dvt(ebf.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dkc $$0, iw $$1, ebg $$2) {
      return true;
   }

   @Override
   public boolean a(djz $$0, azz $$1, iw $$2, ebg $$3) {
      return true;
   }

   @Override
   public void a(aru $$0, azz $$1, iw $$2, ebg $$3) {
      a($$0, $$2, new daa(this));
   }
}
