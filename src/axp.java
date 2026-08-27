import com.google.common.collect.Streams;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class axp extends baq {
   private static final String[] a = new String[]{
      "Text1", "Text2", "Text3", "Text4", "FilteredText1", "FilteredText2", "FilteredText3", "FilteredText4", "Color", "GlowingText"
   };

   public axp(Schema $$0, String $$1, String $$2) {
      super($$0, false, $$1, bbq.s, $$2);
   }

   private static <T> Dynamic<T> a(Dynamic<T> $$0) {
      $$0 = $$0.update("front_text", axp::b);
      $$0 = $$0.update("back_text", axp::b);

      for (String $$1 : a) {
         $$0 = $$0.remove($$1);
      }

      return $$0;
   }

   private static <T> Dynamic<T> b(Dynamic<T> $$0) {
      boolean $$1 = $$0.get("_filtered_correct").asBoolean(false);
      if ($$1) {
         return $$0.remove("_filtered_correct");
      } else {
         Optional<Stream<Dynamic<T>>> $$2 = $$0.get("filtered_messages").asStreamOpt().result();
         if ($$2.isEmpty()) {
            return $$0;
         } else {
            Dynamic<T> $$3 = avp.a($$0.getOps());
            List<Dynamic<T>> $$4 = $$0.get("messages").asStreamOpt().result().orElse(Stream.of()).toList();
            List<Dynamic<T>> $$5 = Streams.mapWithIndex($$2.get(), ($$2x, $$3x) -> {
               Dynamic<T> $$4x = $$3x < (long)$$4.size() ? $$4.get((int)$$3x) : $$3;
               return $$2x.equals($$3) ? $$4x : $$2x;
            }).toList();
            return $$5.stream().allMatch($$1x -> $$1x.equals($$3))
               ? $$0.remove("filtered_messages")
               : $$0.set("filtered_messages", $$0.createList($$5.stream()));
         }
      }
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), axp::a);
   }
}
