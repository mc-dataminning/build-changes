import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;

public class aot {
   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("rotate").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ek.a("target", ew.a())
                     .then(ek.a("rotation", gk.a()).executes($$0x -> a((ej)$$0x.getSource(), ew.a($$0x, "target"), gk.a($$0x, "rotation")))))
                  .then(
                     ((LiteralArgumentBuilder)ek.a("facing")
                           .then(
                              ek.a("entity")
                                 .then(
                                    ((RequiredArgumentBuilder)ek.a("facingEntity", ew.a())
                                          .executes($$0x -> a((ej)$$0x.getSource(), ew.a($$0x, "target"), new aoc.a(ew.a($$0x, "facingEntity"), ev.a.a))))
                                       .then(
                                          ek.a("facingAnchor", ev.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ej)$$0x.getSource(),
                                                      ew.a($$0x, "target"),
                                                      new aoc.a(ew.a($$0x, "facingEntity"), ev.a($$0x, "facingAnchor"))
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ek.a("facingLocation", gn.a())
                              .executes($$0x -> a((ej)$$0x.getSource(), ew.a($$0x, "target"), new aoc.b(gn.a($$0x, "facingLocation"))))
                        )
                  )
            )
      );
   }

   private static int a(ej $$0, bwt $$1, gi $$2) {
      ffp $$3 = $$2.b($$0);
      $$1.a($$3.k, $$3.j);
      $$0.a(() -> xa.a("commands.rotate.success", $$1.m_()), true);
      return 1;
   }

   private static int a(ej $$0, bwt $$1, aoc $$2) {
      $$2.perform($$0, $$1);
      $$0.a(() -> xa.a("commands.rotate.success", $$1.m_()), true);
      return 1;
   }
}
