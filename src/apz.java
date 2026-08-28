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

public class apz {
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xi.c("commands.data.merge.failed"));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xi.b("commands.data.get.invalid", $$0));
   private static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> xi.b("commands.data.get.unknown", $$0));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(xi.c("commands.data.get.multiple"));
   private static final DynamicCommandExceptionType h = new DynamicCommandExceptionType($$0 -> xi.b("commands.data.modify.expected_object", $$0));
   private static final DynamicCommandExceptionType i = new DynamicCommandExceptionType($$0 -> xi.b("commands.data.modify.expected_value", $$0));
   private static final Dynamic2CommandExceptionType j = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xi.b("commands.data.modify.invalid_substring", $$0, $$1)
   );
   public static final List<Function<String, apz.c>> a = ImmutableList.of(aqa.a, apx.a, aqb.a);
   public static final List<apz.c> b = a.stream().map($$0 -> $$0.apply("target")).collect(ImmutableList.toImmutableList());
   public static final List<apz.c> c = a.stream().map($$0 -> $$0.apply("source")).collect(ImmutableList.toImmutableList());

   public static void a(CommandDispatcher<ew> $$0) {
      LiteralArgumentBuilder<ew> $$1 = (LiteralArgumentBuilder<ew>)ex.a("data").requires($$0x -> $$0x.c(2));

      for (apz.c $$2 : b) {
         ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                     $$2.a(ex.a("merge"), $$1x -> $$1x.then(ex.a("nbt", fg.a()).executes($$1xx -> a((ew)$$1xx.getSource(), $$2.a($$1xx), fg.a($$1xx, "nbt")))))
                  ))
                  .then(
                     $$2.a(
                        ex.a("get"),
                        $$1x -> $$1x.executes($$1xx -> a((ew)$$1xx.getSource(), $$2.a($$1xx)))
                              .then(
                                 ((RequiredArgumentBuilder)ex.a("path", fo.a()).executes($$1xx -> b((ew)$$1xx.getSource(), $$2.a($$1xx), fo.a($$1xx, "path"))))
                                    .then(
                                       ex.a("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             $$1xx -> a((ew)$$1xx.getSource(), $$2.a($$1xx), fo.a($$1xx, "path"), DoubleArgumentType.getDouble($$1xx, "scale"))
                                          )
                                    )
                              )
                     )
                  ))
               .then(
                  $$2.a(ex.a("remove"), $$1x -> $$1x.then(ex.a("path", fo.a()).executes($$1xx -> a((ew)$$1xx.getSource(), $$2.a($$1xx), fo.a($$1xx, "path")))))
               ))
            .then(
               a(
                  (BiConsumer<ArgumentBuilder<ew, ?>, apz.b>)(($$0x, $$1x) -> $$0x.then(
                           ex.a("insert")
                              .then(
                                 ex.a("index", IntegerArgumentType.integer())
                                    .then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(IntegerArgumentType.getInteger($$0xx, "index"), $$1xx, $$3)))
                              )
                        )
                        .then(ex.a("prepend").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(0, $$1xx, $$3))))
                        .then(ex.a("append").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(-1, $$1xx, $$3))))
                        .then(ex.a("set").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a($$1xx, (vh)Iterables.getLast($$3)))))
                        .then(ex.a("merge").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> {
                           uk $$4 = new uk();

                           for (vh $$5 : $$3) {
                              if (fo.g.a($$5, 0)) {
                                 throw fo.b.create();
                              }

                              if (!($$5 instanceof uk $$6)) {
                                 throw h.create($$5);
                              }

                              $$4.a($$6);
                           }

                           Collection<vh> $$7 = $$2x.a($$1xx, uk::new);
                           int $$8 = 0;

                           for (vh $$9 : $$7) {
                              if (!($$9 instanceof uk $$10)) {
                                 throw h.create($$9);
                              }

                              uk $$12 = $$10.i();
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

   private static String a(vh $$0) throws CommandSyntaxException {
      if ($$0.c().d()) {
         return $$0.s_();
      } else {
         throw i.create($$0);
      }
   }

   private static List<vh> a(List<vh> $$0, apz.d $$1) throws CommandSyntaxException {
      List<vh> $$2 = new ArrayList<>($$0.size());

      for (vh $$3 : $$0) {
         String $$4 = a($$3);
         $$2.add(vf.a($$1.process($$4)));
      }

      return $$2;
   }

   private static ArgumentBuilder<ew, ?> a(BiConsumer<ArgumentBuilder<ew, ?>, apz.b> $$0) {
      LiteralArgumentBuilder<ew> $$1 = ex.a("modify");

      for (apz.c $$2 : b) {
         $$2.a(
            $$1,
            $$2x -> {
               ArgumentBuilder<ew, ?> $$3 = ex.a("targetPath", fo.a());

               for (apz.c $$4 : c) {
                  $$0.accept(
                     $$3,
                     $$2xx -> $$4.a(
                           ex.a("from"),
                           $$3x -> $$3x.executes($$3xx -> a($$3xx, $$2, $$2xx, a($$3xx, $$4)))
                                 .then(ex.a("sourcePath", fo.a()).executes($$3xx -> a($$3xx, $$2, $$2xx, b($$3xx, $$4))))
                        )
                  );
                  $$0.accept(
                     $$3,
                     $$2xx -> $$4.a(
                           ex.a("string"),
                           $$3x -> $$3x.executes($$3xx -> a($$3xx, $$2, $$2xx, a(a($$3xx, $$4), $$0xxxxx -> $$0xxxxx)))
                                 .then(
                                    ((RequiredArgumentBuilder)ex.a("sourcePath", fo.a())
                                          .executes($$3xx -> a($$3xx, $$2, $$2xx, a(b($$3xx, $$4), $$0xxxxx -> $$0xxxxx))))
                                       .then(
                                          ((RequiredArgumentBuilder)ex.a("start", IntegerArgumentType.integer())
                                                .executes(
                                                   $$3xx -> a(
                                                         $$3xx,
                                                         $$2,
                                                         $$2xx,
                                                         a(b($$3xx, $$4), $$1xxxxx -> a($$1xxxxx, IntegerArgumentType.getInteger($$3xx, "start")))
                                                      )
                                                ))
                                             .then(
                                                ex.a("end", IntegerArgumentType.integer())
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

               $$0.accept($$3, $$1xx -> ex.a("value").then(ex.a("value", fp.a()).executes($$2xx -> {
                     List<vh> $$3x = Collections.singletonList(fp.a($$2xx, "value"));
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

   private static List<vh> a(CommandContext<ew> $$0, apz.c $$1) throws CommandSyntaxException {
      apy $$2 = $$1.a($$0);
      return Collections.singletonList($$2.a());
   }

   private static List<vh> b(CommandContext<ew> $$0, apz.c $$1) throws CommandSyntaxException {
      apy $$2 = $$1.a($$0);
      fo.g $$3 = fo.a($$0, "sourcePath");
      return $$3.a($$2.a());
   }

   private static int a(CommandContext<ew> $$0, apz.c $$1, apz.a $$2, List<vh> $$3) throws CommandSyntaxException {
      apy $$4 = $$1.a($$0);
      fo.g $$5 = fo.a($$0, "targetPath");
      uk $$6 = $$4.a();
      int $$7 = $$2.modify($$0, $$6, $$5, $$3);
      if ($$7 == 0) {
         throw d.create();
      } else {
         $$4.a($$6);
         ((ew)$$0.getSource()).a(() -> $$4.b(), true);
         return $$7;
      }
   }

   private static int a(ew $$0, apy $$1, fo.g $$2) throws CommandSyntaxException {
      uk $$3 = $$1.a();
      int $$4 = $$2.c($$3);
      if ($$4 == 0) {
         throw d.create();
      } else {
         $$1.a($$3);
         $$0.a(() -> $$1.b(), true);
         return $$4;
      }
   }

   public static vh a(fo.g $$0, apy $$1) throws CommandSyntaxException {
      Collection<vh> $$2 = $$0.a($$1.a());
      Iterator<vh> $$3 = $$2.iterator();
      vh $$4 = $$3.next();
      if ($$3.hasNext()) {
         throw g.create();
      } else {
         return $$4;
      }
   }

   private static int b(ew $$0, apy $$1, fo.g $$2) throws CommandSyntaxException {
      vh $$3 = a($$2, $$1);
      int $$4;
      if ($$3 instanceof va) {
         $$4 = azk.a(((va)$$3).j());
      } else if ($$3 instanceof uj) {
         $$4 = ((uj)$$3).size();
      } else if ($$3 instanceof uk) {
         $$4 = ((uk)$$3).f();
      } else {
         if (!($$3 instanceof vf)) {
            throw f.create($$2.toString());
         }

         $$4 = $$3.s_().length();
      }

      $$0.a(() -> $$1.a($$3), false);
      return $$4;
   }

   private static int a(ew $$0, apy $$1, fo.g $$2, double $$3) throws CommandSyntaxException {
      vh $$4 = a($$2, $$1);
      if (!($$4 instanceof va)) {
         throw e.create($$2.toString());
      } else {
         int $$5 = azk.a(((va)$$4).j() * $$3);
         $$0.a(() -> $$1.a($$2, $$3, $$5), false);
         return $$5;
      }
   }

   private static int a(ew $$0, apy $$1) throws CommandSyntaxException {
      uk $$2 = $$1.a();
      $$0.a(() -> $$1.a((vh)$$2), false);
      return 1;
   }

   private static int a(ew $$0, apy $$1, uk $$2) throws CommandSyntaxException {
      uk $$3 = $$1.a();
      if (fo.g.a($$2, 0)) {
         throw fo.b.create();
      } else {
         uk $$4 = $$3.i().a($$2);
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
      int modify(CommandContext<ew> var1, uk var2, fo.g var3, List<vh> var4) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      ArgumentBuilder<ew, ?> create(apz.a var1);
   }

   public interface c {
      apy a(CommandContext<ew> var1) throws CommandSyntaxException;

      ArgumentBuilder<ew, ?> a(ArgumentBuilder<ew, ?> var1, Function<ArgumentBuilder<ew, ?>, ArgumentBuilder<ew, ?>> var2);
   }

   @FunctionalInterface
   interface d {
      String process(String var1) throws CommandSyntaxException;
   }
}
