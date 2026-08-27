import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dhr extends dda implements dgf {
   public static final MapCodec<dhr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dmt.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), u()).apply($$0, dhr::new)
   );
   public static final dmv b = dmu.u;
   public static final dnc<dnd> c = dmu.af;
   public static final dmv d = dmu.w;
   public static final dmv e = dmu.C;
   protected static final int f = 3;
   protected static final epo g = czf.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final epo h = czf.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final epo i = czf.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final epo j = czf.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final epo k = czf.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final epo l = czf.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dmt m;

   @Override
   public MapCodec<? extends dhr> a() {
      return a;
   }

   protected dhr(dmt $$0, dmd.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.k(this.E.b().a(aE, ih.c).a(b, Boolean.valueOf(false)).a(c, dnd.b).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dnd.a ? l : k;
      } else {
         switch ((ih)$$0.c(aE)) {
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
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
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
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      if (!this.m.c()) {
         return bml.d;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bml.a($$1.B);
      }
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, cvw $$3, BiConsumer<cpq, ib> $$4) {
      if ($$3.j() == cvw.a.d && !$$1.y_() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(dme $$0, cwe $$1, ib $$2, @Nullable cia $$3) {
      dme $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, ehs.c, ehs.c.a((cwh)$$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable cia $$0, cwe $$1, ib $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), atq.e, 1.0F, $$1.F_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? dqr.h : dqr.d, $$2);
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, czf $$3, ib $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.a(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, ehs.c, ehs.c.a((cwh)$$1));
            }
         }
      }
   }

   @Override
   public dme a(crx $$0) {
      dme $$1 = this.o();
      ehr $$2 = $$0.q().b_($$0.a());
      ih $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.a(aE, $$3).a(c, $$0.l().d - (double)$$0.a().v() > 0.5 ? dnd.a : dnd.b);
      } else {
         $$1 = $$1.a(aE, $$0.g().g()).a(c, $$3 == ih.b ? dnd.b : dnd.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.a(b, Boolean.valueOf(true)).a(d, Boolean.valueOf(true));
      }

      return $$1.a(e, Boolean.valueOf($$2.a() == ehs.c));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(aE, b, c, d, e);
   }

   @Override
   protected ehr c_(dme $$0) {
      return $$0.c(e) ? ehs.c.a(false) : super.c_($$0);
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ehs.c, ehs.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected dmt i() {
      return this.m;
   }
}
