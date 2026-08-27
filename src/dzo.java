import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;

public class dzo extends dzv {
   public static final Codec<dzo> a = Codec.unit(() -> dzo.b);
   public static final dzo b = new dzo();

   private dzo() {
      super(dzx.a.a);
   }

   @Override
   public iz a(ecp $$0, dcl $$1) {
      return iz.g;
   }

   @Override
   public List<eco.c> a(ecp $$0, hv $$1, dcl $$2, auf $$3) {
      return Collections.emptyList();
   }

   @Override
   public dyg a(ecp $$0, hv $$1, dcl $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(ecp $$0, ctt $$1, ctr $$2, dkm $$3, hv $$4, hv $$5, dcl $$6, dyg $$7, auf $$8, boolean $$9) {
      return true;
   }

   @Override
   public dzw<?> a() {
      return dzw.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
