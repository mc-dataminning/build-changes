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

public class amj {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xe.b("commands.datapack.unknown", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xe.b("commands.datapack.enable.failed", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xe.b("commands.datapack.disable.failed", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xe.b("commands.datapack.disable.failed.feature", $$0));
   private static final Dynamic2CommandExceptionType e = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xe.b("commands.datapack.enable.failed.no_flags", $$0, $$1)
   );
   private static final SuggestionProvider<eh> f = ($$0, $$1) -> em.b(
         ((eh)$$0.getSource()).l().aG().d().stream().map(StringArgumentType::escapeIfRequired), $$1
      );
   private static final SuggestionProvider<eh> g = ($$0, $$1) -> {
      ato $$2 = ((eh)$$0.getSource()).l().aG();
      Collection<String> $$3 = $$2.d();
      cop $$4 = ((eh)$$0.getSource()).w();
      return em.b(
         $$2.c().stream().filter($$1x -> $$1x.e().a($$4)).map(atl::g).filter($$1x -> !$$3.contains($$1x)).map(StringArgumentType::escapeIfRequired), $$1
      );
   };

   public static void a(CommandDispatcher<eh> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("datapack").requires($$0x -> $$0x.c(2)))
                  .then(
                     ei.a("enable")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ei.a(
                                             "name", StringArgumentType.string()
                                          )
                                          .suggests(g)
                                          .executes(
                                             $$0x -> a((eh)$$0x.getSource(), a($$0x, "name", true), ($$0xx, $$1) -> $$1.k().a($$0xx, $$1, atl::h, false))
                                          ))
                                       .then(
                                          ei.a("after")
                                             .then(
                                                ei.a("existing", StringArgumentType.string())
                                                   .suggests(f)
                                                   .executes(
                                                      $$0x -> a(
                                                            (eh)$$0x.getSource(),
                                                            a($$0x, "name", true),
                                                            ($$1, $$2) -> $$1.add($$1.indexOf(a($$0x, "existing", false)) + 1, $$2)
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       ei.a("before")
                                          .then(
                                             ei.a("existing", StringArgumentType.string())
                                                .suggests(f)
                                                .executes(
                                                   $$0x -> a(
                                                         (eh)$$0x.getSource(),
                                                         a($$0x, "name", true),
                                                         ($$1, $$2) -> $$1.add($$1.indexOf(a($$0x, "existing", false)), $$2)
                                                      )
                                                )
                                          )
                                    ))
                                 .then(ei.a("last").executes($$0x -> a((eh)$$0x.getSource(), a($$0x, "name", true), List::add))))
                              .then(ei.a("first").executes($$0x -> a((eh)$$0x.getSource(), a($$0x, "name", true), ($$0xx, $$1) -> $$0xx.add(0, $$1))))
                        )
                  ))
               .then(
                  ei.a("disable").then(ei.a("name", StringArgumentType.string()).suggests(f).executes($$0x -> a((eh)$$0x.getSource(), a($$0x, "name", false))))
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("list").executes($$0x -> a((eh)$$0x.getSource())))
                     .then(ei.a("available").executes($$0x -> b((eh)$$0x.getSource()))))
                  .then(ei.a("enabled").executes($$0x -> c((eh)$$0x.getSource())))
            )
      );
   }

   private static int a(eh $$0, atl $$1, amj.a $$2) throws CommandSyntaxException {
      ato $$3 = $$0.l().aG();
      List<atl> $$4 = Lists.newArrayList($$3.f());
      $$2.apply($$4, $$1);
      $$0.a(() -> xe.a("commands.datapack.modify.enable", $$1.a(true)), true);
      anx.a($$4.stream().map(atl::g).collect(Collectors.toList()), $$0);
      return $$4.size();
   }

   private static int a(eh $$0, atl $$1) {
      ato $$2 = $$0.l().aG();
      List<atl> $$3 = Lists.newArrayList($$2.f());
      $$3.remove($$1);
      $$0.a(() -> xe.a("commands.datapack.modify.disable", $$1.a(true)), true);
      anx.a($$3.stream().map(atl::g).collect(Collectors.toList()), $$0);
      return $$3.size();
   }

   private static int a(eh $$0) {
      return c($$0) + b($$0);
   }

   private static int b(eh $$0) {
      ato $$1 = $$0.l().aG();
      $$1.a();
      Collection<atl> $$2 = $$1.f();
      Collection<atl> $$3 = $$1.c();
      cop $$4 = $$0.w();
      List<atl> $$5 = $$3.stream().filter($$2x -> !$$2.contains($$2x) && $$2x.e().a($$4)).toList();
      if ($$5.isEmpty()) {
         $$0.a(() -> xe.c("commands.datapack.list.available.none"), false);
      } else {
         $$0.a(() -> xe.a("commands.datapack.list.available.success", $$5.size(), xh.b($$5, $$0xx -> $$0xx.a(false))), false);
      }

      return $$5.size();
   }

   private static int c(eh $$0) {
      ato $$1 = $$0.l().aG();
      $$1.a();
      Collection<? extends atl> $$2 = $$1.f();
      if ($$2.isEmpty()) {
         $$0.a(() -> xe.c("commands.datapack.list.enabled.none"), false);
      } else {
         $$0.a(() -> xe.a("commands.datapack.list.enabled.success", $$2.size(), xh.b($$2, $$0xx -> $$0xx.a(true))), false);
      }

      return $$2.size();
   }

   private static atl a(CommandContext<eh> $$0, String $$1, boolean $$2) throws CommandSyntaxException {
      String $$3 = StringArgumentType.getString($$0, $$1);
      ato $$4 = ((eh)$$0.getSource()).l().aG();
      atl $$5 = $$4.c($$3);
      if ($$5 == null) {
         throw a.create($$3);
      } else {
         boolean $$6 = $$4.f().contains($$5);
         if ($$2 && $$6) {
            throw b.create($$3);
         } else if (!$$2 && !$$6) {
            throw c.create($$3);
         } else {
            cop $$7 = ((eh)$$0.getSource()).w();
            cop $$8 = $$5.e();
            if (!$$2 && !$$8.b() && $$5.l() == atp.d) {
               throw d.create($$3);
            } else if (!$$8.a($$7)) {
               throw e.create($$3, cor.a($$7, $$8));
            } else {
               return $$5;
            }
         }
      }
   }

   interface a {
      void apply(List<atl> var1, atl var2) throws CommandSyntaxException;
   }
}
