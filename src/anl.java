import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public class anl {
   public static void a(CommandDispatcher<eq> $$0, em $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a(
                                    "raid"
                                 )
                                 .requires($$0x -> $$0x.c(3)))
                              .then(
                                 er.a("start")
                                    .then(
                                       er.a("omenlvl", IntegerArgumentType.integer(0))
                                          .executes($$0x -> b((eq)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "omenlvl")))
                                    )
                              ))
                           .then(er.a("stop").executes($$0x -> c((eq)$$0x.getSource()))))
                        .then(er.a("check").executes($$0x -> d((eq)$$0x.getSource()))))
                     .then(er.a("sound").then(er.a("type", ez.a($$1)).executes($$0x -> a((eq)$$0x.getSource(), ez.a($$0x, "type"))))))
                  .then(er.a("spawnleader").executes($$0x -> b((eq)$$0x.getSource()))))
               .then(
                  er.a("setomen")
                     .then(
                        er.a("level", IntegerArgumentType.integer(0)).executes($$0x -> a((eq)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "level")))
                     )
               ))
            .then(er.a("glow").executes($$0x -> a((eq)$$0x.getSource())))
      );
   }

   private static int a(eq $$0) throws CommandSyntaxException {
      cns $$1 = a($$0.h());
      if ($$1 != null) {
         for (cnt $$3 : $$1.h()) {
            $$3.b(new brl(brn.x, 1000, 1));
         }
      }

      return 1;
   }

   private static int a(eq $$0, int $$1) throws CommandSyntaxException {
      cns $$2 = a($$0.h());
      if ($$2 != null) {
         int $$3 = $$2.l();
         if ($$1 > $$3) {
            $$0.b(wu.b("Sorry, the max raid omen level you can set is " + $$3));
         } else {
            int $$4 = $$2.m();
            $$2.a($$1);
            $$0.a(() -> wu.b("Changed village's raid omen level from " + $$4 + " to " + $$1), false);
         }
      } else {
         $$0.b(wu.b("No raid found here"));
      }

      return 1;
   }

   private static int b(eq $$0) {
      $$0.a(() -> wu.b("Spawned a raid captain"), false);
      cnt $$1 = bsj.aC.a((dcd)$$0.e());
      if ($$1 == null) {
         $$0.b(wu.b("Pillager failed to spawn"));
         return 0;
      } else {
         $$1.w(true);
         $$1.a(bsk.f, cns.a($$0.v().b(lr.d)));
         $$1.a_($$0.d().c, $$0.d().d, $$0.d().e);
         $$1.a($$0.e(), $$0.e().d_(ja.a($$0.d())), btc.n, null);
         $$0.e().a_($$1);
         return 1;
      }
   }

   private static int a(eq $$0, @Nullable wu $$1) {
      if ($$1 != null && $$1.getString().equals("local")) {
         aqk $$2 = $$0.e();
         evz $$3 = $$0.d().b(5.0, 0.0, 0.0);
         $$2.a(null, $$3.c, $$3.d, $$3.e, avf.vc, avg.g, 2.0F, 1.0F, $$2.z.g());
      }

      return 1;
   }

   private static int b(eq $$0, int $$1) throws CommandSyntaxException {
      aql $$2 = $$0.h();
      ja $$3 = $$2.dp();
      if ($$2.z().e($$3)) {
         $$0.b(wu.b("Raid already started close by"));
         return -1;
      } else {
         cnu $$4 = $$2.z().z();
         cns $$5 = $$4.a($$2, $$2.dp());
         if ($$5 != null) {
            $$5.a($$1);
            $$4.c();
            $$0.a(() -> wu.b("Created a raid in your local village"), false);
         } else {
            $$0.b(wu.b("Failed to create a raid in your local village"));
         }

         return 1;
      }
   }

   private static int c(eq $$0) throws CommandSyntaxException {
      aql $$1 = $$0.h();
      ja $$2 = $$1.dp();
      cns $$3 = $$1.z().d($$2);
      if ($$3 != null) {
         $$3.n();
         $$0.a(() -> wu.b("Stopped raid"), false);
         return 1;
      } else {
         $$0.b(wu.b("No raid here"));
         return -1;
      }
   }

   private static int d(eq $$0) throws CommandSyntaxException {
      cns $$1 = a($$0.h());
      if ($$1 != null) {
         StringBuilder $$2 = new StringBuilder();
         $$2.append("Found a started raid! ");
         $$0.a(() -> wu.b($$2.toString()), false);
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
         $$0.a(() -> wu.b($$3.toString()), false);
         return 1;
      } else {
         $$0.b(wu.b("Found no started raids"));
         return 0;
      }
   }

   @Nullable
   private static cns a(aql $$0) {
      return $$0.z().d($$0.dp());
   }
}
