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

public class ali {
   static final Dynamic3CommandExceptionType a = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> vq.b("commands.item.target.not_a_container", $$0, $$1, $$2)
   );
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> vq.b("commands.item.source.not_a_container", $$0, $$1, $$2)
   );
   static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vq.b("commands.item.target.no_such_slot", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> vq.b("commands.item.source.no_such_slot", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> vq.b("commands.item.target.no_changes", $$0));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> vq.b("commands.item.target.no_changed.known_item", $$0, $$1)
   );
   private static final SuggestionProvider<du> g = ($$0, $$1) -> {
      ejf $$2 = ((du)$$0.getSource()).l().aL();
      return dz.a($$2.a(ejh.b), $$1);
   };

   public static void a(CommandDispatcher<du> $$0, dq $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("item").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)dv.a("replace")
                        .then(
                           dv.a("block")
                              .then(
                                 dv.a("pos", fo.a())
                                    .then(
                                       ((RequiredArgumentBuilder)dv.a("slot", fb.a())
                                             .then(
                                                dv.a("with")
                                                   .then(
                                                      ((RequiredArgumentBuilder)dv.a("item", ga.a($$1))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (du)$$0x.getSource(),
                                                                     fo.a($$0x, "pos"),
                                                                     fb.a($$0x, "slot"),
                                                                     ga.a($$0x, "item").a(1, false)
                                                                  )
                                                            ))
                                                         .then(
                                                            dv.a("count", IntegerArgumentType.integer(1, 64))
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (du)$$0x.getSource(),
                                                                        fo.a($$0x, "pos"),
                                                                        fb.a($$0x, "slot"),
                                                                        ga.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                     )
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)dv.a("from")
                                                   .then(
                                                      dv.a("block")
                                                         .then(
                                                            dv.a("source", fo.a())
                                                               .then(
                                                                  ((RequiredArgumentBuilder)dv.a("sourceSlot", fb.a())
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (du)$$0x.getSource(),
                                                                                 fo.a($$0x, "source"),
                                                                                 fb.a($$0x, "sourceSlot"),
                                                                                 fo.a($$0x, "pos"),
                                                                                 fb.a($$0x, "slot")
                                                                              )
                                                                        ))
                                                                     .then(
                                                                        dv.a("modifier", ev.a())
                                                                           .suggests(g)
                                                                           .executes(
                                                                              $$0x -> a(
                                                                                    (du)$$0x.getSource(),
                                                                                    fo.a($$0x, "source"),
                                                                                    fb.a($$0x, "sourceSlot"),
                                                                                    fo.a($$0x, "pos"),
                                                                                    fb.a($$0x, "slot"),
                                                                                    ev.d($$0x, "modifier")
                                                                                 )
                                                                           )
                                                                     )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   dv.a("entity")
                                                      .then(
                                                         dv.a("source", eh.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)dv.a("sourceSlot", fb.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (du)$$0x.getSource(),
                                                                              eh.a($$0x, "source"),
                                                                              fb.a($$0x, "sourceSlot"),
                                                                              fo.a($$0x, "pos"),
                                                                              fb.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     dv.a("modifier", ev.a())
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (du)$$0x.getSource(),
                                                                                 eh.a($$0x, "source"),
                                                                                 fb.a($$0x, "sourceSlot"),
                                                                                 fo.a($$0x, "pos"),
                                                                                 fb.a($$0x, "slot"),
                                                                                 ev.d($$0x, "modifier")
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
                        dv.a("entity")
                           .then(
                              dv.a("targets", eh.b())
                                 .then(
                                    ((RequiredArgumentBuilder)dv.a("slot", fb.a())
                                          .then(
                                             dv.a("with")
                                                .then(
                                                   ((RequiredArgumentBuilder)dv.a("item", ga.a($$1))
                                                         .executes(
                                                            $$0x -> a(
                                                                  (du)$$0x.getSource(),
                                                                  eh.b($$0x, "targets"),
                                                                  fb.a($$0x, "slot"),
                                                                  ga.a($$0x, "item").a(1, false)
                                                               )
                                                         ))
                                                      .then(
                                                         dv.a("count", IntegerArgumentType.integer(1, 64))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (du)$$0x.getSource(),
                                                                     eh.b($$0x, "targets"),
                                                                     fb.a($$0x, "slot"),
                                                                     ga.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                  )
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)dv.a("from")
                                                .then(
                                                   dv.a("block")
                                                      .then(
                                                         dv.a("source", fo.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)dv.a("sourceSlot", fb.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (du)$$0x.getSource(),
                                                                              fo.a($$0x, "source"),
                                                                              fb.a($$0x, "sourceSlot"),
                                                                              eh.b($$0x, "targets"),
                                                                              fb.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     dv.a("modifier", ev.a())
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (du)$$0x.getSource(),
                                                                                 fo.a($$0x, "source"),
                                                                                 fb.a($$0x, "sourceSlot"),
                                                                                 eh.b($$0x, "targets"),
                                                                                 fb.a($$0x, "slot"),
                                                                                 ev.d($$0x, "modifier")
                                                                              )
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                dv.a("entity")
                                                   .then(
                                                      dv.a("source", eh.a())
                                                         .then(
                                                            ((RequiredArgumentBuilder)dv.a("sourceSlot", fb.a())
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (du)$$0x.getSource(),
                                                                           eh.a($$0x, "source"),
                                                                           fb.a($$0x, "sourceSlot"),
                                                                           eh.b($$0x, "targets"),
                                                                           fb.a($$0x, "slot")
                                                                        )
                                                                  ))
                                                               .then(
                                                                  dv.a("modifier", ev.a())
                                                                     .suggests(g)
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (du)$$0x.getSource(),
                                                                              eh.a($$0x, "source"),
                                                                              fb.a($$0x, "sourceSlot"),
                                                                              eh.b($$0x, "targets"),
                                                                              fb.a($$0x, "slot"),
                                                                              ev.d($$0x, "modifier")
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
               ((LiteralArgumentBuilder)dv.a("modify")
                     .then(
                        dv.a("block")
                           .then(
                              dv.a("pos", fo.a())
                                 .then(
                                    dv.a("slot", fb.a())
                                       .then(
                                          dv.a("modifier", ev.a())
                                             .suggests(g)
                                             .executes($$0x -> a((du)$$0x.getSource(), fo.a($$0x, "pos"), fb.a($$0x, "slot"), ev.d($$0x, "modifier")))
                                       )
                                 )
                           )
                     ))
                  .then(
                     dv.a("entity")
                        .then(
                           dv.a("targets", eh.b())
                              .then(
                                 dv.a("slot", fb.a())
                                    .then(
                                       dv.a("modifier", ev.a())
                                          .suggests(g)
                                          .executes($$0x -> a((du)$$0x.getSource(), eh.b($$0x, "targets"), fb.a($$0x, "slot"), ev.d($$0x, "modifier")))
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(du $$0, hz $$1, int $$2, ekp $$3) throws CommandSyntaxException {
      blp $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         cpd $$5 = a($$0, $$3, $$4.a($$2));
         $$4.a($$2, $$5);
         $$0.a(() -> vq.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$5.K()), true);
         return 1;
      } else {
         throw b.create($$2);
      }
   }

   private static int a(du $$0, Collection<? extends bnq> $$1, int $$2, ekp $$3) throws CommandSyntaxException {
      Map<bnq, cpd> $$4 = Maps.newHashMapWithExpectedSize($$1.size());

      for (bnq $$5 : $$1) {
         boz $$6 = $$5.a_($$2);
         if ($$6 != boz.b) {
            cpd $$7 = a($$0, $$3, $$6.a().q());
            if ($$6.a($$7)) {
               $$4.put($$5, $$7);
               if ($$5 instanceof aox) {
                  ((aox)$$5).bW.d();
               }
            }
         }
      }

      if ($$4.isEmpty()) {
         throw e.create($$2);
      } else {
         if ($$4.size() == 1) {
            Entry<bnq, cpd> $$8 = $$4.entrySet().iterator().next();
            $$0.a(() -> vq.a("commands.item.entity.set.success.single", $$8.getKey().Q_(), $$8.getValue().K()), true);
         } else {
            $$0.a(() -> vq.a("commands.item.entity.set.success.multiple", $$4.size()), true);
         }

         return $$4.size();
      }
   }

   private static int a(du $$0, hz $$1, int $$2, cpd $$3) throws CommandSyntaxException {
      blp $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         $$4.a($$2, $$3);
         $$0.a(() -> vq.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$3.K()), true);
         return 1;
      } else {
         throw b.create($$2);
      }
   }

   private static blp a(du $$0, hz $$1, Dynamic3CommandExceptionType $$2) throws CommandSyntaxException {
      dix $$3 = $$0.e().c_($$1);
      if (!($$3 instanceof blp)) {
         throw $$2.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (blp)$$3;
      }
   }

   private static int a(du $$0, Collection<? extends bnq> $$1, int $$2, cpd $$3) throws CommandSyntaxException {
      List<bnq> $$4 = Lists.newArrayListWithCapacity($$1.size());

      for (bnq $$5 : $$1) {
         boz $$6 = $$5.a_($$2);
         if ($$6 != boz.b && $$6.a($$3.q())) {
            $$4.add($$5);
            if ($$5 instanceof aox) {
               ((aox)$$5).bW.d();
            }
         }
      }

      if ($$4.isEmpty()) {
         throw f.create($$3.K(), $$2);
      } else {
         if ($$4.size() == 1) {
            $$0.a(() -> vq.a("commands.item.entity.set.success.single", $$4.iterator().next().Q_(), $$3.K()), true);
         } else {
            $$0.a(() -> vq.a("commands.item.entity.set.success.multiple", $$4.size(), $$3.K()), true);
         }

         return $$4.size();
      }
   }

   private static int a(du $$0, hz $$1, int $$2, Collection<? extends bnq> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(du $$0, hz $$1, int $$2, Collection<? extends bnq> $$3, int $$4, ekp $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(du $$0, hz $$1, int $$2, hz $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(du $$0, hz $$1, int $$2, hz $$3, int $$4, ekp $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(du $$0, bnq $$1, int $$2, hz $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(du $$0, bnq $$1, int $$2, hz $$3, int $$4, ekp $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static int a(du $$0, bnq $$1, int $$2, Collection<? extends bnq> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(du $$0, bnq $$1, int $$2, Collection<? extends bnq> $$3, int $$4, ekp $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static cpd a(du $$0, ekp $$1, cpd $$2) {
      aow $$3 = $$0.e();
      eji $$4 = new eji.a($$3).a(eln.f, $$0.d()).b(eln.a, $$0.f()).a(elm.d);
      ejc $$5 = new ejc.a($$4).a(Optional.empty());
      $$5.b(ejc.a($$1));
      return $$1.apply($$2, $$5);
   }

   private static cpd a(bnq $$0, int $$1) throws CommandSyntaxException {
      boz $$2 = $$0.a_($$1);
      if ($$2 == boz.b) {
         throw d.create($$1);
      } else {
         return $$2.a().q();
      }
   }

   private static cpd a(du $$0, hz $$1, int $$2) throws CommandSyntaxException {
      blp $$3 = a($$0, $$1, c);
      if ($$2 >= 0 && $$2 < $$3.b()) {
         return $$3.a($$2).q();
      } else {
         throw d.create($$2);
      }
   }
}
