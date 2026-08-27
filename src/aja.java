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

public class aja {
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(te.c("commands.data.merge.failed"));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> te.a("commands.data.get.invalid", $$0));
   private static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> te.a("commands.data.get.unknown", $$0));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(te.c("commands.data.get.multiple"));
   private static final DynamicCommandExceptionType h = new DynamicCommandExceptionType($$0 -> te.a("commands.data.modify.expected_object", $$0));
   private static final DynamicCommandExceptionType i = new DynamicCommandExceptionType($$0 -> te.a("commands.data.modify.expected_value", $$0));
   private static final Dynamic2CommandExceptionType j = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> te.a("commands.data.modify.invalid_substring", $$0, $$1)
   );
   public static final List<Function<String, aja.c>> a = ImmutableList.of(ajb.a, aiy.a, ajc.a);
   public static final List<aja.c> b = a.stream().map($$0 -> $$0.apply("target")).collect(ImmutableList.toImmutableList());
   public static final List<aja.c> c = a.stream().map($$0 -> $$0.apply("source")).collect(ImmutableList.toImmutableList());

   public static void a(CommandDispatcher<ds> $$0) {
      LiteralArgumentBuilder<ds> $$1 = (LiteralArgumentBuilder<ds>)dt.a("data").requires($$0x -> $$0x.c(2));

      for (aja.c $$2 : b) {
         ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                     $$2.a(dt.a("merge"), $$1x -> $$1x.then(dt.a("nbt", ea.a()).executes($$1xx -> a((ds)$$1xx.getSource(), $$2.a($$1xx), ea.a($$1xx, "nbt")))))
                  ))
                  .then(
                     $$2.a(
                        dt.a("get"),
                        $$1x -> $$1x.executes($$1xx -> a((ds)$$1xx.getSource(), $$2.a($$1xx)))
                              .then(
                                 ((RequiredArgumentBuilder)dt.a("path", ei.a()).executes($$1xx -> b((ds)$$1xx.getSource(), $$2.a($$1xx), ei.a($$1xx, "path"))))
                                    .then(
                                       dt.a("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             $$1xx -> a((ds)$$1xx.getSource(), $$2.a($$1xx), ei.a($$1xx, "path"), DoubleArgumentType.getDouble($$1xx, "scale"))
                                          )
                                    )
                              )
                     )
                  ))
               .then(
                  $$2.a(dt.a("remove"), $$1x -> $$1x.then(dt.a("path", ei.a()).executes($$1xx -> a((ds)$$1xx.getSource(), $$2.a($$1xx), ei.a($$1xx, "path")))))
               ))
            .then(
               a(
                  (BiConsumer<ArgumentBuilder<ds, ?>, aja.b>)(($$0x, $$1x) -> $$0x.then(
                           dt.a("insert")
                              .then(
                                 dt.a("index", IntegerArgumentType.integer())
                                    .then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(IntegerArgumentType.getInteger($$0xx, "index"), $$1xx, $$3)))
                              )
                        )
                        .then(dt.a("prepend").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(0, $$1xx, $$3))))
                        .then(dt.a("append").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(-1, $$1xx, $$3))))
                        .then(dt.a("set").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a($$1xx, (rl)Iterables.getLast($$3)))))
                        .then(dt.a("merge").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> {
                           qs $$4 = new qs();

                           for (rl $$5 : $$3) {
                              if (ei.g.a($$5, 0)) {
                                 throw ei.b.create();
                              }

                              if (!($$5 instanceof qs $$6)) {
                                 throw h.create($$5);
                              }

                              $$4.a($$6);
                           }

                           Collection<rl> $$7 = $$2x.a($$1xx, qs::new);
                           int $$8 = 0;

                           for (rl $$9 : $$7) {
                              if (!($$9 instanceof qs $$10)) {
                                 throw h.create($$9);
                              }

                              qs $$12 = $$10.h();
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

   private static String a(rl $$0) throws CommandSyntaxException {
      if ($$0.c().d()) {
         return $$0.m_();
      } else {
         throw i.create($$0);
      }
   }

   private static List<rl> a(List<rl> $$0, aja.d $$1) throws CommandSyntaxException {
      List<rl> $$2 = new ArrayList<>($$0.size());

      for (rl $$3 : $$0) {
         String $$4 = a($$3);
         $$2.add(rj.a($$1.process($$4)));
      }

      return $$2;
   }

   private static ArgumentBuilder<ds, ?> a(BiConsumer<ArgumentBuilder<ds, ?>, aja.b> $$0) {
      LiteralArgumentBuilder<ds> $$1 = dt.a("modify");

      for (aja.c $$2 : b) {
         $$2.a(
            $$1,
            $$2x -> {
               ArgumentBuilder<ds, ?> $$3 = dt.a("targetPath", ei.a());

               for (aja.c $$4 : c) {
                  $$0.accept(
                     $$3,
                     $$2xx -> $$4.a(
                           dt.a("from"),
                           $$3x -> $$3x.executes($$3xx -> a($$3xx, $$2, $$2xx, a($$3xx, $$4)))
                                 .then(dt.a("sourcePath", ei.a()).executes($$3xx -> a($$3xx, $$2, $$2xx, b($$3xx, $$4))))
                        )
                  );
                  $$0.accept(
                     $$3,
                     $$2xx -> $$4.a(
                           dt.a("string"),
                           $$3x -> $$3x.executes($$3xx -> a($$3xx, $$2, $$2xx, a(a($$3xx, $$4), $$0xxxxx -> $$0xxxxx)))
                                 .then(
                                    ((RequiredArgumentBuilder)dt.a("sourcePath", ei.a())
                                          .executes($$3xx -> a($$3xx, $$2, $$2xx, a(b($$3xx, $$4), $$0xxxxx -> $$0xxxxx))))
                                       .then(
                                          ((RequiredArgumentBuilder)dt.a("start", IntegerArgumentType.integer())
                                                .executes(
                                                   $$3xx -> a(
                                                         $$3xx,
                                                         $$2,
                                                         $$2xx,
                                                         a(b($$3xx, $$4), $$1xxxxx -> a($$1xxxxx, IntegerArgumentType.getInteger($$3xx, "start")))
                                                      )
                                                ))
                                             .then(
                                                dt.a("end", IntegerArgumentType.integer())
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

               $$0.accept($$3, $$1xx -> dt.a("value").then(dt.a("value", ej.a()).executes($$2xx -> {
                     List<rl> $$3x = Collections.singletonList(ej.a($$2xx, "value"));
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

   private static List<rl> a(CommandContext<ds> $$0, aja.c $$1) throws CommandSyntaxException {
      aiz $$2 = $$1.a($$0);
      return Collections.singletonList($$2.a());
   }

   private static List<rl> b(CommandContext<ds> $$0, aja.c $$1) throws CommandSyntaxException {
      aiz $$2 = $$1.a($$0);
      ei.g $$3 = ei.a($$0, "sourcePath");
      return $$3.a($$2.a());
   }

   private static int a(CommandContext<ds> $$0, aja.c $$1, aja.a $$2, List<rl> $$3) throws CommandSyntaxException {
      aiz $$4 = $$1.a($$0);
      ei.g $$5 = ei.a($$0, "targetPath");
      qs $$6 = $$4.a();
      int $$7 = $$2.modify($$0, $$6, $$5, $$3);
      if ($$7 == 0) {
         throw d.create();
      } else {
         $$4.a($$6);
         ((ds)$$0.getSource()).a(() -> $$4.b(), true);
         return $$7;
      }
   }

   private static int a(ds $$0, aiz $$1, ei.g $$2) throws CommandSyntaxException {
      qs $$3 = $$1.a();
      int $$4 = $$2.c($$3);
      if ($$4 == 0) {
         throw d.create();
      } else {
         $$1.a($$3);
         $$0.a(() -> $$1.b(), true);
         return $$4;
      }
   }

   public static rl a(ei.g $$0, aiz $$1) throws CommandSyntaxException {
      Collection<rl> $$2 = $$0.a($$1.a());
      Iterator<rl> $$3 = $$2.iterator();
      rl $$4 = $$3.next();
      if ($$3.hasNext()) {
         throw g.create();
      } else {
         return $$4;
      }
   }

   private static int b(ds $$0, aiz $$1, ei.g $$2) throws CommandSyntaxException {
      rl $$3 = a($$2, $$1);
      int $$4;
      if ($$3 instanceof rf) {
         $$4 = aro.a(((rf)$$3).j());
      } else if ($$3 instanceof qr) {
         $$4 = ((qr)$$3).size();
      } else if ($$3 instanceof qs) {
         $$4 = ((qs)$$3).f();
      } else {
         if (!($$3 instanceof rj)) {
            throw f.create($$2.toString());
         }

         $$4 = $$3.m_().length();
      }

      $$0.a(() -> $$1.a($$3), false);
      return $$4;
   }

   private static int a(ds $$0, aiz $$1, ei.g $$2, double $$3) throws CommandSyntaxException {
      rl $$4 = a($$2, $$1);
      if (!($$4 instanceof rf)) {
         throw e.create($$2.toString());
      } else {
         int $$5 = aro.a(((rf)$$4).j() * $$3);
         $$0.a(() -> $$1.a($$2, $$3, $$5), false);
         return $$5;
      }
   }

   private static int a(ds $$0, aiz $$1) throws CommandSyntaxException {
      qs $$2 = $$1.a();
      $$0.a(() -> $$1.a((rl)$$2), false);
      return 1;
   }

   private static int a(ds $$0, aiz $$1, qs $$2) throws CommandSyntaxException {
      qs $$3 = $$1.a();
      if (ei.g.a($$2, 0)) {
         throw ei.b.create();
      } else {
         qs $$4 = $$3.h().a($$2);
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
      int modify(CommandContext<ds> var1, qs var2, ei.g var3, List<rl> var4) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      ArgumentBuilder<ds, ?> create(aja.a var1);
   }

   public interface c {
      aiz a(CommandContext<ds> var1) throws CommandSyntaxException;

      ArgumentBuilder<ds, ?> a(ArgumentBuilder<ds, ?> var1, Function<ArgumentBuilder<ds, ?>, ArgumentBuilder<ds, ?>> var2);
   }

   @FunctionalInterface
   interface d {
      String process(String var1) throws CommandSyntaxException;
   }
}
