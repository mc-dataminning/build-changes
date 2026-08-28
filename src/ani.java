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

public class ani {
   static final Dynamic3CommandExceptionType a = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wp.b("commands.item.target.not_a_container", $$0, $$1, $$2)
   );
   static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wp.b("commands.item.source.not_a_container", $$0, $$1, $$2)
   );
   static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wp.b("commands.item.target.no_such_slot", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wp.b("commands.item.source.no_such_slot", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> wp.b("commands.item.target.no_changes", $$0));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> wp.b("commands.item.target.no_changed.known_item", $$0, $$1)
   );
   private static final SuggestionProvider<ex> g = ($$0, $$1) -> {
      alf.a $$2 = ((ex)$$0.getSource()).l().bc();
      return fc.a($$2.a(mc.bh), $$1);
   };

   public static void a(CommandDispatcher<ex> $$0, et $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("item").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)ey.a("replace")
                        .then(
                           ey.a("block")
                              .then(
                                 ey.a("pos", gt.a())
                                    .then(
                                       ((RequiredArgumentBuilder)ey.a("slot", gf.a())
                                             .then(
                                                ey.a("with")
                                                   .then(
                                                      ((RequiredArgumentBuilder)ey.a("item", hg.a($$1))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ex)$$0x.getSource(),
                                                                     gt.a($$0x, "pos"),
                                                                     gf.a($$0x, "slot"),
                                                                     hg.a($$0x, "item").a(1, false)
                                                                  )
                                                            ))
                                                         .then(
                                                            ey.a("count", IntegerArgumentType.integer(1, 99))
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (ex)$$0x.getSource(),
                                                                        gt.a($$0x, "pos"),
                                                                        gf.a($$0x, "slot"),
                                                                        hg.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                     )
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)ey.a("from")
                                                   .then(
                                                      ey.a("block")
                                                         .then(
                                                            ey.a("source", gt.a())
                                                               .then(
                                                                  ((RequiredArgumentBuilder)ey.a("sourceSlot", gf.a())
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ex)$$0x.getSource(),
                                                                                 gt.a($$0x, "source"),
                                                                                 gf.a($$0x, "sourceSlot"),
                                                                                 gt.a($$0x, "pos"),
                                                                                 gf.a($$0x, "slot")
                                                                              )
                                                                        ))
                                                                     .then(
                                                                        ey.a("modifier", fz.b($$1))
                                                                           .suggests(g)
                                                                           .executes(
                                                                              $$0x -> a(
                                                                                    (ex)$$0x.getSource(),
                                                                                    gt.a($$0x, "source"),
                                                                                    gf.a($$0x, "sourceSlot"),
                                                                                    gt.a($$0x, "pos"),
                                                                                    gf.a($$0x, "slot"),
                                                                                    fz.b($$0x, "modifier")
                                                                                 )
                                                                           )
                                                                     )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   ey.a("entity")
                                                      .then(
                                                         ey.a("source", fk.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)ey.a("sourceSlot", gf.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ex)$$0x.getSource(),
                                                                              fk.a($$0x, "source"),
                                                                              gf.a($$0x, "sourceSlot"),
                                                                              gt.a($$0x, "pos"),
                                                                              gf.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     ey.a("modifier", fz.b($$1))
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ex)$$0x.getSource(),
                                                                                 fk.a($$0x, "source"),
                                                                                 gf.a($$0x, "sourceSlot"),
                                                                                 gt.a($$0x, "pos"),
                                                                                 gf.a($$0x, "slot"),
                                                                                 fz.b($$0x, "modifier")
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
                        ey.a("entity")
                           .then(
                              ey.a("targets", fk.b())
                                 .then(
                                    ((RequiredArgumentBuilder)ey.a("slot", gf.a())
                                          .then(
                                             ey.a("with")
                                                .then(
                                                   ((RequiredArgumentBuilder)ey.a("item", hg.a($$1))
                                                         .executes(
                                                            $$0x -> a(
                                                                  (ex)$$0x.getSource(),
                                                                  fk.b($$0x, "targets"),
                                                                  gf.a($$0x, "slot"),
                                                                  hg.a($$0x, "item").a(1, false)
                                                               )
                                                         ))
                                                      .then(
                                                         ey.a("count", IntegerArgumentType.integer(1, 99))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ex)$$0x.getSource(),
                                                                     fk.b($$0x, "targets"),
                                                                     gf.a($$0x, "slot"),
                                                                     hg.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                  )
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)ey.a("from")
                                                .then(
                                                   ey.a("block")
                                                      .then(
                                                         ey.a("source", gt.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)ey.a("sourceSlot", gf.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ex)$$0x.getSource(),
                                                                              gt.a($$0x, "source"),
                                                                              gf.a($$0x, "sourceSlot"),
                                                                              fk.b($$0x, "targets"),
                                                                              gf.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     ey.a("modifier", fz.b($$1))
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ex)$$0x.getSource(),
                                                                                 gt.a($$0x, "source"),
                                                                                 gf.a($$0x, "sourceSlot"),
                                                                                 fk.b($$0x, "targets"),
                                                                                 gf.a($$0x, "slot"),
                                                                                 fz.b($$0x, "modifier")
                                                                              )
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                ey.a("entity")
                                                   .then(
                                                      ey.a("source", fk.a())
                                                         .then(
                                                            ((RequiredArgumentBuilder)ey.a("sourceSlot", gf.a())
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (ex)$$0x.getSource(),
                                                                           fk.a($$0x, "source"),
                                                                           gf.a($$0x, "sourceSlot"),
                                                                           fk.b($$0x, "targets"),
                                                                           gf.a($$0x, "slot")
                                                                        )
                                                                  ))
                                                               .then(
                                                                  ey.a("modifier", fz.b($$1))
                                                                     .suggests(g)
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ex)$$0x.getSource(),
                                                                              fk.a($$0x, "source"),
                                                                              gf.a($$0x, "sourceSlot"),
                                                                              fk.b($$0x, "targets"),
                                                                              gf.a($$0x, "slot"),
                                                                              fz.b($$0x, "modifier")
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
               ((LiteralArgumentBuilder)ey.a("modify")
                     .then(
                        ey.a("block")
                           .then(
                              ey.a("pos", gt.a())
                                 .then(
                                    ey.a("slot", gf.a())
                                       .then(
                                          ey.a("modifier", fz.b($$1))
                                             .suggests(g)
                                             .executes($$0x -> a((ex)$$0x.getSource(), gt.a($$0x, "pos"), gf.a($$0x, "slot"), fz.b($$0x, "modifier")))
                                       )
                                 )
                           )
                     ))
                  .then(
                     ey.a("entity")
                        .then(
                           ey.a("targets", fk.b())
                              .then(
                                 ey.a("slot", gf.a())
                                    .then(
                                       ey.a("modifier", fz.b($$1))
                                          .suggests(g)
                                          .executes($$0x -> a((ex)$$0x.getSource(), fk.b($$0x, "targets"), gf.a($$0x, "slot"), fz.b($$0x, "modifier")))
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ex $$0, ji $$1, int $$2, jr<exf> $$3) throws CommandSyntaxException {
      bsd $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         cwp $$5 = a($$0, $$3, $$4.a($$2));
         $$4.a($$2, $$5);
         $$0.a(() -> wp.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$5.K()), true);
         return 1;
      } else {
         throw c.create($$2);
      }
   }

   private static int a(ex $$0, Collection<? extends bul> $$1, int $$2, jr<exf> $$3) throws CommandSyntaxException {
      Map<bul, cwp> $$4 = Maps.newHashMapWithExpectedSize($$1.size());

      for (bul $$5 : $$1) {
         bvz $$6 = $$5.a_($$2);
         if ($$6 != bvz.a) {
            cwp $$7 = a($$0, $$3, $$6.a().v());
            if ($$6.a($$7)) {
               $$4.put($$5, $$7);
               if ($$5 instanceof are) {
                  ((are)$$5).cd.d();
               }
            }
         }
      }

      if ($$4.isEmpty()) {
         throw e.create($$2);
      } else {
         if ($$4.size() == 1) {
            Entry<bul, cwp> $$8 = $$4.entrySet().iterator().next();
            $$0.a(() -> wp.a("commands.item.entity.set.success.single", $$8.getKey().p_(), $$8.getValue().K()), true);
         } else {
            $$0.a(() -> wp.a("commands.item.entity.set.success.multiple", $$4.size()), true);
         }

         return $$4.size();
      }
   }

   private static int a(ex $$0, ji $$1, int $$2, cwp $$3) throws CommandSyntaxException {
      bsd $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         $$4.a($$2, $$3);
         $$0.a(() -> wp.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$3.K()), true);
         return 1;
      } else {
         throw c.create($$2);
      }
   }

   static bsd a(ex $$0, ji $$1, Dynamic3CommandExceptionType $$2) throws CommandSyntaxException {
      dtz $$3 = $$0.e().c_($$1);
      if (!($$3 instanceof bsd)) {
         throw $$2.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bsd)$$3;
      }
   }

   private static int a(ex $$0, Collection<? extends bul> $$1, int $$2, cwp $$3) throws CommandSyntaxException {
      List<bul> $$4 = Lists.newArrayListWithCapacity($$1.size());

      for (bul $$5 : $$1) {
         bvz $$6 = $$5.a_($$2);
         if ($$6 != bvz.a && $$6.a($$3.v())) {
            $$4.add($$5);
            if ($$5 instanceof are) {
               ((are)$$5).cd.d();
            }
         }
      }

      if ($$4.isEmpty()) {
         throw f.create($$3.K(), $$2);
      } else {
         if ($$4.size() == 1) {
            $$0.a(() -> wp.a("commands.item.entity.set.success.single", $$4.iterator().next().p_(), $$3.K()), true);
         } else {
            $$0.a(() -> wp.a("commands.item.entity.set.success.multiple", $$4.size(), $$3.K()), true);
         }

         return $$4.size();
      }
   }

   private static int a(ex $$0, ji $$1, int $$2, Collection<? extends bul> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(ex $$0, ji $$1, int $$2, Collection<? extends bul> $$3, int $$4, jr<exf> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(ex $$0, ji $$1, int $$2, ji $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(ex $$0, ji $$1, int $$2, ji $$3, int $$4, jr<exf> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(ex $$0, bul $$1, int $$2, ji $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(ex $$0, bul $$1, int $$2, ji $$3, int $$4, jr<exf> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static int a(ex $$0, bul $$1, int $$2, Collection<? extends bul> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(ex $$0, bul $$1, int $$2, Collection<? extends bul> $$3, int $$4, jr<exf> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static cwp a(ex $$0, jr<exf> $$1, cwp $$2) {
      ard $$3 = $$0.e();
      evu $$4 = new evu.a($$3).a(eyl.f, $$0.d()).b(eyl.a, $$0.f()).a(eyk.d);
      evr $$5 = new evr.a($$4).a(Optional.empty());
      $$5.b(evr.a($$1.a()));
      cwp $$6 = $$1.a().apply($$2, $$5);
      $$6.f($$6.k());
      return $$6;
   }

   private static cwp a(bul $$0, int $$1) throws CommandSyntaxException {
      bvz $$2 = $$0.a_($$1);
      if ($$2 == bvz.a) {
         throw d.create($$1);
      } else {
         return $$2.a().v();
      }
   }

   private static cwp a(ex $$0, ji $$1, int $$2) throws CommandSyntaxException {
      bsd $$3 = a($$0, $$1, b);
      if ($$2 >= 0 && $$2 < $$3.b()) {
         return $$3.a($$2).v();
      } else {
         throw d.create($$2);
      }
   }
}
