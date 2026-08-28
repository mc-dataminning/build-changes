import com.google.common.collect.Streams;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class bcj extends bhq {
   public static final List<String> a = List.of(
      "Text1", "Text2", "Text3", "Text4", "FilteredText1", "FilteredText2", "FilteredText3", "FilteredText4", "Color", "GlowingText"
   );
   public static final String b = "_filtered_correct";
   private static final String c = "black";

   public bcj(Schema $$0, String $$1, String $$2) {
      super($$0, true, $$1, bit.s, $$2);
   }

   @Override
   protected <T> Dynamic<T> a(Dynamic<T> $$0) {
      $$0 = $$0.set("front_text", b($$0)).set("back_text", c($$0)).set("is_waxed", $$0.createBoolean(false)).set("_filtered_correct", $$0.createBoolean(true));

      for (String $$1 : a) {
         $$0 = $$0.remove($$1);
      }

      return $$0;
   }

   private static <T> Dynamic<T> b(Dynamic<T> $$0) {
      Dynamic<T> $$1 = bbc.a($$0.getOps());
      List<Dynamic<T>> $$2 = a($$0, "Text").map($$1x -> $$1x.orElse($$1)).toList();
      Dynamic<T> $$3 = $$0.emptyMap()
         .set("messages", $$0.createList($$2.stream()))
         .set("color", $$0.get("Color").result().orElse($$0.createString("black")))
         .set("has_glowing_text", $$0.get("GlowingText").result().orElse($$0.createBoolean(false)));
      List<Optional<Dynamic<T>>> $$4 = a($$0, "FilteredText").toList();
      if ($$4.stream().anyMatch(Optional::isPresent)) {
         $$3 = $$3.set("filtered_messages", $$0.createList(Streams.mapWithIndex($$4.stream(), ($$1x, $$2x) -> {
            Dynamic<T> $$3x = $$2.get((int)$$2x);
            return $$1x.orElse($$3x);
         })));
      }

      return $$3;
   }

   private static <T> Stream<Optional<Dynamic<T>>> a(Dynamic<T> $$0, String $$1) {
      return Stream.of($$0.get($$1 + "1").result(), $$0.get($$1 + "2").result(), $$0.get($$1 + "3").result(), $$0.get($$1 + "4").result());
   }

   private static <T> Dynamic<T> c(Dynamic<T> $$0) {
      return $$0.emptyMap().set("messages", d($$0)).set("color", $$0.createString("black")).set("has_glowing_text", $$0.createBoolean(false));
   }

   private static <T> Dynamic<T> d(Dynamic<T> $$0) {
      Dynamic<T> $$1 = bbc.a($$0.getOps());
      return $$0.createList(Stream.of($$1, $$1, $$1, $$1));
   }
}
