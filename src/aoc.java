import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.UUID;

public class aoc {
   public static void a(CommandDispatcher<ee> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("serverpack").requires($$0x -> $$0x.c(2)))
               .then(
                  ef.a("push")
                     .then(
                        ((RequiredArgumentBuilder)ef.a("url", StringArgumentType.string())
                              .then(
                                 ((RequiredArgumentBuilder)ef.a("uuid", fu.a())
                                       .then(
                                          ef.a("hash", StringArgumentType.word())
                                             .executes(
                                                $$0x -> a(
                                                      (ee)$$0x.getSource(),
                                                      StringArgumentType.getString($$0x, "url"),
                                                      Optional.of(fu.a($$0x, "uuid")),
                                                      Optional.of(StringArgumentType.getString($$0x, "hash"))
                                                   )
                                             )
                                       ))
                                    .executes(
                                       $$0x -> a(
                                             (ee)$$0x.getSource(), StringArgumentType.getString($$0x, "url"), Optional.of(fu.a($$0x, "uuid")), Optional.empty()
                                          )
                                    )
                              ))
                           .executes($$0x -> a((ee)$$0x.getSource(), StringArgumentType.getString($$0x, "url"), Optional.empty(), Optional.empty()))
                     )
               ))
            .then(ef.a("pop").then(ef.a("uuid", fu.a()).executes($$0x -> a((ee)$$0x.getSource(), fu.a($$0x, "uuid")))))
      );
   }

   private static void a(ee $$0, ze<?> $$1) {
      $$0.l().ai().e().forEach($$1x -> $$1x.a($$1));
   }

   private static int a(ee $$0, String $$1, Optional<UUID> $$2, Optional<String> $$3) {
      UUID $$4 = $$2.orElseGet(() -> UUID.nameUUIDFromBytes($$1.getBytes(StandardCharsets.UTF_8)));
      String $$5 = $$3.orElse("");
      zq $$6 = new zq($$4, $$1, $$5, false, null);
      a($$0, $$6);
      return 0;
   }

   private static int a(ee $$0, UUID $$1) {
      zp $$2 = new zp(Optional.of($$1));
      a($$0, $$2);
      return 0;
   }
}
