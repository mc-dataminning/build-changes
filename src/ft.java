import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ft implements ArgumentType<ft.a> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "#foo");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> tf.a("arguments.function.tag.unknown", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> tf.a("arguments.function.unknown", $$0));

   public static ft a() {
      return new ft();
   }

   public ft.a a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         $$0.skip();
         final aer $$1 = aer.a($$0);
         return new ft.a() {
            @Override
            public Collection<dm> a(CommandContext<dr> $$0) throws CommandSyntaxException {
               return ft.b($$0, $$1);
            }

            @Override
            public Pair<aer, Either<dm, Collection<dm>>> b(CommandContext<dr> $$0) throws CommandSyntaxException {
               return Pair.of($$1, Either.right(ft.b($$0, $$1)));
            }
         };
      } else {
         final aer $$2 = aer.a($$0);
         return new ft.a() {
            @Override
            public Collection<dm> a(CommandContext<dr> $$0) throws CommandSyntaxException {
               return Collections.singleton(ft.a($$0, $$2));
            }

            @Override
            public Pair<aer, Either<dm, Collection<dm>>> b(CommandContext<dr> $$0) throws CommandSyntaxException {
               return Pair.of($$2, Either.left(ft.a($$0, $$2)));
            }
         };
      }
   }

   static dm a(CommandContext<dr> $$0, aer $$1) throws CommandSyntaxException {
      return ((dr)$$0.getSource()).l().aA().a($$1).orElseThrow(() -> c.create($$1.toString()));
   }

   static Collection<dm> b(CommandContext<dr> $$0, aer $$1) throws CommandSyntaxException {
      Collection<dm> $$2 = ((dr)$$0.getSource()).l().aA().b($$1);
      if ($$2 == null) {
         throw b.create($$1.toString());
      } else {
         return $$2;
      }
   }

   public static Collection<dm> a(CommandContext<dr> $$0, String $$1) throws CommandSyntaxException {
      return ((ft.a)$$0.getArgument($$1, ft.a.class)).a($$0);
   }

   public static Pair<aer, Either<dm, Collection<dm>>> b(CommandContext<dr> $$0, String $$1) throws CommandSyntaxException {
      return ((ft.a)$$0.getArgument($$1, ft.a.class)).b($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public interface a {
      Collection<dm> a(CommandContext<dr> var1) throws CommandSyntaxException;

      Pair<aer, Either<dm, Collection<dm>>> b(CommandContext<dr> var1) throws CommandSyntaxException;
   }
}
