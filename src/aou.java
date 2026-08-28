import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.UUID;

public class aou {
   public static void a(CommandDispatcher<eu> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("serverpack").requires($$0x -> $$0x.c(2)))
               .then(
                  ev.a("push")
                     .then(
                        ((RequiredArgumentBuilder)ev.a("url", StringArgumentType.string())
                              .then(
                                 ((RequiredArgumentBuilder)ev.a("uuid", gk.a())
                                       .then(
                                          ev.a("hash", StringArgumentType.word())
                                             .executes(
                                                $$0x -> a(
                                                      (eu)$$0x.getSource(),
                                                      StringArgumentType.getString($$0x, "url"),
                                                      Optional.of(gk.a($$0x, "uuid")),
                                                      Optional.of(StringArgumentType.getString($$0x, "hash"))
                                                   )
                                             )
                                       ))
                                    .executes(
                                       $$0x -> a(
                                             (eu)$$0x.getSource(), StringArgumentType.getString($$0x, "url"), Optional.of(gk.a($$0x, "uuid")), Optional.empty()
                                          )
                                    )
                              ))
                           .executes($$0x -> a((eu)$$0x.getSource(), StringArgumentType.getString($$0x, "url"), Optional.empty(), Optional.empty()))
                     )
               ))
            .then(ev.a("pop").then(ev.a("uuid", gk.a()).executes($$0x -> a((eu)$$0x.getSource(), gk.a($$0x, "uuid")))))
      );
   }

   private static void a(eu $$0, zl<?> $$1) {
      $$0.l().ah().e().forEach($$1x -> $$1x.a($$1));
   }

   private static int a(eu $$0, String $$1, Optional<UUID> $$2, Optional<String> $$3) {
      UUID $$4 = $$2.orElseGet(() -> UUID.nameUUIDFromBytes($$1.getBytes(StandardCharsets.UTF_8)));
      String $$5 = $$3.orElse("");
      zy $$6 = new zy($$4, $$1, $$5, false, null);
      a($$0, $$6);
      return 0;
   }

   private static int a(eu $$0, UUID $$1) {
      zx $$2 = new zx(Optional.of($$1));
      a($$0, $$2);
      return 0;
   }
}
