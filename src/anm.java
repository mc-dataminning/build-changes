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

public class anm {
   static final Dynamic3CommandExceptionType a = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xl.b("commands.item.target.not_a_container", $$0, $$1, $$2)
   );
   static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xl.b("commands.item.source.not_a_container", $$0, $$1, $$2)
   );
   static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xl.b("commands.item.target.no_such_slot", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xl.b("commands.item.source.no_such_slot", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xl.b("commands.item.target.no_changes", $$0));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xl.b("commands.item.target.no_changed.known_item", $$0, $$1)
   );
   private static final SuggestionProvider<ep> g = ($$0, $$1) -> {
      all.b $$2 = ((ep)$$0.getSource()).l().be();
      return eu.a($$2.a(lq.aV), $$1);
   };

   public static void a(CommandDispatcher<ep> $$0, el $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("item").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)eq.a("replace")
                        .then(
                           eq.a("block")
                              .then(
                                 eq.a("pos", gl.a())
                                    .then(
                                       ((RequiredArgumentBuilder)eq.a("slot", fx.a())
                                             .then(
                                                eq.a("with")
                                                   .then(
                                                      ((RequiredArgumentBuilder)eq.a("item", gy.a($$1))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ep)$$0x.getSource(),
                                                                     gl.a($$0x, "pos"),
                                                                     fx.a($$0x, "slot"),
                                                                     gy.a($$0x, "item").a(1, false)
                                                                  )
                                                            ))
                                                         .then(
                                                            eq.a("count", IntegerArgumentType.integer(1, 99))
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (ep)$$0x.getSource(),
                                                                        gl.a($$0x, "pos"),
                                                                        fx.a($$0x, "slot"),
                                                                        gy.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                     )
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)eq.a("from")
                                                   .then(
                                                      eq.a("block")
                                                         .then(
                                                            eq.a("source", gl.a())
                                                               .then(
                                                                  ((RequiredArgumentBuilder)eq.a("sourceSlot", fx.a())
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ep)$$0x.getSource(),
                                                                                 gl.a($$0x, "source"),
                                                                                 fx.a($$0x, "sourceSlot"),
                                                                                 gl.a($$0x, "pos"),
                                                                                 fx.a($$0x, "slot")
                                                                              )
                                                                        ))
                                                                     .then(
                                                                        eq.a("modifier", fr.b($$1))
                                                                           .suggests(g)
                                                                           .executes(
                                                                              $$0x -> a(
                                                                                    (ep)$$0x.getSource(),
                                                                                    gl.a($$0x, "source"),
                                                                                    fx.a($$0x, "sourceSlot"),
                                                                                    gl.a($$0x, "pos"),
                                                                                    fx.a($$0x, "slot"),
                                                                                    fr.b($$0x, "modifier")
                                                                                 )
                                                                           )
                                                                     )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   eq.a("entity")
                                                      .then(
                                                         eq.a("source", fc.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)eq.a("sourceSlot", fx.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ep)$$0x.getSource(),
                                                                              fc.a($$0x, "source"),
                                                                              fx.a($$0x, "sourceSlot"),
                                                                              gl.a($$0x, "pos"),
                                                                              fx.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     eq.a("modifier", fr.b($$1))
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ep)$$0x.getSource(),
                                                                                 fc.a($$0x, "source"),
                                                                                 fx.a($$0x, "sourceSlot"),
                                                                                 gl.a($$0x, "pos"),
                                                                                 fx.a($$0x, "slot"),
                                                                                 fr.b($$0x, "modifier")
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
                        eq.a("entity")
                           .then(
                              eq.a("targets", fc.b())
                                 .then(
                                    ((RequiredArgumentBuilder)eq.a("slot", fx.a())
                                          .then(
                                             eq.a("with")
                                                .then(
                                                   ((RequiredArgumentBuilder)eq.a("item", gy.a($$1))
                                                         .executes(
                                                            $$0x -> a(
                                                                  (ep)$$0x.getSource(),
                                                                  fc.b($$0x, "targets"),
                                                                  fx.a($$0x, "slot"),
                                                                  gy.a($$0x, "item").a(1, false)
                                                               )
                                                         ))
                                                      .then(
                                                         eq.a("count", IntegerArgumentType.integer(1, 99))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ep)$$0x.getSource(),
                                                                     fc.b($$0x, "targets"),
                                                                     fx.a($$0x, "slot"),
                                                                     gy.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                  )
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)eq.a("from")
                                                .then(
                                                   eq.a("block")
                                                      .then(
                                                         eq.a("source", gl.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)eq.a("sourceSlot", fx.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ep)$$0x.getSource(),
                                                                              gl.a($$0x, "source"),
                                                                              fx.a($$0x, "sourceSlot"),
                                                                              fc.b($$0x, "targets"),
                                                                              fx.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     eq.a("modifier", fr.b($$1))
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ep)$$0x.getSource(),
                                                                                 gl.a($$0x, "source"),
                                                                                 fx.a($$0x, "sourceSlot"),
                                                                                 fc.b($$0x, "targets"),
                                                                                 fx.a($$0x, "slot"),
                                                                                 fr.b($$0x, "modifier")
                                                                              )
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                eq.a("entity")
                                                   .then(
                                                      eq.a("source", fc.a())
                                                         .then(
                                                            ((RequiredArgumentBuilder)eq.a("sourceSlot", fx.a())
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (ep)$$0x.getSource(),
                                                                           fc.a($$0x, "source"),
                                                                           fx.a($$0x, "sourceSlot"),
                                                                           fc.b($$0x, "targets"),
                                                                           fx.a($$0x, "slot")
                                                                        )
                                                                  ))
                                                               .then(
                                                                  eq.a("modifier", fr.b($$1))
                                                                     .suggests(g)
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ep)$$0x.getSource(),
                                                                              fc.a($$0x, "source"),
                                                                              fx.a($$0x, "sourceSlot"),
                                                                              fc.b($$0x, "targets"),
                                                                              fx.a($$0x, "slot"),
                                                                              fr.b($$0x, "modifier")
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
               ((LiteralArgumentBuilder)eq.a("modify")
                     .then(
                        eq.a("block")
                           .then(
                              eq.a("pos", gl.a())
                                 .then(
                                    eq.a("slot", fx.a())
                                       .then(
                                          eq.a("modifier", fr.b($$1))
                                             .suggests(g)
                                             .executes($$0x -> a((ep)$$0x.getSource(), gl.a($$0x, "pos"), fx.a($$0x, "slot"), fr.b($$0x, "modifier")))
                                       )
                                 )
                           )
                     ))
                  .then(
                     eq.a("entity")
                        .then(
                           eq.a("targets", fc.b())
                              .then(
                                 eq.a("slot", fx.a())
                                    .then(
                                       eq.a("modifier", fr.b($$1))
                                          .suggests(g)
                                          .executes($$0x -> a((ep)$$0x.getSource(), fc.b($$0x, "targets"), fx.a($$0x, "slot"), fr.b($$0x, "modifier")))
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ep $$0, iz $$1, int $$2, ji<erq> $$3) throws CommandSyntaxException {
      bqi $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         cuk $$5 = a($$0, $$3, $$4.a($$2));
         $$4.a($$2, $$5);
         $$0.a(() -> xl.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$5.G()), true);
         return 1;
      } else {
         throw c.create($$2);
      }
   }

   private static int a(ep $$0, Collection<? extends bsp> $$1, int $$2, ji<erq> $$3) throws CommandSyntaxException {
      Map<bsp, cuk> $$4 = Maps.newHashMapWithExpectedSize($$1.size());

      for (bsp $$5 : $$1) {
         buc $$6 = $$5.a_($$2);
         if ($$6 != buc.a) {
            cuk $$7 = a($$0, $$3, $$6.a().s());
            if ($$6.a($$7)) {
               $$4.put($$5, $$7);
               if ($$5 instanceof arc) {
                  ((arc)$$5).cb.d();
               }
            }
         }
      }

      if ($$4.isEmpty()) {
         throw e.create($$2);
      } else {
         if ($$4.size() == 1) {
            Entry<bsp, cuk> $$8 = $$4.entrySet().iterator().next();
            $$0.a(() -> xl.a("commands.item.entity.set.success.single", $$8.getKey().O_(), $$8.getValue().G()), true);
         } else {
            $$0.a(() -> xl.a("commands.item.entity.set.success.multiple", $$4.size()), true);
         }

         return $$4.size();
      }
   }

   private static int a(ep $$0, iz $$1, int $$2, cuk $$3) throws CommandSyntaxException {
      bqi $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         $$4.a($$2, $$3);
         $$0.a(() -> xl.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$3.G()), true);
         return 1;
      } else {
         throw c.create($$2);
      }
   }

   static bqi a(ep $$0, iz $$1, Dynamic3CommandExceptionType $$2) throws CommandSyntaxException {
      dpc $$3 = $$0.e().c_($$1);
      if (!($$3 instanceof bqi)) {
         throw $$2.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bqi)$$3;
      }
   }

   private static int a(ep $$0, Collection<? extends bsp> $$1, int $$2, cuk $$3) throws CommandSyntaxException {
      List<bsp> $$4 = Lists.newArrayListWithCapacity($$1.size());

      for (bsp $$5 : $$1) {
         buc $$6 = $$5.a_($$2);
         if ($$6 != buc.a && $$6.a($$3.s())) {
            $$4.add($$5);
            if ($$5 instanceof arc) {
               ((arc)$$5).cb.d();
            }
         }
      }

      if ($$4.isEmpty()) {
         throw f.create($$3.G(), $$2);
      } else {
         if ($$4.size() == 1) {
            $$0.a(() -> xl.a("commands.item.entity.set.success.single", $$4.iterator().next().O_(), $$3.G()), true);
         } else {
            $$0.a(() -> xl.a("commands.item.entity.set.success.multiple", $$4.size(), $$3.G()), true);
         }

         return $$4.size();
      }
   }

   private static int a(ep $$0, iz $$1, int $$2, Collection<? extends bsp> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(ep $$0, iz $$1, int $$2, Collection<? extends bsp> $$3, int $$4, ji<erq> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(ep $$0, iz $$1, int $$2, iz $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(ep $$0, iz $$1, int $$2, iz $$3, int $$4, ji<erq> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(ep $$0, bsp $$1, int $$2, iz $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(ep $$0, bsp $$1, int $$2, iz $$3, int $$4, ji<erq> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static int a(ep $$0, bsp $$1, int $$2, Collection<? extends bsp> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(ep $$0, bsp $$1, int $$2, Collection<? extends bsp> $$3, int $$4, ji<erq> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static cuk a(ep $$0, ji<erq> $$1, cuk $$2) {
      arb $$3 = $$0.e();
      eqg $$4 = new eqg.a($$3).a(esz.f, $$0.d()).b(esz.a, $$0.f()).a(esy.d);
      eqd $$5 = new eqd.a($$4).a(Optional.empty());
      $$5.b(eqd.a($$1.a()));
      cuk $$6 = $$1.a().apply($$2, $$5);
      $$6.f($$6.j());
      return $$6;
   }

   private static cuk a(bsp $$0, int $$1) throws CommandSyntaxException {
      buc $$2 = $$0.a_($$1);
      if ($$2 == buc.a) {
         throw d.create($$1);
      } else {
         return $$2.a().s();
      }
   }

   private static cuk a(ep $$0, iz $$1, int $$2) throws CommandSyntaxException {
      bqi $$3 = a($$0, $$1, b);
      if ($$2 >= 0 && $$2 < $$3.b()) {
         return $$3.a($$2).s();
      } else {
         throw d.create($$2);
      }
   }
}
