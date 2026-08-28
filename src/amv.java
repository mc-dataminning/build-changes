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

public class amv {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xp.b("commands.datapack.unknown", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xp.b("commands.datapack.enable.failed", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xp.b("commands.datapack.disable.failed", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xp.b("commands.datapack.disable.failed.feature", $$0));
   private static final Dynamic2CommandExceptionType e = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xp.b("commands.datapack.enable.failed.no_flags", $$0, $$1)
   );
   private static final SuggestionProvider<ep> f = ($$0, $$1) -> eu.b(
         ((ep)$$0.getSource()).l().aG().d().stream().map(StringArgumentType::escapeIfRequired), $$1
      );
   private static final SuggestionProvider<ep> g = ($$0, $$1) -> {
      aua $$2 = ((ep)$$0.getSource()).l().aG();
      Collection<String> $$3 = $$2.d();
      cpn $$4 = ((ep)$$0.getSource()).w();
      return eu.b(
         $$2.c().stream().filter($$1x -> $$1x.e().a($$4)).map(atx::g).filter($$1x -> !$$3.contains($$1x)).map(StringArgumentType::escapeIfRequired), $$1
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
                                             $$0x -> a((ep)$$0x.getSource(), a($$0x, "name", true), ($$0xx, $$1) -> $$1.k().a($$0xx, $$1, atx::h, false))
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

   private static int a(ep $$0, atx $$1, amv.a $$2) throws CommandSyntaxException {
      aua $$3 = $$0.l().aG();
      List<atx> $$4 = Lists.newArrayList($$3.f());
      $$2.apply($$4, $$1);
      $$0.a(() -> xp.a("commands.datapack.modify.enable", $$1.a(true)), true);
      aoj.a($$4.stream().map(atx::g).collect(Collectors.toList()), $$0);
      return $$4.size();
   }

   private static int a(ep $$0, atx $$1) {
      aua $$2 = $$0.l().aG();
      List<atx> $$3 = Lists.newArrayList($$2.f());
      $$3.remove($$1);
      $$0.a(() -> xp.a("commands.datapack.modify.disable", $$1.a(true)), true);
      aoj.a($$3.stream().map(atx::g).collect(Collectors.toList()), $$0);
      return $$3.size();
   }

   private static int a(ep $$0) {
      return c($$0) + b($$0);
   }

   private static int b(ep $$0) {
      aua $$1 = $$0.l().aG();
      $$1.a();
      Collection<atx> $$2 = $$1.f();
      Collection<atx> $$3 = $$1.c();
      cpn $$4 = $$0.w();
      List<atx> $$5 = $$3.stream().filter($$2x -> !$$2.contains($$2x) && $$2x.e().a($$4)).toList();
      if ($$5.isEmpty()) {
         $$0.a(() -> xp.c("commands.datapack.list.available.none"), false);
      } else {
         $$0.a(() -> xp.a("commands.datapack.list.available.success", $$5.size(), xs.b($$5, $$0xx -> $$0xx.a(false))), false);
      }

      return $$5.size();
   }

   private static int c(ep $$0) {
      aua $$1 = $$0.l().aG();
      $$1.a();
      Collection<? extends atx> $$2 = $$1.f();
      if ($$2.isEmpty()) {
         $$0.a(() -> xp.c("commands.datapack.list.enabled.none"), false);
      } else {
         $$0.a(() -> xp.a("commands.datapack.list.enabled.success", $$2.size(), xs.b($$2, $$0xx -> $$0xx.a(true))), false);
      }

      return $$2.size();
   }

   private static atx a(CommandContext<ep> $$0, String $$1, boolean $$2) throws CommandSyntaxException {
      String $$3 = StringArgumentType.getString($$0, $$1);
      aua $$4 = ((ep)$$0.getSource()).l().aG();
      atx $$5 = $$4.c($$3);
      if ($$5 == null) {
         throw a.create($$3);
      } else {
         boolean $$6 = $$4.f().contains($$5);
         if ($$2 && $$6) {
            throw b.create($$3);
         } else if (!$$2 && !$$6) {
            throw c.create($$3);
         } else {
            cpn $$7 = ((ep)$$0.getSource()).w();
            cpn $$8 = $$5.e();
            if (!$$2 && !$$8.b() && $$5.l() == aub.d) {
               throw d.create($$3);
            } else if (!$$8.a($$7)) {
               throw e.create($$3, cpp.a($$7, $$8));
            } else {
               return $$5;
            }
         }
      }
   }

   interface a {
      void apply(List<atx> var1, atx var2) throws CommandSyntaxException;
   }
}
