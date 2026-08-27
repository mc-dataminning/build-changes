import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.UUID;

public class aku {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("serverpack").requires($$0x -> $$0x.c(2)))
               .then(
                  dt.a("push")
                     .then(
                        ((RequiredArgumentBuilder)dt.a("url", StringArgumentType.string())
                              .then(
                                 ((RequiredArgumentBuilder)dt.a("uuid", fg.a())
                                       .then(
                                          dt.a("hash", StringArgumentType.word())
                                             .executes(
                                                $$0x -> a(
                                                      (ds)$$0x.getSource(),
                                                      StringArgumentType.getString($$0x, "url"),
                                                      Optional.of(fg.a($$0x, "uuid")),
                                                      Optional.of(StringArgumentType.getString($$0x, "hash"))
                                                   )
                                             )
                                       ))
                                    .executes(
                                       $$0x -> a(
                                             (ds)$$0x.getSource(), StringArgumentType.getString($$0x, "url"), Optional.of(fg.a($$0x, "uuid")), Optional.empty()
                                          )
                                    )
                              ))
                           .executes($$0x -> a((ds)$$0x.getSource(), StringArgumentType.getString($$0x, "url"), Optional.empty(), Optional.empty()))
                     )
               ))
            .then(dt.a("pop").then(dt.a("uuid", fg.a()).executes($$0x -> a((ds)$$0x.getSource(), fg.a($$0x, "uuid")))))
      );
   }

   private static void a(ds $$0, xf<?> $$1) {
      $$0.l().af().e().forEach($$1x -> $$1x.a($$1));
   }

   private static int a(ds $$0, String $$1, Optional<UUID> $$2, Optional<String> $$3) {
      UUID $$4 = $$2.orElseGet(() -> UUID.nameUUIDFromBytes($$1.getBytes(StandardCharsets.UTF_8)));
      String $$5 = $$3.orElse("");
      xo $$6 = new xo($$4, $$1, $$5, false, null);
      a($$0, $$6);
      return 0;
   }

   private static int a(ds $$0, UUID $$1) {
      xn $$2 = new xn(Optional.of($$1));
      a($$0, $$2);
      return 0;
   }
}
