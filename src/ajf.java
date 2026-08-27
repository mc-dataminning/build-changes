import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public class ajf {
   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a(
                                    "raid"
                                 )
                                 .requires($$0x -> $$0x.c(3)))
                              .then(
                                 dv.a("start")
                                    .then(
                                       dv.a("omenlvl", IntegerArgumentType.integer(0))
                                          .executes($$0x -> b((du)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "omenlvl")))
                                    )
                              ))
                           .then(dv.a("stop").executes($$0x -> c((du)$$0x.getSource()))))
                        .then(dv.a("check").executes($$0x -> d((du)$$0x.getSource()))))
                     .then(dv.a("sound").then(dv.a("type", ec.a()).executes($$0x -> a((du)$$0x.getSource(), ec.a($$0x, "type"))))))
                  .then(dv.a("spawnleader").executes($$0x -> b((du)$$0x.getSource()))))
               .then(
                  dv.a("setomen")
                     .then(
                        dv.a("level", IntegerArgumentType.integer(0)).executes($$0x -> a((du)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "level")))
                     )
               ))
            .then(dv.a("glow").executes($$0x -> a((du)$$0x.getSource())))
      );
   }

   private static int a(du $$0) throws CommandSyntaxException {
      cet $$1 = a($$0.i());
      if ($$1 != null) {
         for (ceu $$3 : $$1.h()) {
            $$3.b(new bjv(bjx.x, 1000, 1));
         }
      }

      return 1;
   }

   private static int a(du $$0, int $$1) throws CommandSyntaxException {
      cet $$2 = a($$0.i());
      if ($$2 != null) {
         int $$3 = $$2.l();
         if ($$1 > $$3) {
            $$0.b(ur.b("Sorry, the max bad omen level you can set is " + $$3));
         } else {
            int $$4 = $$2.m();
            $$2.a($$1);
            $$0.a(() -> ur.b("Changed village's bad omen level from " + $$4 + " to " + $$1), false);
         }
      } else {
         $$0.b(ur.b("No raid found here"));
      }

      return 1;
   }

   private static int b(du $$0) {
      $$0.a(() -> ur.b("Spawned a raid captain"), false);
      ceu $$1 = bkm.ay.a((crs)$$0.f());
      if ($$1 == null) {
         $$0.b(ur.b("Pillager failed to spawn"));
         return 0;
      } else {
         $$1.w(true);
         $$1.a(bkn.f, cet.s());
         $$1.e($$0.e().c, $$0.e().d, $$0.e().e);
         $$1.a($$0.f(), $$0.f().d_(ht.a($$0.e())), blc.n, null, null);
         $$0.f().a_($$1);
         return 1;
      }
   }

   private static int a(du $$0, @Nullable ur $$1) {
      if ($$1 != null && $$1.getString().equals("local")) {
         ama $$2 = $$0.f();
         eji $$3 = $$0.e().b(5.0, 0.0, 0.0);
         $$2.a(null, $$3.c, $$3.d, $$3.e, aqn.tt, aqo.g, 2.0F, 1.0F, $$2.z.g());
      }

      return 1;
   }

   private static int b(du $$0, int $$1) throws CommandSyntaxException {
      amb $$2 = $$0.i();
      ht $$3 = $$2.dl();
      if ($$2.x().d($$3)) {
         $$0.b(ur.b("Raid already started close by"));
         return -1;
      } else {
         cev $$4 = $$2.x().x();
         cet $$5 = $$4.a($$2);
         if ($$5 != null) {
            $$5.a($$1);
            $$4.c();
            $$0.a(() -> ur.b("Created a raid in your local village"), false);
         } else {
            $$0.b(ur.b("Failed to create a raid in your local village"));
         }

         return 1;
      }
   }

   private static int c(du $$0) throws CommandSyntaxException {
      amb $$1 = $$0.i();
      ht $$2 = $$1.dl();
      cet $$3 = $$1.x().c($$2);
      if ($$3 != null) {
         $$3.n();
         $$0.a(() -> ur.b("Stopped raid"), false);
         return 1;
      } else {
         $$0.b(ur.b("No raid here"));
         return -1;
      }
   }

   private static int d(du $$0) throws CommandSyntaxException {
      cet $$1 = a($$0.i());
      if ($$1 != null) {
         StringBuilder $$2 = new StringBuilder();
         $$2.append("Found a started raid! ");
         $$0.a(() -> ur.b($$2.toString()), false);
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
         $$0.a(() -> ur.b($$3.toString()), false);
         return 1;
      } else {
         $$0.b(ur.b("Found no started raids"));
         return 0;
      }
   }

   @Nullable
   private static cet a(amb $$0) {
      return $$0.x().c($$0.dl());
   }
}
