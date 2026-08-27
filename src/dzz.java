import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;

public class dzz extends eag {
   public static final Codec<dzz> a = Codec.unit(() -> dzz.b);
   public static final dzz b = new dzz();

   private dzz() {
      super(eai.a.a);
   }

   @Override
   public jb a(eda $$0, dcv $$1) {
      return jb.g;
   }

   @Override
   public List<ecz.c> a(eda $$0, hx $$1, dcv $$2, aup $$3) {
      return Collections.emptyList();
   }

   @Override
   public dyr a(eda $$0, hx $$1, dcv $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(eda $$0, cud $$1, cub $$2, dkx $$3, hx $$4, hx $$5, dcv $$6, dyr $$7, aup $$8, boolean $$9) {
      return true;
   }

   @Override
   public eah<?> a() {
      return eah.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
