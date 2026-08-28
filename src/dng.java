import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dng extends dna implements dnf {
   public static final MapCodec<dng> a = b(dng::new);

   @Override
   public MapCodec<dng> a() {
      return a;
   }

   public dng(ebp.d $$0) {
      super($$0);
   }

   @Override
   public czi b() {
      return czi.a;
   }

   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new dyj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyo> dyp<T> a(dkj $$0, ebq $$1, dyq<T> $$2) {
      return a($$2, dyq.p, dyj::a);
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dyj $$5) {
         $$3.a($$5);
         $$3.a(axi.ab);
      }

      return bvc.a;
   }
}
