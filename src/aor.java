import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;

public class aor {
   public static void a(CommandDispatcher<ei> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("rotate").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ej.a("target", ev.a())
                     .then(ej.a("rotation", gj.a()).executes($$0x -> a((ei)$$0x.getSource(), ev.a($$0x, "target"), gj.a($$0x, "rotation")))))
                  .then(
                     ((LiteralArgumentBuilder)ej.a("facing")
                           .then(
                              ej.a("entity")
                                 .then(
                                    ((RequiredArgumentBuilder)ej.a("facingEntity", ev.a())
                                          .executes($$0x -> a((ei)$$0x.getSource(), ev.a($$0x, "target"), new aoa.a(ev.a($$0x, "facingEntity"), eu.a.a))))
                                       .then(
                                          ej.a("facingAnchor", eu.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ei)$$0x.getSource(),
                                                      ev.a($$0x, "target"),
                                                      new aoa.a(ev.a($$0x, "facingEntity"), eu.a($$0x, "facingAnchor"))
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ej.a("facingLocation", gm.a())
                              .executes($$0x -> a((ei)$$0x.getSource(), ev.a($$0x, "target"), new aoa.b(gm.a($$0x, "facingLocation"))))
                        )
                  )
            )
      );
   }

   private static int a(ei $$0, bwd $$1, gh $$2) {
      feh $$3 = $$2.b($$0);
      $$1.a($$3.j, $$3.i);
      $$0.a(() -> wy.a("commands.rotate.success", $$1.m_()), true);
      return 1;
   }

   private static int a(ei $$0, bwd $$1, aoa $$2) {
      $$2.perform($$0, $$1);
      $$0.a(() -> wy.a("commands.rotate.success", $$1.m_()), true);
      return 1;
   }
}
