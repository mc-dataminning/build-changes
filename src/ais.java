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

public class ais {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> vd.b("commands.datapack.unknown", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vd.b("commands.datapack.enable.failed", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> vd.b("commands.datapack.disable.failed", $$0));
   private static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> vd.b("commands.datapack.enable.failed.no_flags", $$0, $$1)
   );
   private static final SuggestionProvider<ds> e = ($$0, $$1) -> dx.b(
         ((ds)$$0.getSource()).l().aD().d().stream().map(StringArgumentType::escapeIfRequired), $$1
      );
   private static final SuggestionProvider<ds> f = ($$0, $$1) -> {
      apn $$2 = ((ds)$$0.getSource()).l().aD();
      Collection<String> $$3 = $$2.d();
      chl $$4 = ((ds)$$0.getSource()).w();
      return dx.b(
         $$2.c().stream().filter($$1x -> $$1x.d().a($$4)).map(apk::f).filter($$1x -> !$$3.contains($$1x)).map(StringArgumentType::escapeIfRequired), $$1
      );
   };

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("datapack").requires($$0x -> $$0x.c(2)))
                  .then(
                     dt.a("enable")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a(
                                             "name", StringArgumentType.string()
                                          )
                                          .suggests(f)
                                          .executes(
                                             $$0x -> a(
                                                   (ds)$$0x.getSource(), a($$0x, "name", true), ($$0xx, $$1) -> $$1.i().a($$0xx, $$1, $$0xxx -> $$0xxx, false)
                                                )
                                          ))
                                       .then(
                                          dt.a("after")
                                             .then(
                                                dt.a("existing", StringArgumentType.string())
                                                   .suggests(e)
                                                   .executes(
                                                      $$0x -> a(
                                                            (ds)$$0x.getSource(),
                                                            a($$0x, "name", true),
                                                            ($$1, $$2) -> $$1.add($$1.indexOf(a($$0x, "existing", false)) + 1, $$2)
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       dt.a("before")
                                          .then(
                                             dt.a("existing", StringArgumentType.string())
                                                .suggests(e)
                                                .executes(
                                                   $$0x -> a(
                                                         (ds)$$0x.getSource(),
                                                         a($$0x, "name", true),
                                                         ($$1, $$2) -> $$1.add($$1.indexOf(a($$0x, "existing", false)), $$2)
                                                      )
                                                )
                                          )
                                    ))
                                 .then(dt.a("last").executes($$0x -> a((ds)$$0x.getSource(), a($$0x, "name", true), List::add))))
                              .then(dt.a("first").executes($$0x -> a((ds)$$0x.getSource(), a($$0x, "name", true), ($$0xx, $$1) -> $$0xx.add(0, $$1))))
                        )
                  ))
               .then(
                  dt.a("disable").then(dt.a("name", StringArgumentType.string()).suggests(e).executes($$0x -> a((ds)$$0x.getSource(), a($$0x, "name", false))))
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("list").executes($$0x -> a((ds)$$0x.getSource())))
                     .then(dt.a("available").executes($$0x -> b((ds)$$0x.getSource()))))
                  .then(dt.a("enabled").executes($$0x -> c((ds)$$0x.getSource())))
            )
      );
   }

   private static int a(ds $$0, apk $$1, ais.a $$2) throws CommandSyntaxException {
      apn $$3 = $$0.l().aD();
      List<apk> $$4 = Lists.newArrayList($$3.f());
      $$2.apply($$4, $$1);
      $$0.a(() -> vd.a("commands.datapack.modify.enable", $$1.a(true)), true);
      akg.a($$4.stream().map(apk::f).collect(Collectors.toList()), $$0);
      return $$4.size();
   }

   private static int a(ds $$0, apk $$1) {
      apn $$2 = $$0.l().aD();
      List<apk> $$3 = Lists.newArrayList($$2.f());
      $$3.remove($$1);
      $$0.a(() -> vd.a("commands.datapack.modify.disable", $$1.a(true)), true);
      akg.a($$3.stream().map(apk::f).collect(Collectors.toList()), $$0);
      return $$3.size();
   }

   private static int a(ds $$0) {
      return c($$0) + b($$0);
   }

   private static int b(ds $$0) {
      apn $$1 = $$0.l().aD();
      $$1.a();
      Collection<apk> $$2 = $$1.f();
      Collection<apk> $$3 = $$1.c();
      chl $$4 = $$0.w();
      List<apk> $$5 = $$3.stream().filter($$2x -> !$$2.contains($$2x) && $$2x.d().a($$4)).toList();
      if ($$5.isEmpty()) {
         $$0.a(() -> vd.c("commands.datapack.list.available.none"), false);
      } else {
         $$0.a(() -> vd.a("commands.datapack.list.available.success", $$5.size(), vg.b($$5, $$0xx -> $$0xx.a(false))), false);
      }

      return $$5.size();
   }

   private static int c(ds $$0) {
      apn $$1 = $$0.l().aD();
      $$1.a();
      Collection<? extends apk> $$2 = $$1.f();
      if ($$2.isEmpty()) {
         $$0.a(() -> vd.c("commands.datapack.list.enabled.none"), false);
      } else {
         $$0.a(() -> vd.a("commands.datapack.list.enabled.success", $$2.size(), vg.b($$2, $$0xx -> $$0xx.a(true))), false);
      }

      return $$2.size();
   }

   private static apk a(CommandContext<ds> $$0, String $$1, boolean $$2) throws CommandSyntaxException {
      String $$3 = StringArgumentType.getString($$0, $$1);
      apn $$4 = ((ds)$$0.getSource()).l().aD();
      apk $$5 = $$4.c($$3);
      if ($$5 == null) {
         throw a.create($$3);
      } else {
         boolean $$6 = $$4.f().contains($$5);
         if ($$2 && $$6) {
            throw b.create($$3);
         } else if (!$$2 && !$$6) {
            throw c.create($$3);
         } else {
            chl $$7 = ((ds)$$0.getSource()).w();
            chl $$8 = $$5.d();
            if (!$$8.a($$7)) {
               throw d.create($$3, chn.a($$7, $$8));
            } else {
               return $$5;
            }
         }
      }
   }

   interface a {
      void apply(List<apk> var1, apk var2) throws CommandSyntaxException;
   }
}
