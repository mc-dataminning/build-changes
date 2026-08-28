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
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class aqc {
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xa.c("commands.data.merge.failed"));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xa.b("commands.data.get.invalid", $$0));
   private static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> xa.b("commands.data.get.unknown", $$0));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(xa.c("commands.data.get.multiple"));
   private static final DynamicCommandExceptionType h = new DynamicCommandExceptionType($$0 -> xa.b("commands.data.modify.expected_object", $$0));
   private static final DynamicCommandExceptionType i = new DynamicCommandExceptionType($$0 -> xa.b("commands.data.modify.expected_value", $$0));
   private static final Dynamic2CommandExceptionType j = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xa.b("commands.data.modify.invalid_substring", $$0, $$1)
   );
   public static final List<Function<String, aqc.c>> a = ImmutableList.of(aqd.a, aqa.a, aqe.a);
   public static final List<aqc.c> b = a.stream().map($$0 -> $$0.apply("target")).collect(ImmutableList.toImmutableList());
   public static final List<aqc.c> c = a.stream().map($$0 -> $$0.apply("source")).collect(ImmutableList.toImmutableList());

   public static void a(CommandDispatcher<ej> $$0) {
      LiteralArgumentBuilder<ej> $$1 = (LiteralArgumentBuilder<ej>)ek.a("data").requires($$0x -> $$0x.c(2));

      for (aqc.c $$2 : b) {
         ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                     $$2.a(ek.a("merge"), $$1x -> $$1x.then(ek.a("nbt", et.a()).executes($$1xx -> a((ej)$$1xx.getSource(), $$2.a($$1xx), et.a($$1xx, "nbt")))))
                  ))
                  .then(
                     $$2.a(
                        ek.a("get"),
                        $$1x -> $$1x.executes($$1xx -> a((ej)$$1xx.getSource(), $$2.a($$1xx)))
                              .then(
                                 ((RequiredArgumentBuilder)ek.a("path", fb.a()).executes($$1xx -> b((ej)$$1xx.getSource(), $$2.a($$1xx), fb.a($$1xx, "path"))))
                                    .then(
                                       ek.a("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             $$1xx -> a((ej)$$1xx.getSource(), $$2.a($$1xx), fb.a($$1xx, "path"), DoubleArgumentType.getDouble($$1xx, "scale"))
                                          )
                                    )
                              )
                     )
                  ))
               .then(
                  $$2.a(ek.a("remove"), $$1x -> $$1x.then(ek.a("path", fb.a()).executes($$1xx -> a((ej)$$1xx.getSource(), $$2.a($$1xx), fb.a($$1xx, "path")))))
               ))
            .then(
               a(
                  (BiConsumer<ArgumentBuilder<ej, ?>, aqc.b>)(($$0x, $$1x) -> $$0x.then(
                           ek.a("insert")
                              .then(
                                 ek.a("index", IntegerArgumentType.integer())
                                    .then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(IntegerArgumentType.getInteger($$0xx, "index"), $$1xx, $$3)))
                              )
                        )
                        .then(ek.a("prepend").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(0, $$1xx, $$3))))
                        .then(ek.a("append").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(-1, $$1xx, $$3))))
                        .then(ek.a("set").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a($$1xx, (uy)Iterables.getLast($$3)))))
                        .then(ek.a("merge").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> {
                           tz $$4 = new tz();

                           for (uy $$5 : $$3) {
                              if (fb.g.a($$5, 0)) {
                                 throw fb.b.create();
                              }

                              if (!($$5 instanceof tz $$6)) {
                                 throw h.create($$5);
                              }

                              $$4.a($$6);
                           }

                           Collection<uy> $$7 = $$2x.a($$1xx, tz::new);
                           int $$8 = 0;

                           for (uy $$9 : $$7) {
                              if (!($$9 instanceof tz $$10)) {
                                 throw h.create($$9);
                              }

                              tz $$12 = $$10.l();
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

   private static String a(uy $$0) throws CommandSyntaxException {
      Objects.requireNonNull($$0);

      return switch ($$0) {
         case uw var3 -> {
            uw var8 = var3;

            try {
               var9 = var8.k();
            } catch (Throwable var6) {
               throw new MatchException(var6.toString(), var6);
            }

            String var7 = var9;
            yield var7;
         }
         case uq $$2 -> $$2.toString();
         default -> throw i.create($$0);
      };
   }

   private static List<uy> a(List<uy> $$0, aqc.d $$1) throws CommandSyntaxException {
      List<uy> $$2 = new ArrayList<>($$0.size());

      for (uy $$3 : $$0) {
         String $$4 = a($$3);
         $$2.add(uw.a($$1.process($$4)));
      }

      return $$2;
   }

   private static ArgumentBuilder<ej, ?> a(BiConsumer<ArgumentBuilder<ej, ?>, aqc.b> $$0) {
      LiteralArgumentBuilder<ej> $$1 = ek.a("modify");

      for (aqc.c $$2 : b) {
         $$2.a(
            $$1,
            $$2x -> {
               ArgumentBuilder<ej, ?> $$3 = ek.a("targetPath", fb.a());

               for (aqc.c $$4 : c) {
                  $$0.accept(
                     $$3,
                     $$2xx -> $$4.a(
                           ek.a("from"),
                           $$3x -> $$3x.executes($$3xx -> a($$3xx, $$2, $$2xx, a($$3xx, $$4)))
                                 .then(ek.a("sourcePath", fb.a()).executes($$3xx -> a($$3xx, $$2, $$2xx, b($$3xx, $$4))))
                        )
                  );
                  $$0.accept(
                     $$3,
                     $$2xx -> $$4.a(
                           ek.a("string"),
                           $$3x -> $$3x.executes($$3xx -> a($$3xx, $$2, $$2xx, a(a($$3xx, $$4), $$0xxxxx -> $$0xxxxx)))
                                 .then(
                                    ((RequiredArgumentBuilder)ek.a("sourcePath", fb.a())
                                          .executes($$3xx -> a($$3xx, $$2, $$2xx, a(b($$3xx, $$4), $$0xxxxx -> $$0xxxxx))))
                                       .then(
                                          ((RequiredArgumentBuilder)ek.a("start", IntegerArgumentType.integer())
                                                .executes(
                                                   $$3xx -> a(
                                                         $$3xx,
                                                         $$2,
                                                         $$2xx,
                                                         a(b($$3xx, $$4), $$1xxxxx -> a($$1xxxxx, IntegerArgumentType.getInteger($$3xx, "start")))
                                                      )
                                                ))
                                             .then(
                                                ek.a("end", IntegerArgumentType.integer())
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

               $$0.accept($$3, $$1xx -> ek.a("value").then(ek.a("value", fc.a()).executes($$2xx -> {
                     List<uy> $$3x = Collections.singletonList(fc.a($$2xx, "value"));
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

   private static List<uy> a(CommandContext<ej> $$0, aqc.c $$1) throws CommandSyntaxException {
      aqb $$2 = $$1.a($$0);
      return Collections.singletonList($$2.a());
   }

   private static List<uy> b(CommandContext<ej> $$0, aqc.c $$1) throws CommandSyntaxException {
      aqb $$2 = $$1.a($$0);
      fb.g $$3 = fb.a($$0, "sourcePath");
      return $$3.a($$2.a());
   }

   private static int a(CommandContext<ej> $$0, aqc.c $$1, aqc.a $$2, List<uy> $$3) throws CommandSyntaxException {
      aqb $$4 = $$1.a($$0);
      fb.g $$5 = fb.a($$0, "targetPath");
      tz $$6 = $$4.a();
      int $$7 = $$2.modify($$0, $$6, $$5, $$3);
      if ($$7 == 0) {
         throw d.create();
      } else {
         $$4.a($$6);
         ((ej)$$0.getSource()).a(() -> $$4.b(), true);
         return $$7;
      }
   }

   private static int a(ej $$0, aqb $$1, fb.g $$2) throws CommandSyntaxException {
      tz $$3 = $$1.a();
      int $$4 = $$2.c($$3);
      if ($$4 == 0) {
         throw d.create();
      } else {
         $$1.a($$3);
         $$0.a(() -> $$1.b(), true);
         return $$4;
      }
   }

   public static uy a(fb.g $$0, aqb $$1) throws CommandSyntaxException {
      Collection<uy> $$2 = $$0.a($$1.a());
      Iterator<uy> $$3 = $$2.iterator();
      uy $$4 = $$3.next();
      if ($$3.hasNext()) {
         throw g.create();
      } else {
         return $$4;
      }
   }

   private static int b(ej $$0, aqb $$1, fb.g $$2) throws CommandSyntaxException {
      uy $$3 = a($$2, $$1);
      Objects.requireNonNull($$3);

      int $$9 = switch ($$3) {
         case up $$4 -> azo.a($$4.k());
         case ty $$5 -> $$5.size();
         case tz $$6 -> $$6.i();
         case uw var10 -> {
            uw var10000 = var10;

            try {
               var15 = var10000.k();
            } catch (Throwable var13) {
               throw new MatchException(var13.toString(), var13);
            }

            String var14 = var15;
            yield var14.length();
         }
         case ub $$8 -> throw f.create($$2.toString());
         default -> throw new MatchException(null, null);
      };
      $$0.a(() -> $$1.a($$3), false);
      return $$9;
   }

   private static int a(ej $$0, aqb $$1, fb.g $$2, double $$3) throws CommandSyntaxException {
      uy $$4 = a($$2, $$1);
      if (!($$4 instanceof up)) {
         throw e.create($$2.toString());
      } else {
         int $$5 = azo.a(((up)$$4).k() * $$3);
         $$0.a(() -> $$1.a($$2, $$3, $$5), false);
         return $$5;
      }
   }

   private static int a(ej $$0, aqb $$1) throws CommandSyntaxException {
      tz $$2 = $$1.a();
      $$0.a(() -> $$1.a((uy)$$2), false);
      return 1;
   }

   private static int a(ej $$0, aqb $$1, tz $$2) throws CommandSyntaxException {
      tz $$3 = $$1.a();
      if (fb.g.a($$2, 0)) {
         throw fb.b.create();
      } else {
         tz $$4 = $$3.l().a($$2);
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
      int modify(CommandContext<ej> var1, tz var2, fb.g var3, List<uy> var4) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      ArgumentBuilder<ej, ?> create(aqc.a var1);
   }

   public interface c {
      aqb a(CommandContext<ej> var1) throws CommandSyntaxException;

      ArgumentBuilder<ej, ?> a(ArgumentBuilder<ej, ?> var1, Function<ArgumentBuilder<ej, ?>, ArgumentBuilder<ej, ?>> var2);
   }

   @FunctionalInterface
   interface d {
      String process(String var1) throws CommandSyntaxException;
   }
}
