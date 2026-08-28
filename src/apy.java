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

public class apy {
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xh.c("commands.data.merge.failed"));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xh.b("commands.data.get.invalid", $$0));
   private static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> xh.b("commands.data.get.unknown", $$0));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(xh.c("commands.data.get.multiple"));
   private static final DynamicCommandExceptionType h = new DynamicCommandExceptionType($$0 -> xh.b("commands.data.modify.expected_object", $$0));
   private static final DynamicCommandExceptionType i = new DynamicCommandExceptionType($$0 -> xh.b("commands.data.modify.expected_value", $$0));
   private static final Dynamic2CommandExceptionType j = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xh.b("commands.data.modify.invalid_substring", $$0, $$1)
   );
   public static final List<Function<String, apy.c>> a = ImmutableList.of(apz.a, apw.a, aqa.a);
   public static final List<apy.c> b = a.stream().map($$0 -> $$0.apply("target")).collect(ImmutableList.toImmutableList());
   public static final List<apy.c> c = a.stream().map($$0 -> $$0.apply("source")).collect(ImmutableList.toImmutableList());

   public static void a(CommandDispatcher<ev> $$0) {
      LiteralArgumentBuilder<ev> $$1 = (LiteralArgumentBuilder<ev>)ew.a("data").requires($$0x -> $$0x.c(2));

      for (apy.c $$2 : b) {
         ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                     $$2.a(ew.a("merge"), $$1x -> $$1x.then(ew.a("nbt", ff.a()).executes($$1xx -> a((ev)$$1xx.getSource(), $$2.a($$1xx), ff.a($$1xx, "nbt")))))
                  ))
                  .then(
                     $$2.a(
                        ew.a("get"),
                        $$1x -> $$1x.executes($$1xx -> a((ev)$$1xx.getSource(), $$2.a($$1xx)))
                              .then(
                                 ((RequiredArgumentBuilder)ew.a("path", fn.a()).executes($$1xx -> b((ev)$$1xx.getSource(), $$2.a($$1xx), fn.a($$1xx, "path"))))
                                    .then(
                                       ew.a("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             $$1xx -> a((ev)$$1xx.getSource(), $$2.a($$1xx), fn.a($$1xx, "path"), DoubleArgumentType.getDouble($$1xx, "scale"))
                                          )
                                    )
                              )
                     )
                  ))
               .then(
                  $$2.a(ew.a("remove"), $$1x -> $$1x.then(ew.a("path", fn.a()).executes($$1xx -> a((ev)$$1xx.getSource(), $$2.a($$1xx), fn.a($$1xx, "path")))))
               ))
            .then(
               a(
                  (BiConsumer<ArgumentBuilder<ev, ?>, apy.b>)(($$0x, $$1x) -> $$0x.then(
                           ew.a("insert")
                              .then(
                                 ew.a("index", IntegerArgumentType.integer())
                                    .then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(IntegerArgumentType.getInteger($$0xx, "index"), $$1xx, $$3)))
                              )
                        )
                        .then(ew.a("prepend").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(0, $$1xx, $$3))))
                        .then(ew.a("append").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(-1, $$1xx, $$3))))
                        .then(ew.a("set").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a($$1xx, (vg)Iterables.getLast($$3)))))
                        .then(ew.a("merge").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> {
                           uj $$4 = new uj();

                           for (vg $$5 : $$3) {
                              if (fn.g.a($$5, 0)) {
                                 throw fn.b.create();
                              }

                              if (!($$5 instanceof uj $$6)) {
                                 throw h.create($$5);
                              }

                              $$4.a($$6);
                           }

                           Collection<vg> $$7 = $$2x.a($$1xx, uj::new);
                           int $$8 = 0;

                           for (vg $$9 : $$7) {
                              if (!($$9 instanceof uj $$10)) {
                                 throw h.create($$9);
                              }

                              uj $$12 = $$10.i();
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

   private static String a(vg $$0) throws CommandSyntaxException {
      if ($$0.c().d()) {
         return $$0.s_();
      } else {
         throw i.create($$0);
      }
   }

   private static List<vg> a(List<vg> $$0, apy.d $$1) throws CommandSyntaxException {
      List<vg> $$2 = new ArrayList<>($$0.size());

      for (vg $$3 : $$0) {
         String $$4 = a($$3);
         $$2.add(ve.a($$1.process($$4)));
      }

      return $$2;
   }

   private static ArgumentBuilder<ev, ?> a(BiConsumer<ArgumentBuilder<ev, ?>, apy.b> $$0) {
      LiteralArgumentBuilder<ev> $$1 = ew.a("modify");

      for (apy.c $$2 : b) {
         $$2.a(
            $$1,
            $$2x -> {
               ArgumentBuilder<ev, ?> $$3 = ew.a("targetPath", fn.a());

               for (apy.c $$4 : c) {
                  $$0.accept(
                     $$3,
                     $$2xx -> $$4.a(
                           ew.a("from"),
                           $$3x -> $$3x.executes($$3xx -> a($$3xx, $$2, $$2xx, a($$3xx, $$4)))
                                 .then(ew.a("sourcePath", fn.a()).executes($$3xx -> a($$3xx, $$2, $$2xx, b($$3xx, $$4))))
                        )
                  );
                  $$0.accept(
                     $$3,
                     $$2xx -> $$4.a(
                           ew.a("string"),
                           $$3x -> $$3x.executes($$3xx -> a($$3xx, $$2, $$2xx, a(a($$3xx, $$4), $$0xxxxx -> $$0xxxxx)))
                                 .then(
                                    ((RequiredArgumentBuilder)ew.a("sourcePath", fn.a())
                                          .executes($$3xx -> a($$3xx, $$2, $$2xx, a(b($$3xx, $$4), $$0xxxxx -> $$0xxxxx))))
                                       .then(
                                          ((RequiredArgumentBuilder)ew.a("start", IntegerArgumentType.integer())
                                                .executes(
                                                   $$3xx -> a(
                                                         $$3xx,
                                                         $$2,
                                                         $$2xx,
                                                         a(b($$3xx, $$4), $$1xxxxx -> a($$1xxxxx, IntegerArgumentType.getInteger($$3xx, "start")))
                                                      )
                                                ))
                                             .then(
                                                ew.a("end", IntegerArgumentType.integer())
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

               $$0.accept($$3, $$1xx -> ew.a("value").then(ew.a("value", fo.a()).executes($$2xx -> {
                     List<vg> $$3x = Collections.singletonList(fo.a($$2xx, "value"));
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

   private static List<vg> a(CommandContext<ev> $$0, apy.c $$1) throws CommandSyntaxException {
      apx $$2 = $$1.a($$0);
      return Collections.singletonList($$2.a());
   }

   private static List<vg> b(CommandContext<ev> $$0, apy.c $$1) throws CommandSyntaxException {
      apx $$2 = $$1.a($$0);
      fn.g $$3 = fn.a($$0, "sourcePath");
      return $$3.a($$2.a());
   }

   private static int a(CommandContext<ev> $$0, apy.c $$1, apy.a $$2, List<vg> $$3) throws CommandSyntaxException {
      apx $$4 = $$1.a($$0);
      fn.g $$5 = fn.a($$0, "targetPath");
      uj $$6 = $$4.a();
      int $$7 = $$2.modify($$0, $$6, $$5, $$3);
      if ($$7 == 0) {
         throw d.create();
      } else {
         $$4.a($$6);
         ((ev)$$0.getSource()).a(() -> $$4.b(), true);
         return $$7;
      }
   }

   private static int a(ev $$0, apx $$1, fn.g $$2) throws CommandSyntaxException {
      uj $$3 = $$1.a();
      int $$4 = $$2.c($$3);
      if ($$4 == 0) {
         throw d.create();
      } else {
         $$1.a($$3);
         $$0.a(() -> $$1.b(), true);
         return $$4;
      }
   }

   public static vg a(fn.g $$0, apx $$1) throws CommandSyntaxException {
      Collection<vg> $$2 = $$0.a($$1.a());
      Iterator<vg> $$3 = $$2.iterator();
      vg $$4 = $$3.next();
      if ($$3.hasNext()) {
         throw g.create();
      } else {
         return $$4;
      }
   }

   private static int b(ev $$0, apx $$1, fn.g $$2) throws CommandSyntaxException {
      vg $$3 = a($$2, $$1);
      int $$4;
      if ($$3 instanceof uz) {
         $$4 = azj.a(((uz)$$3).j());
      } else if ($$3 instanceof ui) {
         $$4 = ((ui)$$3).size();
      } else if ($$3 instanceof uj) {
         $$4 = ((uj)$$3).f();
      } else {
         if (!($$3 instanceof ve)) {
            throw f.create($$2.toString());
         }

         $$4 = $$3.s_().length();
      }

      $$0.a(() -> $$1.a($$3), false);
      return $$4;
   }

   private static int a(ev $$0, apx $$1, fn.g $$2, double $$3) throws CommandSyntaxException {
      vg $$4 = a($$2, $$1);
      if (!($$4 instanceof uz)) {
         throw e.create($$2.toString());
      } else {
         int $$5 = azj.a(((uz)$$4).j() * $$3);
         $$0.a(() -> $$1.a($$2, $$3, $$5), false);
         return $$5;
      }
   }

   private static int a(ev $$0, apx $$1) throws CommandSyntaxException {
      uj $$2 = $$1.a();
      $$0.a(() -> $$1.a((vg)$$2), false);
      return 1;
   }

   private static int a(ev $$0, apx $$1, uj $$2) throws CommandSyntaxException {
      uj $$3 = $$1.a();
      if (fn.g.a($$2, 0)) {
         throw fn.b.create();
      } else {
         uj $$4 = $$3.i().a($$2);
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
      int modify(CommandContext<ev> var1, uj var2, fn.g var3, List<vg> var4) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      ArgumentBuilder<ev, ?> create(apy.a var1);
   }

   public interface c {
      apx a(CommandContext<ev> var1) throws CommandSyntaxException;

      ArgumentBuilder<ev, ?> a(ArgumentBuilder<ev, ?> var1, Function<ArgumentBuilder<ev, ?>, ArgumentBuilder<ev, ?>> var2);
   }

   @FunctionalInterface
   interface d {
      String process(String var1) throws CommandSyntaxException;
   }
}
