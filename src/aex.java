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

public class aex {
   static final Dynamic3CommandExceptionType a = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> sw.a("commands.item.target.not_a_container", $$0, $$1, $$2)
   );
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> sw.a("commands.item.source.not_a_container", $$0, $$1, $$2)
   );
   static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> sw.a("commands.item.target.no_such_slot", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> sw.a("commands.item.source.no_such_slot", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> sw.a("commands.item.target.no_changes", $$0));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> sw.a("commands.item.target.no_changed.known_item", $$0, $$1)
   );
   private static final SuggestionProvider<ds> g = ($$0, $$1) -> {
      dzn $$2 = ((ds)$$0.getSource()).l().aH();
      return du.a($$2.a(dzp.b), $$1);
   };

   public static void a(CommandDispatcher<ds> $$0, dm $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("item").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)dt.a("replace")
                        .then(
                           dt.a("block")
                              .then(
                                 dt.a("pos", fi.a())
                                    .then(
                                       ((RequiredArgumentBuilder)dt.a("slot", ew.a())
                                             .then(
                                                dt.a("with")
                                                   .then(
                                                      ((RequiredArgumentBuilder)dt.a("item", fu.a($$1))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ds)$$0x.getSource(),
                                                                     fi.a($$0x, "pos"),
                                                                     ew.a($$0x, "slot"),
                                                                     fu.a($$0x, "item").a(1, false)
                                                                  )
                                                            ))
                                                         .then(
                                                            dt.a("count", IntegerArgumentType.integer(1, 64))
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (ds)$$0x.getSource(),
                                                                        fi.a($$0x, "pos"),
                                                                        ew.a($$0x, "slot"),
                                                                        fu.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
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
                                                            dt.a("source", fi.a())
                                                               .then(
                                                                  ((RequiredArgumentBuilder)dt.a("sourceSlot", ew.a())
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ds)$$0x.getSource(),
                                                                                 fi.a($$0x, "source"),
                                                                                 ew.a($$0x, "sourceSlot"),
                                                                                 fi.a($$0x, "pos"),
                                                                                 ew.a($$0x, "slot")
                                                                              )
                                                                        ))
                                                                     .then(
                                                                        dt.a("modifier", eq.a())
                                                                           .suggests(g)
                                                                           .executes(
                                                                              $$0x -> a(
                                                                                    (ds)$$0x.getSource(),
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
                                                   dt.a("entity")
                                                      .then(
                                                         dt.a("source", ec.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)dt.a("sourceSlot", ew.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ds)$$0x.getSource(),
                                                                              ec.a($$0x, "source"),
                                                                              ew.a($$0x, "sourceSlot"),
                                                                              fi.a($$0x, "pos"),
                                                                              ew.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     dt.a("modifier", eq.a())
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ds)$$0x.getSource(),
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
                        dt.a("entity")
                           .then(
                              dt.a("targets", ec.b())
                                 .then(
                                    ((RequiredArgumentBuilder)dt.a("slot", ew.a())
                                          .then(
                                             dt.a("with")
                                                .then(
                                                   ((RequiredArgumentBuilder)dt.a("item", fu.a($$1))
                                                         .executes(
                                                            $$0x -> a(
                                                                  (ds)$$0x.getSource(),
                                                                  ec.b($$0x, "targets"),
                                                                  ew.a($$0x, "slot"),
                                                                  fu.a($$0x, "item").a(1, false)
                                                               )
                                                         ))
                                                      .then(
                                                         dt.a("count", IntegerArgumentType.integer(1, 64))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ds)$$0x.getSource(),
                                                                     ec.b($$0x, "targets"),
                                                                     ew.a($$0x, "slot"),
                                                                     fu.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
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
                                                         dt.a("source", fi.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)dt.a("sourceSlot", ew.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ds)$$0x.getSource(),
                                                                              fi.a($$0x, "source"),
                                                                              ew.a($$0x, "sourceSlot"),
                                                                              ec.b($$0x, "targets"),
                                                                              ew.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     dt.a("modifier", eq.a())
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ds)$$0x.getSource(),
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
                                                dt.a("entity")
                                                   .then(
                                                      dt.a("source", ec.a())
                                                         .then(
                                                            ((RequiredArgumentBuilder)dt.a("sourceSlot", ew.a())
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (ds)$$0x.getSource(),
                                                                           ec.a($$0x, "source"),
                                                                           ew.a($$0x, "sourceSlot"),
                                                                           ec.b($$0x, "targets"),
                                                                           ew.a($$0x, "slot")
                                                                        )
                                                                  ))
                                                               .then(
                                                                  dt.a("modifier", eq.a())
                                                                     .suggests(g)
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ds)$$0x.getSource(),
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
               ((LiteralArgumentBuilder)dt.a("modify")
                     .then(
                        dt.a("block")
                           .then(
                              dt.a("pos", fi.a())
                                 .then(
                                    dt.a("slot", ew.a())
                                       .then(
                                          dt.a("modifier", eq.a())
                                             .suggests(g)
                                             .executes($$0x -> a((ds)$$0x.getSource(), fi.a($$0x, "pos"), ew.a($$0x, "slot"), eq.d($$0x, "modifier")))
                                       )
                                 )
                           )
                     ))
                  .then(
                     dt.a("entity")
                        .then(
                           dt.a("targets", ec.b())
                              .then(
                                 dt.a("slot", ew.a())
                                    .then(
                                       dt.a("modifier", eq.a())
                                          .suggests(g)
                                          .executes($$0x -> a((ds)$$0x.getSource(), ec.b($$0x, "targets"), ew.a($$0x, "slot"), eq.d($$0x, "modifier")))
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ds $$0, gu $$1, int $$2, eaz $$3) throws CommandSyntaxException {
      bdq $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         cfz $$5 = a($$0, $$3, $$4.a($$2));
         $$4.a($$2, $$5);
         $$0.a(() -> sw.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$5.J()), true);
         return 1;
      } else {
         throw b.create($$2);
      }
   }

   private static int a(ds $$0, Collection<? extends bfj> $$1, int $$2, eaz $$3) throws CommandSyntaxException {
      Map<bfj, cfz> $$4 = Maps.newHashMapWithExpectedSize($$1.size());

      for (bfj $$5 : $$1) {
         bgs $$6 = $$5.a_($$2);
         if ($$6 != bgs.b) {
            cfz $$7 = a($$0, $$3, $$6.a().p());
            if ($$6.a($$7)) {
               $$4.put($$5, $$7);
               if ($$5 instanceof aig) {
                  ((aig)$$5).bR.d();
               }
            }
         }
      }

      if ($$4.isEmpty()) {
         throw e.create($$2);
      } else {
         if ($$4.size() == 1) {
            Entry<bfj, cfz> $$8 = $$4.entrySet().iterator().next();
            $$0.a(() -> sw.a("commands.item.entity.set.success.single", $$8.getKey().H_(), $$8.getValue().J()), true);
         } else {
            $$0.a(() -> sw.a("commands.item.entity.set.success.multiple", $$4.size()), true);
         }

         return $$4.size();
      }
   }

   private static int a(ds $$0, gu $$1, int $$2, cfz $$3) throws CommandSyntaxException {
      bdq $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         $$4.a($$2, $$3);
         $$0.a(() -> sw.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$3.J()), true);
         return 1;
      } else {
         throw b.create($$2);
      }
   }

   private static bdq a(ds $$0, gu $$1, Dynamic3CommandExceptionType $$2) throws CommandSyntaxException {
      czn $$3 = $$0.e().c_($$1);
      if (!($$3 instanceof bdq)) {
         throw $$2.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bdq)$$3;
      }
   }

   private static int a(ds $$0, Collection<? extends bfj> $$1, int $$2, cfz $$3) throws CommandSyntaxException {
      List<bfj> $$4 = Lists.newArrayListWithCapacity($$1.size());

      for (bfj $$5 : $$1) {
         bgs $$6 = $$5.a_($$2);
         if ($$6 != bgs.b && $$6.a($$3.p())) {
            $$4.add($$5);
            if ($$5 instanceof aig) {
               ((aig)$$5).bR.d();
            }
         }
      }

      if ($$4.isEmpty()) {
         throw f.create($$3.J(), $$2);
      } else {
         if ($$4.size() == 1) {
            $$0.a(() -> sw.a("commands.item.entity.set.success.single", $$4.iterator().next().H_(), $$3.J()), true);
         } else {
            $$0.a(() -> sw.a("commands.item.entity.set.success.multiple", $$4.size(), $$3.J()), true);
         }

         return $$4.size();
      }
   }

   private static int a(ds $$0, gu $$1, int $$2, Collection<? extends bfj> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(ds $$0, gu $$1, int $$2, Collection<? extends bfj> $$3, int $$4, eaz $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(ds $$0, gu $$1, int $$2, gu $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(ds $$0, gu $$1, int $$2, gu $$3, int $$4, eaz $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(ds $$0, bfj $$1, int $$2, gu $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(ds $$0, bfj $$1, int $$2, gu $$3, int $$4, eaz $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static int a(ds $$0, bfj $$1, int $$2, Collection<? extends bfj> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(ds $$0, bfj $$1, int $$2, Collection<? extends bfj> $$3, int $$4, eaz $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static cfz a(ds $$0, eaz $$1, cfz $$2) {
      aif $$3 = $$0.e();
      dzq $$4 = new dzq.a($$3).a(ebw.f, $$0.d()).b(ebw.a, $$0.f()).a(ebv.c);
      dzk $$5 = new dzk.a($$4).a(null);
      $$5.b(dzk.a($$1));
      return $$1.apply($$2, $$5);
   }

   private static cfz a(bfj $$0, int $$1) throws CommandSyntaxException {
      bgs $$2 = $$0.a_($$1);
      if ($$2 == bgs.b) {
         throw d.create($$1);
      } else {
         return $$2.a().p();
      }
   }

   private static cfz a(ds $$0, gu $$1, int $$2) throws CommandSyntaxException {
      bdq $$3 = a($$0, $$1, c);
      if ($$2 >= 0 && $$2 < $$3.b()) {
         return $$3.a($$2).p();
      } else {
         throw d.create($$2);
      }
   }
}
