import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Suppliers;
import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.util.List;
import java.util.OptionalInt;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;

public final class dww extends dsy {
   public static final MapCodec<dww> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dca.a.fieldOf("biome_source").forGetter($$0x -> $$0x.b), dwy.b.fieldOf("settings").forGetter($$0x -> $$0x.e))
            .apply($$0, $$0.stable(dww::new))
   );
   private static final drb d = dea.a.n();
   private final ix<dwy> e;
   private final Supplier<dwf.a> f;

   public dww(dca $$0, ix<dwy> $$1) {
      super($$0);
      this.e = $$1;
      this.f = Suppliers.memoize(() -> a($$1.a()));
   }

   private static dwf.a a(dwy $$0) {
      dwf.b $$1 = new dwf.b(-54, dea.H.n());
      int $$2 = $$0.l();
      dwf.b $$3 = new dwf.b($$2, $$0.h());
      dwf.b $$4 = new dwf.b(dut.e * 2, dea.a.n());
      return ($$4x, $$5, $$6) -> $$5 < Math.min(-54, $$2) ? $$1 : $$3;
   }

   @Override
   public CompletableFuture<dsx> a(Executor $$0, dxh $$1, dxv $$2, dbq $$3, dsx $$4) {
      return CompletableFuture.supplyAsync(ac.a("init_biomes", () -> {
         this.a($$2, $$1, $$3, $$4);
         return $$4;
      }), ac.g());
   }

   private void a(dxv $$0, dxh $$1, dbq $$2, dsx $$3) {
      dwx $$4 = $$3.a($$3x -> this.a($$3x, $$2, $$0, $$1));
      dbz $$5 = dwh.a($$0.a(this.b), $$3);
      $$3.a($$5, $$4.a($$1.a(), this.e.a().k()));
   }

   private dwx a(dsx $$0, dbq $$1, dxv $$2, dxh $$3) {
      return dwx.a($$0, $$3, dwg.a($$1, $$0.f()), this.e.a(), this.f.get(), $$2);
   }

   @Override
   protected MapCodec<? extends dsy> a() {
      return c;
   }

   public ix<dwy> g() {
      return this.e;
   }

   public boolean a(akl<dwy> $$0) {
      return this.e.a($$0);
   }

   @Override
   public int a(int $$0, int $$1, dwt.a $$2, daz $$3, dxh $$4) {
      return this.a($$3, $$4, $$0, $$1, null, $$2.e()).orElse($$3.I_());
   }

   @Override
   public dbj a(int $$0, int $$1, daz $$2, dxh $$3) {
      MutableObject<dbj> $$4 = new MutableObject();
      this.a($$2, $$3, $$0, $$1, $$4, null);
      return (dbj)$$4.getValue();
   }

   @Override
   public void a(List<String> $$0, dxh $$1, io $$2) {
      DecimalFormat $$3 = new DecimalFormat("0.000");
      dwz $$4 = $$1.a();
      dwm.e $$5 = new dwm.e($$2.u(), $$2.v(), $$2.w());
      double $$6 = $$4.j().a($$5);
      $$0.add(
         "NoiseRouter T: "
            + $$3.format($$4.e().a($$5))
            + " V: "
            + $$3.format($$4.f().a($$5))
            + " C: "
            + $$3.format($$4.g().a($$5))
            + " E: "
            + $$3.format($$4.h().a($$5))
            + " D: "
            + $$3.format($$4.i().a($$5))
            + " W: "
            + $$3.format($$6)
            + " PV: "
            + $$3.format((double)dxa.a((float)$$6))
            + " AS: "
            + $$3.format($$4.k().a($$5))
            + " N: "
            + $$3.format($$4.l().a($$5))
      );
   }

   private OptionalInt a(daz $$0, dxh $$1, int $$2, int $$3, @Nullable MutableObject<dbj> $$4, @Nullable Predicate<drb> $$5) {
      dxb $$6 = this.e.a().f().a($$0);
      int $$7 = $$6.a();
      int $$8 = $$6.c();
      int $$9 = ayd.a($$8, $$7);
      int $$10 = ayd.a($$6.d(), $$7);
      if ($$10 <= 0) {
         return OptionalInt.empty();
      } else {
         drb[] $$11;
         if ($$4 == null) {
            $$11 = null;
         } else {
            $$11 = new drb[$$6.d()];
            $$4.setValue(new dbj($$8, $$11));
         }

         int $$13 = $$6.b();
         int $$14 = Math.floorDiv($$2, $$13);
         int $$15 = Math.floorDiv($$3, $$13);
         int $$16 = Math.floorMod($$2, $$13);
         int $$17 = Math.floorMod($$3, $$13);
         int $$18 = $$14 * $$13;
         int $$19 = $$15 * $$13;
         double $$20 = (double)$$16 / (double)$$13;
         double $$21 = (double)$$17 / (double)$$13;
         dwx $$22 = new dwx(1, $$1, $$18, $$19, $$6, dwn.b.a, this.e.a(), this.f.get(), dxv.a());
         $$22.f();
         $$22.b(0);

         for (int $$23 = $$10 - 1; $$23 >= 0; $$23--) {
            $$22.b($$23, 0);

            for (int $$24 = $$7 - 1; $$24 >= 0; $$24--) {
               int $$25 = ($$9 + $$23) * $$7 + $$24;
               double $$26 = (double)$$24 / (double)$$7;
               $$22.a($$25, $$26);
               $$22.b($$2, $$20);
               $$22.c($$3, $$21);
               drb $$27 = $$22.e();
               drb $$28 = $$27 == null ? this.e.a().g() : $$27;
               if ($$11 != null) {
                  int $$29 = $$23 * $$7 + $$24;
                  $$11[$$29] = $$28;
               }

               if ($$5 != null && $$5.test($$28)) {
                  $$22.g();
                  return OptionalInt.of($$25 + 1);
               }
            }
         }

         $$22.g();
         return OptionalInt.empty();
      }
   }

   @Override
   public void a(aqt $$0, dbq $$1, dxh $$2, dsx $$3) {
      if (!aa.a($$3.f())) {
         dxq $$4 = new dxq(this, $$0);
         this.a($$3, $$4, $$2, $$1, $$0.F_(), $$0.H_().d(lf.az), dxv.a($$0));
      }
   }

   @VisibleForTesting
   public void a(dsx $$0, dxq $$1, dxh $$2, dbq $$3, dby $$4, jk<dbw> $$5, dxv $$6) {
      dwx $$7 = $$0.a($$3x -> this.a($$3x, $$3, $$6, $$2));
      dwy $$8 = this.e.a();
      $$2.c().a($$2, $$4, $$5, $$8.n(), $$1, $$0, $$7, $$8.j());
   }

   @Override
   public void a(aqt $$0, long $$1, dxh $$2, dby $$3, dbq $$4, dsx $$5, dwp.a $$6) {
      dby $$7 = $$3.a(($$1x, $$2x, $$3x) -> this.b.getNoiseBiome($$1x, $$2x, $$3x, $$2.b()));
      dxs $$8 = new dxs(new dwu(dxi.a()));
      int $$9 = 8;
      dae $$10 = $$5.f();
      dwx $$11 = $$5.a($$3x -> this.a($$3x, $$4, dxv.a($$0), $$2));
      dwf $$12 = $$11.i();
      dyt $$13 = new dyt(this, $$0.H_(), $$5.z(), $$11, $$2, this.e.a().j());
      dsw $$14 = ((dtr)$$5).b($$6);

      for (int $$15 = -8; $$15 <= 8; $$15++) {
         for (int $$16 = -8; $$16 <= 8; $$16++) {
            dae $$17 = new dae($$10.e + $$15, $$10.f + $$16);
            dsx $$18 = $$0.a($$17.e, $$17.f);
            dbx $$19 = $$18.a(() -> this.a(this.b.getNoiseBiome(ji.a($$17.d()), 0, ji.a($$17.e()), $$2.b())));
            Iterable<ix<dyw<?>>> $$20 = $$19.a($$6);
            int $$21 = 0;

            for (ix<dyw<?>> $$22 : $$20) {
               dyw<?> $$23 = $$22.a();
               $$8.c($$1 + (long)$$21, $$17.e, $$17.f);
               if ($$23.a($$8)) {
                  $$23.a($$13, $$5, $$7::a, $$8, $$12, $$17, $$14);
               }

               $$21++;
            }
         }
      }
   }

   @Override
   public CompletableFuture<dsx> a(Executor $$0, dxv $$1, dxh $$2, dbq $$3, dsx $$4) {
      dxb $$5 = this.e.a().f().a($$4.z());
      int $$6 = $$5.c();
      int $$7 = ayd.a($$6, $$5.a());
      int $$8 = ayd.a($$5.d(), $$5.a());
      if ($$8 <= 0) {
         return CompletableFuture.completedFuture($$4);
      } else {
         int $$9 = $$4.e($$8 * $$5.a() - 1 + $$6);
         int $$10 = $$4.e($$6);
         Set<dti> $$11 = Sets.newHashSet();

         for (int $$12 = $$9; $$12 >= $$10; $$12--) {
            dti $$13 = $$4.b($$12);
            $$13.a();
            $$11.add($$13);
         }

         return CompletableFuture.supplyAsync(ac.a("wgen_fill_noise", () -> this.a($$1, $$3, $$2, $$4, $$7, $$8)), ac.g()).whenCompleteAsync(($$1x, $$2x) -> {
            for (dti $$3x : $$11) {
               $$3x.b();
            }
         }, $$0);
      }
   }

   private dsx a(dxv $$0, dbq $$1, dxh $$2, dsx $$3, int $$4, int $$5) {
      dwx $$6 = $$3.a($$3x -> this.a($$3x, $$1, $$0, $$2));
      dwt $$7 = $$3.a(dwt.a.c);
      dwt $$8 = $$3.a(dwt.a.a);
      dae $$9 = $$3.f();
      int $$10 = $$9.d();
      int $$11 = $$9.e();
      dwf $$12 = $$6.i();
      $$6.f();
      io.a $$13 = new io.a();
      int $$14 = $$6.j();
      int $$15 = $$6.k();
      int $$16 = 16 / $$14;
      int $$17 = 16 / $$14;

      for (int $$18 = 0; $$18 < $$16; $$18++) {
         $$6.b($$18);

         for (int $$19 = 0; $$19 < $$17; $$19++) {
            int $$20 = $$3.am() - 1;
            dti $$21 = $$3.b($$20);

            for (int $$22 = $$5 - 1; $$22 >= 0; $$22--) {
               $$6.b($$22, $$19);

               for (int $$23 = $$15 - 1; $$23 >= 0; $$23--) {
                  int $$24 = ($$4 + $$22) * $$15 + $$23;
                  int $$25 = $$24 & 15;
                  int $$26 = $$3.e($$24);
                  if ($$20 != $$26) {
                     $$20 = $$26;
                     $$21 = $$3.b($$26);
                  }

                  double $$27 = (double)$$23 / (double)$$15;
                  $$6.a($$24, $$27);

                  for (int $$28 = 0; $$28 < $$14; $$28++) {
                     int $$29 = $$10 + $$18 * $$14 + $$28;
                     int $$30 = $$29 & 15;
                     double $$31 = (double)$$28 / (double)$$14;
                     $$6.b($$29, $$31);

                     for (int $$32 = 0; $$32 < $$14; $$32++) {
                        int $$33 = $$11 + $$19 * $$14 + $$32;
                        int $$34 = $$33 & 15;
                        double $$35 = (double)$$32 / (double)$$14;
                        $$6.c($$33, $$35);
                        drb $$36 = $$6.e();
                        if ($$36 == null) {
                           $$36 = this.e.a().g();
                        }

                        $$36 = this.a($$6, $$29, $$24, $$33, $$36);
                        if ($$36 != d && !aa.a($$3.f())) {
                           $$21.a($$30, $$25, $$34, $$36, false);
                           $$7.a($$30, $$24, $$34, $$36);
                           $$8.a($$30, $$24, $$34, $$36);
                           if ($$12.a() && !$$36.u().c()) {
                              $$13.d($$29, $$24, $$33);
                              $$3.e($$13);
                           }
                        }
                     }
                  }
               }
            }
         }

         $$6.h();
      }

      $$6.g();
      return $$3;
   }

   private drb a(dwx $$0, int $$1, int $$2, int $$3, drb $$4) {
      return $$4;
   }

   @Override
   public int d() {
      return this.e.a().f().d();
   }

   @Override
   public int e() {
      return this.e.a().l();
   }

   @Override
   public int f() {
      return this.e.a().f().c();
   }

   @Override
   public void a(aqt $$0) {
      if (!this.e.a().a()) {
         dae $$1 = $$0.a();
         ix<dbw> $$2 = $$0.t($$1.l().h($$0.al() - 1));
         dxs $$3 = new dxs(new dwu(dxi.a()));
         $$3.a($$0.C(), $$1.d(), $$1.e());
         dbi.a($$0, $$2, $$1, $$3);
      }
   }
}
