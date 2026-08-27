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

public class ane {
   static final Dynamic3CommandExceptionType a = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xe.b("commands.item.target.not_a_container", $$0, $$1, $$2)
   );
   static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xe.b("commands.item.source.not_a_container", $$0, $$1, $$2)
   );
   static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xe.b("commands.item.target.no_such_slot", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xe.b("commands.item.source.no_such_slot", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xe.b("commands.item.target.no_changes", $$0));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xe.b("commands.item.target.no_changed.known_item", $$0, $$1)
   );
   private static final SuggestionProvider<eh> g = ($$0, $$1) -> {
      ald.b $$2 = ((eh)$$0.getSource()).l().be();
      return em.a($$2.a(li.aV), $$1);
   };

   public static void a(CommandDispatcher<eh> $$0, ed $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("item").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)ei.a("replace")
                        .then(
                           ei.a("block")
                              .then(
                                 ei.a("pos", gd.a())
                                    .then(
                                       ((RequiredArgumentBuilder)ei.a("slot", fp.a())
                                             .then(
                                                ei.a("with")
                                                   .then(
                                                      ((RequiredArgumentBuilder)ei.a("item", gq.a($$1))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (eh)$$0x.getSource(),
                                                                     gd.a($$0x, "pos"),
                                                                     fp.a($$0x, "slot"),
                                                                     gq.a($$0x, "item").a(1, false)
                                                                  )
                                                            ))
                                                         .then(
                                                            ei.a("count", IntegerArgumentType.integer(1, 64))
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (eh)$$0x.getSource(),
                                                                        gd.a($$0x, "pos"),
                                                                        fp.a($$0x, "slot"),
                                                                        gq.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                     )
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)ei.a("from")
                                                   .then(
                                                      ei.a("block")
                                                         .then(
                                                            ei.a("source", gd.a())
                                                               .then(
                                                                  ((RequiredArgumentBuilder)ei.a("sourceSlot", fp.a())
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (eh)$$0x.getSource(),
                                                                                 gd.a($$0x, "source"),
                                                                                 fp.a($$0x, "sourceSlot"),
                                                                                 gd.a($$0x, "pos"),
                                                                                 fp.a($$0x, "slot")
                                                                              )
                                                                        ))
                                                                     .then(
                                                                        ei.a("modifier", fj.b($$1))
                                                                           .suggests(g)
                                                                           .executes(
                                                                              $$0x -> a(
                                                                                    (eh)$$0x.getSource(),
                                                                                    gd.a($$0x, "source"),
                                                                                    fp.a($$0x, "sourceSlot"),
                                                                                    gd.a($$0x, "pos"),
                                                                                    fp.a($$0x, "slot"),
                                                                                    fj.b($$0x, "modifier")
                                                                                 )
                                                                           )
                                                                     )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   ei.a("entity")
                                                      .then(
                                                         ei.a("source", eu.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)ei.a("sourceSlot", fp.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (eh)$$0x.getSource(),
                                                                              eu.a($$0x, "source"),
                                                                              fp.a($$0x, "sourceSlot"),
                                                                              gd.a($$0x, "pos"),
                                                                              fp.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     ei.a("modifier", fj.b($$1))
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (eh)$$0x.getSource(),
                                                                                 eu.a($$0x, "source"),
                                                                                 fp.a($$0x, "sourceSlot"),
                                                                                 gd.a($$0x, "pos"),
                                                                                 fp.a($$0x, "slot"),
                                                                                 fj.b($$0x, "modifier")
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
                        ei.a("entity")
                           .then(
                              ei.a("targets", eu.b())
                                 .then(
                                    ((RequiredArgumentBuilder)ei.a("slot", fp.a())
                                          .then(
                                             ei.a("with")
                                                .then(
                                                   ((RequiredArgumentBuilder)ei.a("item", gq.a($$1))
                                                         .executes(
                                                            $$0x -> a(
                                                                  (eh)$$0x.getSource(),
                                                                  eu.b($$0x, "targets"),
                                                                  fp.a($$0x, "slot"),
                                                                  gq.a($$0x, "item").a(1, false)
                                                               )
                                                         ))
                                                      .then(
                                                         ei.a("count", IntegerArgumentType.integer(1, 64))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (eh)$$0x.getSource(),
                                                                     eu.b($$0x, "targets"),
                                                                     fp.a($$0x, "slot"),
                                                                     gq.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                  )
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)ei.a("from")
                                                .then(
                                                   ei.a("block")
                                                      .then(
                                                         ei.a("source", gd.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)ei.a("sourceSlot", fp.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (eh)$$0x.getSource(),
                                                                              gd.a($$0x, "source"),
                                                                              fp.a($$0x, "sourceSlot"),
                                                                              eu.b($$0x, "targets"),
                                                                              fp.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     ei.a("modifier", fj.b($$1))
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (eh)$$0x.getSource(),
                                                                                 gd.a($$0x, "source"),
                                                                                 fp.a($$0x, "sourceSlot"),
                                                                                 eu.b($$0x, "targets"),
                                                                                 fp.a($$0x, "slot"),
                                                                                 fj.b($$0x, "modifier")
                                                                              )
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                ei.a("entity")
                                                   .then(
                                                      ei.a("source", eu.a())
                                                         .then(
                                                            ((RequiredArgumentBuilder)ei.a("sourceSlot", fp.a())
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (eh)$$0x.getSource(),
                                                                           eu.a($$0x, "source"),
                                                                           fp.a($$0x, "sourceSlot"),
                                                                           eu.b($$0x, "targets"),
                                                                           fp.a($$0x, "slot")
                                                                        )
                                                                  ))
                                                               .then(
                                                                  ei.a("modifier", fj.b($$1))
                                                                     .suggests(g)
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (eh)$$0x.getSource(),
                                                                              eu.a($$0x, "source"),
                                                                              fp.a($$0x, "sourceSlot"),
                                                                              eu.b($$0x, "targets"),
                                                                              fp.a($$0x, "slot"),
                                                                              fj.b($$0x, "modifier")
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
               ((LiteralArgumentBuilder)ei.a("modify")
                     .then(
                        ei.a("block")
                           .then(
                              ei.a("pos", gd.a())
                                 .then(
                                    ei.a("slot", fp.a())
                                       .then(
                                          ei.a("modifier", fj.b($$1))
                                             .suggests(g)
                                             .executes($$0x -> a((eh)$$0x.getSource(), gd.a($$0x, "pos"), fp.a($$0x, "slot"), fj.b($$0x, "modifier")))
                                       )
                                 )
                           )
                     ))
                  .then(
                     ei.a("entity")
                        .then(
                           ei.a("targets", eu.b())
                              .then(
                                 ei.a("slot", fp.a())
                                    .then(
                                       ei.a("modifier", fj.b($$1))
                                          .suggests(g)
                                          .executes($$0x -> a((eh)$$0x.getSource(), eu.b($$0x, "targets"), fp.a($$0x, "slot"), fj.b($$0x, "modifier")))
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(eh $$0, ir $$1, int $$2, ja<etb> $$3) throws CommandSyntaxException {
      bpt $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         cuh $$5 = a($$0, $$3, $$4.a($$2));
         $$4.a($$2, $$5);
         $$0.a(() -> xe.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$5.E()), true);
         return 1;
      } else {
         throw c.create($$2);
      }
   }

   private static int a(eh $$0, Collection<? extends brv> $$1, int $$2, ja<etb> $$3) throws CommandSyntaxException {
      Map<brv, cuh> $$4 = Maps.newHashMapWithExpectedSize($$1.size());

      for (brv $$5 : $$1) {
         btf $$6 = $$5.a_($$2);
         if ($$6 != btf.b) {
            cuh $$7 = a($$0, $$3, $$6.a().r());
            if ($$6.a($$7)) {
               $$4.put($$5, $$7);
               if ($$5 instanceof aqu) {
                  ((aqu)$$5).cq.d();
               }
            }
         }
      }

      if ($$4.isEmpty()) {
         throw e.create($$2);
      } else {
         if ($$4.size() == 1) {
            Entry<brv, cuh> $$8 = $$4.entrySet().iterator().next();
            $$0.a(() -> xe.a("commands.item.entity.set.success.single", $$8.getKey().P_(), $$8.getValue().E()), true);
         } else {
            $$0.a(() -> xe.a("commands.item.entity.set.success.multiple", $$4.size()), true);
         }

         return $$4.size();
      }
   }

   private static int a(eh $$0, ir $$1, int $$2, cuh $$3) throws CommandSyntaxException {
      bpt $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         $$4.a($$2, $$3);
         $$0.a(() -> xe.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$3.E()), true);
         return 1;
      } else {
         throw c.create($$2);
      }
   }

   static bpt a(eh $$0, ir $$1, Dynamic3CommandExceptionType $$2) throws CommandSyntaxException {
      dqc $$3 = $$0.e().c_($$1);
      if (!($$3 instanceof bpt)) {
         throw $$2.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bpt)$$3;
      }
   }

   private static int a(eh $$0, Collection<? extends brv> $$1, int $$2, cuh $$3) throws CommandSyntaxException {
      List<brv> $$4 = Lists.newArrayListWithCapacity($$1.size());

      for (brv $$5 : $$1) {
         btf $$6 = $$5.a_($$2);
         if ($$6 != btf.b && $$6.a($$3.r())) {
            $$4.add($$5);
            if ($$5 instanceof aqu) {
               ((aqu)$$5).cq.d();
            }
         }
      }

      if ($$4.isEmpty()) {
         throw f.create($$3.E(), $$2);
      } else {
         if ($$4.size() == 1) {
            $$0.a(() -> xe.a("commands.item.entity.set.success.single", $$4.iterator().next().P_(), $$3.E()), true);
         } else {
            $$0.a(() -> xe.a("commands.item.entity.set.success.multiple", $$4.size(), $$3.E()), true);
         }

         return $$4.size();
      }
   }

   private static int a(eh $$0, ir $$1, int $$2, Collection<? extends brv> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(eh $$0, ir $$1, int $$2, Collection<? extends brv> $$3, int $$4, ja<etb> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(eh $$0, ir $$1, int $$2, ir $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(eh $$0, ir $$1, int $$2, ir $$3, int $$4, ja<etb> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(eh $$0, brv $$1, int $$2, ir $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(eh $$0, brv $$1, int $$2, ir $$3, int $$4, ja<etb> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static int a(eh $$0, brv $$1, int $$2, Collection<? extends brv> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(eh $$0, brv $$1, int $$2, Collection<? extends brv> $$3, int $$4, ja<etb> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static cuh a(eh $$0, ja<etb> $$1, cuh $$2) {
      aqt $$3 = $$0.e();
      ers $$4 = new ers.a($$3).a(eug.f, $$0.d()).b(eug.a, $$0.f()).a(euf.d);
      erp $$5 = new erp.a($$4).a(Optional.empty());
      $$5.b(erp.a($$1.a()));
      return $$1.a().apply($$2, $$5);
   }

   private static cuh a(brv $$0, int $$1) throws CommandSyntaxException {
      btf $$2 = $$0.a_($$1);
      if ($$2 == btf.b) {
         throw d.create($$1);
      } else {
         return $$2.a().r();
      }
   }

   private static cuh a(eh $$0, ir $$1, int $$2) throws CommandSyntaxException {
      bpt $$3 = a($$0, $$1, b);
      if ($$2 >= 0 && $$2 < $$3.b()) {
         return $$3.a($$2).r();
      } else {
         throw d.create($$2);
      }
   }
}
