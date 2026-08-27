import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public class akd {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a(
                                    "raid"
                                 )
                                 .requires($$0x -> $$0x.c(3)))
                              .then(
                                 dt.a("start")
                                    .then(
                                       dt.a("omenlvl", IntegerArgumentType.integer(0))
                                          .executes($$0x -> b((ds)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "omenlvl")))
                                    )
                              ))
                           .then(dt.a("stop").executes($$0x -> c((ds)$$0x.getSource()))))
                        .then(dt.a("check").executes($$0x -> d((ds)$$0x.getSource()))))
                     .then(dt.a("sound").then(dt.a("type", eb.a()).executes($$0x -> a((ds)$$0x.getSource(), eb.a($$0x, "type"))))))
                  .then(dt.a("spawnleader").executes($$0x -> b((ds)$$0x.getSource()))))
               .then(
                  dt.a("setomen")
                     .then(
                        dt.a("level", IntegerArgumentType.integer(0)).executes($$0x -> a((ds)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "level")))
                     )
               ))
            .then(dt.a("glow").executes($$0x -> a((ds)$$0x.getSource())))
      );
   }

   private static int a(ds $$0) throws CommandSyntaxException {
      cgj $$1 = a($$0.h());
      if ($$1 != null) {
         for (cgk $$3 : $$1.h()) {
            $$3.b(new blc(ble.x, 1000, 1));
         }
      }

      return 1;
   }

   private static int a(ds $$0, int $$1) throws CommandSyntaxException {
      cgj $$2 = a($$0.h());
      if ($$2 != null) {
         int $$3 = $$2.l();
         if ($$1 > $$3) {
            $$0.b(vd.b("Sorry, the max bad omen level you can set is " + $$3));
         } else {
            int $$4 = $$2.m();
            $$2.a($$1);
            $$0.a(() -> vd.b("Changed village's bad omen level from " + $$4 + " to " + $$1), false);
         }
      } else {
         $$0.b(vd.b("No raid found here"));
      }

      return 1;
   }

   private static int b(ds $$0) {
      $$0.a(() -> vd.b("Spawned a raid captain"), false);
      cgk $$1 = blt.az.a((cti)$$0.e());
      if ($$1 == null) {
         $$0.b(vd.b("Pillager failed to spawn"));
         return 0;
      } else {
         $$1.w(true);
         $$1.a(blu.f, cgj.s());
         $$1.a_($$0.d().c, $$0.d().d, $$0.d().e);
         $$1.a($$0.e(), $$0.e().d_(hx.a($$0.d())), bmj.n, null, null);
         $$0.e().a_($$1);
         return 1;
      }
   }

   private static int a(ds $$0, @Nullable vd $$1) {
      if ($$1 != null && $$1.getString().equals("local")) {
         amz $$2 = $$0.e();
         elm $$3 = $$0.d().b(5.0, 0.0, 0.0);
         $$2.a(null, $$3.c, $$3.d, $$3.e, arm.uf, arn.g, 2.0F, 1.0F, $$2.z.g());
      }

      return 1;
   }

   private static int b(ds $$0, int $$1) throws CommandSyntaxException {
      ana $$2 = $$0.h();
      hx $$3 = $$2.dm();
      if ($$2.z().e($$3)) {
         $$0.b(vd.b("Raid already started close by"));
         return -1;
      } else {
         cgl $$4 = $$2.z().z();
         cgj $$5 = $$4.a($$2);
         if ($$5 != null) {
            $$5.a($$1);
            $$4.c();
            $$0.a(() -> vd.b("Created a raid in your local village"), false);
         } else {
            $$0.b(vd.b("Failed to create a raid in your local village"));
         }

         return 1;
      }
   }

   private static int c(ds $$0) throws CommandSyntaxException {
      ana $$1 = $$0.h();
      hx $$2 = $$1.dm();
      cgj $$3 = $$1.z().d($$2);
      if ($$3 != null) {
         $$3.n();
         $$0.a(() -> vd.b("Stopped raid"), false);
         return 1;
      } else {
         $$0.b(vd.b("No raid here"));
         return -1;
      }
   }

   private static int d(ds $$0) throws CommandSyntaxException {
      cgj $$1 = a($$0.h());
      if ($$1 != null) {
         StringBuilder $$2 = new StringBuilder();
         $$2.append("Found a started raid! ");
         $$0.a(() -> vd.b($$2.toString()), false);
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
         $$0.a(() -> vd.b($$3.toString()), false);
         return 1;
      } else {
         $$0.b(vd.b("Found no started raids"));
         return 0;
      }
   }

   @Nullable
   private static cgj a(ana $$0) {
      return $$0.z().d($$0.dm());
   }
}
