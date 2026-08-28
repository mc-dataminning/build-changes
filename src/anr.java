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

public class anr {
   static final Dynamic3CommandExceptionType a = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wv.b("commands.item.target.not_a_container", $$0, $$1, $$2)
   );
   static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wv.b("commands.item.source.not_a_container", $$0, $$1, $$2)
   );
   static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wv.b("commands.item.target.no_such_slot", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wv.b("commands.item.source.no_such_slot", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> wv.b("commands.item.target.no_changes", $$0));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> wv.b("commands.item.target.no_changed.known_item", $$0, $$1)
   );
   private static final SuggestionProvider<ex> g = ($$0, $$1) -> {
      aln.a $$2 = ((ex)$$0.getSource()).l().bc();
      return fc.a($$2.a(me.bo), $$1);
   };

   public static void a(CommandDispatcher<ex> $$0, et $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("item").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)ey.a("replace")
                        .then(
                           ey.a("block")
                              .then(
                                 ey.a("pos", gu.a())
                                    .then(
                                       ((RequiredArgumentBuilder)ey.a("slot", gg.a())
                                             .then(
                                                ey.a("with")
                                                   .then(
                                                      ((RequiredArgumentBuilder)ey.a("item", hh.a($$1))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ex)$$0x.getSource(),
                                                                     gu.a($$0x, "pos"),
                                                                     gg.a($$0x, "slot"),
                                                                     hh.a($$0x, "item").a(1, false)
                                                                  )
                                                            ))
                                                         .then(
                                                            ey.a("count", IntegerArgumentType.integer(1, 99))
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (ex)$$0x.getSource(),
                                                                        gu.a($$0x, "pos"),
                                                                        gg.a($$0x, "slot"),
                                                                        hh.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                     )
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)ey.a("from")
                                                   .then(
                                                      ey.a("block")
                                                         .then(
                                                            ey.a("source", gu.a())
                                                               .then(
                                                                  ((RequiredArgumentBuilder)ey.a("sourceSlot", gg.a())
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ex)$$0x.getSource(),
                                                                                 gu.a($$0x, "source"),
                                                                                 gg.a($$0x, "sourceSlot"),
                                                                                 gu.a($$0x, "pos"),
                                                                                 gg.a($$0x, "slot")
                                                                              )
                                                                        ))
                                                                     .then(
                                                                        ey.a("modifier", fz.b($$1))
                                                                           .suggests(g)
                                                                           .executes(
                                                                              $$0x -> a(
                                                                                    (ex)$$0x.getSource(),
                                                                                    gu.a($$0x, "source"),
                                                                                    gg.a($$0x, "sourceSlot"),
                                                                                    gu.a($$0x, "pos"),
                                                                                    gg.a($$0x, "slot"),
                                                                                    fz.b($$0x, "modifier")
                                                                                 )
                                                                           )
                                                                     )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   ey.a("entity")
                                                      .then(
                                                         ey.a("source", fk.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)ey.a("sourceSlot", gg.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ex)$$0x.getSource(),
                                                                              fk.a($$0x, "source"),
                                                                              gg.a($$0x, "sourceSlot"),
                                                                              gu.a($$0x, "pos"),
                                                                              gg.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     ey.a("modifier", fz.b($$1))
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ex)$$0x.getSource(),
                                                                                 fk.a($$0x, "source"),
                                                                                 gg.a($$0x, "sourceSlot"),
                                                                                 gu.a($$0x, "pos"),
                                                                                 gg.a($$0x, "slot"),
                                                                                 fz.b($$0x, "modifier")
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
                        ey.a("entity")
                           .then(
                              ey.a("targets", fk.b())
                                 .then(
                                    ((RequiredArgumentBuilder)ey.a("slot", gg.a())
                                          .then(
                                             ey.a("with")
                                                .then(
                                                   ((RequiredArgumentBuilder)ey.a("item", hh.a($$1))
                                                         .executes(
                                                            $$0x -> a(
                                                                  (ex)$$0x.getSource(),
                                                                  fk.b($$0x, "targets"),
                                                                  gg.a($$0x, "slot"),
                                                                  hh.a($$0x, "item").a(1, false)
                                                               )
                                                         ))
                                                      .then(
                                                         ey.a("count", IntegerArgumentType.integer(1, 99))
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ex)$$0x.getSource(),
                                                                     fk.b($$0x, "targets"),
                                                                     gg.a($$0x, "slot"),
                                                                     hh.a($$0x, "item").a(IntegerArgumentType.getInteger($$0x, "count"), true)
                                                                  )
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)ey.a("from")
                                                .then(
                                                   ey.a("block")
                                                      .then(
                                                         ey.a("source", gu.a())
                                                            .then(
                                                               ((RequiredArgumentBuilder)ey.a("sourceSlot", gg.a())
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ex)$$0x.getSource(),
                                                                              gu.a($$0x, "source"),
                                                                              gg.a($$0x, "sourceSlot"),
                                                                              fk.b($$0x, "targets"),
                                                                              gg.a($$0x, "slot")
                                                                           )
                                                                     ))
                                                                  .then(
                                                                     ey.a("modifier", fz.b($$1))
                                                                        .suggests(g)
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ex)$$0x.getSource(),
                                                                                 gu.a($$0x, "source"),
                                                                                 gg.a($$0x, "sourceSlot"),
                                                                                 fk.b($$0x, "targets"),
                                                                                 gg.a($$0x, "slot"),
                                                                                 fz.b($$0x, "modifier")
                                                                              )
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                ey.a("entity")
                                                   .then(
                                                      ey.a("source", fk.a())
                                                         .then(
                                                            ((RequiredArgumentBuilder)ey.a("sourceSlot", gg.a())
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (ex)$$0x.getSource(),
                                                                           fk.a($$0x, "source"),
                                                                           gg.a($$0x, "sourceSlot"),
                                                                           fk.b($$0x, "targets"),
                                                                           gg.a($$0x, "slot")
                                                                        )
                                                                  ))
                                                               .then(
                                                                  ey.a("modifier", fz.b($$1))
                                                                     .suggests(g)
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ex)$$0x.getSource(),
                                                                              fk.a($$0x, "source"),
                                                                              gg.a($$0x, "sourceSlot"),
                                                                              fk.b($$0x, "targets"),
                                                                              gg.a($$0x, "slot"),
                                                                              fz.b($$0x, "modifier")
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
               ((LiteralArgumentBuilder)ey.a("modify")
                     .then(
                        ey.a("block")
                           .then(
                              ey.a("pos", gu.a())
                                 .then(
                                    ey.a("slot", gg.a())
                                       .then(
                                          ey.a("modifier", fz.b($$1))
                                             .suggests(g)
                                             .executes($$0x -> a((ex)$$0x.getSource(), gu.a($$0x, "pos"), gg.a($$0x, "slot"), fz.b($$0x, "modifier")))
                                       )
                                 )
                           )
                     ))
                  .then(
                     ey.a("entity")
                        .then(
                           ey.a("targets", fk.b())
                              .then(
                                 ey.a("slot", gg.a())
                                    .then(
                                       ey.a("modifier", fz.b($$1))
                                          .suggests(g)
                                          .executes($$0x -> a((ex)$$0x.getSource(), fk.b($$0x, "targets"), gg.a($$0x, "slot"), fz.b($$0x, "modifier")))
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ex $$0, jj $$1, int $$2, js<eyz> $$3) throws CommandSyntaxException {
      btj $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         cxy $$5 = a($$0, $$3, $$4.a($$2));
         $$4.a($$2, $$5);
         $$0.a(() -> wv.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$5.K()), true);
         return 1;
      } else {
         throw c.create($$2);
      }
   }

   private static int a(ex $$0, Collection<? extends bvs> $$1, int $$2, js<eyz> $$3) throws CommandSyntaxException {
      Map<bvs, cxy> $$4 = Maps.newHashMapWithExpectedSize($$1.size());

      for (bvs $$5 : $$1) {
         bxi $$6 = $$5.a_($$2);
         if ($$6 != bxi.a) {
            cxy $$7 = a($$0, $$3, $$6.a().v());
            if ($$6.a($$7)) {
               $$4.put($$5, $$7);
               if ($$5 instanceof aro) {
                  ((aro)$$5).bP.d();
               }
            }
         }
      }

      if ($$4.isEmpty()) {
         throw e.create($$2);
      } else {
         if ($$4.size() == 1) {
            Entry<bvs, cxy> $$8 = $$4.entrySet().iterator().next();
            $$0.a(() -> wv.a("commands.item.entity.set.success.single", $$8.getKey().m_(), $$8.getValue().K()), true);
         } else {
            $$0.a(() -> wv.a("commands.item.entity.set.success.multiple", $$4.size()), true);
         }

         return $$4.size();
      }
   }

   private static int a(ex $$0, jj $$1, int $$2, cxy $$3) throws CommandSyntaxException {
      btj $$4 = a($$0, $$1, a);
      if ($$2 >= 0 && $$2 < $$4.b()) {
         $$4.a($$2, $$3);
         $$0.a(() -> wv.a("commands.item.block.set.success", $$1.u(), $$1.v(), $$1.w(), $$3.K()), true);
         return 1;
      } else {
         throw c.create($$2);
      }
   }

   static btj a(ex $$0, jj $$1, Dynamic3CommandExceptionType $$2) throws CommandSyntaxException {
      dvl $$3 = $$0.e().c_($$1);
      if (!($$3 instanceof btj)) {
         throw $$2.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (btj)$$3;
      }
   }

   private static int a(ex $$0, Collection<? extends bvs> $$1, int $$2, cxy $$3) throws CommandSyntaxException {
      List<bvs> $$4 = Lists.newArrayListWithCapacity($$1.size());

      for (bvs $$5 : $$1) {
         bxi $$6 = $$5.a_($$2);
         if ($$6 != bxi.a && $$6.a($$3.v())) {
            $$4.add($$5);
            if ($$5 instanceof aro) {
               ((aro)$$5).bP.d();
            }
         }
      }

      if ($$4.isEmpty()) {
         throw f.create($$3.K(), $$2);
      } else {
         if ($$4.size() == 1) {
            $$0.a(() -> wv.a("commands.item.entity.set.success.single", $$4.iterator().next().m_(), $$3.K()), true);
         } else {
            $$0.a(() -> wv.a("commands.item.entity.set.success.multiple", $$4.size(), $$3.K()), true);
         }

         return $$4.size();
      }
   }

   private static int a(ex $$0, jj $$1, int $$2, Collection<? extends bvs> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(ex $$0, jj $$1, int $$2, Collection<? extends bvs> $$3, int $$4, js<eyz> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(ex $$0, jj $$1, int $$2, jj $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$1, $$2));
   }

   private static int a(ex $$0, jj $$1, int $$2, jj $$3, int $$4, js<eyz> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$0, $$1, $$2)));
   }

   private static int a(ex $$0, bvs $$1, int $$2, jj $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(ex $$0, bvs $$1, int $$2, jj $$3, int $$4, js<eyz> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static int a(ex $$0, bvs $$1, int $$2, Collection<? extends bvs> $$3, int $$4) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$1, $$2));
   }

   private static int a(ex $$0, bvs $$1, int $$2, Collection<? extends bvs> $$3, int $$4, js<eyz> $$5) throws CommandSyntaxException {
      return a($$0, $$3, $$4, a($$0, $$5, a($$1, $$2)));
   }

   private static cxy a(ex $$0, js<eyz> $$1, cxy $$2) {
      arn $$3 = $$0.e();
      exo $$4 = new exo.a($$3).a(faf.f, $$0.d()).b(faf.a, $$0.f()).a(fae.d);
      exl $$5 = new exl.a($$4).a(Optional.empty());
      $$5.b(exl.a($$1.a()));
      cxy $$6 = $$1.a().apply($$2, $$5);
      $$6.f($$6.k());
      return $$6;
   }

   private static cxy a(bvs $$0, int $$1) throws CommandSyntaxException {
      bxi $$2 = $$0.a_($$1);
      if ($$2 == bxi.a) {
         throw d.create($$1);
      } else {
         return $$2.a().v();
      }
   }

   private static cxy a(ex $$0, jj $$1, int $$2) throws CommandSyntaxException {
      btj $$3 = a($$0, $$1, b);
      if ($$2 >= 0 && $$2 < $$3.b()) {
         return $$3.a($$2).v();
      } else {
         throw d.create($$2);
      }
   }
}
