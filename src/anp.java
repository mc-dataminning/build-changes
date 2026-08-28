import com.google.common.collect.Iterables;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.ParsedCommandNode;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.CommandNode;
import java.util.Map;

public class anp {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wv.c("commands.help.failed"));

   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("help").executes($$1 -> {
               Map<CommandNode<ex>, String> $$2 = $$0.getSmartUsage($$0.getRoot(), (ex)$$1.getSource());

               for (String $$3 : $$2.values()) {
                  ((ex)$$1.getSource()).a(() -> wv.b("/" + $$3), false);
               }

               return $$2.size();
            }))
            .then(
               ey.a("command", StringArgumentType.greedyString())
                  .executes(
                     $$1 -> {
                        ParseResults<ex> $$2 = $$0.parse(StringArgumentType.getString($$1, "command"), (ex)$$1.getSource());
                        if ($$2.getContext().getNodes().isEmpty()) {
                           throw a.create();
                        } else {
                           Map<CommandNode<ex>, String> $$3 = $$0.getSmartUsage(
                              ((ParsedCommandNode)Iterables.getLast($$2.getContext().getNodes())).getNode(), (ex)$$1.getSource()
                           );

                           for (String $$4 : $$3.values()) {
                              ((ex)$$1.getSource()).a(() -> wv.b("/" + $$2.getReader().getString() + " " + $$4), false);
                           }

                           return $$3.size();
                        }
                     }
                  )
            )
      );
   }
}
