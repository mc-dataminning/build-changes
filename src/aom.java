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

public class aom {
   static final Dynamic3CommandExceptionType a = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xv.b("commands.item.target.not_a_container", $$0, $$1, $$2)
   );
   static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xv.b("commands.item.source.not_a_container", $$0, $$1, $$2)
   );
   static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xv.b("commands.item.target.no_such_slot", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xv.b("commands.item.source.no_such_slot", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xv.b("commands.item.target.no_changes", $$0));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xv.b("commands.item.target.no_changed.known_item", $$0, $$1)
   );
   private static final SuggestionProvider<ew> g = ($$0, $$1) -> {
      amj.a $$2 = ((ew)$$0.getSource()).l().bc();
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

   private static int a(ew $$0, jh $$1, int $$2, jq<eyc> $$3) throws CommandSyntaxException {
      btb $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         cxo $$5 = a($$0, $$3, $$4.a($$2));
         $$4.a($$2, $$5);
         $$0.a(() -> xv.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$5.J()), true);
         return 1;
      } else {
         throw c.create($$2);
      }
   }

   private static int a(ew $$0, Collection<? extends bvj> $$1, int $$2, jq<eyc> $$3) throws CommandSyntaxException {
      Map<bvj, cxo> $$4 = Maps.newHashMapWithExpectedSize($$1.size());

      for (bvj $$5 : $$1) {
         bwx $$6 = $$5.a_($$2);
         if ($$6 != bwx.a) {
            cxo $$7 = a($$0, $$3, $$6.a().v());
            if ($$6.a($$7)) {
               $$4.put($$5, $$7);
               if ($$5 instanceof asi) {
                  ((asi)$$5).cd.d();
               }
            }
         }
      }

      if ($$4.isEmpty()) {
         throw e.create($$2);
      } else {
         if ($$4.size() == 1) {
            Entry<bvj, cxo> $$8 = $$4.entrySet().iterator().next();
            $$0.a(() -> xv.a("commands.item.entity.set.success.single", $$8.getKey().p_(), $$8.getValue().J()), true);
         } else {
            $$0.a(() -> xv.a("commands.item.entity.set.success.multiple", $$4.size()), true);
         }

         return $$4.size();
      }
   }

   private static int a(ew $$0, jh $$1, int $$2, cxo $$3) throws CommandSyntaxException {
      btb $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         $$4.a($$2, $$3);
         $$0.a(() -> xv.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$3.J()), true);
         return 1;
      } else {
         throw c.create($$2);
      }
   }

   static btb a(ew $$0, jh $$1, Dynamic3CommandExceptionType $$2) throws CommandSyntaxException {
      duw $$3 = $$0.e().c_($$1);
      if (!($$3 instanceof btb)) {
         throw $$2.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (btb)$$3;
      }
   }

   private static int a(ew $$0, Collection<? extends bvj> $$1, int $$2, cxo $$3) throws CommandSyntaxException {
      List<bvj> $$4 = Lists.newArrayListWithCapacity($$1.size());

      for (bvj $$5 : $$1) {
         bwx $$6 = $$5.a_($$2);
         if ($$6 != bwx.a && $$6.a($$3.v())) {
            $$4.add($$5);
            if ($$5 instanceof asi) {
               ((asi)$$5).cd.d();
            }
         }
      }

      if ($$4.isEmpty()) {
         throw f.create($$3.J(), $$2);
      } else {
         if ($$4.size() == 1) {
            $$0.a(() -> xv.a("commands.item.entity.set.success.single", $$4.iterator().next().p_(), $$3.J()), true);
         } else {
            $$0.a(() -> xv.a("commands.item.entity.set.success.multiple", $$4.size(), $$3.J()), true);
         }

         return $$4.size();
      }
   }

   private static int a(ew $$0, jh $$1, int $$2, Collection<? extends bvj> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(ew $$0, jh $$1, int $$2, Collection<? extends bvj> $$3, int $$4, jq<eyc> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(ew $$0, jh $$1, int $$2, jh $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(ew $$0, jh $$1, int $$2, jh $$3, int $$4, jq<eyc> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(ew $$0, bvj $$1, int $$2, jh $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(ew $$0, bvj $$1, int $$2, jh $$3, int $$4, jq<eyc> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static int a(ew $$0, bvj $$1, int $$2, Collection<? extends bvj> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(ew $$0, bvj $$1, int $$2, Collection<? extends bvj> $$3, int $$4, jq<eyc> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static cxo a(ew $$0, jq<eyc> $$1, cxo $$2) {
      ash $$3 = $$0.e();
      ewr $$4 = new ewr.a($$3).a(ezi.f, $$0.d()).b(ezi.a, $$0.f()).a(ezh.d);
      ewo $$5 = new ewo.a($$4).a(Optional.empty());
      $$5.b(ewo.a($$1.a()));
      cxo $$6 = $$1.a().apply($$2, $$5);
      $$6.f($$6.k());
      return $$6;
   }

   private static cxo a(bvj $$0, int $$1) throws CommandSyntaxException {
      bwx $$2 = $$0.a_($$1);
      if ($$2 == bwx.a) {
         throw d.create($$1);
      } else {
         return $$2.a().v();
      }
   }

   private static cxo a(ew $$0, jh $$1, int $$2) throws CommandSyntaxException {
      btb $$3 = a($$0, $$1, b);
      if ($$2 >= 0 && $$2 < $$3.b()) {
         return $$3.a($$2).v();
      } else {
         throw d.create($$2);
      }
   }
}
