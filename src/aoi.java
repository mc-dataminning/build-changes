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

public class aoi {
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wg.c("commands.data.merge.failed"));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> wg.b("commands.data.get.invalid", $$0));
   private static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> wg.b("commands.data.get.unknown", $$0));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(wg.c("commands.data.get.multiple"));
   private static final DynamicCommandExceptionType h = new DynamicCommandExceptionType($$0 -> wg.b("commands.data.modify.expected_object", $$0));
   private static final DynamicCommandExceptionType i = new DynamicCommandExceptionType($$0 -> wg.b("commands.data.modify.expected_value", $$0));
   private static final Dynamic2CommandExceptionType j = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> wg.b("commands.data.modify.invalid_substring", $$0, $$1)
   );
   public static final List<Function<String, aoi.c>> a = ImmutableList.of(aoj.a, aog.a, aok.a);
   public static final List<aoi.c> b = a.stream().map($$0 -> $$0.apply("target")).collect(ImmutableList.toImmutableList());
   public static final List<aoi.c> c = a.stream().map($$0 -> $$0.apply("source")).collect(ImmutableList.toImmutableList());

   public static void a(CommandDispatcher<du> $$0) {
      LiteralArgumentBuilder<du> $$1 = (LiteralArgumentBuilder<du>)dv.a("data").requires($$0x -> $$0x.c(2));

      for (aoi.c $$2 : b) {
         ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                     $$2.a(dv.a("merge"), $$1x -> $$1x.then(dv.a("nbt", ee.a()).executes($$1xx -> a((du)$$1xx.getSource(), $$2.a($$1xx), ee.a($$1xx, "nbt")))))
                  ))
                  .then(
                     $$2.a(
                        dv.a("get"),
                        $$1x -> $$1x.executes($$1xx -> a((du)$$1xx.getSource(), $$2.a($$1xx)))
                              .then(
                                 ((RequiredArgumentBuilder)dv.a("path", em.a()).executes($$1xx -> b((du)$$1xx.getSource(), $$2.a($$1xx), em.a($$1xx, "path"))))
                                    .then(
                                       dv.a("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             $$1xx -> a((du)$$1xx.getSource(), $$2.a($$1xx), em.a($$1xx, "path"), DoubleArgumentType.getDouble($$1xx, "scale"))
                                          )
                                    )
                              )
                     )
                  ))
               .then(
                  $$2.a(dv.a("remove"), $$1x -> $$1x.then(dv.a("path", em.a()).executes($$1xx -> a((du)$$1xx.getSource(), $$2.a($$1xx), em.a($$1xx, "path")))))
               ))
            .then(
               a(
                  (BiConsumer<ArgumentBuilder<du, ?>, aoi.b>)(($$0x, $$1x) -> $$0x.then(
                           dv.a("insert")
                              .then(
                                 dv.a("index", IntegerArgumentType.integer())
                                    .then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(IntegerArgumentType.getInteger($$0xx, "index"), $$1xx, $$3)))
                              )
                        )
                        .then(dv.a("prepend").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(0, $$1xx, $$3))))
                        .then(dv.a("append").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(-1, $$1xx, $$3))))
                        .then(dv.a("set").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a($$1xx, (uj)Iterables.getLast($$3)))))
                        .then(dv.a("merge").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> {
                           tm $$4 = new tm();

                           for (uj $$5 : $$3) {
                              if (em.g.a($$5, 0)) {
                                 throw em.b.create();
                              }

                              if (!($$5 instanceof tm $$6)) {
                                 throw h.create($$5);
                              }

                              $$4.a($$6);
                           }

                           Collection<uj> $$7 = $$2x.a($$1xx, tm::new);
                           int $$8 = 0;

                           for (uj $$9 : $$7) {
                              if (!($$9 instanceof tm $$10)) {
                                 throw h.create($$9);
                              }

                              tm $$12 = $$10.h();
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

   private static String a(uj $$0) throws CommandSyntaxException {
      if ($$0.c().d()) {
         return $$0.s_();
      } else {
         throw i.create($$0);
      }
   }

   private static List<uj> a(List<uj> $$0, aoi.d $$1) throws CommandSyntaxException {
      List<uj> $$2 = new ArrayList<>($$0.size());

      for (uj $$3 : $$0) {
         String $$4 = a($$3);
         $$2.add(uh.a($$1.process($$4)));
      }

      return $$2;
   }

   private static ArgumentBuilder<du, ?> a(BiConsumer<ArgumentBuilder<du, ?>, aoi.b> $$0) {
      LiteralArgumentBuilder<du> $$1 = dv.a("modify");

      for (aoi.c $$2 : b) {
         $$2.a(
            $$1,
            $$2x -> {
               ArgumentBuilder<du, ?> $$3 = dv.a("targetPath", em.a());

               for (aoi.c $$4 : c) {
                  $$0.accept(
                     $$3,
                     $$2xx -> $$4.a(
                           dv.a("from"),
                           $$3x -> $$3x.executes($$3xx -> a($$3xx, $$2, $$2xx, a($$3xx, $$4)))
                                 .then(dv.a("sourcePath", em.a()).executes($$3xx -> a($$3xx, $$2, $$2xx, b($$3xx, $$4))))
                        )
                  );
                  $$0.accept(
                     $$3,
                     $$2xx -> $$4.a(
                           dv.a("string"),
                           $$3x -> $$3x.executes($$3xx -> a($$3xx, $$2, $$2xx, a(a($$3xx, $$4), $$0xxxxx -> $$0xxxxx)))
                                 .then(
                                    ((RequiredArgumentBuilder)dv.a("sourcePath", em.a())
                                          .executes($$3xx -> a($$3xx, $$2, $$2xx, a(b($$3xx, $$4), $$0xxxxx -> $$0xxxxx))))
                                       .then(
                                          ((RequiredArgumentBuilder)dv.a("start", IntegerArgumentType.integer())
                                                .executes(
                                                   $$3xx -> a(
                                                         $$3xx,
                                                         $$2,
                                                         $$2xx,
                                                         a(b($$3xx, $$4), $$1xxxxx -> a($$1xxxxx, IntegerArgumentType.getInteger($$3xx, "start")))
                                                      )
                                                ))
                                             .then(
                                                dv.a("end", IntegerArgumentType.integer())
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

               $$0.accept($$3, $$1xx -> dv.a("value").then(dv.a("value", en.a()).executes($$2xx -> {
                     List<uj> $$3x = Collections.singletonList(en.a($$2xx, "value"));
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

   private static List<uj> a(CommandContext<du> $$0, aoi.c $$1) throws CommandSyntaxException {
      aoh $$2 = $$1.a($$0);
      return Collections.singletonList($$2.a());
   }

   private static List<uj> b(CommandContext<du> $$0, aoi.c $$1) throws CommandSyntaxException {
      aoh $$2 = $$1.a($$0);
      em.g $$3 = em.a($$0, "sourcePath");
      return $$3.a($$2.a());
   }

   private static int a(CommandContext<du> $$0, aoi.c $$1, aoi.a $$2, List<uj> $$3) throws CommandSyntaxException {
      aoh $$4 = $$1.a($$0);
      em.g $$5 = em.a($$0, "targetPath");
      tm $$6 = $$4.a();
      int $$7 = $$2.modify($$0, $$6, $$5, $$3);
      if ($$7 == 0) {
         throw d.create();
      } else {
         $$4.a($$6);
         ((du)$$0.getSource()).a(() -> $$4.b(), true);
         return $$7;
      }
   }

   private static int a(du $$0, aoh $$1, em.g $$2) throws CommandSyntaxException {
      tm $$3 = $$1.a();
      int $$4 = $$2.c($$3);
      if ($$4 == 0) {
         throw d.create();
      } else {
         $$1.a($$3);
         $$0.a(() -> $$1.b(), true);
         return $$4;
      }
   }

   public static uj a(em.g $$0, aoh $$1) throws CommandSyntaxException {
      Collection<uj> $$2 = $$0.a($$1.a());
      Iterator<uj> $$3 = $$2.iterator();
      uj $$4 = $$3.next();
      if ($$3.hasNext()) {
         throw g.create();
      } else {
         return $$4;
      }
   }

   private static int b(du $$0, aoh $$1, em.g $$2) throws CommandSyntaxException {
      uj $$3 = a($$2, $$1);
      int $$4;
      if ($$3 instanceof uc) {
         $$4 = axk.a(((uc)$$3).j());
      } else if ($$3 instanceof tl) {
         $$4 = ((tl)$$3).size();
      } else if ($$3 instanceof tm) {
         $$4 = ((tm)$$3).f();
      } else {
         if (!($$3 instanceof uh)) {
            throw f.create($$2.toString());
         }

         $$4 = $$3.s_().length();
      }

      $$0.a(() -> $$1.a($$3), false);
      return $$4;
   }

   private static int a(du $$0, aoh $$1, em.g $$2, double $$3) throws CommandSyntaxException {
      uj $$4 = a($$2, $$1);
      if (!($$4 instanceof uc)) {
         throw e.create($$2.toString());
      } else {
         int $$5 = axk.a(((uc)$$4).j() * $$3);
         $$0.a(() -> $$1.a($$2, $$3, $$5), false);
         return $$5;
      }
   }

   private static int a(du $$0, aoh $$1) throws CommandSyntaxException {
      tm $$2 = $$1.a();
      $$0.a(() -> $$1.a((uj)$$2), false);
      return 1;
   }

   private static int a(du $$0, aoh $$1, tm $$2) throws CommandSyntaxException {
      tm $$3 = $$1.a();
      if (em.g.a($$2, 0)) {
         throw em.b.create();
      } else {
         tm $$4 = $$3.h().a($$2);
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
      int modify(CommandContext<du> var1, tm var2, em.g var3, List<uj> var4) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      ArgumentBuilder<du, ?> create(aoi.a var1);
   }

   public interface c {
      aoh a(CommandContext<du> var1) throws CommandSyntaxException;

      ArgumentBuilder<du, ?> a(ArgumentBuilder<du, ?> var1, Function<ArgumentBuilder<du, ?>, ArgumentBuilder<du, ?>> var2);
   }

   @FunctionalInterface
   interface d {
      String process(String var1) throws CommandSyntaxException;
   }
}
