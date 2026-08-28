import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dqv extends dno {
   public static final MapCodec<dqv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mh.e.q().fieldOf("potted").forGetter($$0x -> $$0x.d), t()).apply($$0, dqv::new)
   );
   private static final Map<dno, dno> b = Maps.newHashMap();
   private static final fgw c = dno.b(6.0, 0.0, 6.0);
   private final dno d;

   @Override
   public MapCodec<dqv> a() {
      return a;
   }

   public dqv(dno $$0, ebp.d $$1) {
      super($$1);
      this.d = $$0;
      b.put($$0, this);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return c;
   }

   @Override
   protected bvc a(dak $$0, ebq $$1, dkj $$2, iw $$3, csi $$4, bvb $$5, ffy $$6) {
      ebq $$8 = ($$0.h() instanceof cys $$7 ? b.getOrDefault($$7.c(), dnq.a) : dnq.a).m();
      if ($$8.l()) {
         return bvc.f;
      } else if (!this.q()) {
         return bvc.c;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, egq.c, $$3);
         $$4.a(axi.ah);
         $$0.a(1, $$4);
         return bvc.a;
      }
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      if (this.q()) {
         return bvc.c;
      } else {
         dak $$5 = new dak(this.d);
         if (!$$3.h($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dnq.gq.m(), 3);
         $$1.a($$3, egq.c, $$2);
         return bvc.a;
      }
   }

   @Override
   protected dak a(dkm $$0, iw $$1, ebq $$2, boolean $$3) {
      return this.q() ? super.a($$0, $$1, $$2, $$3) : new dak(this.d);
   }

   private boolean q() {
      return this.d == dnq.a;
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      return $$4 == jc.a && !$$0.a($$1, $$3) ? dnq.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public dno b() {
      return this.d;
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }

   @Override
   protected boolean f(ebq $$0) {
      return $$0.a(dnq.uj) || $$0.a(dnq.uk);
   }

   @Override
   protected void b(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if (this.f($$0) && $$1.F_().j()) {
         boolean $$4 = this.d == dnq.uh;
         boolean $$5 = dpk.a($$1);
         if ($$4 != $$5) {
            $$1.a($$2, this.o($$0), 3);
            dqj.a $$6 = dqj.a.a($$4).c();
            $$6.a($$1, $$2, $$3);
            $$1.a(null, $$2, $$6.e(), awz.e, 1.0F, 1.0F);
         }
      }

      super.b($$0, $$1, $$2, $$3);
   }

   public ebq o(ebq $$0) {
      if ($$0.a(dnq.uj)) {
         return dnq.uk.m();
      } else {
         return $$0.a(dnq.uk) ? dnq.uj.m() : $$0;
      }
   }
}
