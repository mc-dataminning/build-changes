import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;

public class apj {
   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("rotate").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ex.a("target", fj.a())
                     .then(ex.a("rotation", gw.a()).executes($$0x -> a((ew)$$0x.getSource(), fj.a($$0x, "target"), gw.a($$0x, "rotation")))))
                  .then(
                     ((LiteralArgumentBuilder)ex.a("facing")
                           .then(
                              ex.a("entity")
                                 .then(
                                    ((RequiredArgumentBuilder)ex.a("facingEntity", fj.a())
                                          .executes($$0x -> a((ew)$$0x.getSource(), fj.a($$0x, "target"), new aos.a(fj.a($$0x, "facingEntity"), fi.a.a))))
                                       .then(
                                          ex.a("facingAnchor", fi.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ew)$$0x.getSource(),
                                                      fj.a($$0x, "target"),
                                                      new aos.a(fj.a($$0x, "facingEntity"), fi.a($$0x, "facingAnchor"))
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ex.a("facingLocation", gz.a())
                              .executes($$0x -> a((ew)$$0x.getSource(), fj.a($$0x, "target"), new aos.b(gz.a($$0x, "facingLocation"))))
                        )
                  )
            )
      );
   }

   private static int a(ew $$0, bvj $$1, gu $$2) {
      fbw $$3 = $$2.b($$0);
      $$1.a($$3.j, $$3.i);
      $$0.a(() -> xv.a("commands.rotate.success", $$1.p_()), true);
      return 1;
   }

   private static int a(ew $$0, bvj $$1, aos $$2) {
      $$2.perform($$0, $$1);
      $$0.a(() -> xv.a("commands.rotate.success", $$1.p_()), true);
      return 1;
   }
}
