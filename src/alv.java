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

public class alv {
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(vg.c("commands.data.merge.failed"));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> vg.b("commands.data.get.invalid", $$0));
   private static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> vg.b("commands.data.get.unknown", $$0));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(vg.c("commands.data.get.multiple"));
   private static final DynamicCommandExceptionType h = new DynamicCommandExceptionType($$0 -> vg.b("commands.data.modify.expected_object", $$0));
   private static final DynamicCommandExceptionType i = new DynamicCommandExceptionType($$0 -> vg.b("commands.data.modify.expected_value", $$0));
   private static final Dynamic2CommandExceptionType j = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> vg.b("commands.data.modify.invalid_substring", $$0, $$1)
   );
   public static final List<Function<String, alv.c>> a = ImmutableList.of(alw.a, alt.a, alx.a);
   public static final List<alv.c> b = a.stream().map($$0 -> $$0.apply("target")).collect(ImmutableList.toImmutableList());
   public static final List<alv.c> c = a.stream().map($$0 -> $$0.apply("source")).collect(ImmutableList.toImmutableList());

   public static void a(CommandDispatcher<ds> $$0) {
      LiteralArgumentBuilder<ds> $$1 = (LiteralArgumentBuilder<ds>)dt.a("data").requires($$0x -> $$0x.c(2));

      for (alv.c $$2 : b) {
         ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                     $$2.a(dt.a("merge"), $$1x -> $$1x.then(dt.a("nbt", ec.a()).executes($$1xx -> a((ds)$$1xx.getSource(), $$2.a($$1xx), ec.a($$1xx, "nbt")))))
                  ))
                  .then(
                     $$2.a(
                        dt.a("get"),
                        $$1x -> $$1x.executes($$1xx -> a((ds)$$1xx.getSource(), $$2.a($$1xx)))
                              .then(
                                 ((RequiredArgumentBuilder)dt.a("path", ek.a()).executes($$1xx -> b((ds)$$1xx.getSource(), $$2.a($$1xx), ek.a($$1xx, "path"))))
                                    .then(
                                       dt.a("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             $$1xx -> a((ds)$$1xx.getSource(), $$2.a($$1xx), ek.a($$1xx, "path"), DoubleArgumentType.getDouble($$1xx, "scale"))
                                          )
                                    )
                              )
                     )
                  ))
               .then(
                  $$2.a(dt.a("remove"), $$1x -> $$1x.then(dt.a("path", ek.a()).executes($$1xx -> a((ds)$$1xx.getSource(), $$2.a($$1xx), ek.a($$1xx, "path")))))
               ))
            .then(
               a(
                  (BiConsumer<ArgumentBuilder<ds, ?>, alv.b>)(($$0x, $$1x) -> $$0x.then(
                           dt.a("insert")
                              .then(
                                 dt.a("index", IntegerArgumentType.integer())
                                    .then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(IntegerArgumentType.getInteger($$0xx, "index"), $$1xx, $$3)))
                              )
                        )
                        .then(dt.a("prepend").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(0, $$1xx, $$3))))
                        .then(dt.a("append").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(-1, $$1xx, $$3))))
                        .then(dt.a("set").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a($$1xx, (tl)Iterables.getLast($$3)))))
                        .then(dt.a("merge").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> {
                           so $$4 = new so();

                           for (tl $$5 : $$3) {
                              if (ek.g.a($$5, 0)) {
                                 throw ek.b.create();
                              }

                              if (!($$5 instanceof so $$6)) {
                                 throw h.create($$5);
                              }

                              $$4.a($$6);
                           }

                           Collection<tl> $$7 = $$2x.a($$1xx, so::new);
                           int $$8 = 0;

                           for (tl $$9 : $$7) {
                              if (!($$9 instanceof so $$10)) {
                                 throw h.create($$9);
                              }

                              so $$12 = $$10.h();
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

   private static String a(tl $$0) throws CommandSyntaxException {
      if ($$0.c().d()) {
         return $$0.t_();
      } else {
         throw i.create($$0);
      }
   }

   private static List<tl> a(List<tl> $$0, alv.d $$1) throws CommandSyntaxException {
      List<tl> $$2 = new ArrayList<>($$0.size());

      for (tl $$3 : $$0) {
         String $$4 = a($$3);
         $$2.add(tj.a($$1.process($$4)));
      }

      return $$2;
   }

   private static ArgumentBuilder<ds, ?> a(BiConsumer<ArgumentBuilder<ds, ?>, alv.b> $$0) {
      LiteralArgumentBuilder<ds> $$1 = dt.a("modify");

      for (alv.c $$2 : b) {
         $$2.a(
            $$1,
            $$2x -> {
               ArgumentBuilder<ds, ?> $$3 = dt.a("targetPath", ek.a());

               for (alv.c $$4 : c) {
                  $$0.accept(
                     $$3,
                     $$2xx -> $$4.a(
                           dt.a("from"),
                           $$3x -> $$3x.executes($$3xx -> a($$3xx, $$2, $$2xx, a($$3xx, $$4)))
                                 .then(dt.a("sourcePath", ek.a()).executes($$3xx -> a($$3xx, $$2, $$2xx, b($$3xx, $$4))))
                        )
                  );
                  $$0.accept(
                     $$3,
                     $$2xx -> $$4.a(
                           dt.a("string"),
                           $$3x -> $$3x.executes($$3xx -> a($$3xx, $$2, $$2xx, a(a($$3xx, $$4), $$0xxxxx -> $$0xxxxx)))
                                 .then(
                                    ((RequiredArgumentBuilder)dt.a("sourcePath", ek.a())
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

               $$0.accept($$3, $$1xx -> dt.a("value").then(dt.a("value", el.a()).executes($$2xx -> {
                     List<tl> $$3x = Collections.singletonList(el.a($$2xx, "value"));
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

   private static List<tl> a(CommandContext<ds> $$0, alv.c $$1) throws CommandSyntaxException {
      alu $$2 = $$1.a($$0);
      return Collections.singletonList($$2.a());
   }

   private static List<tl> b(CommandContext<ds> $$0, alv.c $$1) throws CommandSyntaxException {
      alu $$2 = $$1.a($$0);
      ek.g $$3 = ek.a($$0, "sourcePath");
      return $$3.a($$2.a());
   }

   private static int a(CommandContext<ds> $$0, alv.c $$1, alv.a $$2, List<tl> $$3) throws CommandSyntaxException {
      alu $$4 = $$1.a($$0);
      ek.g $$5 = ek.a($$0, "targetPath");
      so $$6 = $$4.a();
      int $$7 = $$2.modify($$0, $$6, $$5, $$3);
      if ($$7 == 0) {
         throw d.create();
      } else {
         $$4.a($$6);
         ((ds)$$0.getSource()).a(() -> $$4.b(), true);
         return $$7;
      }
   }

   private static int a(ds $$0, alu $$1, ek.g $$2) throws CommandSyntaxException {
      so $$3 = $$1.a();
      int $$4 = $$2.c($$3);
      if ($$4 == 0) {
         throw d.create();
      } else {
         $$1.a($$3);
         $$0.a(() -> $$1.b(), true);
         return $$4;
      }
   }

   public static tl a(ek.g $$0, alu $$1) throws CommandSyntaxException {
      Collection<tl> $$2 = $$0.a($$1.a());
      Iterator<tl> $$3 = $$2.iterator();
      tl $$4 = $$3.next();
      if ($$3.hasNext()) {
         throw g.create();
      } else {
         return $$4;
      }
   }

   private static int b(ds $$0, alu $$1, ek.g $$2) throws CommandSyntaxException {
      tl $$3 = a($$2, $$1);
      int $$4;
      if ($$3 instanceof te) {
         $$4 = aup.a(((te)$$3).j());
      } else if ($$3 instanceof sn) {
         $$4 = ((sn)$$3).size();
      } else if ($$3 instanceof so) {
         $$4 = ((so)$$3).f();
      } else {
         if (!($$3 instanceof tj)) {
            throw f.create($$2.toString());
         }

         $$4 = $$3.t_().length();
      }

      $$0.a(() -> $$1.a($$3), false);
      return $$4;
   }

   private static int a(ds $$0, alu $$1, ek.g $$2, double $$3) throws CommandSyntaxException {
      tl $$4 = a($$2, $$1);
      if (!($$4 instanceof te)) {
         throw e.create($$2.toString());
      } else {
         int $$5 = aup.a(((te)$$4).j() * $$3);
         $$0.a(() -> $$1.a($$2, $$3, $$5), false);
         return $$5;
      }
   }

   private static int a(ds $$0, alu $$1) throws CommandSyntaxException {
      so $$2 = $$1.a();
      $$0.a(() -> $$1.a((tl)$$2), false);
      return 1;
   }

   private static int a(ds $$0, alu $$1, so $$2) throws CommandSyntaxException {
      so $$3 = $$1.a();
      if (ek.g.a($$2, 0)) {
         throw ek.b.create();
      } else {
         so $$4 = $$3.h().a($$2);
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
      int modify(CommandContext<ds> var1, so var2, ek.g var3, List<tl> var4) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      ArgumentBuilder<ds, ?> create(alv.a var1);
   }

   public interface c {
      alu a(CommandContext<ds> var1) throws CommandSyntaxException;

      ArgumentBuilder<ds, ?> a(ArgumentBuilder<ds, ?> var1, Function<ArgumentBuilder<ds, ?>, ArgumentBuilder<ds, ?>> var2);
   }

   @FunctionalInterface
   interface d {
      String process(String var1) throws CommandSyntaxException;
   }
}
