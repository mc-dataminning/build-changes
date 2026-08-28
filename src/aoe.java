import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public class aoe {
   public static void a(CommandDispatcher<et> $$0, ep $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a(
                                    "raid"
                                 )
                                 .requires($$0x -> $$0x.c(3)))
                              .then(
                                 eu.a("start")
                                    .then(
                                       eu.a("omenlvl", IntegerArgumentType.integer(0))
                                          .executes($$0x -> b((et)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "omenlvl")))
                                    )
                              ))
                           .then(eu.a("stop").executes($$0x -> c((et)$$0x.getSource()))))
                        .then(eu.a("check").executes($$0x -> d((et)$$0x.getSource()))))
                     .then(eu.a("sound").then(eu.a("type", fc.a($$1)).executes($$0x -> a((et)$$0x.getSource(), fc.a($$0x, "type"))))))
                  .then(eu.a("spawnleader").executes($$0x -> b((et)$$0x.getSource()))))
               .then(
                  eu.a("setomen")
                     .then(
                        eu.a("level", IntegerArgumentType.integer(0)).executes($$0x -> a((et)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "level")))
                     )
               ))
            .then(eu.a("glow").executes($$0x -> a((et)$$0x.getSource())))
      );
   }

   private static int a(et $$0) throws CommandSyntaxException {
      cpc $$1 = a($$0.h());
      if ($$1 != null) {
         for (cpd $$3 : $$1.h()) {
            $$3.b(new bsq(bss.x, 1000, 1));
         }
      }

      return 1;
   }

   private static int a(et $$0, int $$1) throws CommandSyntaxException {
      cpc $$2 = a($$0.h());
      if ($$2 != null) {
         int $$3 = $$2.l();
         if ($$1 > $$3) {
            $$0.b(xd.b("Sorry, the max raid omen level you can set is " + $$3));
         } else {
            int $$4 = $$2.m();
            $$2.a($$1);
            $$0.a(() -> xd.b("Changed village's raid omen level from " + $$4 + " to " + $$1), false);
         }
      } else {
         $$0.b(xd.b("No raid found here"));
      }

      return 1;
   }

   private static int b(et $$0) {
      $$0.a(() -> xd.b("Spawned a raid captain"), false);
      cpd $$1 = btq.aC.a($$0.e(), btp.n);
      if ($$1 == null) {
         $$0.b(xd.b("Pillager failed to spawn"));
         return 0;
      } else {
         $$1.x(true);
         $$1.a(btr.f, cpc.a($$0.v().b(lv.d)));
         $$1.a_($$0.d().d, $$0.d().e, $$0.d().f);
         $$1.a($$0.e(), $$0.e().d_(je.a((jx)$$0.d())), btp.n, null);
         $$0.e().a_($$1);
         return 1;
      }
   }

   private static int a(et $$0, @Nullable xd $$1) {
      if ($$1 != null && $$1.getString().equals("local")) {
         arg $$2 = $$0.e();
         eye $$3 = $$0.d().b(5.0, 0.0, 0.0);
         $$2.a(null, $$3.d, $$3.e, $$3.f, awd.vd, awe.g, 2.0F, 1.0F, $$2.z.g());
      }

      return 1;
   }

   private static int b(et $$0, int $$1) throws CommandSyntaxException {
      arh $$2 = $$0.h();
      je $$3 = $$2.ds();
      if ($$2.B().e($$3)) {
         $$0.b(xd.b("Raid already started close by"));
         return -1;
      } else {
         cpe $$4 = $$2.B().z();
         cpc $$5 = $$4.a($$2, $$2.ds());
         if ($$5 != null) {
            $$5.a($$1);
            $$4.c();
            $$0.a(() -> xd.b("Created a raid in your local village"), false);
         } else {
            $$0.b(xd.b("Failed to create a raid in your local village"));
         }

         return 1;
      }
   }

   private static int c(et $$0) throws CommandSyntaxException {
      arh $$1 = $$0.h();
      je $$2 = $$1.ds();
      cpc $$3 = $$1.B().d($$2);
      if ($$3 != null) {
         $$3.n();
         $$0.a(() -> xd.b("Stopped raid"), false);
         return 1;
      } else {
         $$0.b(xd.b("No raid here"));
         return -1;
      }
   }

   private static int d(et $$0) throws CommandSyntaxException {
      cpc $$1 = a($$0.h());
      if ($$1 != null) {
         StringBuilder $$2 = new StringBuilder();
         $$2.append("Found a started raid! ");
         $$0.a(() -> xd.b($$2.toString()), false);
         StringBuilder $$3 = new StringBuilder();
         $$3.append("Num groups spawned: ");
         $$3.append($$1.k());
         $$3.append(" Raid omen level: ");
         $$3.append($$1.m());
         $$3.append(" Num mobs: ");
         $$3.append($$1.r());
         $$3.append(" Raid health: ");
         $$3.append($$1.q());
         $$3.append(" / ");
         $$3.append($$1.g());
         $$0.a(() -> xd.b($$3.toString()), false);
         return 1;
      } else {
         $$0.b(xd.b("Found no started raids"));
         return 0;
      }
   }

   @Nullable
   private static cpc a(arh $$0) {
      return $$0.B().d($$0.ds());
   }
}
