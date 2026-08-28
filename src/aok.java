import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public class aok {
   public static void a(CommandDispatcher<ev> $$0, er $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a(
                                    "raid"
                                 )
                                 .requires($$0x -> $$0x.c(3)))
                              .then(
                                 ew.a("start")
                                    .then(
                                       ew.a("omenlvl", IntegerArgumentType.integer(0))
                                          .executes($$0x -> b((ev)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "omenlvl")))
                                    )
                              ))
                           .then(ew.a("stop").executes($$0x -> c((ev)$$0x.getSource()))))
                        .then(ew.a("check").executes($$0x -> d((ev)$$0x.getSource()))))
                     .then(ew.a("sound").then(ew.a("type", fe.a($$1)).executes($$0x -> a((ev)$$0x.getSource(), fe.a($$0x, "type"))))))
                  .then(ew.a("spawnleader").executes($$0x -> b((ev)$$0x.getSource()))))
               .then(
                  ew.a("setomen")
                     .then(
                        ew.a("level", IntegerArgumentType.integer(0)).executes($$0x -> a((ev)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "level")))
                     )
               ))
            .then(ew.a("glow").executes($$0x -> a((ev)$$0x.getSource())))
      );
   }

   private static int a(ev $$0) throws CommandSyntaxException {
      cpv $$1 = a($$0.h());
      if ($$1 != null) {
         for (cpw $$3 : $$1.h()) {
            $$3.a(new bte(btg.x, 1000, 1));
         }
      }

      return 1;
   }

   private static int a(ev $$0, int $$1) throws CommandSyntaxException {
      cpv $$2 = a($$0.h());
      if ($$2 != null) {
         int $$3 = $$2.l();
         if ($$1 > $$3) {
            $$0.b(xh.b("Sorry, the max raid omen level you can set is " + $$3));
         } else {
            int $$4 = $$2.m();
            $$2.a($$1);
            $$0.a(() -> xh.b("Changed village's raid omen level from " + $$4 + " to " + $$1), false);
         }
      } else {
         $$0.b(xh.b("No raid found here"));
      }

      return 1;
   }

   private static int b(ev $$0) {
      $$0.a(() -> xh.b("Spawned a raid captain"), false);
      cpw $$1 = bug.aC.a($$0.e(), buf.n);
      if ($$1 == null) {
         $$0.b(xh.b("Pillager failed to spawn"));
         return 0;
      } else {
         $$1.x(true);
         $$1.a(buh.f, cpv.a($$0.v().e(ly.d)));
         $$1.a_($$0.d().d, $$0.d().e, $$0.d().f);
         $$1.a($$0.e(), $$0.e().d_(jg.a((jz)$$0.d())), buf.n, null);
         $$0.e().a_($$1);
         return 1;
      }
   }

   private static int a(ev $$0, @Nullable xh $$1) {
      if ($$1 != null && $$1.getString().equals("local")) {
         arm $$2 = $$0.e();
         ezh $$3 = $$0.d().b(5.0, 0.0, 0.0);
         $$2.a(null, $$3.d, $$3.e, $$3.f, awk.vb, awl.g, 2.0F, 1.0F, $$2.A.g());
      }

      return 1;
   }

   private static int b(ev $$0, int $$1) throws CommandSyntaxException {
      arn $$2 = $$0.h();
      jg $$3 = $$2.dx();
      if ($$2.B().e($$3)) {
         $$0.b(xh.b("Raid already started close by"));
         return -1;
      } else {
         cpx $$4 = $$2.B().z();
         cpv $$5 = $$4.a($$2, $$2.dx());
         if ($$5 != null) {
            $$5.a($$1);
            $$4.c();
            $$0.a(() -> xh.b("Created a raid in your local village"), false);
         } else {
            $$0.b(xh.b("Failed to create a raid in your local village"));
         }

         return 1;
      }
   }

   private static int c(ev $$0) throws CommandSyntaxException {
      arn $$1 = $$0.h();
      jg $$2 = $$1.dx();
      cpv $$3 = $$1.B().d($$2);
      if ($$3 != null) {
         $$3.n();
         $$0.a(() -> xh.b("Stopped raid"), false);
         return 1;
      } else {
         $$0.b(xh.b("No raid here"));
         return -1;
      }
   }

   private static int d(ev $$0) throws CommandSyntaxException {
      cpv $$1 = a($$0.h());
      if ($$1 != null) {
         StringBuilder $$2 = new StringBuilder();
         $$2.append("Found a started raid! ");
         $$0.a(() -> xh.b($$2.toString()), false);
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
         $$0.a(() -> xh.b($$3.toString()), false);
         return 1;
      } else {
         $$0.b(xh.b("Found no started raids"));
         return 0;
      }
   }

   @Nullable
   private static cpv a(arn $$0) {
      return $$0.B().d($$0.dx());
   }
}
