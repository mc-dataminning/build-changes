import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class day extends ctm implements daz {
   public static final dgs f = dgr.C;
   protected static final float g = 4.0F;
   protected static final eiy h = cua.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dho a;

   protected day(dho $$0, dga.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends day> a();

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, ebf.c, ebf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return h;
   }

   @Override
   public boolean a(dgb $$0) {
      return true;
   }

   @Override
   public ddx a(ht $$0, dgb $$1) {
      return new dff($$0, $$1);
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      ckj $$6 = $$3.b($$4);
      cke $$7 = $$6.d();
      cli $$9 = $$6.d() instanceof cli $$8 ? $$8 : null;
      boolean $$10 = $$9 != null && $$3.ge();
      if ($$1.c_($$2) instanceof dff $$11) {
         if (!$$1.B) {
            boolean $$12 = $$11.a($$3);
            dfg $$13 = $$11.a($$12);
            boolean $$14 = $$11.a($$3, $$1, $$2, $$12);
            if ($$11.x()) {
               $$1.a(null, $$11.p(), $$11.f(), aqe.e);
               return this.a($$10);
            } else if ($$10 && !this.a($$3, $$11) && $$9.a($$13, $$3) && $$9.a($$1, $$11, $$12, $$3)) {
               if (!$$3.f()) {
                  $$6.h(1);
               }

               $$1.a(dkl.c, $$11.p(), dkl.a.a($$3, $$11.q()));
               $$3.b(aqn.c.b($$7));
               return bib.a;
            } else if ($$14) {
               return bib.a;
            } else if (!this.a($$3, $$11) && $$3.ge() && this.b($$3, $$11, $$12)) {
               this.a($$3, $$11, $$12);
               return this.a($$10);
            } else {
               return bib.d;
            }
         } else {
            return !$$10 && !$$11.x() ? bib.b : bib.a;
         }
      } else {
         return bib.d;
      }
   }

   private bib a(boolean $$0) {
      return $$0 ? bib.d : bib.a;
   }

   private boolean b(ccx $$0, dff $$1, boolean $$2) {
      dfg $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.W())).allMatch($$0x -> $$0x.equals(uh.a) || $$0x.b() instanceof vp);
   }

   public abstract float g(dgb var1);

   public eif h(dgb $$0) {
      return new eif(0.5, 0.5, 0.5);
   }

   @Override
   public ebe c_(dgb $$0) {
      return $$0.c(f) ? ebf.c.a(false) : super.c_($$0);
   }

   public dho d() {
      return this.a;
   }

   public static dho a(cua $$0) {
      dho $$1;
      if ($$0 instanceof day) {
         $$1 = ((day)$$0).d();
      } else {
         $$1 = dho.b;
      }

      return $$1;
   }

   public void a(ccx $$0, dff $$1, boolean $$2) {
      $$1.a($$0.cv());
      $$0.a($$1, $$2);
   }

   private boolean a(ccx $$0, dff $$1) {
      UUID $$2 = $$1.w();
      return $$2 != null && !$$2.equals($$0.cv());
   }

   @Nullable
   @Override
   public <T extends ddx> ddy<T> a(cqz $$0, dgb $$1, ddz<T> $$2) {
      return a($$2, ddz.h, dff::a);
   }
}
