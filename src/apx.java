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

public class apx {
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wv.c("commands.data.merge.failed"));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> wv.b("commands.data.get.invalid", $$0));
   private static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> wv.b("commands.data.get.unknown", $$0));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(wv.c("commands.data.get.multiple"));
   private static final DynamicCommandExceptionType h = new DynamicCommandExceptionType($$0 -> wv.b("commands.data.modify.expected_object", $$0));
   private static final DynamicCommandExceptionType i = new DynamicCommandExceptionType($$0 -> wv.b("commands.data.modify.expected_value", $$0));
   private static final Dynamic2CommandExceptionType j = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> wv.b("commands.data.modify.invalid_substring", $$0, $$1)
   );
   public static final List<Function<String, apx.c>> a = ImmutableList.of(apy.a, apv.a, apz.a);
   public static final List<apx.c> b = a.stream().map($$0 -> $$0.apply("target")).collect(ImmutableList.toImmutableList());
   public static final List<apx.c> c = a.stream().map($$0 -> $$0.apply("source")).collect(ImmutableList.toImmutableList());

   public static void a(CommandDispatcher<ex> $$0) {
      LiteralArgumentBuilder<ex> $$1 = (LiteralArgumentBuilder<ex>)ey.a("data").requires($$0x -> $$0x.c(2));

      for (apx.c $$2 : b) {
         ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                     $$2.a(ey.a("merge"), $$1x -> $$1x.then(ey.a("nbt", fh.a()).executes($$1xx -> a((ex)$$1xx.getSource(), $$2.a($$1xx), fh.a($$1xx, "nbt")))))
                  ))
                  .then(
                     $$2.a(
                        ey.a("get"),
                        $$1x -> $$1x.executes($$1xx -> a((ex)$$1xx.getSource(), $$2.a($$1xx)))
                              .then(
                                 ((RequiredArgumentBuilder)ey.a("path", fp.a()).executes($$1xx -> b((ex)$$1xx.getSource(), $$2.a($$1xx), fp.a($$1xx, "path"))))
                                    .then(
                                       ey.a("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             $$1xx -> a((ex)$$1xx.getSource(), $$2.a($$1xx), fp.a($$1xx, "path"), DoubleArgumentType.getDouble($$1xx, "scale"))
                                          )
                                    )
                              )
                     )
                  ))
               .then(
                  $$2.a(ey.a("remove"), $$1x -> $$1x.then(ey.a("path", fp.a()).executes($$1xx -> a((ex)$$1xx.getSource(), $$2.a($$1xx), fp.a($$1xx, "path")))))
               ))
            .then(
               a(
                  (BiConsumer<ArgumentBuilder<ex, ?>, apx.b>)(($$0x, $$1x) -> $$0x.then(
                           ey.a("insert")
                              .then(
                                 ey.a("index", IntegerArgumentType.integer())
                                    .then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(IntegerArgumentType.getInteger($$0xx, "index"), $$1xx, $$3)))
                              )
                        )
                        .then(ey.a("prepend").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(0, $$1xx, $$3))))
                        .then(ey.a("append").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(-1, $$1xx, $$3))))
                        .then(ey.a("set").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a($$1xx, (ut)Iterables.getLast($$3)))))
                        .then(ey.a("merge").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> {
                           tw $$4 = new tw();

                           for (ut $$5 : $$3) {
                              if (fp.g.a($$5, 0)) {
                                 throw fp.b.create();
                              }

                              if (!($$5 instanceof tw $$6)) {
                                 throw h.create($$5);
                              }

                              $$4.a($$6);
                           }

                           Collection<ut> $$7 = $$2x.a($$1xx, tw::new);
                           int $$8 = 0;

                           for (ut $$9 : $$7) {
                              if (!($$9 instanceof tw $$10)) {
                                 throw h.create($$9);
                              }

                              tw $$12 = $$10.i();
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

   private static String a(ut $$0) throws CommandSyntaxException {
      if ($$0.c().d()) {
         return $$0.p_();
      } else {
         throw i.create($$0);
      }
   }

   private static List<ut> a(List<ut> $$0, apx.d $$1) throws CommandSyntaxException {
      List<ut> $$2 = new ArrayList<>($$0.size());

      for (ut $$3 : $$0) {
         String $$4 = a($$3);
         $$2.add(ur.a($$1.process($$4)));
      }

      return $$2;
   }

   private static ArgumentBuilder<ex, ?> a(BiConsumer<ArgumentBuilder<ex, ?>, apx.b> $$0) {
      LiteralArgumentBuilder<ex> $$1 = ey.a("modify");

      for (apx.c $$2 : b) {
         $$2.a(
            $$1,
            $$2x -> {
               ArgumentBuilder<ex, ?> $$3 = ey.a("targetPath", fp.a());

               for (apx.c $$4 : c) {
                  $$0.accept(
                     $$3,
                     $$2xx -> $$4.a(
                           ey.a("from"),
                           $$3x -> $$3x.executes($$3xx -> a($$3xx, $$2, $$2xx, a($$3xx, $$4)))
                                 .then(ey.a("sourcePath", fp.a()).executes($$3xx -> a($$3xx, $$2, $$2xx, b($$3xx, $$4))))
                        )
                  );
                  $$0.accept(
                     $$3,
                     $$2xx -> $$4.a(
                           ey.a("string"),
                           $$3x -> $$3x.executes($$3xx -> a($$3xx, $$2, $$2xx, a(a($$3xx, $$4), $$0xxxxx -> $$0xxxxx)))
                                 .then(
                                    ((RequiredArgumentBuilder)ey.a("sourcePath", fp.a())
                                          .executes($$3xx -> a($$3xx, $$2, $$2xx, a(b($$3xx, $$4), $$0xxxxx -> $$0xxxxx))))
                                       .then(
                                          ((RequiredArgumentBuilder)ey.a("start", IntegerArgumentType.integer())
                                                .executes(
                                                   $$3xx -> a(
                                                         $$3xx,
                                                         $$2,
                                                         $$2xx,
                                                         a(b($$3xx, $$4), $$1xxxxx -> a($$1xxxxx, IntegerArgumentType.getInteger($$3xx, "start")))
                                                      )
                                                ))
                                             .then(
                                                ey.a("end", IntegerArgumentType.integer())
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

               $$0.accept($$3, $$1xx -> ey.a("value").then(ey.a("value", fq.a()).executes($$2xx -> {
                     List<ut> $$3x = Collections.singletonList(fq.a($$2xx, "value"));
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

   private static List<ut> a(CommandContext<ex> $$0, apx.c $$1) throws CommandSyntaxException {
      apw $$2 = $$1.a($$0);
      return Collections.singletonList($$2.a());
   }

   private static List<ut> b(CommandContext<ex> $$0, apx.c $$1) throws CommandSyntaxException {
      apw $$2 = $$1.a($$0);
      fp.g $$3 = fp.a($$0, "sourcePath");
      return $$3.a($$2.a());
   }

   private static int a(CommandContext<ex> $$0, apx.c $$1, apx.a $$2, List<ut> $$3) throws CommandSyntaxException {
      apw $$4 = $$1.a($$0);
      fp.g $$5 = fp.a($$0, "targetPath");
      tw $$6 = $$4.a();
      int $$7 = $$2.modify($$0, $$6, $$5, $$3);
      if ($$7 == 0) {
         throw d.create();
      } else {
         $$4.a($$6);
         ((ex)$$0.getSource()).a(() -> $$4.b(), true);
         return $$7;
      }
   }

   private static int a(ex $$0, apw $$1, fp.g $$2) throws CommandSyntaxException {
      tw $$3 = $$1.a();
      int $$4 = $$2.c($$3);
      if ($$4 == 0) {
         throw d.create();
      } else {
         $$1.a($$3);
         $$0.a(() -> $$1.b(), true);
         return $$4;
      }
   }

   public static ut a(fp.g $$0, apw $$1) throws CommandSyntaxException {
      Collection<ut> $$2 = $$0.a($$1.a());
      Iterator<ut> $$3 = $$2.iterator();
      ut $$4 = $$3.next();
      if ($$3.hasNext()) {
         throw g.create();
      } else {
         return $$4;
      }
   }

   private static int b(ex $$0, apw $$1, fp.g $$2) throws CommandSyntaxException {
      ut $$3 = a($$2, $$1);
      int $$4;
      if ($$3 instanceof um) {
         $$4 = azk.a(((um)$$3).j());
      } else if ($$3 instanceof tv) {
         $$4 = ((tv)$$3).size();
      } else if ($$3 instanceof tw) {
         $$4 = ((tw)$$3).f();
      } else {
         if (!($$3 instanceof ur)) {
            throw f.create($$2.toString());
         }

         $$4 = $$3.p_().length();
      }

      $$0.a(() -> $$1.a($$3), false);
      return $$4;
   }

   private static int a(ex $$0, apw $$1, fp.g $$2, double $$3) throws CommandSyntaxException {
      ut $$4 = a($$2, $$1);
      if (!($$4 instanceof um)) {
         throw e.create($$2.toString());
      } else {
         int $$5 = azk.a(((um)$$4).j() * $$3);
         $$0.a(() -> $$1.a($$2, $$3, $$5), false);
         return $$5;
      }
   }

   private static int a(ex $$0, apw $$1) throws CommandSyntaxException {
      tw $$2 = $$1.a();
      $$0.a(() -> $$1.a((ut)$$2), false);
      return 1;
   }

   private static int a(ex $$0, apw $$1, tw $$2) throws CommandSyntaxException {
      tw $$3 = $$1.a();
      if (fp.g.a($$2, 0)) {
         throw fp.b.create();
      } else {
         tw $$4 = $$3.i().a($$2);
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
      int modify(CommandContext<ex> var1, tw var2, fp.g var3, List<ut> var4) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      ArgumentBuilder<ex, ?> create(apx.a var1);
   }

   public interface c {
      apw a(CommandContext<ex> var1) throws CommandSyntaxException;

      ArgumentBuilder<ex, ?> a(ArgumentBuilder<ex, ?> var1, Function<ArgumentBuilder<ex, ?>, ArgumentBuilder<ex, ?>> var2);
   }

   @FunctionalInterface
   interface d {
      String process(String var1) throws CommandSyntaxException;
   }
}
