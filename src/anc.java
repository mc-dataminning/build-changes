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

public class anc {
   static final Dynamic3CommandExceptionType a = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wy.b("commands.item.target.not_a_container", $$0, $$1, $$2)
   );
   static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wy.b("commands.item.source.not_a_container", $$0, $$1, $$2)
   );
   static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wy.b("commands.item.target.no_such_slot", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wy.b("commands.item.source.no_such_slot", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> wy.b("commands.item.target.no_changes", $$0));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> wy.b("commands.item.target.no_changed.known_item", $$0, $$1)
   );
   private static final SuggestionProvider<et> g = ($$0, $$1) -> {
      ala.b $$2 = ((et)$$0.getSource()).l().be();
      return ey.a($$2.a(lu.bd), $$1);
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

   private static int a(et $$0, jd $$1, int $$2, jm<esz> $$3) throws CommandSyntaxException {
      bqj $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         cuo $$5 = a($$0, $$3, $$4.a($$2));
         $$4.a($$2, $$5);
         $$0.a(() -> wy.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$5.F()), true);
         return 1;
      } else {
         throw c.create($$2);
      }
   }

   private static int a(et $$0, Collection<? extends bsq> $$1, int $$2, jm<esz> $$3) throws CommandSyntaxException {
      Map<bsq, cuo> $$4 = Maps.newHashMapWithExpectedSize($$1.size());

      for (bsq $$5 : $$1) {
         bue $$6 = $$5.a_($$2);
         if ($$6 != bue.a) {
            cuo $$7 = a($$0, $$3, $$6.a().s());
            if ($$6.a($$7)) {
               $$4.put($$5, $$7);
               if ($$5 instanceof aqu) {
                  ((aqu)$$5).cd.d();
               }
            }
         }
      }

      if ($$4.isEmpty()) {
         throw e.create($$2);
      } else {
         if ($$4.size() == 1) {
            Entry<bsq, cuo> $$8 = $$4.entrySet().iterator().next();
            $$0.a(() -> wy.a("commands.item.entity.set.success.single", $$8.getKey().O_(), $$8.getValue().F()), true);
         } else {
            $$0.a(() -> wy.a("commands.item.entity.set.success.multiple", $$4.size()), true);
         }

         return $$4.size();
      }
   }

   private static int a(et $$0, jd $$1, int $$2, cuo $$3) throws CommandSyntaxException {
      bqj $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         $$4.a($$2, $$3);
         $$0.a(() -> wy.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$3.F()), true);
         return 1;
      } else {
         throw c.create($$2);
      }
   }

   static bqj a(et $$0, jd $$1, Dynamic3CommandExceptionType $$2) throws CommandSyntaxException {
      dqf $$3 = $$0.e().c_($$1);
      if (!($$3 instanceof bqj)) {
         throw $$2.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bqj)$$3;
      }
   }

   private static int a(et $$0, Collection<? extends bsq> $$1, int $$2, cuo $$3) throws CommandSyntaxException {
      List<bsq> $$4 = Lists.newArrayListWithCapacity($$1.size());

      for (bsq $$5 : $$1) {
         bue $$6 = $$5.a_($$2);
         if ($$6 != bue.a && $$6.a($$3.s())) {
            $$4.add($$5);
            if ($$5 instanceof aqu) {
               ((aqu)$$5).cd.d();
            }
         }
      }

      if ($$4.isEmpty()) {
         throw f.create($$3.F(), $$2);
      } else {
         if ($$4.size() == 1) {
            $$0.a(() -> wy.a("commands.item.entity.set.success.single", $$4.iterator().next().O_(), $$3.F()), true);
         } else {
            $$0.a(() -> wy.a("commands.item.entity.set.success.multiple", $$4.size(), $$3.F()), true);
         }

         return $$4.size();
      }
   }

   private static int a(et $$0, jd $$1, int $$2, Collection<? extends bsq> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(et $$0, jd $$1, int $$2, Collection<? extends bsq> $$3, int $$4, jm<esz> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(et $$0, jd $$1, int $$2, jd $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(et $$0, jd $$1, int $$2, jd $$3, int $$4, jm<esz> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(et $$0, bsq $$1, int $$2, jd $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(et $$0, bsq $$1, int $$2, jd $$3, int $$4, jm<esz> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static int a(et $$0, bsq $$1, int $$2, Collection<? extends bsq> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(et $$0, bsq $$1, int $$2, Collection<? extends bsq> $$3, int $$4, jm<esz> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static cuo a(et $$0, jm<esz> $$1, cuo $$2) {
      aqt $$3 = $$0.e();
      ero $$4 = new ero.a($$3).a(euh.f, $$0.d()).b(euh.a, $$0.f()).a(eug.d);
      erl $$5 = new erl.a($$4).a(Optional.empty());
      $$5.b(erl.a($$1.a()));
      cuo $$6 = $$1.a().apply($$2, $$5);
      $$6.f($$6.j());
      return $$6;
   }

   private static cuo a(bsq $$0, int $$1) throws CommandSyntaxException {
      bue $$2 = $$0.a_($$1);
      if ($$2 == bue.a) {
         throw d.create($$1);
      } else {
         return $$2.a().s();
      }
   }

   private static cuo a(et $$0, jd $$1, int $$2) throws CommandSyntaxException {
      bqj $$3 = a($$0, $$1, b);
      if ($$2 >= 0 && $$2 < $$3.b()) {
         return $$3.a($$2).s();
      } else {
         throw d.create($$2);
      }
   }
}
