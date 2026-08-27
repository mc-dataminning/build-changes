import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dha extends dcj implements dfo {
   public static final MapCodec<dha> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dlu.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), u()).apply($$0, dha::new)
   );
   public static final dlw b = dlv.u;
   public static final dmd<dme> c = dlv.af;
   public static final dlw d = dlv.w;
   public static final dlw e = dlv.C;
   protected static final int f = 3;
   protected static final eol g = cyo.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final eol h = cyo.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eol i = cyo.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final eol j = cyo.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final eol k = cyo.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final eol l = cyo.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dlu m;

   @Override
   public MapCodec<? extends dha> a() {
      return a;
   }

   protected dha(dlu $$0, dle.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.k(this.E.b().a(aE, ie.c).a(b, Boolean.valueOf(false)).a(c, dme.b).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dme.a ? l : k;
      } else {
         switch ((ie)$$0.c(aE)) {
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
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
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
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      if (!this.m.c()) {
         return blu.d;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return blu.a($$1.B);
      }
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, cvf $$3, BiConsumer<coz, hz> $$4) {
      if ($$3.j() == cvf.a.d && !$$1.y_() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(dlf $$0, cvn $$1, hz $$2, @Nullable chh $$3) {
      dlf $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, egq.c, egq.c.a((cvq)$$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable chh $$0, cvn $$1, hz $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), atl.e, 1.0F, $$1.F_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? dpp.h : dpp.d, $$2);
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, cyo $$3, hz $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.a(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, egq.c, egq.c.a((cvq)$$1));
            }
         }
      }
   }

   @Override
   public dlf a(crg $$0) {
      dlf $$1 = this.o();
      egp $$2 = $$0.q().b_($$0.a());
      ie $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.a(aE, $$3).a(c, $$0.l().d - (double)$$0.a().v() > 0.5 ? dme.a : dme.b);
      } else {
         $$1 = $$1.a(aE, $$0.g().g()).a(c, $$3 == ie.b ? dme.b : dme.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.a(b, Boolean.valueOf(true)).a(d, Boolean.valueOf(true));
      }

      return $$1.a(e, Boolean.valueOf($$2.a() == egq.c));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(aE, b, c, d, e);
   }

   @Override
   protected egp c_(dlf $$0) {
      return $$0.c(e) ? egq.c.a(false) : super.c_($$0);
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, egq.c, egq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected dlu g() {
      return this.m;
   }
}
