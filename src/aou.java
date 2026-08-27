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

public class aou {
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(ws.c("commands.data.merge.failed"));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> ws.b("commands.data.get.invalid", $$0));
   private static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> ws.b("commands.data.get.unknown", $$0));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(ws.c("commands.data.get.multiple"));
   private static final DynamicCommandExceptionType h = new DynamicCommandExceptionType($$0 -> ws.b("commands.data.modify.expected_object", $$0));
   private static final DynamicCommandExceptionType i = new DynamicCommandExceptionType($$0 -> ws.b("commands.data.modify.expected_value", $$0));
   private static final Dynamic2CommandExceptionType j = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> ws.b("commands.data.modify.invalid_substring", $$0, $$1)
   );
   public static final List<Function<String, aou.c>> a = ImmutableList.of(aov.a, aos.a, aow.a);
   public static final List<aou.c> b = a.stream().map($$0 -> $$0.apply("target")).collect(ImmutableList.toImmutableList());
   public static final List<aou.c> c = a.stream().map($$0 -> $$0.apply("source")).collect(ImmutableList.toImmutableList());

   public static void a(CommandDispatcher<ec> $$0) {
      LiteralArgumentBuilder<ec> $$1 = (LiteralArgumentBuilder<ec>)ed.a("data").requires($$0x -> $$0x.c(2));

      for (aou.c $$2 : b) {
         ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                     $$2.a(ed.a("merge"), $$1x -> $$1x.then(ed.a("nbt", em.a()).executes($$1xx -> a((ec)$$1xx.getSource(), $$2.a($$1xx), em.a($$1xx, "nbt")))))
                  ))
                  .then(
                     $$2.a(
                        ed.a("get"),
                        $$1x -> $$1x.executes($$1xx -> a((ec)$$1xx.getSource(), $$2.a($$1xx)))
                              .then(
                                 ((RequiredArgumentBuilder)ed.a("path", eu.a()).executes($$1xx -> b((ec)$$1xx.getSource(), $$2.a($$1xx), eu.a($$1xx, "path"))))
                                    .then(
                                       ed.a("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             $$1xx -> a((ec)$$1xx.getSource(), $$2.a($$1xx), eu.a($$1xx, "path"), DoubleArgumentType.getDouble($$1xx, "scale"))
                                          )
                                    )
                              )
                     )
                  ))
               .then(
                  $$2.a(ed.a("remove"), $$1x -> $$1x.then(ed.a("path", eu.a()).executes($$1xx -> a((ec)$$1xx.getSource(), $$2.a($$1xx), eu.a($$1xx, "path")))))
               ))
            .then(
               a(
                  (BiConsumer<ArgumentBuilder<ec, ?>, aou.b>)(($$0x, $$1x) -> $$0x.then(
                           ed.a("insert")
                              .then(
                                 ed.a("index", IntegerArgumentType.integer())
                                    .then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(IntegerArgumentType.getInteger($$0xx, "index"), $$1xx, $$3)))
                              )
                        )
                        .then(ed.a("prepend").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(0, $$1xx, $$3))))
                        .then(ed.a("append").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(-1, $$1xx, $$3))))
                        .then(ed.a("set").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a($$1xx, (uv)Iterables.getLast($$3)))))
                        .then(ed.a("merge").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> {
                           ty $$4 = new ty();

                           for (uv $$5 : $$3) {
                              if (eu.g.a($$5, 0)) {
                                 throw eu.b.create();
                              }

                              if (!($$5 instanceof ty $$6)) {
                                 throw h.create($$5);
                              }

                              $$4.a($$6);
                           }

                           Collection<uv> $$7 = $$2x.a($$1xx, ty::new);
                           int $$8 = 0;

                           for (uv $$9 : $$7) {
                              if (!($$9 instanceof ty $$10)) {
                                 throw h.create($$9);
                              }

                              ty $$12 = $$10.h();
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

   private static String a(uv $$0) throws CommandSyntaxException {
      if ($$0.c().d()) {
         return $$0.s_();
      } else {
         throw i.create($$0);
      }
   }

   private static List<uv> a(List<uv> $$0, aou.d $$1) throws CommandSyntaxException {
      List<uv> $$2 = new ArrayList<>($$0.size());

      for (uv $$3 : $$0) {
         String $$4 = a($$3);
         $$2.add(ut.a($$1.process($$4)));
      }

      return $$2;
   }

   private static ArgumentBuilder<ec, ?> a(BiConsumer<ArgumentBuilder<ec, ?>, aou.b> $$0) {
      LiteralArgumentBuilder<ec> $$1 = ed.a("modify");

      for (aou.c $$2 : b) {
         $$2.a(
            $$1,
            $$2x -> {
               ArgumentBuilder<ec, ?> $$3 = ed.a("targetPath", eu.a());

               for (aou.c $$4 : c) {
                  $$0.accept(
                     $$3,
                     $$2xx -> $$4.a(
                           ed.a("from"),
                           $$3x -> $$3x.executes($$3xx -> a($$3xx, $$2, $$2xx, a($$3xx, $$4)))
                                 .then(ed.a("sourcePath", eu.a()).executes($$3xx -> a($$3xx, $$2, $$2xx, b($$3xx, $$4))))
                        )
                  );
                  $$0.accept(
                     $$3,
                     $$2xx -> $$4.a(
                           ed.a("string"),
                           $$3x -> $$3x.executes($$3xx -> a($$3xx, $$2, $$2xx, a(a($$3xx, $$4), $$0xxxxx -> $$0xxxxx)))
                                 .then(
                                    ((RequiredArgumentBuilder)ed.a("sourcePath", eu.a())
                                          .executes($$3xx -> a($$3xx, $$2, $$2xx, a(b($$3xx, $$4), $$0xxxxx -> $$0xxxxx))))
                                       .then(
                                          ((RequiredArgumentBuilder)ed.a("start", IntegerArgumentType.integer())
                                                .executes(
                                                   $$3xx -> a(
                                                         $$3xx,
                                                         $$2,
                                                         $$2xx,
                                                         a(b($$3xx, $$4), $$1xxxxx -> a($$1xxxxx, IntegerArgumentType.getInteger($$3xx, "start")))
                                                      )
                                                ))
                                             .then(
                                                ed.a("end", IntegerArgumentType.integer())
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

               $$0.accept($$3, $$1xx -> ed.a("value").then(ed.a("value", ev.a()).executes($$2xx -> {
                     List<uv> $$3x = Collections.singletonList(ev.a($$2xx, "value"));
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

   private static List<uv> a(CommandContext<ec> $$0, aou.c $$1) throws CommandSyntaxException {
      aot $$2 = $$1.a($$0);
      return Collections.singletonList($$2.a());
   }

   private static List<uv> b(CommandContext<ec> $$0, aou.c $$1) throws CommandSyntaxException {
      aot $$2 = $$1.a($$0);
      eu.g $$3 = eu.a($$0, "sourcePath");
      return $$3.a($$2.a());
   }

   private static int a(CommandContext<ec> $$0, aou.c $$1, aou.a $$2, List<uv> $$3) throws CommandSyntaxException {
      aot $$4 = $$1.a($$0);
      eu.g $$5 = eu.a($$0, "targetPath");
      ty $$6 = $$4.a();
      int $$7 = $$2.modify($$0, $$6, $$5, $$3);
      if ($$7 == 0) {
         throw d.create();
      } else {
         $$4.a($$6);
         ((ec)$$0.getSource()).a(() -> $$4.b(), true);
         return $$7;
      }
   }

   private static int a(ec $$0, aot $$1, eu.g $$2) throws CommandSyntaxException {
      ty $$3 = $$1.a();
      int $$4 = $$2.c($$3);
      if ($$4 == 0) {
         throw d.create();
      } else {
         $$1.a($$3);
         $$0.a(() -> $$1.b(), true);
         return $$4;
      }
   }

   public static uv a(eu.g $$0, aot $$1) throws CommandSyntaxException {
      Collection<uv> $$2 = $$0.a($$1.a());
      Iterator<uv> $$3 = $$2.iterator();
      uv $$4 = $$3.next();
      if ($$3.hasNext()) {
         throw g.create();
      } else {
         return $$4;
      }
   }

   private static int b(ec $$0, aot $$1, eu.g $$2) throws CommandSyntaxException {
      uv $$3 = a($$2, $$1);
      int $$4;
      if ($$3 instanceof uo) {
         $$4 = axw.a(((uo)$$3).j());
      } else if ($$3 instanceof tx) {
         $$4 = ((tx)$$3).size();
      } else if ($$3 instanceof ty) {
         $$4 = ((ty)$$3).f();
      } else {
         if (!($$3 instanceof ut)) {
            throw f.create($$2.toString());
         }

         $$4 = $$3.s_().length();
      }

      $$0.a(() -> $$1.a($$3), false);
      return $$4;
   }

   private static int a(ec $$0, aot $$1, eu.g $$2, double $$3) throws CommandSyntaxException {
      uv $$4 = a($$2, $$1);
      if (!($$4 instanceof uo)) {
         throw e.create($$2.toString());
      } else {
         int $$5 = axw.a(((uo)$$4).j() * $$3);
         $$0.a(() -> $$1.a($$2, $$3, $$5), false);
         return $$5;
      }
   }

   private static int a(ec $$0, aot $$1) throws CommandSyntaxException {
      ty $$2 = $$1.a();
      $$0.a(() -> $$1.a((uv)$$2), false);
      return 1;
   }

   private static int a(ec $$0, aot $$1, ty $$2) throws CommandSyntaxException {
      ty $$3 = $$1.a();
      if (eu.g.a($$2, 0)) {
         throw eu.b.create();
      } else {
         ty $$4 = $$3.h().a($$2);
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
      int modify(CommandContext<ec> var1, ty var2, eu.g var3, List<uv> var4) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      ArgumentBuilder<ec, ?> create(aou.a var1);
   }

   public interface c {
      aot a(CommandContext<ec> var1) throws CommandSyntaxException;

      ArgumentBuilder<ec, ?> a(ArgumentBuilder<ec, ?> var1, Function<ArgumentBuilder<ec, ?>, ArgumentBuilder<ec, ?>> var2);
   }

   @FunctionalInterface
   interface d {
      String process(String var1) throws CommandSyntaxException;
   }
}
