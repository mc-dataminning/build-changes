import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class awq extends axk {
   public awq(Schema $$0) {
      super($$0, "Remove filtered text from books", $$0x -> $$0x.equals("minecraft:writable_book") || $$0x.equals("minecraft:written_book"));
   }

   @Override
   protected <T> Dynamic<T> a(Dynamic<T> $$0) {
      return $$0.remove("filtered_title").remove("filtered_pages");
   }
}
