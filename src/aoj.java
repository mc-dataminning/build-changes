import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public class aoj {
   public static void a(CommandDispatcher<ei> $$0, ee $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a(
                                    "raid"
                                 )
                                 .requires($$0x -> $$0x.c(3)))
                              .then(
                                 ej.a("start")
                                    .then(
                                       ej.a("omenlvl", IntegerArgumentType.integer(0))
                                          .executes($$0x -> b((ei)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "omenlvl")))
                                    )
                              ))
                           .then(ej.a("stop").executes($$0x -> c((ei)$$0x.getSource()))))
                        .then(ej.a("check").executes($$0x -> d((ei)$$0x.getSource()))))
                     .then(ej.a("sound").then(ej.a("type", er.a($$1)).executes($$0x -> a((ei)$$0x.getSource(), er.a($$0x, "type"))))))
                  .then(ej.a("spawnleader").executes($$0x -> b((ei)$$0x.getSource()))))
               .then(
                  ej.a("setomen")
                     .then(
                        ej.a("level", IntegerArgumentType.integer(0)).executes($$0x -> a((ei)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "level")))
                     )
               ))
            .then(ej.a("glow").executes($$0x -> a((ei)$$0x.getSource())))
      );
   }

   private static int a(ei $$0) throws CommandSyntaxException {
      csh $$1 = a($$0.h());
      if ($$1 != null) {
         for (csi $$3 : $$1.h()) {
            $$3.a(new bve(bvg.x, 1000, 1));
         }
      }

      return 1;
   }

   private static int a(ei $$0, int $$1) throws CommandSyntaxException {
      csh $$2 = a($$0.h());
      if ($$2 != null) {
         int $$3 = $$2.l();
         if ($$1 > $$3) {
            $$0.b(ww.b("Sorry, the max raid omen level you can set is " + $$3));
         } else {
            int $$4 = $$2.m();
            $$2.a($$1);
            $$0.a(() -> ww.b("Changed village's raid omen level from " + $$4 + " to " + $$1), false);
         }
      } else {
         $$0.b(ww.b("No raid found here"));
      }

      return 1;
   }

   private static int b(ei $$0) {
      $$0.a(() -> ww.b("Spawned a raid captain"), false);
      csi $$1 = bwj.aT.a($$0.e(), bwi.n);
      if ($$1 == null) {
         $$0.b(ww.b("Pillager failed to spawn"));
         return 0;
      } else {
         $$1.w(true);
         $$1.a(bwk.f, csh.a($$0.u().f(mg.aF)));
         $$1.a_($$0.d().d, $$0.d().e, $$0.d().f);
         $$1.a($$0.e(), $$0.e().d_(iu.a((jo)$$0.d())), bwi.n, null);
         $$0.e().a_($$1);
         return 1;
      }
   }

   private static int a(ei $$0, @Nullable ww $$1) {
      if ($$1 != null && $$1.getString().equals("local")) {
         aro $$2 = $$0.e();
         fdw $$3 = $$0.d().b(5.0, 0.0, 0.0);
         $$2.a(null, $$3.d, $$3.e, $$3.f, awl.vM, awm.g, 2.0F, 1.0F, $$2.A.g());
      }

      return 1;
   }

   private static int b(ei $$0, int $$1) throws CommandSyntaxException {
      arp $$2 = $$0.h();
      iu $$3 = $$2.dv();
      if ($$2.y().e($$3)) {
         $$0.b(ww.b("Raid already started close by"));
         return -1;
      } else {
         csj $$4 = $$2.y().B();
         csh $$5 = $$4.a($$2, $$2.dv());
         if ($$5 != null) {
            $$5.a($$1);
            $$4.g();
            $$0.a(() -> ww.b("Created a raid in your local village"), false);
         } else {
            $$0.b(ww.b("Failed to create a raid in your local village"));
         }

         return 1;
      }
   }

   private static int c(ei $$0) throws CommandSyntaxException {
      arp $$1 = $$0.h();
      iu $$2 = $$1.dv();
      csh $$3 = $$1.y().d($$2);
      if ($$3 != null) {
         $$3.n();
         $$0.a(() -> ww.b("Stopped raid"), false);
         return 1;
      } else {
         $$0.b(ww.b("No raid here"));
         return -1;
      }
   }

   private static int d(ei $$0) throws CommandSyntaxException {
      csh $$1 = a($$0.h());
      if ($$1 != null) {
         StringBuilder $$2 = new StringBuilder();
         $$2.append("Found a started raid! ");
         $$0.a(() -> ww.b($$2.toString()), false);
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
         $$0.a(() -> ww.b($$3.toString()), false);
         return 1;
      } else {
         $$0.b(ww.b("Found no started raids"));
         return 0;
      }
   }

   @Nullable
   private static csh a(arp $$0) {
      return $$0.y().d($$0.dv());
   }
}
