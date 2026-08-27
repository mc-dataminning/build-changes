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

public class amf {
   static final Dynamic3CommandExceptionType a = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wi.b("commands.item.target.not_a_container", $$0, $$1, $$2)
   );
   static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wi.b("commands.item.source.not_a_container", $$0, $$1, $$2)
   );
   static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wi.b("commands.item.target.no_such_slot", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wi.b("commands.item.source.no_such_slot", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> wi.b("commands.item.target.no_changes", $$0));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> wi.b("commands.item.target.no_changed.known_item", $$0, $$1)
   );
   private static final SuggestionProvider<dv> g = ($$0, $$1) -> {
      enn $$2 = ((dv)$$0.getSource()).l().aM();
      return ea.a($$2.a(enp.b), $$1);
   };

   public static void a(CommandDispatcher<dv> $$0, dr $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("item").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)dw.a("replace")
                        .then(
                           dw.a("block")
                              .then(
                                 dw.a("pos", fq.a())
                                    .then(
                                       ((RequiredArgumentBuilder)dw.a("slot", fc.a())
                                             .then(
                                                dw.a("with")
                                                   .then(
                                                      ((RequiredArgumentBuilder)dw.a("item", gc.a($$1))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (dv)$$0x.getSource(),
                                                                     fq.a($$0x, "pos"),
                                                                     fc.a($$0x, "slot"),
                                                                     gc.a($$0x, "item").a(1, false)
                                                                  )
                                                            ))
                                                         .then(
                                                            dw.a("count", IntegerArgumentType.integer(1, 64))
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (dv)$$0x.getSource(),
                                                                        fq.a($$0x, "pos"),
                                                                        fc.a($$0x, "slot"),
                                                                        gc.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                     )
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)dw.a("from")
                                                   .then(
                                                      dw.a("block")
                                                         .then(
                                                            dw.a("source", fq.a())
                                                               .then(
                                                                  ((RequiredArgumentBuilder)dw.a("sourceSlot", fc.a())
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (dv)$$0x.getSource(),
                                                                                 fq.a($$0x, "source"),
                                                                                 fc.a($$0x, "sourceSlot"),
                                                                                 fq.a($$0x, "pos"),
                                                                                 fc.a($$0x, "slot")
                                                                              )
                                                                        ))
                                                                     .then(
                                                                        dw.a("modifier", ew.a())
                                                                           .suggests(g)
                                                                           .executes(
                                                                              $$0x -> a(
                                                                                    (dv)$$0x.getSource(),
                                                                                    fq.a($$0x, "source"),
                                                                                    fc.a($$0x, "sourceSlot"),
                                                                                    fq.a($$0x, "pos"),
                                                                                    fc.a($$0x, "slot"),
                                                                                    ew.d($$0x, "modifier")
                                                                                 )
                                                                           )
                                                                     )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   dw.a("entity")
                                                      .then(
                                                         dw.a("source", ei.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)dw.a("sourceSlot", fc.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (dv)$$0x.getSource(),
                                                                              ei.a($$0x, "source"),
                                                                              fc.a($$0x, "sourceSlot"),
                                                                              fq.a($$0x, "pos"),
                                                                              fc.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     dw.a("modifier", ew.a())
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (dv)$$0x.getSource(),
                                                                                 ei.a($$0x, "source"),
                                                                                 fc.a($$0x, "sourceSlot"),
                                                                                 fq.a($$0x, "pos"),
                                                                                 fc.a($$0x, "slot"),
                                                                                 ew.d($$0x, "modifier")
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
                        dw.a("entity")
                           .then(
                              dw.a("targets", ei.b())
                                 .then(
                                    ((RequiredArgumentBuilder)dw.a("slot", fc.a())
                                          .then(
                                             dw.a("with")
                                                .then(
                                                   ((RequiredArgumentBuilder)dw.a("item", gc.a($$1))
                                                         .executes(
                                                            $$0x -> a(
                                                                  (dv)$$0x.getSource(),
                                                                  ei.b($$0x, "targets"),
                                                                  fc.a($$0x, "slot"),
                                                                  gc.a($$0x, "item").a(1, false)
                                                               )
                                                         ))
                                                      .then(
                                                         dw.a("count", IntegerArgumentType.integer(1, 64))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (dv)$$0x.getSource(),
                                                                     ei.b($$0x, "targets"),
                                                                     fc.a($$0x, "slot"),
                                                                     gc.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                  )
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)dw.a("from")
                                                .then(
                                                   dw.a("block")
                                                      .then(
                                                         dw.a("source", fq.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)dw.a("sourceSlot", fc.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (dv)$$0x.getSource(),
                                                                              fq.a($$0x, "source"),
                                                                              fc.a($$0x, "sourceSlot"),
                                                                              ei.b($$0x, "targets"),
                                                                              fc.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     dw.a("modifier", ew.a())
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (dv)$$0x.getSource(),
                                                                                 fq.a($$0x, "source"),
                                                                                 fc.a($$0x, "sourceSlot"),
                                                                                 ei.b($$0x, "targets"),
                                                                                 fc.a($$0x, "slot"),
                                                                                 ew.d($$0x, "modifier")
                                                                              )
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                dw.a("entity")
                                                   .then(
                                                      dw.a("source", ei.a())
                                                         .then(
                                                            ((RequiredArgumentBuilder)dw.a("sourceSlot", fc.a())
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (dv)$$0x.getSource(),
                                                                           ei.a($$0x, "source"),
                                                                           fc.a($$0x, "sourceSlot"),
                                                                           ei.b($$0x, "targets"),
                                                                           fc.a($$0x, "slot")
                                                                        )
                                                                  ))
                                                               .then(
                                                                  dw.a("modifier", ew.a())
                                                                     .suggests(g)
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (dv)$$0x.getSource(),
                                                                              ei.a($$0x, "source"),
                                                                              fc.a($$0x, "sourceSlot"),
                                                                              ei.b($$0x, "targets"),
                                                                              fc.a($$0x, "slot"),
                                                                              ew.d($$0x, "modifier")
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
               ((LiteralArgumentBuilder)dw.a("modify")
                     .then(
                        dw.a("block")
                           .then(
                              dw.a("pos", fq.a())
                                 .then(
                                    dw.a("slot", fc.a())
                                       .then(
                                          dw.a("modifier", ew.a())
                                             .suggests(g)
                                             .executes($$0x -> a((dv)$$0x.getSource(), fq.a($$0x, "pos"), fc.a($$0x, "slot"), ew.d($$0x, "modifier")))
                                       )
                                 )
                           )
                     ))
                  .then(
                     dw.a("entity")
                        .then(
                           dw.a("targets", ei.b())
                              .then(
                                 dw.a("slot", fc.a())
                                    .then(
                                       dw.a("modifier", ew.a())
                                          .suggests(g)
                                          .executes($$0x -> a((dv)$$0x.getSource(), ei.b($$0x, "targets"), fc.a($$0x, "slot"), ew.d($$0x, "modifier")))
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(dv $$0, id $$1, int $$2, eoy $$3) throws CommandSyntaxException {
      bny $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         crs $$5 = a($$0, $$3, $$4.a($$2));
         $$4.a($$2, $$5);
         $$0.a(() -> wi.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$5.E()), true);
         return 1;
      } else {
         throw c.create($$2);
      }
   }

   private static int a(dv $$0, Collection<? extends bqa> $$1, int $$2, eoy $$3) throws CommandSyntaxException {
      Map<bqa, crs> $$4 = Maps.newHashMapWithExpectedSize($$1.size());

      for (bqa $$5 : $$1) {
         brk $$6 = $$5.a_($$2);
         if ($$6 != brk.b) {
            crs $$7 = a($$0, $$3, $$6.a().r());
            if ($$6.a($$7)) {
               $$4.put($$5, $$7);
               if ($$5 instanceof apv) {
                  ((apv)$$5).ca.d();
               }
            }
         }
      }

      if ($$4.isEmpty()) {
         throw e.create($$2);
      } else {
         if ($$4.size() == 1) {
            Entry<bqa, crs> $$8 = $$4.entrySet().iterator().next();
            $$0.a(() -> wi.a("commands.item.entity.set.success.single", $$8.getKey().O_(), $$8.getValue().E()), true);
         } else {
            $$0.a(() -> wi.a("commands.item.entity.set.success.multiple", $$4.size()), true);
         }

         return $$4.size();
      }
   }

   private static int a(dv $$0, id $$1, int $$2, crs $$3) throws CommandSyntaxException {
      bny $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         $$4.a($$2, $$3);
         $$0.a(() -> wi.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$3.E()), true);
         return 1;
      } else {
         throw c.create($$2);
      }
   }

   static bny a(dv $$0, id $$1, Dynamic3CommandExceptionType $$2) throws CommandSyntaxException {
      dmo $$3 = $$0.e().c_($$1);
      if (!($$3 instanceof bny)) {
         throw $$2.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bny)$$3;
      }
   }

   private static int a(dv $$0, Collection<? extends bqa> $$1, int $$2, crs $$3) throws CommandSyntaxException {
      List<bqa> $$4 = Lists.newArrayListWithCapacity($$1.size());

      for (bqa $$5 : $$1) {
         brk $$6 = $$5.a_($$2);
         if ($$6 != brk.b && $$6.a($$3.r())) {
            $$4.add($$5);
            if ($$5 instanceof apv) {
               ((apv)$$5).ca.d();
            }
         }
      }

      if ($$4.isEmpty()) {
         throw f.create($$3.E(), $$2);
      } else {
         if ($$4.size() == 1) {
            $$0.a(() -> wi.a("commands.item.entity.set.success.single", $$4.iterator().next().O_(), $$3.E()), true);
         } else {
            $$0.a(() -> wi.a("commands.item.entity.set.success.multiple", $$4.size(), $$3.E()), true);
         }

         return $$4.size();
      }
   }

   private static int a(dv $$0, id $$1, int $$2, Collection<? extends bqa> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(dv $$0, id $$1, int $$2, Collection<? extends bqa> $$3, int $$4, eoy $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(dv $$0, id $$1, int $$2, id $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(dv $$0, id $$1, int $$2, id $$3, int $$4, eoy $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(dv $$0, bqa $$1, int $$2, id $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(dv $$0, bqa $$1, int $$2, id $$3, int $$4, eoy $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static int a(dv $$0, bqa $$1, int $$2, Collection<? extends bqa> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(dv $$0, bqa $$1, int $$2, Collection<? extends bqa> $$3, int $$4, eoy $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static crs a(dv $$0, eoy $$1, crs $$2) {
      apu $$3 = $$0.e();
      enq $$4 = new enq.a($$3).a(epx.f, $$0.d()).b(epx.a, $$0.f()).a(epw.d);
      enk $$5 = new enk.a($$4).a(Optional.empty());
      $$5.b(enk.a($$1));
      return $$1.apply($$2, $$5);
   }

   private static crs a(bqa $$0, int $$1) throws CommandSyntaxException {
      brk $$2 = $$0.a_($$1);
      if ($$2 == brk.b) {
         throw d.create($$1);
      } else {
         return $$2.a().r();
      }
   }

   private static crs a(dv $$0, id $$1, int $$2) throws CommandSyntaxException {
      bny $$3 = a($$0, $$1, b);
      if ($$2 >= 0 && $$2 < $$3.b()) {
         return $$3.a($$2).r();
      } else {
         throw d.create($$2);
      }
   }
}
