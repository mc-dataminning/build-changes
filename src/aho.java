import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public class aho {
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
                     .then(dt.a("sound").then(dt.a("type", dz.a()).executes($$0x -> a((ds)$$0x.getSource(), dz.a($$0x, "type"))))))
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
      ccs $$1 = a($$0.h());
      if ($$1 != null) {
         for (cct $$3 : $$1.h()) {
            $$3.b(new bht(bhv.x, 1000, 1));
         }
      }

      return 1;
   }

   private static int a(ds $$0, int $$1) throws CommandSyntaxException {
      ccs $$2 = a($$0.h());
      if ($$2 != null) {
         int $$3 = $$2.l();
         if ($$1 > $$3) {
            $$0.b(te.b("Sorry, the max bad omen level you can set is " + $$3));
         } else {
            int $$4 = $$2.m();
            $$2.a($$1);
            $$0.a(() -> te.b("Changed village's bad omen level from " + $$4 + " to " + $$1), false);
         }
      } else {
         $$0.b(te.b("No raid found here"));
      }

      return 1;
   }

   private static int b(ds $$0) {
      $$0.a(() -> te.b("Spawned a raid captain"), false);
      cct $$1 = bik.ay.a((cpk)$$0.e());
      if ($$1 == null) {
         $$0.b(te.b("Pillager failed to spawn"));
         return 0;
      } else {
         $$1.w(true);
         $$1.a(bil.f, ccs.s());
         $$1.e($$0.d().c, $$0.d().d, $$0.d().e);
         $$1.a($$0.e(), $$0.e().d_(gv.a($$0.d())), bja.n, null, null);
         $$0.e().a_($$1);
         return 1;
      }
   }

   private static int a(ds $$0, @Nullable te $$1) {
      if ($$1 != null && $$1.getString().equals("local")) {
         aki $$2 = $$0.e();
         ehf $$3 = $$0.d().b(5.0, 0.0, 0.0);
         $$2.a(null, $$3.c, $$3.d, $$3.e, aou.tp, aov.g, 2.0F, 1.0F, $$2.z.g());
      }

      return 1;
   }

   private static int b(ds $$0, int $$1) throws CommandSyntaxException {
      akj $$2 = $$0.h();
      gv $$3 = $$2.dk();
      if ($$2.x().d($$3)) {
         $$0.b(te.b("Raid already started close by"));
         return -1;
      } else {
         ccu $$4 = $$2.x().x();
         ccs $$5 = $$4.a($$2);
         if ($$5 != null) {
            $$5.a($$1);
            $$4.c();
            $$0.a(() -> te.b("Created a raid in your local village"), false);
         } else {
            $$0.b(te.b("Failed to create a raid in your local village"));
         }

         return 1;
      }
   }

   private static int c(ds $$0) throws CommandSyntaxException {
      akj $$1 = $$0.h();
      gv $$2 = $$1.dk();
      ccs $$3 = $$1.x().c($$2);
      if ($$3 != null) {
         $$3.n();
         $$0.a(() -> te.b("Stopped raid"), false);
         return 1;
      } else {
         $$0.b(te.b("No raid here"));
         return -1;
      }
   }

   private static int d(ds $$0) throws CommandSyntaxException {
      ccs $$1 = a($$0.h());
      if ($$1 != null) {
         StringBuilder $$2 = new StringBuilder();
         $$2.append("Found a started raid! ");
         $$0.a(() -> te.b($$2.toString()), false);
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
         $$0.a(() -> te.b($$3.toString()), false);
         return 1;
      } else {
         $$0.b(te.b("Found no started raids"));
         return 0;
      }
   }

   @Nullable
   private static ccs a(akj $$0) {
      return $$0.x().c($$0.dk());
   }
}
