import com.google.common.collect.Iterables;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.ParsedCommandNode;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.CommandNode;
import java.util.Map;

public class ahe {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tl.c("commands.help.failed"));

   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("help").executes($$1 -> {
               Map<CommandNode<dt>, String> $$2 = $$0.getSmartUsage($$0.getRoot(), (dt)$$1.getSource());

               for (String $$3 : $$2.values()) {
                  ((dt)$$1.getSource()).a(() -> tl.b("/" + $$3), false);
               }

               return $$2.size();
            }))
            .then(
               du.a("command", StringArgumentType.greedyString())
                  .executes(
                     $$1 -> {
                        ParseResults<dt> $$2 = $$0.parse(StringArgumentType.getString($$1, "command"), (dt)$$1.getSource());
                        if ($$2.getContext().getNodes().isEmpty()) {
                           throw a.create();
                        } else {
                           Map<CommandNode<dt>, String> $$3 = $$0.getSmartUsage(
                              ((ParsedCommandNode)Iterables.getLast($$2.getContext().getNodes())).getNode(), (dt)$$1.getSource()
                           );

                           for (String $$4 : $$3.values()) {
                              ((dt)$$1.getSource()).a(() -> tl.b("/" + $$2.getReader().getString() + " " + $$4), false);
                           }

                           return $$3.size();
                        }
                     }
                  )
            )
      );
   }
}
