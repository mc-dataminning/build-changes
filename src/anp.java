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

public class anp {
   static final Dynamic3CommandExceptionType a = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xd.b("commands.item.target.not_a_container", $$0, $$1, $$2)
   );
   static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xd.b("commands.item.source.not_a_container", $$0, $$1, $$2)
   );
   static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xd.b("commands.item.target.no_such_slot", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xd.b("commands.item.source.no_such_slot", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xd.b("commands.item.target.no_changes", $$0));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xd.b("commands.item.target.no_changed.known_item", $$0, $$1)
   );
   private static final SuggestionProvider<et> g = ($$0, $$1) -> {
      alm.a $$2 = ((et)$$0.getSource()).l().bd();
      return ey.a($$2.a(lv.be), $$1);
   };

   public static void a(CommandDispatcher<et> $$0, ep $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("item").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)eu.a("replace")
                        .then(
                           eu.a("block")
                              .then(
                                 eu.a("pos", gp.a())
                                    .then(
                                       ((RequiredArgumentBuilder)eu.a("slot", gb.a())
                                             .then(
                                                eu.a("with")
                                                   .then(
                                                      ((RequiredArgumentBuilder)eu.a("item", hc.a($$1))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (et)$$0x.getSource(),
                                                                     gp.a($$0x, "pos"),
                                                                     gb.a($$0x, "slot"),
                                                                     hc.a($$0x, "item").a(1, false)
                                                                  )
                                                            ))
                                                         .then(
                                                            eu.a("count", IntegerArgumentType.integer(1, 99))
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (et)$$0x.getSource(),
                                                                        gp.a($$0x, "pos"),
                                                                        gb.a($$0x, "slot"),
                                                                        hc.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                     )
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)eu.a("from")
                                                   .then(
                                                      eu.a("block")
                                                         .then(
                                                            eu.a("source", gp.a())
                                                               .then(
                                                                  ((RequiredArgumentBuilder)eu.a("sourceSlot", gb.a())
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (et)$$0x.getSource(),
                                                                                 gp.a($$0x, "source"),
                                                                                 gb.a($$0x, "sourceSlot"),
                                                                                 gp.a($$0x, "pos"),
                                                                                 gb.a($$0x, "slot")
                                                                              )
                                                                        ))
                                                                     .then(
                                                                        eu.a("modifier", fv.b($$1))
                                                                           .suggests(g)
                                                                           .executes(
                                                                              $$0x -> a(
                                                                                    (et)$$0x.getSource(),
                                                                                    gp.a($$0x, "source"),
                                                                                    gb.a($$0x, "sourceSlot"),
                                                                                    gp.a($$0x, "pos"),
                                                                                    gb.a($$0x, "slot"),
                                                                                    fv.b($$0x, "modifier")
                                                                                 )
                                                                           )
                                                                     )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   eu.a("entity")
                                                      .then(
                                                         eu.a("source", fg.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)eu.a("sourceSlot", gb.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (et)$$0x.getSource(),
                                                                              fg.a($$0x, "source"),
                                                                              gb.a($$0x, "sourceSlot"),
                                                                              gp.a($$0x, "pos"),
                                                                              gb.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     eu.a("modifier", fv.b($$1))
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (et)$$0x.getSource(),
                                                                                 fg.a($$0x, "source"),
                                                                                 gb.a($$0x, "sourceSlot"),
                                                                                 gp.a($$0x, "pos"),
                                                                                 gb.a($$0x, "slot"),
                                                                                 fv.b($$0x, "modifier")
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
                        eu.a("entity")
                           .then(
                              eu.a("targets", fg.b())
                                 .then(
                                    ((RequiredArgumentBuilder)eu.a("slot", gb.a())
                                          .then(
                                             eu.a("with")
                                                .then(
                                                   ((RequiredArgumentBuilder)eu.a("item", hc.a($$1))
                                                         .executes(
                                                            $$0x -> a(
                                                                  (et)$$0x.getSource(),
                                                                  fg.b($$0x, "targets"),
                                                                  gb.a($$0x, "slot"),
                                                                  hc.a($$0x, "item").a(1, false)
                                                               )
                                                         ))
                                                      .then(
                                                         eu.a("count", IntegerArgumentType.integer(1, 99))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (et)$$0x.getSource(),
                                                                     fg.b($$0x, "targets"),
                                                                     gb.a($$0x, "slot"),
                                                                     hc.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                  )
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)eu.a("from")
                                                .then(
                                                   eu.a("block")
                                                      .then(
                                                         eu.a("source", gp.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)eu.a("sourceSlot", gb.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (et)$$0x.getSource(),
                                                                              gp.a($$0x, "source"),
                                                                              gb.a($$0x, "sourceSlot"),
                                                                              fg.b($$0x, "targets"),
                                                                              gb.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     eu.a("modifier", fv.b($$1))
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (et)$$0x.getSource(),
                                                                                 gp.a($$0x, "source"),
                                                                                 gb.a($$0x, "sourceSlot"),
                                                                                 fg.b($$0x, "targets"),
                                                                                 gb.a($$0x, "slot"),
                                                                                 fv.b($$0x, "modifier")
                                                                              )
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                eu.a("entity")
                                                   .then(
                                                      eu.a("source", fg.a())
                                                         .then(
                                                            ((RequiredArgumentBuilder)eu.a("sourceSlot", gb.a())
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (et)$$0x.getSource(),
                                                                           fg.a($$0x, "source"),
                                                                           gb.a($$0x, "sourceSlot"),
                                                                           fg.b($$0x, "targets"),
                                                                           gb.a($$0x, "slot")
                                                                        )
                                                                  ))
                                                               .then(
                                                                  eu.a("modifier", fv.b($$1))
                                                                     .suggests(g)
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (et)$$0x.getSource(),
                                                                              fg.a($$0x, "source"),
                                                                              gb.a($$0x, "sourceSlot"),
                                                                              fg.b($$0x, "targets"),
                                                                              gb.a($$0x, "slot"),
                                                                              fv.b($$0x, "modifier")
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
               ((LiteralArgumentBuilder)eu.a("modify")
                     .then(
                        eu.a("block")
                           .then(
                              eu.a("pos", gp.a())
                                 .then(
                                    eu.a("slot", gb.a())
                                       .then(
                                          eu.a("modifier", fv.b($$1))
                                             .suggests(g)
                                             .executes($$0x -> a((et)$$0x.getSource(), gp.a($$0x, "pos"), gb.a($$0x, "slot"), fv.b($$0x, "modifier")))
                                       )
                                 )
                           )
                     ))
                  .then(
                     eu.a("entity")
                        .then(
                           eu.a("targets", fg.b())
                              .then(
                                 eu.a("slot", gb.a())
                                    .then(
                                       eu.a("modifier", fv.b($$1))
                                          .suggests(g)
                                          .executes($$0x -> a((et)$$0x.getSource(), fg.b($$0x, "targets"), gb.a($$0x, "slot"), fv.b($$0x, "modifier")))
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(et $$0, je $$1, int $$2, jn<euv> $$3) throws CommandSyntaxException {
      bri $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         cvp $$5 = a($$0, $$3, $$4.a($$2));
         $$4.a($$2, $$5);
         $$0.a(() -> xd.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$5.H()), true);
         return 1;
      } else {
         throw c.create($$2);
      }
   }

   private static int a(et $$0, Collection<? extends bto> $$1, int $$2, jn<euv> $$3) throws CommandSyntaxException {
      Map<bto, cvp> $$4 = Maps.newHashMapWithExpectedSize($$1.size());

      for (bto $$5 : $$1) {
         bvb $$6 = $$5.a_($$2);
         if ($$6 != bvb.a) {
            cvp $$7 = a($$0, $$3, $$6.a().u());
            if ($$6.a($$7)) {
               $$4.put($$5, $$7);
               if ($$5 instanceof ari) {
                  ((ari)$$5).bZ.d();
               }
            }
         }
      }

      if ($$4.isEmpty()) {
         throw e.create($$2);
      } else {
         if ($$4.size() == 1) {
            Entry<bto, cvp> $$8 = $$4.entrySet().iterator().next();
            $$0.a(() -> xd.a("commands.item.entity.set.success.single", $$8.getKey().Q_(), $$8.getValue().H()), true);
         } else {
            $$0.a(() -> xd.a("commands.item.entity.set.success.multiple", $$4.size()), true);
         }

         return $$4.size();
      }
   }

   private static int a(et $$0, je $$1, int $$2, cvp $$3) throws CommandSyntaxException {
      bri $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         $$4.a($$2, $$3);
         $$0.a(() -> xd.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$3.H()), true);
         return 1;
      } else {
         throw c.create($$2);
      }
   }

   static bri a(et $$0, je $$1, Dynamic3CommandExceptionType $$2) throws CommandSyntaxException {
      drs $$3 = $$0.e().c_($$1);
      if (!($$3 instanceof bri)) {
         throw $$2.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bri)$$3;
      }
   }

   private static int a(et $$0, Collection<? extends bto> $$1, int $$2, cvp $$3) throws CommandSyntaxException {
      List<bto> $$4 = Lists.newArrayListWithCapacity($$1.size());

      for (bto $$5 : $$1) {
         bvb $$6 = $$5.a_($$2);
         if ($$6 != bvb.a && $$6.a($$3.u())) {
            $$4.add($$5);
            if ($$5 instanceof ari) {
               ((ari)$$5).bZ.d();
            }
         }
      }

      if ($$4.isEmpty()) {
         throw f.create($$3.H(), $$2);
      } else {
         if ($$4.size() == 1) {
            $$0.a(() -> xd.a("commands.item.entity.set.success.single", $$4.iterator().next().Q_(), $$3.H()), true);
         } else {
            $$0.a(() -> xd.a("commands.item.entity.set.success.multiple", $$4.size(), $$3.H()), true);
         }

         return $$4.size();
      }
   }

   private static int a(et $$0, je $$1, int $$2, Collection<? extends bto> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(et $$0, je $$1, int $$2, Collection<? extends bto> $$3, int $$4, jn<euv> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(et $$0, je $$1, int $$2, je $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(et $$0, je $$1, int $$2, je $$3, int $$4, jn<euv> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(et $$0, bto $$1, int $$2, je $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(et $$0, bto $$1, int $$2, je $$3, int $$4, jn<euv> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static int a(et $$0, bto $$1, int $$2, Collection<? extends bto> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(et $$0, bto $$1, int $$2, Collection<? extends bto> $$3, int $$4, jn<euv> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static cvp a(et $$0, jn<euv> $$1, cvp $$2) {
      arh $$3 = $$0.e();
      etk $$4 = new etk.a($$3).a(ewd.f, $$0.d()).b(ewd.a, $$0.f()).a(ewc.d);
      eth $$5 = new eth.a($$4).a(Optional.empty());
      $$5.b(eth.a($$1.a()));
      cvp $$6 = $$1.a().apply($$2, $$5);
      $$6.f($$6.k());
      return $$6;
   }

   private static cvp a(bto $$0, int $$1) throws CommandSyntaxException {
      bvb $$2 = $$0.a_($$1);
      if ($$2 == bvb.a) {
         throw d.create($$1);
      } else {
         return $$2.a().u();
      }
   }

   private static cvp a(et $$0, je $$1, int $$2) throws CommandSyntaxException {
      bri $$3 = a($$0, $$1, b);
      if ($$2 >= 0 && $$2 < $$3.b()) {
         return $$3.a($$2).u();
      } else {
         throw d.create($$2);
      }
   }
}
