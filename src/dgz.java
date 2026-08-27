import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dgz extends czm implements dha {
   public static final dnq f = dnp.C;
   protected static final float g = 4.0F;
   protected static final eqk h = daa.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dom a;

   protected dgz(dom $$0, dmy.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dgz> a();

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eio.c, eio.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return h;
   }

   @Override
   public boolean a(dmz $$0) {
      return true;
   }

   @Override
   public dkg a(ib $$0, dmz $$1) {
      return new dlp($$0, $$1);
   }

   @Override
   protected bne a(cqk $$0, dmz $$1, cwz $$2, ib $$3, cis $$4, bnb $$5, epn $$6) {
      if ($$2.c_($$3) instanceof dlp $$7) {
         crj $$10 = $$0.d() instanceof crj $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.gl();
         if (!$$2.B) {
            if ($$11 && !$$7.t() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(aui.c.b($$0.d()));
                  $$2.a(drn.c, $$7.aC_(), drn.a.a($$4, $$7.n()));
                  if (!$$4.f()) {
                     $$0.h(1);
                  }

                  return bne.a;
               } else {
                  return bne.d;
               }
            } else {
               return bne.d;
            }
         } else {
            return !$$11 && !$$7.t() ? bne.b : bne.a;
         }
      } else {
         return bne.e;
      }
   }

   @Override
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      if ($$1.c_($$2) instanceof dlp $$5) {
         if ($$1.B) {
            ac.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.t()) {
            $$1.a(null, $$5.aC_(), $$5.d(), atz.e);
            return bnc.a;
         } else if ($$8) {
            return bnc.a;
         } else if (!this.a($$3, $$5) && $$3.gl() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return bnc.a;
         } else {
            return bnc.d;
         }
      } else {
         return bnc.d;
      }
   }

   private boolean b(cis $$0, dlp $$1, boolean $$2) {
      dlq $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.Y())).allMatch($$0x -> $$0x.equals(vt.a) || $$0x.b() instanceof xb);
   }

   public abstract float g(dmz var1);

   public epr m(dmz $$0) {
      return new epr(0.5, 0.5, 0.5);
   }

   @Override
   protected ein c_(dmz $$0) {
      return $$0.c(f) ? eio.c.a(false) : super.c_($$0);
   }

   public dom d() {
      return this.a;
   }

   public static dom a(daa $$0) {
      dom $$1;
      if ($$0 instanceof dgz) {
         $$1 = ((dgz)$$0).d();
      } else {
         $$1 = dom.b;
      }

      return $$1;
   }

   public void a(cis $$0, dlp $$1, boolean $$2) {
      $$1.a($$0.cw());
      $$0.a($$1, $$2);
   }

   private boolean a(cis $$0, dlp $$1) {
      UUID $$2 = $$1.s();
      return $$2 != null && !$$2.equals($$0.cw());
   }

   @Nullable
   @Override
   public <T extends dkg> dkh<T> a(cwz $$0, dmz $$1, dki<T> $$2) {
      return a($$2, dki.h, dlp::a);
   }
}
