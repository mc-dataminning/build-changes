import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public class aof {
   public static void a(CommandDispatcher<ep> $$0, el $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a(
                                    "raid"
                                 )
                                 .requires($$0x -> $$0x.c(3)))
                              .then(
                                 eq.a("start")
                                    .then(
                                       eq.a("omenlvl", IntegerArgumentType.integer(0))
                                          .executes($$0x -> b((ep)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "omenlvl")))
                                    )
                              ))
                           .then(eq.a("stop").executes($$0x -> c((ep)$$0x.getSource()))))
                        .then(eq.a("check").executes($$0x -> d((ep)$$0x.getSource()))))
                     .then(eq.a("sound").then(eq.a("type", ey.a($$1)).executes($$0x -> a((ep)$$0x.getSource(), ey.a($$0x, "type"))))))
                  .then(eq.a("spawnleader").executes($$0x -> b((ep)$$0x.getSource()))))
               .then(
                  eq.a("setomen")
                     .then(
                        eq.a("level", IntegerArgumentType.integer(0)).executes($$0x -> a((ep)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "level")))
                     )
               ))
            .then(eq.a("glow").executes($$0x -> a((ep)$$0x.getSource())))
      );
   }

   private static int a(ep $$0) throws CommandSyntaxException {
      cog $$1 = a($$0.h());
      if ($$1 != null) {
         for (coh $$3 : $$1.h()) {
            $$3.b(new bsa(bsc.x, 1000, 1));
         }
      }

      return 1;
   }

   private static int a(ep $$0, int $$1) throws CommandSyntaxException {
      cog $$2 = a($$0.h());
      if ($$2 != null) {
         int $$3 = $$2.l();
         if ($$1 > $$3) {
            $$0.b(xo.b("Sorry, the max raid omen level you can set is " + $$3));
         } else {
            int $$4 = $$2.m();
            $$2.a($$1);
            $$0.a(() -> xo.b("Changed village's raid omen level from " + $$4 + " to " + $$1), false);
         }
      } else {
         $$0.b(xo.b("No raid found here"));
      }

      return 1;
   }

   private static int b(ep $$0) {
      $$0.a(() -> xo.b("Spawned a raid captain"), false);
      coh $$1 = bsy.aC.a((dbw)$$0.e());
      if ($$1 == null) {
         $$0.b(xo.b("Pillager failed to spawn"));
         return 0;
      } else {
         $$1.w(true);
         $$1.a(bsz.f, cog.a($$0.v().b(lq.d)));
         $$1.a_($$0.d().c, $$0.d().d, $$0.d().e);
         $$1.a($$0.e(), $$0.e().d_(iz.a($$0.d())), btr.n, null);
         $$0.e().a_($$1);
         return 1;
      }
   }

   private static int a(ep $$0, @Nullable xo $$1) {
      if ($$1 != null && $$1.getString().equals("local")) {
         are $$2 = $$0.e();
         evp $$3 = $$0.d().b(5.0, 0.0, 0.0);
         $$2.a(null, $$3.c, $$3.d, $$3.e, avz.uZ, awa.g, 2.0F, 1.0F, $$2.z.g());
      }

      return 1;
   }

   private static int b(ep $$0, int $$1) throws CommandSyntaxException {
      arf $$2 = $$0.h();
      iz $$3 = $$2.dp();
      if ($$2.z().e($$3)) {
         $$0.b(xo.b("Raid already started close by"));
         return -1;
      } else {
         coi $$4 = $$2.z().z();
         cog $$5 = $$4.a($$2, $$2.dp());
         if ($$5 != null) {
            $$5.a($$1);
            $$4.c();
            $$0.a(() -> xo.b("Created a raid in your local village"), false);
         } else {
            $$0.b(xo.b("Failed to create a raid in your local village"));
         }

         return 1;
      }
   }

   private static int c(ep $$0) throws CommandSyntaxException {
      arf $$1 = $$0.h();
      iz $$2 = $$1.dp();
      cog $$3 = $$1.z().d($$2);
      if ($$3 != null) {
         $$3.n();
         $$0.a(() -> xo.b("Stopped raid"), false);
         return 1;
      } else {
         $$0.b(xo.b("No raid here"));
         return -1;
      }
   }

   private static int d(ep $$0) throws CommandSyntaxException {
      cog $$1 = a($$0.h());
      if ($$1 != null) {
         StringBuilder $$2 = new StringBuilder();
         $$2.append("Found a started raid! ");
         $$0.a(() -> xo.b($$2.toString()), false);
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
         $$0.a(() -> xo.b($$3.toString()), false);
         return 1;
      } else {
         $$0.b(xo.b("Found no started raids"));
         return 0;
      }
   }

   @Nullable
   private static cog a(arf $$0) {
      return $$0.z().d($$0.dp());
   }
}
