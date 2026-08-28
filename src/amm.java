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

public class amm {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wo.b("commands.datapack.unknown", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wo.b("commands.datapack.enable.failed", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wo.b("commands.datapack.disable.failed", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wo.b("commands.datapack.disable.failed.feature", $$0));
   private static final Dynamic2CommandExceptionType e = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> wo.b("commands.datapack.enable.failed.no_flags", $$0, $$1)
   );
   private static final SuggestionProvider<ex> f = ($$0, $$1) -> fc.b(
         ((ex)$$0.getSource()).l().aF().e().stream().map(StringArgumentType::escapeIfRequired), $$1
      );
   private static final SuggestionProvider<ex> g = ($$0, $$1) -> {
      atz $$2 = ((ex)$$0.getSource()).l().aF();
      Collection<String> $$3 = $$2.e();
      crr $$4 = ((ex)$$0.getSource()).v();
      return fc.b(
         $$2.d().stream().filter($$1x -> $$1x.e().a($$4)).map(atw::g).filter($$1x -> !$$3.contains($$1x)).map(StringArgumentType::escapeIfRequired), $$1
      );
   };

   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("datapack").requires($$0x -> $$0x.c(2)))
                  .then(
                     ey.a("enable")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ey.a(
                                             "name", StringArgumentType.string()
                                          )
                                          .suggests(g)
                                          .executes(
                                             $$0x -> a((ex)$$0x.getSource(), a($$0x, "name", true), ($$0xx, $$1) -> $$1.k().a($$0xx, $$1, atw::h, false))
                                          ))
                                       .then(
                                          ey.a("after")
                                             .then(
                                                ey.a("existing", StringArgumentType.string())
                                                   .suggests(f)
                                                   .executes(
                                                      $$0x -> a(
                                                            (ex)$$0x.getSource(),
                                                            a($$0x, "name", true),
                                                            ($$1, $$2) -> $$1.add($$1.indexOf(a($$0x, "existing", false)) + 1, $$2)
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       ey.a("before")
                                          .then(
                                             ey.a("existing", StringArgumentType.string())
                                                .suggests(f)
                                                .executes(
                                                   $$0x -> a(
                                                         (ex)$$0x.getSource(),
                                                         a($$0x, "name", true),
                                                         ($$1, $$2) -> $$1.add($$1.indexOf(a($$0x, "existing", false)), $$2)
                                                      )
                                                )
                                          )
                                    ))
                                 .then(ey.a("last").executes($$0x -> a((ex)$$0x.getSource(), a($$0x, "name", true), List::add))))
                              .then(ey.a("first").executes($$0x -> a((ex)$$0x.getSource(), a($$0x, "name", true), ($$0xx, $$1) -> $$0xx.add(0, $$1))))
                        )
                  ))
               .then(
                  ey.a("disable").then(ey.a("name", StringArgumentType.string()).suggests(f).executes($$0x -> a((ex)$$0x.getSource(), a($$0x, "name", false))))
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("list").executes($$0x -> a((ex)$$0x.getSource())))
                     .then(ey.a("available").executes($$0x -> b((ex)$$0x.getSource()))))
                  .then(ey.a("enabled").executes($$0x -> c((ex)$$0x.getSource())))
            )
      );
   }

   private static int a(ex $$0, atw $$1, amm.a $$2) throws CommandSyntaxException {
      atz $$3 = $$0.l().aF();
      List<atw> $$4 = Lists.newArrayList($$3.g());
      $$2.apply($$4, $$1);
      $$0.a(() -> wo.a("commands.datapack.modify.enable", $$1.a(true)), true);
      aob.a($$4.stream().map(atw::g).collect(Collectors.toList()), $$0);
      return $$4.size();
   }

   private static int a(ex $$0, atw $$1) {
      atz $$2 = $$0.l().aF();
      List<atw> $$3 = Lists.newArrayList($$2.g());
      $$3.remove($$1);
      $$0.a(() -> wo.a("commands.datapack.modify.disable", $$1.a(true)), true);
      aob.a($$3.stream().map(atw::g).collect(Collectors.toList()), $$0);
      return $$3.size();
   }

   private static int a(ex $$0) {
      return c($$0) + b($$0);
   }

   private static int b(ex $$0) {
      atz $$1 = $$0.l().aF();
      $$1.a();
      Collection<atw> $$2 = $$1.g();
      Collection<atw> $$3 = $$1.d();
      crr $$4 = $$0.v();
      List<atw> $$5 = $$3.stream().filter($$2x -> !$$2.contains($$2x) && $$2x.e().a($$4)).toList();
      if ($$5.isEmpty()) {
         $$0.a(() -> wo.c("commands.datapack.list.available.none"), false);
      } else {
         $$0.a(() -> wo.a("commands.datapack.list.available.success", $$5.size(), wr.b($$5, $$0xx -> $$0xx.a(false))), false);
      }

      return $$5.size();
   }

   private static int c(ex $$0) {
      atz $$1 = $$0.l().aF();
      $$1.a();
      Collection<? extends atw> $$2 = $$1.g();
      if ($$2.isEmpty()) {
         $$0.a(() -> wo.c("commands.datapack.list.enabled.none"), false);
      } else {
         $$0.a(() -> wo.a("commands.datapack.list.enabled.success", $$2.size(), wr.b($$2, $$0xx -> $$0xx.a(true))), false);
      }

      return $$2.size();
   }

   private static atw a(CommandContext<ex> $$0, String $$1, boolean $$2) throws CommandSyntaxException {
      String $$3 = StringArgumentType.getString($$0, $$1);
      atz $$4 = ((ex)$$0.getSource()).l().aF();
      atw $$5 = $$4.c($$3);
      if ($$5 == null) {
         throw a.create($$3);
      } else {
         boolean $$6 = $$4.g().contains($$5);
         if ($$2 && $$6) {
            throw b.create($$3);
         } else if (!$$2 && !$$6) {
            throw c.create($$3);
         } else {
            crr $$7 = ((ex)$$0.getSource()).v();
            crr $$8 = $$5.e();
            if (!$$2 && !$$8.b() && $$5.l() == aua.d) {
               throw d.create($$3);
            } else if (!$$8.a($$7)) {
               throw e.create($$3, crt.a($$7, $$8));
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
