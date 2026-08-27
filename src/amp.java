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

public class amp {
   static final Dynamic3CommandExceptionType a = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> ws.b("commands.item.target.not_a_container", $$0, $$1, $$2)
   );
   static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> ws.b("commands.item.source.not_a_container", $$0, $$1, $$2)
   );
   static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> ws.b("commands.item.target.no_such_slot", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> ws.b("commands.item.source.no_such_slot", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> ws.b("commands.item.target.no_changes", $$0));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> ws.b("commands.item.target.no_changed.known_item", $$0, $$1)
   );
   private static final SuggestionProvider<ec> g = ($$0, $$1) -> {
      eod $$2 = ((ec)$$0.getSource()).l().aM();
      return eh.a($$2.a(eof.b), $$1);
   };

   public static void a(CommandDispatcher<ec> $$0, dy $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("item").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)ed.a("replace")
                        .then(
                           ed.a("block")
                              .then(
                                 ed.a("pos", fx.a())
                                    .then(
                                       ((RequiredArgumentBuilder)ed.a("slot", fj.a())
                                             .then(
                                                ed.a("with")
                                                   .then(
                                                      ((RequiredArgumentBuilder)ed.a("item", gj.a($$1))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ec)$$0x.getSource(),
                                                                     fx.a($$0x, "pos"),
                                                                     fj.a($$0x, "slot"),
                                                                     gj.a($$0x, "item").a(1, false)
                                                                  )
                                                            ))
                                                         .then(
                                                            ed.a("count", IntegerArgumentType.integer(1, 64))
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (ec)$$0x.getSource(),
                                                                        fx.a($$0x, "pos"),
                                                                        fj.a($$0x, "slot"),
                                                                        gj.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                     )
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)ed.a("from")
                                                   .then(
                                                      ed.a("block")
                                                         .then(
                                                            ed.a("source", fx.a())
                                                               .then(
                                                                  ((RequiredArgumentBuilder)ed.a("sourceSlot", fj.a())
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ec)$$0x.getSource(),
                                                                                 fx.a($$0x, "source"),
                                                                                 fj.a($$0x, "sourceSlot"),
                                                                                 fx.a($$0x, "pos"),
                                                                                 fj.a($$0x, "slot")
                                                                              )
                                                                        ))
                                                                     .then(
                                                                        ed.a("modifier", fd.a())
                                                                           .suggests(g)
                                                                           .executes(
                                                                              $$0x -> a(
                                                                                    (ec)$$0x.getSource(),
                                                                                    fx.a($$0x, "source"),
                                                                                    fj.a($$0x, "sourceSlot"),
                                                                                    fx.a($$0x, "pos"),
                                                                                    fj.a($$0x, "slot"),
                                                                                    fd.d($$0x, "modifier")
                                                                                 )
                                                                           )
                                                                     )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   ed.a("entity")
                                                      .then(
                                                         ed.a("source", ep.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)ed.a("sourceSlot", fj.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ec)$$0x.getSource(),
                                                                              ep.a($$0x, "source"),
                                                                              fj.a($$0x, "sourceSlot"),
                                                                              fx.a($$0x, "pos"),
                                                                              fj.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     ed.a("modifier", fd.a())
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ec)$$0x.getSource(),
                                                                                 ep.a($$0x, "source"),
                                                                                 fj.a($$0x, "sourceSlot"),
                                                                                 fx.a($$0x, "pos"),
                                                                                 fj.a($$0x, "slot"),
                                                                                 fd.d($$0x, "modifier")
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
                        ed.a("entity")
                           .then(
                              ed.a("targets", ep.b())
                                 .then(
                                    ((RequiredArgumentBuilder)ed.a("slot", fj.a())
                                          .then(
                                             ed.a("with")
                                                .then(
                                                   ((RequiredArgumentBuilder)ed.a("item", gj.a($$1))
                                                         .executes(
                                                            $$0x -> a(
                                                                  (ec)$$0x.getSource(),
                                                                  ep.b($$0x, "targets"),
                                                                  fj.a($$0x, "slot"),
                                                                  gj.a($$0x, "item").a(1, false)
                                                               )
                                                         ))
                                                      .then(
                                                         ed.a("count", IntegerArgumentType.integer(1, 64))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ec)$$0x.getSource(),
                                                                     ep.b($$0x, "targets"),
                                                                     fj.a($$0x, "slot"),
                                                                     gj.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                  )
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)ed.a("from")
                                                .then(
                                                   ed.a("block")
                                                      .then(
                                                         ed.a("source", fx.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)ed.a("sourceSlot", fj.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ec)$$0x.getSource(),
                                                                              fx.a($$0x, "source"),
                                                                              fj.a($$0x, "sourceSlot"),
                                                                              ep.b($$0x, "targets"),
                                                                              fj.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     ed.a("modifier", fd.a())
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ec)$$0x.getSource(),
                                                                                 fx.a($$0x, "source"),
                                                                                 fj.a($$0x, "sourceSlot"),
                                                                                 ep.b($$0x, "targets"),
                                                                                 fj.a($$0x, "slot"),
                                                                                 fd.d($$0x, "modifier")
                                                                              )
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                ed.a("entity")
                                                   .then(
                                                      ed.a("source", ep.a())
                                                         .then(
                                                            ((RequiredArgumentBuilder)ed.a("sourceSlot", fj.a())
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (ec)$$0x.getSource(),
                                                                           ep.a($$0x, "source"),
                                                                           fj.a($$0x, "sourceSlot"),
                                                                           ep.b($$0x, "targets"),
                                                                           fj.a($$0x, "slot")
                                                                        )
                                                                  ))
                                                               .then(
                                                                  ed.a("modifier", fd.a())
                                                                     .suggests(g)
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ec)$$0x.getSource(),
                                                                              ep.a($$0x, "source"),
                                                                              fj.a($$0x, "sourceSlot"),
                                                                              ep.b($$0x, "targets"),
                                                                              fj.a($$0x, "slot"),
                                                                              fd.d($$0x, "modifier")
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
               ((LiteralArgumentBuilder)ed.a("modify")
                     .then(
                        ed.a("block")
                           .then(
                              ed.a("pos", fx.a())
                                 .then(
                                    ed.a("slot", fj.a())
                                       .then(
                                          ed.a("modifier", fd.a())
                                             .suggests(g)
                                             .executes($$0x -> a((ec)$$0x.getSource(), fx.a($$0x, "pos"), fj.a($$0x, "slot"), fd.d($$0x, "modifier")))
                                       )
                                 )
                           )
                     ))
                  .then(
                     ed.a("entity")
                        .then(
                           ed.a("targets", ep.b())
                              .then(
                                 ed.a("slot", fj.a())
                                    .then(
                                       ed.a("modifier", fd.a())
                                          .suggests(g)
                                          .executes($$0x -> a((ec)$$0x.getSource(), ep.b($$0x, "targets"), fj.a($$0x, "slot"), fd.d($$0x, "modifier")))
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ec $$0, im $$1, int $$2, epp $$3) throws CommandSyntaxException {
      boj $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         csd $$5 = a($$0, $$3, $$4.a($$2));
         $$4.a($$2, $$5);
         $$0.a(() -> ws.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$5.E()), true);
         return 1;
      } else {
         throw c.create($$2);
      }
   }

   private static int a(ec $$0, Collection<? extends bql> $$1, int $$2, epp $$3) throws CommandSyntaxException {
      Map<bql, csd> $$4 = Maps.newHashMapWithExpectedSize($$1.size());

      for (bql $$5 : $$1) {
         brv $$6 = $$5.a_($$2);
         if ($$6 != brv.b) {
            csd $$7 = a($$0, $$3, $$6.a().r());
            if ($$6.a($$7)) {
               $$4.put($$5, $$7);
               if ($$5 instanceof aqf) {
                  ((aqf)$$5).cc.d();
               }
            }
         }
      }

      if ($$4.isEmpty()) {
         throw e.create($$2);
      } else {
         if ($$4.size() == 1) {
            Entry<bql, csd> $$8 = $$4.entrySet().iterator().next();
            $$0.a(() -> ws.a("commands.item.entity.set.success.single", $$8.getKey().O_(), $$8.getValue().E()), true);
         } else {
            $$0.a(() -> ws.a("commands.item.entity.set.success.multiple", $$4.size()), true);
         }

         return $$4.size();
      }
   }

   private static int a(ec $$0, im $$1, int $$2, csd $$3) throws CommandSyntaxException {
      boj $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         $$4.a($$2, $$3);
         $$0.a(() -> ws.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$3.E()), true);
         return 1;
      } else {
         throw c.create($$2);
      }
   }

   static boj a(ec $$0, im $$1, Dynamic3CommandExceptionType $$2) throws CommandSyntaxException {
      dnd $$3 = $$0.e().c_($$1);
      if (!($$3 instanceof boj)) {
         throw $$2.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (boj)$$3;
      }
   }

   private static int a(ec $$0, Collection<? extends bql> $$1, int $$2, csd $$3) throws CommandSyntaxException {
      List<bql> $$4 = Lists.newArrayListWithCapacity($$1.size());

      for (bql $$5 : $$1) {
         brv $$6 = $$5.a_($$2);
         if ($$6 != brv.b && $$6.a($$3.r())) {
            $$4.add($$5);
            if ($$5 instanceof aqf) {
               ((aqf)$$5).cc.d();
            }
         }
      }

      if ($$4.isEmpty()) {
         throw f.create($$3.E(), $$2);
      } else {
         if ($$4.size() == 1) {
            $$0.a(() -> ws.a("commands.item.entity.set.success.single", $$4.iterator().next().O_(), $$3.E()), true);
         } else {
            $$0.a(() -> ws.a("commands.item.entity.set.success.multiple", $$4.size(), $$3.E()), true);
         }

         return $$4.size();
      }
   }

   private static int a(ec $$0, im $$1, int $$2, Collection<? extends bql> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(ec $$0, im $$1, int $$2, Collection<? extends bql> $$3, int $$4, epp $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(ec $$0, im $$1, int $$2, im $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(ec $$0, im $$1, int $$2, im $$3, int $$4, epp $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(ec $$0, bql $$1, int $$2, im $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(ec $$0, bql $$1, int $$2, im $$3, int $$4, epp $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static int a(ec $$0, bql $$1, int $$2, Collection<? extends bql> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(ec $$0, bql $$1, int $$2, Collection<? extends bql> $$3, int $$4, epp $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static csd a(ec $$0, epp $$1, csd $$2) {
      aqe $$3 = $$0.e();
      eog $$4 = new eog.a($$3).a(eqt.f, $$0.d()).b(eqt.a, $$0.f()).a(eqs.d);
      eoa $$5 = new eoa.a($$4).a(Optional.empty());
      $$5.b(eoa.a($$1));
      return $$1.apply($$2, $$5);
   }

   private static csd a(bql $$0, int $$1) throws CommandSyntaxException {
      brv $$2 = $$0.a_($$1);
      if ($$2 == brv.b) {
         throw d.create($$1);
      } else {
         return $$2.a().r();
      }
   }

   private static csd a(ec $$0, im $$1, int $$2) throws CommandSyntaxException {
      boj $$3 = a($$0, $$1, b);
      if ($$2 >= 0 && $$2 < $$3.b()) {
         return $$3.a($$2).r();
      } else {
         throw d.create($$2);
      }
   }
}
