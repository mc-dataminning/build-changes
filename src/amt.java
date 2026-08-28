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

public class amt {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xd.b("commands.datapack.unknown", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xd.b("commands.datapack.enable.failed", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xd.b("commands.datapack.disable.failed", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xd.b("commands.datapack.disable.failed.feature", $$0));
   private static final Dynamic2CommandExceptionType e = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xd.b("commands.datapack.enable.failed.no_flags", $$0, $$1)
   );
   private static final SuggestionProvider<et> f = ($$0, $$1) -> ey.b(
         ((et)$$0.getSource()).l().aF().d().stream().map(StringArgumentType::escapeIfRequired), $$1
      );
   private static final SuggestionProvider<et> g = ($$0, $$1) -> {
      aud $$2 = ((et)$$0.getSource()).l().aF();
      Collection<String> $$3 = $$2.d();
      cqh $$4 = ((et)$$0.getSource()).w();
      return ey.b(
         $$2.c().stream().filter($$1x -> $$1x.e().a($$4)).map(aua::g).filter($$1x -> !$$3.contains($$1x)).map(StringArgumentType::escapeIfRequired), $$1
      );
   };

   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("datapack").requires($$0x -> $$0x.c(2)))
                  .then(
                     eu.a("enable")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)eu.a(
                                             "name", StringArgumentType.string()
                                          )
                                          .suggests(g)
                                          .executes(
                                             $$0x -> a((et)$$0x.getSource(), a($$0x, "name", true), ($$0xx, $$1) -> $$1.k().a($$0xx, $$1, aua::h, false))
                                          ))
                                       .then(
                                          eu.a("after")
                                             .then(
                                                eu.a("existing", StringArgumentType.string())
                                                   .suggests(f)
                                                   .executes(
                                                      $$0x -> a(
                                                            (et)$$0x.getSource(),
                                                            a($$0x, "name", true),
                                                            ($$1, $$2) -> $$1.add($$1.indexOf(a($$0x, "existing", false)) + 1, $$2)
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       eu.a("before")
                                          .then(
                                             eu.a("existing", StringArgumentType.string())
                                                .suggests(f)
                                                .executes(
                                                   $$0x -> a(
                                                         (et)$$0x.getSource(),
                                                         a($$0x, "name", true),
                                                         ($$1, $$2) -> $$1.add($$1.indexOf(a($$0x, "existing", false)), $$2)
                                                      )
                                                )
                                          )
                                    ))
                                 .then(eu.a("last").executes($$0x -> a((et)$$0x.getSource(), a($$0x, "name", true), List::add))))
                              .then(eu.a("first").executes($$0x -> a((et)$$0x.getSource(), a($$0x, "name", true), ($$0xx, $$1) -> $$0xx.add(0, $$1))))
                        )
                  ))
               .then(
                  eu.a("disable").then(eu.a("name", StringArgumentType.string()).suggests(f).executes($$0x -> a((et)$$0x.getSource(), a($$0x, "name", false))))
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("list").executes($$0x -> a((et)$$0x.getSource())))
                     .then(eu.a("available").executes($$0x -> b((et)$$0x.getSource()))))
                  .then(eu.a("enabled").executes($$0x -> c((et)$$0x.getSource())))
            )
      );
   }

   private static int a(et $$0, aua $$1, amt.a $$2) throws CommandSyntaxException {
      aud $$3 = $$0.l().aF();
      List<aua> $$4 = Lists.newArrayList($$3.f());
      $$2.apply($$4, $$1);
      $$0.a(() -> xd.a("commands.datapack.modify.enable", $$1.a(true)), true);
      aoh.a($$4.stream().map(aua::g).collect(Collectors.toList()), $$0);
      return $$4.size();
   }

   private static int a(et $$0, aua $$1) {
      aud $$2 = $$0.l().aF();
      List<aua> $$3 = Lists.newArrayList($$2.f());
      $$3.remove($$1);
      $$0.a(() -> xd.a("commands.datapack.modify.disable", $$1.a(true)), true);
      aoh.a($$3.stream().map(aua::g).collect(Collectors.toList()), $$0);
      return $$3.size();
   }

   private static int a(et $$0) {
      return c($$0) + b($$0);
   }

   private static int b(et $$0) {
      aud $$1 = $$0.l().aF();
      $$1.a();
      Collection<aua> $$2 = $$1.f();
      Collection<aua> $$3 = $$1.c();
      cqh $$4 = $$0.w();
      List<aua> $$5 = $$3.stream().filter($$2x -> !$$2.contains($$2x) && $$2x.e().a($$4)).toList();
      if ($$5.isEmpty()) {
         $$0.a(() -> xd.c("commands.datapack.list.available.none"), false);
      } else {
         $$0.a(() -> xd.a("commands.datapack.list.available.success", $$5.size(), xg.b($$5, $$0xx -> $$0xx.a(false))), false);
      }

      return $$5.size();
   }

   private static int c(et $$0) {
      aud $$1 = $$0.l().aF();
      $$1.a();
      Collection<? extends aua> $$2 = $$1.f();
      if ($$2.isEmpty()) {
         $$0.a(() -> xd.c("commands.datapack.list.enabled.none"), false);
      } else {
         $$0.a(() -> xd.a("commands.datapack.list.enabled.success", $$2.size(), xg.b($$2, $$0xx -> $$0xx.a(true))), false);
      }

      return $$2.size();
   }

   private static aua a(CommandContext<et> $$0, String $$1, boolean $$2) throws CommandSyntaxException {
      String $$3 = StringArgumentType.getString($$0, $$1);
      aud $$4 = ((et)$$0.getSource()).l().aF();
      aua $$5 = $$4.c($$3);
      if ($$5 == null) {
         throw a.create($$3);
      } else {
         boolean $$6 = $$4.f().contains($$5);
         if ($$2 && $$6) {
            throw b.create($$3);
         } else if (!$$2 && !$$6) {
            throw c.create($$3);
         } else {
            cqh $$7 = ((et)$$0.getSource()).w();
            cqh $$8 = $$5.e();
            if (!$$2 && !$$8.b() && $$5.l() == aue.d) {
               throw d.create($$3);
            } else if (!$$8.a($$7)) {
               throw e.create($$3, cqj.a($$7, $$8));
            } else {
               return $$5;
            }
         }
      }
   }

   interface a {
      void apply(List<aua> var1, aua var2) throws CommandSyntaxException;
   }
}
