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

public class apc {
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wx.c("commands.data.merge.failed"));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> wx.b("commands.data.get.invalid", $$0));
   private static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> wx.b("commands.data.get.unknown", $$0));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(wx.c("commands.data.get.multiple"));
   private static final DynamicCommandExceptionType h = new DynamicCommandExceptionType($$0 -> wx.b("commands.data.modify.expected_object", $$0));
   private static final DynamicCommandExceptionType i = new DynamicCommandExceptionType($$0 -> wx.b("commands.data.modify.expected_value", $$0));
   private static final Dynamic2CommandExceptionType j = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> wx.b("commands.data.modify.invalid_substring", $$0, $$1)
   );
   public static final List<Function<String, apc.c>> a = ImmutableList.of(apd.a, apa.a, ape.a);
   public static final List<apc.c> b = a.stream().map($$0 -> $$0.apply("target")).collect(ImmutableList.toImmutableList());
   public static final List<apc.c> c = a.stream().map($$0 -> $$0.apply("source")).collect(ImmutableList.toImmutableList());

   public static void a(CommandDispatcher<ee> $$0) {
      LiteralArgumentBuilder<ee> $$1 = (LiteralArgumentBuilder<ee>)ef.a("data").requires($$0x -> $$0x.c(2));

      for (apc.c $$2 : b) {
         ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                     $$2.a(ef.a("merge"), $$1x -> $$1x.then(ef.a("nbt", eo.a()).executes($$1xx -> a((ee)$$1xx.getSource(), $$2.a($$1xx), eo.a($$1xx, "nbt")))))
                  ))
                  .then(
                     $$2.a(
                        ef.a("get"),
                        $$1x -> $$1x.executes($$1xx -> a((ee)$$1xx.getSource(), $$2.a($$1xx)))
                              .then(
                                 ((RequiredArgumentBuilder)ef.a("path", ew.a()).executes($$1xx -> b((ee)$$1xx.getSource(), $$2.a($$1xx), ew.a($$1xx, "path"))))
                                    .then(
                                       ef.a("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             $$1xx -> a((ee)$$1xx.getSource(), $$2.a($$1xx), ew.a($$1xx, "path"), DoubleArgumentType.getDouble($$1xx, "scale"))
                                          )
                                    )
                              )
                     )
                  ))
               .then(
                  $$2.a(ef.a("remove"), $$1x -> $$1x.then(ef.a("path", ew.a()).executes($$1xx -> a((ee)$$1xx.getSource(), $$2.a($$1xx), ew.a($$1xx, "path")))))
               ))
            .then(
               a(
                  (BiConsumer<ArgumentBuilder<ee, ?>, apc.b>)(($$0x, $$1x) -> $$0x.then(
                           ef.a("insert")
                              .then(
                                 ef.a("index", IntegerArgumentType.integer())
                                    .then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(IntegerArgumentType.getInteger($$0xx, "index"), $$1xx, $$3)))
                              )
                        )
                        .then(ef.a("prepend").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(0, $$1xx, $$3))))
                        .then(ef.a("append").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(-1, $$1xx, $$3))))
                        .then(ef.a("set").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a($$1xx, (va)Iterables.getLast($$3)))))
                        .then(ef.a("merge").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> {
                           ud $$4 = new ud();

                           for (va $$5 : $$3) {
                              if (ew.g.a($$5, 0)) {
                                 throw ew.b.create();
                              }

                              if (!($$5 instanceof ud $$6)) {
                                 throw h.create($$5);
                              }

                              $$4.a($$6);
                           }

                           Collection<va> $$7 = $$2x.a($$1xx, ud::new);
                           int $$8 = 0;

                           for (va $$9 : $$7) {
                              if (!($$9 instanceof ud $$10)) {
                                 throw h.create($$9);
                              }

                              ud $$12 = $$10.h();
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
      if ($$0.c().d()) {
         return $$0.s_();
      } else {
         throw i.create($$0);
      }
   }

   private static List<va> a(List<va> $$0, apc.d $$1) throws CommandSyntaxException {
      List<va> $$2 = new ArrayList<>($$0.size());

      for (va $$3 : $$0) {
         String $$4 = a($$3);
         $$2.add(uy.a($$1.process($$4)));
      }

      return $$2;
   }

   private static ArgumentBuilder<ee, ?> a(BiConsumer<ArgumentBuilder<ee, ?>, apc.b> $$0) {
      LiteralArgumentBuilder<ee> $$1 = ef.a("modify");

      for (apc.c $$2 : b) {
         $$2.a(
            $$1,
            $$2x -> {
               ArgumentBuilder<ee, ?> $$3 = ef.a("targetPath", ew.a());

               for (apc.c $$4 : c) {
                  $$0.accept(
                     $$3,
                     $$2xx -> $$4.a(
                           ef.a("from"),
                           $$3x -> $$3x.executes($$3xx -> a($$3xx, $$2, $$2xx, a($$3xx, $$4)))
                                 .then(ef.a("sourcePath", ew.a()).executes($$3xx -> a($$3xx, $$2, $$2xx, b($$3xx, $$4))))
                        )
                  );
                  $$0.accept(
                     $$3,
                     $$2xx -> $$4.a(
                           ef.a("string"),
                           $$3x -> $$3x.executes($$3xx -> a($$3xx, $$2, $$2xx, a(a($$3xx, $$4), $$0xxxxx -> $$0xxxxx)))
                                 .then(
                                    ((RequiredArgumentBuilder)ef.a("sourcePath", ew.a())
                                          .executes($$3xx -> a($$3xx, $$2, $$2xx, a(b($$3xx, $$4), $$0xxxxx -> $$0xxxxx))))
                                       .then(
                                          ((RequiredArgumentBuilder)ef.a("start", IntegerArgumentType.integer())
                                                .executes(
                                                   $$3xx -> a(
                                                         $$3xx,
                                                         $$2,
                                                         $$2xx,
                                                         a(b($$3xx, $$4), $$1xxxxx -> a($$1xxxxx, IntegerArgumentType.getInteger($$3xx, "start")))
                                                      )
                                                ))
                                             .then(
                                                ef.a("end", IntegerArgumentType.integer())
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

               $$0.accept($$3, $$1xx -> ef.a("value").then(ef.a("value", ex.a()).executes($$2xx -> {
                     List<va> $$3x = Collections.singletonList(ex.a($$2xx, "value"));
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

   private static List<va> a(CommandContext<ee> $$0, apc.c $$1) throws CommandSyntaxException {
      apb $$2 = $$1.a($$0);
      return Collections.singletonList($$2.a());
   }

   private static List<va> b(CommandContext<ee> $$0, apc.c $$1) throws CommandSyntaxException {
      apb $$2 = $$1.a($$0);
      ew.g $$3 = ew.a($$0, "sourcePath");
      return $$3.a($$2.a());
   }

   private static int a(CommandContext<ee> $$0, apc.c $$1, apc.a $$2, List<va> $$3) throws CommandSyntaxException {
      apb $$4 = $$1.a($$0);
      ew.g $$5 = ew.a($$0, "targetPath");
      ud $$6 = $$4.a();
      int $$7 = $$2.modify($$0, $$6, $$5, $$3);
      if ($$7 == 0) {
         throw d.create();
      } else {
         $$4.a($$6);
         ((ee)$$0.getSource()).a(() -> $$4.b(), true);
         return $$7;
      }
   }

   private static int a(ee $$0, apb $$1, ew.g $$2) throws CommandSyntaxException {
      ud $$3 = $$1.a();
      int $$4 = $$2.c($$3);
      if ($$4 == 0) {
         throw d.create();
      } else {
         $$1.a($$3);
         $$0.a(() -> $$1.b(), true);
         return $$4;
      }
   }

   public static va a(ew.g $$0, apb $$1) throws CommandSyntaxException {
      Collection<va> $$2 = $$0.a($$1.a());
      Iterator<va> $$3 = $$2.iterator();
      va $$4 = $$3.next();
      if ($$3.hasNext()) {
         throw g.create();
      } else {
         return $$4;
      }
   }

   private static int b(ee $$0, apb $$1, ew.g $$2) throws CommandSyntaxException {
      va $$3 = a($$2, $$1);
      int $$4;
      if ($$3 instanceof ut) {
         $$4 = ayd.a(((ut)$$3).j());
      } else if ($$3 instanceof uc) {
         $$4 = ((uc)$$3).size();
      } else if ($$3 instanceof ud) {
         $$4 = ((ud)$$3).f();
      } else {
         if (!($$3 instanceof uy)) {
            throw f.create($$2.toString());
         }

         $$4 = $$3.s_().length();
      }

      $$0.a(() -> $$1.a($$3), false);
      return $$4;
   }

   private static int a(ee $$0, apb $$1, ew.g $$2, double $$3) throws CommandSyntaxException {
      va $$4 = a($$2, $$1);
      if (!($$4 instanceof ut)) {
         throw e.create($$2.toString());
      } else {
         int $$5 = ayd.a(((ut)$$4).j() * $$3);
         $$0.a(() -> $$1.a($$2, $$3, $$5), false);
         return $$5;
      }
   }

   private static int a(ee $$0, apb $$1) throws CommandSyntaxException {
      ud $$2 = $$1.a();
      $$0.a(() -> $$1.a((va)$$2), false);
      return 1;
   }

   private static int a(ee $$0, apb $$1, ud $$2) throws CommandSyntaxException {
      ud $$3 = $$1.a();
      if (ew.g.a($$2, 0)) {
         throw ew.b.create();
      } else {
         ud $$4 = $$3.h().a($$2);
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
      int modify(CommandContext<ee> var1, ud var2, ew.g var3, List<va> var4) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      ArgumentBuilder<ee, ?> create(apc.a var1);
   }

   public interface c {
      apb a(CommandContext<ee> var1) throws CommandSyntaxException;

      ArgumentBuilder<ee, ?> a(ArgumentBuilder<ee, ?> var1, Function<ArgumentBuilder<ee, ?>, ArgumentBuilder<ee, ?>> var2);
   }

   @FunctionalInterface
   interface d {
      String process(String var1) throws CommandSyntaxException;
   }
}
