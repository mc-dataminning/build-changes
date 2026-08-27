import com.google.common.collect.Sets;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Set;

public class akr {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vb.c("commands.tag.add.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vb.c("commands.tag.remove.failed"));

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("tag").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("targets", ee.b())
                        .then(
                           dt.a("add")
                              .then(
                                 dt.a("name", StringArgumentType.word())
                                    .executes($$0x -> a((ds)$$0x.getSource(), ee.b($$0x, "targets"), StringArgumentType.getString($$0x, "name")))
                              )
                        ))
                     .then(
                        dt.a("remove")
                           .then(
                              dt.a("name", StringArgumentType.word())
                                 .suggests(($$0x, $$1) -> dw.b(a(ee.b($$0x, "targets")), $$1))
                                 .executes($$0x -> b((ds)$$0x.getSource(), ee.b($$0x, "targets"), StringArgumentType.getString($$0x, "name")))
                           )
                     ))
                  .then(dt.a("list").executes($$0x -> a((ds)$$0x.getSource(), ee.b($$0x, "targets"))))
            )
      );
   }

   private static Collection<String> a(Collection<? extends blf> $$0) {
      Set<String> $$1 = Sets.newHashSet();

      for (blf $$2 : $$0) {
         $$1.addAll($$2.ak());
      }

      return $$1;
   }

   private static int a(ds $$0, Collection<? extends blf> $$1, String $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (blf $$4 : $$1) {
         if ($$4.a($$2)) {
            $$3++;
         }
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> vb.a("commands.tag.add.success.single", $$2, $$1.iterator().next().Q_()), true);
         } else {
            $$0.a(() -> vb.a("commands.tag.add.success.multiple", $$2, $$1.size()), true);
         }

         return $$3;
      }
   }

   private static int b(ds $$0, Collection<? extends blf> $$1, String $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (blf $$4 : $$1) {
         if ($$4.b($$2)) {
            $$3++;
         }
      }

      if ($$3 == 0) {
         throw b.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> vb.a("commands.tag.remove.success.single", $$2, $$1.iterator().next().Q_()), true);
         } else {
            $$0.a(() -> vb.a("commands.tag.remove.success.multiple", $$2, $$1.size()), true);
         }

         return $$3;
      }
   }

   private static int a(ds $$0, Collection<? extends blf> $$1) {
      Set<String> $$2 = Sets.newHashSet();

      for (blf $$3 : $$1) {
         $$2.addAll($$3.ak());
      }

      if ($$1.size() == 1) {
         blf $$4 = $$1.iterator().next();
         if ($$2.isEmpty()) {
            $$0.a(() -> vb.a("commands.tag.list.single.empty", $$4.Q_()), false);
         } else {
            $$0.a(() -> vb.a("commands.tag.list.single.success", $$4.Q_(), $$2.size(), ve.a($$2)), false);
         }
      } else if ($$2.isEmpty()) {
         $$0.a(() -> vb.a("commands.tag.list.multiple.empty", $$1.size()), false);
      } else {
         $$0.a(() -> vb.a("commands.tag.list.multiple.success", $$1.size(), $$2.size(), ve.a($$2)), false);
      }

      return $$2.size();
   }
}
