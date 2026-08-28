import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;

public class aoe {
   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("rotate").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ey.a("target", fk.a())
                     .then(ey.a("rotation", gx.a()).executes($$0x -> a((ex)$$0x.getSource(), fk.a($$0x, "target"), gx.a($$0x, "rotation")))))
                  .then(
                     ((LiteralArgumentBuilder)ey.a("facing")
                           .then(
                              ey.a("entity")
                                 .then(
                                    ((RequiredArgumentBuilder)ey.a("facingEntity", fk.a())
                                          .executes($$0x -> a((ex)$$0x.getSource(), fk.a($$0x, "target"), new ann.a(fk.a($$0x, "facingEntity"), fj.a.a))))
                                       .then(
                                          ey.a("facingAnchor", fj.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ex)$$0x.getSource(),
                                                      fk.a($$0x, "target"),
                                                      new ann.a(fk.a($$0x, "facingEntity"), fj.a($$0x, "facingAnchor"))
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ey.a("facingLocation", ha.a())
                              .executes($$0x -> a((ex)$$0x.getSource(), fk.a($$0x, "target"), new ann.b(ha.a($$0x, "facingLocation"))))
                        )
                  )
            )
      );
   }

   private static int a(ex $$0, buk $$1, gv $$2) {
      faz $$3 = $$2.b($$0);
      $$1.a($$3.j, $$3.i);
      $$0.a(() -> wo.a("commands.rotate.success", $$1.p_()), true);
      return 1;
   }

   private static int a(ex $$0, buk $$1, ann $$2) {
      $$2.perform($$0, $$1);
      $$0.a(() -> wo.a("commands.rotate.success", $$1.p_()), true);
      return 1;
   }
}
