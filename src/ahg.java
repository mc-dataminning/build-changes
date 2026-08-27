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

public class ahg {
   static final Dynamic3CommandExceptionType a = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> tm.a("commands.item.target.not_a_container", $$0, $$1, $$2)
   );
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> tm.a("commands.item.source.not_a_container", $$0, $$1, $$2)
   );
   static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> tm.a("commands.item.target.no_such_slot", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> tm.a("commands.item.source.no_such_slot", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> tm.a("commands.item.target.no_changes", $$0));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> tm.a("commands.item.target.no_changed.known_item", $$0, $$1)
   );
   private static final SuggestionProvider<dt> g = ($$0, $$1) -> {
      ect $$2 = ((dt)$$0.getSource()).l().aH();
      return dw.a($$2.a(ecv.b), $$1);
   };

   public static void a(CommandDispatcher<dt> $$0, dn $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("item").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)du.a("replace")
                        .then(
                           du.a("block")
                              .then(
                                 du.a("pos", fk.a())
                                    .then(
                                       ((RequiredArgumentBuilder)du.a("slot", ey.a())
                                             .then(
                                                du.a("with")
                                                   .then(
                                                      ((RequiredArgumentBuilder)du.a("item", fw.a($$1))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (dt)$$0x.getSource(),
                                                                     fk.a($$0x, "pos"),
                                                                     ey.a($$0x, "slot"),
                                                                     fw.a($$0x, "item").a(1, false)
                                                                  )
                                                            ))
                                                         .then(
                                                            du.a("count", IntegerArgumentType.integer(1, 64))
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (dt)$$0x.getSource(),
                                                                        fk.a($$0x, "pos"),
                                                                        ey.a($$0x, "slot"),
                                                                        fw.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                     )
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)du.a("from")
                                                   .then(
                                                      du.a("block")
                                                         .then(
                                                            du.a("source", fk.a())
                                                               .then(
                                                                  ((RequiredArgumentBuilder)du.a("sourceSlot", ey.a())
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (dt)$$0x.getSource(),
                                                                                 fk.a($$0x, "source"),
                                                                                 ey.a($$0x, "sourceSlot"),
                                                                                 fk.a($$0x, "pos"),
                                                                                 ey.a($$0x, "slot")
                                                                              )
                                                                        ))
                                                                     .then(
                                                                        du.a("modifier", es.a())
                                                                           .suggests(g)
                                                                           .executes(
                                                                              $$0x -> a(
                                                                                    (dt)$$0x.getSource(),
                                                                                    fk.a($$0x, "source"),
                                                                                    ey.a($$0x, "sourceSlot"),
                                                                                    fk.a($$0x, "pos"),
                                                                                    ey.a($$0x, "slot"),
                                                                                    es.d($$0x, "modifier")
                                                                                 )
                                                                           )
                                                                     )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   du.a("entity")
                                                      .then(
                                                         du.a("source", ee.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)du.a("sourceSlot", ey.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (dt)$$0x.getSource(),
                                                                              ee.a($$0x, "source"),
                                                                              ey.a($$0x, "sourceSlot"),
                                                                              fk.a($$0x, "pos"),
                                                                              ey.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     du.a("modifier", es.a())
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (dt)$$0x.getSource(),
                                                                                 ee.a($$0x, "source"),
                                                                                 ey.a($$0x, "sourceSlot"),
                                                                                 fk.a($$0x, "pos"),
                                                                                 ey.a($$0x, "slot"),
                                                                                 es.d($$0x, "modifier")
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
                        du.a("entity")
                           .then(
                              du.a("targets", ee.b())
                                 .then(
                                    ((RequiredArgumentBuilder)du.a("slot", ey.a())
                                          .then(
                                             du.a("with")
                                                .then(
                                                   ((RequiredArgumentBuilder)du.a("item", fw.a($$1))
                                                         .executes(
                                                            $$0x -> a(
                                                                  (dt)$$0x.getSource(),
                                                                  ee.b($$0x, "targets"),
                                                                  ey.a($$0x, "slot"),
                                                                  fw.a($$0x, "item").a(1, false)
                                                               )
                                                         ))
                                                      .then(
                                                         du.a("count", IntegerArgumentType.integer(1, 64))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (dt)$$0x.getSource(),
                                                                     ee.b($$0x, "targets"),
                                                                     ey.a($$0x, "slot"),
                                                                     fw.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                  )
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)du.a("from")
                                                .then(
                                                   du.a("block")
                                                      .then(
                                                         du.a("source", fk.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)du.a("sourceSlot", ey.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (dt)$$0x.getSource(),
                                                                              fk.a($$0x, "source"),
                                                                              ey.a($$0x, "sourceSlot"),
                                                                              ee.b($$0x, "targets"),
                                                                              ey.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     du.a("modifier", es.a())
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (dt)$$0x.getSource(),
                                                                                 fk.a($$0x, "source"),
                                                                                 ey.a($$0x, "sourceSlot"),
                                                                                 ee.b($$0x, "targets"),
                                                                                 ey.a($$0x, "slot"),
                                                                                 es.d($$0x, "modifier")
                                                                              )
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                du.a("entity")
                                                   .then(
                                                      du.a("source", ee.a())
                                                         .then(
                                                            ((RequiredArgumentBuilder)du.a("sourceSlot", ey.a())
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (dt)$$0x.getSource(),
                                                                           ee.a($$0x, "source"),
                                                                           ey.a($$0x, "sourceSlot"),
                                                                           ee.b($$0x, "targets"),
                                                                           ey.a($$0x, "slot")
                                                                        )
                                                                  ))
                                                               .then(
                                                                  du.a("modifier", es.a())
                                                                     .suggests(g)
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (dt)$$0x.getSource(),
                                                                              ee.a($$0x, "source"),
                                                                              ey.a($$0x, "sourceSlot"),
                                                                              ee.b($$0x, "targets"),
                                                                              ey.a($$0x, "slot"),
                                                                              es.d($$0x, "modifier")
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
               ((LiteralArgumentBuilder)du.a("modify")
                     .then(
                        du.a("block")
                           .then(
                              du.a("pos", fk.a())
                                 .then(
                                    du.a("slot", ey.a())
                                       .then(
                                          du.a("modifier", es.a())
                                             .suggests(g)
                                             .executes($$0x -> a((dt)$$0x.getSource(), fk.a($$0x, "pos"), ey.a($$0x, "slot"), es.d($$0x, "modifier")))
                                       )
                                 )
                           )
                     ))
                  .then(
                     du.a("entity")
                        .then(
                           du.a("targets", ee.b())
                              .then(
                                 du.a("slot", ey.a())
                                    .then(
                                       du.a("modifier", es.a())
                                          .suggests(g)
                                          .executes($$0x -> a((dt)$$0x.getSource(), ee.b($$0x, "targets"), ey.a($$0x, "slot"), es.d($$0x, "modifier")))
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(dt $$0, gw $$1, int $$2, eed $$3) throws CommandSyntaxException {
      bgr $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         cjf $$5 = a($$0, $$3, $$4.a($$2));
         $$4.a($$2, $$5);
         $$0.a(() -> tm.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$5.J()), true);
         return 1;
      } else {
         throw b.create($$2);
      }
   }

   private static int a(dt $$0, Collection<? extends biq> $$1, int $$2, eed $$3) throws CommandSyntaxException {
      Map<biq, cjf> $$4 = Maps.newHashMapWithExpectedSize($$1.size());

      for (biq $$5 : $$1) {
         bjy $$6 = $$5.a_($$2);
         if ($$6 != bjy.b) {
            cjf $$7 = a($$0, $$3, $$6.a().p());
            if ($$6.a($$7)) {
               $$4.put($$5, $$7);
               if ($$5 instanceof aks) {
                  ((aks)$$5).bS.d();
               }
            }
         }
      }

      if ($$4.isEmpty()) {
         throw e.create($$2);
      } else {
         if ($$4.size() == 1) {
            Entry<biq, cjf> $$8 = $$4.entrySet().iterator().next();
            $$0.a(() -> tm.a("commands.item.entity.set.success.single", $$8.getKey().N_(), $$8.getValue().J()), true);
         } else {
            $$0.a(() -> tm.a("commands.item.entity.set.success.multiple", $$4.size()), true);
         }

         return $$4.size();
      }
   }

   private static int a(dt $$0, gw $$1, int $$2, cjf $$3) throws CommandSyntaxException {
      bgr $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         $$4.a($$2, $$3);
         $$0.a(() -> tm.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$3.J()), true);
         return 1;
      } else {
         throw b.create($$2);
      }
   }

   private static bgr a(dt $$0, gw $$1, Dynamic3CommandExceptionType $$2) throws CommandSyntaxException {
      dcv $$3 = $$0.e().c_($$1);
      if (!($$3 instanceof bgr)) {
         throw $$2.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bgr)$$3;
      }
   }

   private static int a(dt $$0, Collection<? extends biq> $$1, int $$2, cjf $$3) throws CommandSyntaxException {
      List<biq> $$4 = Lists.newArrayListWithCapacity($$1.size());

      for (biq $$5 : $$1) {
         bjy $$6 = $$5.a_($$2);
         if ($$6 != bjy.b && $$6.a($$3.p())) {
            $$4.add($$5);
            if ($$5 instanceof aks) {
               ((aks)$$5).bS.d();
            }
         }
      }

      if ($$4.isEmpty()) {
         throw f.create($$3.J(), $$2);
      } else {
         if ($$4.size() == 1) {
            $$0.a(() -> tm.a("commands.item.entity.set.success.single", $$4.iterator().next().N_(), $$3.J()), true);
         } else {
            $$0.a(() -> tm.a("commands.item.entity.set.success.multiple", $$4.size(), $$3.J()), true);
         }

         return $$4.size();
      }
   }

   private static int a(dt $$0, gw $$1, int $$2, Collection<? extends biq> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(dt $$0, gw $$1, int $$2, Collection<? extends biq> $$3, int $$4, eed $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(dt $$0, gw $$1, int $$2, gw $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(dt $$0, gw $$1, int $$2, gw $$3, int $$4, eed $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(dt $$0, biq $$1, int $$2, gw $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(dt $$0, biq $$1, int $$2, gw $$3, int $$4, eed $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static int a(dt $$0, biq $$1, int $$2, Collection<? extends biq> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(dt $$0, biq $$1, int $$2, Collection<? extends biq> $$3, int $$4, eed $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static cjf a(dt $$0, eed $$1, cjf $$2) {
      akr $$3 = $$0.e();
      ecw $$4 = new ecw.a($$3).a(efb.f, $$0.d()).b(efb.a, $$0.f()).a(efa.d);
      ecq $$5 = new ecq.a($$4).a(Optional.empty());
      $$5.b(ecq.a($$1));
      return $$1.apply($$2, $$5);
   }

   private static cjf a(biq $$0, int $$1) throws CommandSyntaxException {
      bjy $$2 = $$0.a_($$1);
      if ($$2 == bjy.b) {
         throw d.create($$1);
      } else {
         return $$2.a().p();
      }
   }

   private static cjf a(dt $$0, gw $$1, int $$2) throws CommandSyntaxException {
      bgr $$3 = a($$0, $$1, c);
      if ($$2 >= 0 && $$2 < $$3.b()) {
         return $$3.a($$2).p();
      } else {
         throw d.create($$2);
      }
   }
}
