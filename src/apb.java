import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.UUID;

public class apb {
   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("serverpack").requires($$0x -> $$0x.c(2)))
               .then(
                  ek.a("push")
                     .then(
                        ((RequiredArgumentBuilder)ek.a("url", StringArgumentType.string())
                              .then(
                                 ((RequiredArgumentBuilder)ek.a("uuid", ga.a())
                                       .then(
                                          ek.a("hash", StringArgumentType.word())
                                             .executes(
                                                $$0x -> a(
                                                      (ej)$$0x.getSource(),
                                                      StringArgumentType.getString($$0x, "url"),
                                                      Optional.of(ga.a($$0x, "uuid")),
                                                      Optional.of(StringArgumentType.getString($$0x, "hash"))
                                                   )
                                             )
                                       ))
                                    .executes(
                                       $$0x -> a(
                                             (ej)$$0x.getSource(), StringArgumentType.getString($$0x, "url"), Optional.of(ga.a($$0x, "uuid")), Optional.empty()
                                          )
                                    )
                              ))
                           .executes($$0x -> a((ej)$$0x.getSource(), StringArgumentType.getString($$0x, "url"), Optional.empty(), Optional.empty()))
                     )
               ))
            .then(ek.a("pop").then(ek.a("uuid", ga.a()).executes($$0x -> a((ej)$$0x.getSource(), ga.a($$0x, "uuid")))))
      );
   }

   private static void a(ej $$0, zh<?> $$1) {
      $$0.l().ah().e().forEach($$1x -> $$1x.a($$1));
   }

   private static int a(ej $$0, String $$1, Optional<UUID> $$2, Optional<String> $$3) {
      UUID $$4 = $$2.orElseGet(() -> UUID.nameUUIDFromBytes($$1.getBytes(StandardCharsets.UTF_8)));
      String $$5 = $$3.orElse("");
      zu $$6 = new zu($$4, $$1, $$5, false, null);
      a($$0, $$6);
      return 0;
   }

   private static int a(ej $$0, UUID $$1) {
      zt $$2 = new zt(Optional.of($$1));
      a($$0, $$2);
      return 0;
   }
}
