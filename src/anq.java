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

public class anq {
   static final Dynamic3CommandExceptionType a = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xp.b("commands.item.target.not_a_container", $$0, $$1, $$2)
   );
   static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xp.b("commands.item.source.not_a_container", $$0, $$1, $$2)
   );
   static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xp.b("commands.item.target.no_such_slot", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xp.b("commands.item.source.no_such_slot", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xp.b("commands.item.target.no_changes", $$0));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xp.b("commands.item.target.no_changed.known_item", $$0, $$1)
   );
   private static final SuggestionProvider<ep> g = ($$0, $$1) -> {
      alp.b $$2 = ((ep)$$0.getSource()).l().be();
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

   private static int a(ep $$0, iz $$1, int $$2, ji<erv> $$3) throws CommandSyntaxException {
      bqn $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         cup $$5 = a($$0, $$3, $$4.a($$2));
         $$4.a($$2, $$5);
         $$0.a(() -> xp.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$5.G()), true);
         return 1;
      } else {
         throw c.create($$2);
      }
   }

   private static int a(ep $$0, Collection<? extends bsu> $$1, int $$2, ji<erv> $$3) throws CommandSyntaxException {
      Map<bsu, cup> $$4 = Maps.newHashMapWithExpectedSize($$1.size());

      for (bsu $$5 : $$1) {
         buh $$6 = $$5.a_($$2);
         if ($$6 != buh.a) {
            cup $$7 = a($$0, $$3, $$6.a().s());
            if ($$6.a($$7)) {
               $$4.put($$5, $$7);
               if ($$5 instanceof arg) {
                  ((arg)$$5).cb.d();
               }
            }
         }
      }

      if ($$4.isEmpty()) {
         throw e.create($$2);
      } else {
         if ($$4.size() == 1) {
            Entry<bsu, cup> $$8 = $$4.entrySet().iterator().next();
            $$0.a(() -> xp.a("commands.item.entity.set.success.single", $$8.getKey().O_(), $$8.getValue().G()), true);
         } else {
            $$0.a(() -> xp.a("commands.item.entity.set.success.multiple", $$4.size()), true);
         }

         return $$4.size();
      }
   }

   private static int a(ep $$0, iz $$1, int $$2, cup $$3) throws CommandSyntaxException {
      bqn $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         $$4.a($$2, $$3);
         $$0.a(() -> xp.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$3.G()), true);
         return 1;
      } else {
         throw c.create($$2);
      }
   }

   static bqn a(ep $$0, iz $$1, Dynamic3CommandExceptionType $$2) throws CommandSyntaxException {
      dph $$3 = $$0.e().c_($$1);
      if (!($$3 instanceof bqn)) {
         throw $$2.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bqn)$$3;
      }
   }

   private static int a(ep $$0, Collection<? extends bsu> $$1, int $$2, cup $$3) throws CommandSyntaxException {
      List<bsu> $$4 = Lists.newArrayListWithCapacity($$1.size());

      for (bsu $$5 : $$1) {
         buh $$6 = $$5.a_($$2);
         if ($$6 != buh.a && $$6.a($$3.s())) {
            $$4.add($$5);
            if ($$5 instanceof arg) {
               ((arg)$$5).cb.d();
            }
         }
      }

      if ($$4.isEmpty()) {
         throw f.create($$3.G(), $$2);
      } else {
         if ($$4.size() == 1) {
            $$0.a(() -> xp.a("commands.item.entity.set.success.single", $$4.iterator().next().O_(), $$3.G()), true);
         } else {
            $$0.a(() -> xp.a("commands.item.entity.set.success.multiple", $$4.size(), $$3.G()), true);
         }

         return $$4.size();
      }
   }

   private static int a(ep $$0, iz $$1, int $$2, Collection<? extends bsu> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(ep $$0, iz $$1, int $$2, Collection<? extends bsu> $$3, int $$4, ji<erv> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(ep $$0, iz $$1, int $$2, iz $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(ep $$0, iz $$1, int $$2, iz $$3, int $$4, ji<erv> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(ep $$0, bsu $$1, int $$2, iz $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(ep $$0, bsu $$1, int $$2, iz $$3, int $$4, ji<erv> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static int a(ep $$0, bsu $$1, int $$2, Collection<? extends bsu> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(ep $$0, bsu $$1, int $$2, Collection<? extends bsu> $$3, int $$4, ji<erv> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static cup a(ep $$0, ji<erv> $$1, cup $$2) {
      arf $$3 = $$0.e();
      eql $$4 = new eql.a($$3).a(ete.f, $$0.d()).b(ete.a, $$0.f()).a(etd.d);
      eqi $$5 = new eqi.a($$4).a(Optional.empty());
      $$5.b(eqi.a($$1.a()));
      cup $$6 = $$1.a().apply($$2, $$5);
      $$6.f($$6.j());
      return $$6;
   }

   private static cup a(bsu $$0, int $$1) throws CommandSyntaxException {
      buh $$2 = $$0.a_($$1);
      if ($$2 == buh.a) {
         throw d.create($$1);
      } else {
         return $$2.a().s();
      }
   }

   private static cup a(ep $$0, iz $$1, int $$2) throws CommandSyntaxException {
      bqn $$3 = a($$0, $$1, b);
      if ($$2 >= 0 && $$2 < $$3.b()) {
         return $$3.a($$2).s();
      } else {
         throw d.create($$2);
      }
   }
}
