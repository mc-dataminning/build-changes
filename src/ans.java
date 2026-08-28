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

public class ans {
   static final Dynamic3CommandExceptionType a = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> ww.b("commands.item.target.not_a_container", $$0, $$1, $$2)
   );
   static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> ww.b("commands.item.source.not_a_container", $$0, $$1, $$2)
   );
   static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> ww.b("commands.item.target.no_such_slot", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> ww.b("commands.item.source.no_such_slot", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> ww.b("commands.item.target.no_changes", $$0));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> ww.b("commands.item.target.no_changed.known_item", $$0, $$1)
   );
   private static final SuggestionProvider<ei> g = ($$0, $$1) -> {
      alo.a $$2 = ((ei)$$0.getSource()).l().bc();
      return en.a($$2.a(mg.bp), $$1);
   };

   public static void a(CommandDispatcher<ei> $$0, ee $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("item").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)ej.a("replace")
                        .then(
                           ej.a("block")
                              .then(
                                 ej.a("pos", gf.a())
                                    .then(
                                       ((RequiredArgumentBuilder)ej.a("slot", fr.a())
                                             .then(
                                                ej.a("with")
                                                   .then(
                                                      ((RequiredArgumentBuilder)ej.a("item", gs.a($$1))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ei)$$0x.getSource(),
                                                                     gf.a($$0x, "pos"),
                                                                     fr.a($$0x, "slot"),
                                                                     gs.a($$0x, "item").a(1, false)
                                                                  )
                                                            ))
                                                         .then(
                                                            ej.a("count", IntegerArgumentType.integer(1, 99))
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (ei)$$0x.getSource(),
                                                                        gf.a($$0x, "pos"),
                                                                        fr.a($$0x, "slot"),
                                                                        gs.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                     )
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)ej.a("from")
                                                   .then(
                                                      ej.a("block")
                                                         .then(
                                                            ej.a("source", gf.a())
                                                               .then(
                                                                  ((RequiredArgumentBuilder)ej.a("sourceSlot", fr.a())
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ei)$$0x.getSource(),
                                                                                 gf.a($$0x, "source"),
                                                                                 fr.a($$0x, "sourceSlot"),
                                                                                 gf.a($$0x, "pos"),
                                                                                 fr.a($$0x, "slot")
                                                                              )
                                                                        ))
                                                                     .then(
                                                                        ej.a("modifier", fk.b($$1))
                                                                           .suggests(g)
                                                                           .executes(
                                                                              $$0x -> a(
                                                                                    (ei)$$0x.getSource(),
                                                                                    gf.a($$0x, "source"),
                                                                                    fr.a($$0x, "sourceSlot"),
                                                                                    gf.a($$0x, "pos"),
                                                                                    fr.a($$0x, "slot"),
                                                                                    fk.b($$0x, "modifier")
                                                                                 )
                                                                           )
                                                                     )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   ej.a("entity")
                                                      .then(
                                                         ej.a("source", ev.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)ej.a("sourceSlot", fr.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ei)$$0x.getSource(),
                                                                              ev.a($$0x, "source"),
                                                                              fr.a($$0x, "sourceSlot"),
                                                                              gf.a($$0x, "pos"),
                                                                              fr.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     ej.a("modifier", fk.b($$1))
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ei)$$0x.getSource(),
                                                                                 ev.a($$0x, "source"),
                                                                                 fr.a($$0x, "sourceSlot"),
                                                                                 gf.a($$0x, "pos"),
                                                                                 fr.a($$0x, "slot"),
                                                                                 fk.b($$0x, "modifier")
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
                        ej.a("entity")
                           .then(
                              ej.a("targets", ev.b())
                                 .then(
                                    ((RequiredArgumentBuilder)ej.a("slot", fr.a())
                                          .then(
                                             ej.a("with")
                                                .then(
                                                   ((RequiredArgumentBuilder)ej.a("item", gs.a($$1))
                                                         .executes(
                                                            $$0x -> a(
                                                                  (ei)$$0x.getSource(),
                                                                  ev.b($$0x, "targets"),
                                                                  fr.a($$0x, "slot"),
                                                                  gs.a($$0x, "item").a(1, false)
                                                               )
                                                         ))
                                                      .then(
                                                         ej.a("count", IntegerArgumentType.integer(1, 99))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ei)$$0x.getSource(),
                                                                     ev.b($$0x, "targets"),
                                                                     fr.a($$0x, "slot"),
                                                                     gs.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                  )
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)ej.a("from")
                                                .then(
                                                   ej.a("block")
                                                      .then(
                                                         ej.a("source", gf.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)ej.a("sourceSlot", fr.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ei)$$0x.getSource(),
                                                                              gf.a($$0x, "source"),
                                                                              fr.a($$0x, "sourceSlot"),
                                                                              ev.b($$0x, "targets"),
                                                                              fr.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     ej.a("modifier", fk.b($$1))
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ei)$$0x.getSource(),
                                                                                 gf.a($$0x, "source"),
                                                                                 fr.a($$0x, "sourceSlot"),
                                                                                 ev.b($$0x, "targets"),
                                                                                 fr.a($$0x, "slot"),
                                                                                 fk.b($$0x, "modifier")
                                                                              )
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                ej.a("entity")
                                                   .then(
                                                      ej.a("source", ev.a())
                                                         .then(
                                                            ((RequiredArgumentBuilder)ej.a("sourceSlot", fr.a())
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (ei)$$0x.getSource(),
                                                                           ev.a($$0x, "source"),
                                                                           fr.a($$0x, "sourceSlot"),
                                                                           ev.b($$0x, "targets"),
                                                                           fr.a($$0x, "slot")
                                                                        )
                                                                  ))
                                                               .then(
                                                                  ej.a("modifier", fk.b($$1))
                                                                     .suggests(g)
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ei)$$0x.getSource(),
                                                                              ev.a($$0x, "source"),
                                                                              fr.a($$0x, "sourceSlot"),
                                                                              ev.b($$0x, "targets"),
                                                                              fr.a($$0x, "slot"),
                                                                              fk.b($$0x, "modifier")
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
               ((LiteralArgumentBuilder)ej.a("modify")
                     .then(
                        ej.a("block")
                           .then(
                              ej.a("pos", gf.a())
                                 .then(
                                    ej.a("slot", fr.a())
                                       .then(
                                          ej.a("modifier", fk.b($$1))
                                             .suggests(g)
                                             .executes($$0x -> a((ei)$$0x.getSource(), gf.a($$0x, "pos"), fr.a($$0x, "slot"), fk.b($$0x, "modifier")))
                                       )
                                 )
                           )
                     ))
                  .then(
                     ej.a("entity")
                        .then(
                           ej.a("targets", ev.b())
                              .then(
                                 ej.a("slot", fr.a())
                                    .then(
                                       ej.a("modifier", fk.b($$1))
                                          .suggests(g)
                                          .executes($$0x -> a((ei)$$0x.getSource(), ev.b($$0x, "targets"), fr.a($$0x, "slot"), fk.b($$0x, "modifier")))
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ei $$0, iu $$1, int $$2, je<fab> $$3) throws CommandSyntaxException {
      btr $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         cys $$5 = a($$0, $$3, $$4.a($$2));
         $$4.a($$2, $$5);
         $$0.a(() -> ww.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$5.K()), true);
         return 1;
      } else {
         throw c.create($$2);
      }
   }

   private static int a(ei $$0, Collection<? extends bwa> $$1, int $$2, je<fab> $$3) throws CommandSyntaxException {
      Map<bwa, cys> $$4 = Maps.newHashMapWithExpectedSize($$1.size());

      for (bwa $$5 : $$1) {
         bxq $$6 = $$5.a_($$2);
         if ($$6 != bxq.a) {
            cys $$7 = a($$0, $$3, $$6.a().v());
            if ($$6.a($$7)) {
               $$4.put($$5, $$7);
               if ($$5 instanceof arp) {
                  ((arp)$$5).bQ.d();
               }
            }
         }
      }

      if ($$4.isEmpty()) {
         throw e.create($$2);
      } else {
         if ($$4.size() == 1) {
            Entry<bwa, cys> $$8 = $$4.entrySet().iterator().next();
            $$0.a(() -> ww.a("commands.item.entity.set.success.single", $$8.getKey().m_(), $$8.getValue().K()), true);
         } else {
            $$0.a(() -> ww.a("commands.item.entity.set.success.multiple", $$4.size()), true);
         }

         return $$4.size();
      }
   }

   private static int a(ei $$0, iu $$1, int $$2, cys $$3) throws CommandSyntaxException {
      btr $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         $$4.a($$2, $$3);
         $$0.a(() -> ww.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$3.K()), true);
         return 1;
      } else {
         throw c.create($$2);
      }
   }

   static btr a(ei $$0, iu $$1, Dynamic3CommandExceptionType $$2) throws CommandSyntaxException {
      dwn $$3 = $$0.e().c_($$1);
      if (!($$3 instanceof btr)) {
         throw $$2.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (btr)$$3;
      }
   }

   private static int a(ei $$0, Collection<? extends bwa> $$1, int $$2, cys $$3) throws CommandSyntaxException {
      List<bwa> $$4 = Lists.newArrayListWithCapacity($$1.size());

      for (bwa $$5 : $$1) {
         bxq $$6 = $$5.a_($$2);
         if ($$6 != bxq.a && $$6.a($$3.v())) {
            $$4.add($$5);
            if ($$5 instanceof arp) {
               ((arp)$$5).bQ.d();
            }
         }
      }

      if ($$4.isEmpty()) {
         throw f.create($$3.K(), $$2);
      } else {
         if ($$4.size() == 1) {
            $$0.a(() -> ww.a("commands.item.entity.set.success.single", $$4.iterator().next().m_(), $$3.K()), true);
         } else {
            $$0.a(() -> ww.a("commands.item.entity.set.success.multiple", $$4.size(), $$3.K()), true);
         }

         return $$4.size();
      }
   }

   private static int a(ei $$0, iu $$1, int $$2, Collection<? extends bwa> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(ei $$0, iu $$1, int $$2, Collection<? extends bwa> $$3, int $$4, je<fab> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(ei $$0, iu $$1, int $$2, iu $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(ei $$0, iu $$1, int $$2, iu $$3, int $$4, je<fab> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(ei $$0, bwa $$1, int $$2, iu $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(ei $$0, bwa $$1, int $$2, iu $$3, int $$4, je<fab> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static int a(ei $$0, bwa $$1, int $$2, Collection<? extends bwa> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(ei $$0, bwa $$1, int $$2, Collection<? extends bwa> $$3, int $$4, je<fab> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static cys a(ei $$0, je<fab> $$1, cys $$2) {
      aro $$3 = $$0.e();
      eyq $$4 = new eyq.a($$3).a(fbh.f, $$0.d()).b(fbh.a, $$0.f()).a(fbg.d);
      eyn $$5 = new eyn.a($$4).a(Optional.empty());
      $$5.b(eyn.a($$1.a()));
      cys $$6 = $$1.a().apply($$2, $$5);
      $$6.f($$6.k());
      return $$6;
   }

   private static cys a(bwa $$0, int $$1) throws CommandSyntaxException {
      bxq $$2 = $$0.a_($$1);
      if ($$2 == bxq.a) {
         throw d.create($$1);
      } else {
         return $$2.a().v();
      }
   }

   private static cys a(ei $$0, iu $$1, int $$2) throws CommandSyntaxException {
      btr $$3 = a($$0, $$1, b);
      if ($$2 >= 0 && $$2 < $$3.b()) {
         return $$3.a($$2).v();
      } else {
         throw d.create($$2);
      }
   }
}
