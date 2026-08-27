import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;

public class dwi extends dwp {
   public static final Codec<dwi> a = Codec.unit(() -> dwi.b);
   public static final dwi b = new dwi();

   private dwi() {
      super(dwr.a.a);
   }

   @Override
   public hy a(dzc $$0, czh $$1) {
      return hy.g;
   }

   @Override
   public List<dzb.c> a(dzc $$0, gw $$1, czh $$2, asc $$3) {
      return Collections.emptyList();
   }

   @Override
   public dva a(dzc $$0, gw $$1, czh $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(dzc $$0, cqp $$1, cqn $$2, dhg $$3, gw $$4, gw $$5, czh $$6, dva $$7, asc $$8, boolean $$9) {
      return true;
   }

   @Override
   public dwq<?> a() {
      return dwq.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
