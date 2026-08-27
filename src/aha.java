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

public class aha {
   static final Dynamic3CommandExceptionType a = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> tf.a("commands.item.target.not_a_container", $$0, $$1, $$2)
   );
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> tf.a("commands.item.source.not_a_container", $$0, $$1, $$2)
   );
   static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> tf.a("commands.item.target.no_such_slot", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> tf.a("commands.item.source.no_such_slot", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> tf.a("commands.item.target.no_changes", $$0));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> tf.a("commands.item.target.no_changed.known_item", $$0, $$1)
   );
   private static final SuggestionProvider<dr> g = ($$0, $$1) -> {
      ecj $$2 = ((dr)$$0.getSource()).l().aH();
      return du.a($$2.a(ecl.b), $$1);
   };

   public static void a(CommandDispatcher<dr> $$0, dl $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("item").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)ds.a("replace")
                        .then(
                           ds.a("block")
                              .then(
                                 ds.a("pos", fi.a())
                                    .then(
                                       ((RequiredArgumentBuilder)ds.a("slot", ew.a())
                                             .then(
                                                ds.a("with")
                                                   .then(
                                                      ((RequiredArgumentBuilder)ds.a("item", fu.a($$1))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (dr)$$0x.getSource(),
                                                                     fi.a($$0x, "pos"),
                                                                     ew.a($$0x, "slot"),
                                                                     fu.a($$0x, "item").a(1, false)
                                                                  )
                                                            ))
                                                         .then(
                                                            ds.a("count", IntegerArgumentType.integer(1, 64))
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (dr)$$0x.getSource(),
                                                                        fi.a($$0x, "pos"),
                                                                        ew.a($$0x, "slot"),
                                                                        fu.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                     )
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)ds.a("from")
                                                   .then(
                                                      ds.a("block")
                                                         .then(
                                                            ds.a("source", fi.a())
                                                               .then(
                                                                  ((RequiredArgumentBuilder)ds.a("sourceSlot", ew.a())
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (dr)$$0x.getSource(),
                                                                                 fi.a($$0x, "source"),
                                                                                 ew.a($$0x, "sourceSlot"),
                                                                                 fi.a($$0x, "pos"),
                                                                                 ew.a($$0x, "slot")
                                                                              )
                                                                        ))
                                                                     .then(
                                                                        ds.a("modifier", eq.a())
                                                                           .suggests(g)
                                                                           .executes(
                                                                              $$0x -> a(
                                                                                    (dr)$$0x.getSource(),
                                                                                    fi.a($$0x, "source"),
                                                                                    ew.a($$0x, "sourceSlot"),
                                                                                    fi.a($$0x, "pos"),
                                                                                    ew.a($$0x, "slot"),
                                                                                    eq.d($$0x, "modifier")
                                                                                 )
                                                                           )
                                                                     )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   ds.a("entity")
                                                      .then(
                                                         ds.a("source", ec.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)ds.a("sourceSlot", ew.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (dr)$$0x.getSource(),
                                                                              ec.a($$0x, "source"),
                                                                              ew.a($$0x, "sourceSlot"),
                                                                              fi.a($$0x, "pos"),
                                                                              ew.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     ds.a("modifier", eq.a())
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (dr)$$0x.getSource(),
                                                                                 ec.a($$0x, "source"),
                                                                                 ew.a($$0x, "sourceSlot"),
                                                                                 fi.a($$0x, "pos"),
                                                                                 ew.a($$0x, "slot"),
                                                                                 eq.d($$0x, "modifier")
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
                        ds.a("entity")
                           .then(
                              ds.a("targets", ec.b())
                                 .then(
                                    ((RequiredArgumentBuilder)ds.a("slot", ew.a())
                                          .then(
                                             ds.a("with")
                                                .then(
                                                   ((RequiredArgumentBuilder)ds.a("item", fu.a($$1))
                                                         .executes(
                                                            $$0x -> a(
                                                                  (dr)$$0x.getSource(),
                                                                  ec.b($$0x, "targets"),
                                                                  ew.a($$0x, "slot"),
                                                                  fu.a($$0x, "item").a(1, false)
                                                               )
                                                         ))
                                                      .then(
                                                         ds.a("count", IntegerArgumentType.integer(1, 64))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (dr)$$0x.getSource(),
                                                                     ec.b($$0x, "targets"),
                                                                     ew.a($$0x, "slot"),
                                                                     fu.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                  )
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)ds.a("from")
                                                .then(
                                                   ds.a("block")
                                                      .then(
                                                         ds.a("source", fi.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)ds.a("sourceSlot", ew.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (dr)$$0x.getSource(),
                                                                              fi.a($$0x, "source"),
                                                                              ew.a($$0x, "sourceSlot"),
                                                                              ec.b($$0x, "targets"),
                                                                              ew.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     ds.a("modifier", eq.a())
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (dr)$$0x.getSource(),
                                                                                 fi.a($$0x, "source"),
                                                                                 ew.a($$0x, "sourceSlot"),
                                                                                 ec.b($$0x, "targets"),
                                                                                 ew.a($$0x, "slot"),
                                                                                 eq.d($$0x, "modifier")
                                                                              )
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                ds.a("entity")
                                                   .then(
                                                      ds.a("source", ec.a())
                                                         .then(
                                                            ((RequiredArgumentBuilder)ds.a("sourceSlot", ew.a())
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (dr)$$0x.getSource(),
                                                                           ec.a($$0x, "source"),
                                                                           ew.a($$0x, "sourceSlot"),
                                                                           ec.b($$0x, "targets"),
                                                                           ew.a($$0x, "slot")
                                                                        )
                                                                  ))
                                                               .then(
                                                                  ds.a("modifier", eq.a())
                                                                     .suggests(g)
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (dr)$$0x.getSource(),
                                                                              ec.a($$0x, "source"),
                                                                              ew.a($$0x, "sourceSlot"),
                                                                              ec.b($$0x, "targets"),
                                                                              ew.a($$0x, "slot"),
                                                                              eq.d($$0x, "modifier")
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
               ((LiteralArgumentBuilder)ds.a("modify")
                     .then(
                        ds.a("block")
                           .then(
                              ds.a("pos", fi.a())
                                 .then(
                                    ds.a("slot", ew.a())
                                       .then(
                                          ds.a("modifier", eq.a())
                                             .suggests(g)
                                             .executes($$0x -> a((dr)$$0x.getSource(), fi.a($$0x, "pos"), ew.a($$0x, "slot"), eq.d($$0x, "modifier")))
                                       )
                                 )
                           )
                     ))
                  .then(
                     ds.a("entity")
                        .then(
                           ds.a("targets", ec.b())
                              .then(
                                 ds.a("slot", ew.a())
                                    .then(
                                       ds.a("modifier", eq.a())
                                          .suggests(g)
                                          .executes($$0x -> a((dr)$$0x.getSource(), ec.b($$0x, "targets"), ew.a($$0x, "slot"), eq.d($$0x, "modifier")))
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(dr $$0, gu $$1, int $$2, edt $$3) throws CommandSyntaxException {
      bgj $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         cix $$5 = a($$0, $$3, $$4.a($$2));
         $$4.a($$2, $$5);
         $$0.a(() -> tf.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$5.J()), true);
         return 1;
      } else {
         throw b.create($$2);
      }
   }

   private static int a(dr $$0, Collection<? extends bii> $$1, int $$2, edt $$3) throws CommandSyntaxException {
      Map<bii, cix> $$4 = Maps.newHashMapWithExpectedSize($$1.size());

      for (bii $$5 : $$1) {
         bjq $$6 = $$5.a_($$2);
         if ($$6 != bjq.b) {
            cix $$7 = a($$0, $$3, $$6.a().p());
            if ($$6.a($$7)) {
               $$4.put($$5, $$7);
               if ($$5 instanceof akl) {
                  ((akl)$$5).bQ.d();
               }
            }
         }
      }

      if ($$4.isEmpty()) {
         throw e.create($$2);
      } else {
         if ($$4.size() == 1) {
            Entry<bii, cix> $$8 = $$4.entrySet().iterator().next();
            $$0.a(() -> tf.a("commands.item.entity.set.success.single", $$8.getKey().H_(), $$8.getValue().J()), true);
         } else {
            $$0.a(() -> tf.a("commands.item.entity.set.success.multiple", $$4.size()), true);
         }

         return $$4.size();
      }
   }

   private static int a(dr $$0, gu $$1, int $$2, cix $$3) throws CommandSyntaxException {
      bgj $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         $$4.a($$2, $$3);
         $$0.a(() -> tf.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$3.J()), true);
         return 1;
      } else {
         throw b.create($$2);
      }
   }

   private static bgj a(dr $$0, gu $$1, Dynamic3CommandExceptionType $$2) throws CommandSyntaxException {
      dcl $$3 = $$0.e().c_($$1);
      if (!($$3 instanceof bgj)) {
         throw $$2.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bgj)$$3;
      }
   }

   private static int a(dr $$0, Collection<? extends bii> $$1, int $$2, cix $$3) throws CommandSyntaxException {
      List<bii> $$4 = Lists.newArrayListWithCapacity($$1.size());

      for (bii $$5 : $$1) {
         bjq $$6 = $$5.a_($$2);
         if ($$6 != bjq.b && $$6.a($$3.p())) {
            $$4.add($$5);
            if ($$5 instanceof akl) {
               ((akl)$$5).bQ.d();
            }
         }
      }

      if ($$4.isEmpty()) {
         throw f.create($$3.J(), $$2);
      } else {
         if ($$4.size() == 1) {
            $$0.a(() -> tf.a("commands.item.entity.set.success.single", $$4.iterator().next().H_(), $$3.J()), true);
         } else {
            $$0.a(() -> tf.a("commands.item.entity.set.success.multiple", $$4.size(), $$3.J()), true);
         }

         return $$4.size();
      }
   }

   private static int a(dr $$0, gu $$1, int $$2, Collection<? extends bii> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(dr $$0, gu $$1, int $$2, Collection<? extends bii> $$3, int $$4, edt $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(dr $$0, gu $$1, int $$2, gu $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(dr $$0, gu $$1, int $$2, gu $$3, int $$4, edt $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(dr $$0, bii $$1, int $$2, gu $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(dr $$0, bii $$1, int $$2, gu $$3, int $$4, edt $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static int a(dr $$0, bii $$1, int $$2, Collection<? extends bii> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(dr $$0, bii $$1, int $$2, Collection<? extends bii> $$3, int $$4, edt $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static cix a(dr $$0, edt $$1, cix $$2) {
      akk $$3 = $$0.e();
      ecm $$4 = new ecm.a($$3).a(eer.f, $$0.d()).b(eer.a, $$0.f()).a(eeq.d);
      ecg $$5 = new ecg.a($$4).a(Optional.empty());
      $$5.b(ecg.a($$1));
      return $$1.apply($$2, $$5);
   }

   private static cix a(bii $$0, int $$1) throws CommandSyntaxException {
      bjq $$2 = $$0.a_($$1);
      if ($$2 == bjq.b) {
         throw d.create($$1);
      } else {
         return $$2.a().p();
      }
   }

   private static cix a(dr $$0, gu $$1, int $$2) throws CommandSyntaxException {
      bgj $$3 = a($$0, $$1, c);
      if ($$2 >= 0 && $$2 < $$3.b()) {
         return $$3.a($$2).p();
      } else {
         throw d.create($$2);
      }
   }
}
