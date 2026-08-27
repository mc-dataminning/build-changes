import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public class aoq {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wx.c("commands.teleport.invalidPosition"));

   public static void a(CommandDispatcher<ee> $$0) {
      LiteralCommandNode<ee> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("teleport").requires($$0x -> $$0x.c(2)))
                  .then(
                     ef.a("location", gh.a())
                        .executes(
                           $$0x -> a(
                                 (ee)$$0x.getSource(),
                                 Collections.singleton(((ee)$$0x.getSource()).g()),
                                 ((ee)$$0x.getSource()).e(),
                                 gh.b($$0x, "location"),
                                 gj.d(),
                                 null
                              )
                        )
                  ))
               .then(
                  ef.a("destination", er.a())
                     .executes($$0x -> a((ee)$$0x.getSource(), Collections.singleton(((ee)$$0x.getSource()).g()), er.a($$0x, "destination")))
               ))
            .then(
               ((RequiredArgumentBuilder)ef.a("targets", er.b())
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ef.a("location", gh.a())
                                 .executes(
                                    $$0x -> a((ee)$$0x.getSource(), er.b($$0x, "targets"), ((ee)$$0x.getSource()).e(), gh.b($$0x, "location"), null, null)
                                 ))
                              .then(
                                 ef.a("rotation", ge.a())
                                    .executes(
                                       $$0x -> a(
                                             (ee)$$0x.getSource(),
                                             er.b($$0x, "targets"),
                                             ((ee)$$0x.getSource()).e(),
                                             gh.b($$0x, "location"),
                                             ge.a($$0x, "rotation"),
                                             null
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)ef.a("facing")
                                    .then(
                                       ef.a("entity")
                                          .then(
                                             ((RequiredArgumentBuilder)ef.a("facingEntity", er.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (ee)$$0x.getSource(),
                                                            er.b($$0x, "targets"),
                                                            ((ee)$$0x.getSource()).e(),
                                                            gh.b($$0x, "location"),
                                                            null,
                                                            new aoq.b(er.a($$0x, "facingEntity"), eq.a.a)
                                                         )
                                                   ))
                                                .then(
                                                   ef.a("facingAnchor", eq.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ee)$$0x.getSource(),
                                                               er.b($$0x, "targets"),
                                                               ((ee)$$0x.getSource()).e(),
                                                               gh.b($$0x, "location"),
                                                               null,
                                                               new aoq.b(er.a($$0x, "facingEntity"), eq.a($$0x, "facingAnchor"))
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ef.a("facingLocation", gh.a())
                                       .executes(
                                          $$0x -> a(
                                                (ee)$$0x.getSource(),
                                                er.b($$0x, "targets"),
                                                ((ee)$$0x.getSource()).e(),
                                                gh.b($$0x, "location"),
                                                null,
                                                new aoq.c(gh.a($$0x, "facingLocation"))
                                             )
                                       )
                                 )
                           )
                     ))
                  .then(ef.a("destination", er.a()).executes($$0x -> a((ee)$$0x.getSource(), er.b($$0x, "targets"), er.a($$0x, "destination"))))
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("tp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(ee $$0, Collection<? extends brw> $$1, brw $$2) throws CommandSyntaxException {
      for (brw $$3 : $$1) {
         a($$0, $$3, (aqn)$$2.dP(), $$2.du(), $$2.dw(), $$2.dA(), EnumSet.noneOf(bte.class), $$2.dF(), $$2.dH(), null);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wx.a("commands.teleport.success.entity.single", $$1.iterator().next().O_(), $$2.O_()), true);
      } else {
         $$0.a(() -> wx.a("commands.teleport.success.entity.multiple", $$1.size(), $$2.O_()), true);
      }

      return $$1.size();
   }

   private static int a(ee $$0, Collection<? extends brw> $$1, aqn $$2, gc $$3, @Nullable gc $$4, @Nullable aoq.a $$5) throws CommandSyntaxException {
      eum $$6 = $$3.a($$0);
      eul $$7 = $$4 == null ? null : $$4.b($$0);
      Set<bte> $$8 = EnumSet.noneOf(bte.class);
      if ($$3.a()) {
         $$8.add(bte.a);
      }

      if ($$3.b()) {
         $$8.add(bte.b);
      }

      if ($$3.c()) {
         $$8.add(bte.c);
      }

      if ($$4 == null) {
         $$8.add(bte.e);
         $$8.add(bte.d);
      } else {
         if ($$4.a()) {
            $$8.add(bte.e);
         }

         if ($$4.b()) {
            $$8.add(bte.d);
         }
      }

      for (brw $$9 : $$1) {
         if ($$4 == null) {
            a($$0, $$9, $$2, $$6.c, $$6.d, $$6.e, $$8, $$9.dF(), $$9.dH(), $$5);
         } else {
            a($$0, $$9, $$2, $$6.c, $$6.d, $$6.e, $$8, $$7.j, $$7.i, $$5);
         }
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wx.a("commands.teleport.success.location.single", $$1.iterator().next().O_(), a($$6.c), a($$6.d), a($$6.e)), true);
      } else {
         $$0.a(() -> wx.a("commands.teleport.success.location.multiple", $$1.size(), a($$6.c), a($$6.d), a($$6.e)), true);
      }

      return $$1.size();
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%f", $$0);
   }

   private static void a(ee $$0, brw $$1, aqn $$2, double $$3, double $$4, double $$5, Set<bte> $$6, float $$7, float $$8, @Nullable aoq.a $$9) throws CommandSyntaxException {
      io $$10 = io.a($$3, $$4, $$5);
      if (!daz.l($$10)) {
         throw a.create();
      } else {
         float $$11 = ayf.g($$7);
         float $$12 = ayf.g($$8);
         if ($$1.a($$2, $$3, $$4, $$5, $$6, $$11, $$12)) {
            if ($$9 != null) {
               $$9.perform($$0, $$1);
            }

            if (!($$1 instanceof bsq $$13) || !$$13.fE()) {
               $$1.g($$1.ds().d(1.0, 0.0, 1.0));
               $$1.d(true);
            }

            if ($$1 instanceof bsz $$14) {
               $$14.K().n();
            }
         }
      }
   }

   @FunctionalInterface
   interface a {
      void perform(ee var1, brw var2);
   }

   static record b(brw a, eq.a b) implements aoq.a {
      @Override
      public void perform(ee $$0, brw $$1) {
         if ($$1 instanceof aqo $$2) {
            $$2.a($$0.m(), this.a, this.b);
         } else {
            $$1.a($$0.m(), this.b.a(this.a));
         }
      }
   }

   static record c(eum a) implements aoq.a {
      @Override
      public void perform(ee $$0, brw $$1) {
         $$1.a($$0.m(), this.a);
      }
   }
}
