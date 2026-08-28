import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;

public class aov {
   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("rotate").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)el.a("target", ex.a())
                     .then(el.a("rotation", gl.a()).executes($$0x -> a((ek)$$0x.getSource(), ex.a($$0x, "target"), gl.a($$0x, "rotation")))))
                  .then(
                     ((LiteralArgumentBuilder)el.a("facing")
                           .then(
                              el.a("entity")
                                 .then(
                                    ((RequiredArgumentBuilder)el.a("facingEntity", ex.a())
                                          .executes($$0x -> a((ek)$$0x.getSource(), ex.a($$0x, "target"), new aoe.a(ex.a($$0x, "facingEntity"), ew.a.a))))
                                       .then(
                                          el.a("facingAnchor", ew.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ek)$$0x.getSource(),
                                                      ex.a($$0x, "target"),
                                                      new aoe.a(ex.a($$0x, "facingEntity"), ew.a($$0x, "facingAnchor"))
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           el.a("facingLocation", go.a())
                              .executes($$0x -> a((ek)$$0x.getSource(), ex.a($$0x, "target"), new aoe.b(go.a($$0x, "facingLocation"))))
                        )
                  )
            )
      );
   }

   private static int a(ek $$0, bwv $$1, gj $$2) {
      ffr $$3 = $$2.b($$0);
      $$1.a($$3.k, $$3.j);
      $$0.a(() -> xc.a("commands.rotate.success", $$1.m_()), true);
      return 1;
   }

   private static int a(ek $$0, bwv $$1, aoe $$2) {
      $$2.perform($$0, $$1);
      $$0.a(() -> xc.a("commands.rotate.success", $$1.m_()), true);
      return 1;
   }
}
