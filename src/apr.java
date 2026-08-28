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

public class apr {
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xl.c("commands.data.merge.failed"));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xl.b("commands.data.get.invalid", $$0));
   private static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> xl.b("commands.data.get.unknown", $$0));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(xl.c("commands.data.get.multiple"));
   private static final DynamicCommandExceptionType h = new DynamicCommandExceptionType($$0 -> xl.b("commands.data.modify.expected_object", $$0));
   private static final DynamicCommandExceptionType i = new DynamicCommandExceptionType($$0 -> xl.b("commands.data.modify.expected_value", $$0));
   private static final Dynamic2CommandExceptionType j = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xl.b("commands.data.modify.invalid_substring", $$0, $$1)
   );
   public static final List<Function<String, apr.c>> a = ImmutableList.of(aps.a, app.a, apt.a);
   public static final List<apr.c> b = a.stream().map($$0 -> $$0.apply("target")).collect(ImmutableList.toImmutableList());
   public static final List<apr.c> c = a.stream().map($$0 -> $$0.apply("source")).collect(ImmutableList.toImmutableList());

   public static void a(CommandDispatcher<ep> $$0) {
      LiteralArgumentBuilder<ep> $$1 = (LiteralArgumentBuilder<ep>)eq.a("data").requires($$0x -> $$0x.c(2));

      for (apr.c $$2 : b) {
         ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                     $$2.a(eq.a("merge"), $$1x -> $$1x.then(eq.a("nbt", ez.a()).executes($$1xx -> a((ep)$$1xx.getSource(), $$2.a($$1xx), ez.a($$1xx, "nbt")))))
                  ))
                  .then(
                     $$2.a(
                        eq.a("get"),
                        $$1x -> $$1x.executes($$1xx -> a((ep)$$1xx.getSource(), $$2.a($$1xx)))
                              .then(
                                 ((RequiredArgumentBuilder)eq.a("path", fh.a()).executes($$1xx -> b((ep)$$1xx.getSource(), $$2.a($$1xx), fh.a($$1xx, "path"))))
                                    .then(
                                       eq.a("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             $$1xx -> a((ep)$$1xx.getSource(), $$2.a($$1xx), fh.a($$1xx, "path"), DoubleArgumentType.getDouble($$1xx, "scale"))
                                          )
                                    )
                              )
                     )
                  ))
               .then(
                  $$2.a(eq.a("remove"), $$1x -> $$1x.then(eq.a("path", fh.a()).executes($$1xx -> a((ep)$$1xx.getSource(), $$2.a($$1xx), fh.a($$1xx, "path")))))
               ))
            .then(
               a(
                  (BiConsumer<ArgumentBuilder<ep, ?>, apr.b>)(($$0x, $$1x) -> $$0x.then(
                           eq.a("insert")
                              .then(
                                 eq.a("index", IntegerArgumentType.integer())
                                    .then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(IntegerArgumentType.getInteger($$0xx, "index"), $$1xx, $$3)))
                              )
                        )
                        .then(eq.a("prepend").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(0, $$1xx, $$3))))
                        .then(eq.a("append").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(-1, $$1xx, $$3))))
                        .then(eq.a("set").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a($$1xx, (vo)Iterables.getLast($$3)))))
                        .then(eq.a("merge").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> {
                           ur $$4 = new ur();

                           for (vo $$5 : $$3) {
                              if (fh.g.a($$5, 0)) {
                                 throw fh.b.create();
                              }

                              if (!($$5 instanceof ur $$6)) {
                                 throw h.create($$5);
                              }

                              $$4.a($$6);
                           }

                           Collection<vo> $$7 = $$2x.a($$1xx, ur::new);
                           int $$8 = 0;

                           for (vo $$9 : $$7) {
                              if (!($$9 instanceof ur $$10)) {
                                 throw h.create($$9);
                              }

                              ur $$12 = $$10.h();
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

   private static String a(vo $$0) throws CommandSyntaxException {
      if ($$0.c().d()) {
         return $$0.s_();
      } else {
         throw i.create($$0);
      }
   }

   private static List<vo> a(List<vo> $$0, apr.d $$1) throws CommandSyntaxException {
      List<vo> $$2 = new ArrayList<>($$0.size());

      for (vo $$3 : $$0) {
         String $$4 = a($$3);
         $$2.add(vm.a($$1.process($$4)));
      }

      return $$2;
   }

   private static ArgumentBuilder<ep, ?> a(BiConsumer<ArgumentBuilder<ep, ?>, apr.b> $$0) {
      LiteralArgumentBuilder<ep> $$1 = eq.a("modify");

      for (apr.c $$2 : b) {
         $$2.a(
            $$1,
            $$2x -> {
               ArgumentBuilder<ep, ?> $$3 = eq.a("targetPath", fh.a());

               for (apr.c $$4 : c) {
                  $$0.accept(
                     $$3,
                     $$2xx -> $$4.a(
                           eq.a("from"),
                           $$3x -> $$3x.executes($$3xx -> a($$3xx, $$2, $$2xx, a($$3xx, $$4)))
                                 .then(eq.a("sourcePath", fh.a()).executes($$3xx -> a($$3xx, $$2, $$2xx, b($$3xx, $$4))))
                        )
                  );
                  $$0.accept(
                     $$3,
                     $$2xx -> $$4.a(
                           eq.a("string"),
                           $$3x -> $$3x.executes($$3xx -> a($$3xx, $$2, $$2xx, a(a($$3xx, $$4), $$0xxxxx -> $$0xxxxx)))
                                 .then(
                                    ((RequiredArgumentBuilder)eq.a("sourcePath", fh.a())
                                          .executes($$3xx -> a($$3xx, $$2, $$2xx, a(b($$3xx, $$4), $$0xxxxx -> $$0xxxxx))))
                                       .then(
                                          ((RequiredArgumentBuilder)eq.a("start", IntegerArgumentType.integer())
                                                .executes(
                                                   $$3xx -> a(
                                                         $$3xx,
                                                         $$2,
                                                         $$2xx,
                                                         a(b($$3xx, $$4), $$1xxxxx -> a($$1xxxxx, IntegerArgumentType.getInteger($$3xx, "start")))
                                                      )
                                                ))
                                             .then(
                                                eq.a("end", IntegerArgumentType.integer())
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

               $$0.accept($$3, $$1xx -> eq.a("value").then(eq.a("value", fi.a()).executes($$2xx -> {
                     List<vo> $$3x = Collections.singletonList(fi.a($$2xx, "value"));
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

   private static List<vo> a(CommandContext<ep> $$0, apr.c $$1) throws CommandSyntaxException {
      apq $$2 = $$1.a($$0);
      return Collections.singletonList($$2.a());
   }

   private static List<vo> b(CommandContext<ep> $$0, apr.c $$1) throws CommandSyntaxException {
      apq $$2 = $$1.a($$0);
      fh.g $$3 = fh.a($$0, "sourcePath");
      return $$3.a($$2.a());
   }

   private static int a(CommandContext<ep> $$0, apr.c $$1, apr.a $$2, List<vo> $$3) throws CommandSyntaxException {
      apq $$4 = $$1.a($$0);
      fh.g $$5 = fh.a($$0, "targetPath");
      ur $$6 = $$4.a();
      int $$7 = $$2.modify($$0, $$6, $$5, $$3);
      if ($$7 == 0) {
         throw d.create();
      } else {
         $$4.a($$6);
         ((ep)$$0.getSource()).a(() -> $$4.b(), true);
         return $$7;
      }
   }

   private static int a(ep $$0, apq $$1, fh.g $$2) throws CommandSyntaxException {
      ur $$3 = $$1.a();
      int $$4 = $$2.c($$3);
      if ($$4 == 0) {
         throw d.create();
      } else {
         $$1.a($$3);
         $$0.a(() -> $$1.b(), true);
         return $$4;
      }
   }

   public static vo a(fh.g $$0, apq $$1) throws CommandSyntaxException {
      Collection<vo> $$2 = $$0.a($$1.a());
      Iterator<vo> $$3 = $$2.iterator();
      vo $$4 = $$3.next();
      if ($$3.hasNext()) {
         throw g.create();
      } else {
         return $$4;
      }
   }

   private static int b(ep $$0, apq $$1, fh.g $$2) throws CommandSyntaxException {
      vo $$3 = a($$2, $$1);
      int $$4;
      if ($$3 instanceof vh) {
         $$4 = ayu.a(((vh)$$3).j());
      } else if ($$3 instanceof uq) {
         $$4 = ((uq)$$3).size();
      } else if ($$3 instanceof ur) {
         $$4 = ((ur)$$3).f();
      } else {
         if (!($$3 instanceof vm)) {
            throw f.create($$2.toString());
         }

         $$4 = $$3.s_().length();
      }

      $$0.a(() -> $$1.a($$3), false);
      return $$4;
   }

   private static int a(ep $$0, apq $$1, fh.g $$2, double $$3) throws CommandSyntaxException {
      vo $$4 = a($$2, $$1);
      if (!($$4 instanceof vh)) {
         throw e.create($$2.toString());
      } else {
         int $$5 = ayu.a(((vh)$$4).j() * $$3);
         $$0.a(() -> $$1.a($$2, $$3, $$5), false);
         return $$5;
      }
   }

   private static int a(ep $$0, apq $$1) throws CommandSyntaxException {
      ur $$2 = $$1.a();
      $$0.a(() -> $$1.a((vo)$$2), false);
      return 1;
   }

   private static int a(ep $$0, apq $$1, ur $$2) throws CommandSyntaxException {
      ur $$3 = $$1.a();
      if (fh.g.a($$2, 0)) {
         throw fh.b.create();
      } else {
         ur $$4 = $$3.h().a($$2);
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
      int modify(CommandContext<ep> var1, ur var2, fh.g var3, List<vo> var4) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      ArgumentBuilder<ep, ?> create(apr.a var1);
   }

   public interface c {
      apq a(CommandContext<ep> var1) throws CommandSyntaxException;

      ArgumentBuilder<ep, ?> a(ArgumentBuilder<ep, ?> var1, Function<ArgumentBuilder<ep, ?>, ArgumentBuilder<ep, ?>> var2);
   }

   @FunctionalInterface
   interface d {
      String process(String var1) throws CommandSyntaxException;
   }
}
