import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.UUID;

public class aos {
   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("serverpack").requires($$0x -> $$0x.c(2)))
               .then(
                  eu.a("push")
                     .then(
                        ((RequiredArgumentBuilder)eu.a("url", StringArgumentType.string())
                              .then(
                                 ((RequiredArgumentBuilder)eu.a("uuid", gj.a())
                                       .then(
                                          eu.a("hash", StringArgumentType.word())
                                             .executes(
                                                $$0x -> a(
                                                      (et)$$0x.getSource(),
                                                      StringArgumentType.getString($$0x, "url"),
                                                      Optional.of(gj.a($$0x, "uuid")),
                                                      Optional.of(StringArgumentType.getString($$0x, "hash"))
                                                   )
                                             )
                                       ))
                                    .executes(
                                       $$0x -> a(
                                             (et)$$0x.getSource(), StringArgumentType.getString($$0x, "url"), Optional.of(gj.a($$0x, "uuid")), Optional.empty()
                                          )
                                    )
                              ))
                           .executes($$0x -> a((et)$$0x.getSource(), StringArgumentType.getString($$0x, "url"), Optional.empty(), Optional.empty()))
                     )
               ))
            .then(eu.a("pop").then(eu.a("uuid", gj.a()).executes($$0x -> a((et)$$0x.getSource(), gj.a($$0x, "uuid")))))
      );
   }

   private static void a(et $$0, zk<?> $$1) {
      $$0.l().ah().e().forEach($$1x -> $$1x.a($$1));
   }

   private static int a(et $$0, String $$1, Optional<UUID> $$2, Optional<String> $$3) {
      UUID $$4 = $$2.orElseGet(() -> UUID.nameUUIDFromBytes($$1.getBytes(StandardCharsets.UTF_8)));
      String $$5 = $$3.orElse("");
      zx $$6 = new zx($$4, $$1, $$5, false, null);
      a($$0, $$6);
      return 0;
   }

   private static int a(et $$0, UUID $$1) {
      zw $$2 = new zw(Optional.of($$1));
      a($$0, $$2);
      return 0;
   }
}
