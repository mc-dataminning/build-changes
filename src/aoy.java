import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.UUID;

public class aoy {
   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("serverpack").requires($$0x -> $$0x.c(2)))
               .then(
                  ex.a("push")
                     .then(
                        ((RequiredArgumentBuilder)ex.a("url", StringArgumentType.string())
                              .then(
                                 ((RequiredArgumentBuilder)ex.a("uuid", gm.a())
                                       .then(
                                          ex.a("hash", StringArgumentType.word())
                                             .executes(
                                                $$0x -> a(
                                                      (ew)$$0x.getSource(),
                                                      StringArgumentType.getString($$0x, "url"),
                                                      Optional.of(gm.a($$0x, "uuid")),
                                                      Optional.of(StringArgumentType.getString($$0x, "hash"))
                                                   )
                                             )
                                       ))
                                    .executes(
                                       $$0x -> a(
                                             (ew)$$0x.getSource(), StringArgumentType.getString($$0x, "url"), Optional.of(gm.a($$0x, "uuid")), Optional.empty()
                                          )
                                    )
                              ))
                           .executes($$0x -> a((ew)$$0x.getSource(), StringArgumentType.getString($$0x, "url"), Optional.empty(), Optional.empty()))
                     )
               ))
            .then(ex.a("pop").then(ex.a("uuid", gm.a()).executes($$0x -> a((ew)$$0x.getSource(), gm.a($$0x, "uuid")))))
      );
   }

   private static void a(ew $$0, zp<?> $$1) {
      $$0.l().ah().e().forEach($$1x -> $$1x.a($$1));
   }

   private static int a(ew $$0, String $$1, Optional<UUID> $$2, Optional<String> $$3) {
      UUID $$4 = $$2.orElseGet(() -> UUID.nameUUIDFromBytes($$1.getBytes(StandardCharsets.UTF_8)));
      String $$5 = $$3.orElse("");
      aac $$6 = new aac($$4, $$1, $$5, false, null);
      a($$0, $$6);
      return 0;
   }

   private static int a(ew $$0, UUID $$1) {
      aab $$2 = new aab(Optional.of($$1));
      a($$0, $$2);
      return 0;
   }
}
