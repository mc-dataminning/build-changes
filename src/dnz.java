import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dnz extends dku {
   public static final MapCodec<dnz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(md.e.q().fieldOf("potted").forGetter($$0x -> $$0x.d), t()).apply($$0, dnz::new)
   );
   private static final Map<dku, dku> b = Maps.newHashMap();
   private static final fdo c = dku.b(6.0, 0.0, 6.0);
   private final dku d;

   @Override
   public MapCodec<dnz> a() {
      return a;
   }

   public dnz(dku $$0, dyl.d $$1) {
      super($$1);
      this.d = $$0;
      b.put($$0, this);
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return c;
   }

   @Override
   protected btq a(cxy $$0, dym $$1, dhp $$2, jj $$3, cqi $$4, btp $$5, fcq $$6) {
      dym $$8 = ($$0.h() instanceof cwf $$7 ? b.getOrDefault($$7.d(), dkw.a) : dkw.a).m();
      if ($$8.l()) {
         return btq.f;
      } else if (!this.q()) {
         return btq.c;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, edm.c, $$3);
         $$4.a(awu.ah);
         $$0.a(1, $$4);
         return btq.a;
      }
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      if (this.q()) {
         return btq.c;
      } else {
         cxy $$5 = new cxy(this.d);
         if (!$$3.j($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dkw.gm.m(), 3);
         $$1.a($$3, edm.c, $$2);
         return btq.a;
      }
   }

   @Override
   protected cxy a(dhs $$0, jj $$1, dym $$2, boolean $$3) {
      return this.q() ? super.a($$0, $$1, $$2, $$3) : new cxy(this.d);
   }

   private boolean q() {
      return this.d == dkw.a;
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      return $$4 == jo.a && !$$0.a($$1, $$3) ? dkw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public dku b() {
      return this.d;
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }

   @Override
   protected boolean f(dym $$0) {
      return $$0.a(dkw.uf) || $$0.a(dkw.ug);
   }

   @Override
   protected void b(dym $$0, arn $$1, jj $$2, azs $$3) {
      if (this.f($$0) && $$1.B_().j()) {
         boolean $$4 = this.d == dkw.ud;
         boolean $$5 = dmp.a($$1);
         if ($$4 != $$5) {
            $$1.a($$2, this.o($$0), 3);
            dno.a $$6 = dno.a.a($$4).c();
            $$6.a($$1, $$2, $$3);
            $$1.a(null, $$2, $$6.e(), awl.e, 1.0F, 1.0F);
         }
      }

      super.b($$0, $$1, $$2, $$3);
   }

   public dym o(dym $$0) {
      if ($$0.a(dkw.uf)) {
         return dkw.ug.m();
      } else {
         return $$0.a(dkw.ug) ? dkw.uf.m() : $$0;
      }
   }
}
