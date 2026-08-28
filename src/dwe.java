import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dwe extends drd implements dun {
   public static final MapCodec<dwe> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebt.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.h), t()).apply($$0, dwe::new)
   );
   public static final ebv b = ebu.y;
   public static final ecc<ecd> c = ebu.ai;
   public static final ebv d = ebu.A;
   public static final ebv f = ebu.I;
   private static final Map<jb, fgk> g = fgh.d(dnc.c(16.0, 13.0, 16.0));
   private final ebt h;

   @Override
   public MapCodec<? extends dwe> a() {
      return a;
   }

   protected dwe(ebt $$0, ebd.d $$1) {
      super($$1.a($$0.g()));
      this.h = $$0;
      this.l(this.C.b().b(e, jb.c).b(b, Boolean.valueOf(false)).b(c, ecd.b).b(d, Boolean.valueOf(false)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return g.get($$0.c(b) ? $$0.c(e) : ($$0.c(c) == ecd.a ? jb.a : jb.b));
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
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
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      if (!this.h.c()) {
         return bur.e;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bur.a;
      }
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, djq $$3, BiConsumer<czy, iv> $$4) {
      if ($$3.g() && this.h.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(ebe $$0, djx $$1, iv $$2, @Nullable crx $$3) {
      ebe $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(f)) {
         $$1.a($$2, exp.c, exp.c.a($$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable crx $$0, djx $$1, iv $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.h.k() : this.h.j(), awq.e, 1.0F, $$1.G_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? ege.h : ege.d, $$2);
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, dnc $$3, @Nullable eyw $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.D($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.b(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(f)) {
               $$1.a($$2, exp.c, exp.c.a($$1));
            }
         }
      }
   }

   @Override
   public ebe a(ddr $$0) {
      ebe $$1 = this.m();
      exo $$2 = $$0.q().b_($$0.a());
      jb $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.b(e, $$3).b(c, $$0.l().e - (double)$$0.a().v() > 0.5 ? ecd.a : ecd.b);
      } else {
         $$1 = $$1.b(e, $$0.g().g()).b(c, $$3 == jb.b ? ecd.b : ecd.a);
      }

      if ($$0.q().D($$0.a())) {
         $$1 = $$1.b(b, Boolean.valueOf(true)).b(d, Boolean.valueOf(true));
      }

      return $$1.b(f, Boolean.valueOf($$2.a() == exp.c));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(e, b, c, d, f);
   }

   @Override
   protected exo b_(ebe $$0) {
      return $$0.c(f) ? exp.c.a(false) : super.b_($$0);
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$0.c(f)) {
         $$2.a($$3, exp.c, exp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected ebt q() {
      return this.h;
   }
}
