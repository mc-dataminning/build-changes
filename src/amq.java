import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.UUID;

public class amq {
   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("serverpack").requires($$0x -> $$0x.c(2)))
               .then(
                  dv.a("push")
                     .then(
                        ((RequiredArgumentBuilder)dv.a("url", StringArgumentType.string())
                              .then(
                                 ((RequiredArgumentBuilder)dv.a("uuid", fi.a())
                                       .then(
                                          dv.a("hash", StringArgumentType.word())
                                             .executes(
                                                $$0x -> a(
                                                      (du)$$0x.getSource(),
                                                      StringArgumentType.getString($$0x, "url"),
                                                      Optional.of(fi.a($$0x, "uuid")),
                                                      Optional.of(StringArgumentType.getString($$0x, "hash"))
                                                   )
                                             )
                                       ))
                                    .executes(
                                       $$0x -> a(
                                             (du)$$0x.getSource(), StringArgumentType.getString($$0x, "url"), Optional.of(fi.a($$0x, "uuid")), Optional.empty()
                                          )
                                    )
                              ))
                           .executes($$0x -> a((du)$$0x.getSource(), StringArgumentType.getString($$0x, "url"), Optional.empty(), Optional.empty()))
                     )
               ))
            .then(dv.a("pop").then(dv.a("uuid", fi.a()).executes($$0x -> a((du)$$0x.getSource(), fi.a($$0x, "uuid")))))
      );
   }

   private static void a(du $$0, xz<?> $$1) {
      $$0.l().ai().e().forEach($$1x -> $$1x.a($$1));
   }

   private static int a(du $$0, String $$1, Optional<UUID> $$2, Optional<String> $$3) {
      UUID $$4 = $$2.orElseGet(() -> UUID.nameUUIDFromBytes($$1.getBytes(StandardCharsets.UTF_8)));
      String $$5 = $$3.orElse("");
      yl $$6 = new yl($$4, $$1, $$5, false, null);
      a($$0, $$6);
      return 0;
   }

   private static int a(du $$0, UUID $$1) {
      yk $$2 = new yk(Optional.of($$1));
      a($$0, $$2);
      return 0;
   }
}
