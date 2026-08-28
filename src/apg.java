import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class apg {
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wy.c("commands.data.merge.failed"));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> wy.b("commands.data.get.invalid", $$0));
   private static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> wy.b("commands.data.get.unknown", $$0));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(wy.c("commands.data.get.multiple"));
   private static final DynamicCommandExceptionType h = new DynamicCommandExceptionType($$0 -> wy.b("commands.data.modify.expected_object", $$0));
   private static final DynamicCommandExceptionType i = new DynamicCommandExceptionType($$0 -> wy.b("commands.data.modify.expected_value", $$0));
   private static final Dynamic2CommandExceptionType j = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> wy.b("commands.data.modify.invalid_substring", $$0, $$1)
   );
   public static final List<Function<String, apg.c>> a = ImmutableList.of(aph.a, ape.a, api.a);
   public static final List<apg.c> b = a.stream().map($$0 -> $$0.apply("target")).collect(ImmutableList.toImmutableList());
   public static final List<apg.c> c = a.stream().map($$0 -> $$0.apply("source")).collect(ImmutableList.toImmutableList());

   public static void a(CommandDispatcher<et> $$0) {
      LiteralArgumentBuilder<et> $$1 = (LiteralArgumentBuilder<et>)eu.a("data").requires($$0x -> $$0x.c(2));

      for (apg.c $$2 : b) {
         ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                     $$2.a(eu.a("merge"), $$1x -> $$1x.then(eu.a("nbt", fd.a()).executes($$1xx -> a((et)$$1xx.getSource(), $$2.a($$1xx), fd.a($$1xx, "nbt")))))
                  ))
                  .then(
                     $$2.a(
                        eu.a("get"),
                        $$1x -> $$1x.executes($$1xx -> a((et)$$1xx.getSource(), $$2.a($$1xx)))
                              .then(
                                 ((RequiredArgumentBuilder)eu.a("path", fl.a()).executes($$1xx -> b((et)$$1xx.getSource(), $$2.a($$1xx), fl.a($$1xx, "path"))))
                                    .then(
                                       eu.a("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             $$1xx -> a((et)$$1xx.getSource(), $$2.a($$1xx), fl.a($$1xx, "path"), DoubleArgumentType.getDouble($$1xx, "scale"))
                                          )
                                    )
                              )
                     )
                  ))
               .then(
                  $$2.a(eu.a("remove"), $$1x -> $$1x.then(eu.a("path", fl.a()).executes($$1xx -> a((et)$$1xx.getSource(), $$2.a($$1xx), fl.a($$1xx, "path")))))
               ))
            .then(
               a(
                  (BiConsumer<ArgumentBuilder<et, ?>, apg.b>)(($$0x, $$1x) -> $$0x.then(
                           eu.a("insert")
                              .then(
                                 eu.a("index", IntegerArgumentType.integer())
                                    .then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(IntegerArgumentType.getInteger($$0xx, "index"), $$1xx, $$3)))
                              )
                        )
                        .then(eu.a("prepend").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(0, $$1xx, $$3))))
                        .then(eu.a("append").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(-1, $$1xx, $$3))))
                        .then(eu.a("set").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a($$1xx, (ux)Iterables.getLast($$3)))))
                        .then(eu.a("merge").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> {
                           ua $$4 = new ua();

                           for (ux $$5 : $$3) {
                              if (fl.g.a($$5, 0)) {
                                 throw fl.b.create();
                              }

                              if (!($$5 instanceof ua $$6)) {
                                 throw h.create($$5);
                              }

                              $$4.a($$6);
                           }

                           Collection<ux> $$7 = $$2x.a($$1xx, ua::new);
                           int $$8 = 0;

                           for (ux $$9 : $$7) {
                              if (!($$9 instanceof ua $$10)) {
                                 throw h.create($$9);
                              }

                              ua $$12 = $$10.i();
                              $$10.a($$4);
                              $$8 += $$12.equals($$10) ? 0 : 1;
                           }

                           return $$8;
                        }))))
               )
            );
      }

      $$0.register($$1);
   }

   private static String a(ux $$0) throws CommandSyntaxException {
      if ($$0.c().d()) {
         return $$0.s_();
      } else {
         throw i.create($$0);
      }
   }

   private static List<ux> a(List<ux> $$0, apg.d $$1) throws CommandSyntaxException {
      List<ux> $$2 = new ArrayList<>($$0.size());

      for (ux $$3 : $$0) {
         String $$4 = a($$3);
         $$2.add(uv.a($$1.process($$4)));
      }

      return $$2;
   }

   private static ArgumentBuilder<et, ?> a(BiConsumer<ArgumentBuilder<et, ?>, apg.b> $$0) {
      LiteralArgumentBuilder<et> $$1 = eu.a("modify");

      for (apg.c $$2 : b) {
         $$2.a(
            $$1,
            $$2x -> {
               ArgumentBuilder<et, ?> $$3 = eu.a("targetPath", fl.a());

               for (apg.c $$4 : c) {
                  $$0.accept(
                     $$3,
                     $$2xx -> $$4.a(
                           eu.a("from"),
                           $$3x -> $$3x.executes($$3xx -> a($$3xx, $$2, $$2xx, a($$3xx, $$4)))
                                 .then(eu.a("sourcePath", fl.a()).executes($$3xx -> a($$3xx, $$2, $$2xx, b($$3xx, $$4))))
                        )
                  );
                  $$0.accept(
                     $$3,
                     $$2xx -> $$4.a(
                           eu.a("string"),
                           $$3x -> $$3x.executes($$3xx -> a($$3xx, $$2, $$2xx, a(a($$3xx, $$4), $$0xxxxx -> $$0xxxxx)))
                                 .then(
                                    ((RequiredArgumentBuilder)eu.a("sourcePath", fl.a())
                                          .executes($$3xx -> a($$3xx, $$2, $$2xx, a(b($$3xx, $$4), $$0xxxxx -> $$0xxxxx))))
                                       .then(
                                          ((RequiredArgumentBuilder)eu.a("start", IntegerArgumentType.integer())
                                                .executes(
                                                   $$3xx -> a(
                                                         $$3xx,
                                                         $$2,
                                                         $$2xx,
                                                         a(b($$3xx, $$4), $$1xxxxx -> a($$1xxxxx, IntegerArgumentType.getInteger($$3xx, "start")))
                                                      )
                                                ))
                                             .then(
                                                eu.a("end", IntegerArgumentType.integer())
                                                   .executes(
                                                      $$3xx -> a(
                                                            $$3xx,
                                                            $$2,
                                                            $$2xx,
                                                            a(
                                                               b($$3xx, $$4),
                                                               $$1xxxxx -> b(
                                                                     $$1xxxxx,
                                                                     IntegerArgumentType.getInteger($$3xx, "start"),
                                                                     IntegerArgumentType.getInteger($$3xx, "end")
                                                                  )
                                                            )
                                                         )
                                                   )
                                             )
                                       )
                                 )
                        )
                  );
               }

               $$0.accept($$3, $$1xx -> eu.a("value").then(eu.a("value", fm.a()).executes($$2xx -> {
                     List<ux> $$3x = Collections.singletonList(fm.a($$2xx, "value"));
                     return a($$2xx, $$2, $$1xx, $$3x);
                  })));
               return $$2x.then($$3);
            }
         );
      }

      return $$1;
   }

   private static String a(String $$0, int $$1, int $$2) throws CommandSyntaxException {
      if ($$1 >= 0 && $$2 <= $$0.length() && $$1 <= $$2) {
         return $$0.substring($$1, $$2);
      } else {
         throw j.create($$1, $$2);
      }
   }

   private static String b(String $$0, int $$1, int $$2) throws CommandSyntaxException {
      int $$3 = $$0.length();
      int $$4 = a($$1, $$3);
      int $$5 = a($$2, $$3);
      return a($$0, $$4, $$5);
   }

   private static String a(String $$0, int $$1) throws CommandSyntaxException {
      int $$2 = $$0.length();
      return a($$0, a($$1, $$2), $$2);
   }

   private static int a(int $$0, int $$1) {
      return $$0 >= 0 ? $$0 : $$1 + $$0;
   }

   private static List<ux> a(CommandContext<et> $$0, apg.c $$1) throws CommandSyntaxException {
      apf $$2 = $$1.a($$0);
      return Collections.singletonList($$2.a());
   }

   private static List<ux> b(CommandContext<et> $$0, apg.c $$1) throws CommandSyntaxException {
      apf $$2 = $$1.a($$0);
      fl.g $$3 = fl.a($$0, "sourcePath");
      return $$3.a($$2.a());
   }

   private static int a(CommandContext<et> $$0, apg.c $$1, apg.a $$2, List<ux> $$3) throws CommandSyntaxException {
      apf $$4 = $$1.a($$0);
      fl.g $$5 = fl.a($$0, "targetPath");
      ua $$6 = $$4.a();
      int $$7 = $$2.modify($$0, $$6, $$5, $$3);
      if ($$7 == 0) {
         throw d.create();
      } else {
         $$4.a($$6);
         ((et)$$0.getSource()).a(() -> $$4.b(), true);
         return $$7;
      }
   }

   private static int a(et $$0, apf $$1, fl.g $$2) throws CommandSyntaxException {
      ua $$3 = $$1.a();
      int $$4 = $$2.c($$3);
      if ($$4 == 0) {
         throw d.create();
      } else {
         $$1.a($$3);
         $$0.a(() -> $$1.b(), true);
         return $$4;
      }
   }

   public static ux a(fl.g $$0, apf $$1) throws CommandSyntaxException {
      Collection<ux> $$2 = $$0.a($$1.a());
      Iterator<ux> $$3 = $$2.iterator();
      ux $$4 = $$3.next();
      if ($$3.hasNext()) {
         throw g.create();
      } else {
         return $$4;
      }
   }

   private static int b(et $$0, apf $$1, fl.g $$2) throws CommandSyntaxException {
      ux $$3 = a($$2, $$1);
      int $$4;
      if ($$3 instanceof uq) {
         $$4 = ayn.a(((uq)$$3).j());
      } else if ($$3 instanceof tz) {
         $$4 = ((tz)$$3).size();
      } else if ($$3 instanceof ua) {
         $$4 = ((ua)$$3).f();
      } else {
         if (!($$3 instanceof uv)) {
            throw f.create($$2.toString());
         }

         $$4 = $$3.s_().length();
      }

      $$0.a(() -> $$1.a($$3), false);
      return $$4;
   }

   private static int a(et $$0, apf $$1, fl.g $$2, double $$3) throws CommandSyntaxException {
      ux $$4 = a($$2, $$1);
      if (!($$4 instanceof uq)) {
         throw e.create($$2.toString());
      } else {
         int $$5 = ayn.a(((uq)$$4).j() * $$3);
         $$0.a(() -> $$1.a($$2, $$3, $$5), false);
         return $$5;
      }
   }

   private static int a(et $$0, apf $$1) throws CommandSyntaxException {
      ua $$2 = $$1.a();
      $$0.a(() -> $$1.a((ux)$$2), false);
      return 1;
   }

   private static int a(et $$0, apf $$1, ua $$2) throws CommandSyntaxException {
      ua $$3 = $$1.a();
      if (fl.g.a($$2, 0)) {
         throw fl.b.create();
      } else {
         ua $$4 = $$3.i().a($$2);
         if ($$3.equals($$4)) {
            throw d.create();
         } else {
            $$1.a($$4);
            $$0.a(() -> $$1.b(), true);
            return 1;
         }
      }
   }

   @FunctionalInterface
   interface a {
      int modify(CommandContext<et> var1, ua var2, fl.g var3, List<ux> var4) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      ArgumentBuilder<et, ?> create(apg.a var1);
   }

   public interface c {
      apf a(CommandContext<et> var1) throws CommandSyntaxException;

      ArgumentBuilder<et, ?> a(ArgumentBuilder<et, ?> var1, Function<ArgumentBuilder<et, ?>, ArgumentBuilder<et, ?>> var2);
   }

   @FunctionalInterface
   interface d {
      String process(String var1) throws CommandSyntaxException;
   }
}
