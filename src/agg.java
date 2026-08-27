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

public class agg {
   private static final Logger b = LogUtils.getLogger();
   private static final String c = "localhost";
   private static final String d = "0.0.0.0";
   private static final int e = 10000;
   private static final int f = 100;
   public static BiMap<String, aev<cpv>> a = ImmutableBiMap.of("o", cpv.h, "n", cpv.i, "e", cpv.j);
   @Nullable
   private static afy g;
   @Nullable
   private static afx h;

   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("chase")
                  .then(
                     ((LiteralArgumentBuilder)du.a("follow")
                           .then(
                              ((RequiredArgumentBuilder)du.a("host", StringArgumentType.string())
                                    .executes($$0x -> b((dt)$$0x.getSource(), StringArgumentType.getString($$0x, "host"), 10000)))
                                 .then(
                                    du.a("port", IntegerArgumentType.integer(1, 65535))
                                       .executes(
                                          $$0x -> b(
                                                (dt)$$0x.getSource(), StringArgumentType.getString($$0x, "host"), IntegerArgumentType.getInteger($$0x, "port")
                                             )
                                       )
                                 )
                           ))
                        .executes($$0x -> b((dt)$$0x.getSource(), "localhost", 10000))
                  ))
               .then(
                  ((LiteralArgumentBuilder)du.a("lead")
                        .then(
                           ((RequiredArgumentBuilder)du.a("bind_address", StringArgumentType.string())
                                 .executes($$0x -> a((dt)$$0x.getSource(), StringArgumentType.getString($$0x, "bind_address"), 10000)))
                              .then(
                                 du.a("port", IntegerArgumentType.integer(1024, 65535))
                                    .executes(
                                       $$0x -> a(
                                             (dt)$$0x.getSource(),
                                             StringArgumentType.getString($$0x, "bind_address"),
                                             IntegerArgumentType.getInteger($$0x, "port")
                                          )
                                    )
                              )
                        ))
                     .executes($$0x -> a((dt)$$0x.getSource(), "0.0.0.0", 10000))
               ))
            .then(du.a("stop").executes($$0x -> a((dt)$$0x.getSource())))
      );
   }

   private static int a(dt $$0) {
      if (h != null) {
         h.b();
         $$0.a(() -> tl.b("You have now stopped chasing"), false);
         h = null;
      }

      if (g != null) {
         g.b();
         $$0.a(() -> tl.b("You are no longer being chased"), false);
         g = null;
      }

      return 0;
   }

   private static boolean b(dt $$0) {
      if (g != null) {
         $$0.b(tl.b("Chase server is already running. Stop it using /chase stop"));
         return true;
      } else if (h != null) {
         $$0.b(tl.b("You are already chasing someone. Stop it using /chase stop"));
         return true;
      } else {
         return false;
      }
   }

   private static int a(dt $$0, String $$1, int $$2) {
      if (b($$0)) {
         return 0;
      } else {
         g = new afy($$1, $$2, $$0.l().ac(), 100);

         try {
            g.a();
            $$0.a(() -> tl.b("Chase server is now running on port " + $$2 + ". Clients can follow you using /chase follow <ip> <port>"), false);
         } catch (IOException var4) {
            b.error("Failed to start chase server", var4);
            $$0.b(tl.b("Failed to start chase server on port " + $$2));
            g = null;
         }

         return 0;
      }
   }

   private static int b(dt $$0, String $$1, int $$2) {
      if (b($$0)) {
         return 0;
      } else {
         h = new afx($$1, $$2, $$0.l());
         h.a();
         $$0.a(
            () -> tl.b(
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
