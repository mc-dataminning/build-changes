import com.google.common.collect.Iterables;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.ParsedCommandNode;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.CommandNode;
import java.util.Map;

public class ant {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xh.c("commands.help.failed"));

   public static void a(CommandDispatcher<ev> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("help").executes($$1 -> {
               Map<CommandNode<ev>, String> $$2 = $$0.getSmartUsage($$0.getRoot(), (ev)$$1.getSource());

               for (String $$3 : $$2.values()) {
                  ((ev)$$1.getSource()).a(() -> xh.b("/" + $$3), false);
               }

               return $$2.size();
            }))
            .then(
               ew.a("command", StringArgumentType.greedyString())
                  .executes(
                     $$1 -> {
                        ParseResults<ev> $$2 = $$0.parse(StringArgumentType.getString($$1, "command"), (ev)$$1.getSource());
                        if ($$2.getContext().getNodes().isEmpty()) {
                           throw a.create();
                        } else {
                           Map<CommandNode<ev>, String> $$3 = $$0.getSmartUsage(
                              ((ParsedCommandNode)Iterables.getLast($$2.getContext().getNodes())).getNode(), (ev)$$1.getSource()
                           );

                           for (String $$4 : $$3.values()) {
                              ((ev)$$1.getSource()).a(() -> xh.b("/" + $$2.getReader().getString() + " " + $$4), false);
                           }

                           return $$3.size();
                        }
                     }
                  )
            )
      );
   }
}
