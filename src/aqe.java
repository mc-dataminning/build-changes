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

public class aqe {
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xc.c("commands.data.merge.failed"));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xc.b("commands.data.get.invalid", $$0));
   private static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> xc.b("commands.data.get.unknown", $$0));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(xc.c("commands.data.get.multiple"));
   private static final DynamicCommandExceptionType h = new DynamicCommandExceptionType($$0 -> xc.b("commands.data.modify.expected_object", $$0));
   private static final DynamicCommandExceptionType i = new DynamicCommandExceptionType($$0 -> xc.b("commands.data.modify.expected_value", $$0));
   private static final Dynamic2CommandExceptionType j = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xc.b("commands.data.modify.invalid_substring", $$0, $$1)
   );
   public static final List<Function<String, aqe.c>> a = ImmutableList.of(aqf.a, aqc.a, aqg.a);
   public static final List<aqe.c> b = a.stream().map($$0 -> $$0.apply("target")).collect(ImmutableList.toImmutableList());
   public static final List<aqe.c> c = a.stream().map($$0 -> $$0.apply("source")).collect(ImmutableList.toImmutableList());

   public static void a(CommandDispatcher<ek> $$0) {
      LiteralArgumentBuilder<ek> $$1 = (LiteralArgumentBuilder<ek>)el.a("data").requires($$0x -> $$0x.c(2));

      for (aqe.c $$2 : b) {
         ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                     $$2.a(el.a("merge"), $$1x -> $$1x.then(el.a("nbt", eu.a()).executes($$1xx -> a((ek)$$1xx.getSource(), $$2.a($$1xx), eu.a($$1xx, "nbt")))))
                  ))
                  .then(
                     $$2.a(
                        el.a("get"),
                        $$1x -> $$1x.executes($$1xx -> a((ek)$$1xx.getSource(), $$2.a($$1xx)))
                              .then(
                                 ((RequiredArgumentBuilder)el.a("path", fc.a()).executes($$1xx -> b((ek)$$1xx.getSource(), $$2.a($$1xx), fc.a($$1xx, "path"))))
                                    .then(
                                       el.a("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             $$1xx -> a((ek)$$1xx.getSource(), $$2.a($$1xx), fc.a($$1xx, "path"), DoubleArgumentType.getDouble($$1xx, "scale"))
                                          )
                                    )
                              )
                     )
                  ))
               .then(
                  $$2.a(el.a("remove"), $$1x -> $$1x.then(el.a("path", fc.a()).executes($$1xx -> a((ek)$$1xx.getSource(), $$2.a($$1xx), fc.a($$1xx, "path")))))
               ))
            .then(
               a(
                  (BiConsumer<ArgumentBuilder<ek, ?>, aqe.b>)(($$0x, $$1x) -> $$0x.then(
                           el.a("insert")
                              .then(
                                 el.a("index", IntegerArgumentType.integer())
                                    .then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(IntegerArgumentType.getInteger($$0xx, "index"), $$1xx, $$3)))
                              )
                        )
                        .then(el.a("prepend").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(0, $$1xx, $$3))))
                        .then(el.a("append").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(-1, $$1xx, $$3))))
                        .then(el.a("set").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a($$1xx, (va)Iterables.getLast($$3)))))
                        .then(el.a("merge").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> {
                           ua $$4 = new ua();

                           for (va $$5 : $$3) {
                              if (fc.g.a($$5, 0)) {
                                 throw fc.b.create();
                              }

                              if (!($$5 instanceof ua $$6)) {
                                 throw h.create($$5);
                              }

                              $$4.a($$6);
                           }

                           Collection<va> $$7 = $$2x.a($$1xx, ua::new);
                           int $$8 = 0;

                           for (va $$9 : $$7) {
                              if (!($$9 instanceof ua $$10)) {
                                 throw h.create($$9);
                              }

                              ua $$12 = $$10.l();
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

   private static String a(va $$0) throws CommandSyntaxException {
      Objects.requireNonNull($$0);

      return switch ($$0) {
         case uy var3 -> {
            uy var8 = var3;

            try {
               var9 = var8.k();
            } catch (Throwable var6) {
               throw new MatchException(var6.toString(), var6);
            }

            String var7 = var9;
            yield var7;
         }
         case ur $$2 -> $$2.toString();
         default -> throw i.create($$0);
      };
   }

   private static List<va> a(List<va> $$0, aqe.d $$1) throws CommandSyntaxException {
      List<va> $$2 = new ArrayList<>($$0.size());

      for (va $$3 : $$0) {
         String $$4 = a($$3);
         $$2.add(uy.a($$1.process($$4)));
      }

      return $$2;
   }

   private static ArgumentBuilder<ek, ?> a(BiConsumer<ArgumentBuilder<ek, ?>, aqe.b> $$0) {
      LiteralArgumentBuilder<ek> $$1 = el.a("modify");

      for (aqe.c $$2 : b) {
         $$2.a(
            $$1,
            $$2x -> {
               ArgumentBuilder<ek, ?> $$3 = el.a("targetPath", fc.a());

               for (aqe.c $$4 : c) {
                  $$0.accept(
                     $$3,
                     $$2xx -> $$4.a(
                           el.a("from"),
                           $$3x -> $$3x.executes($$3xx -> a($$3xx, $$2, $$2xx, a($$3xx, $$4)))
                                 .then(el.a("sourcePath", fc.a()).executes($$3xx -> a($$3xx, $$2, $$2xx, b($$3xx, $$4))))
                        )
                  );
                  $$0.accept(
                     $$3,
                     $$2xx -> $$4.a(
                           el.a("string"),
                           $$3x -> $$3x.executes($$3xx -> a($$3xx, $$2, $$2xx, a(a($$3xx, $$4), $$0xxxxx -> $$0xxxxx)))
                                 .then(
                                    ((RequiredArgumentBuilder)el.a("sourcePath", fc.a())
                                          .executes($$3xx -> a($$3xx, $$2, $$2xx, a(b($$3xx, $$4), $$0xxxxx -> $$0xxxxx))))
                                       .then(
                                          ((RequiredArgumentBuilder)el.a("start", IntegerArgumentType.integer())
                                                .executes(
                                                   $$3xx -> a(
                                                         $$3xx,
                                                         $$2,
                                                         $$2xx,
                                                         a(b($$3xx, $$4), $$1xxxxx -> a($$1xxxxx, IntegerArgumentType.getInteger($$3xx, "start")))
                                                      )
                                                ))
                                             .then(
                                                el.a("end", IntegerArgumentType.integer())
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

               $$0.accept($$3, $$1xx -> el.a("value").then(el.a("value", fd.a()).executes($$2xx -> {
                     List<va> $$3x = Collections.singletonList(fd.a($$2xx, "value"));
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

   private static List<va> a(CommandContext<ek> $$0, aqe.c $$1) throws CommandSyntaxException {
      aqd $$2 = $$1.a($$0);
      return Collections.singletonList($$2.a());
   }

   private static List<va> b(CommandContext<ek> $$0, aqe.c $$1) throws CommandSyntaxException {
      aqd $$2 = $$1.a($$0);
      fc.g $$3 = fc.a($$0, "sourcePath");
      return $$3.a($$2.a());
   }

   private static int a(CommandContext<ek> $$0, aqe.c $$1, aqe.a $$2, List<va> $$3) throws CommandSyntaxException {
      aqd $$4 = $$1.a($$0);
      fc.g $$5 = fc.a($$0, "targetPath");
      ua $$6 = $$4.a();
      int $$7 = $$2.modify($$0, $$6, $$5, $$3);
      if ($$7 == 0) {
         throw d.create();
      } else {
         $$4.a($$6);
         ((ek)$$0.getSource()).a(() -> $$4.b(), true);
         return $$7;
      }
   }

   private static int a(ek $$0, aqd $$1, fc.g $$2) throws CommandSyntaxException {
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

   public static va a(fc.g $$0, aqd $$1) throws CommandSyntaxException {
      Collection<va> $$2 = $$0.a($$1.a());
      Iterator<va> $$3 = $$2.iterator();
      va $$4 = $$3.next();
      if ($$3.hasNext()) {
         throw g.create();
      } else {
         return $$4;
      }
   }

   private static int b(ek $$0, aqd $$1, fc.g $$2) throws CommandSyntaxException {
      va $$3 = a($$2, $$1);
      Objects.requireNonNull($$3);

      int $$9 = switch ($$3) {
         case uq $$4 -> azq.a($$4.k());
         case tz $$5 -> $$5.size();
         case ua $$6 -> $$6.i();
         case uy var10 -> {
            uy var10000 = var10;

            try {
               var15 = var10000.k();
            } catch (Throwable var13) {
               throw new MatchException(var13.toString(), var13);
            }

            String var14 = var15;
            yield var14.length();
         }
         case uc $$8 -> throw f.create($$2.toString());
         default -> throw new MatchException(null, null);
      };
      $$0.a(() -> $$1.a($$3), false);
      return $$9;
   }

   private static int a(ek $$0, aqd $$1, fc.g $$2, double $$3) throws CommandSyntaxException {
      va $$4 = a($$2, $$1);
      if (!($$4 instanceof uq)) {
         throw e.create($$2.toString());
      } else {
         int $$5 = azq.a(((uq)$$4).k() * $$3);
         $$0.a(() -> $$1.a($$2, $$3, $$5), false);
         return $$5;
      }
   }

   private static int a(ek $$0, aqd $$1) throws CommandSyntaxException {
      ua $$2 = $$1.a();
      $$0.a(() -> $$1.a((va)$$2), false);
      return 1;
   }

   private static int a(ek $$0, aqd $$1, ua $$2) throws CommandSyntaxException {
      ua $$3 = $$1.a();
      if (fc.g.a($$2, 0)) {
         throw fc.b.create();
      } else {
         ua $$4 = $$3.l().a($$2);
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
      int modify(CommandContext<ek> var1, ua var2, fc.g var3, List<va> var4) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      ArgumentBuilder<ek, ?> create(aqe.a var1);
   }

   public interface c {
      aqd a(CommandContext<ek> var1) throws CommandSyntaxException;

      ArgumentBuilder<ek, ?> a(ArgumentBuilder<ek, ?> var1, Function<ArgumentBuilder<ek, ?>, ArgumentBuilder<ek, ?>> var2);
   }

   @FunctionalInterface
   interface d {
      String process(String var1) throws CommandSyntaxException;
   }
}
