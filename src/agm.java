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

public class agm {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> tn.a("commands.datapack.unknown", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> tn.a("commands.datapack.enable.failed", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> tn.a("commands.datapack.disable.failed", $$0));
   private static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> tn.a("commands.datapack.enable.failed.no_flags", $$0, $$1)
   );
   private static final SuggestionProvider<dt> e = ($$0, $$1) -> dw.b(
         ((dt)$$0.getSource()).l().aB().d().stream().map(StringArgumentType::escapeIfRequired), $$1
      );
   private static final SuggestionProvider<dt> f = ($$0, $$1) -> {
      ang $$2 = ((dt)$$0.getSource()).l().aB();
      Collection<String> $$3 = $$2.d();
      cee $$4 = ((dt)$$0.getSource()).w();
      return dw.b(
         $$2.c().stream().filter($$1x -> $$1x.d().a($$4)).map(and::f).filter($$1x -> !$$3.contains($$1x)).map(StringArgumentType::escapeIfRequired), $$1
      );
   };

   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("datapack").requires($$0x -> $$0x.c(2)))
                  .then(
                     du.a("enable")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)du.a(
                                             "name", StringArgumentType.string()
                                          )
                                          .suggests(f)
                                          .executes(
                                             $$0x -> a(
                                                   (dt)$$0x.getSource(), a($$0x, "name", true), ($$0xx, $$1) -> $$1.i().a($$0xx, $$1, $$0xxx -> $$0xxx, false)
                                                )
                                          ))
                                       .then(
                                          du.a("after")
                                             .then(
                                                du.a("existing", StringArgumentType.string())
                                                   .suggests(e)
                                                   .executes(
                                                      $$0x -> a(
                                                            (dt)$$0x.getSource(),
                                                            a($$0x, "name", true),
                                                            ($$1, $$2) -> $$1.add($$1.indexOf(a($$0x, "existing", false)) + 1, $$2)
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       du.a("before")
                                          .then(
                                             du.a("existing", StringArgumentType.string())
                                                .suggests(e)
                                                .executes(
                                                   $$0x -> a(
                                                         (dt)$$0x.getSource(),
                                                         a($$0x, "name", true),
                                                         ($$1, $$2) -> $$1.add($$1.indexOf(a($$0x, "existing", false)), $$2)
                                                      )
                                                )
                                          )
                                    ))
                                 .then(du.a("last").executes($$0x -> a((dt)$$0x.getSource(), a($$0x, "name", true), List::add))))
                              .then(du.a("first").executes($$0x -> a((dt)$$0x.getSource(), a($$0x, "name", true), ($$0xx, $$1) -> $$0xx.add(0, $$1))))
                        )
                  ))
               .then(
                  du.a("disable").then(du.a("name", StringArgumentType.string()).suggests(e).executes($$0x -> a((dt)$$0x.getSource(), a($$0x, "name", false))))
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("list").executes($$0x -> a((dt)$$0x.getSource())))
                     .then(du.a("available").executes($$0x -> b((dt)$$0x.getSource()))))
                  .then(du.a("enabled").executes($$0x -> c((dt)$$0x.getSource())))
            )
      );
   }

   private static int a(dt $$0, and $$1, agm.a $$2) throws CommandSyntaxException {
      ang $$3 = $$0.l().aB();
      List<and> $$4 = Lists.newArrayList($$3.f());
      $$2.apply($$4, $$1);
      $$0.a(() -> tn.a("commands.datapack.modify.enable", $$1.a(true)), true);
      aia.a($$4.stream().map(and::f).collect(Collectors.toList()), $$0);
      return $$4.size();
   }

   private static int a(dt $$0, and $$1) {
      ang $$2 = $$0.l().aB();
      List<and> $$3 = Lists.newArrayList($$2.f());
      $$3.remove($$1);
      $$0.a(() -> tn.a("commands.datapack.modify.disable", $$1.a(true)), true);
      aia.a($$3.stream().map(and::f).collect(Collectors.toList()), $$0);
      return $$3.size();
   }

   private static int a(dt $$0) {
      return c($$0) + b($$0);
   }

   private static int b(dt $$0) {
      ang $$1 = $$0.l().aB();
      $$1.a();
      Collection<and> $$2 = $$1.f();
      Collection<and> $$3 = $$1.c();
      cee $$4 = $$0.w();
      List<and> $$5 = $$3.stream().filter($$2x -> !$$2.contains($$2x) && $$2x.d().a($$4)).toList();
      if ($$5.isEmpty()) {
         $$0.a(() -> tn.c("commands.datapack.list.available.none"), false);
      } else {
         $$0.a(() -> tn.a("commands.datapack.list.available.success", $$5.size(), tp.b($$5, $$0xx -> $$0xx.a(false))), false);
      }

      return $$5.size();
   }

   private static int c(dt $$0) {
      ang $$1 = $$0.l().aB();
      $$1.a();
      Collection<? extends and> $$2 = $$1.f();
      if ($$2.isEmpty()) {
         $$0.a(() -> tn.c("commands.datapack.list.enabled.none"), false);
      } else {
         $$0.a(() -> tn.a("commands.datapack.list.enabled.success", $$2.size(), tp.b($$2, $$0xx -> $$0xx.a(true))), false);
      }

      return $$2.size();
   }

   private static and a(CommandContext<dt> $$0, String $$1, boolean $$2) throws CommandSyntaxException {
      String $$3 = StringArgumentType.getString($$0, $$1);
      ang $$4 = ((dt)$$0.getSource()).l().aB();
      and $$5 = $$4.c($$3);
      if ($$5 == null) {
         throw a.create($$3);
      } else {
         boolean $$6 = $$4.f().contains($$5);
         if ($$2 && $$6) {
            throw b.create($$3);
         } else if (!$$2 && !$$6) {
            throw c.create($$3);
         } else {
            cee $$7 = ((dt)$$0.getSource()).w();
            cee $$8 = $$5.d();
            if (!$$8.a($$7)) {
               throw d.create($$3, ceg.a($$7, $$8));
            } else {
               return $$5;
            }
         }
      }
   }

   interface a {
      void apply(List<and> var1, and var2) throws CommandSyntaxException;
   }
}
