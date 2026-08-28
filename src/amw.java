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

public class amw {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xe.b("commands.datapack.unknown", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xe.b("commands.datapack.enable.failed", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xe.b("commands.datapack.disable.failed", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xe.b("commands.datapack.disable.failed.feature", $$0));
   private static final Dynamic2CommandExceptionType e = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xe.b("commands.datapack.enable.failed.no_flags", $$0, $$1)
   );
   private static final SuggestionProvider<eu> f = ($$0, $$1) -> ez.b(
         ((eu)$$0.getSource()).l().aF().d().stream().map(StringArgumentType::escapeIfRequired), $$1
      );
   private static final SuggestionProvider<eu> g = ($$0, $$1) -> {
      aug $$2 = ((eu)$$0.getSource()).l().aF();
      Collection<String> $$3 = $$2.d();
      cqq $$4 = ((eu)$$0.getSource()).w();
      return ez.b(
         $$2.c().stream().filter($$1x -> $$1x.e().a($$4)).map(aud::g).filter($$1x -> !$$3.contains($$1x)).map(StringArgumentType::escapeIfRequired), $$1
      );
   };

   public static void a(CommandDispatcher<eu> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("datapack").requires($$0x -> $$0x.c(2)))
                  .then(
                     ev.a("enable")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ev.a(
                                             "name", StringArgumentType.string()
                                          )
                                          .suggests(g)
                                          .executes(
                                             $$0x -> a((eu)$$0x.getSource(), a($$0x, "name", true), ($$0xx, $$1) -> $$1.k().a($$0xx, $$1, aud::h, false))
                                          ))
                                       .then(
                                          ev.a("after")
                                             .then(
                                                ev.a("existing", StringArgumentType.string())
                                                   .suggests(f)
                                                   .executes(
                                                      $$0x -> a(
                                                            (eu)$$0x.getSource(),
                                                            a($$0x, "name", true),
                                                            ($$1, $$2) -> $$1.add($$1.indexOf(a($$0x, "existing", false)) + 1, $$2)
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       ev.a("before")
                                          .then(
                                             ev.a("existing", StringArgumentType.string())
                                                .suggests(f)
                                                .executes(
                                                   $$0x -> a(
                                                         (eu)$$0x.getSource(),
                                                         a($$0x, "name", true),
                                                         ($$1, $$2) -> $$1.add($$1.indexOf(a($$0x, "existing", false)), $$2)
                                                      )
                                                )
                                          )
                                    ))
                                 .then(ev.a("last").executes($$0x -> a((eu)$$0x.getSource(), a($$0x, "name", true), List::add))))
                              .then(ev.a("first").executes($$0x -> a((eu)$$0x.getSource(), a($$0x, "name", true), ($$0xx, $$1) -> $$0xx.add(0, $$1))))
                        )
                  ))
               .then(
                  ev.a("disable").then(ev.a("name", StringArgumentType.string()).suggests(f).executes($$0x -> a((eu)$$0x.getSource(), a($$0x, "name", false))))
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("list").executes($$0x -> a((eu)$$0x.getSource())))
                     .then(ev.a("available").executes($$0x -> b((eu)$$0x.getSource()))))
                  .then(ev.a("enabled").executes($$0x -> c((eu)$$0x.getSource())))
            )
      );
   }

   private static int a(eu $$0, aud $$1, amw.a $$2) throws CommandSyntaxException {
      aug $$3 = $$0.l().aF();
      List<aud> $$4 = Lists.newArrayList($$3.f());
      $$2.apply($$4, $$1);
      $$0.a(() -> xe.a("commands.datapack.modify.enable", $$1.a(true)), true);
      aok.a($$4.stream().map(aud::g).collect(Collectors.toList()), $$0);
      return $$4.size();
   }

   private static int a(eu $$0, aud $$1) {
      aug $$2 = $$0.l().aF();
      List<aud> $$3 = Lists.newArrayList($$2.f());
      $$3.remove($$1);
      $$0.a(() -> xe.a("commands.datapack.modify.disable", $$1.a(true)), true);
      aok.a($$3.stream().map(aud::g).collect(Collectors.toList()), $$0);
      return $$3.size();
   }

   private static int a(eu $$0) {
      return c($$0) + b($$0);
   }

   private static int b(eu $$0) {
      aug $$1 = $$0.l().aF();
      $$1.a();
      Collection<aud> $$2 = $$1.f();
      Collection<aud> $$3 = $$1.c();
      cqq $$4 = $$0.w();
      List<aud> $$5 = $$3.stream().filter($$2x -> !$$2.contains($$2x) && $$2x.e().a($$4)).toList();
      if ($$5.isEmpty()) {
         $$0.a(() -> xe.c("commands.datapack.list.available.none"), false);
      } else {
         $$0.a(() -> xe.a("commands.datapack.list.available.success", $$5.size(), xh.b($$5, $$0xx -> $$0xx.a(false))), false);
      }

      return $$5.size();
   }

   private static int c(eu $$0) {
      aug $$1 = $$0.l().aF();
      $$1.a();
      Collection<? extends aud> $$2 = $$1.f();
      if ($$2.isEmpty()) {
         $$0.a(() -> xe.c("commands.datapack.list.enabled.none"), false);
      } else {
         $$0.a(() -> xe.a("commands.datapack.list.enabled.success", $$2.size(), xh.b($$2, $$0xx -> $$0xx.a(true))), false);
      }

      return $$2.size();
   }

   private static aud a(CommandContext<eu> $$0, String $$1, boolean $$2) throws CommandSyntaxException {
      String $$3 = StringArgumentType.getString($$0, $$1);
      aug $$4 = ((eu)$$0.getSource()).l().aF();
      aud $$5 = $$4.c($$3);
      if ($$5 == null) {
         throw a.create($$3);
      } else {
         boolean $$6 = $$4.f().contains($$5);
         if ($$2 && $$6) {
            throw b.create($$3);
         } else if (!$$2 && !$$6) {
            throw c.create($$3);
         } else {
            cqq $$7 = ((eu)$$0.getSource()).w();
            cqq $$8 = $$5.e();
            if (!$$2 && !$$8.b() && $$5.l() == auh.d) {
               throw d.create($$3);
            } else if (!$$8.a($$7)) {
               throw e.create($$3, cqs.a($$7, $$8));
            } else {
               return $$5;
            }
         }
      }
   }

   interface a {
      void apply(List<aud> var1, aud var2) throws CommandSyntaxException;
   }
}
