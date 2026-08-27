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

public class fu implements ArgumentType<fu.a> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "#foo");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> te.a("arguments.function.tag.unknown", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> te.a("arguments.function.unknown", $$0));

   public static fu a() {
      return new fu();
   }

   public fu.a a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         $$0.skip();
         final aep $$1 = aep.a($$0);
         return new fu.a() {
            @Override
            public Collection<dn> a(CommandContext<ds> $$0) throws CommandSyntaxException {
               return fu.b($$0, $$1);
            }

            @Override
            public Pair<aep, Either<dn, Collection<dn>>> b(CommandContext<ds> $$0) throws CommandSyntaxException {
               return Pair.of($$1, Either.right(fu.b($$0, $$1)));
            }
         };
      } else {
         final aep $$2 = aep.a($$0);
         return new fu.a() {
            @Override
            public Collection<dn> a(CommandContext<ds> $$0) throws CommandSyntaxException {
               return Collections.singleton(fu.a($$0, $$2));
            }

            @Override
            public Pair<aep, Either<dn, Collection<dn>>> b(CommandContext<ds> $$0) throws CommandSyntaxException {
               return Pair.of($$2, Either.left(fu.a($$0, $$2)));
            }
         };
      }
   }

   static dn a(CommandContext<ds> $$0, aep $$1) throws CommandSyntaxException {
      return ((ds)$$0.getSource()).l().aA().a($$1).orElseThrow(() -> c.create($$1.toString()));
   }

   static Collection<dn> b(CommandContext<ds> $$0, aep $$1) throws CommandSyntaxException {
      Collection<dn> $$2 = ((ds)$$0.getSource()).l().aA().b($$1);
      if ($$2 == null) {
         throw b.create($$1.toString());
      } else {
         return $$2;
      }
   }

   public static Collection<dn> a(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return ((fu.a)$$0.getArgument($$1, fu.a.class)).a($$0);
   }

   public static Pair<aep, Either<dn, Collection<dn>>> b(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return ((fu.a)$$0.getArgument($$1, fu.a.class)).b($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public interface a {
      Collection<dn> a(CommandContext<ds> var1) throws CommandSyntaxException;

      Pair<aep, Either<dn, Collection<dn>>> b(CommandContext<ds> var1) throws CommandSyntaxException;
   }
}
