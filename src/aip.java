import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;

public class aip {
   static final Dynamic3CommandExceptionType a = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> ur.b("commands.item.target.not_a_container", $$0, $$1, $$2)
   );
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> ur.b("commands.item.source.not_a_container", $$0, $$1, $$2)
   );
   static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> ur.b("commands.item.target.no_such_slot", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> ur.b("commands.item.source.no_such_slot", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> ur.b("commands.item.target.no_changes", $$0));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> ur.b("commands.item.target.no_changed.known_item", $$0, $$1)
   );
   private static final SuggestionProvider<du> g = ($$0, $$1) -> {
      eeo $$2 = ((du)$$0.getSource()).m().aH();
      return dy.a($$2.a(eeq.b), $$1);
   };

   public static void a(CommandDispatcher<du> $$0, dp $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("item").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)dv.a("replace")
                        .then(
                           dv.a("block")
                              .then(
                                 dv.a("pos", fm.a())
                                    .then(
                                       ((RequiredArgumentBuilder)dv.a("slot", fa.a())
                                             .then(
                                                dv.a("with")
                                                   .then(
                                                      ((RequiredArgumentBuilder)dv.a("item", fy.a($$1))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (du)$$0x.getSource(),
                                                                     fm.a($$0x, "pos"),
                                                                     fa.a($$0x, "slot"),
                                                                     fy.a($$0x, "item").a(1, false)
                                                                  )
                                                            ))
                                                         .then(
                                                            dv.a("count", IntegerArgumentType.integer(1, 64))
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (du)$$0x.getSource(),
                                                                        fm.a($$0x, "pos"),
                                                                        fa.a($$0x, "slot"),
                                                                        fy.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                     )
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)dv.a("from")
                                                   .then(
                                                      dv.a("block")
                                                         .then(
                                                            dv.a("source", fm.a())
                                                               .then(
                                                                  ((RequiredArgumentBuilder)dv.a("sourceSlot", fa.a())
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (du)$$0x.getSource(),
                                                                                 fm.a($$0x, "source"),
                                                                                 fa.a($$0x, "sourceSlot"),
                                                                                 fm.a($$0x, "pos"),
                                                                                 fa.a($$0x, "slot")
                                                                              )
                                                                        ))
                                                                     .then(
                                                                        dv.a("modifier", eu.a())
                                                                           .suggests(g)
                                                                           .executes(
                                                                              $$0x -> a(
                                                                                    (du)$$0x.getSource(),
                                                                                    fm.a($$0x, "source"),
                                                                                    fa.a($$0x, "sourceSlot"),
                                                                                    fm.a($$0x, "pos"),
                                                                                    fa.a($$0x, "slot"),
                                                                                    eu.d($$0x, "modifier")
                                                                                 )
                                                                           )
                                                                     )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   dv.a("entity")
                                                      .then(
                                                         dv.a("source", eg.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)dv.a("sourceSlot", fa.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (du)$$0x.getSource(),
                                                                              eg.a($$0x, "source"),
                                                                              fa.a($$0x, "sourceSlot"),
                                                                              fm.a($$0x, "pos"),
                                                                              fa.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     dv.a("modifier", eu.a())
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (du)$$0x.getSource(),
                                                                                 eg.a($$0x, "source"),
                                                                                 fa.a($$0x, "sourceSlot"),
                                                                                 fm.a($$0x, "pos"),
                                                                                 fa.a($$0x, "slot"),
                                                                                 eu.d($$0x, "modifier")
                                                                              )
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              )
                        ))
                     .then(
                        dv.a("entity")
                           .then(
                              dv.a("targets", eg.b())
                                 .then(
                                    ((RequiredArgumentBuilder)dv.a("slot", fa.a())
                                          .then(
                                             dv.a("with")
                                                .then(
                                                   ((RequiredArgumentBuilder)dv.a("item", fy.a($$1))
                                                         .executes(
                                                            $$0x -> a(
                                                                  (du)$$0x.getSource(),
                                                                  eg.b($$0x, "targets"),
                                                                  fa.a($$0x, "slot"),
                                                                  fy.a($$0x, "item").a(1, false)
                                                               )
                                                         ))
                                                      .then(
                                                         dv.a("count", IntegerArgumentType.integer(1, 64))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (du)$$0x.getSource(),
                                                                     eg.b($$0x, "targets"),
                                                                     fa.a($$0x, "slot"),
                                                                     fy.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                  )
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)dv.a("from")
                                                .then(
                                                   dv.a("block")
                                                      .then(
                                                         dv.a("source", fm.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)dv.a("sourceSlot", fa.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (du)$$0x.getSource(),
                                                                              fm.a($$0x, "source"),
                                                                              fa.a($$0x, "sourceSlot"),
                                                                              eg.b($$0x, "targets"),
                                                                              fa.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     dv.a("modifier", eu.a())
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (du)$$0x.getSource(),
                                                                                 fm.a($$0x, "source"),
                                                                                 fa.a($$0x, "sourceSlot"),
                                                                                 eg.b($$0x, "targets"),
                                                                                 fa.a($$0x, "slot"),
                                                                                 eu.d($$0x, "modifier")
                                                                              )
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                dv.a("entity")
                                                   .then(
                                                      dv.a("source", eg.a())
                                                         .then(
                                                            ((RequiredArgumentBuilder)dv.a("sourceSlot", fa.a())
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (du)$$0x.getSource(),
                                                                           eg.a($$0x, "source"),
                                                                           fa.a($$0x, "sourceSlot"),
                                                                           eg.b($$0x, "targets"),
                                                                           fa.a($$0x, "slot")
                                                                        )
                                                                  ))
                                                               .then(
                                                                  dv.a("modifier", eu.a())
                                                                     .suggests(g)
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (du)$$0x.getSource(),
                                                                              eg.a($$0x, "source"),
                                                                              fa.a($$0x, "sourceSlot"),
                                                                              eg.b($$0x, "targets"),
                                                                              fa.a($$0x, "slot"),
                                                                              eu.d($$0x, "modifier")
                                                                           )
                                                                     )
                                                               )
                                                         )
                                                   )
                                             )
                                       )
                                 )
                           )
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)dv.a("modify")
                     .then(
                        dv.a("block")
                           .then(
                              dv.a("pos", fm.a())
                                 .then(
                                    dv.a("slot", fa.a())
                                       .then(
                                          dv.a("modifier", eu.a())
                                             .suggests(g)
                                             .executes($$0x -> a((du)$$0x.getSource(), fm.a($$0x, "pos"), fa.a($$0x, "slot"), eu.d($$0x, "modifier")))
                                       )
                                 )
                           )
                     ))
                  .then(
                     dv.a("entity")
                        .then(
                           dv.a("targets", eg.b())
                              .then(
                                 dv.a("slot", fa.a())
                                    .then(
                                       dv.a("modifier", eu.a())
                                          .suggests(g)
                                          .executes($$0x -> a((du)$$0x.getSource(), eg.b($$0x, "targets"), fa.a($$0x, "slot"), eu.d($$0x, "modifier")))
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(du $$0, ht $$1, int $$2, efy $$3) throws CommandSyntaxException {
      bij $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         clb $$5 = a($$0, $$3, $$4.a($$2));
         $$4.a($$2, $$5);
         $$0.a(() -> ur.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$5.J()), true);
         return 1;
      } else {
         throw b.create($$2);
      }
   }

   private static int a(du $$0, Collection<? extends bki> $$1, int $$2, efy $$3) throws CommandSyntaxException {
      Map<bki, clb> $$4 = Maps.newHashMapWithExpectedSize($$1.size());

      for (bki $$5 : $$1) {
         blq $$6 = $$5.a_($$2);
         if ($$6 != blq.b) {
            clb $$7 = a($$0, $$3, $$6.a().p());
            if ($$6.a($$7)) {
               $$4.put($$5, $$7);
               if ($$5 instanceof amb) {
                  ((amb)$$5).bS.d();
               }
            }
         }
      }

      if ($$4.isEmpty()) {
         throw e.create($$2);
      } else {
         if ($$4.size() == 1) {
            Entry<bki, clb> $$8 = $$4.entrySet().iterator().next();
            $$0.a(() -> ur.a("commands.item.entity.set.success.single", $$8.getKey().O_(), $$8.getValue().J()), true);
         } else {
            $$0.a(() -> ur.a("commands.item.entity.set.success.multiple", $$4.size()), true);
         }

         return $$4.size();
      }
   }

   private static int a(du $$0, ht $$1, int $$2, clb $$3) throws CommandSyntaxException {
      bij $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         $$4.a($$2, $$3);
         $$0.a(() -> ur.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$3.J()), true);
         return 1;
      } else {
         throw b.create($$2);
      }
   }

   private static bij a(du $$0, ht $$1, Dynamic3CommandExceptionType $$2) throws CommandSyntaxException {
      der $$3 = $$0.f().c_($$1);
      if (!($$3 instanceof bij)) {
         throw $$2.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bij)$$3;
      }
   }

   private static int a(du $$0, Collection<? extends bki> $$1, int $$2, clb $$3) throws CommandSyntaxException {
      List<bki> $$4 = Lists.newArrayListWithCapacity($$1.size());

      for (bki $$5 : $$1) {
         blq $$6 = $$5.a_($$2);
         if ($$6 != blq.b && $$6.a($$3.p())) {
            $$4.add($$5);
            if ($$5 instanceof amb) {
               ((amb)$$5).bS.d();
            }
         }
      }

      if ($$4.isEmpty()) {
         throw f.create($$3.J(), $$2);
      } else {
         if ($$4.size() == 1) {
            $$0.a(() -> ur.a("commands.item.entity.set.success.single", $$4.iterator().next().O_(), $$3.J()), true);
         } else {
            $$0.a(() -> ur.a("commands.item.entity.set.success.multiple", $$4.size(), $$3.J()), true);
         }

         return $$4.size();
      }
   }

   private static int a(du $$0, ht $$1, int $$2, Collection<? extends bki> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(du $$0, ht $$1, int $$2, Collection<? extends bki> $$3, int $$4, efy $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(du $$0, ht $$1, int $$2, ht $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(du $$0, ht $$1, int $$2, ht $$3, int $$4, efy $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(du $$0, bki $$1, int $$2, ht $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(du $$0, bki $$1, int $$2, ht $$3, int $$4, efy $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static int a(du $$0, bki $$1, int $$2, Collection<? extends bki> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(du $$0, bki $$1, int $$2, Collection<? extends bki> $$3, int $$4, efy $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static clb a(du $$0, efy $$1, clb $$2) {
      ama $$3 = $$0.f();
      eer $$4 = new eer.a($$3).a(egw.f, $$0.e()).b(egw.a, $$0.g()).a(egv.d);
      eel $$5 = new eel.a($$4).a(Optional.empty());
      $$5.b(eel.a($$1));
      return $$1.apply($$2, $$5);
   }

   private static clb a(bki $$0, int $$1) throws CommandSyntaxException {
      blq $$2 = $$0.a_($$1);
      if ($$2 == blq.b) {
         throw d.create($$1);
      } else {
         return $$2.a().p();
      }
   }

   private static clb a(du $$0, ht $$1, int $$2) throws CommandSyntaxException {
      bij $$3 = a($$0, $$1, c);
      if ($$2 >= 0 && $$2 < $$3.b()) {
         return $$3.a($$2).p();
      } else {
         throw d.create($$2);
      }
   }
}
