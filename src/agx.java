import com.google.common.collect.Iterables;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.ParsedCommandNode;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.CommandNode;
import java.util.Map;

public class agx {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(te.c("commands.help.failed"));

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("help").executes($$1 -> {
               Map<CommandNode<ds>, String> $$2 = $$0.getSmartUsage($$0.getRoot(), (ds)$$1.getSource());

               for (String $$3 : $$2.values()) {
                  ((ds)$$1.getSource()).a(() -> te.b("/" + $$3), false);
               }

               return $$2.size();
            }))
            .then(
               dt.a("command", StringArgumentType.greedyString())
                  .executes(
                     $$1 -> {
                        ParseResults<ds> $$2 = $$0.parse(StringArgumentType.getString($$1, "command"), (ds)$$1.getSource());
                        if ($$2.getContext().getNodes().isEmpty()) {
                           throw a.create();
                        } else {
                           Map<CommandNode<ds>, String> $$3 = $$0.getSmartUsage(
                              ((ParsedCommandNode)Iterables.getLast($$2.getContext().getNodes())).getNode(), (ds)$$1.getSource()
                           );

                           for (String $$4 : $$3.values()) {
                              ((ds)$$1.getSource()).a(() -> te.b("/" + $$2.getReader().getString() + " " + $$4), false);
                           }

                           return $$3.size();
                        }
                     }
                  )
            )
      );
   }
}
