import com.google.common.collect.Iterables;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.ParsedCommandNode;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.CommandNode;
import java.util.Map;

public class air {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ur.c("commands.help.failed"));

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("help").executes($$1 -> {
               Map<CommandNode<du>, String> $$2 = $$0.getSmartUsage($$0.getRoot(), (du)$$1.getSource());

               for (String $$3 : $$2.values()) {
                  ((du)$$1.getSource()).a(() -> ur.b("/" + $$3), false);
               }

               return $$2.size();
            }))
            .then(
               dv.a("command", StringArgumentType.greedyString())
                  .executes(
                     $$1 -> {
                        ParseResults<du> $$2 = $$0.parse(StringArgumentType.getString($$1, "command"), (du)$$1.getSource());
                        if ($$2.getContext().getNodes().isEmpty()) {
                           throw a.create();
                        } else {
                           Map<CommandNode<du>, String> $$3 = $$0.getSmartUsage(
                              ((ParsedCommandNode)Iterables.getLast($$2.getContext().getNodes())).getNode(), (du)$$1.getSource()
                           );

                           for (String $$4 : $$3.values()) {
                              ((du)$$1.getSource()).a(() -> ur.b("/" + $$2.getReader().getString() + " " + $$4), false);
                           }

                           return $$3.size();
                        }
                     }
                  )
            )
      );
   }
}
