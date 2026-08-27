import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public class amt {
   public static void a(CommandDispatcher<du> $$0, dq $$1) {
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
                     .then(dv.a("sound").then(dv.a("type", ed.a($$1)).executes($$0x -> a((du)$$0x.getSource(), ed.a($$0x, "type"))))))
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
      cle $$1 = a($$0.h());
      if ($$1 != null) {
         for (clf $$3 : $$1.h()) {
            $$3.b(new bph(bpj.x, 1000, 1));
         }
      }

      return 1;
   }

   private static int a(du $$0, int $$1) throws CommandSyntaxException {
      cle $$2 = a($$0.h());
      if ($$2 != null) {
         int $$3 = $$2.l();
         if ($$1 > $$3) {
            $$0.b(wg.b("Sorry, the max bad omen level you can set is " + $$3));
         } else {
            int $$4 = $$2.m();
            $$2.a($$1);
            $$0.a(() -> wg.b("Changed village's bad omen level from " + $$4 + " to " + $$1), false);
         }
      } else {
         $$0.b(wg.b("No raid found here"));
      }

      return 1;
   }

   private static int b(du $$0) {
      $$0.a(() -> wg.b("Spawned a raid captain"), false);
      clf $$1 = bqb.aB.a((cyx)$$0.e());
      if ($$1 == null) {
         $$0.b(wg.b("Pillager failed to spawn"));
         return 0;
      } else {
         $$1.w(true);
         $$1.a(bqc.f, cle.s());
         $$1.a_($$0.d().c, $$0.d().d, $$0.d().e);
         $$1.a($$0.e(), $$0.e().d_(ib.a($$0.d())), bqs.n, null);
         $$0.e().a_($$1);
         return 1;
      }
   }

   private static int a(du $$0, @Nullable wg $$1) {
      if ($$1 != null && $$1.getString().equals("local")) {
         aps $$2 = $$0.e();
         esa $$3 = $$0.d().b(5.0, 0.0, 0.0);
         $$2.a(null, $$3.c, $$3.d, $$3.e, aum.uG, aun.g, 2.0F, 1.0F, $$2.z.g());
      }

      return 1;
   }

   private static int b(du $$0, int $$1) throws CommandSyntaxException {
      apt $$2 = $$0.h();
      ib $$3 = $$2.dm();
      if ($$2.z().e($$3)) {
         $$0.b(wg.b("Raid already started close by"));
         return -1;
      } else {
         clg $$4 = $$2.z().z();
         cle $$5 = $$4.a($$2);
         if ($$5 != null) {
            $$5.a($$1);
            $$4.c();
            $$0.a(() -> wg.b("Created a raid in your local village"), false);
         } else {
            $$0.b(wg.b("Failed to create a raid in your local village"));
         }

         return 1;
      }
   }

   private static int c(du $$0) throws CommandSyntaxException {
      apt $$1 = $$0.h();
      ib $$2 = $$1.dm();
      cle $$3 = $$1.z().d($$2);
      if ($$3 != null) {
         $$3.n();
         $$0.a(() -> wg.b("Stopped raid"), false);
         return 1;
      } else {
         $$0.b(wg.b("No raid here"));
         return -1;
      }
   }

   private static int d(du $$0) throws CommandSyntaxException {
      cle $$1 = a($$0.h());
      if ($$1 != null) {
         StringBuilder $$2 = new StringBuilder();
         $$2.append("Found a started raid! ");
         $$0.a(() -> wg.b($$2.toString()), false);
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
         $$0.a(() -> wg.b($$3.toString()), false);
         return 1;
      } else {
         $$0.b(wg.b("Found no started raids"));
         return 0;
      }
   }

   @Nullable
   private static cle a(apt $$0) {
      return $$0.z().d($$0.dm());
   }
}
