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

public class amx {
   static final Dynamic3CommandExceptionType a = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wx.b("commands.item.target.not_a_container", $$0, $$1, $$2)
   );
   static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wx.b("commands.item.source.not_a_container", $$0, $$1, $$2)
   );
   static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wx.b("commands.item.target.no_such_slot", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wx.b("commands.item.source.no_such_slot", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> wx.b("commands.item.target.no_changes", $$0));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> wx.b("commands.item.target.no_changed.known_item", $$0, $$1)
   );
   private static final SuggestionProvider<ee> g = ($$0, $$1) -> {
      akw.b $$2 = ((ee)$$0.getSource()).l().be();
      return ej.a($$2.a(lf.aV), $$1);
   };

   public static void a(CommandDispatcher<ee> $$0, ea $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("item").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)ef.a("replace")
                        .then(
                           ef.a("block")
                              .then(
                                 ef.a("pos", ga.a())
                                    .then(
                                       ((RequiredArgumentBuilder)ef.a("slot", fm.a())
                                             .then(
                                                ef.a("with")
                                                   .then(
                                                      ((RequiredArgumentBuilder)ef.a("item", gn.a($$1))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ee)$$0x.getSource(),
                                                                     ga.a($$0x, "pos"),
                                                                     fm.a($$0x, "slot"),
                                                                     gn.a($$0x, "item").a(1, false)
                                                                  )
                                                            ))
                                                         .then(
                                                            ef.a("count", IntegerArgumentType.integer(1, 64))
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (ee)$$0x.getSource(),
                                                                        ga.a($$0x, "pos"),
                                                                        fm.a($$0x, "slot"),
                                                                        gn.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                     )
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)ef.a("from")
                                                   .then(
                                                      ef.a("block")
                                                         .then(
                                                            ef.a("source", ga.a())
                                                               .then(
                                                                  ((RequiredArgumentBuilder)ef.a("sourceSlot", fm.a())
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ee)$$0x.getSource(),
                                                                                 ga.a($$0x, "source"),
                                                                                 fm.a($$0x, "sourceSlot"),
                                                                                 ga.a($$0x, "pos"),
                                                                                 fm.a($$0x, "slot")
                                                                              )
                                                                        ))
                                                                     .then(
                                                                        ef.a("modifier", fg.b($$1))
                                                                           .suggests(g)
                                                                           .executes(
                                                                              $$0x -> a(
                                                                                    (ee)$$0x.getSource(),
                                                                                    ga.a($$0x, "source"),
                                                                                    fm.a($$0x, "sourceSlot"),
                                                                                    ga.a($$0x, "pos"),
                                                                                    fm.a($$0x, "slot"),
                                                                                    fg.b($$0x, "modifier")
                                                                                 )
                                                                           )
                                                                     )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   ef.a("entity")
                                                      .then(
                                                         ef.a("source", er.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)ef.a("sourceSlot", fm.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ee)$$0x.getSource(),
                                                                              er.a($$0x, "source"),
                                                                              fm.a($$0x, "sourceSlot"),
                                                                              ga.a($$0x, "pos"),
                                                                              fm.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     ef.a("modifier", fg.b($$1))
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ee)$$0x.getSource(),
                                                                                 er.a($$0x, "source"),
                                                                                 fm.a($$0x, "sourceSlot"),
                                                                                 ga.a($$0x, "pos"),
                                                                                 fm.a($$0x, "slot"),
                                                                                 fg.b($$0x, "modifier")
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
                        ef.a("entity")
                           .then(
                              ef.a("targets", er.b())
                                 .then(
                                    ((RequiredArgumentBuilder)ef.a("slot", fm.a())
                                          .then(
                                             ef.a("with")
                                                .then(
                                                   ((RequiredArgumentBuilder)ef.a("item", gn.a($$1))
                                                         .executes(
                                                            $$0x -> a(
                                                                  (ee)$$0x.getSource(),
                                                                  er.b($$0x, "targets"),
                                                                  fm.a($$0x, "slot"),
                                                                  gn.a($$0x, "item").a(1, false)
                                                               )
                                                         ))
                                                      .then(
                                                         ef.a("count", IntegerArgumentType.integer(1, 64))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ee)$$0x.getSource(),
                                                                     er.b($$0x, "targets"),
                                                                     fm.a($$0x, "slot"),
                                                                     gn.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                  )
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)ef.a("from")
                                                .then(
                                                   ef.a("block")
                                                      .then(
                                                         ef.a("source", ga.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)ef.a("sourceSlot", fm.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ee)$$0x.getSource(),
                                                                              ga.a($$0x, "source"),
                                                                              fm.a($$0x, "sourceSlot"),
                                                                              er.b($$0x, "targets"),
                                                                              fm.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     ef.a("modifier", fg.b($$1))
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ee)$$0x.getSource(),
                                                                                 ga.a($$0x, "source"),
                                                                                 fm.a($$0x, "sourceSlot"),
                                                                                 er.b($$0x, "targets"),
                                                                                 fm.a($$0x, "slot"),
                                                                                 fg.b($$0x, "modifier")
                                                                              )
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                ef.a("entity")
                                                   .then(
                                                      ef.a("source", er.a())
                                                         .then(
                                                            ((RequiredArgumentBuilder)ef.a("sourceSlot", fm.a())
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (ee)$$0x.getSource(),
                                                                           er.a($$0x, "source"),
                                                                           fm.a($$0x, "sourceSlot"),
                                                                           er.b($$0x, "targets"),
                                                                           fm.a($$0x, "slot")
                                                                        )
                                                                  ))
                                                               .then(
                                                                  ef.a("modifier", fg.b($$1))
                                                                     .suggests(g)
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ee)$$0x.getSource(),
                                                                              er.a($$0x, "source"),
                                                                              fm.a($$0x, "sourceSlot"),
                                                                              er.b($$0x, "targets"),
                                                                              fm.a($$0x, "slot"),
                                                                              fg.b($$0x, "modifier")
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
               ((LiteralArgumentBuilder)ef.a("modify")
                     .then(
                        ef.a("block")
                           .then(
                              ef.a("pos", ga.a())
                                 .then(
                                    ef.a("slot", fm.a())
                                       .then(
                                          ef.a("modifier", fg.b($$1))
                                             .suggests(g)
                                             .executes($$0x -> a((ee)$$0x.getSource(), ga.a($$0x, "pos"), fm.a($$0x, "slot"), fg.b($$0x, "modifier")))
                                       )
                                 )
                           )
                     ))
                  .then(
                     ef.a("entity")
                        .then(
                           ef.a("targets", er.b())
                              .then(
                                 ef.a("slot", fm.a())
                                    .then(
                                       ef.a("modifier", fg.b($$1))
                                          .suggests(g)
                                          .executes($$0x -> a((ee)$$0x.getSource(), er.b($$0x, "targets"), fm.a($$0x, "slot"), fg.b($$0x, "modifier")))
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ee $$0, io $$1, int $$2, ix<eqr> $$3) throws CommandSyntaxException {
      bpn $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         cto $$5 = a($$0, $$3, $$4.a($$2));
         $$4.a($$2, $$5);
         $$0.a(() -> wx.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$5.G()), true);
         return 1;
      } else {
         throw c.create($$2);
      }
   }

   private static int a(ee $$0, Collection<? extends bru> $$1, int $$2, ix<eqr> $$3) throws CommandSyntaxException {
      Map<bru, cto> $$4 = Maps.newHashMapWithExpectedSize($$1.size());

      for (bru $$5 : $$1) {
         btg $$6 = $$5.a_($$2);
         if ($$6 != btg.b) {
            cto $$7 = a($$0, $$3, $$6.a().s());
            if ($$6.a($$7)) {
               $$4.put($$5, $$7);
               if ($$5 instanceof aqn) {
                  ((aqn)$$5).cc.d();
               }
            }
         }
      }

      if ($$4.isEmpty()) {
         throw e.create($$2);
      } else {
         if ($$4.size() == 1) {
            Entry<bru, cto> $$8 = $$4.entrySet().iterator().next();
            $$0.a(() -> wx.a("commands.item.entity.set.success.single", $$8.getKey().O_(), $$8.getValue().G()), true);
         } else {
            $$0.a(() -> wx.a("commands.item.entity.set.success.multiple", $$4.size()), true);
         }

         return $$4.size();
      }
   }

   private static int a(ee $$0, io $$1, int $$2, cto $$3) throws CommandSyntaxException {
      bpn $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         $$4.a($$2, $$3);
         $$0.a(() -> wx.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$3.G()), true);
         return 1;
      } else {
         throw c.create($$2);
      }
   }

   static bpn a(ee $$0, io $$1, Dynamic3CommandExceptionType $$2) throws CommandSyntaxException {
      dog $$3 = $$0.e().c_($$1);
      if (!($$3 instanceof bpn)) {
         throw $$2.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bpn)$$3;
      }
   }

   private static int a(ee $$0, Collection<? extends bru> $$1, int $$2, cto $$3) throws CommandSyntaxException {
      List<bru> $$4 = Lists.newArrayListWithCapacity($$1.size());

      for (bru $$5 : $$1) {
         btg $$6 = $$5.a_($$2);
         if ($$6 != btg.b && $$6.a($$3.s())) {
            $$4.add($$5);
            if ($$5 instanceof aqn) {
               ((aqn)$$5).cc.d();
            }
         }
      }

      if ($$4.isEmpty()) {
         throw f.create($$3.G(), $$2);
      } else {
         if ($$4.size() == 1) {
            $$0.a(() -> wx.a("commands.item.entity.set.success.single", $$4.iterator().next().O_(), $$3.G()), true);
         } else {
            $$0.a(() -> wx.a("commands.item.entity.set.success.multiple", $$4.size(), $$3.G()), true);
         }

         return $$4.size();
      }
   }

   private static int a(ee $$0, io $$1, int $$2, Collection<? extends bru> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(ee $$0, io $$1, int $$2, Collection<? extends bru> $$3, int $$4, ix<eqr> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(ee $$0, io $$1, int $$2, io $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(ee $$0, io $$1, int $$2, io $$3, int $$4, ix<eqr> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(ee $$0, bru $$1, int $$2, io $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(ee $$0, bru $$1, int $$2, io $$3, int $$4, ix<eqr> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static int a(ee $$0, bru $$1, int $$2, Collection<? extends bru> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(ee $$0, bru $$1, int $$2, Collection<? extends bru> $$3, int $$4, ix<eqr> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static cto a(ee $$0, ix<eqr> $$1, cto $$2) {
      aqm $$3 = $$0.e();
      epi $$4 = new epi.a($$3).a(erx.f, $$0.d()).b(erx.a, $$0.f()).a(erw.d);
      epf $$5 = new epf.a($$4).a(Optional.empty());
      $$5.b(epf.a($$1.a()));
      return $$1.a().apply($$2, $$5);
   }

   private static cto a(bru $$0, int $$1) throws CommandSyntaxException {
      btg $$2 = $$0.a_($$1);
      if ($$2 == btg.b) {
         throw d.create($$1);
      } else {
         return $$2.a().s();
      }
   }

   private static cto a(ee $$0, io $$1, int $$2) throws CommandSyntaxException {
      bpn $$3 = a($$0, $$1, b);
      if ($$2 >= 0 && $$2 < $$3.b()) {
         return $$3.a($$2).s();
      } else {
         throw d.create($$2);
      }
   }
}
