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

public class anw {
   static final Dynamic3CommandExceptionType a = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xa.b("commands.item.target.not_a_container", $$0, $$1, $$2)
   );
   static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xa.b("commands.item.source.not_a_container", $$0, $$1, $$2)
   );
   static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xa.b("commands.item.target.no_such_slot", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xa.b("commands.item.source.no_such_slot", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xa.b("commands.item.target.no_changes", $$0));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xa.b("commands.item.target.no_changed.known_item", $$0, $$1)
   );
   private static final SuggestionProvider<ej> g = ($$0, $$1) -> {
      als.a $$2 = ((ej)$$0.getSource()).l().bc();
      return eo.a($$2.a(mh.bs), $$1);
   };

   public static void a(CommandDispatcher<ej> $$0, ef $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("item").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)ek.a("replace")
                        .then(
                           ek.a("block")
                              .then(
                                 ek.a("pos", gg.a())
                                    .then(
                                       ((RequiredArgumentBuilder)ek.a("slot", fs.a())
                                             .then(
                                                ek.a("with")
                                                   .then(
                                                      ((RequiredArgumentBuilder)ek.a("item", gt.a($$1))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ej)$$0x.getSource(),
                                                                     gg.a($$0x, "pos"),
                                                                     fs.a($$0x, "slot"),
                                                                     gt.a($$0x, "item").a(1, false)
                                                                  )
                                                            ))
                                                         .then(
                                                            ek.a("count", IntegerArgumentType.integer(1, 99))
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (ej)$$0x.getSource(),
                                                                        gg.a($$0x, "pos"),
                                                                        fs.a($$0x, "slot"),
                                                                        gt.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                     )
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)ek.a("from")
                                                   .then(
                                                      ek.a("block")
                                                         .then(
                                                            ek.a("source", gg.a())
                                                               .then(
                                                                  ((RequiredArgumentBuilder)ek.a("sourceSlot", fs.a())
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ej)$$0x.getSource(),
                                                                                 gg.a($$0x, "source"),
                                                                                 fs.a($$0x, "sourceSlot"),
                                                                                 gg.a($$0x, "pos"),
                                                                                 fs.a($$0x, "slot")
                                                                              )
                                                                        ))
                                                                     .then(
                                                                        ek.a("modifier", fl.b($$1))
                                                                           .suggests(g)
                                                                           .executes(
                                                                              $$0x -> a(
                                                                                    (ej)$$0x.getSource(),
                                                                                    gg.a($$0x, "source"),
                                                                                    fs.a($$0x, "sourceSlot"),
                                                                                    gg.a($$0x, "pos"),
                                                                                    fs.a($$0x, "slot"),
                                                                                    fl.b($$0x, "modifier")
                                                                                 )
                                                                           )
                                                                     )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   ek.a("entity")
                                                      .then(
                                                         ek.a("source", ew.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)ek.a("sourceSlot", fs.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ej)$$0x.getSource(),
                                                                              ew.a($$0x, "source"),
                                                                              fs.a($$0x, "sourceSlot"),
                                                                              gg.a($$0x, "pos"),
                                                                              fs.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     ek.a("modifier", fl.b($$1))
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ej)$$0x.getSource(),
                                                                                 ew.a($$0x, "source"),
                                                                                 fs.a($$0x, "sourceSlot"),
                                                                                 gg.a($$0x, "pos"),
                                                                                 fs.a($$0x, "slot"),
                                                                                 fl.b($$0x, "modifier")
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
                        ek.a("entity")
                           .then(
                              ek.a("targets", ew.b())
                                 .then(
                                    ((RequiredArgumentBuilder)ek.a("slot", fs.a())
                                          .then(
                                             ek.a("with")
                                                .then(
                                                   ((RequiredArgumentBuilder)ek.a("item", gt.a($$1))
                                                         .executes(
                                                            $$0x -> a(
                                                                  (ej)$$0x.getSource(),
                                                                  ew.b($$0x, "targets"),
                                                                  fs.a($$0x, "slot"),
                                                                  gt.a($$0x, "item").a(1, false)
                                                               )
                                                         ))
                                                      .then(
                                                         ek.a("count", IntegerArgumentType.integer(1, 99))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ej)$$0x.getSource(),
                                                                     ew.b($$0x, "targets"),
                                                                     fs.a($$0x, "slot"),
                                                                     gt.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                  )
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)ek.a("from")
                                                .then(
                                                   ek.a("block")
                                                      .then(
                                                         ek.a("source", gg.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)ek.a("sourceSlot", fs.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ej)$$0x.getSource(),
                                                                              gg.a($$0x, "source"),
                                                                              fs.a($$0x, "sourceSlot"),
                                                                              ew.b($$0x, "targets"),
                                                                              fs.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     ek.a("modifier", fl.b($$1))
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ej)$$0x.getSource(),
                                                                                 gg.a($$0x, "source"),
                                                                                 fs.a($$0x, "sourceSlot"),
                                                                                 ew.b($$0x, "targets"),
                                                                                 fs.a($$0x, "slot"),
                                                                                 fl.b($$0x, "modifier")
                                                                              )
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                ek.a("entity")
                                                   .then(
                                                      ek.a("source", ew.a())
                                                         .then(
                                                            ((RequiredArgumentBuilder)ek.a("sourceSlot", fs.a())
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (ej)$$0x.getSource(),
                                                                           ew.a($$0x, "source"),
                                                                           fs.a($$0x, "sourceSlot"),
                                                                           ew.b($$0x, "targets"),
                                                                           fs.a($$0x, "slot")
                                                                        )
                                                                  ))
                                                               .then(
                                                                  ek.a("modifier", fl.b($$1))
                                                                     .suggests(g)
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ej)$$0x.getSource(),
                                                                              ew.a($$0x, "source"),
                                                                              fs.a($$0x, "sourceSlot"),
                                                                              ew.b($$0x, "targets"),
                                                                              fs.a($$0x, "slot"),
                                                                              fl.b($$0x, "modifier")
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
               ((LiteralArgumentBuilder)ek.a("modify")
                     .then(
                        ek.a("block")
                           .then(
                              ek.a("pos", gg.a())
                                 .then(
                                    ek.a("slot", fs.a())
                                       .then(
                                          ek.a("modifier", fl.b($$1))
                                             .suggests(g)
                                             .executes($$0x -> a((ej)$$0x.getSource(), gg.a($$0x, "pos"), fs.a($$0x, "slot"), fl.b($$0x, "modifier")))
                                       )
                                 )
                           )
                     ))
                  .then(
                     ek.a("entity")
                        .then(
                           ek.a("targets", ew.b())
                              .then(
                                 ek.a("slot", fs.a())
                                    .then(
                                       ek.a("modifier", fl.b($$1))
                                          .suggests(g)
                                          .executes($$0x -> a((ej)$$0x.getSource(), ew.b($$0x, "targets"), fs.a($$0x, "slot"), fl.b($$0x, "modifier")))
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ej $$0, iv $$1, int $$2, jf<fbv> $$3) throws CommandSyntaxException {
      buk $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         czy $$5 = a($$0, $$3, $$4.a($$2));
         $$4.a($$2, $$5);
         $$0.a(() -> xa.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$5.K()), true);
         return 1;
      } else {
         throw c.create($$2);
      }
   }

   private static int a(ej $$0, Collection<? extends bwt> $$1, int $$2, jf<fbv> $$3) throws CommandSyntaxException {
      Map<bwt, czy> $$4 = Maps.newHashMapWithExpectedSize($$1.size());

      for (bwt $$5 : $$1) {
         byl $$6 = $$5.a_($$2);
         if ($$6 != byl.a) {
            czy $$7 = a($$0, $$3, $$6.a().v());
            if ($$6.a($$7)) {
               $$4.put($$5, $$7);
               if ($$5 instanceof art) {
                  ((art)$$5).bR.d();
               }
            }
         }
      }

      if ($$4.isEmpty()) {
         throw e.create($$2);
      } else {
         if ($$4.size() == 1) {
            Entry<bwt, czy> $$8 = $$4.entrySet().iterator().next();
            $$0.a(() -> xa.a("commands.item.entity.set.success.single", $$8.getKey().m_(), $$8.getValue().K()), true);
         } else {
            $$0.a(() -> xa.a("commands.item.entity.set.success.multiple", $$4.size()), true);
         }

         return $$4.size();
      }
   }

   private static int a(ej $$0, iv $$1, int $$2, czy $$3) throws CommandSyntaxException {
      buk $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         $$4.a($$2, $$3);
         $$0.a(() -> xa.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$3.K()), true);
         return 1;
      } else {
         throw c.create($$2);
      }
   }

   static buk a(ej $$0, iv $$1, Dynamic3CommandExceptionType $$2) throws CommandSyntaxException {
      dyc $$3 = $$0.e().c_($$1);
      if (!($$3 instanceof buk)) {
         throw $$2.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (buk)$$3;
      }
   }

   private static int a(ej $$0, Collection<? extends bwt> $$1, int $$2, czy $$3) throws CommandSyntaxException {
      List<bwt> $$4 = Lists.newArrayListWithCapacity($$1.size());

      for (bwt $$5 : $$1) {
         byl $$6 = $$5.a_($$2);
         if ($$6 != byl.a && $$6.a($$3.v())) {
            $$4.add($$5);
            if ($$5 instanceof art) {
               ((art)$$5).bR.d();
            }
         }
      }

      if ($$4.isEmpty()) {
         throw f.create($$3.K(), $$2);
      } else {
         if ($$4.size() == 1) {
            $$0.a(() -> xa.a("commands.item.entity.set.success.single", $$4.iterator().next().m_(), $$3.K()), true);
         } else {
            $$0.a(() -> xa.a("commands.item.entity.set.success.multiple", $$4.size(), $$3.K()), true);
         }

         return $$4.size();
      }
   }

   private static int a(ej $$0, iv $$1, int $$2, Collection<? extends bwt> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(ej $$0, iv $$1, int $$2, Collection<? extends bwt> $$3, int $$4, jf<fbv> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(ej $$0, iv $$1, int $$2, iv $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(ej $$0, iv $$1, int $$2, iv $$3, int $$4, jf<fbv> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(ej $$0, bwt $$1, int $$2, iv $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(ej $$0, bwt $$1, int $$2, iv $$3, int $$4, jf<fbv> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static int a(ej $$0, bwt $$1, int $$2, Collection<? extends bwt> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(ej $$0, bwt $$1, int $$2, Collection<? extends bwt> $$3, int $$4, jf<fbv> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static czy a(ej $$0, jf<fbv> $$1, czy $$2) {
      ars $$3 = $$0.e();
      fak $$4 = new fak.a($$3).a(fdb.f, $$0.d()).b(fdb.a, $$0.f()).a(fda.d);
      fah $$5 = new fah.a($$4).a(Optional.empty());
      $$5.b(fah.a($$1.a()));
      czy $$6 = $$1.a().apply($$2, $$5);
      $$6.f($$6.k());
      return $$6;
   }

   private static czy a(bwt $$0, int $$1) throws CommandSyntaxException {
      byl $$2 = $$0.a_($$1);
      if ($$2 == byl.a) {
         throw d.create($$1);
      } else {
         return $$2.a().v();
      }
   }

   private static czy a(ej $$0, iv $$1, int $$2) throws CommandSyntaxException {
      buk $$3 = a($$0, $$1, b);
      if ($$2 >= 0 && $$2 < $$3.b()) {
         return $$3.a($$2).v();
      } else {
         throw d.create($$2);
      }
   }
}
