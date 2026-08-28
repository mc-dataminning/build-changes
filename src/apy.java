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

public class apy {
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(ww.c("commands.data.merge.failed"));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> ww.b("commands.data.get.invalid", $$0));
   private static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> ww.b("commands.data.get.unknown", $$0));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(ww.c("commands.data.get.multiple"));
   private static final DynamicCommandExceptionType h = new DynamicCommandExceptionType($$0 -> ww.b("commands.data.modify.expected_object", $$0));
   private static final DynamicCommandExceptionType i = new DynamicCommandExceptionType($$0 -> ww.b("commands.data.modify.expected_value", $$0));
   private static final Dynamic2CommandExceptionType j = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> ww.b("commands.data.modify.invalid_substring", $$0, $$1)
   );
   public static final List<Function<String, apy.c>> a = ImmutableList.of(apz.a, apw.a, aqa.a);
   public static final List<apy.c> b = a.stream().map($$0 -> $$0.apply("target")).collect(ImmutableList.toImmutableList());
   public static final List<apy.c> c = a.stream().map($$0 -> $$0.apply("source")).collect(ImmutableList.toImmutableList());

   public static void a(CommandDispatcher<ei> $$0) {
      LiteralArgumentBuilder<ei> $$1 = (LiteralArgumentBuilder<ei>)ej.a("data").requires($$0x -> $$0x.c(2));

      for (apy.c $$2 : b) {
         ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                     $$2.a(ej.a("merge"), $$1x -> $$1x.then(ej.a("nbt", es.a()).executes($$1xx -> a((ei)$$1xx.getSource(), $$2.a($$1xx), es.a($$1xx, "nbt")))))
                  ))
                  .then(
                     $$2.a(
                        ej.a("get"),
                        $$1x -> $$1x.executes($$1xx -> a((ei)$$1xx.getSource(), $$2.a($$1xx)))
                              .then(
                                 ((RequiredArgumentBuilder)ej.a("path", fa.a()).executes($$1xx -> b((ei)$$1xx.getSource(), $$2.a($$1xx), fa.a($$1xx, "path"))))
                                    .then(
                                       ej.a("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             $$1xx -> a((ei)$$1xx.getSource(), $$2.a($$1xx), fa.a($$1xx, "path"), DoubleArgumentType.getDouble($$1xx, "scale"))
                                          )
                                    )
                              )
                     )
                  ))
               .then(
                  $$2.a(ej.a("remove"), $$1x -> $$1x.then(ej.a("path", fa.a()).executes($$1xx -> a((ei)$$1xx.getSource(), $$2.a($$1xx), fa.a($$1xx, "path")))))
               ))
            .then(
               a(
                  (BiConsumer<ArgumentBuilder<ei, ?>, apy.b>)(($$0x, $$1x) -> $$0x.then(
                           ej.a("insert")
                              .then(
                                 ej.a("index", IntegerArgumentType.integer())
                                    .then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(IntegerArgumentType.getInteger($$0xx, "index"), $$1xx, $$3)))
                              )
                        )
                        .then(ej.a("prepend").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(0, $$1xx, $$3))))
                        .then(ej.a("append").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(-1, $$1xx, $$3))))
                        .then(ej.a("set").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a($$1xx, (uu)Iterables.getLast($$3)))))
                        .then(ej.a("merge").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> {
                           tx $$4 = new tx();

                           for (uu $$5 : $$3) {
                              if (fa.g.a($$5, 0)) {
                                 throw fa.b.create();
                              }

                              if (!($$5 instanceof tx $$6)) {
                                 throw h.create($$5);
                              }

                              $$4.a($$6);
                           }

                           Collection<uu> $$7 = $$2x.a($$1xx, tx::new);
                           int $$8 = 0;

                           for (uu $$9 : $$7) {
                              if (!($$9 instanceof tx $$10)) {
                                 throw h.create($$9);
                              }

                              tx $$12 = $$10.i();
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

   private static String a(uu $$0) throws CommandSyntaxException {
      if ($$0.c().d()) {
         return $$0.p_();
      } else {
         throw i.create($$0);
      }
   }

   private static List<uu> a(List<uu> $$0, apy.d $$1) throws CommandSyntaxException {
      List<uu> $$2 = new ArrayList<>($$0.size());

      for (uu $$3 : $$0) {
         String $$4 = a($$3);
         $$2.add(us.a($$1.process($$4)));
      }

      return $$2;
   }

   private static ArgumentBuilder<ei, ?> a(BiConsumer<ArgumentBuilder<ei, ?>, apy.b> $$0) {
      LiteralArgumentBuilder<ei> $$1 = ej.a("modify");

      for (apy.c $$2 : b) {
         $$2.a(
            $$1,
            $$2x -> {
               ArgumentBuilder<ei, ?> $$3 = ej.a("targetPath", fa.a());

               for (apy.c $$4 : c) {
                  $$0.accept(
                     $$3,
                     $$2xx -> $$4.a(
                           ej.a("from"),
                           $$3x -> $$3x.executes($$3xx -> a($$3xx, $$2, $$2xx, a($$3xx, $$4)))
                                 .then(ej.a("sourcePath", fa.a()).executes($$3xx -> a($$3xx, $$2, $$2xx, b($$3xx, $$4))))
                        )
                  );
                  $$0.accept(
                     $$3,
                     $$2xx -> $$4.a(
                           ej.a("string"),
                           $$3x -> $$3x.executes($$3xx -> a($$3xx, $$2, $$2xx, a(a($$3xx, $$4), $$0xxxxx -> $$0xxxxx)))
                                 .then(
                                    ((RequiredArgumentBuilder)ej.a("sourcePath", fa.a())
                                          .executes($$3xx -> a($$3xx, $$2, $$2xx, a(b($$3xx, $$4), $$0xxxxx -> $$0xxxxx))))
                                       .then(
                                          ((RequiredArgumentBuilder)ej.a("start", IntegerArgumentType.integer())
                                                .executes(
                                                   $$3xx -> a(
                                                         $$3xx,
                                                         $$2,
                                                         $$2xx,
                                                         a(b($$3xx, $$4), $$1xxxxx -> a($$1xxxxx, IntegerArgumentType.getInteger($$3xx, "start")))
                                                      )
                                                ))
                                             .then(
                                                ej.a("end", IntegerArgumentType.integer())
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

               $$0.accept($$3, $$1xx -> ej.a("value").then(ej.a("value", fb.a()).executes($$2xx -> {
                     List<uu> $$3x = Collections.singletonList(fb.a($$2xx, "value"));
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

   private static List<uu> a(CommandContext<ei> $$0, apy.c $$1) throws CommandSyntaxException {
      apx $$2 = $$1.a($$0);
      return Collections.singletonList($$2.a());
   }

   private static List<uu> b(CommandContext<ei> $$0, apy.c $$1) throws CommandSyntaxException {
      apx $$2 = $$1.a($$0);
      fa.g $$3 = fa.a($$0, "sourcePath");
      return $$3.a($$2.a());
   }

   private static int a(CommandContext<ei> $$0, apy.c $$1, apy.a $$2, List<uu> $$3) throws CommandSyntaxException {
      apx $$4 = $$1.a($$0);
      fa.g $$5 = fa.a($$0, "targetPath");
      tx $$6 = $$4.a();
      int $$7 = $$2.modify($$0, $$6, $$5, $$3);
      if ($$7 == 0) {
         throw d.create();
      } else {
         $$4.a($$6);
         ((ei)$$0.getSource()).a(() -> $$4.b(), true);
         return $$7;
      }
   }

   private static int a(ei $$0, apx $$1, fa.g $$2) throws CommandSyntaxException {
      tx $$3 = $$1.a();
      int $$4 = $$2.c($$3);
      if ($$4 == 0) {
         throw d.create();
      } else {
         $$1.a($$3);
         $$0.a(() -> $$1.b(), true);
         return $$4;
      }
   }

   public static uu a(fa.g $$0, apx $$1) throws CommandSyntaxException {
      Collection<uu> $$2 = $$0.a($$1.a());
      Iterator<uu> $$3 = $$2.iterator();
      uu $$4 = $$3.next();
      if ($$3.hasNext()) {
         throw g.create();
      } else {
         return $$4;
      }
   }

   private static int b(ei $$0, apx $$1, fa.g $$2) throws CommandSyntaxException {
      uu $$3 = a($$2, $$1);
      int $$4;
      if ($$3 instanceof un) {
         $$4 = azk.a(((un)$$3).j());
      } else if ($$3 instanceof tw) {
         $$4 = ((tw)$$3).size();
      } else if ($$3 instanceof tx) {
         $$4 = ((tx)$$3).f();
      } else {
         if (!($$3 instanceof us)) {
            throw f.create($$2.toString());
         }

         $$4 = $$3.p_().length();
      }

      $$0.a(() -> $$1.a($$3), false);
      return $$4;
   }

   private static int a(ei $$0, apx $$1, fa.g $$2, double $$3) throws CommandSyntaxException {
      uu $$4 = a($$2, $$1);
      if (!($$4 instanceof un)) {
         throw e.create($$2.toString());
      } else {
         int $$5 = azk.a(((un)$$4).j() * $$3);
         $$0.a(() -> $$1.a($$2, $$3, $$5), false);
         return $$5;
      }
   }

   private static int a(ei $$0, apx $$1) throws CommandSyntaxException {
      tx $$2 = $$1.a();
      $$0.a(() -> $$1.a((uu)$$2), false);
      return 1;
   }

   private static int a(ei $$0, apx $$1, tx $$2) throws CommandSyntaxException {
      tx $$3 = $$1.a();
      if (fa.g.a($$2, 0)) {
         throw fa.b.create();
      } else {
         tx $$4 = $$3.i().a($$2);
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
      int modify(CommandContext<ei> var1, tx var2, fa.g var3, List<uu> var4) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      ArgumentBuilder<ei, ?> create(apy.a var1);
   }

   public interface c {
      apx a(CommandContext<ei> var1) throws CommandSyntaxException;

      ArgumentBuilder<ei, ?> a(ArgumentBuilder<ei, ?> var1, Function<ArgumentBuilder<ei, ?>, ArgumentBuilder<ei, ?>> var2);
   }

   @FunctionalInterface
   interface d {
      String process(String var1) throws CommandSyntaxException;
   }
}
