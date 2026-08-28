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

public class amu {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xo.b("commands.datapack.unknown", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xo.b("commands.datapack.enable.failed", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xo.b("commands.datapack.disable.failed", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xo.b("commands.datapack.disable.failed.feature", $$0));
   private static final Dynamic2CommandExceptionType e = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xo.b("commands.datapack.enable.failed.no_flags", $$0, $$1)
   );
   private static final SuggestionProvider<ep> f = ($$0, $$1) -> eu.b(
         ((ep)$$0.getSource()).l().aG().d().stream().map(StringArgumentType::escapeIfRequired), $$1
      );
   private static final SuggestionProvider<ep> g = ($$0, $$1) -> {
      atz $$2 = ((ep)$$0.getSource()).l().aG();
      Collection<String> $$3 = $$2.d();
      cpj $$4 = ((ep)$$0.getSource()).w();
      return eu.b(
         $$2.c().stream().filter($$1x -> $$1x.e().a($$4)).map(atw::g).filter($$1x -> !$$3.contains($$1x)).map(StringArgumentType::escapeIfRequired), $$1
      );
   };

   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("datapack").requires($$0x -> $$0x.c(2)))
                  .then(
                     eq.a("enable")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)eq.a(
                                             "name", StringArgumentType.string()
                                          )
                                          .suggests(g)
                                          .executes(
                                             $$0x -> a((ep)$$0x.getSource(), a($$0x, "name", true), ($$0xx, $$1) -> $$1.k().a($$0xx, $$1, atw::h, false))
                                          ))
                                       .then(
                                          eq.a("after")
                                             .then(
                                                eq.a("existing", StringArgumentType.string())
                                                   .suggests(f)
                                                   .executes(
                                                      $$0x -> a(
                                                            (ep)$$0x.getSource(),
                                                            a($$0x, "name", true),
                                                            ($$1, $$2) -> $$1.add($$1.indexOf(a($$0x, "existing", false)) + 1, $$2)
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       eq.a("before")
                                          .then(
                                             eq.a("existing", StringArgumentType.string())
                                                .suggests(f)
                                                .executes(
                                                   $$0x -> a(
                                                         (ep)$$0x.getSource(),
                                                         a($$0x, "name", true),
                                                         ($$1, $$2) -> $$1.add($$1.indexOf(a($$0x, "existing", false)), $$2)
                                                      )
                                                )
                                          )
                                    ))
                                 .then(eq.a("last").executes($$0x -> a((ep)$$0x.getSource(), a($$0x, "name", true), List::add))))
                              .then(eq.a("first").executes($$0x -> a((ep)$$0x.getSource(), a($$0x, "name", true), ($$0xx, $$1) -> $$0xx.add(0, $$1))))
                        )
                  ))
               .then(
                  eq.a("disable").then(eq.a("name", StringArgumentType.string()).suggests(f).executes($$0x -> a((ep)$$0x.getSource(), a($$0x, "name", false))))
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("list").executes($$0x -> a((ep)$$0x.getSource())))
                     .then(eq.a("available").executes($$0x -> b((ep)$$0x.getSource()))))
                  .then(eq.a("enabled").executes($$0x -> c((ep)$$0x.getSource())))
            )
      );
   }

   private static int a(ep $$0, atw $$1, amu.a $$2) throws CommandSyntaxException {
      atz $$3 = $$0.l().aG();
      List<atw> $$4 = Lists.newArrayList($$3.f());
      $$2.apply($$4, $$1);
      $$0.a(() -> xo.a("commands.datapack.modify.enable", $$1.a(true)), true);
      aoi.a($$4.stream().map(atw::g).collect(Collectors.toList()), $$0);
      return $$4.size();
   }

   private static int a(ep $$0, atw $$1) {
      atz $$2 = $$0.l().aG();
      List<atw> $$3 = Lists.newArrayList($$2.f());
      $$3.remove($$1);
      $$0.a(() -> xo.a("commands.datapack.modify.disable", $$1.a(true)), true);
      aoi.a($$3.stream().map(atw::g).collect(Collectors.toList()), $$0);
      return $$3.size();
   }

   private static int a(ep $$0) {
      return c($$0) + b($$0);
   }

   private static int b(ep $$0) {
      atz $$1 = $$0.l().aG();
      $$1.a();
      Collection<atw> $$2 = $$1.f();
      Collection<atw> $$3 = $$1.c();
      cpj $$4 = $$0.w();
      List<atw> $$5 = $$3.stream().filter($$2x -> !$$2.contains($$2x) && $$2x.e().a($$4)).toList();
      if ($$5.isEmpty()) {
         $$0.a(() -> xo.c("commands.datapack.list.available.none"), false);
      } else {
         $$0.a(() -> xo.a("commands.datapack.list.available.success", $$5.size(), xr.b($$5, $$0xx -> $$0xx.a(false))), false);
      }

      return $$5.size();
   }

   private static int c(ep $$0) {
      atz $$1 = $$0.l().aG();
      $$1.a();
      Collection<? extends atw> $$2 = $$1.f();
      if ($$2.isEmpty()) {
         $$0.a(() -> xo.c("commands.datapack.list.enabled.none"), false);
      } else {
         $$0.a(() -> xo.a("commands.datapack.list.enabled.success", $$2.size(), xr.b($$2, $$0xx -> $$0xx.a(true))), false);
      }

      return $$2.size();
   }

   private static atw a(CommandContext<ep> $$0, String $$1, boolean $$2) throws CommandSyntaxException {
      String $$3 = StringArgumentType.getString($$0, $$1);
      atz $$4 = ((ep)$$0.getSource()).l().aG();
      atw $$5 = $$4.c($$3);
      if ($$5 == null) {
         throw a.create($$3);
      } else {
         boolean $$6 = $$4.f().contains($$5);
         if ($$2 && $$6) {
            throw b.create($$3);
         } else if (!$$2 && !$$6) {
            throw c.create($$3);
         } else {
            cpj $$7 = ((ep)$$0.getSource()).w();
            cpj $$8 = $$5.e();
            if (!$$2 && !$$8.b() && $$5.l() == aua.d) {
               throw d.create($$3);
            } else if (!$$8.a($$7)) {
               throw e.create($$3, cpl.a($$7, $$8));
            } else {
               return $$5;
            }
         }
      }
   }

   interface a {
      void apply(List<atw> var1, atw var2) throws CommandSyntaxException;
   }
}
