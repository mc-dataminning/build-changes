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

public class aof {
   static final Dynamic3CommandExceptionType a = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xg.b("commands.item.target.not_a_container", $$0, $$1, $$2)
   );
   static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xg.b("commands.item.source.not_a_container", $$0, $$1, $$2)
   );
   static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xg.b("commands.item.target.no_such_slot", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xg.b("commands.item.source.no_such_slot", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xg.b("commands.item.target.no_changes", $$0));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xg.b("commands.item.target.no_changed.known_item", $$0, $$1)
   );
   private static final SuggestionProvider<ek> g = ($$0, $$1) -> {
      amb.a $$2 = ((ek)$$0.getSource()).l().bc();
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

   private static int a(ek $$0, iw $$1, int $$2, jg<fch> $$3) throws CommandSyntaxException {
      buv $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         dak $$5 = a($$0, $$3, $$4.a($$2));
         $$4.a($$2, $$5);
         $$0.a(() -> xg.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$5.K()), true);
         return 1;
      } else {
         throw c.create($$2);
      }
   }

   private static int a(ek $$0, Collection<? extends bxe> $$1, int $$2, jg<fch> $$3) throws CommandSyntaxException {
      Map<bxe, dak> $$4 = Maps.newHashMapWithExpectedSize($$1.size());

      for (bxe $$5 : $$1) {
         byw $$6 = $$5.a_($$2);
         if ($$6 != byw.a) {
            dak $$7 = a($$0, $$3, $$6.a().v());
            if ($$6.a($$7)) {
               $$4.put($$5, $$7);
               if ($$5 instanceof asc) {
                  ((asc)$$5).bR.d();
               }
            }
         }
      }

      if ($$4.isEmpty()) {
         throw e.create($$2);
      } else {
         if ($$4.size() == 1) {
            Entry<bxe, dak> $$8 = $$4.entrySet().iterator().next();
            $$0.a(() -> xg.a("commands.item.entity.set.success.single", $$8.getKey().P_(), $$8.getValue().K()), true);
         } else {
            $$0.a(() -> xg.a("commands.item.entity.set.success.multiple", $$4.size()), true);
         }

         return $$4.size();
      }
   }

   private static int a(ek $$0, iw $$1, int $$2, dak $$3) throws CommandSyntaxException {
      buv $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         $$4.a($$2, $$3);
         $$0.a(() -> xg.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$3.K()), true);
         return 1;
      } else {
         throw c.create($$2);
      }
   }

   static buv a(ek $$0, iw $$1, Dynamic3CommandExceptionType $$2) throws CommandSyntaxException {
      dyo $$3 = $$0.e().c_($$1);
      if (!($$3 instanceof buv)) {
         throw $$2.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (buv)$$3;
      }
   }

   private static int a(ek $$0, Collection<? extends bxe> $$1, int $$2, dak $$3) throws CommandSyntaxException {
      List<bxe> $$4 = Lists.newArrayListWithCapacity($$1.size());

      for (bxe $$5 : $$1) {
         byw $$6 = $$5.a_($$2);
         if ($$6 != byw.a && $$6.a($$3.v())) {
            $$4.add($$5);
            if ($$5 instanceof asc) {
               ((asc)$$5).bR.d();
            }
         }
      }

      if ($$4.isEmpty()) {
         throw f.create($$3.K(), $$2);
      } else {
         if ($$4.size() == 1) {
            $$0.a(() -> xg.a("commands.item.entity.set.success.single", $$4.iterator().next().P_(), $$3.K()), true);
         } else {
            $$0.a(() -> xg.a("commands.item.entity.set.success.multiple", $$4.size(), $$3.K()), true);
         }

         return $$4.size();
      }
   }

   private static int a(ek $$0, iw $$1, int $$2, Collection<? extends bxe> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(ek $$0, iw $$1, int $$2, Collection<? extends bxe> $$3, int $$4, jg<fch> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(ek $$0, iw $$1, int $$2, iw $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(ek $$0, iw $$1, int $$2, iw $$3, int $$4, jg<fch> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(ek $$0, bxe $$1, int $$2, iw $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(ek $$0, bxe $$1, int $$2, iw $$3, int $$4, jg<fch> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static int a(ek $$0, bxe $$1, int $$2, Collection<? extends bxe> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(ek $$0, bxe $$1, int $$2, Collection<? extends bxe> $$3, int $$4, jg<fch> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static dak a(ek $$0, jg<fch> $$1, dak $$2) {
      asb $$3 = $$0.e();
      faw $$4 = new faw.a($$3).a(fdn.f, $$0.d()).b(fdn.a, $$0.f()).a(fdm.d);
      fat $$5 = new fat.a($$4).a(Optional.empty());
      $$5.b(fat.a($$1.a()));
      dak $$6 = $$1.a().apply($$2, $$5);
      $$6.f($$6.k());
      return $$6;
   }

   private static dak a(bxe $$0, int $$1) throws CommandSyntaxException {
      byw $$2 = $$0.a_($$1);
      if ($$2 == byw.a) {
         throw d.create($$1);
      } else {
         return $$2.a().v();
      }
   }

   private static dak a(ek $$0, iw $$1, int $$2) throws CommandSyntaxException {
      buv $$3 = a($$0, $$1, b);
      if ($$2 >= 0 && $$2 < $$3.b()) {
         return $$3.a($$2).v();
      } else {
         throw d.create($$2);
      }
   }
}
