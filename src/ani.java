import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public class ani {
   public static void a(CommandDispatcher<ed> $$0, dz $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a(
                                    "raid"
                                 )
                                 .requires($$0x -> $$0x.c(3)))
                              .then(
                                 ee.a("start")
                                    .then(
                                       ee.a("omenlvl", IntegerArgumentType.integer(0))
                                          .executes($$0x -> b((ed)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "omenlvl")))
                                    )
                              ))
                           .then(ee.a("stop").executes($$0x -> c((ed)$$0x.getSource()))))
                        .then(ee.a("check").executes($$0x -> d((ed)$$0x.getSource()))))
                     .then(ee.a("sound").then(ee.a("type", em.a($$1)).executes($$0x -> a((ed)$$0x.getSource(), em.a($$0x, "type"))))))
                  .then(ee.a("spawnleader").executes($$0x -> b((ed)$$0x.getSource()))))
               .then(
                  ee.a("setomen")
                     .then(
                        ee.a("level", IntegerArgumentType.integer(0)).executes($$0x -> a((ed)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "level")))
                     )
               ))
            .then(ee.a("glow").executes($$0x -> a((ed)$$0x.getSource())))
      );
   }

   private static int a(ed $$0) throws CommandSyntaxException {
      cms $$1 = a($$0.h());
      if ($$1 != null) {
         for (cmt $$3 : $$1.h()) {
            $$3.b(new bqt(bqv.x, 1000, 1));
         }
      }

      return 1;
   }

   private static int a(ed $$0, int $$1) throws CommandSyntaxException {
      cms $$2 = a($$0.h());
      if ($$2 != null) {
         int $$3 = $$2.l();
         if ($$1 > $$3) {
            $$0.b(wu.b("Sorry, the max bad omen level you can set is " + $$3));
         } else {
            int $$4 = $$2.m();
            $$2.a($$1);
            $$0.a(() -> wu.b("Changed village's bad omen level from " + $$4 + " to " + $$1), false);
         }
      } else {
         $$0.b(wu.b("No raid found here"));
      }

      return 1;
   }

   private static int b(ed $$0) {
      $$0.a(() -> wu.b("Spawned a raid captain"), false);
      cmt $$1 = brn.aB.a((dad)$$0.e());
      if ($$1 == null) {
         $$0.b(wu.b("Pillager failed to spawn"));
         return 0;
      } else {
         $$1.w(true);
         $$1.a(bro.f, cms.a($$0.v().b(le.d)));
         $$1.a_($$0.d().c, $$0.d().d, $$0.d().e);
         $$1.a($$0.e(), $$0.e().d_(in.a($$0.d())), bse.n, null);
         $$0.e().a_($$1);
         return 1;
      }
   }

   private static int a(ed $$0, @Nullable wu $$1) {
      if ($$1 != null && $$1.getString().equals("local")) {
         aqh $$2 = $$0.e();
         etp $$3 = $$0.d().b(5.0, 0.0, 0.0);
         $$2.a(null, $$3.c, $$3.d, $$3.e, avc.uO, avd.g, 2.0F, 1.0F, $$2.z.g());
      }

      return 1;
   }

   private static int b(ed $$0, int $$1) throws CommandSyntaxException {
      aqi $$2 = $$0.h();
      in $$3 = $$2.dn();
      if ($$2.z().e($$3)) {
         $$0.b(wu.b("Raid already started close by"));
         return -1;
      } else {
         cmu $$4 = $$2.z().z();
         cms $$5 = $$4.a($$2);
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

   private static int c(ed $$0) throws CommandSyntaxException {
      aqi $$1 = $$0.h();
      in $$2 = $$1.dn();
      cms $$3 = $$1.z().d($$2);
      if ($$3 != null) {
         $$3.n();
         $$0.a(() -> wu.b("Stopped raid"), false);
         return 1;
      } else {
         $$0.b(wu.b("No raid here"));
         return -1;
      }
   }

   private static int d(ed $$0) throws CommandSyntaxException {
      cms $$1 = a($$0.h());
      if ($$1 != null) {
         StringBuilder $$2 = new StringBuilder();
         $$2.append("Found a started raid! ");
         $$0.a(() -> wu.b($$2.toString()), false);
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
         $$0.a(() -> wu.b($$3.toString()), false);
         return 1;
      } else {
         $$0.b(wu.b("Found no started raids"));
         return 0;
      }
   }

   @Nullable
   private static cms a(aqi $$0) {
      return $$0.z().d($$0.dn());
   }
}
