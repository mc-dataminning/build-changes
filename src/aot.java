import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.UUID;

public class aot {
   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("serverpack").requires($$0x -> $$0x.c(2)))
               .then(
                  eq.a("push")
                     .then(
                        ((RequiredArgumentBuilder)eq.a("url", StringArgumentType.string())
                              .then(
                                 ((RequiredArgumentBuilder)eq.a("uuid", gf.a())
                                       .then(
                                          eq.a("hash", StringArgumentType.word())
                                             .executes(
                                                $$0x -> a(
                                                      (ep)$$0x.getSource(),
                                                      StringArgumentType.getString($$0x, "url"),
                                                      Optional.of(gf.a($$0x, "uuid")),
                                                      Optional.of(StringArgumentType.getString($$0x, "hash"))
                                                   )
                                             )
                                       ))
                                    .executes(
                                       $$0x -> a(
                                             (ep)$$0x.getSource(), StringArgumentType.getString($$0x, "url"), Optional.of(gf.a($$0x, "uuid")), Optional.empty()
                                          )
                                    )
                              ))
                           .executes($$0x -> a((ep)$$0x.getSource(), StringArgumentType.getString($$0x, "url"), Optional.empty(), Optional.empty()))
                     )
               ))
            .then(eq.a("pop").then(eq.a("uuid", gf.a()).executes($$0x -> a((ep)$$0x.getSource(), gf.a($$0x, "uuid")))))
      );
   }

   private static void a(ep $$0, zv<?> $$1) {
      $$0.l().ai().e().forEach($$1x -> $$1x.a($$1));
   }

   private static int a(ep $$0, String $$1, Optional<UUID> $$2, Optional<String> $$3) {
      UUID $$4 = $$2.orElseGet(() -> UUID.nameUUIDFromBytes($$1.getBytes(StandardCharsets.UTF_8)));
      String $$5 = $$3.orElse("");
      aah $$6 = new aah($$4, $$1, $$5, false, null);
      a($$0, $$6);
      return 0;
   }

   private static int a(ep $$0, UUID $$1) {
      aag $$2 = new aag(Optional.of($$1));
      a($$0, $$2);
      return 0;
   }
}
