import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;

public class bpy implements bpt<StringReader, alg> {
   public static final bpt<StringReader, alg> a = new bpy();

   private bpy() {
   }

   @Override
   public Optional<alg> a(bps<StringReader> $$0) {
      $$0.b().skipWhitespace();

      try {
         return Optional.of(alg.b($$0.b()));
      } catch (CommandSyntaxException var3) {
         return Optional.empty();
      }
   }
}
