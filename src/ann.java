import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public class ann {
   public static void a(CommandDispatcher<ee> $$0, ea $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a(
                                    "raid"
                                 )
                                 .requires($$0x -> $$0x.c(3)))
                              .then(
                                 ef.a("start")
                                    .then(
                                       ef.a("omenlvl", IntegerArgumentType.integer(0))
                                          .executes($$0x -> b((ee)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "omenlvl")))
                                    )
                              ))
                           .then(ef.a("stop").executes($$0x -> c((ee)$$0x.getSource()))))
                        .then(ef.a("check").executes($$0x -> d((ee)$$0x.getSource()))))
                     .then(ef.a("sound").then(ef.a("type", en.a($$1)).executes($$0x -> a((ee)$$0x.getSource(), en.a($$0x, "type"))))))
                  .then(ef.a("spawnleader").executes($$0x -> b((ee)$$0x.getSource()))))
               .then(
                  ef.a("setomen")
                     .then(
                        ef.a("level", IntegerArgumentType.integer(0)).executes($$0x -> a((ee)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "level")))
                     )
               ))
            .then(ef.a("glow").executes($$0x -> a((ee)$$0x.getSource())))
      );
   }

   private static int a(ee $$0) throws CommandSyntaxException {
      cnh $$1 = a($$0.h());
      if ($$1 != null) {
         for (cni $$3 : $$1.h()) {
            $$3.b(new brc(bre.x, 1000, 1));
         }
      }

      return 1;
   }

   private static int a(ee $$0, int $$1) throws CommandSyntaxException {
      cnh $$2 = a($$0.h());
      if ($$2 != null) {
         int $$3 = $$2.l();
         if ($$1 > $$3) {
            $$0.b(wx.b("Sorry, the max raid omen level you can set is " + $$3));
         } else {
            int $$4 = $$2.m();
            $$2.a($$1);
            $$0.a(() -> wx.b("Changed village's raid omen level from " + $$4 + " to " + $$1), false);
         }
      } else {
         $$0.b(wx.b("No raid found here"));
      }

      return 1;
   }

   private static int b(ee $$0) {
      $$0.a(() -> wx.b("Spawned a raid captain"), false);
      cni $$1 = bsa.aC.a((dax)$$0.e());
      if ($$1 == null) {
         $$0.b(wx.b("Pillager failed to spawn"));
         return 0;
      } else {
         $$1.w(true);
         $$1.a(bsb.f, cnh.a($$0.v().b(lf.d)));
         $$1.a_($$0.d().c, $$0.d().d, $$0.d().e);
         $$1.a($$0.e(), $$0.e().d_(io.a($$0.d())), bss.n, null);
         $$0.e().a_($$1);
         return 1;
      }
   }

   private static int a(ee $$0, @Nullable wx $$1) {
      if ($$1 != null && $$1.getString().equals("local")) {
         aqm $$2 = $$0.e();
         euk $$3 = $$0.d().b(5.0, 0.0, 0.0);
         $$2.a(null, $$3.c, $$3.d, $$3.e, avh.uZ, avi.g, 2.0F, 1.0F, $$2.z.g());
      }

      return 1;
   }

   private static int b(ee $$0, int $$1) throws CommandSyntaxException {
      aqn $$2 = $$0.h();
      io $$3 = $$2.dp();
      if ($$2.z().e($$3)) {
         $$0.b(wx.b("Raid already started close by"));
         return -1;
      } else {
         cnj $$4 = $$2.z().z();
         cnh $$5 = $$4.a($$2, $$2.dp());
         if ($$5 != null) {
            $$5.a($$1);
            $$4.c();
            $$0.a(() -> wx.b("Created a raid in your local village"), false);
         } else {
            $$0.b(wx.b("Failed to create a raid in your local village"));
         }

         return 1;
      }
   }

   private static int c(ee $$0) throws CommandSyntaxException {
      aqn $$1 = $$0.h();
      io $$2 = $$1.dp();
      cnh $$3 = $$1.z().d($$2);
      if ($$3 != null) {
         $$3.n();
         $$0.a(() -> wx.b("Stopped raid"), false);
         return 1;
      } else {
         $$0.b(wx.b("No raid here"));
         return -1;
      }
   }

   private static int d(ee $$0) throws CommandSyntaxException {
      cnh $$1 = a($$0.h());
      if ($$1 != null) {
         StringBuilder $$2 = new StringBuilder();
         $$2.append("Found a started raid! ");
         $$0.a(() -> wx.b($$2.toString()), false);
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
         $$0.a(() -> wx.b($$3.toString()), false);
         return 1;
      } else {
         $$0.b(wx.b("Found no started raids"));
         return 0;
      }
   }

   @Nullable
   private static cnh a(aqn $$0) {
      return $$0.z().d($$0.dp());
   }
}
