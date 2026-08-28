import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class drd extends dml implements dpr {
   public static final MapCodec<drd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwk.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), t()).apply($$0, drd::new)
   );
   public static final dwm b = dwl.u;
   public static final dws<dwt> c = dwl.af;
   public static final dwm d = dwl.w;
   public static final dwm e = dwl.C;
   protected static final int f = 3;
   protected static final fas g = diq.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final fas h = diq.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fas i = diq.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final fas j = diq.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final fas k = diq.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final fas l = diq.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dwk m;

   @Override
   public MapCodec<? extends drd> a() {
      return a;
   }

   protected drd(dwk $$0, dvu.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.l(this.F.b().b(aF, jm.c).b(b, Boolean.valueOf(false)).b(c, dwt.b).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dwt.a ? l : k;
      } else {
         switch ((jm)$$0.c(aF)) {
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
   protected boolean a(dvv $$0, esk $$1) {
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
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      if (!this.m.c()) {
         return bsk.e;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bsk.a;
      }
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, dfe $$3, BiConsumer<cwm, jh> $$4) {
      if ($$3.g() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(dvv $$0, dfm $$1, jh $$2, @Nullable cou $$3) {
      dvv $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, erw.c, erw.c.a($$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable cou $$0, dfm $$1, jh $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), awo.e, 1.0F, $$1.G_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? ear.h : ear.d, $$2);
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, diq $$3, @Nullable etd $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.b(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, erw.c, erw.c.a($$1));
            }
         }
      }
   }

   @Override
   public dvv a(dad $$0) {
      dvv $$1 = this.m();
      erv $$2 = $$0.q().b_($$0.a());
      jm $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.b(aF, $$3).b(c, $$0.l().e - (double)$$0.a().v() > 0.5 ? dwt.a : dwt.b);
      } else {
         $$1 = $$1.b(aF, $$0.g().g()).b(c, $$3 == jm.b ? dwt.b : dwt.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.b(b, Boolean.valueOf(true)).b(d, Boolean.valueOf(true));
      }

      return $$1.b(e, Boolean.valueOf($$2.a() == erw.c));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(aF, b, c, d, e);
   }

   @Override
   protected erv b_(dvv $$0) {
      return $$0.c(e) ? erw.c.a(false) : super.b_($$0);
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, erw.c, erw.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected dwk q() {
      return this.m;
   }
}
