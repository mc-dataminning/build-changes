import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.UUID;

public class aox {
   public static void a(CommandDispatcher<ev> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("serverpack").requires($$0x -> $$0x.c(2)))
               .then(
                  ew.a("push")
                     .then(
                        ((RequiredArgumentBuilder)ew.a("url", StringArgumentType.string())
                              .then(
                                 ((RequiredArgumentBuilder)ew.a("uuid", gl.a())
                                       .then(
                                          ew.a("hash", StringArgumentType.word())
                                             .executes(
                                                $$0x -> a(
                                                      (ev)$$0x.getSource(),
                                                      StringArgumentType.getString($$0x, "url"),
                                                      Optional.of(gl.a($$0x, "uuid")),
                                                      Optional.of(StringArgumentType.getString($$0x, "hash"))
                                                   )
                                             )
                                       ))
                                    .executes(
                                       $$0x -> a(
                                             (ev)$$0x.getSource(), StringArgumentType.getString($$0x, "url"), Optional.of(gl.a($$0x, "uuid")), Optional.empty()
                                          )
                                    )
                              ))
                           .executes($$0x -> a((ev)$$0x.getSource(), StringArgumentType.getString($$0x, "url"), Optional.empty(), Optional.empty()))
                     )
               ))
            .then(ew.a("pop").then(ew.a("uuid", gl.a()).executes($$0x -> a((ev)$$0x.getSource(), gl.a($$0x, "uuid")))))
      );
   }

   private static void a(ev $$0, zo<?> $$1) {
      $$0.l().ah().e().forEach($$1x -> $$1x.a($$1));
   }

   private static int a(ev $$0, String $$1, Optional<UUID> $$2, Optional<String> $$3) {
      UUID $$4 = $$2.orElseGet(() -> UUID.nameUUIDFromBytes($$1.getBytes(StandardCharsets.UTF_8)));
      String $$5 = $$3.orElse("");
      aab $$6 = new aab($$4, $$1, $$5, false, null);
      a($$0, $$6);
      return 0;
   }

   private static int a(ev $$0, UUID $$1) {
      aaa $$2 = new aaa(Optional.of($$1));
      a($$0, $$2);
      return 0;
   }
}
