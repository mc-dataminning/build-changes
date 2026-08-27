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
import java.util.Map.Entry;

public class agy {
   static final Dynamic3CommandExceptionType a = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> te.a("commands.item.target.not_a_container", $$0, $$1, $$2)
   );
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> te.a("commands.item.source.not_a_container", $$0, $$1, $$2)
   );
   static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> te.a("commands.item.target.no_such_slot", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> te.a("commands.item.source.no_such_slot", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> te.a("commands.item.target.no_changes", $$0));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> te.a("commands.item.target.no_changed.known_item", $$0, $$1)
   );
   private static final SuggestionProvider<ds> g = ($$0, $$1) -> {
      eck $$2 = ((ds)$$0.getSource()).l().aH();
      return dv.a($$2.a(ecm.b), $$1);
   };

   public static void a(CommandDispatcher<ds> $$0, dm $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("item").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)dt.a("replace")
                        .then(
                           dt.a("block")
                              .then(
                                 dt.a("pos", fj.a())
                                    .then(
                                       ((RequiredArgumentBuilder)dt.a("slot", ex.a())
                                             .then(
                                                dt.a("with")
                                                   .then(
                                                      ((RequiredArgumentBuilder)dt.a("item", fv.a($$1))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ds)$$0x.getSource(),
                                                                     fj.a($$0x, "pos"),
                                                                     ex.a($$0x, "slot"),
                                                                     fv.a($$0x, "item").a(1, false)
                                                                  )
                                                            ))
                                                         .then(
                                                            dt.a("count", IntegerArgumentType.integer(1, 64))
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (ds)$$0x.getSource(),
                                                                        fj.a($$0x, "pos"),
                                                                        ex.a($$0x, "slot"),
                                                                        fv.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                     )
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)dt.a("from")
                                                   .then(
                                                      dt.a("block")
                                                         .then(
                                                            dt.a("source", fj.a())
                                                               .then(
                                                                  ((RequiredArgumentBuilder)dt.a("sourceSlot", ex.a())
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ds)$$0x.getSource(),
                                                                                 fj.a($$0x, "source"),
                                                                                 ex.a($$0x, "sourceSlot"),
                                                                                 fj.a($$0x, "pos"),
                                                                                 ex.a($$0x, "slot")
                                                                              )
                                                                        ))
                                                                     .then(
                                                                        dt.a("modifier", er.a())
                                                                           .suggests(g)
                                                                           .executes(
                                                                              $$0x -> a(
                                                                                    (ds)$$0x.getSource(),
                                                                                    fj.a($$0x, "source"),
                                                                                    ex.a($$0x, "sourceSlot"),
                                                                                    fj.a($$0x, "pos"),
                                                                                    ex.a($$0x, "slot"),
                                                                                    er.d($$0x, "modifier")
                                                                                 )
                                                                           )
                                                                     )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   dt.a("entity")
                                                      .then(
                                                         dt.a("source", ed.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)dt.a("sourceSlot", ex.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ds)$$0x.getSource(),
                                                                              ed.a($$0x, "source"),
                                                                              ex.a($$0x, "sourceSlot"),
                                                                              fj.a($$0x, "pos"),
                                                                              ex.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     dt.a("modifier", er.a())
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ds)$$0x.getSource(),
                                                                                 ed.a($$0x, "source"),
                                                                                 ex.a($$0x, "sourceSlot"),
                                                                                 fj.a($$0x, "pos"),
                                                                                 ex.a($$0x, "slot"),
                                                                                 er.d($$0x, "modifier")
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
                        dt.a("entity")
                           .then(
                              dt.a("targets", ed.b())
                                 .then(
                                    ((RequiredArgumentBuilder)dt.a("slot", ex.a())
                                          .then(
                                             dt.a("with")
                                                .then(
                                                   ((RequiredArgumentBuilder)dt.a("item", fv.a($$1))
                                                         .executes(
                                                            $$0x -> a(
                                                                  (ds)$$0x.getSource(),
                                                                  ed.b($$0x, "targets"),
                                                                  ex.a($$0x, "slot"),
                                                                  fv.a($$0x, "item").a(1, false)
                                                               )
                                                         ))
                                                      .then(
                                                         dt.a("count", IntegerArgumentType.integer(1, 64))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ds)$$0x.getSource(),
                                                                     ed.b($$0x, "targets"),
                                                                     ex.a($$0x, "slot"),
                                                                     fv.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                  )
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)dt.a("from")
                                                .then(
                                                   dt.a("block")
                                                      .then(
                                                         dt.a("source", fj.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)dt.a("sourceSlot", ex.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ds)$$0x.getSource(),
                                                                              fj.a($$0x, "source"),
                                                                              ex.a($$0x, "sourceSlot"),
                                                                              ed.b($$0x, "targets"),
                                                                              ex.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     dt.a("modifier", er.a())
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ds)$$0x.getSource(),
                                                                                 fj.a($$0x, "source"),
                                                                                 ex.a($$0x, "sourceSlot"),
                                                                                 ed.b($$0x, "targets"),
                                                                                 ex.a($$0x, "slot"),
                                                                                 er.d($$0x, "modifier")
                                                                              )
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                dt.a("entity")
                                                   .then(
                                                      dt.a("source", ed.a())
                                                         .then(
                                                            ((RequiredArgumentBuilder)dt.a("sourceSlot", ex.a())
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (ds)$$0x.getSource(),
                                                                           ed.a($$0x, "source"),
                                                                           ex.a($$0x, "sourceSlot"),
                                                                           ed.b($$0x, "targets"),
                                                                           ex.a($$0x, "slot")
                                                                        )
                                                                  ))
                                                               .then(
                                                                  dt.a("modifier", er.a())
                                                                     .suggests(g)
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ds)$$0x.getSource(),
                                                                              ed.a($$0x, "source"),
                                                                              ex.a($$0x, "sourceSlot"),
                                                                              ed.b($$0x, "targets"),
                                                                              ex.a($$0x, "slot"),
                                                                              er.d($$0x, "modifier")
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
               ((LiteralArgumentBuilder)dt.a("modify")
                     .then(
                        dt.a("block")
                           .then(
                              dt.a("pos", fj.a())
                                 .then(
                                    dt.a("slot", ex.a())
                                       .then(
                                          dt.a("modifier", er.a())
                                             .suggests(g)
                                             .executes($$0x -> a((ds)$$0x.getSource(), fj.a($$0x, "pos"), ex.a($$0x, "slot"), er.d($$0x, "modifier")))
                                       )
                                 )
                           )
                     ))
                  .then(
                     dt.a("entity")
                        .then(
                           dt.a("targets", ed.b())
                              .then(
                                 dt.a("slot", ex.a())
                                    .then(
                                       dt.a("modifier", er.a())
                                          .suggests(g)
                                          .executes($$0x -> a((ds)$$0x.getSource(), ed.b($$0x, "targets"), ex.a($$0x, "slot"), er.d($$0x, "modifier")))
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ds $$0, gv $$1, int $$2, edw $$3) throws CommandSyntaxException {
      bgh $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         ciw $$5 = a($$0, $$3, $$4.a($$2));
         $$4.a($$2, $$5);
         $$0.a(() -> te.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$5.J()), true);
         return 1;
      } else {
         throw b.create($$2);
      }
   }

   private static int a(ds $$0, Collection<? extends big> $$1, int $$2, edw $$3) throws CommandSyntaxException {
      Map<big, ciw> $$4 = Maps.newHashMapWithExpectedSize($$1.size());

      for (big $$5 : $$1) {
         bjp $$6 = $$5.a_($$2);
         if ($$6 != bjp.b) {
            ciw $$7 = a($$0, $$3, $$6.a().p());
            if ($$6.a($$7)) {
               $$4.put($$5, $$7);
               if ($$5 instanceof akj) {
                  ((akj)$$5).bQ.d();
               }
            }
         }
      }

      if ($$4.isEmpty()) {
         throw e.create($$2);
      } else {
         if ($$4.size() == 1) {
            Entry<big, ciw> $$8 = $$4.entrySet().iterator().next();
            $$0.a(() -> te.a("commands.item.entity.set.success.single", $$8.getKey().H_(), $$8.getValue().J()), true);
         } else {
            $$0.a(() -> te.a("commands.item.entity.set.success.multiple", $$4.size()), true);
         }

         return $$4.size();
      }
   }

   private static int a(ds $$0, gv $$1, int $$2, ciw $$3) throws CommandSyntaxException {
      bgh $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         $$4.a($$2, $$3);
         $$0.a(() -> te.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$3.J()), true);
         return 1;
      } else {
         throw b.create($$2);
      }
   }

   private static bgh a(ds $$0, gv $$1, Dynamic3CommandExceptionType $$2) throws CommandSyntaxException {
      dck $$3 = $$0.e().c_($$1);
      if (!($$3 instanceof bgh)) {
         throw $$2.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bgh)$$3;
      }
   }

   private static int a(ds $$0, Collection<? extends big> $$1, int $$2, ciw $$3) throws CommandSyntaxException {
      List<big> $$4 = Lists.newArrayListWithCapacity($$1.size());

      for (big $$5 : $$1) {
         bjp $$6 = $$5.a_($$2);
         if ($$6 != bjp.b && $$6.a($$3.p())) {
            $$4.add($$5);
            if ($$5 instanceof akj) {
               ((akj)$$5).bQ.d();
            }
         }
      }

      if ($$4.isEmpty()) {
         throw f.create($$3.J(), $$2);
      } else {
         if ($$4.size() == 1) {
            $$0.a(() -> te.a("commands.item.entity.set.success.single", $$4.iterator().next().H_(), $$3.J()), true);
         } else {
            $$0.a(() -> te.a("commands.item.entity.set.success.multiple", $$4.size(), $$3.J()), true);
         }

         return $$4.size();
      }
   }

   private static int a(ds $$0, gv $$1, int $$2, Collection<? extends big> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(ds $$0, gv $$1, int $$2, Collection<? extends big> $$3, int $$4, edw $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(ds $$0, gv $$1, int $$2, gv $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(ds $$0, gv $$1, int $$2, gv $$3, int $$4, edw $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(ds $$0, big $$1, int $$2, gv $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(ds $$0, big $$1, int $$2, gv $$3, int $$4, edw $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static int a(ds $$0, big $$1, int $$2, Collection<? extends big> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(ds $$0, big $$1, int $$2, Collection<? extends big> $$3, int $$4, edw $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static ciw a(ds $$0, edw $$1, ciw $$2) {
      aki $$3 = $$0.e();
      ecn $$4 = new ecn.a($$3).a(eet.f, $$0.d()).b(eet.a, $$0.f()).a(ees.c);
      ech $$5 = new ech.a($$4).a(null);
      $$5.b(ech.a($$1));
      return $$1.apply($$2, $$5);
   }

   private static ciw a(big $$0, int $$1) throws CommandSyntaxException {
      bjp $$2 = $$0.a_($$1);
      if ($$2 == bjp.b) {
         throw d.create($$1);
      } else {
         return $$2.a().p();
      }
   }

   private static ciw a(ds $$0, gv $$1, int $$2) throws CommandSyntaxException {
      bgh $$3 = a($$0, $$1, c);
      if ($$2 >= 0 && $$2 < $$3.b()) {
         return $$3.a($$2).p();
      } else {
         throw d.create($$2);
      }
   }
}
