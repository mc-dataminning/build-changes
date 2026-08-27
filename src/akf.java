import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import javax.annotation.Nullable;

public class akf {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vf.c("commands.publish.failed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vf.b("commands.publish.alreadyPublished", $$0));

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("publish").requires($$0x -> $$0x.c(4)))
               .executes($$0x -> a((ds)$$0x.getSource(), aue.a(), false, null)))
            .then(
               ((RequiredArgumentBuilder)dt.a("allowCommands", BoolArgumentType.bool())
                     .executes($$0x -> a((ds)$$0x.getSource(), aue.a(), BoolArgumentType.getBool($$0x, "allowCommands"), null)))
                  .then(
                     ((RequiredArgumentBuilder)dt.a("gamemode", eg.a())
                           .executes($$0x -> a((ds)$$0x.getSource(), aue.a(), BoolArgumentType.getBool($$0x, "allowCommands"), eg.a($$0x, "gamemode"))))
                        .then(
                           dt.a("port", IntegerArgumentType.integer(0, 65535))
                              .executes(
                                 $$0x -> a(
                                       (ds)$$0x.getSource(),
                                       IntegerArgumentType.getInteger($$0x, "port"),
                                       BoolArgumentType.getBool($$0x, "allowCommands"),
                                       eg.a($$0x, "gamemode")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ds $$0, int $$1, boolean $$2, @Nullable ctl $$3) throws CommandSyntaxException {
      if ($$0.l().p()) {
         throw b.create($$0.l().O());
      } else if (!$$0.l().a($$3, $$2, $$1)) {
         throw a.create();
      } else {
         $$0.a(() -> a($$1), true);
         return $$1;
      }
   }

   public static vt a(int $$0) {
      vf $$1 = vi.a(String.valueOf($$0));
      return vf.a("commands.publish.started", $$1);
   }
}
