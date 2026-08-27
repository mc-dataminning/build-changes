import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.UUID;

public class ant {
   public static void a(CommandDispatcher<ec> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("serverpack").requires($$0x -> $$0x.c(2)))
               .then(
                  ed.a("push")
                     .then(
                        ((RequiredArgumentBuilder)ed.a("url", StringArgumentType.string())
                              .then(
                                 ((RequiredArgumentBuilder)ed.a("uuid", fr.a())
                                       .then(
                                          ed.a("hash", StringArgumentType.word())
                                             .executes(
                                                $$0x -> a(
                                                      (ec)$$0x.getSource(),
                                                      StringArgumentType.getString($$0x, "url"),
                                                      Optional.of(fr.a($$0x, "uuid")),
                                                      Optional.of(StringArgumentType.getString($$0x, "hash"))
                                                   )
                                             )
                                       ))
                                    .executes(
                                       $$0x -> a(
                                             (ec)$$0x.getSource(), StringArgumentType.getString($$0x, "url"), Optional.of(fr.a($$0x, "uuid")), Optional.empty()
                                          )
                                    )
                              ))
                           .executes($$0x -> a((ec)$$0x.getSource(), StringArgumentType.getString($$0x, "url"), Optional.empty(), Optional.empty()))
                     )
               ))
            .then(ed.a("pop").then(ed.a("uuid", fr.a()).executes($$0x -> a((ec)$$0x.getSource(), fr.a($$0x, "uuid")))))
      );
   }

   private static void a(ec $$0, yz<?> $$1) {
      $$0.l().ai().e().forEach($$1x -> $$1x.a($$1));
   }

   private static int a(ec $$0, String $$1, Optional<UUID> $$2, Optional<String> $$3) {
      UUID $$4 = $$2.orElseGet(() -> UUID.nameUUIDFromBytes($$1.getBytes(StandardCharsets.UTF_8)));
      String $$5 = $$3.orElse("");
      zl $$6 = new zl($$4, $$1, $$5, false, null);
      a($$0, $$6);
      return 0;
   }

   private static int a(ec $$0, UUID $$1) {
      zk $$2 = new zk(Optional.of($$1));
      a($$0, $$2);
      return 0;
   }
}
