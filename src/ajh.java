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

public class ajh {
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(tl.c("commands.data.merge.failed"));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> tl.a("commands.data.get.invalid", $$0));
   private static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> tl.a("commands.data.get.unknown", $$0));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(tl.c("commands.data.get.multiple"));
   private static final DynamicCommandExceptionType h = new DynamicCommandExceptionType($$0 -> tl.a("commands.data.modify.expected_object", $$0));
   private static final DynamicCommandExceptionType i = new DynamicCommandExceptionType($$0 -> tl.a("commands.data.modify.expected_value", $$0));
   private static final Dynamic2CommandExceptionType j = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> tl.a("commands.data.modify.invalid_substring", $$0, $$1)
   );
   public static final List<Function<String, ajh.c>> a = ImmutableList.of(aji.a, ajf.a, ajj.a);
   public static final List<ajh.c> b = a.stream().map($$0 -> $$0.apply("target")).collect(ImmutableList.toImmutableList());
   public static final List<ajh.c> c = a.stream().map($$0 -> $$0.apply("source")).collect(ImmutableList.toImmutableList());

   public static void a(CommandDispatcher<dt> $$0) {
      LiteralArgumentBuilder<dt> $$1 = (LiteralArgumentBuilder<dt>)du.a("data").requires($$0x -> $$0x.c(2));

      for (ajh.c $$2 : b) {
         ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                     $$2.a(du.a("merge"), $$1x -> $$1x.then(du.a("nbt", eb.a()).executes($$1xx -> a((dt)$$1xx.getSource(), $$2.a($$1xx), eb.a($$1xx, "nbt")))))
                  ))
                  .then(
                     $$2.a(
                        du.a("get"),
                        $$1x -> $$1x.executes($$1xx -> a((dt)$$1xx.getSource(), $$2.a($$1xx)))
                              .then(
                                 ((RequiredArgumentBuilder)du.a("path", ej.a()).executes($$1xx -> b((dt)$$1xx.getSource(), $$2.a($$1xx), ej.a($$1xx, "path"))))
                                    .then(
                                       du.a("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             $$1xx -> a((dt)$$1xx.getSource(), $$2.a($$1xx), ej.a($$1xx, "path"), DoubleArgumentType.getDouble($$1xx, "scale"))
                                          )
                                    )
                              )
                     )
                  ))
               .then(
                  $$2.a(du.a("remove"), $$1x -> $$1x.then(du.a("path", ej.a()).executes($$1xx -> a((dt)$$1xx.getSource(), $$2.a($$1xx), ej.a($$1xx, "path")))))
               ))
            .then(
               a(
                  (BiConsumer<ArgumentBuilder<dt, ?>, ajh.b>)(($$0x, $$1x) -> $$0x.then(
                           du.a("insert")
                              .then(
                                 du.a("index", IntegerArgumentType.integer())
                                    .then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(IntegerArgumentType.getInteger($$0xx, "index"), $$1xx, $$3)))
                              )
                        )
                        .then(du.a("prepend").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(0, $$1xx, $$3))))
                        .then(du.a("append").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(-1, $$1xx, $$3))))
                        .then(du.a("set").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a($$1xx, (rq)Iterables.getLast($$3)))))
                        .then(du.a("merge").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> {
                           qw $$4 = new qw();

                           for (rq $$5 : $$3) {
                              if (ej.g.a($$5, 0)) {
                                 throw ej.b.create();
                              }

                              if (!($$5 instanceof qw $$6)) {
                                 throw h.create($$5);
                              }

                              $$4.a($$6);
                           }

                           Collection<rq> $$7 = $$2x.a($$1xx, qw::new);
                           int $$8 = 0;

                           for (rq $$9 : $$7) {
                              if (!($$9 instanceof qw $$10)) {
                                 throw h.create($$9);
                              }

                              qw $$12 = $$10.h();
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

   private static String a(rq $$0) throws CommandSyntaxException {
      if ($$0.c().d()) {
         return $$0.r_();
      } else {
         throw i.create($$0);
      }
   }

   private static List<rq> a(List<rq> $$0, ajh.d $$1) throws CommandSyntaxException {
      List<rq> $$2 = new ArrayList<>($$0.size());

      for (rq $$3 : $$0) {
         String $$4 = a($$3);
         $$2.add(ro.a($$1.process($$4)));
      }

      return $$2;
   }

   private static ArgumentBuilder<dt, ?> a(BiConsumer<ArgumentBuilder<dt, ?>, ajh.b> $$0) {
      LiteralArgumentBuilder<dt> $$1 = du.a("modify");

      for (ajh.c $$2 : b) {
         $$2.a(
            $$1,
            $$2x -> {
               ArgumentBuilder<dt, ?> $$3 = du.a("targetPath", ej.a());

               for (ajh.c $$4 : c) {
                  $$0.accept(
                     $$3,
                     $$2xx -> $$4.a(
                           du.a("from"),
                           $$3x -> $$3x.executes($$3xx -> a($$3xx, $$2, $$2xx, a($$3xx, $$4)))
                                 .then(du.a("sourcePath", ej.a()).executes($$3xx -> a($$3xx, $$2, $$2xx, b($$3xx, $$4))))
                        )
                  );
                  $$0.accept(
                     $$3,
                     $$2xx -> $$4.a(
                           du.a("string"),
                           $$3x -> $$3x.executes($$3xx -> a($$3xx, $$2, $$2xx, a(a($$3xx, $$4), $$0xxxxx -> $$0xxxxx)))
                                 .then(
                                    ((RequiredArgumentBuilder)du.a("sourcePath", ej.a())
                                          .executes($$3xx -> a($$3xx, $$2, $$2xx, a(b($$3xx, $$4), $$0xxxxx -> $$0xxxxx))))
                                       .then(
                                          ((RequiredArgumentBuilder)du.a("start", IntegerArgumentType.integer())
                                                .executes(
                                                   $$3xx -> a(
                                                         $$3xx,
                                                         $$2,
                                                         $$2xx,
                                                         a(b($$3xx, $$4), $$1xxxxx -> a($$1xxxxx, IntegerArgumentType.getInteger($$3xx, "start")))
                                                      )
                                                ))
                                             .then(
                                                du.a("end", IntegerArgumentType.integer())
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

               $$0.accept($$3, $$1xx -> du.a("value").then(du.a("value", ek.a()).executes($$2xx -> {
                     List<rq> $$3x = Collections.singletonList(ek.a($$2xx, "value"));
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

   private static List<rq> a(CommandContext<dt> $$0, ajh.c $$1) throws CommandSyntaxException {
      ajg $$2 = $$1.a($$0);
      return Collections.singletonList($$2.a());
   }

   private static List<rq> b(CommandContext<dt> $$0, ajh.c $$1) throws CommandSyntaxException {
      ajg $$2 = $$1.a($$0);
      ej.g $$3 = ej.a($$0, "sourcePath");
      return $$3.a($$2.a());
   }

   private static int a(CommandContext<dt> $$0, ajh.c $$1, ajh.a $$2, List<rq> $$3) throws CommandSyntaxException {
      ajg $$4 = $$1.a($$0);
      ej.g $$5 = ej.a($$0, "targetPath");
      qw $$6 = $$4.a();
      int $$7 = $$2.modify($$0, $$6, $$5, $$3);
      if ($$7 == 0) {
         throw d.create();
      } else {
         $$4.a($$6);
         ((dt)$$0.getSource()).a(() -> $$4.b(), true);
         return $$7;
      }
   }

   private static int a(dt $$0, ajg $$1, ej.g $$2) throws CommandSyntaxException {
      qw $$3 = $$1.a();
      int $$4 = $$2.c($$3);
      if ($$4 == 0) {
         throw d.create();
      } else {
         $$1.a($$3);
         $$0.a(() -> $$1.b(), true);
         return $$4;
      }
   }

   public static rq a(ej.g $$0, ajg $$1) throws CommandSyntaxException {
      Collection<rq> $$2 = $$0.a($$1.a());
      Iterator<rq> $$3 = $$2.iterator();
      rq $$4 = $$3.next();
      if ($$3.hasNext()) {
         throw g.create();
      } else {
         return $$4;
      }
   }

   private static int b(dt $$0, ajg $$1, ej.g $$2) throws CommandSyntaxException {
      rq $$3 = a($$2, $$1);
      int $$4;
      if ($$3 instanceof rk) {
         $$4 = arw.a(((rk)$$3).j());
      } else if ($$3 instanceof qv) {
         $$4 = ((qv)$$3).size();
      } else if ($$3 instanceof qw) {
         $$4 = ((qw)$$3).f();
      } else {
         if (!($$3 instanceof ro)) {
            throw f.create($$2.toString());
         }

         $$4 = $$3.r_().length();
      }

      $$0.a(() -> $$1.a($$3), false);
      return $$4;
   }

   private static int a(dt $$0, ajg $$1, ej.g $$2, double $$3) throws CommandSyntaxException {
      rq $$4 = a($$2, $$1);
      if (!($$4 instanceof rk)) {
         throw e.create($$2.toString());
      } else {
         int $$5 = arw.a(((rk)$$4).j() * $$3);
         $$0.a(() -> $$1.a($$2, $$3, $$5), false);
         return $$5;
      }
   }

   private static int a(dt $$0, ajg $$1) throws CommandSyntaxException {
      qw $$2 = $$1.a();
      $$0.a(() -> $$1.a((rq)$$2), false);
      return 1;
   }

   private static int a(dt $$0, ajg $$1, qw $$2) throws CommandSyntaxException {
      qw $$3 = $$1.a();
      if (ej.g.a($$2, 0)) {
         throw ej.b.create();
      } else {
         qw $$4 = $$3.h().a($$2);
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
      int modify(CommandContext<dt> var1, qw var2, ej.g var3, List<rq> var4) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      ArgumentBuilder<dt, ?> create(ajh.a var1);
   }

   public interface c {
      ajg a(CommandContext<dt> var1) throws CommandSyntaxException;

      ArgumentBuilder<dt, ?> a(ArgumentBuilder<dt, ?> var1, Function<ArgumentBuilder<dt, ?>, ArgumentBuilder<dt, ?>> var2);
   }

   @FunctionalInterface
   interface d {
      String process(String var1) throws CommandSyntaxException;
   }
}
