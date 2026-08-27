import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class amf {
   private static final Logger b = LogUtils.getLogger();
   private static final String c = "localhost";
   private static final String d = "0.0.0.0";
   private static final int e = 10000;
   private static final int f = 100;
   public static BiMap<String, aks<dca>> a = ImmutableBiMap.of("o", dca.h, "n", dca.i, "e", dca.j);
   @Nullable
   private static alx g;
   @Nullable
   private static alw h;

   public static void a(CommandDispatcher<eh> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("chase")
                  .then(
                     ((LiteralArgumentBuilder)ei.a("follow")
                           .then(
                              ((RequiredArgumentBuilder)ei.a("host", StringArgumentType.string())
                                    .executes($$0x -> b((eh)$$0x.getSource(), StringArgumentType.getString($$0x, "host"), 10000)))
                                 .then(
                                    ei.a("port", IntegerArgumentType.integer(1, 65535))
                                       .executes(
                                          $$0x -> b(
                                                (eh)$$0x.getSource(), StringArgumentType.getString($$0x, "host"), IntegerArgumentType.getInteger($$0x, "port")
                                             )
                                       )
                                 )
                           ))
                        .executes($$0x -> b((eh)$$0x.getSource(), "localhost", 10000))
                  ))
               .then(
                  ((LiteralArgumentBuilder)ei.a("lead")
                        .then(
                           ((RequiredArgumentBuilder)ei.a("bind_address", StringArgumentType.string())
                                 .executes($$0x -> a((eh)$$0x.getSource(), StringArgumentType.getString($$0x, "bind_address"), 10000)))
                              .then(
                                 ei.a("port", IntegerArgumentType.integer(1024, 65535))
                                    .executes(
                                       $$0x -> a(
                                             (eh)$$0x.getSource(),
                                             StringArgumentType.getString($$0x, "bind_address"),
                                             IntegerArgumentType.getInteger($$0x, "port")
                                          )
                                    )
                              )
                        ))
                     .executes($$0x -> a((eh)$$0x.getSource(), "0.0.0.0", 10000))
               ))
            .then(ei.a("stop").executes($$0x -> a((eh)$$0x.getSource())))
      );
   }

   private static int a(eh $$0) {
      if (h != null) {
         h.b();
         $$0.a(() -> xe.b("You have now stopped chasing"), false);
         h = null;
      }

      if (g != null) {
         g.b();
         $$0.a(() -> xe.b("You are no longer being chased"), false);
         g = null;
      }

      return 0;
   }

   private static boolean b(eh $$0) {
      if (g != null) {
         $$0.b(xe.b("Chase server is already running. Stop it using /chase stop"));
         return true;
      } else if (h != null) {
         $$0.b(xe.b("You are already chasing someone. Stop it using /chase stop"));
         return true;
      } else {
         return false;
      }
   }

   private static int a(eh $$0, String $$1, int $$2) {
      if (b($$0)) {
         return 0;
      } else {
         g = new alx($$1, $$2, $$0.l().ah(), 100);

         try {
            g.a();
            $$0.a(() -> xe.b("Chase server is now running on port " + $$2 + ". Clients can follow you using /chase follow <ip> <port>"), false);
         } catch (IOException var4) {
            b.error("Failed to start chase server", var4);
            $$0.b(xe.b("Failed to start chase server on port " + $$2));
            g = null;
         }

         return 0;
      }
   }

   private static int b(eh $$0, String $$1, int $$2) {
      if (b($$0)) {
         return 0;
      } else {
         h = new alw($$1, $$2, $$0.l());
         h.a();
         $$0.a(
            () -> xe.b(
                  "You are now chasing "
                     + $$1
                     + ":"
                     + $$2
                     + ". If that server does '/chase lead' then you will automatically go to the same position. Use '/chase stop' to stop chasing."
               ),
            false
         );
         return 0;
      }
   }
}
