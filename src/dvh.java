import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dvh extends dqg implements dtq {
   public static final MapCodec<dvh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eaw.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.h), t()).apply($$0, dvh::new)
   );
   public static final eay b = eax.y;
   public static final ebf<ebg> c = eax.ai;
   public static final eay d = eax.A;
   public static final eay f = eax.I;
   private static final Map<ja, ffk> g = ffh.d(dmf.c(16.0, 13.0, 16.0));
   private final eaw h;

   @Override
   public MapCodec<? extends dvh> a() {
      return a;
   }

   protected dvh(eaw $$0, eag.d $$1) {
      super($$1.a($$0.g()));
      this.h = $$0;
      this.l(this.C.b().b(e, ja.c).b(b, Boolean.valueOf(false)).b(c, ebg.b).b(d, Boolean.valueOf(false)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return g.get($$0.c(b) ? $$0.c(e) : ($$0.c(c) == ebg.a ? ja.a : ja.b));
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      switch ($$1) {
         case a:
            return $$0.c(b);
         case b:
            return $$0.c(f);
         case c:
            return $$0.c(b);
         default:
            return false;
      }
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      if (!this.h.c()) {
         return bud.e;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bud.a;
      }
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, dit $$3, BiConsumer<czd, iu> $$4) {
      if ($$3.g() && this.h.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(eah $$0, dja $$1, iu $$2, @Nullable crc $$3) {
      eah $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(f)) {
         $$1.a($$2, ewp.c, ewp.c.a($$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable crc $$0, dja $$1, iu $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.h.k() : this.h.j(), awo.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? efh.h : efh.d, $$2);
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, dmf $$3, @Nullable exw $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.D($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.b(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(f)) {
               $$1.a($$2, ewp.c, ewp.c.a($$1));
            }
         }
      }
   }

   @Override
   public eah a(dcw $$0) {
      eah $$1 = this.m();
      ewo $$2 = $$0.q().b_($$0.a());
      ja $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.b(e, $$3).b(c, $$0.l().e - (double)$$0.a().v() > 0.5 ? ebg.a : ebg.b);
      } else {
         $$1 = $$1.b(e, $$0.g().g()).b(c, $$3 == ja.b ? ebg.b : ebg.a);
      }

      if ($$0.q().D($$0.a())) {
         $$1 = $$1.b(b, Boolean.valueOf(true)).b(d, Boolean.valueOf(true));
      }

      return $$1.b(f, Boolean.valueOf($$2.a() == ewp.c));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(e, b, c, d, f);
   }

   @Override
   protected ewo b_(eah $$0) {
      return $$0.c(f) ? ewp.c.a(false) : super.b_($$0);
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$0.c(f)) {
         $$2.a($$3, ewp.c, ewp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected eaw q() {
      return this.h;
   }
}
