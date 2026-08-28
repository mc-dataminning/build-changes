import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dom extends dju implements dna {
   public static final MapCodec<dom> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dtr.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), u()).apply($$0, dom::new)
   );
   public static final dtt b = dts.u;
   public static final dua<dub> c = dts.af;
   public static final dtt d = dts.w;
   public static final dtt e = dts.C;
   protected static final int f = 3;
   protected static final ext g = dfy.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final ext h = dfy.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ext i = dfy.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ext j = dfy.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final ext k = dfy.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final ext l = dfy.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dtr m;

   @Override
   public MapCodec<? extends dom> a() {
      return a;
   }

   protected dom(dtr $$0, dtb.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.k(this.E.b().a(aE, ji.c).a(b, Boolean.valueOf(false)).a(c, dub.b).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dub.a ? l : k;
      } else {
         switch ((ji)$$0.c(aE)) {
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
   protected boolean a(dtc $$0, epr $$1) {
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
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, eww $$4) {
      if (!this.m.c()) {
         return bqr.e;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bqr.a($$1.B);
      }
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dco $$3, BiConsumer<cuq, jd> $$4) {
      if ($$3.n() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(dtc $$0, dcw $$1, jd $$2, @Nullable cmx $$3) {
      dtc $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, epd.c, epd.c.a((dcz)$$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable cmx $$0, dcw $$1, jd $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), avq.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? dxz.h : dxz.d, $$2);
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dfy $$3, jd $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.a(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, epd.c, epd.c.a((dcz)$$1));
            }
         }
      }
   }

   @Override
   public dtc a(cyd $$0) {
      dtc $$1 = this.o();
      epc $$2 = $$0.q().b_($$0.a());
      ji $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.a(aE, $$3).a(c, $$0.l().d - (double)$$0.a().v() > 0.5 ? dub.a : dub.b);
      } else {
         $$1 = $$1.a(aE, $$0.g().g()).a(c, $$3 == ji.b ? dub.b : dub.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.a(b, Boolean.valueOf(true)).a(d, Boolean.valueOf(true));
      }

      return $$1.a(e, Boolean.valueOf($$2.a() == epd.c));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(aE, b, c, d, e);
   }

   @Override
   protected epc b_(dtc $$0) {
      return $$0.c(e) ? epd.c.a(false) : super.b_($$0);
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, epd.c, epd.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected dtr m() {
      return this.m;
   }
}
