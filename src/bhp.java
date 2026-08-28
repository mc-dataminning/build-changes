import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bhp extends DataFix {
   private static final Logger a = LogUtils.getLogger();

   public bhp(Schema $$0) {
      super($$0, true);
   }

   protected TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(bia.y);
      Type<?> $$1 = this.getOutputSchema().getType(bia.y);
      return this.writeFixAndRead("ParticleUnflatteningFix", $$0, $$1, this::a);
   }

   private <T> Dynamic<T> a(Dynamic<T> $$0) {
      Optional<String> $$1 = $$0.asString().result();
      if ($$1.isEmpty()) {
         return $$0;
      } else {
         String $$2 = $$1.get();
         String[] $$3 = $$2.split(" ", 2);
         String $$4 = bjo.a($$3[0]);
         Dynamic<T> $$5 = $$0.createMap(Map.of($$0.createString("type"), $$0.createString($$4)));

         return switch ($$4) {
            case "minecraft:item" -> $$3.length > 1 ? this.a($$5, $$3[1]) : $$5;
            case "minecraft:block", "minecraft:block_marker", "minecraft:falling_dust", "minecraft:dust_pillar" -> $$3.length > 1 ? this.b($$5, $$3[1]) : $$5;
            case "minecraft:dust" -> $$3.length > 1 ? this.d($$5, $$3[1]) : $$5;
            case "minecraft:dust_color_transition" -> $$3.length > 1 ? this.e($$5, $$3[1]) : $$5;
            case "minecraft:sculk_charge" -> $$3.length > 1 ? this.f($$5, $$3[1]) : $$5;
            case "minecraft:vibration" -> $$3.length > 1 ? this.g($$5, $$3[1]) : $$5;
            case "minecraft:shriek" -> $$3.length > 1 ? this.h($$5, $$3[1]) : $$5;
            default -> $$5;
         };
      }
   }

   private <T> Dynamic<T> a(Dynamic<T> $$0, String $$1) {
      int $$2 = $$1.indexOf("{");
      Dynamic<T> $$3 = $$0.createMap(Map.of($$0.createString("Count"), $$0.createInt(1)));
      if ($$2 == -1) {
         $$3 = $$3.set("id", $$0.createString($$1));
      } else {
         $$3 = $$3.set("id", $$0.createString($$1.substring(0, $$2)));
         ul $$4 = a($$1.substring($$2));
         if ($$4 != null) {
            $$3 = $$3.set("tag", new Dynamic(uz.a, $$4).convert($$0.getOps()));
         }
      }

      return $$0.set("item", $$3);
   }

   @Nullable
   private static ul a(String $$0) {
      try {
         return vj.a($$0);
      } catch (Exception var2) {
         a.warn("Failed to parse tag: {}", $$0, var2);
         return null;
      }
   }

   private <T> Dynamic<T> b(Dynamic<T> $$0, String $$1) {
      int $$2 = $$1.indexOf("[");
      Dynamic<T> $$3 = $$0.emptyMap();
      if ($$2 == -1) {
         $$3 = $$3.set("Name", $$0.createString(bjo.a($$1)));
      } else {
         $$3 = $$3.set("Name", $$0.createString(bjo.a($$1.substring(0, $$2))));
         Map<Dynamic<T>, Dynamic<T>> $$4 = c($$0, $$1.substring($$2));
         if (!$$4.isEmpty()) {
            $$3 = $$3.set("Properties", $$0.createMap($$4));
         }
      }

      return $$0.set("block_state", $$3);
   }

   private static <T> Map<Dynamic<T>, Dynamic<T>> c(Dynamic<T> $$0, String $$1) {
      try {
         Map<Dynamic<T>, Dynamic<T>> $$2 = new HashMap<>();
         StringReader $$3 = new StringReader($$1);
         $$3.expect('[');
         $$3.skipWhitespace();

         while ($$3.canRead() && $$3.peek() != ']') {
            $$3.skipWhitespace();
            String $$4 = $$3.readString();
            $$3.skipWhitespace();
            $$3.expect('=');
            $$3.skipWhitespace();
            String $$5 = $$3.readString();
            $$3.skipWhitespace();
            $$2.put($$0.createString($$4), $$0.createString($$5));
            if ($$3.canRead()) {
               if ($$3.peek() != ',') {
                  break;
               }

               $$3.skip();
            }
         }

         $$3.expect(']');
         return $$2;
      } catch (Exception var6) {
         a.warn("Failed to parse block properties: {}", $$1, var6);
         return Map.of();
      }
   }

   private static <T> Dynamic<T> a(Dynamic<T> $$0, StringReader $$1) throws CommandSyntaxException {
      float $$2 = $$1.readFloat();
      $$1.expect(' ');
      float $$3 = $$1.readFloat();
      $$1.expect(' ');
      float $$4 = $$1.readFloat();
      return $$0.createList(Stream.of($$2, $$3, $$4).map($$0::createFloat));
   }

   private <T> Dynamic<T> d(Dynamic<T> $$0, String $$1) {
      try {
         StringReader $$2 = new StringReader($$1);
         Dynamic<T> $$3 = a($$0, $$2);
         $$2.expect(' ');
         float $$4 = $$2.readFloat();
         return $$0.set("color", $$3).set("scale", $$0.createFloat($$4));
      } catch (Exception var6) {
         a.warn("Failed to parse particle options: {}", $$1, var6);
         return $$0;
      }
   }

   private <T> Dynamic<T> e(Dynamic<T> $$0, String $$1) {
      try {
         StringReader $$2 = new StringReader($$1);
         Dynamic<T> $$3 = a($$0, $$2);
         $$2.expect(' ');
         float $$4 = $$2.readFloat();
         $$2.expect(' ');
         Dynamic<T> $$5 = a($$0, $$2);
         return $$0.set("from_color", $$3).set("to_color", $$5).set("scale", $$0.createFloat($$4));
      } catch (Exception var7) {
         a.warn("Failed to parse particle options: {}", $$1, var7);
         return $$0;
      }
   }

   private <T> Dynamic<T> f(Dynamic<T> $$0, String $$1) {
      try {
         StringReader $$2 = new StringReader($$1);
         float $$3 = $$2.readFloat();
         return $$0.set("roll", $$0.createFloat($$3));
      } catch (Exception var5) {
         a.warn("Failed to parse particle options: {}", $$1, var5);
         return $$0;
      }
   }

   private <T> Dynamic<T> g(Dynamic<T> $$0, String $$1) {
      try {
         StringReader $$2 = new StringReader($$1);
         float $$3 = (float)$$2.readDouble();
         $$2.expect(' ');
         float $$4 = (float)$$2.readDouble();
         $$2.expect(' ');
         float $$5 = (float)$$2.readDouble();
         $$2.expect(' ');
         int $$6 = $$2.readInt();
         Dynamic<T> $$7 = $$0.createIntList(IntStream.of(azm.d($$3), azm.d($$4), azm.d($$5)));
         Dynamic<T> $$8 = $$0.createMap(Map.of($$0.createString("type"), $$0.createString("minecraft:block"), $$0.createString("pos"), $$7));
         return $$0.set("destination", $$8).set("arrival_in_ticks", $$0.createInt($$6));
      } catch (Exception var10) {
         a.warn("Failed to parse particle options: {}", $$1, var10);
         return $$0;
      }
   }

   private <T> Dynamic<T> h(Dynamic<T> $$0, String $$1) {
      try {
         StringReader $$2 = new StringReader($$1);
         int $$3 = $$2.readInt();
         return $$0.set("delay", $$0.createInt($$3));
      } catch (Exception var5) {
         a.warn("Failed to parse particle options: {}", $$1, var5);
         return $$0;
      }
   }
}
