import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dns extends djb implements dmg {
   public static final MapCodec<dns> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsw.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), u()).apply($$0, dns::new)
   );
   public static final dsy b = dsx.u;
   public static final dtf<dtg> c = dsx.af;
   public static final dsy d = dsx.w;
   public static final dsy e = dsx.C;
   protected static final int f = 3;
   protected static final ews g = dff.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final ews h = dff.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ews i = dff.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ews j = dff.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final ews k = dff.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final ews l = dff.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dsw m;

   @Override
   public MapCodec<? extends dns> a() {
      return a;
   }

   protected dns(dsw $$0, dsg.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.k(this.E.b().a(aE, jf.c).a(b, Boolean.valueOf(false)).a(c, dtg.b).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dtg.a ? l : k;
      } else {
         switch ((jf)$$0.c(aE)) {
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
   protected boolean a(dsh $$0, eoq $$1) {
      switch ($$1) {
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
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      if (!this.m.c()) {
         return bqd.e;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bqd.a($$1.B);
      }
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dbv $$3, BiConsumer<cua, ja> $$4) {
      if ($$3.n() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(dsh $$0, dcd $$1, ja $$2, @Nullable cmh $$3) {
      dsh $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, eoc.c, eoc.c.a((dcg)$$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable cmh $$0, dcd $$1, ja $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), avg.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? dxa.h : dxa.d, $$2);
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dff $$3, ja $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.a(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, eoc.c, eoc.c.a((dcg)$$1));
            }
         }
      }
   }

   @Override
   public dsh a(cxk $$0) {
      dsh $$1 = this.o();
      eob $$2 = $$0.q().b_($$0.a());
      jf $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.a(aE, $$3).a(c, $$0.l().d - (double)$$0.a().v() > 0.5 ? dtg.a : dtg.b);
      } else {
         $$1 = $$1.a(aE, $$0.g().g()).a(c, $$3 == jf.b ? dtg.b : dtg.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.a(b, Boolean.valueOf(true)).a(d, Boolean.valueOf(true));
      }

      return $$1.a(e, Boolean.valueOf($$2.a() == eoc.c));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(aE, b, c, d, e);
   }

   @Override
   protected eob b_(dsh $$0) {
      return $$0.c(e) ? eoc.c.a(false) : super.b_($$0);
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eoc.c, eoc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected dsw m() {
      return this.m;
   }
}
