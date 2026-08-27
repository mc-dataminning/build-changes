import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.stream.Stream;

public class ara extends auz {
   public ara(Schema $$0, String $$1, String $$2) {
      super($$0, false, $$1, avw.l, $$2);
   }

   private static Dynamic<?> a(Dynamic<?> $$0) {
      String $$1 = "black";
      Dynamic<?> $$2 = $$0.emptyMap();
      $$2 = $$2.set("messages", a($$0, "Text"));
      $$2 = $$2.set("filtered_messages", a($$0, "FilteredText"));
      Optional<? extends Dynamic<?>> $$3 = $$0.get("Color").result();
      $$2 = $$2.set("color", $$3.isPresent() ? $$3.get() : $$2.createString("black"));
      Optional<? extends Dynamic<?>> $$4 = $$0.get("GlowingText").result();
      $$2 = $$2.set("has_glowing_text", $$4.isPresent() ? $$4.get() : $$2.createBoolean(false));
      Dynamic<?> $$5 = $$0.emptyMap();
      Dynamic<?> $$6 = b($$0);
      $$5 = $$5.set("messages", $$6);
      $$5 = $$5.set("filtered_messages", $$6);
      $$5 = $$5.set("color", $$5.createString("black"));
      $$5 = $$5.set("has_glowing_text", $$5.createBoolean(false));
      $$0 = $$0.set("front_text", $$2);
      return $$0.set("back_text", $$5);
   }

   private static <T> Dynamic<T> a(Dynamic<T> $$0, String $$1) {
      Dynamic<T> $$2 = $$0.createString(a());
      return $$0.createList(
         Stream.of(
            $$0.get($$1 + "1").result().orElse($$2),
            $$0.get($$1 + "2").result().orElse($$2),
            $$0.get($$1 + "3").result().orElse($$2),
            $$0.get($$1 + "4").result().orElse($$2)
         )
      );
   }

   private static <T> Dynamic<T> b(Dynamic<T> $$0) {
      Dynamic<T> $$1 = $$0.createString(a());
      return $$0.createList(Stream.of($$1, $$1, $$1, $$1));
   }

   private static String a() {
      return sw.a.a(sv.a);
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), ara::a);
   }
}
