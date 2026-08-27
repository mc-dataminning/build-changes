import com.google.common.collect.Iterables;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.ParsedCommandNode;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.CommandNode;
import java.util.Map;

public class amr {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("commands.help.failed"));

   public static void a(CommandDispatcher<ed> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("help").executes($$1 -> {
               Map<CommandNode<ed>, String> $$2 = $$0.getSmartUsage($$0.getRoot(), (ed)$$1.getSource());

               for (String $$3 : $$2.values()) {
                  ((ed)$$1.getSource()).a(() -> wu.b("/" + $$3), false);
               }

               return $$2.size();
            }))
            .then(
               ee.a("command", StringArgumentType.greedyString())
                  .executes(
                     $$1 -> {
                        ParseResults<ed> $$2 = $$0.parse(StringArgumentType.getString($$1, "command"), (ed)$$1.getSource());
                        if ($$2.getContext().getNodes().isEmpty()) {
                           throw a.create();
                        } else {
                           Map<CommandNode<ed>, String> $$3 = $$0.getSmartUsage(
                              ((ParsedCommandNode)Iterables.getLast($$2.getContext().getNodes())).getNode(), (ed)$$1.getSource()
                           );

                           for (String $$4 : $$3.values()) {
                              ((ed)$$1.getSource()).a(() -> wu.b("/" + $$2.getReader().getString() + " " + $$4), false);
                           }

                           return $$3.size();
                        }
                     }
                  )
            )
      );
   }
}
