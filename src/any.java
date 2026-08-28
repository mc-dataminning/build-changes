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

public class any {
   static final Dynamic3CommandExceptionType a = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xc.b("commands.item.target.not_a_container", $$0, $$1, $$2)
   );
   static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xc.b("commands.item.source.not_a_container", $$0, $$1, $$2)
   );
   static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xc.b("commands.item.target.no_such_slot", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xc.b("commands.item.source.no_such_slot", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xc.b("commands.item.target.no_changes", $$0));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xc.b("commands.item.target.no_changed.known_item", $$0, $$1)
   );
   private static final SuggestionProvider<ek> g = ($$0, $$1) -> {
      alu.a $$2 = ((ek)$$0.getSource()).l().bc();
      return ep.a($$2.a(mi.bs), $$1);
   };

   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("item").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)el.a("replace")
                        .then(
                           el.a("block")
                              .then(
                                 el.a("pos", gh.a())
                                    .then(
                                       ((RequiredArgumentBuilder)el.a("slot", ft.a())
                                             .then(
                                                el.a("with")
                                                   .then(
                                                      ((RequiredArgumentBuilder)el.a("item", gu.a($$1))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ek)$$0x.getSource(),
                                                                     gh.a($$0x, "pos"),
                                                                     ft.a($$0x, "slot"),
                                                                     gu.a($$0x, "item").a(1, false)
                                                                  )
                                                            ))
                                                         .then(
                                                            el.a("count", IntegerArgumentType.integer(1, 99))
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (ek)$$0x.getSource(),
                                                                        gh.a($$0x, "pos"),
                                                                        ft.a($$0x, "slot"),
                                                                        gu.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                     )
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)el.a("from")
                                                   .then(
                                                      el.a("block")
                                                         .then(
                                                            el.a("source", gh.a())
                                                               .then(
                                                                  ((RequiredArgumentBuilder)el.a("sourceSlot", ft.a())
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ek)$$0x.getSource(),
                                                                                 gh.a($$0x, "source"),
                                                                                 ft.a($$0x, "sourceSlot"),
                                                                                 gh.a($$0x, "pos"),
                                                                                 ft.a($$0x, "slot")
                                                                              )
                                                                        ))
                                                                     .then(
                                                                        el.a("modifier", fm.b($$1))
                                                                           .suggests(g)
                                                                           .executes(
                                                                              $$0x -> a(
                                                                                    (ek)$$0x.getSource(),
                                                                                    gh.a($$0x, "source"),
                                                                                    ft.a($$0x, "sourceSlot"),
                                                                                    gh.a($$0x, "pos"),
                                                                                    ft.a($$0x, "slot"),
                                                                                    fm.b($$0x, "modifier")
                                                                                 )
                                                                           )
                                                                     )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   el.a("entity")
                                                      .then(
                                                         el.a("source", ex.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)el.a("sourceSlot", ft.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ek)$$0x.getSource(),
                                                                              ex.a($$0x, "source"),
                                                                              ft.a($$0x, "sourceSlot"),
                                                                              gh.a($$0x, "pos"),
                                                                              ft.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     el.a("modifier", fm.b($$1))
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ek)$$0x.getSource(),
                                                                                 ex.a($$0x, "source"),
                                                                                 ft.a($$0x, "sourceSlot"),
                                                                                 gh.a($$0x, "pos"),
                                                                                 ft.a($$0x, "slot"),
                                                                                 fm.b($$0x, "modifier")
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
                        el.a("entity")
                           .then(
                              el.a("targets", ex.b())
                                 .then(
                                    ((RequiredArgumentBuilder)el.a("slot", ft.a())
                                          .then(
                                             el.a("with")
                                                .then(
                                                   ((RequiredArgumentBuilder)el.a("item", gu.a($$1))
                                                         .executes(
                                                            $$0x -> a(
                                                                  (ek)$$0x.getSource(),
                                                                  ex.b($$0x, "targets"),
                                                                  ft.a($$0x, "slot"),
                                                                  gu.a($$0x, "item").a(1, false)
                                                               )
                                                         ))
                                                      .then(
                                                         el.a("count", IntegerArgumentType.integer(1, 99))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ek)$$0x.getSource(),
                                                                     ex.b($$0x, "targets"),
                                                                     ft.a($$0x, "slot"),
                                                                     gu.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                  )
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)el.a("from")
                                                .then(
                                                   el.a("block")
                                                      .then(
                                                         el.a("source", gh.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)el.a("sourceSlot", ft.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ek)$$0x.getSource(),
                                                                              gh.a($$0x, "source"),
                                                                              ft.a($$0x, "sourceSlot"),
                                                                              ex.b($$0x, "targets"),
                                                                              ft.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     el.a("modifier", fm.b($$1))
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ek)$$0x.getSource(),
                                                                                 gh.a($$0x, "source"),
                                                                                 ft.a($$0x, "sourceSlot"),
                                                                                 ex.b($$0x, "targets"),
                                                                                 ft.a($$0x, "slot"),
                                                                                 fm.b($$0x, "modifier")
                                                                              )
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                el.a("entity")
                                                   .then(
                                                      el.a("source", ex.a())
                                                         .then(
                                                            ((RequiredArgumentBuilder)el.a("sourceSlot", ft.a())
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (ek)$$0x.getSource(),
                                                                           ex.a($$0x, "source"),
                                                                           ft.a($$0x, "sourceSlot"),
                                                                           ex.b($$0x, "targets"),
                                                                           ft.a($$0x, "slot")
                                                                        )
                                                                  ))
                                                               .then(
                                                                  el.a("modifier", fm.b($$1))
                                                                     .suggests(g)
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ek)$$0x.getSource(),
                                                                              ex.a($$0x, "source"),
                                                                              ft.a($$0x, "sourceSlot"),
                                                                              ex.b($$0x, "targets"),
                                                                              ft.a($$0x, "slot"),
                                                                              fm.b($$0x, "modifier")
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
               ((LiteralArgumentBuilder)el.a("modify")
                     .then(
                        el.a("block")
                           .then(
                              el.a("pos", gh.a())
                                 .then(
                                    el.a("slot", ft.a())
                                       .then(
                                          el.a("modifier", fm.b($$1))
                                             .suggests(g)
                                             .executes($$0x -> a((ek)$$0x.getSource(), gh.a($$0x, "pos"), ft.a($$0x, "slot"), fm.b($$0x, "modifier")))
                                       )
                                 )
                           )
                     ))
                  .then(
                     el.a("entity")
                        .then(
                           el.a("targets", ex.b())
                              .then(
                                 el.a("slot", ft.a())
                                    .then(
                                       el.a("modifier", fm.b($$1))
                                          .suggests(g)
                                          .executes($$0x -> a((ek)$$0x.getSource(), ex.b($$0x, "targets"), ft.a($$0x, "slot"), fm.b($$0x, "modifier")))
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ek $$0, iw $$1, int $$2, jg<fbx> $$3) throws CommandSyntaxException {
      bum $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         daa $$5 = a($$0, $$3, $$4.a($$2));
         $$4.a($$2, $$5);
         $$0.a(() -> xc.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$5.K()), true);
         return 1;
      } else {
         throw c.create($$2);
      }
   }

   private static int a(ek $$0, Collection<? extends bwv> $$1, int $$2, jg<fbx> $$3) throws CommandSyntaxException {
      Map<bwv, daa> $$4 = Maps.newHashMapWithExpectedSize($$1.size());

      for (bwv $$5 : $$1) {
         byn $$6 = $$5.a_($$2);
         if ($$6 != byn.a) {
            daa $$7 = a($$0, $$3, $$6.a().v());
            if ($$6.a($$7)) {
               $$4.put($$5, $$7);
               if ($$5 instanceof arv) {
                  ((arv)$$5).bR.d();
               }
            }
         }
      }

      if ($$4.isEmpty()) {
         throw e.create($$2);
      } else {
         if ($$4.size() == 1) {
            Entry<bwv, daa> $$8 = $$4.entrySet().iterator().next();
            $$0.a(() -> xc.a("commands.item.entity.set.success.single", $$8.getKey().m_(), $$8.getValue().K()), true);
         } else {
            $$0.a(() -> xc.a("commands.item.entity.set.success.multiple", $$4.size()), true);
         }

         return $$4.size();
      }
   }

   private static int a(ek $$0, iw $$1, int $$2, daa $$3) throws CommandSyntaxException {
      bum $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         $$4.a($$2, $$3);
         $$0.a(() -> xc.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$3.K()), true);
         return 1;
      } else {
         throw c.create($$2);
      }
   }

   static bum a(ek $$0, iw $$1, Dynamic3CommandExceptionType $$2) throws CommandSyntaxException {
      dye $$3 = $$0.e().c_($$1);
      if (!($$3 instanceof bum)) {
         throw $$2.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bum)$$3;
      }
   }

   private static int a(ek $$0, Collection<? extends bwv> $$1, int $$2, daa $$3) throws CommandSyntaxException {
      List<bwv> $$4 = Lists.newArrayListWithCapacity($$1.size());

      for (bwv $$5 : $$1) {
         byn $$6 = $$5.a_($$2);
         if ($$6 != byn.a && $$6.a($$3.v())) {
            $$4.add($$5);
            if ($$5 instanceof arv) {
               ((arv)$$5).bR.d();
            }
         }
      }

      if ($$4.isEmpty()) {
         throw f.create($$3.K(), $$2);
      } else {
         if ($$4.size() == 1) {
            $$0.a(() -> xc.a("commands.item.entity.set.success.single", $$4.iterator().next().m_(), $$3.K()), true);
         } else {
            $$0.a(() -> xc.a("commands.item.entity.set.success.multiple", $$4.size(), $$3.K()), true);
         }

         return $$4.size();
      }
   }

   private static int a(ek $$0, iw $$1, int $$2, Collection<? extends bwv> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(ek $$0, iw $$1, int $$2, Collection<? extends bwv> $$3, int $$4, jg<fbx> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(ek $$0, iw $$1, int $$2, iw $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(ek $$0, iw $$1, int $$2, iw $$3, int $$4, jg<fbx> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(ek $$0, bwv $$1, int $$2, iw $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(ek $$0, bwv $$1, int $$2, iw $$3, int $$4, jg<fbx> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static int a(ek $$0, bwv $$1, int $$2, Collection<? extends bwv> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(ek $$0, bwv $$1, int $$2, Collection<? extends bwv> $$3, int $$4, jg<fbx> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static daa a(ek $$0, jg<fbx> $$1, daa $$2) {
      aru $$3 = $$0.e();
      fam $$4 = new fam.a($$3).a(fdd.f, $$0.d()).b(fdd.a, $$0.f()).a(fdc.d);
      faj $$5 = new faj.a($$4).a(Optional.empty());
      $$5.b(faj.a($$1.a()));
      daa $$6 = $$1.a().apply($$2, $$5);
      $$6.f($$6.k());
      return $$6;
   }

   private static daa a(bwv $$0, int $$1) throws CommandSyntaxException {
      byn $$2 = $$0.a_($$1);
      if ($$2 == byn.a) {
         throw d.create($$1);
      } else {
         return $$2.a().v();
      }
   }

   private static daa a(ek $$0, iw $$1, int $$2) throws CommandSyntaxException {
      bum $$3 = a($$0, $$1, b);
      if ($$2 >= 0 && $$2 < $$3.b()) {
         return $$3.a($$2).v();
      } else {
         throw d.create($$2);
      }
   }
}
