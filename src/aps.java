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

public class aps {
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xd.c("commands.data.merge.failed"));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xd.b("commands.data.get.invalid", $$0));
   private static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> xd.b("commands.data.get.unknown", $$0));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(xd.c("commands.data.get.multiple"));
   private static final DynamicCommandExceptionType h = new DynamicCommandExceptionType($$0 -> xd.b("commands.data.modify.expected_object", $$0));
   private static final DynamicCommandExceptionType i = new DynamicCommandExceptionType($$0 -> xd.b("commands.data.modify.expected_value", $$0));
   private static final Dynamic2CommandExceptionType j = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xd.b("commands.data.modify.invalid_substring", $$0, $$1)
   );
   public static final List<Function<String, aps.c>> a = ImmutableList.of(apt.a, apq.a, apu.a);
   public static final List<aps.c> b = a.stream().map($$0 -> $$0.apply("target")).collect(ImmutableList.toImmutableList());
   public static final List<aps.c> c = a.stream().map($$0 -> $$0.apply("source")).collect(ImmutableList.toImmutableList());

   public static void a(CommandDispatcher<et> $$0) {
      LiteralArgumentBuilder<et> $$1 = (LiteralArgumentBuilder<et>)eu.a("data").requires($$0x -> $$0x.c(2));

      for (aps.c $$2 : b) {
         ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                     $$2.a(eu.a("merge"), $$1x -> $$1x.then(eu.a("nbt", fd.a()).executes($$1xx -> a((et)$$1xx.getSource(), $$2.a($$1xx), fd.a($$1xx, "nbt")))))
                  ))
                  .then(
                     $$2.a(
                        eu.a("get"),
                        $$1x -> $$1x.executes($$1xx -> a((et)$$1xx.getSource(), $$2.a($$1xx)))
                              .then(
                                 ((RequiredArgumentBuilder)eu.a("path", fl.a()).executes($$1xx -> b((et)$$1xx.getSource(), $$2.a($$1xx), fl.a($$1xx, "path"))))
                                    .then(
                                       eu.a("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             $$1xx -> a((et)$$1xx.getSource(), $$2.a($$1xx), fl.a($$1xx, "path"), DoubleArgumentType.getDouble($$1xx, "scale"))
                                          )
                                    )
                              )
                     )
                  ))
               .then(
                  $$2.a(eu.a("remove"), $$1x -> $$1x.then(eu.a("path", fl.a()).executes($$1xx -> a((et)$$1xx.getSource(), $$2.a($$1xx), fl.a($$1xx, "path")))))
               ))
            .then(
               a(
                  (BiConsumer<ArgumentBuilder<et, ?>, aps.b>)(($$0x, $$1x) -> $$0x.then(
                           eu.a("insert")
                              .then(
                                 eu.a("index", IntegerArgumentType.integer())
                                    .then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(IntegerArgumentType.getInteger($$0xx, "index"), $$1xx, $$3)))
                              )
                        )
                        .then(eu.a("prepend").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(0, $$1xx, $$3))))
                        .then(eu.a("append").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a(-1, $$1xx, $$3))))
                        .then(eu.a("set").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.a($$1xx, (vc)Iterables.getLast($$3)))))
                        .then(eu.a("merge").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> {
                           uf $$4 = new uf();

                           for (vc $$5 : $$3) {
                              if (fl.g.a($$5, 0)) {
                                 throw fl.b.create();
                              }

                              if (!($$5 instanceof uf $$6)) {
                                 throw h.create($$5);
                              }

                              $$4.a($$6);
                           }

                           Collection<vc> $$7 = $$2x.a($$1xx, uf::new);
                           int $$8 = 0;

                           for (vc $$9 : $$7) {
                              if (!($$9 instanceof uf $$10)) {
                                 throw h.create($$9);
                              }

                              uf $$12 = $$10.i();
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

   private static String a(vc $$0) throws CommandSyntaxException {
      if ($$0.c().d()) {
         return $$0.r_();
      } else {
         throw i.create($$0);
      }
   }

   private static List<vc> a(List<vc> $$0, aps.d $$1) throws CommandSyntaxException {
      List<vc> $$2 = new ArrayList<>($$0.size());

      for (vc $$3 : $$0) {
         String $$4 = a($$3);
         $$2.add(va.a($$1.process($$4)));
      }

      return $$2;
   }

   private static ArgumentBuilder<et, ?> a(BiConsumer<ArgumentBuilder<et, ?>, aps.b> $$0) {
      LiteralArgumentBuilder<et> $$1 = eu.a("modify");

      for (aps.c $$2 : b) {
         $$2.a(
            $$1,
            $$2x -> {
               ArgumentBuilder<et, ?> $$3 = eu.a("targetPath", fl.a());

               for (aps.c $$4 : c) {
                  $$0.accept(
                     $$3,
                     $$2xx -> $$4.a(
                           eu.a("from"),
                           $$3x -> $$3x.executes($$3xx -> a($$3xx, $$2, $$2xx, a($$3xx, $$4)))
                                 .then(eu.a("sourcePath", fl.a()).executes($$3xx -> a($$3xx, $$2, $$2xx, b($$3xx, $$4))))
                        )
                  );
                  $$0.accept(
                     $$3,
                     $$2xx -> $$4.a(
                           eu.a("string"),
                           $$3x -> $$3x.executes($$3xx -> a($$3xx, $$2, $$2xx, a(a($$3xx, $$4), $$0xxxxx -> $$0xxxxx)))
                                 .then(
                                    ((RequiredArgumentBuilder)eu.a("sourcePath", fl.a())
                                          .executes($$3xx -> a($$3xx, $$2, $$2xx, a(b($$3xx, $$4), $$0xxxxx -> $$0xxxxx))))
                                       .then(
                                          ((RequiredArgumentBuilder)eu.a("start", IntegerArgumentType.integer())
                                                .executes(
                                                   $$3xx -> a(
                                                         $$3xx,
                                                         $$2,
                                                         $$2xx,
                                                         a(b($$3xx, $$4), $$1xxxxx -> a($$1xxxxx, IntegerArgumentType.getInteger($$3xx, "start")))
                                                      )
                                                ))
                                             .then(
                                                eu.a("end", IntegerArgumentType.integer())
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

               $$0.accept($$3, $$1xx -> eu.a("value").then(eu.a("value", fm.a()).executes($$2xx -> {
                     List<vc> $$3x = Collections.singletonList(fm.a($$2xx, "value"));
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

   private static List<vc> a(CommandContext<et> $$0, aps.c $$1) throws CommandSyntaxException {
      apr $$2 = $$1.a($$0);
      return Collections.singletonList($$2.a());
   }

   private static List<vc> b(CommandContext<et> $$0, aps.c $$1) throws CommandSyntaxException {
      apr $$2 = $$1.a($$0);
      fl.g $$3 = fl.a($$0, "sourcePath");
      return $$3.a($$2.a());
   }

   private static int a(CommandContext<et> $$0, aps.c $$1, aps.a $$2, List<vc> $$3) throws CommandSyntaxException {
      apr $$4 = $$1.a($$0);
      fl.g $$5 = fl.a($$0, "targetPath");
      uf $$6 = $$4.a();
      int $$7 = $$2.modify($$0, $$6, $$5, $$3);
      if ($$7 == 0) {
         throw d.create();
      } else {
         $$4.a($$6);
         ((et)$$0.getSource()).a(() -> $$4.b(), true);
         return $$7;
      }
   }

   private static int a(et $$0, apr $$1, fl.g $$2) throws CommandSyntaxException {
      uf $$3 = $$1.a();
      int $$4 = $$2.c($$3);
      if ($$4 == 0) {
         throw d.create();
      } else {
         $$1.a($$3);
         $$0.a(() -> $$1.b(), true);
         return $$4;
      }
   }

   public static vc a(fl.g $$0, apr $$1) throws CommandSyntaxException {
      Collection<vc> $$2 = $$0.a($$1.a());
      Iterator<vc> $$3 = $$2.iterator();
      vc $$4 = $$3.next();
      if ($$3.hasNext()) {
         throw g.create();
      } else {
         return $$4;
      }
   }

   private static int b(et $$0, apr $$1, fl.g $$2) throws CommandSyntaxException {
      vc $$3 = a($$2, $$1);
      int $$4;
      if ($$3 instanceof uv) {
         $$4 = azc.a(((uv)$$3).j());
      } else if ($$3 instanceof ue) {
         $$4 = ((ue)$$3).size();
      } else if ($$3 instanceof uf) {
         $$4 = ((uf)$$3).f();
      } else {
         if (!($$3 instanceof va)) {
            throw f.create($$2.toString());
         }

         $$4 = $$3.r_().length();
      }

      $$0.a(() -> $$1.a($$3), false);
      return $$4;
   }

   private static int a(et $$0, apr $$1, fl.g $$2, double $$3) throws CommandSyntaxException {
      vc $$4 = a($$2, $$1);
      if (!($$4 instanceof uv)) {
         throw e.create($$2.toString());
      } else {
         int $$5 = azc.a(((uv)$$4).j() * $$3);
         $$0.a(() -> $$1.a($$2, $$3, $$5), false);
         return $$5;
      }
   }

   private static int a(et $$0, apr $$1) throws CommandSyntaxException {
      uf $$2 = $$1.a();
      $$0.a(() -> $$1.a((vc)$$2), false);
      return 1;
   }

   private static int a(et $$0, apr $$1, uf $$2) throws CommandSyntaxException {
      uf $$3 = $$1.a();
      if (fl.g.a($$2, 0)) {
         throw fl.b.create();
      } else {
         uf $$4 = $$3.i().a($$2);
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
      int modify(CommandContext<et> var1, uf var2, fl.g var3, List<vc> var4) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      ArgumentBuilder<et, ?> create(aps.a var1);
   }

   public interface c {
      apr a(CommandContext<et> var1) throws CommandSyntaxException;

      ArgumentBuilder<et, ?> a(ArgumentBuilder<et, ?> var1, Function<ArgumentBuilder<et, ?>, ArgumentBuilder<et, ?>> var2);
   }

   @FunctionalInterface
   interface d {
      String process(String var1) throws CommandSyntaxException;
   }
}
