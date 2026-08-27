import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.UUID;

public class aoi {
   public static void a(CommandDispatcher<eh> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("serverpack").requires($$0x -> $$0x.c(2)))
               .then(
                  ei.a("push")
                     .then(
                        ((RequiredArgumentBuilder)ei.a("url", StringArgumentType.string())
                              .then(
                                 ((RequiredArgumentBuilder)ei.a("uuid", fx.a())
                                       .then(
                                          ei.a("hash", StringArgumentType.word())
                                             .executes(
                                                $$0x -> a(
                                                      (eh)$$0x.getSource(),
                                                      StringArgumentType.getString($$0x, "url"),
                                                      Optional.of(fx.a($$0x, "uuid")),
                                                      Optional.of(StringArgumentType.getString($$0x, "hash"))
                                                   )
                                             )
                                       ))
                                    .executes(
                                       $$0x -> a(
                                             (eh)$$0x.getSource(), StringArgumentType.getString($$0x, "url"), Optional.of(fx.a($$0x, "uuid")), Optional.empty()
                                          )
                                    )
                              ))
                           .executes($$0x -> a((eh)$$0x.getSource(), StringArgumentType.getString($$0x, "url"), Optional.empty(), Optional.empty()))
                     )
               ))
            .then(ei.a("pop").then(ei.a("uuid", fx.a()).executes($$0x -> a((eh)$$0x.getSource(), fx.a($$0x, "uuid")))))
      );
   }

   private static void a(eh $$0, zl<?> $$1) {
      $$0.l().ai().e().forEach($$1x -> $$1x.a($$1));
   }

   private static int a(eh $$0, String $$1, Optional<UUID> $$2, Optional<String> $$3) {
      UUID $$4 = $$2.orElseGet(() -> UUID.nameUUIDFromBytes($$1.getBytes(StandardCharsets.UTF_8)));
      String $$5 = $$3.orElse("");
      zx $$6 = new zx($$4, $$1, $$5, false, null);
      a($$0, $$6);
      return 0;
   }

   private static int a(eh $$0, UUID $$1) {
      zw $$2 = new zw(Optional.of($$1));
      a($$0, $$2);
      return 0;
   }
}
