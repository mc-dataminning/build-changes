import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public class aol {
   public static void a(CommandDispatcher<ew> $$0, es $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a(
                                    "raid"
                                 )
                                 .requires($$0x -> $$0x.c(3)))
                              .then(
                                 ex.a("start")
                                    .then(
                                       ex.a("omenlvl", IntegerArgumentType.integer(0))
                                          .executes($$0x -> b((ew)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "omenlvl")))
                                    )
                              ))
                           .then(ex.a("stop").executes($$0x -> c((ew)$$0x.getSource()))))
                        .then(ex.a("check").executes($$0x -> d((ew)$$0x.getSource()))))
                     .then(ex.a("sound").then(ex.a("type", ff.a($$1)).executes($$0x -> a((ew)$$0x.getSource(), ff.a($$0x, "type"))))))
                  .then(ex.a("spawnleader").executes($$0x -> b((ew)$$0x.getSource()))))
               .then(
                  ex.a("setomen")
                     .then(
                        ex.a("level", IntegerArgumentType.integer(0)).executes($$0x -> a((ew)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "level")))
                     )
               ))
            .then(ex.a("glow").executes($$0x -> a((ew)$$0x.getSource())))
      );
   }

   private static int a(ew $$0) throws CommandSyntaxException {
      cqa $$1 = a($$0.h());
      if ($$1 != null) {
         for (cqb $$3 : $$1.h()) {
            $$3.a(new btj(btl.x, 1000, 1));
         }
      }

      return 1;
   }

   private static int a(ew $$0, int $$1) throws CommandSyntaxException {
      cqa $$2 = a($$0.h());
      if ($$2 != null) {
         int $$3 = $$2.l();
         if ($$1 > $$3) {
            $$0.b(xi.b("Sorry, the max raid omen level you can set is " + $$3));
         } else {
            int $$4 = $$2.m();
            $$2.a($$1);
            $$0.a(() -> xi.b("Changed village's raid omen level from " + $$4 + " to " + $$1), false);
         }
      } else {
         $$0.b(xi.b("No raid found here"));
      }

      return 1;
   }

   private static int b(ew $$0) {
      $$0.a(() -> xi.b("Spawned a raid captain"), false);
      cqb $$1 = bul.aC.a($$0.e(), buk.n);
      if ($$1 == null) {
         $$0.b(xi.b("Pillager failed to spawn"));
         return 0;
      } else {
         $$1.x(true);
         $$1.a(bum.f, cqa.a($$0.v().e(lz.d)));
         $$1.a_($$0.d().d, $$0.d().e, $$0.d().f);
         $$1.a($$0.e(), $$0.e().d_(jh.a((ka)$$0.d())), buk.n, null);
         $$0.e().a_($$1);
         return 1;
      }
   }

   private static int a(ew $$0, @Nullable xi $$1) {
      if ($$1 != null && $$1.getString().equals("local")) {
         arn $$2 = $$0.e();
         ezn $$3 = $$0.d().b(5.0, 0.0, 0.0);
         $$2.a(null, $$3.d, $$3.e, $$3.f, awl.vb, awm.g, 2.0F, 1.0F, $$2.A.g());
      }

      return 1;
   }

   private static int b(ew $$0, int $$1) throws CommandSyntaxException {
      aro $$2 = $$0.h();
      jh $$3 = $$2.dx();
      if ($$2.B().e($$3)) {
         $$0.b(xi.b("Raid already started close by"));
         return -1;
      } else {
         cqc $$4 = $$2.B().z();
         cqa $$5 = $$4.a($$2, $$2.dx());
         if ($$5 != null) {
            $$5.a($$1);
            $$4.c();
            $$0.a(() -> xi.b("Created a raid in your local village"), false);
         } else {
            $$0.b(xi.b("Failed to create a raid in your local village"));
         }

         return 1;
      }
   }

   private static int c(ew $$0) throws CommandSyntaxException {
      aro $$1 = $$0.h();
      jh $$2 = $$1.dx();
      cqa $$3 = $$1.B().d($$2);
      if ($$3 != null) {
         $$3.n();
         $$0.a(() -> xi.b("Stopped raid"), false);
         return 1;
      } else {
         $$0.b(xi.b("No raid here"));
         return -1;
      }
   }

   private static int d(ew $$0) throws CommandSyntaxException {
      cqa $$1 = a($$0.h());
      if ($$1 != null) {
         StringBuilder $$2 = new StringBuilder();
         $$2.append("Found a started raid! ");
         $$0.a(() -> xi.b($$2.toString()), false);
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
         $$0.a(() -> xi.b($$3.toString()), false);
         return 1;
      } else {
         $$0.b(xi.b("Found no started raids"));
         return 0;
      }
   }

   @Nullable
   private static cqa a(aro $$0) {
      return $$0.B().d($$0.dx());
   }
}
