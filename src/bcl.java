import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.function.UnaryOperator;

public class bcl extends bbd {
   private final String a;
   private final String b;
   private final String c;
   private final UnaryOperator<String> d;

   public bcl(Schema $$0, String $$1, String $$2, String $$3, String $$4, UnaryOperator<String> $$5) {
      super($$0, $$1);
      this.a = $$2;
      this.b = $$3;
      this.c = $$4;
      this.d = $$5;
   }

   @Override
   protected boolean a(String $$0) {
      return $$0.equals(this.a);
   }

   @Override
   protected <T> Dynamic<T> a(String $$0, Dynamic<T> $$1) {
      return $$1.renameAndFixField(this.b, this.c, $$0x -> $$0x.createString(this.d.apply($$0x.asString(""))));
   }
}
