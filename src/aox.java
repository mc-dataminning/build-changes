import com.google.common.collect.Sets;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Set;

public class aox {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wp.c("commands.tag.add.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wp.c("commands.tag.remove.failed"));

   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("tag").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ey.a("targets", fk.b())
                        .then(
                           ey.a("add")
                              .then(
                                 ey.a("name", StringArgumentType.word())
                                    .executes($$0x -> a((ex)$$0x.getSource(), fk.b($$0x, "targets"), StringArgumentType.getString($$0x, "name")))
                              )
                        ))
                     .then(
                        ey.a("remove")
                           .then(
                              ey.a("name", StringArgumentType.word())
                                 .suggests(($$0x, $$1) -> fc.b(a(fk.b($$0x, "targets")), $$1))
                                 .executes($$0x -> b((ex)$$0x.getSource(), fk.b($$0x, "targets"), StringArgumentType.getString($$0x, "name")))
                           )
                     ))
                  .then(ey.a("list").executes($$0x -> a((ex)$$0x.getSource(), fk.b($$0x, "targets"))))
            )
      );
   }

   private static Collection<String> a(Collection<? extends bva> $$0) {
      Set<String> $$1 = Sets.newHashSet();

      for (bva $$2 : $$0) {
         $$1.addAll($$2.as());
      }

      return $$1;
   }

   private static int a(ex $$0, Collection<? extends bva> $$1, String $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (bva $$4 : $$1) {
         if ($$4.a($$2)) {
            $$3++;
         }
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> wp.a("commands.tag.add.success.single", $$2, $$1.iterator().next().m_()), true);
         } else {
            $$0.a(() -> wp.a("commands.tag.add.success.multiple", $$2, $$1.size()), true);
         }

         return $$3;
      }
   }

   private static int b(ex $$0, Collection<? extends bva> $$1, String $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (bva $$4 : $$1) {
         if ($$4.b($$2)) {
            $$3++;
         }
      }

      if ($$3 == 0) {
         throw b.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> wp.a("commands.tag.remove.success.single", $$2, $$1.iterator().next().m_()), true);
         } else {
            $$0.a(() -> wp.a("commands.tag.remove.success.multiple", $$2, $$1.size()), true);
         }

         return $$3;
      }
   }

   private static int a(ex $$0, Collection<? extends bva> $$1) {
      Set<String> $$2 = Sets.newHashSet();

      for (bva $$3 : $$1) {
         $$2.addAll($$3.as());
      }

      if ($$1.size() == 1) {
         bva $$4 = $$1.iterator().next();
         if ($$2.isEmpty()) {
            $$0.a(() -> wp.a("commands.tag.list.single.empty", $$4.m_()), false);
         } else {
            $$0.a(() -> wp.a("commands.tag.list.single.success", $$4.m_(), $$2.size(), ws.a($$2)), false);
         }
      } else if ($$2.isEmpty()) {
         $$0.a(() -> wp.a("commands.tag.list.multiple.empty", $$1.size()), false);
      } else {
         $$0.a(() -> wp.a("commands.tag.list.multiple.success", $$1.size(), $$2.size(), ws.a($$2)), false);
      }

      return $$2.size();
   }
}
