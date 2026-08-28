import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dnd extends dlg implements dpe {
   public static final MapCodec<dnd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), t()).apply($$0, dnd::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final eam<ja> b = dny.a;
   public static final eaf c = eae.f;
   private final boolean e;

   @Override
   public MapCodec<dnd> a() {
      return a;
   }

   public dnd(boolean $$0, dzn.d $$1) {
      super($$1);
      this.l(this.B.b().b(b, ja.c).b(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dwn a(iu $$0, dzo $$1) {
      dwy $$2 = new dwy($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dlu $$3, @Nullable exd $$4, boolean $$5) {
      if (!$$1.C) {
         if ($$1.c_($$2) instanceof dwy $$7) {
            this.a($$1, $$2, $$7, $$1.D($$2));
         }
      }
   }

   private void a(dip $$0, iu $$1, dwy $$2, boolean $$3) {
      boolean $$4 = $$2.c();
      if ($$3 != $$4) {
         $$2.a($$3);
         if ($$3) {
            if ($$2.d() || $$2.s() == dwy.a.a) {
               return;
            }

            $$2.k();
            $$0.a($$1, this, 1);
         }
      }
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if ($$1.c_($$2) instanceof dwy $$5) {
         dhq $$6 = $$5.a();
         boolean $$7 = !baj.b($$6.m());
         dwy.a $$8 = $$5.s();
         boolean $$9 = $$5.j();
         if ($$8 == dwy.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.t()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dwy.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.t()) {
               $$6.a(0);
            }
         }

         $$1.b($$2, this);
      }
   }

   private void a(dzo $$0, aro $$1, iu $$2, dhq $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      dwn $$5 = $$1.c_($$2);
      if ($$5 instanceof dwy && $$3.gF()) {
         $$3.a((dwy)$$5);
         return bty.a;
      } else {
         return bty.e;
      }
   }

   @Override
   protected boolean c_(dzo $$0) {
      return true;
   }

   @Override
   protected int a(dzo $$0, dip $$1, iu $$2) {
      dwn $$3 = $$1.c_($$2);
      return $$3 instanceof dwy ? ((dwy)$$3).a().k() : 0;
   }

   @Override
   public void a(dip $$0, iu $$1, dzo $$2, bwz $$3, cys $$4) {
      if ($$0.c_($$1) instanceof dwy $$6) {
         dhq $$8 = $$6.a();
         if ($$0 instanceof aro $$9) {
            if (!$$4.c(kj.aa)) {
               $$8.a($$9.O().c(dil.p));
               $$6.b(this.e);
            }

            boolean $$10 = $$0.D($$1);
            this.a($$0, $$1, $$6, $$10);
         }
      }
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dzo a(dcl $$0) {
      return this.m().b(b, $$0.d().g());
   }

   private static void a(aro $$0, iu $$1, ja $$2) {
      iu.a $$3 = $$1.k();
      dil $$4 = $$0.O();
      int $$5 = $$4.d(dil.y);

      while ($$5-- > 0) {
         $$3.c($$2);
         dzo $$6 = $$0.a_($$3);
         dlu $$7 = $$6.b();
         if (!$$6.a(dlw.lj) || !($$0.c_($$3) instanceof dwy $$9) || $$9.s() != dwy.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            dhq $$10 = $$9.a();
            if ($$9.k()) {
               if (!$$10.a($$0)) {
                  break;
               }

               $$0.b($$3, $$7);
            } else if ($$9.t()) {
               $$10.a(0);
            }
         }

         $$2 = $$6.c(b);
      }

      if ($$5 <= 0) {
         int $$11 = Math.max($$4.d(dil.y), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
