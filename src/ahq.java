import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public class ahq {
   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a(
                                    "raid"
                                 )
                                 .requires($$0x -> $$0x.c(3)))
                              .then(
                                 ds.a("start")
                                    .then(
                                       ds.a("omenlvl", IntegerArgumentType.integer(0))
                                          .executes($$0x -> b((dr)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "omenlvl")))
                                    )
                              ))
                           .then(ds.a("stop").executes($$0x -> c((dr)$$0x.getSource()))))
                        .then(ds.a("check").executes($$0x -> d((dr)$$0x.getSource()))))
                     .then(ds.a("sound").then(ds.a("type", dy.a()).executes($$0x -> a((dr)$$0x.getSource(), dy.a($$0x, "type"))))))
                  .then(ds.a("spawnleader").executes($$0x -> b((dr)$$0x.getSource()))))
               .then(
                  ds.a("setomen")
                     .then(
                        ds.a("level", IntegerArgumentType.integer(0)).executes($$0x -> a((dr)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "level")))
                     )
               ))
            .then(ds.a("glow").executes($$0x -> a((dr)$$0x.getSource())))
      );
   }

   private static int a(dr $$0) throws CommandSyntaxException {
      ccu $$1 = a($$0.h());
      if ($$1 != null) {
         for (ccv $$3 : $$1.h()) {
            $$3.b(new bhv(bhx.x, 1000, 1));
         }
      }

      return 1;
   }

   private static int a(dr $$0, int $$1) throws CommandSyntaxException {
      ccu $$2 = a($$0.h());
      if ($$2 != null) {
         int $$3 = $$2.l();
         if ($$1 > $$3) {
            $$0.b(tf.b("Sorry, the max bad omen level you can set is " + $$3));
         } else {
            int $$4 = $$2.m();
            $$2.a($$1);
            $$0.a(() -> tf.b("Changed village's bad omen level from " + $$4 + " to " + $$1), false);
         }
      } else {
         $$0.b(tf.b("No raid found here"));
      }

      return 1;
   }

   private static int b(dr $$0) {
      $$0.a(() -> tf.b("Spawned a raid captain"), false);
      ccv $$1 = bim.ay.a((cpm)$$0.e());
      if ($$1 == null) {
         $$0.b(tf.b("Pillager failed to spawn"));
         return 0;
      } else {
         $$1.w(true);
         $$1.a(bin.f, ccu.s());
         $$1.e($$0.d().c, $$0.d().d, $$0.d().e);
         $$1.a($$0.e(), $$0.e().d_(gu.a($$0.d())), bjc.n, null, null);
         $$0.e().a_($$1);
         return 1;
      }
   }

   private static int a(dr $$0, @Nullable tf $$1) {
      if ($$1 != null && $$1.getString().equals("local")) {
         akk $$2 = $$0.e();
         ehe $$3 = $$0.d().b(5.0, 0.0, 0.0);
         $$2.a(null, $$3.c, $$3.d, $$3.e, aow.tp, aox.g, 2.0F, 1.0F, $$2.z.g());
      }

      return 1;
   }

   private static int b(dr $$0, int $$1) throws CommandSyntaxException {
      akl $$2 = $$0.h();
      gu $$3 = $$2.dk();
      if ($$2.x().d($$3)) {
         $$0.b(tf.b("Raid already started close by"));
         return -1;
      } else {
         ccw $$4 = $$2.x().x();
         ccu $$5 = $$4.a($$2);
         if ($$5 != null) {
            $$5.a($$1);
            $$4.c();
            $$0.a(() -> tf.b("Created a raid in your local village"), false);
         } else {
            $$0.b(tf.b("Failed to create a raid in your local village"));
         }

         return 1;
      }
   }

   private static int c(dr $$0) throws CommandSyntaxException {
      akl $$1 = $$0.h();
      gu $$2 = $$1.dk();
      ccu $$3 = $$1.x().c($$2);
      if ($$3 != null) {
         $$3.n();
         $$0.a(() -> tf.b("Stopped raid"), false);
         return 1;
      } else {
         $$0.b(tf.b("No raid here"));
         return -1;
      }
   }

   private static int d(dr $$0) throws CommandSyntaxException {
      ccu $$1 = a($$0.h());
      if ($$1 != null) {
         StringBuilder $$2 = new StringBuilder();
         $$2.append("Found a started raid! ");
         $$0.a(() -> tf.b($$2.toString()), false);
         StringBuilder $$3 = new StringBuilder();
         $$3.append("Num groups spawned: ");
         $$3.append($$1.k());
         $$3.append(" Bad omen level: ");
         $$3.append($$1.m());
         $$3.append(" Num mobs: ");
         $$3.append($$1.r());
         $$3.append(" Raid health: ");
         $$3.append($$1.q());
         $$3.append(" / ");
         $$3.append($$1.g());
         $$0.a(() -> tf.b($$3.toString()), false);
         return 1;
      } else {
         $$0.b(tf.b("Found no started raids"));
         return 0;
      }
   }

   @Nullable
   private static ccu a(akl $$0) {
      return $$0.x().c($$0.dk());
   }
}
