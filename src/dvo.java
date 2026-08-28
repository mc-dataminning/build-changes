import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dvo extends dqn implements dtx {
   public static final MapCodec<dvo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebd.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.h), t()).apply($$0, dvo::new)
   );
   public static final ebf b = ebe.y;
   public static final ebm<ebn> c = ebe.ai;
   public static final ebf d = ebe.A;
   public static final ebf f = ebe.I;
   private static final Map<jb, ffr> g = ffo.d(dmm.c(16.0, 13.0, 16.0));
   private final ebd h;

   @Override
   public MapCodec<? extends dvo> a() {
      return a;
   }

   protected dvo(ebd $$0, ean.d $$1) {
      super($$1.a($$0.g()));
      this.h = $$0;
      this.l(this.C.b().b(e, jb.c).b(b, Boolean.valueOf(false)).b(c, ebn.b).b(d, Boolean.valueOf(false)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return g.get($$0.c(b) ? $$0.c(e) : ($$0.c(c) == ebn.a ? jb.a : jb.b));
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
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
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      if (!this.h.c()) {
         return bug.e;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bug.a;
      }
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, dja $$3, BiConsumer<czk, iv> $$4) {
      if ($$3.g() && this.h.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(eao $$0, djh $$1, iv $$2, @Nullable crj $$3) {
      eao $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(f)) {
         $$1.a($$2, eww.c, eww.c.a($$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable crj $$0, djh $$1, iv $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.h.k() : this.h.j(), awo.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? efo.h : efo.d, $$2);
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, dmm $$3, @Nullable eyd $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.D($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.b(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(f)) {
               $$1.a($$2, eww.c, eww.c.a($$1));
            }
         }
      }
   }

   @Override
   public eao a(ddd $$0) {
      eao $$1 = this.m();
      ewv $$2 = $$0.q().b_($$0.a());
      jb $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.b(e, $$3).b(c, $$0.l().e - (double)$$0.a().v() > 0.5 ? ebn.a : ebn.b);
      } else {
         $$1 = $$1.b(e, $$0.g().g()).b(c, $$3 == jb.b ? ebn.b : ebn.a);
      }

      if ($$0.q().D($$0.a())) {
         $$1 = $$1.b(b, Boolean.valueOf(true)).b(d, Boolean.valueOf(true));
      }

      return $$1.b(f, Boolean.valueOf($$2.a() == eww.c));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(e, b, c, d, f);
   }

   @Override
   protected ewv b_(eao $$0) {
      return $$0.c(f) ? eww.c.a(false) : super.b_($$0);
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$0.c(f)) {
         $$2.a($$3, eww.c, eww.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected ebd q() {
      return this.h;
   }
}
