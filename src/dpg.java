import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dpg extends dma {
   public static final MapCodec<dpg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mf.e.q().fieldOf("potted").forGetter($$0x -> $$0x.d), t()).apply($$0, dpg::new)
   );
   private static final Map<dma, dma> b = Maps.newHashMap();
   private static final ffc c = dma.b(6.0, 0.0, 6.0);
   private final dma d;

   @Override
   public MapCodec<dpg> a() {
      return a;
   }

   public dpg(dma $$0, dzy.d $$1) {
      super($$1);
      this.d = $$0;
      b.put($$0, this);
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return c;
   }

   @Override
   protected bub a(cyy $$0, dzz $$1, div $$2, iu $$3, cqy $$4, bua $$5, fee $$6) {
      dzz $$8 = ($$0.h() instanceof cxg $$7 ? b.getOrDefault($$7.c(), dmc.a) : dmc.a).m();
      if ($$8.l()) {
         return bub.f;
      } else if (!this.q()) {
         return bub.c;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, eez.c, $$3);
         $$4.a(awx.ah);
         $$0.a(1, $$4);
         return bub.a;
      }
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      if (this.q()) {
         return bub.c;
      } else {
         cyy $$5 = new cyy(this.d);
         if (!$$3.i($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dmc.gn.m(), 3);
         $$1.a($$3, eez.c, $$2);
         return bub.a;
      }
   }

   @Override
   protected cyy a(diy $$0, iu $$1, dzz $$2, boolean $$3) {
      return this.q() ? super.a($$0, $$1, $$2, $$3) : new cyy(this.d);
   }

   private boolean q() {
      return this.d == dmc.a;
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      return $$4 == ja.a && !$$0.a($$1, $$3) ? dmc.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public dma b() {
      return this.d;
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }

   @Override
   protected boolean f(dzz $$0) {
      return $$0.a(dmc.ug) || $$0.a(dmc.uh);
   }

   @Override
   protected void b(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if (this.f($$0) && $$1.B_().j()) {
         boolean $$4 = this.d == dmc.ue;
         boolean $$5 = dnv.a($$1);
         if ($$4 != $$5) {
            $$1.a($$2, this.o($$0), 3);
            dou.a $$6 = dou.a.a($$4).c();
            $$6.a($$1, $$2, $$3);
            $$1.a(null, $$2, $$6.e(), awo.e, 1.0F, 1.0F);
         }
      }

      super.b($$0, $$1, $$2, $$3);
   }

   public dzz o(dzz $$0) {
      if ($$0.a(dmc.ug)) {
         return dmc.uh.m();
      } else {
         return $$0.a(dmc.uh) ? dmc.ug.m() : $$0;
      }
   }
}
