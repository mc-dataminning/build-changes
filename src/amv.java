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

public class amv {
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
   private static final SuggestionProvider<eq> g = ($$0, $$1) -> {
      aku.b $$2 = ((eq)$$0.getSource()).l().be();
      return ev.a($$2.a(lr.bc), $$1);
   };

   public static void a(CommandDispatcher<eq> $$0, em $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("item").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)er.a("replace")
                        .then(
                           er.a("block")
                              .then(
                                 er.a("pos", gm.a())
                                    .then(
                                       ((RequiredArgumentBuilder)er.a("slot", fy.a())
                                             .then(
                                                er.a("with")
                                                   .then(
                                                      ((RequiredArgumentBuilder)er.a("item", gz.a($$1))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (eq)$$0x.getSource(),
                                                                     gm.a($$0x, "pos"),
                                                                     fy.a($$0x, "slot"),
                                                                     gz.a($$0x, "item").a(1, false)
                                                                  )
                                                            ))
                                                         .then(
                                                            er.a("count", IntegerArgumentType.integer(1, 99))
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (eq)$$0x.getSource(),
                                                                        gm.a($$0x, "pos"),
                                                                        fy.a($$0x, "slot"),
                                                                        gz.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                     )
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)er.a("from")
                                                   .then(
                                                      er.a("block")
                                                         .then(
                                                            er.a("source", gm.a())
                                                               .then(
                                                                  ((RequiredArgumentBuilder)er.a("sourceSlot", fy.a())
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (eq)$$0x.getSource(),
                                                                                 gm.a($$0x, "source"),
                                                                                 fy.a($$0x, "sourceSlot"),
                                                                                 gm.a($$0x, "pos"),
                                                                                 fy.a($$0x, "slot")
                                                                              )
                                                                        ))
                                                                     .then(
                                                                        er.a("modifier", fs.b($$1))
                                                                           .suggests(g)
                                                                           .executes(
                                                                              $$0x -> a(
                                                                                    (eq)$$0x.getSource(),
                                                                                    gm.a($$0x, "source"),
                                                                                    fy.a($$0x, "sourceSlot"),
                                                                                    gm.a($$0x, "pos"),
                                                                                    fy.a($$0x, "slot"),
                                                                                    fs.b($$0x, "modifier")
                                                                                 )
                                                                           )
                                                                     )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   er.a("entity")
                                                      .then(
                                                         er.a("source", fd.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)er.a("sourceSlot", fy.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (eq)$$0x.getSource(),
                                                                              fd.a($$0x, "source"),
                                                                              fy.a($$0x, "sourceSlot"),
                                                                              gm.a($$0x, "pos"),
                                                                              fy.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     er.a("modifier", fs.b($$1))
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (eq)$$0x.getSource(),
                                                                                 fd.a($$0x, "source"),
                                                                                 fy.a($$0x, "sourceSlot"),
                                                                                 gm.a($$0x, "pos"),
                                                                                 fy.a($$0x, "slot"),
                                                                                 fs.b($$0x, "modifier")
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
                        er.a("entity")
                           .then(
                              er.a("targets", fd.b())
                                 .then(
                                    ((RequiredArgumentBuilder)er.a("slot", fy.a())
                                          .then(
                                             er.a("with")
                                                .then(
                                                   ((RequiredArgumentBuilder)er.a("item", gz.a($$1))
                                                         .executes(
                                                            $$0x -> a(
                                                                  (eq)$$0x.getSource(),
                                                                  fd.b($$0x, "targets"),
                                                                  fy.a($$0x, "slot"),
                                                                  gz.a($$0x, "item").a(1, false)
                                                               )
                                                         ))
                                                      .then(
                                                         er.a("count", IntegerArgumentType.integer(1, 99))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (eq)$$0x.getSource(),
                                                                     fd.b($$0x, "targets"),
                                                                     fy.a($$0x, "slot"),
                                                                     gz.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                  )
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)er.a("from")
                                                .then(
                                                   er.a("block")
                                                      .then(
                                                         er.a("source", gm.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)er.a("sourceSlot", fy.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (eq)$$0x.getSource(),
                                                                              gm.a($$0x, "source"),
                                                                              fy.a($$0x, "sourceSlot"),
                                                                              fd.b($$0x, "targets"),
                                                                              fy.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     er.a("modifier", fs.b($$1))
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (eq)$$0x.getSource(),
                                                                                 gm.a($$0x, "source"),
                                                                                 fy.a($$0x, "sourceSlot"),
                                                                                 fd.b($$0x, "targets"),
                                                                                 fy.a($$0x, "slot"),
                                                                                 fs.b($$0x, "modifier")
                                                                              )
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                er.a("entity")
                                                   .then(
                                                      er.a("source", fd.a())
                                                         .then(
                                                            ((RequiredArgumentBuilder)er.a("sourceSlot", fy.a())
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (eq)$$0x.getSource(),
                                                                           fd.a($$0x, "source"),
                                                                           fy.a($$0x, "sourceSlot"),
                                                                           fd.b($$0x, "targets"),
                                                                           fy.a($$0x, "slot")
                                                                        )
                                                                  ))
                                                               .then(
                                                                  er.a("modifier", fs.b($$1))
                                                                     .suggests(g)
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (eq)$$0x.getSource(),
                                                                              fd.a($$0x, "source"),
                                                                              fy.a($$0x, "sourceSlot"),
                                                                              fd.b($$0x, "targets"),
                                                                              fy.a($$0x, "slot"),
                                                                              fs.b($$0x, "modifier")
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
               ((LiteralArgumentBuilder)er.a("modify")
                     .then(
                        er.a("block")
                           .then(
                              er.a("pos", gm.a())
                                 .then(
                                    er.a("slot", fy.a())
                                       .then(
                                          er.a("modifier", fs.b($$1))
                                             .suggests(g)
                                             .executes($$0x -> a((eq)$$0x.getSource(), gm.a($$0x, "pos"), fy.a($$0x, "slot"), fs.b($$0x, "modifier")))
                                       )
                                 )
                           )
                     ))
                  .then(
                     er.a("entity")
                        .then(
                           er.a("targets", fd.b())
                              .then(
                                 er.a("slot", fy.a())
                                    .then(
                                       er.a("modifier", fs.b($$1))
                                          .suggests(g)
                                          .executes($$0x -> a((eq)$$0x.getSource(), fd.b($$0x, "targets"), fy.a($$0x, "slot"), fs.b($$0x, "modifier")))
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(eq $$0, ja $$1, int $$2, jj<esc> $$3) throws CommandSyntaxException {
      bpw $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         cua $$5 = a($$0, $$3, $$4.a($$2));
         $$4.a($$2, $$5);
         $$0.a(() -> wu.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$5.F()), true);
         return 1;
      } else {
         throw c.create($$2);
      }
   }

   private static int a(eq $$0, Collection<? extends bsd> $$1, int $$2, jj<esc> $$3) throws CommandSyntaxException {
      Map<bsd, cua> $$4 = Maps.newHashMapWithExpectedSize($$1.size());

      for (bsd $$5 : $$1) {
         btq $$6 = $$5.a_($$2);
         if ($$6 != btq.a) {
            cua $$7 = a($$0, $$3, $$6.a().s());
            if ($$6.a($$7)) {
               $$4.put($$5, $$7);
               if ($$5 instanceof aql) {
                  ((aql)$$5).cd.d();
               }
            }
         }
      }

      if ($$4.isEmpty()) {
         throw e.create($$2);
      } else {
         if ($$4.size() == 1) {
            Entry<bsd, cua> $$8 = $$4.entrySet().iterator().next();
            $$0.a(() -> wu.a("commands.item.entity.set.success.single", $$8.getKey().O_(), $$8.getValue().F()), true);
         } else {
            $$0.a(() -> wu.a("commands.item.entity.set.success.multiple", $$4.size()), true);
         }

         return $$4.size();
      }
   }

   private static int a(eq $$0, ja $$1, int $$2, cua $$3) throws CommandSyntaxException {
      bpw $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         $$4.a($$2, $$3);
         $$0.a(() -> wu.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$3.F()), true);
         return 1;
      } else {
         throw c.create($$2);
      }
   }

   static bpw a(eq $$0, ja $$1, Dynamic3CommandExceptionType $$2) throws CommandSyntaxException {
      dpn $$3 = $$0.e().c_($$1);
      if (!($$3 instanceof bpw)) {
         throw $$2.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bpw)$$3;
      }
   }

   private static int a(eq $$0, Collection<? extends bsd> $$1, int $$2, cua $$3) throws CommandSyntaxException {
      List<bsd> $$4 = Lists.newArrayListWithCapacity($$1.size());

      for (bsd $$5 : $$1) {
         btq $$6 = $$5.a_($$2);
         if ($$6 != btq.a && $$6.a($$3.s())) {
            $$4.add($$5);
            if ($$5 instanceof aql) {
               ((aql)$$5).cd.d();
            }
         }
      }

      if ($$4.isEmpty()) {
         throw f.create($$3.F(), $$2);
      } else {
         if ($$4.size() == 1) {
            $$0.a(() -> wu.a("commands.item.entity.set.success.single", $$4.iterator().next().O_(), $$3.F()), true);
         } else {
            $$0.a(() -> wu.a("commands.item.entity.set.success.multiple", $$4.size(), $$3.F()), true);
         }

         return $$4.size();
      }
   }

   private static int a(eq $$0, ja $$1, int $$2, Collection<? extends bsd> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(eq $$0, ja $$1, int $$2, Collection<? extends bsd> $$3, int $$4, jj<esc> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(eq $$0, ja $$1, int $$2, ja $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(eq $$0, ja $$1, int $$2, ja $$3, int $$4, jj<esc> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(eq $$0, bsd $$1, int $$2, ja $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(eq $$0, bsd $$1, int $$2, ja $$3, int $$4, jj<esc> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static int a(eq $$0, bsd $$1, int $$2, Collection<? extends bsd> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(eq $$0, bsd $$1, int $$2, Collection<? extends bsd> $$3, int $$4, jj<esc> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static cua a(eq $$0, jj<esc> $$1, cua $$2) {
      aqk $$3 = $$0.e();
      eqr $$4 = new eqr.a($$3).a(etk.f, $$0.d()).b(etk.a, $$0.f()).a(etj.d);
      eqo $$5 = new eqo.a($$4).a(Optional.empty());
      $$5.b(eqo.a($$1.a()));
      cua $$6 = $$1.a().apply($$2, $$5);
      $$6.f($$6.j());
      return $$6;
   }

   private static cua a(bsd $$0, int $$1) throws CommandSyntaxException {
      btq $$2 = $$0.a_($$1);
      if ($$2 == btq.a) {
         throw d.create($$1);
      } else {
         return $$2.a().s();
      }
   }

   private static cua a(eq $$0, ja $$1, int $$2) throws CommandSyntaxException {
      bpw $$3 = a($$0, $$1, b);
      if ($$2 >= 0 && $$2 < $$3.b()) {
         return $$3.a($$2).s();
      } else {
         throw d.create($$2);
      }
   }
}
