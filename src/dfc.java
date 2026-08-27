import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dfc extends dal implements ddq {
   public static final MapCodec<dfc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(djw.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), u()).apply($$0, dfc::new)
   );
   public static final djy b = djx.u;
   public static final dkf<dkg> c = djx.af;
   public static final djy d = djx.w;
   public static final djy e = djx.C;
   protected static final int f = 3;
   protected static final emm g = cwq.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final emm h = cwq.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final emm i = cwq.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final emm j = cwq.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final emm k = cwq.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final emm l = cwq.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final djw m;

   @Override
   public MapCodec<? extends dfc> a() {
      return a;
   }

   protected dfc(djw $$0, djg.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.k(this.E.b().a(aE, ic.c).a(b, Boolean.valueOf(false)).a(c, dkg.b).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dkg.a ? l : k;
      } else {
         switch ((ic)$$0.c(aE)) {
            case c:
            default:
               return j;
            case d:
               return i;
            case e:
               return h;
            case f:
               return g;
         }
      }
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      switch ($$3) {
         case a:
            return $$0.c(b);
         case b:
            return $$0.c(e);
         case c:
            return $$0.c(b);
         default:
            return false;
      }
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      if (!this.m.c()) {
         return bkb.d;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bkb.a($$1.B);
      }
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, cth $$3, BiConsumer<cmy, hx> $$4) {
      if ($$3.j() == cth.a.d && !$$1.y_() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(djh $$0, ctp $$1, hx $$2, @Nullable cfi $$3) {
      djh $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, ees.c, ees.c.a((cts)$$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable cfi $$0, ctp $$1, hx $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), art.e, 1.0F, $$1.F_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? dnr.h : dnr.d, $$2);
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, cwq $$3, hx $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.a(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, ees.c, ees.c.a((cts)$$1));
            }
         }
      }
   }

   @Override
   public djh a(cph $$0) {
      djh $$1 = this.o();
      eer $$2 = $$0.q().b_($$0.a());
      ic $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.a(aE, $$3).a(c, $$0.l().d - (double)$$0.a().v() > 0.5 ? dkg.a : dkg.b);
      } else {
         $$1 = $$1.a(aE, $$0.g().g()).a(c, $$3 == ic.b ? dkg.b : dkg.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.a(b, Boolean.valueOf(true)).a(d, Boolean.valueOf(true));
      }

      return $$1.a(e, Boolean.valueOf($$2.a() == ees.c));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(aE, b, c, d, e);
   }

   @Override
   public eer c_(djh $$0) {
      return $$0.c(e) ? ees.c.a(false) : super.c_($$0);
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ees.c, ees.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected djw g() {
      return this.m;
   }
}
