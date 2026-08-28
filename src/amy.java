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

public class amy {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wy.b("commands.datapack.unknown", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wy.b("commands.datapack.enable.failed", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wy.b("commands.datapack.disable.failed", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wy.b("commands.datapack.disable.failed.feature", $$0));
   private static final Dynamic2CommandExceptionType e = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> wy.b("commands.datapack.enable.failed.no_flags", $$0, $$1)
   );
   private static final SuggestionProvider<ej> f = ($$0, $$1) -> eo.b(
         ((ej)$$0.getSource()).l().aF().e().stream().map(StringArgumentType::escapeIfRequired), $$1
      );
   private static final SuggestionProvider<ej> g = ($$0, $$1) -> {
      aun $$2 = ((ej)$$0.getSource()).l().aF();
      Collection<String> $$3 = $$2.e();
      cut $$4 = ((ej)$$0.getSource()).v();
      return eo.b(
         $$2.d().stream().filter($$1x -> $$1x.e().a($$4)).map(auk::g).filter($$1x -> !$$3.contains($$1x)).map(StringArgumentType::escapeIfRequired), $$1
      );
   };

   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("datapack").requires($$0x -> $$0x.c(2)))
                  .then(
                     ek.a("enable")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ek.a(
                                             "name", StringArgumentType.string()
                                          )
                                          .suggests(g)
                                          .executes(
                                             $$0x -> a((ej)$$0x.getSource(), a($$0x, "name", true), ($$0xx, $$1) -> $$1.k().a($$0xx, $$1, auk::h, false))
                                          ))
                                       .then(
                                          ek.a("after")
                                             .then(
                                                ek.a("existing", StringArgumentType.string())
                                                   .suggests(f)
                                                   .executes(
                                                      $$0x -> a(
                                                            (ej)$$0x.getSource(),
                                                            a($$0x, "name", true),
                                                            ($$1, $$2) -> $$1.add($$1.indexOf(a($$0x, "existing", false)) + 1, $$2)
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       ek.a("before")
                                          .then(
                                             ek.a("existing", StringArgumentType.string())
                                                .suggests(f)
                                                .executes(
                                                   $$0x -> a(
                                                         (ej)$$0x.getSource(),
                                                         a($$0x, "name", true),
                                                         ($$1, $$2) -> $$1.add($$1.indexOf(a($$0x, "existing", false)), $$2)
                                                      )
                                                )
                                          )
                                    ))
                                 .then(ek.a("last").executes($$0x -> a((ej)$$0x.getSource(), a($$0x, "name", true), List::add))))
                              .then(ek.a("first").executes($$0x -> a((ej)$$0x.getSource(), a($$0x, "name", true), ($$0xx, $$1) -> $$0xx.add(0, $$1))))
                        )
                  ))
               .then(
                  ek.a("disable").then(ek.a("name", StringArgumentType.string()).suggests(f).executes($$0x -> a((ej)$$0x.getSource(), a($$0x, "name", false))))
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("list").executes($$0x -> a((ej)$$0x.getSource())))
                     .then(ek.a("available").executes($$0x -> b((ej)$$0x.getSource()))))
                  .then(ek.a("enabled").executes($$0x -> c((ej)$$0x.getSource())))
            )
      );
   }

   private static int a(ej $$0, auk $$1, amy.a $$2) throws CommandSyntaxException {
      aun $$3 = $$0.l().aF();
      List<auk> $$4 = Lists.newArrayList($$3.g());
      $$2.apply($$4, $$1);
      $$0.a(() -> wy.a("commands.datapack.modify.enable", $$1.a(true)), true);
      aoo.a($$4.stream().map(auk::g).collect(Collectors.toList()), $$0);
      return $$4.size();
   }

   private static int a(ej $$0, auk $$1) {
      aun $$2 = $$0.l().aF();
      List<auk> $$3 = Lists.newArrayList($$2.g());
      $$3.remove($$1);
      $$0.a(() -> wy.a("commands.datapack.modify.disable", $$1.a(true)), true);
      aoo.a($$3.stream().map(auk::g).collect(Collectors.toList()), $$0);
      return $$3.size();
   }

   private static int a(ej $$0) {
      return c($$0) + b($$0);
   }

   private static int b(ej $$0) {
      aun $$1 = $$0.l().aF();
      $$1.a();
      Collection<auk> $$2 = $$1.g();
      Collection<auk> $$3 = $$1.d();
      cut $$4 = $$0.v();
      List<auk> $$5 = $$3.stream().filter($$2x -> !$$2.contains($$2x) && $$2x.e().a($$4)).toList();
      if ($$5.isEmpty()) {
         $$0.a(() -> wy.c("commands.datapack.list.available.none"), false);
      } else {
         $$0.a(() -> wy.a("commands.datapack.list.available.success", $$5.size(), xb.b($$5, $$0xx -> $$0xx.a(false))), false);
      }

      return $$5.size();
   }

   private static int c(ej $$0) {
      aun $$1 = $$0.l().aF();
      $$1.a();
      Collection<? extends auk> $$2 = $$1.g();
      if ($$2.isEmpty()) {
         $$0.a(() -> wy.c("commands.datapack.list.enabled.none"), false);
      } else {
         $$0.a(() -> wy.a("commands.datapack.list.enabled.success", $$2.size(), xb.b($$2, $$0xx -> $$0xx.a(true))), false);
      }

      return $$2.size();
   }

   private static auk a(CommandContext<ej> $$0, String $$1, boolean $$2) throws CommandSyntaxException {
      String $$3 = StringArgumentType.getString($$0, $$1);
      aun $$4 = ((ej)$$0.getSource()).l().aF();
      auk $$5 = $$4.c($$3);
      if ($$5 == null) {
         throw a.create($$3);
      } else {
         boolean $$6 = $$4.g().contains($$5);
         if ($$2 && $$6) {
            throw b.create($$3);
         } else if (!$$2 && !$$6) {
            throw c.create($$3);
         } else {
            cut $$7 = ((ej)$$0.getSource()).v();
            cut $$8 = $$5.e();
            if (!$$2 && !$$8.b() && $$5.l() == auo.d) {
               throw d.create($$3);
            } else if (!$$8.a($$7)) {
               throw e.create($$3, cuv.a($$7, $$8));
            } else {
               return $$5;
            }
         }
      }
   }

   interface a {
      void apply(List<auk> var1, auk var2) throws CommandSyntaxException;
   }
}
