import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class cwo extends cur implements cyn {
   public static final MapCodec<cwo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), u()).apply($$0, cwo::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dih b = cxi.a;
   public static final die c = did.c;
   private final boolean e;

   @Override
   public MapCodec<cwo> a() {
      return a;
   }

   public cwo(boolean $$0, dhm.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, ib.c).a(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dfi a(hx $$0, dhn $$1) {
      dfs $$2 = new dfs($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, cvf $$3, hx $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof dfs $$7) {
            boolean $$8 = $$1.B($$2);
            boolean $$9 = $$7.d();
            $$7.a($$8);
            if (!$$9 && !$$7.f() && $$7.m() != dfs.a.a) {
               if ($$8) {
                  $$7.l();
                  $$1.a($$2, this, 1);
               }
            }
         }
      }
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if ($$1.c_($$2) instanceof dfs $$5) {
         crg $$6 = $$5.c();
         boolean $$7 = !aul.b($$6.m());
         dfs.a $$8 = $$5.m();
         boolean $$9 = $$5.k();
         if ($$8 == dfs.a.b) {
            $$5.l();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.w()) {
               $$6.a(0);
            }

            if ($$5.d() || $$5.f()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dfs.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.w()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dhn $$0, csf $$1, hx $$2, crg $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      dfi $$6 = $$1.c_($$2);
      if ($$6 instanceof dfs && $$3.gq()) {
         $$3.a((dfs)$$6);
         return bjb.a($$1.B);
      } else {
         return bjb.d;
      }
   }

   @Override
   public boolean d_(dhn $$0) {
      return true;
   }

   @Override
   public int a(dhn $$0, csf $$1, hx $$2) {
      dfi $$3 = $$1.c_($$2);
      return $$3 instanceof dfs ? ((dfs)$$3).c().k() : 0;
   }

   @Override
   public void a(csf $$0, hx $$1, dhn $$2, bll $$3, clo $$4) {
      if ($$0.c_($$1) instanceof dfs $$6) {
         crg $$7 = $$6.c();
         if ($$4.A()) {
            $$7.b($$4.y());
         }

         if (!$$0.B) {
            if (cjh.a($$4) == null) {
               $$7.a($$0.Y().b(csb.p));
               $$6.b(this.e);
            }

            if ($$6.m() == dfs.a.a) {
               boolean $$8 = $$0.B($$1);
               $$6.a($$8);
            }
         }
      }
   }

   @Override
   public dbk b_(dhn $$0) {
      return dbk.c;
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dhn a(cnw $$0) {
      return this.o().a(b, $$0.d().g());
   }

   private static void a(csf $$0, hx $$1, ib $$2) {
      hx.a $$3 = $$1.j();
      csb $$4 = $$0.Y();
      int $$5 = $$4.c(csb.x);

      while ($$5-- > 0) {
         $$3.c($$2);
         dhn $$6 = $$0.a_($$3);
         cvf $$7 = $$6.b();
         if (!$$6.a(cvh.kH) || !($$0.c_($$3) instanceof dfs $$9) || $$9.m() != dfs.a.a) {
            break;
         }

         if ($$9.d() || $$9.f()) {
            crg $$10 = $$9.c();
            if ($$9.l()) {
               if (!$$10.a($$0)) {
                  break;
               }

               $$0.c($$3, $$7);
            } else if ($$9.w()) {
               $$10.a(0);
            }
         }

         $$2 = $$6.c(b);
      }

      if ($$5 <= 0) {
         int $$11 = Math.max($$4.c(csb.x), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
