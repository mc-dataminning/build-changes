import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.UUID;

public class aow {
   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("serverpack").requires($$0x -> $$0x.c(2)))
               .then(
                  ey.a("push")
                     .then(
                        ((RequiredArgumentBuilder)ey.a("url", StringArgumentType.string())
                              .then(
                                 ((RequiredArgumentBuilder)ey.a("uuid", go.a())
                                       .then(
                                          ey.a("hash", StringArgumentType.word())
                                             .executes(
                                                $$0x -> a(
                                                      (ex)$$0x.getSource(),
                                                      StringArgumentType.getString($$0x, "url"),
                                                      Optional.of(go.a($$0x, "uuid")),
                                                      Optional.of(StringArgumentType.getString($$0x, "hash"))
                                                   )
                                             )
                                       ))
                                    .executes(
                                       $$0x -> a(
                                             (ex)$$0x.getSource(), StringArgumentType.getString($$0x, "url"), Optional.of(go.a($$0x, "uuid")), Optional.empty()
                                          )
                                    )
                              ))
                           .executes($$0x -> a((ex)$$0x.getSource(), StringArgumentType.getString($$0x, "url"), Optional.empty(), Optional.empty()))
                     )
               ))
            .then(ey.a("pop").then(ey.a("uuid", go.a()).executes($$0x -> a((ex)$$0x.getSource(), go.a($$0x, "uuid")))))
      );
   }

   private static void a(ex $$0, zc<?> $$1) {
      $$0.l().ah().e().forEach($$1x -> $$1x.a($$1));
   }

   private static int a(ex $$0, String $$1, Optional<UUID> $$2, Optional<String> $$3) {
      UUID $$4 = $$2.orElseGet(() -> UUID.nameUUIDFromBytes($$1.getBytes(StandardCharsets.UTF_8)));
      String $$5 = $$3.orElse("");
      zp $$6 = new zp($$4, $$1, $$5, false, null);
      a($$0, $$6);
      return 0;
   }

   private static int a(ex $$0, UUID $$1) {
      zo $$2 = new zo(Optional.of($$1));
      a($$0, $$2);
      return 0;
   }
}
