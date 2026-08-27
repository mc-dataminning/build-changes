import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;

public class dwk extends dwr {
   public static final Codec<dwk> a = Codec.unit(() -> dwk.b);
   public static final dwk b = new dwk();

   private dwk() {
      super(dwt.a.a);
   }

   @Override
   public ib a(dze $$0, czj $$1) {
      return ib.g;
   }

   @Override
   public List<dzd.c> a(dze $$0, gw $$1, czj $$2, ase $$3) {
      return Collections.emptyList();
   }

   @Override
   public dvc a(dze $$0, gw $$1, czj $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(dze $$0, cqr $$1, cqp $$2, dhi $$3, gw $$4, gw $$5, czj $$6, dvc $$7, ase $$8, boolean $$9) {
      return true;
   }

   @Override
   public dws<?> a() {
      return dws.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
