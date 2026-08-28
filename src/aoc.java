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

public class aoc {
   static final Dynamic3CommandExceptionType a = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xk.b("commands.item.target.not_a_container", $$0, $$1, $$2)
   );
   static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xk.b("commands.item.source.not_a_container", $$0, $$1, $$2)
   );
   static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xk.b("commands.item.target.no_such_slot", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xk.b("commands.item.source.no_such_slot", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xk.b("commands.item.target.no_changes", $$0));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xk.b("commands.item.target.no_changed.known_item", $$0, $$1)
   );
   private static final SuggestionProvider<ew> g = ($$0, $$1) -> {
      alz.a $$2 = ((ew)$$0.getSource()).l().bc();
      return fb.a($$2.a(mb.bh), $$1);
   };

   public static void a(CommandDispatcher<ew> $$0, es $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("item").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)ex.a("replace")
                        .then(
                           ex.a("block")
                              .then(
                                 ex.a("pos", gs.a())
                                    .then(
                                       ((RequiredArgumentBuilder)ex.a("slot", ge.a())
                                             .then(
                                                ex.a("with")
                                                   .then(
                                                      ((RequiredArgumentBuilder)ex.a("item", hf.a($$1))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ew)$$0x.getSource(),
                                                                     gs.a($$0x, "pos"),
                                                                     ge.a($$0x, "slot"),
                                                                     hf.a($$0x, "item").a(1, false)
                                                                  )
                                                            ))
                                                         .then(
                                                            ex.a("count", IntegerArgumentType.integer(1, 99))
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (ew)$$0x.getSource(),
                                                                        gs.a($$0x, "pos"),
                                                                        ge.a($$0x, "slot"),
                                                                        hf.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                     )
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)ex.a("from")
                                                   .then(
                                                      ex.a("block")
                                                         .then(
                                                            ex.a("source", gs.a())
                                                               .then(
                                                                  ((RequiredArgumentBuilder)ex.a("sourceSlot", ge.a())
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ew)$$0x.getSource(),
                                                                                 gs.a($$0x, "source"),
                                                                                 ge.a($$0x, "sourceSlot"),
                                                                                 gs.a($$0x, "pos"),
                                                                                 ge.a($$0x, "slot")
                                                                              )
                                                                        ))
                                                                     .then(
                                                                        ex.a("modifier", fy.b($$1))
                                                                           .suggests(g)
                                                                           .executes(
                                                                              $$0x -> a(
                                                                                    (ew)$$0x.getSource(),
                                                                                    gs.a($$0x, "source"),
                                                                                    ge.a($$0x, "sourceSlot"),
                                                                                    gs.a($$0x, "pos"),
                                                                                    ge.a($$0x, "slot"),
                                                                                    fy.b($$0x, "modifier")
                                                                                 )
                                                                           )
                                                                     )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   ex.a("entity")
                                                      .then(
                                                         ex.a("source", fj.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)ex.a("sourceSlot", ge.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ew)$$0x.getSource(),
                                                                              fj.a($$0x, "source"),
                                                                              ge.a($$0x, "sourceSlot"),
                                                                              gs.a($$0x, "pos"),
                                                                              ge.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     ex.a("modifier", fy.b($$1))
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ew)$$0x.getSource(),
                                                                                 fj.a($$0x, "source"),
                                                                                 ge.a($$0x, "sourceSlot"),
                                                                                 gs.a($$0x, "pos"),
                                                                                 ge.a($$0x, "slot"),
                                                                                 fy.b($$0x, "modifier")
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
                        ex.a("entity")
                           .then(
                              ex.a("targets", fj.b())
                                 .then(
                                    ((RequiredArgumentBuilder)ex.a("slot", ge.a())
                                          .then(
                                             ex.a("with")
                                                .then(
                                                   ((RequiredArgumentBuilder)ex.a("item", hf.a($$1))
                                                         .executes(
                                                            $$0x -> a(
                                                                  (ew)$$0x.getSource(),
                                                                  fj.b($$0x, "targets"),
                                                                  ge.a($$0x, "slot"),
                                                                  hf.a($$0x, "item").a(1, false)
                                                               )
                                                         ))
                                                      .then(
                                                         ex.a("count", IntegerArgumentType.integer(1, 99))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ew)$$0x.getSource(),
                                                                     fj.b($$0x, "targets"),
                                                                     ge.a($$0x, "slot"),
                                                                     hf.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                  )
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)ex.a("from")
                                                .then(
                                                   ex.a("block")
                                                      .then(
                                                         ex.a("source", gs.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)ex.a("sourceSlot", ge.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ew)$$0x.getSource(),
                                                                              gs.a($$0x, "source"),
                                                                              ge.a($$0x, "sourceSlot"),
                                                                              fj.b($$0x, "targets"),
                                                                              ge.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     ex.a("modifier", fy.b($$1))
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ew)$$0x.getSource(),
                                                                                 gs.a($$0x, "source"),
                                                                                 ge.a($$0x, "sourceSlot"),
                                                                                 fj.b($$0x, "targets"),
                                                                                 ge.a($$0x, "slot"),
                                                                                 fy.b($$0x, "modifier")
                                                                              )
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                ex.a("entity")
                                                   .then(
                                                      ex.a("source", fj.a())
                                                         .then(
                                                            ((RequiredArgumentBuilder)ex.a("sourceSlot", ge.a())
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (ew)$$0x.getSource(),
                                                                           fj.a($$0x, "source"),
                                                                           ge.a($$0x, "sourceSlot"),
                                                                           fj.b($$0x, "targets"),
                                                                           ge.a($$0x, "slot")
                                                                        )
                                                                  ))
                                                               .then(
                                                                  ex.a("modifier", fy.b($$1))
                                                                     .suggests(g)
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ew)$$0x.getSource(),
                                                                              fj.a($$0x, "source"),
                                                                              ge.a($$0x, "sourceSlot"),
                                                                              fj.b($$0x, "targets"),
                                                                              ge.a($$0x, "slot"),
                                                                              fy.b($$0x, "modifier")
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
               ((LiteralArgumentBuilder)ex.a("modify")
                     .then(
                        ex.a("block")
                           .then(
                              ex.a("pos", gs.a())
                                 .then(
                                    ex.a("slot", ge.a())
                                       .then(
                                          ex.a("modifier", fy.b($$1))
                                             .suggests(g)
                                             .executes($$0x -> a((ew)$$0x.getSource(), gs.a($$0x, "pos"), ge.a($$0x, "slot"), fy.b($$0x, "modifier")))
                                       )
                                 )
                           )
                     ))
                  .then(
                     ex.a("entity")
                        .then(
                           ex.a("targets", fj.b())
                              .then(
                                 ex.a("slot", ge.a())
                                    .then(
                                       ex.a("modifier", fy.b($$1))
                                          .suggests(g)
                                          .executes($$0x -> a((ew)$$0x.getSource(), fj.b($$0x, "targets"), ge.a($$0x, "slot"), fy.b($$0x, "modifier")))
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ew $$0, jh $$1, int $$2, jq<exw> $$3) throws CommandSyntaxException {
      bst $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         cxg $$5 = a($$0, $$3, $$4.a($$2));
         $$4.a($$2, $$5);
         $$0.a(() -> xk.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$5.K()), true);
         return 1;
      } else {
         throw c.create($$2);
      }
   }

   private static int a(ew $$0, Collection<? extends bvb> $$1, int $$2, jq<exw> $$3) throws CommandSyntaxException {
      Map<bvb, cxg> $$4 = Maps.newHashMapWithExpectedSize($$1.size());

      for (bvb $$5 : $$1) {
         bwp $$6 = $$5.a_($$2);
         if ($$6 != bwp.a) {
            cxg $$7 = a($$0, $$3, $$6.a().v());
            if ($$6.a($$7)) {
               $$4.put($$5, $$7);
               if ($$5 instanceof ary) {
                  ((ary)$$5).cd.d();
               }
            }
         }
      }

      if ($$4.isEmpty()) {
         throw e.create($$2);
      } else {
         if ($$4.size() == 1) {
            Entry<bvb, cxg> $$8 = $$4.entrySet().iterator().next();
            $$0.a(() -> xk.a("commands.item.entity.set.success.single", $$8.getKey().p_(), $$8.getValue().K()), true);
         } else {
            $$0.a(() -> xk.a("commands.item.entity.set.success.multiple", $$4.size()), true);
         }

         return $$4.size();
      }
   }

   private static int a(ew $$0, jh $$1, int $$2, cxg $$3) throws CommandSyntaxException {
      bst $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         $$4.a($$2, $$3);
         $$0.a(() -> xk.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$3.K()), true);
         return 1;
      } else {
         throw c.create($$2);
      }
   }

   static bst a(ew $$0, jh $$1, Dynamic3CommandExceptionType $$2) throws CommandSyntaxException {
      duq $$3 = $$0.e().c_($$1);
      if (!($$3 instanceof bst)) {
         throw $$2.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bst)$$3;
      }
   }

   private static int a(ew $$0, Collection<? extends bvb> $$1, int $$2, cxg $$3) throws CommandSyntaxException {
      List<bvb> $$4 = Lists.newArrayListWithCapacity($$1.size());

      for (bvb $$5 : $$1) {
         bwp $$6 = $$5.a_($$2);
         if ($$6 != bwp.a && $$6.a($$3.v())) {
            $$4.add($$5);
            if ($$5 instanceof ary) {
               ((ary)$$5).cd.d();
            }
         }
      }

      if ($$4.isEmpty()) {
         throw f.create($$3.K(), $$2);
      } else {
         if ($$4.size() == 1) {
            $$0.a(() -> xk.a("commands.item.entity.set.success.single", $$4.iterator().next().p_(), $$3.K()), true);
         } else {
            $$0.a(() -> xk.a("commands.item.entity.set.success.multiple", $$4.size(), $$3.K()), true);
         }

         return $$4.size();
      }
   }

   private static int a(ew $$0, jh $$1, int $$2, Collection<? extends bvb> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(ew $$0, jh $$1, int $$2, Collection<? extends bvb> $$3, int $$4, jq<exw> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(ew $$0, jh $$1, int $$2, jh $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(ew $$0, jh $$1, int $$2, jh $$3, int $$4, jq<exw> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(ew $$0, bvb $$1, int $$2, jh $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(ew $$0, bvb $$1, int $$2, jh $$3, int $$4, jq<exw> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static int a(ew $$0, bvb $$1, int $$2, Collection<? extends bvb> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(ew $$0, bvb $$1, int $$2, Collection<? extends bvb> $$3, int $$4, jq<exw> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static cxg a(ew $$0, jq<exw> $$1, cxg $$2) {
      arx $$3 = $$0.e();
      ewl $$4 = new ewl.a($$3).a(ezc.f, $$0.d()).b(ezc.a, $$0.f()).a(ezb.d);
      ewi $$5 = new ewi.a($$4).a(Optional.empty());
      $$5.b(ewi.a($$1.a()));
      cxg $$6 = $$1.a().apply($$2, $$5);
      $$6.f($$6.k());
      return $$6;
   }

   private static cxg a(bvb $$0, int $$1) throws CommandSyntaxException {
      bwp $$2 = $$0.a_($$1);
      if ($$2 == bwp.a) {
         throw d.create($$1);
      } else {
         return $$2.a().v();
      }
   }

   private static cxg a(ew $$0, jh $$1, int $$2) throws CommandSyntaxException {
      bst $$3 = a($$0, $$1, b);
      if ($$2 >= 0 && $$2 < $$3.b()) {
         return $$3.a($$2).v();
      } else {
         throw d.create($$2);
      }
   }
}
