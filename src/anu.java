import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public class anu {
   public static void a(CommandDispatcher<eh> $$0, ed $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a(
                                    "raid"
                                 )
                                 .requires($$0x -> $$0x.c(3)))
                              .then(
                                 ei.a("start")
                                    .then(
                                       ei.a("omenlvl", IntegerArgumentType.integer(0))
                                          .executes($$0x -> b((eh)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "omenlvl")))
                                    )
                              ))
                           .then(ei.a("stop").executes($$0x -> c((eh)$$0x.getSource()))))
                        .then(ei.a("check").executes($$0x -> d((eh)$$0x.getSource()))))
                     .then(ei.a("sound").then(ei.a("type", eq.a($$1)).executes($$0x -> a((eh)$$0x.getSource(), eq.a($$0x, "type"))))))
                  .then(ei.a("spawnleader").executes($$0x -> b((eh)$$0x.getSource()))))
               .then(
                  ei.a("setomen")
                     .then(
                        ei.a("level", IntegerArgumentType.integer(0)).executes($$0x -> a((eh)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "level")))
                     )
               ))
            .then(ei.a("glow").executes($$0x -> a((eh)$$0x.getSource())))
      );
   }

   private static int a(eh $$0) throws CommandSyntaxException {
      cnm $$1 = a($$0.h());
      if ($$1 != null) {
         for (cnn $$3 : $$1.h()) {
            $$3.b(new brh(brj.x, 1000, 1));
         }
      }

      return 1;
   }

   private static int a(eh $$0, int $$1) throws CommandSyntaxException {
      cnm $$2 = a($$0.h());
      if ($$2 != null) {
         int $$3 = $$2.l();
         if ($$1 > $$3) {
            $$0.b(xe.b("Sorry, the max bad omen level you can set is " + $$3));
         } else {
            int $$4 = $$2.m();
            $$2.a($$1);
            $$0.a(() -> xe.b("Changed village's bad omen level from " + $$4 + " to " + $$1), false);
         }
      } else {
         $$0.b(xe.b("No raid found here"));
      }

      return 1;
   }

   private static int b(eh $$0) {
      $$0.a(() -> xe.b("Spawned a raid captain"), false);
      cnn $$1 = bsb.aD.a((dca)$$0.e());
      if ($$1 == null) {
         $$0.b(xe.b("Pillager failed to spawn"));
         return 0;
      } else {
         $$1.w(true);
         $$1.a(bsc.f, cnm.a($$0.v().b(li.d)));
         $$1.a_($$0.d().c, $$0.d().d, $$0.d().e);
         $$1.a($$0.e(), $$0.e().d_(ir.a($$0.d())), bss.n, null);
         $$0.e().a_($$1);
         return 1;
      }
   }

   private static int a(eh $$0, @Nullable xe $$1) {
      if ($$1 != null && $$1.getString().equals("local")) {
         aqt $$2 = $$0.e();
         ewu $$3 = $$0.d().b(5.0, 0.0, 0.0);
         $$2.a(null, $$3.c, $$3.d, $$3.e, avo.vx, avq.g, 2.0F, 1.0F, $$2.A.g());
      }

      return 1;
   }

   private static int b(eh $$0, int $$1) throws CommandSyntaxException {
      aqu $$2 = $$0.h();
      ir $$3 = $$2.du();
      if ($$2.B().e($$3)) {
         $$0.b(xe.b("Raid already started close by"));
         return -1;
      } else {
         cno $$4 = $$2.B().z();
         cnm $$5 = $$4.a($$2);
         if ($$5 != null) {
            $$5.a($$1);
            $$4.c();
            $$0.a(() -> xe.b("Created a raid in your local village"), false);
         } else {
            $$0.b(xe.b("Failed to create a raid in your local village"));
         }

         return 1;
      }
   }

   private static int c(eh $$0) throws CommandSyntaxException {
      aqu $$1 = $$0.h();
      ir $$2 = $$1.du();
      cnm $$3 = $$1.B().d($$2);
      if ($$3 != null) {
         $$3.n();
         $$0.a(() -> xe.b("Stopped raid"), false);
         return 1;
      } else {
         $$0.b(xe.b("No raid here"));
         return -1;
      }
   }

   private static int d(eh $$0) throws CommandSyntaxException {
      cnm $$1 = a($$0.h());
      if ($$1 != null) {
         StringBuilder $$2 = new StringBuilder();
         $$2.append("Found a started raid! ");
         $$0.a(() -> xe.b($$2.toString()), false);
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
         $$0.a(() -> xe.b($$3.toString()), false);
         return 1;
      } else {
         $$0.b(xe.b("Found no started raids"));
         return 0;
      }
   }

   @Nullable
   private static cnm a(aqu $$0) {
      return $$0.B().d($$0.du());
   }
}
