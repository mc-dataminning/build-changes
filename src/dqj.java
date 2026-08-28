import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dqj extends dnc {
   public static final MapCodec<dqj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mg.e.q().fieldOf("potted").forGetter($$0x -> $$0x.d), t()).apply($$0, dqj::new)
   );
   private static final Map<dnc, dnc> b = Maps.newHashMap();
   private static final fgk c = dnc.b(6.0, 0.0, 6.0);
   private final dnc d;

   @Override
   public MapCodec<dqj> a() {
      return a;
   }

   public dqj(dnc $$0, ebd.d $$1) {
      super($$1);
      this.d = $$0;
      b.put($$0, this);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return c;
   }

   @Override
   protected bur a(czy $$0, ebe $$1, djx $$2, iv $$3, crx $$4, buq $$5, ffm $$6) {
      ebe $$8 = ($$0.h() instanceof cyg $$7 ? b.getOrDefault($$7.c(), dne.a) : dne.a).m();
      if ($$8.l()) {
         return bur.f;
      } else if (!this.q()) {
         return bur.c;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, ege.c, $$3);
         $$4.a(awz.ah);
         $$0.a(1, $$4);
         return bur.a;
      }
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      if (this.q()) {
         return bur.c;
      } else {
         czy $$5 = new czy(this.d);
         if (!$$3.h($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dne.gq.m(), 3);
         $$1.a($$3, ege.c, $$2);
         return bur.a;
      }
   }

   @Override
   protected czy a(dka $$0, iv $$1, ebe $$2, boolean $$3) {
      return this.q() ? super.a($$0, $$1, $$2, $$3) : new czy(this.d);
   }

   private boolean q() {
      return this.d == dne.a;
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      return $$4 == jb.a && !$$0.a($$1, $$3) ? dne.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public dnc b() {
      return this.d;
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }

   @Override
   protected boolean f(ebe $$0) {
      return $$0.a(dne.uj) || $$0.a(dne.uk);
   }

   @Override
   protected void b(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if (this.f($$0) && $$1.F_().j()) {
         boolean $$4 = this.d == dne.uh;
         boolean $$5 = doy.a($$1);
         if ($$4 != $$5) {
            $$1.a($$2, this.o($$0), 3);
            dpx.a $$6 = dpx.a.a($$4).c();
            $$6.a($$1, $$2, $$3);
            $$1.a(null, $$2, $$6.e(), awq.e, 1.0F, 1.0F);
         }
      }

      super.b($$0, $$1, $$2, $$3);
   }

   public ebe o(ebe $$0) {
      if ($$0.a(dne.uj)) {
         return dne.uk.m();
      } else {
         return $$0.a(dne.uk) ? dne.uj.m() : $$0;
      }
   }
}
