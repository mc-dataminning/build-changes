import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;

public class eaf extends eam {
   public static final Codec<eaf> a = Codec.unit(() -> eaf.b);
   public static final eaf b = new eaf();

   private eaf() {
      super(eao.a.a);
   }

   @Override
   public jb a(edg $$0, ddb $$1) {
      return jb.g;
   }

   @Override
   public List<edf.c> a(edg $$0, hx $$1, ddb $$2, auu $$3) {
      return Collections.emptyList();
   }

   @Override
   public dyx a(edg $$0, hx $$1, ddb $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(edg $$0, cuj $$1, cuh $$2, dld $$3, hx $$4, hx $$5, ddb $$6, dyx $$7, auu $$8, boolean $$9) {
      return true;
   }

   @Override
   public ean<?> a() {
      return ean.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
