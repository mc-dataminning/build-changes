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

public class anc {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xc.b("commands.datapack.unknown", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xc.b("commands.datapack.enable.failed", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xc.b("commands.datapack.disable.failed", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xc.b("commands.datapack.disable.failed.feature", $$0));
   private static final Dynamic2CommandExceptionType e = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xc.b("commands.datapack.enable.failed.no_flags", $$0, $$1)
   );
   private static final SuggestionProvider<ek> f = ($$0, $$1) -> ep.b(
         ((ek)$$0.getSource()).l().aF().e().stream().map(StringArgumentType::escapeIfRequired), $$1
      );
   private static final SuggestionProvider<ek> g = ($$0, $$1) -> {
      aur $$2 = ((ek)$$0.getSource()).l().aF();
      Collection<String> $$3 = $$2.e();
      cvj $$4 = ((ek)$$0.getSource()).v();
      return ep.b(
         $$2.d().stream().filter($$1x -> $$1x.e().a($$4)).map(auo::g).filter($$1x -> !$$3.contains($$1x)).map(StringArgumentType::escapeIfRequired), $$1
      );
   };

   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("datapack").requires($$0x -> $$0x.c(2)))
                  .then(
                     el.a("enable")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a(
                                             "name", StringArgumentType.string()
                                          )
                                          .suggests(g)
                                          .executes(
                                             $$0x -> a((ek)$$0x.getSource(), a($$0x, "name", true), ($$0xx, $$1) -> $$1.k().a($$0xx, $$1, auo::h, false))
                                          ))
                                       .then(
                                          el.a("after")
                                             .then(
                                                el.a("existing", StringArgumentType.string())
                                                   .suggests(f)
                                                   .executes(
                                                      $$0x -> a(
                                                            (ek)$$0x.getSource(),
                                                            a($$0x, "name", true),
                                                            ($$1, $$2) -> $$1.add($$1.indexOf(a($$0x, "existing", false)) + 1, $$2)
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       el.a("before")
                                          .then(
                                             el.a("existing", StringArgumentType.string())
                                                .suggests(f)
                                                .executes(
                                                   $$0x -> a(
                                                         (ek)$$0x.getSource(),
                                                         a($$0x, "name", true),
                                                         ($$1, $$2) -> $$1.add($$1.indexOf(a($$0x, "existing", false)), $$2)
                                                      )
                                                )
                                          )
                                    ))
                                 .then(el.a("last").executes($$0x -> a((ek)$$0x.getSource(), a($$0x, "name", true), List::add))))
                              .then(el.a("first").executes($$0x -> a((ek)$$0x.getSource(), a($$0x, "name", true), ($$0xx, $$1) -> $$0xx.add(0, $$1))))
                        )
                  ))
               .then(
                  el.a("disable").then(el.a("name", StringArgumentType.string()).suggests(f).executes($$0x -> a((ek)$$0x.getSource(), a($$0x, "name", false))))
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("list").executes($$0x -> a((ek)$$0x.getSource())))
                     .then(el.a("available").executes($$0x -> b((ek)$$0x.getSource()))))
                  .then(el.a("enabled").executes($$0x -> c((ek)$$0x.getSource())))
            )
      );
   }

   private static int a(ek $$0, auo $$1, anc.a $$2) throws CommandSyntaxException {
      aur $$3 = $$0.l().aF();
      List<auo> $$4 = Lists.newArrayList($$3.g());
      $$2.apply($$4, $$1);
      $$0.a(() -> xc.a("commands.datapack.modify.enable", $$1.a(true)), true);
      aos.a($$4.stream().map(auo::g).collect(Collectors.toList()), $$0);
      return $$4.size();
   }

   private static int a(ek $$0, auo $$1) {
      aur $$2 = $$0.l().aF();
      List<auo> $$3 = Lists.newArrayList($$2.g());
      $$3.remove($$1);
      $$0.a(() -> xc.a("commands.datapack.modify.disable", $$1.a(true)), true);
      aos.a($$3.stream().map(auo::g).collect(Collectors.toList()), $$0);
      return $$3.size();
   }

   private static int a(ek $$0) {
      return c($$0) + b($$0);
   }

   private static int b(ek $$0) {
      aur $$1 = $$0.l().aF();
      $$1.a();
      Collection<auo> $$2 = $$1.g();
      Collection<auo> $$3 = $$1.d();
      cvj $$4 = $$0.v();
      List<auo> $$5 = $$3.stream().filter($$2x -> !$$2.contains($$2x) && $$2x.e().a($$4)).toList();
      if ($$5.isEmpty()) {
         $$0.a(() -> xc.c("commands.datapack.list.available.none"), false);
      } else {
         $$0.a(() -> xc.a("commands.datapack.list.available.success", $$5.size(), xf.b($$5, $$0xx -> $$0xx.a(false))), false);
      }

      return $$5.size();
   }

   private static int c(ek $$0) {
      aur $$1 = $$0.l().aF();
      $$1.a();
      Collection<? extends auo> $$2 = $$1.g();
      if ($$2.isEmpty()) {
         $$0.a(() -> xc.c("commands.datapack.list.enabled.none"), false);
      } else {
         $$0.a(() -> xc.a("commands.datapack.list.enabled.success", $$2.size(), xf.b($$2, $$0xx -> $$0xx.a(true))), false);
      }

      return $$2.size();
   }

   private static auo a(CommandContext<ek> $$0, String $$1, boolean $$2) throws CommandSyntaxException {
      String $$3 = StringArgumentType.getString($$0, $$1);
      aur $$4 = ((ek)$$0.getSource()).l().aF();
      auo $$5 = $$4.c($$3);
      if ($$5 == null) {
         throw a.create($$3);
      } else {
         boolean $$6 = $$4.g().contains($$5);
         if ($$2 && $$6) {
            throw b.create($$3);
         } else if (!$$2 && !$$6) {
            throw c.create($$3);
         } else {
            cvj $$7 = ((ek)$$0.getSource()).v();
            cvj $$8 = $$5.e();
            if (!$$2 && !$$8.b() && $$5.l() == aus.d) {
               throw d.create($$3);
            } else if (!$$8.a($$7)) {
               throw e.create($$3, cvl.a($$7, $$8));
            } else {
               return $$5;
            }
         }
      }
   }

   interface a {
      void apply(List<auo> var1, auo var2) throws CommandSyntaxException;
   }
}
