import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class alu {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> ws.b("commands.datapack.unknown", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> ws.b("commands.datapack.enable.failed", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> ws.b("commands.datapack.disable.failed", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> ws.b("commands.datapack.disable.failed.feature", $$0));
   private static final Dynamic2CommandExceptionType e = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> ws.b("commands.datapack.enable.failed.no_flags", $$0, $$1)
   );
   private static final SuggestionProvider<ec> f = ($$0, $$1) -> eh.b(
         ((ec)$$0.getSource()).l().aG().d().stream().map(StringArgumentType::escapeIfRequired), $$1
      );
   private static final SuggestionProvider<ec> g = ($$0, $$1) -> {
      asz $$2 = ((ec)$$0.getSource()).l().aG();
      Collection<String> $$3 = $$2.d();
      cmy $$4 = ((ec)$$0.getSource()).w();
      return eh.b(
         $$2.c().stream().filter($$1x -> $$1x.e().a($$4)).map(asw::g).filter($$1x -> !$$3.contains($$1x)).map(StringArgumentType::escapeIfRequired), $$1
      );
   };

   public static void a(CommandDispatcher<ec> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("datapack").requires($$0x -> $$0x.c(2)))
                  .then(
                     ed.a("enable")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ed.a(
                                             "name", StringArgumentType.string()
                                          )
                                          .suggests(g)
                                          .executes(
                                             $$0x -> a((ec)$$0x.getSource(), a($$0x, "name", true), ($$0xx, $$1) -> $$1.k().a($$0xx, $$1, asw::h, false))
                                          ))
                                       .then(
                                          ed.a("after")
                                             .then(
                                                ed.a("existing", StringArgumentType.string())
                                                   .suggests(f)
                                                   .executes(
                                                      $$0x -> a(
                                                            (ec)$$0x.getSource(),
                                                            a($$0x, "name", true),
                                                            ($$1, $$2) -> $$1.add($$1.indexOf(a($$0x, "existing", false)) + 1, $$2)
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       ed.a("before")
                                          .then(
                                             ed.a("existing", StringArgumentType.string())
                                                .suggests(f)
                                                .executes(
                                                   $$0x -> a(
                                                         (ec)$$0x.getSource(),
                                                         a($$0x, "name", true),
                                                         ($$1, $$2) -> $$1.add($$1.indexOf(a($$0x, "existing", false)), $$2)
                                                      )
                                                )
                                          )
                                    ))
                                 .then(ed.a("last").executes($$0x -> a((ec)$$0x.getSource(), a($$0x, "name", true), List::add))))
                              .then(ed.a("first").executes($$0x -> a((ec)$$0x.getSource(), a($$0x, "name", true), ($$0xx, $$1) -> $$0xx.add(0, $$1))))
                        )
                  ))
               .then(
                  ed.a("disable").then(ed.a("name", StringArgumentType.string()).suggests(f).executes($$0x -> a((ec)$$0x.getSource(), a($$0x, "name", false))))
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("list").executes($$0x -> a((ec)$$0x.getSource())))
                     .then(ed.a("available").executes($$0x -> b((ec)$$0x.getSource()))))
                  .then(ed.a("enabled").executes($$0x -> c((ec)$$0x.getSource())))
            )
      );
   }

   private static int a(ec $$0, asw $$1, alu.a $$2) throws CommandSyntaxException {
      asz $$3 = $$0.l().aG();
      List<asw> $$4 = Lists.newArrayList($$3.f());
      $$2.apply($$4, $$1);
      $$0.a(() -> ws.a("commands.datapack.modify.enable", $$1.a(true)), true);
      ani.a($$4.stream().map(asw::g).collect(Collectors.toList()), $$0);
      return $$4.size();
   }

   private static int a(ec $$0, asw $$1) {
      asz $$2 = $$0.l().aG();
      List<asw> $$3 = Lists.newArrayList($$2.f());
      $$3.remove($$1);
      $$0.a(() -> ws.a("commands.datapack.modify.disable", $$1.a(true)), true);
      ani.a($$3.stream().map(asw::g).collect(Collectors.toList()), $$0);
      return $$3.size();
   }

   private static int a(ec $$0) {
      return c($$0) + b($$0);
   }

   private static int b(ec $$0) {
      asz $$1 = $$0.l().aG();
      $$1.a();
      Collection<asw> $$2 = $$1.f();
      Collection<asw> $$3 = $$1.c();
      cmy $$4 = $$0.w();
      List<asw> $$5 = $$3.stream().filter($$2x -> !$$2.contains($$2x) && $$2x.e().a($$4)).toList();
      if ($$5.isEmpty()) {
         $$0.a(() -> ws.c("commands.datapack.list.available.none"), false);
      } else {
         $$0.a(() -> ws.a("commands.datapack.list.available.success", $$5.size(), wv.b($$5, $$0xx -> $$0xx.a(false))), false);
      }

      return $$5.size();
   }

   private static int c(ec $$0) {
      asz $$1 = $$0.l().aG();
      $$1.a();
      Collection<? extends asw> $$2 = $$1.f();
      if ($$2.isEmpty()) {
         $$0.a(() -> ws.c("commands.datapack.list.enabled.none"), false);
      } else {
         $$0.a(() -> ws.a("commands.datapack.list.enabled.success", $$2.size(), wv.b($$2, $$0xx -> $$0xx.a(true))), false);
      }

      return $$2.size();
   }

   private static asw a(CommandContext<ec> $$0, String $$1, boolean $$2) throws CommandSyntaxException {
      String $$3 = StringArgumentType.getString($$0, $$1);
      asz $$4 = ((ec)$$0.getSource()).l().aG();
      asw $$5 = $$4.c($$3);
      if ($$5 == null) {
         throw a.create($$3);
      } else {
         boolean $$6 = $$4.f().contains($$5);
         if ($$2 && $$6) {
            throw b.create($$3);
         } else if (!$$2 && !$$6) {
            throw c.create($$3);
         } else {
            cmy $$7 = ((ec)$$0.getSource()).w();
            cmy $$8 = $$5.e();
            if (!$$2 && $$8.a($$7)) {
               throw d.create($$3);
            } else if (!$$8.a($$7)) {
               throw e.create($$3, cna.a($$7, $$8));
            } else {
               return $$5;
            }
         }
      }
   }

   interface a {
      void apply(List<asw> var1, asw var2) throws CommandSyntaxException;
   }
}
