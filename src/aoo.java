import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;

public class aoo {
   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("rotate").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ey.a("target", fk.a())
                     .then(ey.a("rotation", gy.a()).executes($$0x -> a((ex)$$0x.getSource(), fk.a($$0x, "target"), gy.a($$0x, "rotation")))))
                  .then(
                     ((LiteralArgumentBuilder)ey.a("facing")
                           .then(
                              ey.a("entity")
                                 .then(
                                    ((RequiredArgumentBuilder)ey.a("facingEntity", fk.a())
                                          .executes($$0x -> a((ex)$$0x.getSource(), fk.a($$0x, "target"), new anx.a(fk.a($$0x, "facingEntity"), fj.a.a))))
                                       .then(
                                          ey.a("facingAnchor", fj.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ex)$$0x.getSource(),
                                                      fk.a($$0x, "target"),
                                                      new anx.a(fk.a($$0x, "facingEntity"), fj.a($$0x, "facingAnchor"))
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ey.a("facingLocation", hb.a())
                              .executes($$0x -> a((ex)$$0x.getSource(), fk.a($$0x, "target"), new anx.b(hb.a($$0x, "facingLocation"))))
                        )
                  )
            )
      );
   }

   private static int a(ex $$0, bvs $$1, gw $$2) {
      fct $$3 = $$2.b($$0);
      $$1.a($$3.j, $$3.i);
      $$0.a(() -> wv.a("commands.rotate.success", $$1.m_()), true);
      return 1;
   }

   private static int a(ex $$0, bvs $$1, anx $$2) {
      $$2.perform($$0, $$1);
      $$0.a(() -> wv.a("commands.rotate.success", $$1.m_()), true);
      return 1;
   }
}
