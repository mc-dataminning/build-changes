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

public class ajn {
   static final Dynamic3CommandExceptionType a = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> vd.b("commands.item.target.not_a_container", $$0, $$1, $$2)
   );
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> vd.b("commands.item.source.not_a_container", $$0, $$1, $$2)
   );
   static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vd.b("commands.item.target.no_such_slot", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> vd.b("commands.item.source.no_such_slot", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> vd.b("commands.item.target.no_changes", $$0));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> vd.b("commands.item.target.no_changed.known_item", $$0, $$1)
   );
   private static final SuggestionProvider<ds> g = ($$0, $$1) -> {
      egs $$2 = ((ds)$$0.getSource()).l().aJ();
      return dx.a($$2.a(egu.b), $$1);
   };

   public static void a(CommandDispatcher<ds> $$0, dn $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("item").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)dt.a("replace")
                        .then(
                           dt.a("block")
                              .then(
                                 dt.a("pos", fm.a())
                                    .then(
                                       ((RequiredArgumentBuilder)dt.a("slot", ez.a())
                                             .then(
                                                dt.a("with")
                                                   .then(
                                                      ((RequiredArgumentBuilder)dt.a("item", fy.a($$1))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ds)$$0x.getSource(),
                                                                     fm.a($$0x, "pos"),
                                                                     ez.a($$0x, "slot"),
                                                                     fy.a($$0x, "item").a(1, false)
                                                                  )
                                                            ))
                                                         .then(
                                                            dt.a("count", IntegerArgumentType.integer(1, 64))
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (ds)$$0x.getSource(),
                                                                        fm.a($$0x, "pos"),
                                                                        ez.a($$0x, "slot"),
                                                                        fy.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
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
                                                            dt.a("source", fm.a())
                                                               .then(
                                                                  ((RequiredArgumentBuilder)dt.a("sourceSlot", ez.a())
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ds)$$0x.getSource(),
                                                                                 fm.a($$0x, "source"),
                                                                                 ez.a($$0x, "sourceSlot"),
                                                                                 fm.a($$0x, "pos"),
                                                                                 ez.a($$0x, "slot")
                                                                              )
                                                                        ))
                                                                     .then(
                                                                        dt.a("modifier", et.a())
                                                                           .suggests(g)
                                                                           .executes(
                                                                              $$0x -> a(
                                                                                    (ds)$$0x.getSource(),
                                                                                    fm.a($$0x, "source"),
                                                                                    ez.a($$0x, "sourceSlot"),
                                                                                    fm.a($$0x, "pos"),
                                                                                    ez.a($$0x, "slot"),
                                                                                    et.d($$0x, "modifier")
                                                                                 )
                                                                           )
                                                                     )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   dt.a("entity")
                                                      .then(
                                                         dt.a("source", ef.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)dt.a("sourceSlot", ez.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ds)$$0x.getSource(),
                                                                              ef.a($$0x, "source"),
                                                                              ez.a($$0x, "sourceSlot"),
                                                                              fm.a($$0x, "pos"),
                                                                              ez.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     dt.a("modifier", et.a())
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ds)$$0x.getSource(),
                                                                                 ef.a($$0x, "source"),
                                                                                 ez.a($$0x, "sourceSlot"),
                                                                                 fm.a($$0x, "pos"),
                                                                                 ez.a($$0x, "slot"),
                                                                                 et.d($$0x, "modifier")
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
                              dt.a("targets", ef.b())
                                 .then(
                                    ((RequiredArgumentBuilder)dt.a("slot", ez.a())
                                          .then(
                                             dt.a("with")
                                                .then(
                                                   ((RequiredArgumentBuilder)dt.a("item", fy.a($$1))
                                                         .executes(
                                                            $$0x -> a(
                                                                  (ds)$$0x.getSource(),
                                                                  ef.b($$0x, "targets"),
                                                                  ez.a($$0x, "slot"),
                                                                  fy.a($$0x, "item").a(1, false)
                                                               )
                                                         ))
                                                      .then(
                                                         dt.a("count", IntegerArgumentType.integer(1, 64))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ds)$$0x.getSource(),
                                                                     ef.b($$0x, "targets"),
                                                                     ez.a($$0x, "slot"),
                                                                     fy.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
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
                                                         dt.a("source", fm.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)dt.a("sourceSlot", ez.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ds)$$0x.getSource(),
                                                                              fm.a($$0x, "source"),
                                                                              ez.a($$0x, "sourceSlot"),
                                                                              ef.b($$0x, "targets"),
                                                                              ez.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     dt.a("modifier", et.a())
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ds)$$0x.getSource(),
                                                                                 fm.a($$0x, "source"),
                                                                                 ez.a($$0x, "sourceSlot"),
                                                                                 ef.b($$0x, "targets"),
                                                                                 ez.a($$0x, "slot"),
                                                                                 et.d($$0x, "modifier")
                                                                              )
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                dt.a("entity")
                                                   .then(
                                                      dt.a("source", ef.a())
                                                         .then(
                                                            ((RequiredArgumentBuilder)dt.a("sourceSlot", ez.a())
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (ds)$$0x.getSource(),
                                                                           ef.a($$0x, "source"),
                                                                           ez.a($$0x, "sourceSlot"),
                                                                           ef.b($$0x, "targets"),
                                                                           ez.a($$0x, "slot")
                                                                        )
                                                                  ))
                                                               .then(
                                                                  dt.a("modifier", et.a())
                                                                     .suggests(g)
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ds)$$0x.getSource(),
                                                                              ef.a($$0x, "source"),
                                                                              ez.a($$0x, "sourceSlot"),
                                                                              ef.b($$0x, "targets"),
                                                                              ez.a($$0x, "slot"),
                                                                              et.d($$0x, "modifier")
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
                              dt.a("pos", fm.a())
                                 .then(
                                    dt.a("slot", ez.a())
                                       .then(
                                          dt.a("modifier", et.a())
                                             .suggests(g)
                                             .executes($$0x -> a((ds)$$0x.getSource(), fm.a($$0x, "pos"), ez.a($$0x, "slot"), et.d($$0x, "modifier")))
                                       )
                                 )
                           )
                     ))
                  .then(
                     dt.a("entity")
                        .then(
                           dt.a("targets", ef.b())
                              .then(
                                 dt.a("slot", ez.a())
                                    .then(
                                       dt.a("modifier", et.a())
                                          .suggests(g)
                                          .executes($$0x -> a((ds)$$0x.getSource(), ef.b($$0x, "targets"), ez.a($$0x, "slot"), et.d($$0x, "modifier")))
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ds $$0, hx $$1, int $$2, eic $$3) throws CommandSyntaxException {
      bjo $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         cmr $$5 = a($$0, $$3, $$4.a($$2));
         $$4.a($$2, $$5);
         $$0.a(() -> vd.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$5.J()), true);
         return 1;
      } else {
         throw b.create($$2);
      }
   }

   private static int a(ds $$0, Collection<? extends blp> $$1, int $$2, eic $$3) throws CommandSyntaxException {
      Map<blp, cmr> $$4 = Maps.newHashMapWithExpectedSize($$1.size());

      for (blp $$5 : $$1) {
         bmx $$6 = $$5.a_($$2);
         if ($$6 != bmx.b) {
            cmr $$7 = a($$0, $$3, $$6.a().p());
            if ($$6.a($$7)) {
               $$4.put($$5, $$7);
               if ($$5 instanceof ana) {
                  ((ana)$$5).bS.d();
               }
            }
         }
      }

      if ($$4.isEmpty()) {
         throw e.create($$2);
      } else {
         if ($$4.size() == 1) {
            Entry<blp, cmr> $$8 = $$4.entrySet().iterator().next();
            $$0.a(() -> vd.a("commands.item.entity.set.success.single", $$8.getKey().Q_(), $$8.getValue().J()), true);
         } else {
            $$0.a(() -> vd.a("commands.item.entity.set.success.multiple", $$4.size()), true);
         }

         return $$4.size();
      }
   }

   private static int a(ds $$0, hx $$1, int $$2, cmr $$3) throws CommandSyntaxException {
      bjo $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         $$4.a($$2, $$3);
         $$0.a(() -> vd.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$3.J()), true);
         return 1;
      } else {
         throw b.create($$2);
      }
   }

   private static bjo a(ds $$0, hx $$1, Dynamic3CommandExceptionType $$2) throws CommandSyntaxException {
      dgo $$3 = $$0.e().c_($$1);
      if (!($$3 instanceof bjo)) {
         throw $$2.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bjo)$$3;
      }
   }

   private static int a(ds $$0, Collection<? extends blp> $$1, int $$2, cmr $$3) throws CommandSyntaxException {
      List<blp> $$4 = Lists.newArrayListWithCapacity($$1.size());

      for (blp $$5 : $$1) {
         bmx $$6 = $$5.a_($$2);
         if ($$6 != bmx.b && $$6.a($$3.p())) {
            $$4.add($$5);
            if ($$5 instanceof ana) {
               ((ana)$$5).bS.d();
            }
         }
      }

      if ($$4.isEmpty()) {
         throw f.create($$3.J(), $$2);
      } else {
         if ($$4.size() == 1) {
            $$0.a(() -> vd.a("commands.item.entity.set.success.single", $$4.iterator().next().Q_(), $$3.J()), true);
         } else {
            $$0.a(() -> vd.a("commands.item.entity.set.success.multiple", $$4.size(), $$3.J()), true);
         }

         return $$4.size();
      }
   }

   private static int a(ds $$0, hx $$1, int $$2, Collection<? extends blp> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(ds $$0, hx $$1, int $$2, Collection<? extends blp> $$3, int $$4, eic $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(ds $$0, hx $$1, int $$2, hx $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(ds $$0, hx $$1, int $$2, hx $$3, int $$4, eic $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(ds $$0, blp $$1, int $$2, hx $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(ds $$0, blp $$1, int $$2, hx $$3, int $$4, eic $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static int a(ds $$0, blp $$1, int $$2, Collection<? extends blp> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(ds $$0, blp $$1, int $$2, Collection<? extends blp> $$3, int $$4, eic $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static cmr a(ds $$0, eic $$1, cmr $$2) {
      amz $$3 = $$0.e();
      egv $$4 = new egv.a($$3).a(eja.f, $$0.d()).b(eja.a, $$0.f()).a(eiz.d);
      egp $$5 = new egp.a($$4).a(Optional.empty());
      $$5.b(egp.a($$1));
      return $$1.apply($$2, $$5);
   }

   private static cmr a(blp $$0, int $$1) throws CommandSyntaxException {
      bmx $$2 = $$0.a_($$1);
      if ($$2 == bmx.b) {
         throw d.create($$1);
      } else {
         return $$2.a().p();
      }
   }

   private static cmr a(ds $$0, hx $$1, int $$2) throws CommandSyntaxException {
      bjo $$3 = a($$0, $$1, c);
      if ($$2 >= 0 && $$2 < $$3.b()) {
         return $$3.a($$2).p();
      } else {
         throw d.create($$2);
      }
   }
}
