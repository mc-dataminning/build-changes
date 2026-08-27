import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aoi {
   public static void a(CommandDispatcher<ec> $$0, dy $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("tellraw").requires($$0x -> $$0x.c(2)))
            .then(ed.a("targets", ep.d()).then(ed.a("message", el.a($$1)).executes($$0x -> {
               int $$1x = 0;

               for (aqf $$2 : ep.f($$0x, "targets")) {
                  $$2.b(wv.a((ec)$$0x.getSource(), el.a($$0x, "message"), $$2, 0), false);
                  $$1x++;
               }

               return $$1x;
            })))
      );
   }
}
