import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.UUID;

public class aoz {
   public static void a(CommandDispatcher<ei> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("serverpack").requires($$0x -> $$0x.c(2)))
               .then(
                  ej.a("push")
                     .then(
                        ((RequiredArgumentBuilder)ej.a("url", StringArgumentType.string())
                              .then(
                                 ((RequiredArgumentBuilder)ej.a("uuid", fz.a())
                                       .then(
                                          ej.a("hash", StringArgumentType.word())
                                             .executes(
                                                $$0x -> a(
                                                      (ei)$$0x.getSource(),
                                                      StringArgumentType.getString($$0x, "url"),
                                                      Optional.of(fz.a($$0x, "uuid")),
                                                      Optional.of(StringArgumentType.getString($$0x, "hash"))
                                                   )
                                             )
                                       ))
                                    .executes(
                                       $$0x -> a(
                                             (ei)$$0x.getSource(), StringArgumentType.getString($$0x, "url"), Optional.of(fz.a($$0x, "uuid")), Optional.empty()
                                          )
                                    )
                              ))
                           .executes($$0x -> a((ei)$$0x.getSource(), StringArgumentType.getString($$0x, "url"), Optional.empty(), Optional.empty()))
                     )
               ))
            .then(ej.a("pop").then(ej.a("uuid", fz.a()).executes($$0x -> a((ei)$$0x.getSource(), fz.a($$0x, "uuid")))))
      );
   }

   private static void a(ei $$0, zf<?> $$1) {
      $$0.l().ah().e().forEach($$1x -> $$1x.a($$1));
   }

   private static int a(ei $$0, String $$1, Optional<UUID> $$2, Optional<String> $$3) {
      UUID $$4 = $$2.orElseGet(() -> UUID.nameUUIDFromBytes($$1.getBytes(StandardCharsets.UTF_8)));
      String $$5 = $$3.orElse("");
      zs $$6 = new zs($$4, $$1, $$5, false, null);
      a($$0, $$6);
      return 0;
   }

   private static int a(ei $$0, UUID $$1) {
      zr $$2 = new zr(Optional.of($$1));
      a($$0, $$2);
      return 0;
   }
}
