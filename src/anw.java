import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.UUID;

public class anw {
   public static void a(CommandDispatcher<ed> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("serverpack").requires($$0x -> $$0x.c(2)))
               .then(
                  ee.a("push")
                     .then(
                        ((RequiredArgumentBuilder)ee.a("url", StringArgumentType.string())
                              .then(
                                 ((RequiredArgumentBuilder)ee.a("uuid", ft.a())
                                       .then(
                                          ee.a("hash", StringArgumentType.word())
                                             .executes(
                                                $$0x -> a(
                                                      (ed)$$0x.getSource(),
                                                      StringArgumentType.getString($$0x, "url"),
                                                      Optional.of(ft.a($$0x, "uuid")),
                                                      Optional.of(StringArgumentType.getString($$0x, "hash"))
                                                   )
                                             )
                                       ))
                                    .executes(
                                       $$0x -> a(
                                             (ed)$$0x.getSource(), StringArgumentType.getString($$0x, "url"), Optional.of(ft.a($$0x, "uuid")), Optional.empty()
                                          )
                                    )
                              ))
                           .executes($$0x -> a((ed)$$0x.getSource(), StringArgumentType.getString($$0x, "url"), Optional.empty(), Optional.empty()))
                     )
               ))
            .then(ee.a("pop").then(ee.a("uuid", ft.a()).executes($$0x -> a((ed)$$0x.getSource(), ft.a($$0x, "uuid")))))
      );
   }

   private static void a(ed $$0, zb<?> $$1) {
      $$0.l().ai().e().forEach($$1x -> $$1x.a($$1));
   }

   private static int a(ed $$0, String $$1, Optional<UUID> $$2, Optional<String> $$3) {
      UUID $$4 = $$2.orElseGet(() -> UUID.nameUUIDFromBytes($$1.getBytes(StandardCharsets.UTF_8)));
      String $$5 = $$3.orElse("");
      zn $$6 = new zn($$4, $$1, $$5, false, null);
      a($$0, $$6);
      return 0;
   }

   private static int a(ed $$0, UUID $$1) {
      zm $$2 = new zm(Optional.of($$1));
      a($$0, $$2);
      return 0;
   }
}
