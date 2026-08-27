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

public class aib {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> uv.b("commands.datapack.unknown", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> uv.b("commands.datapack.enable.failed", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> uv.b("commands.datapack.disable.failed", $$0));
   private static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> uv.b("commands.datapack.enable.failed.no_flags", $$0, $$1)
   );
   private static final SuggestionProvider<du> e = ($$0, $$1) -> dy.b(
         ((du)$$0.getSource()).l().aD().d().stream().map(StringArgumentType::escapeIfRequired), $$1
      );
   private static final SuggestionProvider<du> f = ($$0, $$1) -> {
      aow $$2 = ((du)$$0.getSource()).l().aD();
      Collection<String> $$3 = $$2.d();
      cgi $$4 = ((du)$$0.getSource()).w();
      return dy.b(
         $$2.c().stream().filter($$1x -> $$1x.d().a($$4)).map(aot::f).filter($$1x -> !$$3.contains($$1x)).map(StringArgumentType::escapeIfRequired), $$1
      );
   };

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("datapack").requires($$0x -> $$0x.c(2)))
                  .then(
                     dv.a("enable")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a(
                                             "name", StringArgumentType.string()
                                          )
                                          .suggests(f)
                                          .executes(
                                             $$0x -> a(
                                                   (du)$$0x.getSource(), a($$0x, "name", true), ($$0xx, $$1) -> $$1.i().a($$0xx, $$1, $$0xxx -> $$0xxx, false)
                                                )
                                          ))
                                       .then(
                                          dv.a("after")
                                             .then(
                                                dv.a("existing", StringArgumentType.string())
                                                   .suggests(e)
                                                   .executes(
                                                      $$0x -> a(
                                                            (du)$$0x.getSource(),
                                                            a($$0x, "name", true),
                                                            ($$1, $$2) -> $$1.add($$1.indexOf(a($$0x, "existing", false)) + 1, $$2)
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       dv.a("before")
                                          .then(
                                             dv.a("existing", StringArgumentType.string())
                                                .suggests(e)
                                                .executes(
                                                   $$0x -> a(
                                                         (du)$$0x.getSource(),
                                                         a($$0x, "name", true),
                                                         ($$1, $$2) -> $$1.add($$1.indexOf(a($$0x, "existing", false)), $$2)
                                                      )
                                                )
                                          )
                                    ))
                                 .then(dv.a("last").executes($$0x -> a((du)$$0x.getSource(), a($$0x, "name", true), List::add))))
                              .then(dv.a("first").executes($$0x -> a((du)$$0x.getSource(), a($$0x, "name", true), ($$0xx, $$1) -> $$0xx.add(0, $$1))))
                        )
                  ))
               .then(
                  dv.a("disable").then(dv.a("name", StringArgumentType.string()).suggests(e).executes($$0x -> a((du)$$0x.getSource(), a($$0x, "name", false))))
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("list").executes($$0x -> a((du)$$0x.getSource())))
                     .then(dv.a("available").executes($$0x -> b((du)$$0x.getSource()))))
                  .then(dv.a("enabled").executes($$0x -> c((du)$$0x.getSource())))
            )
      );
   }

   private static int a(du $$0, aot $$1, aib.a $$2) throws CommandSyntaxException {
      aow $$3 = $$0.l().aD();
      List<aot> $$4 = Lists.newArrayList($$3.f());
      $$2.apply($$4, $$1);
      $$0.a(() -> uv.a("commands.datapack.modify.enable", $$1.a(true)), true);
      ajp.a($$4.stream().map(aot::f).collect(Collectors.toList()), $$0);
      return $$4.size();
   }

   private static int a(du $$0, aot $$1) {
      aow $$2 = $$0.l().aD();
      List<aot> $$3 = Lists.newArrayList($$2.f());
      $$3.remove($$1);
      $$0.a(() -> uv.a("commands.datapack.modify.disable", $$1.a(true)), true);
      ajp.a($$3.stream().map(aot::f).collect(Collectors.toList()), $$0);
      return $$3.size();
   }

   private static int a(du $$0) {
      return c($$0) + b($$0);
   }

   private static int b(du $$0) {
      aow $$1 = $$0.l().aD();
      $$1.a();
      Collection<aot> $$2 = $$1.f();
      Collection<aot> $$3 = $$1.c();
      cgi $$4 = $$0.w();
      List<aot> $$5 = $$3.stream().filter($$2x -> !$$2.contains($$2x) && $$2x.d().a($$4)).toList();
      if ($$5.isEmpty()) {
         $$0.a(() -> uv.c("commands.datapack.list.available.none"), false);
      } else {
         $$0.a(() -> uv.a("commands.datapack.list.available.success", $$5.size(), uy.b($$5, $$0xx -> $$0xx.a(false))), false);
      }

      return $$5.size();
   }

   private static int c(du $$0) {
      aow $$1 = $$0.l().aD();
      $$1.a();
      Collection<? extends aot> $$2 = $$1.f();
      if ($$2.isEmpty()) {
         $$0.a(() -> uv.c("commands.datapack.list.enabled.none"), false);
      } else {
         $$0.a(() -> uv.a("commands.datapack.list.enabled.success", $$2.size(), uy.b($$2, $$0xx -> $$0xx.a(true))), false);
      }

      return $$2.size();
   }

   private static aot a(CommandContext<du> $$0, String $$1, boolean $$2) throws CommandSyntaxException {
      String $$3 = StringArgumentType.getString($$0, $$1);
      aow $$4 = ((du)$$0.getSource()).l().aD();
      aot $$5 = $$4.c($$3);
      if ($$5 == null) {
         throw a.create($$3);
      } else {
         boolean $$6 = $$4.f().contains($$5);
         if ($$2 && $$6) {
            throw b.create($$3);
         } else if (!$$2 && !$$6) {
            throw c.create($$3);
         } else {
            cgi $$7 = ((du)$$0.getSource()).w();
            cgi $$8 = $$5.d();
            if (!$$8.a($$7)) {
               throw d.create($$3, cgk.a($$7, $$8));
            } else {
               return $$5;
            }
         }
      }
   }

   interface a {
      void apply(List<aot> var1, aot var2) throws CommandSyntaxException;
   }
}
