import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public class aoh {
   public static void a(CommandDispatcher<eu> $$0, eq $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a(
                                    "raid"
                                 )
                                 .requires($$0x -> $$0x.c(3)))
                              .then(
                                 ev.a("start")
                                    .then(
                                       ev.a("omenlvl", IntegerArgumentType.integer(0))
                                          .executes($$0x -> b((eu)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "omenlvl")))
                                    )
                              ))
                           .then(ev.a("stop").executes($$0x -> c((eu)$$0x.getSource()))))
                        .then(ev.a("check").executes($$0x -> d((eu)$$0x.getSource()))))
                     .then(ev.a("sound").then(ev.a("type", fd.a($$1)).executes($$0x -> a((eu)$$0x.getSource(), fd.a($$0x, "type"))))))
                  .then(ev.a("spawnleader").executes($$0x -> b((eu)$$0x.getSource()))))
               .then(
                  ev.a("setomen")
                     .then(
                        ev.a("level", IntegerArgumentType.integer(0)).executes($$0x -> a((eu)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "level")))
                     )
               ))
            .then(ev.a("glow").executes($$0x -> a((eu)$$0x.getSource())))
      );
   }

   private static int a(eu $$0) throws CommandSyntaxException {
      cpl $$1 = a($$0.h());
      if ($$1 != null) {
         for (cpm $$3 : $$1.h()) {
            $$3.a(new bsy(bta.x, 1000, 1));
         }
      }

      return 1;
   }

   private static int a(eu $$0, int $$1) throws CommandSyntaxException {
      cpl $$2 = a($$0.h());
      if ($$2 != null) {
         int $$3 = $$2.l();
         if ($$1 > $$3) {
            $$0.b(xe.b("Sorry, the max raid omen level you can set is " + $$3));
         } else {
            int $$4 = $$2.m();
            $$2.a($$1);
            $$0.a(() -> xe.b("Changed village's raid omen level from " + $$4 + " to " + $$1), false);
         }
      } else {
         $$0.b(xe.b("No raid found here"));
      }

      return 1;
   }

   private static int b(eu $$0) {
      $$0.a(() -> xe.b("Spawned a raid captain"), false);
      cpm $$1 = bty.aC.a($$0.e(), btx.n);
      if ($$1 == null) {
         $$0.b(xe.b("Pillager failed to spawn"));
         return 0;
      } else {
         $$1.x(true);
         $$1.a(btz.f, cpl.a($$0.v().e(lw.d)));
         $$1.a_($$0.d().d, $$0.d().e, $$0.d().f);
         $$1.a($$0.e(), $$0.e().d_(jf.a((jy)$$0.d())), btx.n, null);
         $$0.e().a_($$1);
         return 1;
      }
   }

   private static int a(eu $$0, @Nullable xe $$1) {
      if ($$1 != null && $$1.getString().equals("local")) {
         arj $$2 = $$0.e();
         eyw $$3 = $$0.d().b(5.0, 0.0, 0.0);
         $$2.a(null, $$3.d, $$3.e, $$3.f, awg.vd, awh.g, 2.0F, 1.0F, $$2.z.g());
      }

      return 1;
   }

   private static int b(eu $$0, int $$1) throws CommandSyntaxException {
      ark $$2 = $$0.h();
      jf $$3 = $$2.ds();
      if ($$2.B().e($$3)) {
         $$0.b(xe.b("Raid already started close by"));
         return -1;
      } else {
         cpn $$4 = $$2.B().z();
         cpl $$5 = $$4.a($$2, $$2.ds());
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

   private static int c(eu $$0) throws CommandSyntaxException {
      ark $$1 = $$0.h();
      jf $$2 = $$1.ds();
      cpl $$3 = $$1.B().d($$2);
      if ($$3 != null) {
         $$3.n();
         $$0.a(() -> xe.b("Stopped raid"), false);
         return 1;
      } else {
         $$0.b(xe.b("No raid here"));
         return -1;
      }
   }

   private static int d(eu $$0) throws CommandSyntaxException {
      cpl $$1 = a($$0.h());
      if ($$1 != null) {
         StringBuilder $$2 = new StringBuilder();
         $$2.append("Found a started raid! ");
         $$0.a(() -> xe.b($$2.toString()), false);
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
         $$0.a(() -> xe.b($$3.toString()), false);
         return 1;
      } else {
         $$0.b(xe.b("Found no started raids"));
         return 0;
      }
   }

   @Nullable
   private static cpl a(ark $$0) {
      return $$0.B().d($$0.ds());
   }
}
