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

public class anu {
   static final Dynamic3CommandExceptionType a = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xh.b("commands.item.target.not_a_container", $$0, $$1, $$2)
   );
   static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xh.b("commands.item.source.not_a_container", $$0, $$1, $$2)
   );
   static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xh.b("commands.item.target.no_such_slot", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xh.b("commands.item.source.no_such_slot", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xh.b("commands.item.target.no_changes", $$0));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xh.b("commands.item.target.no_changed.known_item", $$0, $$1)
   );
   private static final SuggestionProvider<ev> g = ($$0, $$1) -> {
      alr.a $$2 = ((ev)$$0.getSource()).l().bd();
      return fa.a($$2.a(ly.be), $$1);
   };

   public static void a(CommandDispatcher<ev> $$0, er $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("item").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)ew.a("replace")
                        .then(
                           ew.a("block")
                              .then(
                                 ew.a("pos", gr.a())
                                    .then(
                                       ((RequiredArgumentBuilder)ew.a("slot", gd.a())
                                             .then(
                                                ew.a("with")
                                                   .then(
                                                      ((RequiredArgumentBuilder)ew.a("item", he.a($$1))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ev)$$0x.getSource(),
                                                                     gr.a($$0x, "pos"),
                                                                     gd.a($$0x, "slot"),
                                                                     he.a($$0x, "item").a(1, false)
                                                                  )
                                                            ))
                                                         .then(
                                                            ew.a("count", IntegerArgumentType.integer(1, 99))
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (ev)$$0x.getSource(),
                                                                        gr.a($$0x, "pos"),
                                                                        gd.a($$0x, "slot"),
                                                                        he.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                     )
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)ew.a("from")
                                                   .then(
                                                      ew.a("block")
                                                         .then(
                                                            ew.a("source", gr.a())
                                                               .then(
                                                                  ((RequiredArgumentBuilder)ew.a("sourceSlot", gd.a())
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ev)$$0x.getSource(),
                                                                                 gr.a($$0x, "source"),
                                                                                 gd.a($$0x, "sourceSlot"),
                                                                                 gr.a($$0x, "pos"),
                                                                                 gd.a($$0x, "slot")
                                                                              )
                                                                        ))
                                                                     .then(
                                                                        ew.a("modifier", fx.b($$1))
                                                                           .suggests(g)
                                                                           .executes(
                                                                              $$0x -> a(
                                                                                    (ev)$$0x.getSource(),
                                                                                    gr.a($$0x, "source"),
                                                                                    gd.a($$0x, "sourceSlot"),
                                                                                    gr.a($$0x, "pos"),
                                                                                    gd.a($$0x, "slot"),
                                                                                    fx.b($$0x, "modifier")
                                                                                 )
                                                                           )
                                                                     )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   ew.a("entity")
                                                      .then(
                                                         ew.a("source", fi.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)ew.a("sourceSlot", gd.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ev)$$0x.getSource(),
                                                                              fi.a($$0x, "source"),
                                                                              gd.a($$0x, "sourceSlot"),
                                                                              gr.a($$0x, "pos"),
                                                                              gd.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     ew.a("modifier", fx.b($$1))
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ev)$$0x.getSource(),
                                                                                 fi.a($$0x, "source"),
                                                                                 gd.a($$0x, "sourceSlot"),
                                                                                 gr.a($$0x, "pos"),
                                                                                 gd.a($$0x, "slot"),
                                                                                 fx.b($$0x, "modifier")
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
                        ew.a("entity")
                           .then(
                              ew.a("targets", fi.b())
                                 .then(
                                    ((RequiredArgumentBuilder)ew.a("slot", gd.a())
                                          .then(
                                             ew.a("with")
                                                .then(
                                                   ((RequiredArgumentBuilder)ew.a("item", he.a($$1))
                                                         .executes(
                                                            $$0x -> a(
                                                                  (ev)$$0x.getSource(),
                                                                  fi.b($$0x, "targets"),
                                                                  gd.a($$0x, "slot"),
                                                                  he.a($$0x, "item").a(1, false)
                                                               )
                                                         ))
                                                      .then(
                                                         ew.a("count", IntegerArgumentType.integer(1, 99))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ev)$$0x.getSource(),
                                                                     fi.b($$0x, "targets"),
                                                                     gd.a($$0x, "slot"),
                                                                     he.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                  )
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)ew.a("from")
                                                .then(
                                                   ew.a("block")
                                                      .then(
                                                         ew.a("source", gr.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)ew.a("sourceSlot", gd.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ev)$$0x.getSource(),
                                                                              gr.a($$0x, "source"),
                                                                              gd.a($$0x, "sourceSlot"),
                                                                              fi.b($$0x, "targets"),
                                                                              gd.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     ew.a("modifier", fx.b($$1))
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ev)$$0x.getSource(),
                                                                                 gr.a($$0x, "source"),
                                                                                 gd.a($$0x, "sourceSlot"),
                                                                                 fi.b($$0x, "targets"),
                                                                                 gd.a($$0x, "slot"),
                                                                                 fx.b($$0x, "modifier")
                                                                              )
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                ew.a("entity")
                                                   .then(
                                                      ew.a("source", fi.a())
                                                         .then(
                                                            ((RequiredArgumentBuilder)ew.a("sourceSlot", gd.a())
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (ev)$$0x.getSource(),
                                                                           fi.a($$0x, "source"),
                                                                           gd.a($$0x, "sourceSlot"),
                                                                           fi.b($$0x, "targets"),
                                                                           gd.a($$0x, "slot")
                                                                        )
                                                                  ))
                                                               .then(
                                                                  ew.a("modifier", fx.b($$1))
                                                                     .suggests(g)
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ev)$$0x.getSource(),
                                                                              fi.a($$0x, "source"),
                                                                              gd.a($$0x, "sourceSlot"),
                                                                              fi.b($$0x, "targets"),
                                                                              gd.a($$0x, "slot"),
                                                                              fx.b($$0x, "modifier")
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
               ((LiteralArgumentBuilder)ew.a("modify")
                     .then(
                        ew.a("block")
                           .then(
                              ew.a("pos", gr.a())
                                 .then(
                                    ew.a("slot", gd.a())
                                       .then(
                                          ew.a("modifier", fx.b($$1))
                                             .suggests(g)
                                             .executes($$0x -> a((ev)$$0x.getSource(), gr.a($$0x, "pos"), gd.a($$0x, "slot"), fx.b($$0x, "modifier")))
                                       )
                                 )
                           )
                     ))
                  .then(
                     ew.a("entity")
                        .then(
                           ew.a("targets", fi.b())
                              .then(
                                 ew.a("slot", gd.a())
                                    .then(
                                       ew.a("modifier", fx.b($$1))
                                          .suggests(g)
                                          .executes($$0x -> a((ev)$$0x.getSource(), fi.b($$0x, "targets"), gd.a($$0x, "slot"), fx.b($$0x, "modifier")))
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ev $$0, jg $$1, int $$2, jp<evk> $$3) throws CommandSyntaxException {
      brr $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         cvx $$5 = a($$0, $$3, $$4.a($$2));
         $$4.a($$2, $$5);
         $$0.a(() -> xh.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$5.J()), true);
         return 1;
      } else {
         throw c.create($$2);
      }
   }

   private static int a(ev $$0, Collection<? extends btz> $$1, int $$2, jp<evk> $$3) throws CommandSyntaxException {
      Map<btz, cvx> $$4 = Maps.newHashMapWithExpectedSize($$1.size());

      for (btz $$5 : $$1) {
         bvn $$6 = $$5.a_($$2);
         if ($$6 != bvn.a) {
            cvx $$7 = a($$0, $$3, $$6.a().v());
            if ($$6.a($$7)) {
               $$4.put($$5, $$7);
               if ($$5 instanceof arn) {
                  ((arn)$$5).ca.d();
               }
            }
         }
      }

      if ($$4.isEmpty()) {
         throw e.create($$2);
      } else {
         if ($$4.size() == 1) {
            Entry<btz, cvx> $$8 = $$4.entrySet().iterator().next();
            $$0.a(() -> xh.a("commands.item.entity.set.success.single", $$8.getKey().S_(), $$8.getValue().J()), true);
         } else {
            $$0.a(() -> xh.a("commands.item.entity.set.success.multiple", $$4.size()), true);
         }

         return $$4.size();
      }
   }

   private static int a(ev $$0, jg $$1, int $$2, cvx $$3) throws CommandSyntaxException {
      brr $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         $$4.a($$2, $$3);
         $$0.a(() -> xh.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$3.J()), true);
         return 1;
      } else {
         throw c.create($$2);
      }
   }

   static brr a(ev $$0, jg $$1, Dynamic3CommandExceptionType $$2) throws CommandSyntaxException {
      dsg $$3 = $$0.e().c_($$1);
      if (!($$3 instanceof brr)) {
         throw $$2.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (brr)$$3;
      }
   }

   private static int a(ev $$0, Collection<? extends btz> $$1, int $$2, cvx $$3) throws CommandSyntaxException {
      List<btz> $$4 = Lists.newArrayListWithCapacity($$1.size());

      for (btz $$5 : $$1) {
         bvn $$6 = $$5.a_($$2);
         if ($$6 != bvn.a && $$6.a($$3.v())) {
            $$4.add($$5);
            if ($$5 instanceof arn) {
               ((arn)$$5).ca.d();
            }
         }
      }

      if ($$4.isEmpty()) {
         throw f.create($$3.J(), $$2);
      } else {
         if ($$4.size() == 1) {
            $$0.a(() -> xh.a("commands.item.entity.set.success.single", $$4.iterator().next().S_(), $$3.J()), true);
         } else {
            $$0.a(() -> xh.a("commands.item.entity.set.success.multiple", $$4.size(), $$3.J()), true);
         }

         return $$4.size();
      }
   }

   private static int a(ev $$0, jg $$1, int $$2, Collection<? extends btz> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(ev $$0, jg $$1, int $$2, Collection<? extends btz> $$3, int $$4, jp<evk> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(ev $$0, jg $$1, int $$2, jg $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(ev $$0, jg $$1, int $$2, jg $$3, int $$4, jp<evk> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(ev $$0, btz $$1, int $$2, jg $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(ev $$0, btz $$1, int $$2, jg $$3, int $$4, jp<evk> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static int a(ev $$0, btz $$1, int $$2, Collection<? extends btz> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(ev $$0, btz $$1, int $$2, Collection<? extends btz> $$3, int $$4, jp<evk> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static cvx a(ev $$0, jp<evk> $$1, cvx $$2) {
      arm $$3 = $$0.e();
      etz $$4 = new etz.a($$3).a(ews.f, $$0.d()).b(ews.a, $$0.f()).a(ewr.d);
      etw $$5 = new etw.a($$4).a(Optional.empty());
      $$5.b(etw.a($$1.a()));
      cvx $$6 = $$1.a().apply($$2, $$5);
      $$6.f($$6.k());
      return $$6;
   }

   private static cvx a(btz $$0, int $$1) throws CommandSyntaxException {
      bvn $$2 = $$0.a_($$1);
      if ($$2 == bvn.a) {
         throw d.create($$1);
      } else {
         return $$2.a().v();
      }
   }

   private static cvx a(ev $$0, jg $$1, int $$2) throws CommandSyntaxException {
      brr $$3 = a($$0, $$1, b);
      if ($$2 >= 0 && $$2 < $$3.b()) {
         return $$3.a($$2).v();
      } else {
         throw d.create($$2);
      }
   }
}
