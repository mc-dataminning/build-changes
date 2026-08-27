import com.google.common.collect.Sets;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Set;

public class aio {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tf.c("commands.tag.add.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(tf.c("commands.tag.remove.failed"));

   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("tag").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ds.a("targets", ec.b())
                        .then(
                           ds.a("add")
                              .then(
                                 ds.a("name", StringArgumentType.word())
                                    .executes($$0x -> a((dr)$$0x.getSource(), ec.b($$0x, "targets"), StringArgumentType.getString($$0x, "name")))
                              )
                        ))
                     .then(
                        ds.a("remove")
                           .then(
                              ds.a("name", StringArgumentType.word())
                                 .suggests(($$0x, $$1) -> du.b(a(ec.b($$0x, "targets")), $$1))
                                 .executes($$0x -> b((dr)$$0x.getSource(), ec.b($$0x, "targets"), StringArgumentType.getString($$0x, "name")))
                           )
                     ))
                  .then(ds.a("list").executes($$0x -> a((dr)$$0x.getSource(), ec.b($$0x, "targets"))))
            )
      );
   }

   private static Collection<String> a(Collection<? extends bii> $$0) {
      Set<String> $$1 = Sets.newHashSet();

      for (bii $$2 : $$0) {
         $$1.addAll($$2.ai());
      }

      return $$1;
   }

   private static int a(dr $$0, Collection<? extends bii> $$1, String $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (bii $$4 : $$1) {
         if ($$4.a($$2)) {
            $$3++;
         }
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> tf.a("commands.tag.add.success.single", $$2, $$1.iterator().next().H_()), true);
         } else {
            $$0.a(() -> tf.a("commands.tag.add.success.multiple", $$2, $$1.size()), true);
         }

         return $$3;
      }
   }

   private static int b(dr $$0, Collection<? extends bii> $$1, String $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (bii $$4 : $$1) {
         if ($$4.b($$2)) {
            $$3++;
         }
      }

      if ($$3 == 0) {
         throw b.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> tf.a("commands.tag.remove.success.single", $$2, $$1.iterator().next().H_()), true);
         } else {
            $$0.a(() -> tf.a("commands.tag.remove.success.multiple", $$2, $$1.size()), true);
         }

         return $$3;
      }
   }

   private static int a(dr $$0, Collection<? extends bii> $$1) {
      Set<String> $$2 = Sets.newHashSet();

      for (bii $$3 : $$1) {
         $$2.addAll($$3.ai());
      }

      if ($$1.size() == 1) {
         bii $$4 = $$1.iterator().next();
         if ($$2.isEmpty()) {
            $$0.a(() -> tf.a("commands.tag.list.single.empty", $$4.H_()), false);
         } else {
            $$0.a(() -> tf.a("commands.tag.list.single.success", $$4.H_(), $$2.size(), th.a($$2)), false);
         }
      } else if ($$2.isEmpty()) {
         $$0.a(() -> tf.a("commands.tag.list.multiple.empty", $$1.size()), false);
      } else {
         $$0.a(() -> tf.a("commands.tag.list.multiple.success", $$1.size(), $$2.size(), th.a($$2)), false);
      }

      return $$2.size();
   }
}
