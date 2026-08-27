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

public class ams {
   static final Dynamic3CommandExceptionType a = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wu.b("commands.item.target.not_a_container", $$0, $$1, $$2)
   );
   static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wu.b("commands.item.source.not_a_container", $$0, $$1, $$2)
   );
   static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wu.b("commands.item.target.no_such_slot", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wu.b("commands.item.source.no_such_slot", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> wu.b("commands.item.target.no_changes", $$0));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> wu.b("commands.item.target.no_changed.known_item", $$0, $$1)
   );
   private static final SuggestionProvider<ed> g = ($$0, $$1) -> {
      akr.b $$2 = ((ed)$$0.getSource()).l().be();
      return ei.a($$2.a(le.aV), $$1);
   };

   public static void a(CommandDispatcher<ed> $$0, dz $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("item").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)ee.a("replace")
                        .then(
                           ee.a("block")
                              .then(
                                 ee.a("pos", fz.a())
                                    .then(
                                       ((RequiredArgumentBuilder)ee.a("slot", fl.a())
                                             .then(
                                                ee.a("with")
                                                   .then(
                                                      ((RequiredArgumentBuilder)ee.a("item", gm.a($$1))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ed)$$0x.getSource(),
                                                                     fz.a($$0x, "pos"),
                                                                     fl.a($$0x, "slot"),
                                                                     gm.a($$0x, "item").a(1, false)
                                                                  )
                                                            ))
                                                         .then(
                                                            ee.a("count", IntegerArgumentType.integer(1, 64))
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (ed)$$0x.getSource(),
                                                                        fz.a($$0x, "pos"),
                                                                        fl.a($$0x, "slot"),
                                                                        gm.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                     )
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)ee.a("from")
                                                   .then(
                                                      ee.a("block")
                                                         .then(
                                                            ee.a("source", fz.a())
                                                               .then(
                                                                  ((RequiredArgumentBuilder)ee.a("sourceSlot", fl.a())
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ed)$$0x.getSource(),
                                                                                 fz.a($$0x, "source"),
                                                                                 fl.a($$0x, "sourceSlot"),
                                                                                 fz.a($$0x, "pos"),
                                                                                 fl.a($$0x, "slot")
                                                                              )
                                                                        ))
                                                                     .then(
                                                                        ee.a("modifier", ff.b($$1))
                                                                           .suggests(g)
                                                                           .executes(
                                                                              $$0x -> a(
                                                                                    (ed)$$0x.getSource(),
                                                                                    fz.a($$0x, "source"),
                                                                                    fl.a($$0x, "sourceSlot"),
                                                                                    fz.a($$0x, "pos"),
                                                                                    fl.a($$0x, "slot"),
                                                                                    ff.b($$0x, "modifier")
                                                                                 )
                                                                           )
                                                                     )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   ee.a("entity")
                                                      .then(
                                                         ee.a("source", eq.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)ee.a("sourceSlot", fl.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ed)$$0x.getSource(),
                                                                              eq.a($$0x, "source"),
                                                                              fl.a($$0x, "sourceSlot"),
                                                                              fz.a($$0x, "pos"),
                                                                              fl.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     ee.a("modifier", ff.b($$1))
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ed)$$0x.getSource(),
                                                                                 eq.a($$0x, "source"),
                                                                                 fl.a($$0x, "sourceSlot"),
                                                                                 fz.a($$0x, "pos"),
                                                                                 fl.a($$0x, "slot"),
                                                                                 ff.b($$0x, "modifier")
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
                        ee.a("entity")
                           .then(
                              ee.a("targets", eq.b())
                                 .then(
                                    ((RequiredArgumentBuilder)ee.a("slot", fl.a())
                                          .then(
                                             ee.a("with")
                                                .then(
                                                   ((RequiredArgumentBuilder)ee.a("item", gm.a($$1))
                                                         .executes(
                                                            $$0x -> a(
                                                                  (ed)$$0x.getSource(),
                                                                  eq.b($$0x, "targets"),
                                                                  fl.a($$0x, "slot"),
                                                                  gm.a($$0x, "item").a(1, false)
                                                               )
                                                         ))
                                                      .then(
                                                         ee.a("count", IntegerArgumentType.integer(1, 64))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ed)$$0x.getSource(),
                                                                     eq.b($$0x, "targets"),
                                                                     fl.a($$0x, "slot"),
                                                                     gm.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                  )
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)ee.a("from")
                                                .then(
                                                   ee.a("block")
                                                      .then(
                                                         ee.a("source", fz.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)ee.a("sourceSlot", fl.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ed)$$0x.getSource(),
                                                                              fz.a($$0x, "source"),
                                                                              fl.a($$0x, "sourceSlot"),
                                                                              eq.b($$0x, "targets"),
                                                                              fl.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     ee.a("modifier", ff.b($$1))
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ed)$$0x.getSource(),
                                                                                 fz.a($$0x, "source"),
                                                                                 fl.a($$0x, "sourceSlot"),
                                                                                 eq.b($$0x, "targets"),
                                                                                 fl.a($$0x, "slot"),
                                                                                 ff.b($$0x, "modifier")
                                                                              )
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                ee.a("entity")
                                                   .then(
                                                      ee.a("source", eq.a())
                                                         .then(
                                                            ((RequiredArgumentBuilder)ee.a("sourceSlot", fl.a())
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (ed)$$0x.getSource(),
                                                                           eq.a($$0x, "source"),
                                                                           fl.a($$0x, "sourceSlot"),
                                                                           eq.b($$0x, "targets"),
                                                                           fl.a($$0x, "slot")
                                                                        )
                                                                  ))
                                                               .then(
                                                                  ee.a("modifier", ff.b($$1))
                                                                     .suggests(g)
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ed)$$0x.getSource(),
                                                                              eq.a($$0x, "source"),
                                                                              fl.a($$0x, "sourceSlot"),
                                                                              eq.b($$0x, "targets"),
                                                                              fl.a($$0x, "slot"),
                                                                              ff.b($$0x, "modifier")
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
               ((LiteralArgumentBuilder)ee.a("modify")
                     .then(
                        ee.a("block")
                           .then(
                              ee.a("pos", fz.a())
                                 .then(
                                    ee.a("slot", fl.a())
                                       .then(
                                          ee.a("modifier", ff.b($$1))
                                             .suggests(g)
                                             .executes($$0x -> a((ed)$$0x.getSource(), fz.a($$0x, "pos"), fl.a($$0x, "slot"), ff.b($$0x, "modifier")))
                                       )
                                 )
                           )
                     ))
                  .then(
                     ee.a("entity")
                        .then(
                           ee.a("targets", eq.b())
                              .then(
                                 ee.a("slot", fl.a())
                                    .then(
                                       ee.a("modifier", ff.b($$1))
                                          .suggests(g)
                                          .executes($$0x -> a((ed)$$0x.getSource(), eq.b($$0x, "targets"), fl.a($$0x, "slot"), ff.b($$0x, "modifier")))
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ed $$0, in $$1, int $$2, iw<epx> $$3) throws CommandSyntaxException {
      bpf $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         csz $$5 = a($$0, $$3, $$4.a($$2));
         $$4.a($$2, $$5);
         $$0.a(() -> wu.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$5.E()), true);
         return 1;
      } else {
         throw c.create($$2);
      }
   }

   private static int a(ed $$0, Collection<? extends brh> $$1, int $$2, iw<epx> $$3) throws CommandSyntaxException {
      Map<brh, csz> $$4 = Maps.newHashMapWithExpectedSize($$1.size());

      for (brh $$5 : $$1) {
         bsr $$6 = $$5.a_($$2);
         if ($$6 != bsr.b) {
            csz $$7 = a($$0, $$3, $$6.a().r());
            if ($$6.a($$7)) {
               $$4.put($$5, $$7);
               if ($$5 instanceof aqi) {
                  ((aqi)$$5).cc.d();
               }
            }
         }
      }

      if ($$4.isEmpty()) {
         throw e.create($$2);
      } else {
         if ($$4.size() == 1) {
            Entry<brh, csz> $$8 = $$4.entrySet().iterator().next();
            $$0.a(() -> wu.a("commands.item.entity.set.success.single", $$8.getKey().O_(), $$8.getValue().E()), true);
         } else {
            $$0.a(() -> wu.a("commands.item.entity.set.success.multiple", $$4.size()), true);
         }

         return $$4.size();
      }
   }

   private static int a(ed $$0, in $$1, int $$2, csz $$3) throws CommandSyntaxException {
      bpf $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         $$4.a($$2, $$3);
         $$0.a(() -> wu.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$3.E()), true);
         return 1;
      } else {
         throw c.create($$2);
      }
   }

   static bpf a(ed $$0, in $$1, Dynamic3CommandExceptionType $$2) throws CommandSyntaxException {
      dnm $$3 = $$0.e().c_($$1);
      if (!($$3 instanceof bpf)) {
         throw $$2.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bpf)$$3;
      }
   }

   private static int a(ed $$0, Collection<? extends brh> $$1, int $$2, csz $$3) throws CommandSyntaxException {
      List<brh> $$4 = Lists.newArrayListWithCapacity($$1.size());

      for (brh $$5 : $$1) {
         bsr $$6 = $$5.a_($$2);
         if ($$6 != bsr.b && $$6.a($$3.r())) {
            $$4.add($$5);
            if ($$5 instanceof aqi) {
               ((aqi)$$5).cc.d();
            }
         }
      }

      if ($$4.isEmpty()) {
         throw f.create($$3.E(), $$2);
      } else {
         if ($$4.size() == 1) {
            $$0.a(() -> wu.a("commands.item.entity.set.success.single", $$4.iterator().next().O_(), $$3.E()), true);
         } else {
            $$0.a(() -> wu.a("commands.item.entity.set.success.multiple", $$4.size(), $$3.E()), true);
         }

         return $$4.size();
      }
   }

   private static int a(ed $$0, in $$1, int $$2, Collection<? extends brh> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(ed $$0, in $$1, int $$2, Collection<? extends brh> $$3, int $$4, iw<epx> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(ed $$0, in $$1, int $$2, in $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(ed $$0, in $$1, int $$2, in $$3, int $$4, iw<epx> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(ed $$0, brh $$1, int $$2, in $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(ed $$0, brh $$1, int $$2, in $$3, int $$4, iw<epx> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static int a(ed $$0, brh $$1, int $$2, Collection<? extends brh> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(ed $$0, brh $$1, int $$2, Collection<? extends brh> $$3, int $$4, iw<epx> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static csz a(ed $$0, iw<epx> $$1, csz $$2) {
      aqh $$3 = $$0.e();
      eoo $$4 = new eoo.a($$3).a(erc.f, $$0.d()).b(erc.a, $$0.f()).a(erb.d);
      eol $$5 = new eol.a($$4).a(Optional.empty());
      $$5.b(eol.a($$1.a()));
      return $$1.a().apply($$2, $$5);
   }

   private static csz a(brh $$0, int $$1) throws CommandSyntaxException {
      bsr $$2 = $$0.a_($$1);
      if ($$2 == bsr.b) {
         throw d.create($$1);
      } else {
         return $$2.a().r();
      }
   }

   private static csz a(ed $$0, in $$1, int $$2) throws CommandSyntaxException {
      bpf $$3 = a($$0, $$1, b);
      if ($$2 >= 0 && $$2 < $$3.b()) {
         return $$3.a($$2).r();
      } else {
         throw d.create($$2);
      }
   }
}
